/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.internal.related.models;

import com.liferay.object.constants.ObjectRelationshipConstants;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.related.models.ManyToOneObjectRelatedModelsProvider;
import com.liferay.object.related.models.ObjectRelatedModelsProvider;
import com.liferay.object.related.models.ObjectRelatedModelsProviderRegistrator;
import com.liferay.object.service.ObjectEntryService;
import com.liferay.object.service.ObjectFieldLocalService;
import com.liferay.object.service.ObjectRelationshipLocalService;
import com.liferay.petra.function.transform.TransformUtil;
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
	property = "type=custom",
	service = ObjectRelatedModelsProviderRegistrator.class
)
public class ObjectEntryRelatedModelsProviderRegistrator
	implements ObjectRelatedModelsProviderRegistrator {

	@Override
	public ServiceRegistration<?> register(
		ObjectDefinition objectDefinition, String relationshipType) {

		if (objectDefinition.isUnmodifiableSystemObject()) {
			throw new IllegalArgumentException(
				"The object definition must not be unmodifiable system object");
		}

		Class<?>[] classes = null;
		ObjectRelatedModelsProvider<?> objectRelatedModelsProvider = null;

		if (StringUtil.equals(
				relationshipType,
				ObjectRelationshipConstants.TYPE_MANY_TO_MANY)) {

			classes = new Class<?>[] {ObjectRelatedModelsProvider.class};

			objectRelatedModelsProvider =
				new ObjectEntryMtoMObjectRelatedModelsProviderImpl(
					objectDefinition, _objectEntryService,
					_objectRelationshipLocalService);
		}
		else if (StringUtil.equals(
					relationshipType,
					ObjectRelationshipConstants.TYPE_ONE_TO_MANY)) {

			classes = new Class<?>[] {
				ManyToOneObjectRelatedModelsProvider.class,
				ObjectRelatedModelsProvider.class
			};

			objectRelatedModelsProvider =
				new ObjectEntry1toMObjectRelatedModelsProviderImpl(
					objectDefinition, _objectEntryService,
					_objectFieldLocalService, _objectRelationshipLocalService);
		}
		else if (StringUtil.equals(
					relationshipType,
					ObjectRelationshipConstants.TYPE_ONE_TO_ONE)) {

			classes = new Class<?>[] {ObjectRelatedModelsProvider.class};

			objectRelatedModelsProvider =
				new ObjectEntry1to1ObjectRelatedModelsProviderImpl(
					objectDefinition, _objectEntryService,
					_objectFieldLocalService, _objectRelationshipLocalService);
		}
		else {
			throw new RuntimeException(
				"Unable to register an ObjectRelatedModelsProvider with " +
					"relationshipType " + relationshipType);
		}

		return _bundleContext.registerService(
			TransformUtil.transform(classes, Class::getName, String.class),
			objectRelatedModelsProvider,
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
	private ObjectEntryService _objectEntryService;

	@Reference
	private ObjectFieldLocalService _objectFieldLocalService;

	@Reference
	private ObjectRelationshipLocalService _objectRelationshipLocalService;

}