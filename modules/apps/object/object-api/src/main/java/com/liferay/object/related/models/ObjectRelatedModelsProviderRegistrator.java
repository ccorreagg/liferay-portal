/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.related.models;

import com.liferay.object.model.ObjectDefinition;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.ServiceRegistration;

/**
 * @author Carlos Correa
 */
@ProviderType
public interface ObjectRelatedModelsProviderRegistrator {

	public static final String COMPANY_ID_KEY = "company.id";

	public static final String OBJECT_DEFINITION_NAME_KEY =
		"object.definition.name";

	public static final String RELATIONSHIP_TYPE_KEY = "relationship.type";

	public ServiceRegistration<?> register(
		ObjectDefinition objectDefinition, String relationshipType);

}