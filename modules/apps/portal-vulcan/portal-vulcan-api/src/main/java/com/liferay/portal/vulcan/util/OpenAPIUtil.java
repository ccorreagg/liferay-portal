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

package com.liferay.portal.vulcan.util;

import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.CamelCaseUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.batch.engine.Field;
import com.liferay.portal.vulcan.yaml.openapi.Components;
import com.liferay.portal.vulcan.yaml.openapi.Get;
import com.liferay.portal.vulcan.yaml.openapi.OpenAPIYAML;
import com.liferay.portal.vulcan.yaml.openapi.Operation;
import com.liferay.portal.vulcan.yaml.openapi.Parameter;
import com.liferay.portal.vulcan.yaml.openapi.PathItem;
import com.liferay.portal.vulcan.yaml.openapi.Post;
import com.liferay.portal.vulcan.yaml.openapi.Response;
import com.liferay.portal.vulcan.yaml.openapi.ResponseCode;
import com.liferay.portal.vulcan.yaml.openapi.Schema;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.callbacks.Callback;
import io.swagger.v3.oas.models.examples.Example;
import io.swagger.v3.oas.models.headers.Header;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.links.Link;
import io.swagger.v3.oas.models.media.ArraySchema;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.parameters.RequestBody;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * @author Javier de Arcos
 */
public class OpenAPIUtil {

	public static List<String> getCreateEntityScopes(
		String entityName, OpenAPIYAML openAPIYAML) {

		List<String> scopes = new ArrayList<>();

		Map<String, PathItem> pathItemsMap = openAPIYAML.getPathItems();

		for (PathItem pathItem : pathItemsMap.values()) {
			Post post = pathItem.getPost();

			if ((post == null) ||
				!_hasOKResponseContentSchemaReferenceLike(entityName, post)) {

				continue;
			}

			scopes.add(_getOperationScope(post));
		}

		return scopes;
	}

	public static Map<String, Field> getDTOEntityFields(
		String entityName, OpenAPIYAML openAPIYAML) {

		Components components = openAPIYAML.getComponents();

		Map<String, Schema> schemas = components.getSchemas();

		Schema schema = schemas.get(entityName);

		if (schema == null) {
			return Collections.emptyMap();
		}

		Map<String, Field> fields = new HashMap<>();

		List<String> requiredPropertySchemaNames =
			_getRequiredPropertySchemaNames(schema);

		Map<String, Schema> propertySchemas = schema.getPropertySchemas();

		for (Map.Entry<String, Schema> schemaEntry :
				propertySchemas.entrySet()) {

			String propertyName = schemaEntry.getKey();
			Schema propertySchema = schemaEntry.getValue();

			fields.put(
				propertyName,
				Field.of(
					propertySchema.getDescription(), propertyName,
					propertySchema.isReadOnly(),
					requiredPropertySchemaNames.contains(propertyName),
					propertySchema.getType(), propertySchema.isWriteOnly()));
		}

		return fields;
	}

	public static List<String> getReadEntityScopes(
		String entityName, OpenAPIYAML openAPIYAML) {

		List<String> scopes = new ArrayList<>();

		Map<String, PathItem> pathItemsMap = openAPIYAML.getPathItems();

		for (PathItem pathItem : pathItemsMap.values()) {
			Get get = pathItem.getGet();

			if ((get == null) ||
				!_hasOKResponseContentSchemaReferenceLike(
					"Page" + entityName, get)) {

				continue;
			}

			scopes.add(_getOperationScope(get));
		}

		return scopes;
	}

