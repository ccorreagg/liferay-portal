/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.builder.internal.related.models;

import com.liferay.object.constants.ObjectRelationshipConstants;
import com.liferay.object.model.ObjectEntry;
import com.liferay.object.related.models.ManyToOneObjectRelatedModelsProvider;
import com.liferay.object.related.models.ObjectRelatedModelsProvider;
import com.liferay.object.related.models.ObjectRelatedModelsProviderRegistrator;
import com.liferay.object.service.ObjectEntryLocalService;
import com.liferay.osgi.util.ServiceTrackerFactory;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapDictionary;

import java.util.Dictionary;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

/**
 * @author Carlos Correa
 */
@Component(service = {})
public class APIPropertyObjectRelatedModelsProviderRegistrar {

	@Activate
	protected void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_serviceTracker = ServiceTrackerFactory.open(
			bundleContext,
			StringBundler.concat(
				"(&(objectClass=", ObjectRelatedModelsProvider.class.getName(),
				")(objectClass=",
				ManyToOneObjectRelatedModelsProvider.class.getName(), ")(",
				ObjectRelatedModelsProviderRegistrator.
					OBJECT_DEFINITION_NAME_KEY,
				"=APIProperty)(",
				ObjectRelatedModelsProviderRegistrator.RELATIONSHIP_TYPE_KEY,
				"=", ObjectRelationshipConstants.TYPE_ONE_TO_MANY, "))"),
			new ObjectRelatedModelsProviderServiceTrackerCustomizer());
	}

	@Deactivate
	protected void deactivate() {
		_serviceTracker.close();
	}

	private BundleContext _bundleContext;

	@Reference
	private ObjectEntryLocalService _objectEntryLocalService;

	private ServiceTracker
		<ObjectRelatedModelsProvider, ObjectRelatedModelsProvider>
			_serviceTracker;

	private class ObjectRelatedModelsProviderServiceTrackerCustomizer
		implements ServiceTrackerCustomizer
			<ObjectRelatedModelsProvider, ObjectRelatedModelsProvider> {

		@Override
		public ObjectRelatedModelsProvider addingService(
			ServiceReference<ObjectRelatedModelsProvider> serviceReference) {

			ObjectRelatedModelsProvider<ObjectEntry>
				objectRelatedModelsProvider = _bundleContext.getService(
					serviceReference);

			if (objectRelatedModelsProvider instanceof
					DeleteOnDisassociateObjectRelatedModelsProvider) {

				return objectRelatedModelsProvider;
			}

			Dictionary<String, Object> properties = new HashMapDictionary<>();

			for (String key : serviceReference.getPropertyKeys()) {
				properties.put(key, serviceReference.getProperty(key));
			}

			Integer serviceRanking = GetterUtil.getInteger(
				serviceReference.getProperty("service.ranking"));

			properties.put(
				"service.ranking",
				Math.min(Integer.MAX_VALUE, serviceRanking + 100));

			ObjectRelatedModelsProvider<ObjectEntry>
				deleteOnDisassociateObjectRelatedModelsProvider =
					new DeleteOnDisassociateObjectRelatedModelsProvider(
						_objectEntryLocalService, objectRelatedModelsProvider);

			ServiceRegistration<ObjectRelatedModelsProvider<?>>
				serviceRegistration = _bundleContext.registerService(
					(Class<ObjectRelatedModelsProvider<?>>)
						(Class<?>)ObjectRelatedModelsProvider.class,
					deleteOnDisassociateObjectRelatedModelsProvider,
					properties);

			_serviceRegistrations.put(serviceReference, serviceRegistration);

			return deleteOnDisassociateObjectRelatedModelsProvider;
		}

		@Override
		public void modifiedService(
			ServiceReference<ObjectRelatedModelsProvider> serviceReference,
			ObjectRelatedModelsProvider objectRelatedModelsProvider) {

			removedService(serviceReference, objectRelatedModelsProvider);

			addingService(serviceReference);
		}

		@Override
		public void removedService(
			ServiceReference<ObjectRelatedModelsProvider> serviceReference,
			ObjectRelatedModelsProvider objectRelatedModelsProvider) {

			ServiceRegistration<ObjectRelatedModelsProvider<?>>
				serviceRegistration = _serviceRegistrations.remove(
					serviceReference);

			if (serviceRegistration != null) {
				serviceRegistration.unregister();
			}
		}

		private final Map
			<ServiceReference<ObjectRelatedModelsProvider>,
			 ServiceRegistration<ObjectRelatedModelsProvider<?>>>
				_serviceRegistrations = new ConcurrentHashMap<>();

	}

}