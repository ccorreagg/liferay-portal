/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.apibuilder.rest.internal.provider;

import com.liferay.apibuilder.constants.APIBuilderConstants;
import com.liferay.apibuilder.handler.OperationHandler;
import com.liferay.apibuilder.operation.MediaType;
import com.liferay.apibuilder.operation.Operation;
import com.liferay.apibuilder.operation.PathConfiguration;
import com.liferay.apibuilder.operation.schema.AttributeSchema;
import com.liferay.apibuilder.operation.schema.AttributeType;
import com.liferay.apibuilder.operation.schema.ObjectSchema;
import com.liferay.apibuilder.rest.internal.util.SchemaUtil;
import com.liferay.apibuilder.rest.provider.OpenAPIYAMLOperationsProvider;
import com.liferay.apibuilder.util.AttributeTypeUtil;
import com.liferay.apibuilder.util.URLUtil;
import com.liferay.info.field.InfoField;
import com.liferay.info.form.InfoForm;
import com.liferay.info.item.InfoItemServiceRegistry;
import com.liferay.info.item.provider.InfoItemFormProvider;
import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMap;
import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMapFactory;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.yaml.openapi.Components;
import com.liferay.portal.vulcan.yaml.openapi.Content;
import com.liferay.portal.vulcan.yaml.openapi.FieldDefinition;
import com.liferay.portal.vulcan.yaml.openapi.Info;
import com.liferay.portal.vulcan.yaml.openapi.Method;
import com.liferay.portal.vulcan.yaml.openapi.OpenAPIYAML;
import com.liferay.portal.vulcan.yaml.openapi.OperationDefinition;
import com.liferay.portal.vulcan.yaml.openapi.Parameter;
import com.liferay.portal.vulcan.yaml.openapi.PathItem;
import com.liferay.portal.vulcan.yaml.openapi.ResponseCode;
import com.liferay.portal.vulcan.yaml.openapi.Schema;
import com.liferay.portal.vulcan.yaml.openapi.SchemaDefinition;