	public static OpenAPI mergeOpenAPIs(
		String basePath, Map<String, javax.ws.rs.core.Response> openAPIs,
		UriInfo uriInfo) {

		if (openAPIs.isEmpty()) {
			return null;
		}

		Map<String, Callback> callbacks = new HashMap<>();
		Map<String, Object> componentExtensions = new HashMap<>();
		Map<String, Example> examples = new HashMap<>();
		Map<String, Object> extensions = new HashMap<>();
		Map<String, Header> headers = new HashMap<>();
		Map<String, Link> links = new HashMap<>();
		Paths paths = new Paths();
		Map<String, io.swagger.v3.oas.models.parameters.Parameter> parameters =
			new HashMap<>();
		Map<String, RequestBody> requestBodies = new HashMap<>();
		Map<String, ApiResponse> responses = new HashMap<>();
		List<SecurityRequirement> securityRequirements = new ArrayList<>();
		Map<String, SecurityScheme> securitySchemes = new HashMap<>();
		Map<String, io.swagger.v3.oas.models.media.Schema> schemas =
			new HashMap<>();
		List<Tag> tags = new ArrayList<>();

		for (Map.Entry<String, javax.ws.rs.core.Response> openAPIEntry :
				openAPIs.entrySet()) {

			javax.ws.rs.core.Response response = openAPIEntry.getValue();

			OpenAPI openAPI = (OpenAPI)response.getEntity();

			_updateOpenAPIReferences(openAPIEntry.getKey(), openAPI);

			if (openAPI.getComponents() != null) {
				io.swagger.v3.oas.models.Components components =
					openAPI.getComponents();

				if (components.getCallbacks() != null) {
					callbacks.putAll(components.getCallbacks());
				}

				if (components.getExamples() != null) {
					examples.putAll(components.getExamples());
				}

				if (components.getExtensions() != null) {
					componentExtensions.putAll(components.getExtensions());
				}

				if (components.getHeaders() != null) {
					headers.putAll(components.getHeaders());
				}

				if (components.getLinks() != null) {
					links.putAll(components.getLinks());
				}

				if (components.getParameters() != null) {
					parameters.putAll(components.getParameters());
				}

				if (components.getRequestBodies() != null) {
					requestBodies.putAll(components.getRequestBodies());
				}

				if (components.getResponses() != null) {
					responses.putAll(components.getResponses());
				}

				if (components.getSchemas() != null) {
					schemas.putAll(components.getSchemas());
				}

				if (components.getSecuritySchemes() != null) {
					securitySchemes.putAll(components.getSecuritySchemes());
				}
			}

			if (openAPI.getExtensions() != null) {
				extensions.putAll(openAPI.getExtensions());
			}

			if (openAPI.getPaths() != null) {
				paths.putAll(openAPI.getPaths());
			}

			if (openAPI.getSecurity() != null) {
				securityRequirements.addAll(openAPI.getSecurity());
			}

			if (openAPI.getTags() != null) {
				tags.addAll(openAPI.getTags());
			}
		}

		OpenAPI openAPI = new OpenAPI();

		if (!callbacks.isEmpty() || !componentExtensions.isEmpty() ||
			!examples.isEmpty() || !headers.isEmpty() || !links.isEmpty() ||
			!parameters.isEmpty() || !requestBodies.isEmpty() ||
			!responses.isEmpty() || !schemas.isEmpty() ||
			!securitySchemes.isEmpty()) {

			io.swagger.v3.oas.models.Components components =
				new io.swagger.v3.oas.models.Components();

			if (!callbacks.isEmpty()) {
				components.setCallbacks(callbacks);
			}

			if (!componentExtensions.isEmpty()) {
				components.setExtensions(componentExtensions);
			}

			if (!examples.isEmpty()) {
				components.setExamples(examples);
			}

			if (!headers.isEmpty()) {
				components.setHeaders(headers);
			}

			if (!links.isEmpty()) {
				components.setLinks(links);
			}

			if (!parameters.isEmpty()) {
				components.setParameters(parameters);
			}

			if (!requestBodies.isEmpty()) {
				components.setRequestBodies(requestBodies);
			}

			if (!responses.isEmpty()) {
				components.setResponses(responses);
			}

			if (!schemas.isEmpty()) {
				components.setSchemas(schemas);
			}

			if (!securitySchemes.isEmpty()) {
				components.setSecuritySchemes(securitySchemes);
			}

			openAPI.setComponents(components);
		}

		if (!extensions.isEmpty()) {
			openAPI.setExtensions(extensions);
		}

		openAPI.setInfo(
			new Info() {
				{
					setDescription("Description example");

					Collection<javax.ws.rs.core.Response> openAPICollection =
						openAPIs.values();

					Stream<javax.ws.rs.core.Response> openAPIStream =
						openAPICollection.stream();

					setLicense(
						openAPIStream.map(
							response -> (OpenAPI)response.getEntity()
						).findAny(
						).map(
							OpenAPI::getInfo
						).map(
							Info::getLicense
						).orElse(
							null
						));

					setTitle("Title example");
					setVersion("v1.0");
				}
			});

		if (!paths.isEmpty()) {
			openAPI.setPaths(paths);
		}

		if (!securityRequirements.isEmpty()) {
			openAPI.setSecurity(securityRequirements);
		}

		openAPI.setServers(
			Collections.singletonList(
				new Server() {
					{
						setUrl(
							StringUtil.removeLast(
								UriInfoUtil.getBasePath(uriInfo),
								basePath + "/"));
					}
				}));

		if (!tags.isEmpty()) {
			openAPI.setTags(tags);
		}

		return openAPI;
	}

