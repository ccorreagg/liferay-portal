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

package com.liferay.apibuilder.internal.util;

import com.liferay.apibuilder.model.APIBuilderDTO;
import com.liferay.apibuilder.operation.schema.AttributeSchema;
import com.liferay.apibuilder.operation.schema.ObjectSchema;
import com.liferay.apibuilder.operation.schema.Schema;
import com.liferay.apibuilder.util.AttributeTypeUtil;
import com.liferay.info.exception.InfoFormValidationException;
import com.liferay.info.exception.NoSuchInfoItemException;
import com.liferay.info.field.InfoField;
import com.liferay.info.field.InfoFieldValue;
import com.liferay.info.form.InfoForm;
import com.liferay.info.item.InfoItemServiceRegistry;
import com.liferay.info.item.provider.InfoItemFormProvider;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(service = {})
public class APIBuilderUtil {

	public static <T> T getInfoItemService(
			String className, Class<T> serviceClass)
		throws Exception {

		T infoItemService = _infoItemServiceRegistry.getFirstInfoItemService(
			serviceClass, className);

		if (infoItemService == null) {
			throw new NoSuchInfoItemException(
				String.format(
					"There is no %s defined for the class name '%s'",
					serviceClass.getSimpleName(), className));
		}

		return infoItemService;
	}

	public static APIBuilderDTO toAPIBuilderDTO(
		Collection<InfoFieldValue<Object>> infoFieldValues, long primaryKey,
		String schemaName) {

		APIBuilderDTO apiBuilderDTO = new APIBuilderDTO();

		for (InfoFieldValue<Object> infoFieldValue : infoFieldValues) {
			InfoField infoField = infoFieldValue.getInfoField();

			apiBuilderDTO.put(infoField.getName(), infoFieldValue.getValue());
		}

		apiBuilderDTO.setName(schemaName);
		apiBuilderDTO.setPrimaryKey(primaryKey);

		return apiBuilderDTO;
	}

	public static void validate(
			AttributeSchema attributeSchema, InfoField infoField)
		throws Exception {

		if (infoField == null) {
			throw new NoSuchInfoItemException(
				"InfoField missing for the attribute " +
					attributeSchema.getName());
		}

		if (!Objects.equals(
				AttributeTypeUtil.getInfoFieldType(
					attributeSchema.getAttributeType()),
				infoField.getInfoFieldType())) {

			throw new InfoFormValidationException();
		}
	}

	public static void validate(ObjectSchema objectSchema) throws Exception {
		InfoItemFormProvider<?> infoItemFormProvider = getInfoItemService(
			objectSchema.getClassName(), InfoItemFormProvider.class);

		InfoForm infoForm = infoItemFormProvider.getInfoForm();

		Map<String, Schema> propertySchemas = objectSchema.getProperties();

		for (Schema schema : propertySchemas.values()) {
			if (schema instanceof ObjectSchema) {
				validate((ObjectSchema)schema);
			}
			else if (schema instanceof AttributeSchema) {
				validate(
					(AttributeSchema)schema,
					infoForm.getInfoField(schema.getName()));
			}
			else {
				throw new IllegalStateException();
			}
		}
	}

	@Reference(unbind = "-")
	protected void setInfoItemServiceRegistry(
		InfoItemServiceRegistry infoItemServiceRegistry) {

		_infoItemServiceRegistry = infoItemServiceRegistry;
	}

	private static InfoItemServiceRegistry _infoItemServiceRegistry;

}