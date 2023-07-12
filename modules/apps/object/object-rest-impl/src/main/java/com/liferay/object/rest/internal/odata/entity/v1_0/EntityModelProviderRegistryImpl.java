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

package com.liferay.object.rest.internal.odata.entity.v1_0;

import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.rest.odata.entity.v1_0.EntityModelProvider;
import com.liferay.object.rest.odata.entity.v1_0.EntityModelProviderRegistry;
import com.liferay.osgi.service.tracker.collections.map.ScopedServiceTrackerMap;
import com.liferay.osgi.service.tracker.collections.map.ScopedServiceTrackerMapFactory;
import com.liferay.portal.odata.entity.EntityModel;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

/**
 * @author Carlos Correa
 */
@Component(service = EntityModelProviderRegistry.class)
public class EntityModelProviderRegistryImpl
	implements EntityModelProviderRegistry {

	@Override
	public EntityModelProvider getEntityModelProvider(
		ObjectDefinition objectDefinition) {

		EntityModelProvider entityModelProvider =
			_scopedServiceTrackerMap.getService(
				objectDefinition.getCompanyId(),
				objectDefinition.getOSGiJaxRsName("EntityModelProvider"));

		if (entityModelProvider == null) {
			return new NullEntityModelProvider();
		}

		return entityModelProvider;
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_scopedServiceTrackerMap = ScopedServiceTrackerMapFactory.create(
			bundleContext, EntityModelProvider.class, "resource.key",
			() -> null);
	}

	@Deactivate
	protected void deactivate() {
		_scopedServiceTrackerMap.close();
	}

	private ScopedServiceTrackerMap<EntityModelProvider>
		_scopedServiceTrackerMap;

	private final class NullEntityModelProvider implements EntityModelProvider {

		@Override
		public EntityModel getEntityModel() {
			return null;
		}

	}

}