	private static String _getOperationScope(Operation operation) {
		List<Parameter> parameters = operation.getParameters();

		Stream<Parameter> parametersStream = parameters.stream();

		return parametersStream.filter(
			parameter -> StringUtil.equals(parameter.getIn(), "path")
		).map(
			parameter -> {
				String name = parameter.getName();

				if (name.endsWith("Id")) {
					name = StringUtil.removeLast(name, "Id");
				}

				return name;
			}
		).collect(
			Collectors.joining(",")
		);
	}

	private static List<String> _getRequiredPropertySchemaNames(Schema schema) {
		List<String> requiredPropertySchemaNames =
			schema.getRequiredPropertySchemaNames();

		if (requiredPropertySchemaNames == null) {
			requiredPropertySchemaNames = Collections.emptyList();
		}

		return requiredPropertySchemaNames;
	}

	private static String _getUpdatedReference(
		String schemaName, String schemaPrefix) {

		return schemaPrefix + "." + schemaName;
	}

	private static String _getUpdatedSchemaReference(
		String ref, String schemaPrefix) {

		if ((ref != null) && ref.startsWith("#/components/schemas/") &&
			!ref.startsWith("#/components/schemas/" + schemaPrefix)) {

			String updatedReference = _getUpdatedReference(
				StringUtil.extractLast(ref, "#/components/schemas/"),
				schemaPrefix);

			return "#/components/schemas/" + updatedReference;
		}

		return ref;
	}

	private static boolean _hasOKResponseContentSchemaReferenceLike(
		String name, Operation operation) {

		Map<ResponseCode, Response> responses = operation.getResponses();

		if (responses == null) {
			return false;
		}

		Set<Map.Entry<ResponseCode, Response>> entries = responses.entrySet();

		Stream<Map.Entry<ResponseCode, Response>> stream = entries.stream();

		return stream.filter(
			entry -> _isOKResponseCode(entry.getKey())
		).map(
			Map.Entry::getValue
		).map(
			Response::getContent
		).map(
			Map::entrySet
		).flatMap(
			Set::stream
		).map(
			Map.Entry::getValue
		).anyMatch(
			content -> Optional.ofNullable(
				content.getSchema()
			).map(
				Schema::getReference
			).map(
				reference -> StringUtil.equals(
					name, reference.substring(reference.lastIndexOf('/') + 1))
			).orElse(
				false
			)
		);
	}

	private static boolean _isOKResponseCode(ResponseCode responseCode) {
		if (responseCode.isDefaultResponse() ||
			((responseCode.getHttpCode() / 100) == 2)) {

			return true;
		}

		return false;
	}

