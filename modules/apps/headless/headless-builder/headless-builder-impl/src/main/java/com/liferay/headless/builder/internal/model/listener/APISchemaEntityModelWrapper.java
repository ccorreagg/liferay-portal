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

package com.liferay.headless.builder.internal.model.listener;

import com.liferay.headless.builder.application.APIApplication;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Carlos Correa
 */
public class APISchemaEntityModelWrapper implements EntityModel {

	public APISchemaEntityModelWrapper(
		EntityModel entityModel, APIApplication.Schema schema) {

		_entityModel = entityModel;
		_schema = schema;
	}

	@Override
	public Map<String, EntityField> getEntityFieldsMap() {
		Map<String, EntityField> entityModelEntityFieldsMap =
			_entityModel.getEntityFieldsMap();

		if (MapUtil.isEmpty(entityModelEntityFieldsMap)) {
			return entityModelEntityFieldsMap;
		}

		Map<String, EntityField> entityModelFieldsMap = new HashMap<>();

		for (Map.Entry<String, EntityField> entry :
				entityModelEntityFieldsMap.entrySet()) {

			for (APIApplication.Property property : _schema.getProperties()) {
				if (StringUtil.equals(
						property.getSourceFieldName(), entry.getKey())) {

					EntityField entityField = entry.getValue();

					entityModelFieldsMap.put(
						property.getName(),
						new EntityField(
							property.getName(), entityField.getType(),
							locale -> property.getName(),
							locale -> property.getName(),
							locale -> property.getName()));

					break;
				}
			}
		}

		return entityModelFieldsMap;
	}

	private final EntityModel _entityModel;

	APIApplication.Schema _schema;

}