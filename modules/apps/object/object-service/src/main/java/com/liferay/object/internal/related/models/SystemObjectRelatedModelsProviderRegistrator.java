/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.internal.related.models;

import com.liferay.object.constants.ObjectRelationshipConstants;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.related.models.ObjectRelatedModelsProvider;
import com.liferay.object.related.models.ObjectRelatedModelsProviderRegistrator;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.service.ObjectEntryLocalService;
import com.liferay.object.service.ObjectFieldLocalService;
import com.liferay.object.service.ObjectRelationshipLocalService;
import com.liferay.object.system.SystemObjectDefinitionManagerRegistry;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.util.HashMapDictionaryBuilder;
import com.liferay.portal.kernel.util.StringUtil;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(
	property = "type=system",
	service = ObjectRelatedModelsProviderRegistrator.class
)
public class SystemObjectRelatedModelsProviderRegistrator
	implements ObjectRelatedModelsProviderRegistrator {

	@Override
	public ServiceRegistration<?> register(
		ObjectDefinition objectDefinition, String relationshipType) {

		if (!objectDefinition.isUnmodifiableSystemObject()) {
			throw new IllegalArgumentException(
				"The object definition must be unmodifiable system object");
		}

		ObjectRelatedModelsProvider<?> objectRelatedModelsProvider = null;

		if (StringUtil.equals(
				relationshipType,
				ObjectRelationshipConstants.TYPE_MANY_TO_MANY)) {

			objectRelatedModelsProvider =
				new SystemObjectMtoMObjectRelatedModelsProviderImpl(
					objectDefinition, _objectDefinitionLocalService,
					_objectFieldLocalService, _objectRelationshipLocalService,
					_persistedModelLocalServiceRegistry,
					_systemObjectDefinitionManagerRegistry);
		}
		else if (StringUtil.equals(
					relationshipType,
					ObjectRelationshipConstants.TYPE_ONE_TO_MANY)) {

			objectRelatedModelsProvider =
				new SystemObject1toMObjectRelatedModelsProviderImpl(
					objectDefinition, _objectDefinitionLocalService,
					_objectEntryLocalService, _objectFieldLocalService,
					_objectRelationshipLocalService,
					_persistedModelLocalServiceRegistry,
					_systemObjectDefinitionManagerRegistry);
		}
		else {
			throw new RuntimeException(
				"Unable to register an ObjectRelatedModelsProvider with " +
					"relationshipType " + relationshipType);
		}

		return _bundleContext.registerService(
			ObjectRelatedModelsProvider.class, objectRelatedModelsProvider,
			HashMapDictionaryBuilder.<String, Object>put(
				ObjectRelatedModelsProviderRegistrator.COMPANY_ID_KEY,
				String.valueOf(objectRelatedModelsProvider.getCompanyId())
			).put(
				ObjectRelatedModelsProviderRegistrator.
					OBJECT_DEFINITION_NAME_KEY,
				objectDefinition.getName()
			).put(
				ObjectRelatedModelsProviderRegistrator.RELATIONSHIP_TYPE_KEY,
				objectRelatedModelsProvider.getObjectRelationshipType()
			).build());
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;
	}

	private BundleContext _bundleContext;

	@Reference
	private ObjectDefinitionLocalService _objectDefinitionLocalService;

	@Reference
	private ObjectEntryLocalService _objectEntryLocalService;

	@Reference
	private ObjectFieldLocalService _objectFieldLocalService;

	@Reference
	private ObjectRelationshipLocalService _objectRelationshipLocalService;

	@Reference
	private PersistedModelLocalServiceRegistry
		_persistedModelLocalServiceRegistry;

	@Reference
	private SystemObjectDefinitionManagerRegistry
		_systemObjectDefinitionManagerRegistry;

}