	private static void _updateOpenAPIReferences(
		String basePath, OpenAPI openAPI) {

		String schemaPrefix = StringUtil.upperCaseFirstLetter(
			CamelCaseUtil.toCamelCase(
				StringUtil.replace(
					StringUtil.removeFirst(basePath, StringPool.FORWARD_SLASH),
					CharPool.FORWARD_SLASH, CharPool.DASH)));

		io.swagger.v3.oas.models.Components components =
			openAPI.getComponents();

		if ((components != null) && (components.getSchemas() != null)) {
			Map<String, io.swagger.v3.oas.models.media.Schema> schemas =
				components.getSchemas();

			for (Map.Entry<String, io.swagger.v3.oas.models.media.Schema>
					schemaEntry : new HashSet<>(schemas.entrySet())) {

				_updateSchemaReferences(schemaEntry.getValue(), schemaPrefix);

				String newSchemaName = _getUpdatedReference(
					schemaEntry.getKey(), schemaPrefix);

				schemas.put(
					newSchemaName, schemas.remove(schemaEntry.getKey()));
			}
		}

		Paths paths = openAPI.getPaths();

		if (paths != null) {
			for (Map.Entry<String, io.swagger.v3.oas.models.PathItem>
					pathItemEntry : new HashSet<>(paths.entrySet())) {

				io.swagger.v3.oas.models.PathItem pathItem =
					pathItemEntry.getValue();

				Matcher matcher = _pathParamValuePattern.matcher(
					pathItemEntry.getKey());

				String path = matcher.replaceAll("{$1}");

				paths.put(basePath + path, paths.remove(path));

				_updateSchemaReferences(pathItem.getDelete(), schemaPrefix);
				_updateSchemaReferences(pathItem.getGet(), schemaPrefix);
				_updateSchemaReferences(pathItem.getHead(), schemaPrefix);
				_updateSchemaReferences(pathItem.getOptions(), schemaPrefix);
				_updateSchemaReferences(pathItem.getPatch(), schemaPrefix);
				_updateSchemaReferences(pathItem.getPost(), schemaPrefix);
				_updateSchemaReferences(pathItem.getPut(), schemaPrefix);
				_updateSchemaReferences(pathItem.getTrace(), schemaPrefix);
			}
		}
	}

	private static void _updateSchemaReferences(
		io.swagger.v3.oas.models.Operation operation, String schemaPrefix) {

		if (operation == null) {
			return;
		}

		RequestBody requestBody = operation.getRequestBody();

		if (requestBody != null) {
			requestBody.set$ref(
				_getUpdatedSchemaReference(
					requestBody.get$ref(), schemaPrefix));

			Content content = requestBody.getContent();

			if (content != null) {
				for (io.swagger.v3.oas.models.media.MediaType mediaType :
						content.values()) {

					_updateSchemaReferences(
						mediaType.getSchema(), schemaPrefix);
				}
			}
		}

		ApiResponses apiResponses = operation.getResponses();

		if (apiResponses != null) {
			for (ApiResponse apiResponse : apiResponses.values()) {
				apiResponse.set$ref(
					_getUpdatedSchemaReference(
						apiResponse.get$ref(), schemaPrefix));

				Content content = apiResponse.getContent();

				if (content == null) {
					continue;
				}

				for (io.swagger.v3.oas.models.media.MediaType mediaType :
						content.values()) {

					_updateSchemaReferences(
						mediaType.getSchema(), schemaPrefix);
				}
			}
		}

		if (operation.getTags() != null) {
			List<String> tags = operation.getTags();

			for (int i = 0; i < tags.size(); i++) {
				tags.set(i, _getUpdatedReference(tags.get(i), schemaPrefix));
			}
		}

		if (operation.getOperationId() != null) {
			operation.setOperationId(
				_getUpdatedReference(operation.getOperationId(), schemaPrefix));
		}
	}

	private static void _updateSchemaReferences(
		io.swagger.v3.oas.models.media.Schema schema, String schemaPrefix) {

		if (schema == null) {
			return;
		}

		schema.set$ref(
			_getUpdatedSchemaReference(schema.get$ref(), schemaPrefix));

		if (schema instanceof ArraySchema) {
			ArraySchema arraySchema = (ArraySchema)schema;

			_updateSchemaReferences(arraySchema.getItems(), schemaPrefix);
		}

		Map<String, io.swagger.v3.oas.models.media.Schema> properties =
			schema.getProperties();

		if (properties != null) {
			for (Map.Entry<String, io.swagger.v3.oas.models.media.Schema>
					schemaEntry : properties.entrySet()) {

				_updateSchemaReferences(schemaEntry.getValue(), schemaPrefix);
			}
		}

		Object additionalProperties = schema.getAdditionalProperties();

		if (additionalProperties instanceof
				io.swagger.v3.oas.models.media.Schema) {

			io.swagger.v3.oas.models.media.Schema additionalPropertiesSchema =
				(io.swagger.v3.oas.models.media.Schema)additionalProperties;

			_updateSchemaReferences(additionalPropertiesSchema, schemaPrefix);
		}
	}

	private static final Pattern _pathParamValuePattern = Pattern.compile(
		"\\{(.*)(:.*)\\}");

}