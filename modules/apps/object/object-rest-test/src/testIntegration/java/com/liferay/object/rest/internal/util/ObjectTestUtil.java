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

package com.liferay.object.rest.internal.util;

import com.liferay.object.constants.ObjectDefinitionConstants;
import com.liferay.object.constants.ObjectRelationshipConstants;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectEntry;
import com.liferay.object.model.ObjectField;
import com.liferay.object.model.ObjectRelationship;
import com.liferay.object.service.ObjectDefinitionLocalServiceUtil;
import com.liferay.object.service.ObjectEntryLocalServiceUtil;
import com.liferay.object.service.ObjectRelationshipLocalServiceUtil;
import com.liferay.object.util.LocalizedMapUtil;
import com.liferay.object.util.ObjectFieldUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.ServiceContextTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

/**
 * @author Carlos Correa
 */
public class ObjectTestUtil {

	public static ObjectDefinition addObjectDefinition(
			String name, List<ObjectField> objectFields, boolean publish)
		throws Exception {

		long userId = TestPropsValues.getUserId();

		ObjectDefinition objectDefinition =
			ObjectDefinitionLocalServiceUtil.addCustomObjectDefinition(
				userId,
				LocalizedMapUtil.getLocalizedMap(RandomTestUtil.randomString()),
				name, null, null,
				LocalizedMapUtil.getLocalizedMap(RandomTestUtil.randomString()),
				ObjectDefinitionConstants.SCOPE_COMPANY,
				ObjectDefinitionConstants.STORAGE_TYPE_DEFAULT, objectFields);

		if (publish) {
			objectDefinition =
				ObjectDefinitionLocalServiceUtil.publishCustomObjectDefinition(
					userId, objectDefinition.getObjectDefinitionId());
		}

		return objectDefinition;
	}

	public static ObjectEntry addObjectEntry(
			ObjectDefinition objectDefinition, Map<String, Serializable> values)
		throws Exception {

		return ObjectEntryLocalServiceUtil.addObjectEntry(
			TestPropsValues.getUserId(), 0,
			objectDefinition.getObjectDefinitionId(), values,
			ServiceContextTestUtil.getServiceContext());
	}

	public static ObjectField addObjectField(
			String businessType, String dbType, String name, boolean required)
		throws Exception {

		return ObjectFieldUtil.createObjectField(
			businessType, dbType, RandomTestUtil.randomBoolean(),
			RandomTestUtil.randomBoolean(), null, RandomTestUtil.randomString(),
			name, required);
	}

	public static ObjectRelationship addObjectRelationship(
			String name, ObjectDefinition objectDefinition1,
			ObjectDefinition objectDefinition2, String type)
		throws Exception {

		return ObjectRelationshipLocalServiceUtil.addObjectRelationship(
			TestPropsValues.getUserId(),
			objectDefinition1.getObjectDefinitionId(),
			objectDefinition2.getObjectDefinitionId(), 0,
			ObjectRelationshipConstants.DELETION_TYPE_PREVENT,
			LocalizedMapUtil.getLocalizedMap(RandomTestUtil.randomString()),
			name, type);
	}

	public static void deleteObjectDefinition(ObjectDefinition objectDefinition)
		throws Exception {

		if ((objectDefinition == null) || objectDefinition.isSystem()) {
			return;
		}

		ObjectDefinitionLocalServiceUtil.deleteObjectDefinition(
			objectDefinition.getObjectDefinitionId());
	}

	public static ObjectRelationship deleteObjectRelationship(
			ObjectRelationship objectRelationship)
		throws Exception {

		return ObjectRelationshipLocalServiceUtil.deleteObjectRelationship(
			objectRelationship.getObjectRelationshipId());
	}

	public static void relateObjectEntries(
			long objectEntryId1, long objectEntryId2,
			ObjectRelationship objectRelationship)
		throws Exception {

		ObjectRelationshipLocalServiceUtil.
			addObjectRelationshipMappingTableValues(
				TestPropsValues.getUserId(),
				objectRelationship.getObjectRelationshipId(), objectEntryId1,
				objectEntryId2, ServiceContextTestUtil.getServiceContext());
	}

}