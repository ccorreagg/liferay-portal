/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.internal.deployer;

import com.liferay.object.constants.ObjectRelationshipConstants;
import com.liferay.object.deployer.InactiveObjectDefinitionDeployer;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.related.models.ObjectRelatedModelsProviderRegistrator;
import com.liferay.portal.kernel.util.ListUtil;

import java.util.List;

import org.osgi.framework.ServiceRegistration;

/**
 * @author Michael Bowerman
 */
public class InactiveObjectDefinitionDeployerImpl
	implements InactiveObjectDefinitionDeployer {

	public InactiveObjectDefinitionDeployerImpl(
		ObjectRelatedModelsProviderRegistrator
			objectRelatedModelsProviderRegistrator) {

		_objectRelatedModelsProviderRegistrator =
			objectRelatedModelsProviderRegistrator;
	}

	@Override
	public List<ServiceRegistration<?>> deploy(
		ObjectDefinition objectDefinition) {

		return ListUtil.fromArray(
			_objectRelatedModelsProviderRegistrator.register(
				objectDefinition,
				ObjectRelationshipConstants.TYPE_MANY_TO_MANY),
			_objectRelatedModelsProviderRegistrator.register(
				objectDefinition, ObjectRelationshipConstants.TYPE_ONE_TO_MANY),
			_objectRelatedModelsProviderRegistrator.register(
				objectDefinition, ObjectRelationshipConstants.TYPE_ONE_TO_ONE));
	}

	private final ObjectRelatedModelsProviderRegistrator
		_objectRelatedModelsProviderRegistrator;

}