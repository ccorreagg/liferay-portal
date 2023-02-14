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

package com.liferay.object.rest.internal.manager.v1_0;

import com.liferay.object.constants.ObjectRelationshipConstants;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectRelationship;
import com.liferay.object.rest.manager.v1_0.ObjectEntryManagerRegistry;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.service.ObjectRelationshipService;
import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;

/**
 * @author Carlos Correa
 */
public class ObjectEntryMtoMObjectRelationshipManagerImpl
	extends BaseObjectRelationshipManagerImpl {

	public ObjectEntryMtoMObjectRelationshipManagerImpl(
		ObjectDefinition objectDefinition,
		ObjectDefinitionLocalService objectDefinitionLocalService,
		ObjectEntryManagerRegistry objectEntryManagerRegistry,
		ObjectRelationshipService objectRelationshipService) {

		super(
			objectDefinition, objectDefinitionLocalService,
			objectEntryManagerRegistry, objectRelationshipService);
	}

	@Override
	public String getObjectRelationshipType() {
		return ObjectRelationshipConstants.TYPE_MANY_TO_MANY;
	}

	@Override
	public void relateWith(
			DTOConverterContext dtoConverterContext,
			ObjectRelationship objectRelationship, long primaryKey,
			Object value)
		throws Exception {

		relatesWithMany(
			dtoConverterContext, objectRelationship, primaryKey, value);
	}

}