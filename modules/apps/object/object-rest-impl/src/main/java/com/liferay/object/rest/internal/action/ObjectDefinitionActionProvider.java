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

package com.liferay.object.rest.internal.action;

import com.liferay.object.constants.ObjectActionTriggerConstants;
import com.liferay.object.constants.ObjectRelationshipConstants;
import com.liferay.object.model.ObjectAction;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectEntry;
import com.liferay.object.model.ObjectRelationship;
import com.liferay.object.related.models.ObjectRelatedModelsProvider;
import com.liferay.object.related.models.ObjectRelatedModelsProviderRegistry;
import com.liferay.object.rest.internal.resource.v1_0.ObjectEntryResourceImpl;
import com.liferay.object.service.ObjectActionLocalService;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.service.ObjectEntryService;
import com.liferay.object.service.ObjectRelationshipLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.vulcan.action.ActionProvider;
import com.liferay.portal.vulcan.action.ActionProviderContext;
import com.liferay.portal.vulcan.util.ActionUtil;

import java.util.Map;

import javax.ws.rs.core.UriInfo;

/**
 * @author Carlos Correa
 */
public class ObjectDefinitionActionProvider implements ActionProvider {

	public ObjectDefinitionActionProvider(
		ObjectActionLocalService objectActionLocalService,
		ObjectDefinition objectDefinition,
		ObjectDefinitionLocalService objectDefinitionLocalService,
		ObjectEntryService objectEntryService,
		ObjectRelatedModelsProviderRegistry objectRelatedModelsProviderRegistry,
		ObjectRelationshipLocalService objectRelationshipLocalService) {

		_objectActionLocalService = objectActionLocalService;
		_objectDefinition = objectDefinition;
		_objectDefinitionLocalService = objectDefinitionLocalService;
		_objectEntryService = objectEntryService;
		_objectRelatedModelsProviderRegistry =
			objectRelatedModelsProviderRegistry;
		_objectRelationshipLocalService = objectRelationshipLocalService;
	}

	@Override
	public Map<String, Map<String, String>> getActions(
			ActionProviderContext actionProviderContext, long id)
		throws Exception {

		ObjectEntry objectEntry = _objectEntryService.getObjectEntry(id);

		Map<String, Map<String, String>> actions =
			HashMapBuilder.<String, Map<String, String>>put(
				"delete",
				() -> {
					if (_hasRelatedObjectEntries(
							ObjectRelationshipConstants.DELETION_TYPE_PREVENT,
							_objectDefinition, objectEntry)) {

						return null;
					}

					return _addAction(
						ActionKeys.DELETE, "deleteObjectEntry", objectEntry,
						actionProviderContext.getUriInfo());
				}
			).put(
				"get",
				_addAction(
					ActionKeys.VIEW, "getObjectEntry", objectEntry,
					actionProviderContext.getUriInfo())
			).put(
				"permissions",
				_addAction(
					ActionKeys.PERMISSIONS, "getObjectEntryPermissionsPage",
					objectEntry, actionProviderContext.getUriInfo())
			).put(
				"replace",
				_addAction(
					ActionKeys.UPDATE, "putObjectEntry", objectEntry,
					actionProviderContext.getUriInfo())
			).put(
				"update",
				_addAction(
					ActionKeys.UPDATE, "patchObjectEntry", objectEntry,
					actionProviderContext.getUriInfo())
			).build();

		if (GetterUtil.getBoolean(PropsUtil.get("feature.flag.LPS-148804"))) {
			for (ObjectAction objectAction :
					_objectActionLocalService.getObjectActions(
						_objectDefinition.getObjectDefinitionId(),
						ObjectActionTriggerConstants.KEY_STANDALONE)) {

				actions.put(
					objectAction.getName(),
					_addAction(
						ActionKeys.VIEW,
						"putByExternalReferenceCodeObjectEntryExternal" +
							"ReferenceCodeObjectActionObjectActionName",
						objectEntry, actionProviderContext.getUriInfo()));
			}
		}

		return actions;
	}

	@Override
	public String getClassName() {
		return com.liferay.object.rest.dto.v1_0.ObjectEntry.class.getName() +
			"#" + _objectDefinition.getObjectDefinitionId();
	}

	private Map<String, String> _addAction(
			String actionName, String methodName, ObjectEntry objectEntry,
			UriInfo uriInfo)
		throws Exception {

		Map<String, String> map = ActionUtil.addAction(
			actionName, ObjectEntryResourceImpl.class,
			objectEntry.getObjectEntryId(), methodName, null,
			objectEntry.getUserId(),
			_getObjectEntryPermissionName(objectEntry.getObjectDefinitionId()),
			objectEntry.getGroupId(), uriInfo);

		if (map != null) {
			return map;
		}

		return ActionUtil.addAction(
			actionName, ObjectEntryResourceImpl.class,
			objectEntry.getObjectEntryId(), methodName, null,
			_objectEntryService.getModelResourcePermission(objectEntry),
			uriInfo);
	}

	private String _getObjectEntryPermissionName(long objectDefinitionId) {
		return ObjectDefinition.class.getName() + "#" + objectDefinitionId;
	}

	private boolean _hasRelatedObjectEntries(
			String deletionType, ObjectDefinition objectDefinition,
			ObjectEntry objectEntry)
		throws PortalException {

		for (ObjectRelationship objectRelationship :
				_objectRelationshipLocalService.getObjectRelationships(
					objectDefinition.getObjectDefinitionId(), deletionType,
					false)) {

			ObjectDefinition objectDefinition2 =
				_objectDefinitionLocalService.getObjectDefinition(
					objectRelationship.getObjectDefinitionId2());

			if (!objectDefinition2.isActive()) {
				continue;
			}

			ObjectRelatedModelsProvider objectRelatedModelsProvider =
				_objectRelatedModelsProviderRegistry.
					getObjectRelatedModelsProvider(
						objectDefinition2.getClassName(),
						objectRelationship.getType());

			int count = objectRelatedModelsProvider.getRelatedModelsCount(
				objectEntry.getGroupId(),
				objectRelationship.getObjectRelationshipId(),
				objectEntry.getPrimaryKey());

			if (count > 0) {
				return true;
			}
		}

		return false;
	}

	private final ObjectActionLocalService _objectActionLocalService;
	private final ObjectDefinition _objectDefinition;
	private final ObjectDefinitionLocalService _objectDefinitionLocalService;
	private final ObjectEntryService _objectEntryService;
	private final ObjectRelatedModelsProviderRegistry
		_objectRelatedModelsProviderRegistry;
	private final ObjectRelationshipLocalService
		_objectRelationshipLocalService;

}