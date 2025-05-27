/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.rest.internal.jaxrs.container.request.filter;

import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectRelationship;
import com.liferay.object.service.ObjectRelationshipLocalService;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.vulcan.fields.NestedFieldsContext;
import com.liferay.portal.vulcan.fields.NestedFieldsContextThreadLocal;

import java.io.IOException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;

/**
 * @author Carlos Correa
 */
@Provider
public class NestedFieldsContainerRequestFilter
	implements ContainerRequestFilter {

	public NestedFieldsContainerRequestFilter(
		ObjectRelationshipLocalService objectRelationshipLocalService) {

		_objectRelationshipLocalService = objectRelationshipLocalService;
	}

	@Override
	public void filter(ContainerRequestContext containerRequestContext)
		throws IOException {

		NestedFieldsContext nestedFieldsContext =
			NestedFieldsContextThreadLocal.getNestedFieldsContext();

		if (nestedFieldsContext == null) {
			return;
		}

		List<String> nestedFields = new ArrayList<>(
			nestedFieldsContext.getNestedFields());

		if (!nestedFields.remove("rootModelHierarchy")) {
			return;
		}

		Queue<Long> queue = new LinkedList<>();

		queue.add(_objectDefinition.getObjectDefinitionId());

		Set<Long> processed = new HashSet<>();

		Long objectDefinitionId = null;

		while ((objectDefinitionId = queue.poll()) != null) {
			if (!processed.add(objectDefinitionId)) {
				continue;
			}

			for (ObjectRelationship objectRelationship :
					_objectRelationshipLocalService.getObjectRelationships(
						objectDefinitionId, true)) {

				nestedFields.add(objectRelationship.getName());

				if (objectRelationship.getObjectDefinitionId1() !=
						objectDefinitionId) {

					queue.add(objectRelationship.getObjectDefinitionId1());
				}
				else if (objectRelationship.getObjectDefinitionId2() !=
							objectDefinitionId) {

					queue.add(objectRelationship.getObjectDefinitionId2());
				}
			}
		}

		ListUtil.distinct(nestedFields);

		NestedFieldsContextThreadLocal.setNestedFieldsContext(
			new NestedFieldsContext(
				nestedFieldsContext.getDepth(),
				nestedFieldsContext.getMessage(), nestedFields,
				nestedFieldsContext.getPathParameters(),
				nestedFieldsContext.getQueryParameters(),
				nestedFieldsContext.getResourceVersion()));
	}

	@Context
	private ObjectDefinition _objectDefinition;

	private final ObjectRelationshipLocalService
		_objectRelationshipLocalService;

}