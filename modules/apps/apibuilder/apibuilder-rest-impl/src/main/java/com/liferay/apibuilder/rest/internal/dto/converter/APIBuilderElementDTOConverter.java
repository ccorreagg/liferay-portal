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

package com.liferay.apibuilder.rest.internal.dto.converter;

import com.liferay.apibuilder.model.APIBuilderDTO;
import com.liferay.apibuilder.operation.schema.AttributeSchema;
import com.liferay.apibuilder.operation.schema.ObjectSchema;
import com.liferay.apibuilder.operation.schema.Schema;
import com.liferay.apibuilder.rest.dto.APIBuilderElement;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;

import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * @author Carlos Correa
 */
@Component(
	property = "dto.class.name=com.liferay.apibuilder.model.APIBuilderDTO",
	service = {APIBuilderElementDTOConverter.class, DTOConverter.class}
)
public class APIBuilderElementDTOConverter
	implements DTOConverter<APIBuilderDTO, APIBuilderElement> {

	@Override
	public String getContentType() {
		return APIBuilderDTO.class.getSimpleName();
	}

	@Override
	public APIBuilderElement toDTO(
		DTOConverterContext dtoConverterContext, APIBuilderDTO apiBuilderDTO) {

		APIBuilderElement apiBuilderElement = new APIBuilderElement();

		ObjectSchema objectSchema =
			(ObjectSchema)dtoConverterContext.getAttribute("schema");

		Map<String, Schema> propertySchemas = objectSchema.getProperties();

		for (Schema schema : propertySchemas.values()) {
			AttributeSchema attributeSchema = (AttributeSchema)schema;

			apiBuilderElement.put(
				attributeSchema.getExternalName(),
				_getValue(apiBuilderDTO, attributeSchema));
		}

		apiBuilderElement.setName(apiBuilderDTO.getName());

		return apiBuilderElement;
	}

	private Object _getValue(
		APIBuilderDTO apiBuilderDTO, AttributeSchema attributeSchema) {

		if (attributeSchema.isPrimaryKey()) {
			return apiBuilderDTO.getPrimaryKey();
		}

		return apiBuilderDTO.get(attributeSchema.getName());
	}

}