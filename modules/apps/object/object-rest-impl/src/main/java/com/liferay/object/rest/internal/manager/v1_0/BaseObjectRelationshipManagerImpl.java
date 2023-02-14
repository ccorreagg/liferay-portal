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

import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectRelationship;
import com.liferay.object.rest.dto.v1_0.ObjectEntry;
import com.liferay.object.rest.internal.util.ObjectEntryValuesUtil;
import com.liferay.object.rest.manager.v1_0.ObjectEntryManager;
import com.liferay.object.rest.manager.v1_0.ObjectEntryManagerRegistry;
import com.liferay.object.rest.manager.v1_0.ObjectRelationshipManager;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.service.ObjectRelationshipService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;

import java.util.List;
import java.util.Map;

import javax.ws.rs.BadRequestException;

/**
 * @author Carlos Correa
 */
public abstract class BaseObjectRelationshipManagerImpl
	implements ObjectRelationshipManager {

	public BaseObjectRelationshipManagerImpl(
		ObjectDefinition objectDefinition,
		ObjectDefinitionLocalService objectDefinitionLocalService,
		ObjectEntryManagerRegistry objectEntryManagerRegistry,
		ObjectRelationshipService objectRelationshipService) {

		this.objectDefinition = objectDefinition;
		this.objectDefinitionLocalService = objectDefinitionLocalService;
		this.objectEntryManagerRegistry = objectEntryManagerRegistry;
		this.objectRelationshipService = objectRelationshipService;
	}

	@Override
	public String getClassName() {
		return objectDefinition.getClassName();
	}

	protected long getRelatedObjectDefinitionId(
		ObjectRelationship objectRelationship) {

		if (objectDefinition.getObjectDefinitionId() ==
				objectRelationship.getObjectDefinitionId1()) {

			return objectRelationship.getObjectDefinitionId2();
		}

		return objectRelationship.getObjectDefinitionId1();
	}

	protected void relateObjectEntries(
			ObjectRelationship objectRelationship, long primaryKey,
			long relatedPrimaryKey)
		throws Exception {

		long primaryKey1;
		long primaryKey2;

		if (objectDefinition.getObjectDefinitionId() ==
				objectRelationship.getObjectDefinitionId1()) {

			primaryKey1 = primaryKey;
			primaryKey2 = relatedPrimaryKey;
		}
		else {
			primaryKey1 = relatedPrimaryKey;
			primaryKey2 = primaryKey;
		}

		objectRelationshipService.addObjectRelationshipMappingTableValues(
			objectRelationship.getObjectRelationshipId(), primaryKey1,
			primaryKey2, new ServiceContext());
	}

	protected void relatesWithMany(
			DTOConverterContext dtoConverterContext,
			ObjectRelationship objectRelationship, long primaryKey,
			Object value)
		throws Exception {

		validateManySide(value);

		ObjectDefinition relatedObjectDefinition =
			objectDefinitionLocalService.getObjectDefinition(
				getRelatedObjectDefinitionId(objectRelationship));

		ObjectEntryManager objectEntryManager =
			objectEntryManagerRegistry.getObjectEntryManager(
				relatedObjectDefinition.getStorageType());

		for (Object object : (List)value) {
			ObjectEntry relatedObjectEntry =
				ObjectEntryValuesUtil.toObjectEntry(
					(Map<String, Object>)object);

			relatedObjectEntry = objectEntryManager.addOrUpdateObjectEntry(
				objectRelationship.getCompanyId(), dtoConverterContext,
				relatedObjectEntry.getExternalReferenceCode(),
				relatedObjectDefinition, relatedObjectEntry,
				relatedObjectDefinition.getScope());

			relateObjectEntries(
				objectRelationship, primaryKey, relatedObjectEntry.getId());
		}
	}

	protected void relatesWithOne(
			DTOConverterContext dtoConverterContext,
			ObjectRelationship objectRelationship, long primaryKey,
			Object value)
		throws Exception {

		validateOneSide(value);

		ObjectDefinition relatedObjectDefinition =
			objectDefinitionLocalService.getObjectDefinition(
				getRelatedObjectDefinitionId(objectRelationship));

		ObjectEntryManager objectEntryManager =
			objectEntryManagerRegistry.getObjectEntryManager(
				relatedObjectDefinition.getStorageType());

		ObjectEntry relatedObjectEntry =
			objectEntryManager.addOrUpdateObjectEntry(
				objectRelationship.getCompanyId(), dtoConverterContext,
				relatedObjectDefinition.getExternalReferenceCode(),
				relatedObjectDefinition,
				ObjectEntryValuesUtil.toObjectEntry((Map<String, Object>)value),
				relatedObjectDefinition.getScope());

		relateObjectEntries(
			objectRelationship, primaryKey, relatedObjectEntry.getId());
	}

	protected void validateManySide(Object item) {
		if (!(item instanceof List)) {
			throw new BadRequestException();
		}

		for (Object object : (List<?>)item) {
			validateOneSide(object);
		}
	}

	protected void validateOneSide(Object object) {
		if (!(object instanceof Map)) {
			throw new BadRequestException();
		}
	}

	protected ObjectDefinition objectDefinition;
	protected ObjectDefinitionLocalService objectDefinitionLocalService;
	protected ObjectEntryManagerRegistry objectEntryManagerRegistry;
	protected ObjectRelationshipService objectRelationshipService;

}