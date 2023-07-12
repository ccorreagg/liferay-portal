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

package com.liferay.object.rest.internal.odata.entity.v1_0;

import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.rest.odata.entity.v1_0.EntityModelProvider;
import com.liferay.object.service.ObjectFieldLocalService;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.odata.entity.EntityModel;

/**
 * @author Carlos Correa
 */
public class EntityModelProviderImpl implements EntityModelProvider {

	public EntityModelProviderImpl(
		ObjectDefinition objectDefinition,
		ObjectFieldLocalService objectFieldLocalService) {

		_objectDefinition = objectDefinition;
		_objectFieldLocalService = objectFieldLocalService;
	}

	@Override
	public EntityModel getEntityModel() {
		try {
			return new ObjectEntryEntityModel(
				_objectDefinition.getObjectDefinitionId(),
				_objectFieldLocalService.getObjectFields(
					_objectDefinition.getObjectDefinitionId()));
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private final ObjectDefinition _objectDefinition;
	private final ObjectFieldLocalService _objectFieldLocalService;

}