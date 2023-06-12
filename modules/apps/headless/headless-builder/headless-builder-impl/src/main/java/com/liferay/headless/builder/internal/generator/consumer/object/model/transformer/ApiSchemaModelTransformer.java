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

package com.liferay.headless.builder.internal.generator.consumer.object.model.transformer;

import com.liferay.headless.builder.internal.generator.consumer.object.model.ApiPropertyModel;
import com.liferay.headless.builder.internal.generator.consumer.object.model.ApiSchemaModel;
import com.liferay.object.rest.dto.v1_0.ObjectEntry;
import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.portal.kernel.util.MapUtil;

import java.util.List;
import java.util.Map;

/**
 * @author Carlos Correa
 */
public class ApiSchemaModelTransformer
	implements ObjectModelTransformer<ApiSchemaModel> {

	@Override
	public ApiSchemaModel toModel(long companyId, ObjectEntry objectEntry) {
		Map<String, Object> properties = objectEntry.getProperties();

		String mainObjectDefinitionERC = MapUtil.getString(
			properties, "mainObjectDefinitionERC");

		return new ApiSchemaModel() {

			@Override
			public List<ApiPropertyModel> getApiPropertyModels() {
				return TransformUtil.transform(
					(List<ObjectEntry>)properties.get(
						"apiSchemasAPIProperties"),
					objectEntry1 -> {
						Map<String, Object> propertyProperties =
							objectEntry1.getProperties();

						propertyProperties.put(
							"mainObjectDefinitionERC", mainObjectDefinitionERC);

						return (ApiPropertyModel)
							_apiSchemaPropertyModelTransformer.toModel(
								companyId, objectEntry1);
					});
			}

			@Override
			public long getCompanyId() {
				return companyId;
			}

			@Override
			public String getDescription() {
				return (String)properties.get("description");
			}

			@Override
			public String getExternalReferenceCode() {
				return objectEntry.getExternalReferenceCode();
			}

			@Override
			public String getMainObjectDefinitionERC() {
				return mainObjectDefinitionERC;
			}

			@Override
			public String getName() {
				return MapUtil.getString(properties, _NAME_PROPERTY_NAME);
			}

		};
	}

	private static final String _NAME_PROPERTY_NAME = "name";

	private final ObjectModelTransformer _apiSchemaPropertyModelTransformer =
		new ApiPropertyModelTransformer();

}