import java.io.InvalidObjectException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.ws.rs.core.Response;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(service = OpenAPIYAMLOperationsProvider.class)
public class OpenAPIYAMLOperationsProviderImpl
	implements OpenAPIYAMLOperationsProvider {

	@Override
	public List<Operation> getOperations(
			long companyId, OpenAPIYAML openAPIYAML)
		throws Exception {

		return _getOperations(companyId, true, openAPIYAML);
	}

	@Override
	public List<Operation> getOperations(OpenAPIYAML openAPIYAML)
		throws Exception {

		return _getOperations(0, false, openAPIYAML);
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_operationHandlerServiceTrackerMap =
			ServiceTrackerMapFactory.openSingleValueMap(
				bundleContext, OperationHandler.class,
				APIBuilderConstants.OPERATION_NAME);
	}

	@Deactivate
	protected void deactivate() {
		_operationHandlerServiceTrackerMap.close();
	}

	private AttributeType _getAttributeType(Schema schema) {
		String type = schema.getType();

		if (StringUtil.equals(type, "boolean")) {
			return AttributeType.BOOLEAN;
		}
		else if (StringUtil.equals(type, "integer")) {
			if (StringUtil.equals(schema.getFormat(), "int64")) {
				return AttributeType.LONG;
			}
			else if (StringUtil.equals(schema.getFormat(), "int32")) {
				return AttributeType.INTEGER;
			}
		}
		else if (StringUtil.equals(type, "string")) {
			if (StringUtil.equals(schema.getFormat(), "date-time")) {
				return AttributeType.DATETIME;
			}

			return AttributeType.STRING;
		}

		throw new UnsupportedOperationException(
			"Impossible to get the AttributeType of the type " + type);
	}

	private List<Operation> _getOperations(
			long companyId, boolean companyIdScoped, OpenAPIYAML openAPIYAML)
		throws Exception {

		List<Operation> operations = new ArrayList<>();

		Components components = openAPIYAML.getComponents();

		_validate(components.getSchemas());

		Map<String, PathItem> pathItems = openAPIYAML.getPathItems();

		Info info = openAPIYAML.getInfo();

		for (Map.Entry<String, PathItem> entry : pathItems.entrySet()) {
			PathItem pathItem = entry.getValue();

			_validate(pathItem);

			operations.addAll(
				_getOperations(
					companyId, companyIdScoped,
					URLUtil.getPathConfiguration(
						entry.getKey(), info.getVersion()),
					pathItem, components.getSchemas()));
		}

		return operations;
	}

	private List<Operation> _getOperations(
		long companyId, boolean companyIdScoped,
		PathConfiguration pathConfiguration, PathItem pathItem,
		Map<String, Schema> schemas) {

		List<Operation> operations = new ArrayList<>();

		for (Method method : Method.values()) {
			com.liferay.portal.vulcan.yaml.openapi.Operation operation =
				pathItem.get(method);

			if (operation == null) {
				continue;
			}

			OperationDefinition operationDefinition =
				operation.getOperationDefinition();

			Operation.Builder builder = new Operation.Builder(
			).withMethod(
				com.liferay.apibuilder.operation.Method.valueOf(method.name())
			).withOperationType(
				operationDefinition.getType()
			).withPathConfiguration(
				pathConfiguration
			);

			if (companyIdScoped) {
				builder.withCompanyId(companyId);
			}

			Map<ResponseCode, com.liferay.portal.vulcan.yaml.openapi.Response>
				responses = operation.getResponses();

			com.liferay.apibuilder.operation.schema.Schema successfulSchema =
				null;

			for (Map.Entry
					<ResponseCode,
					 com.liferay.portal.vulcan.yaml.openapi.Response> entry :
						responses.entrySet()) {

				com.liferay.portal.vulcan.yaml.openapi.Response response =
					entry.getValue();

				Map<String, Content> contentMap = response.getContent();

				for (Map.Entry<String, Content> entry2 :
						contentMap.entrySet()) {

					Content content = entry2.getValue();

					Schema schema = content.getSchema();

					String schemaName = StringUtil.removeFirst(
						schema.getReference(), "#/components/schemas/");

					schema = schemas.get(schemaName);

					SchemaDefinition schemaDefinition =
						schema.getSchemaDefinition();

					ObjectSchema objectSchema = new ObjectSchema(
						schemaDefinition.getEntityName(), schemaName,
						_toSchemaMap(schema.getPropertySchemas()), true);

					com.liferay.apibuilder.operation.response.ResponseCode
						responseCode = _toResponseCode(entry.getKey());

					if (Objects.equals(
							com.liferay.apibuilder.operation.response.
								ResponseCode.SUCCESSFUL,
							responseCode)) {

						successfulSchema = objectSchema;
					}

					builder.withResponseSchema(
						MediaType.parse(entry2.getKey()), responseCode,
						objectSchema);
				}
			}

			if (successfulSchema == null) {
				throw new IllegalStateException(
					"There is no schema defined for a successful code");
			}

			for (Parameter operationParameter : operation.getParameters()) {
				builder.withParameterSchema(
					SchemaUtil.getAttributeSchema(
						operationParameter.getName(), successfulSchema));
			}

			operations.add(builder.build());
		}

		return operations;
	}

	private com.liferay.apibuilder.operation.response.ResponseCode
		_toResponseCode(ResponseCode responseCode) {

		Response.Status.Family family = Response.Status.Family.familyOf(
			responseCode.getHttpCode());

		if (Objects.equals(family, Response.Status.Family.SUCCESSFUL)) {
			return com.liferay.apibuilder.operation.response.ResponseCode.
				SUCCESSFUL;
		}
		else if (Objects.equals(family, Response.Status.Family.CLIENT_ERROR)) {
			return com.liferay.apibuilder.operation.response.ResponseCode.
				NOT_FOUND;
		}
		else if (Objects.equals(family, Response.Status.Family.SERVER_ERROR)) {
			return com.liferay.apibuilder.operation.response.ResponseCode.ERROR;
		}

		throw new IllegalStateException();
	}

	private com.liferay.apibuilder.operation.schema.Schema _toSchema(
		Schema schema, String schemaName) {

		FieldDefinition fieldDefinition = schema.getFieldDefinition();

		return new AttributeSchema(
			_getAttributeType(schema), schemaName, fieldDefinition.getName(),
			fieldDefinition.isPrimaryKey(),
			ListUtil.exists(
				schema.getRequiredPropertySchemaNames(), schemaName::equals));
	}

	private Map<String, com.liferay.apibuilder.operation.schema.Schema>
		_toSchemaMap(Map<String, Schema> propertySchemas) {

		Map<String, com.liferay.apibuilder.operation.schema.Schema> schemaMap =
			new HashMap<>();

		for (Map.Entry<String, Schema> entry : propertySchemas.entrySet()) {
			com.liferay.apibuilder.operation.schema.Schema schema1 = _toSchema(
				entry.getValue(), entry.getKey());

			schemaMap.put(schema1.getName(), schema1);
		}

		return schemaMap;
	}

	private void _validate(Map<String, Schema> schemas) throws Exception {
		for (Schema schema : schemas.values()) {
			_validate(schema);
		}
	}

	private void _validate(PathItem pathItem) throws Exception {
		boolean empty = true;

		for (Method method : Method.values()) {
			com.liferay.portal.vulcan.yaml.openapi.Operation operation =
				pathItem.get(method);

			if (operation == null) {
				continue;
			}

			empty = false;

			OperationDefinition operationDefinition =
				operation.getOperationDefinition();

			if (operationDefinition == null) {
				throw new InvalidObjectException(
					"Missing operation definition");
			}

			String type = operationDefinition.getType();

			if (!_operationHandlerServiceTrackerMap.containsKey(type)) {
				throw new InvalidObjectException(
					"OperationProvider not defined for the type " + type);
			}
		}

		if (empty) {
			throw new InvalidObjectException("There is no operation defined");
		}
	}

	private void _validate(Schema schema) throws Exception {
		SchemaDefinition schemaDefinition = schema.getSchemaDefinition();

		String entityName = schemaDefinition.getEntityName();

		InfoItemFormProvider<?> infoItemFormProvider =
			_infoItemServiceRegistry.getFirstInfoItemService(
				InfoItemFormProvider.class, entityName);

		if (infoItemFormProvider == null) {
			throw new InvalidObjectException(
				"InfoItemFormProvider not found for the entity name " +
					entityName);
		}

		InfoForm infoForm = infoItemFormProvider.getInfoForm();

		Map<String, Schema> propertySchemas = schema.getPropertySchemas();

		boolean primaryKey = false;

		for (Map.Entry<String, Schema> entry : propertySchemas.entrySet()) {
			Schema propertySchema = entry.getValue();

			FieldDefinition fieldDefinition =
				propertySchema.getFieldDefinition();

			if (fieldDefinition == null) {
				throw new InvalidObjectException(
					"FieldDefinition not found for the property " +
						entry.getKey());
			}

			if (fieldDefinition.isPrimaryKey()) {
				primaryKey = true;

				continue;
			}

			String internalFieldName = fieldDefinition.getName();

			InfoField infoField = infoForm.getInfoField(internalFieldName);

			if (infoField == null) {
				throw new InvalidObjectException(
					StringBundler.concat(
						"There is no InfoField '", internalFieldName,
						"' registered for the class name '", entityName, "'"));
			}

			String externalFieldName = entry.getKey();

			if (!Objects.equals(
					AttributeTypeUtil.getInfoFieldType(
						_getAttributeType(
							propertySchemas.get(externalFieldName))),
					infoField.getInfoFieldType())) {

				throw new InvalidObjectException(
					StringBundler.concat(
						"Invalid types between the fields ", externalFieldName,
						" and ", infoField.getName()));
			}
		}

		if (!primaryKey) {
			throw new InvalidObjectException(
				"There is no primary key registered");
		}
	}

	@Reference
	private InfoItemServiceRegistry _infoItemServiceRegistry;

	private ServiceTrackerMap<String, OperationHandler>
		_operationHandlerServiceTrackerMap;

}