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

package com.liferay.portal.vulcan.internal.openapi;

import com.liferay.portal.vulcan.openapi.OpenAPIResourceItem;
import com.liferay.portal.vulcan.openapi.OpenAPIResourceItemRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.BundleContext;
import org.osgi.framework.Filter;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

/**
 * @author Carlos Correa
 */
@Component(immediate = true, service = OpenAPIResourceItemRegistry.class)
public class OpenAPIResourceItemRegistryImpl
	implements OpenAPIResourceItemRegistry {

	@Override
	public Set<String> getEntityClassNames() {
		return _openAPIResourceItemMap.keySet();
	}

	@Override
	public OpenAPIResourceItem getOpenAPIResourceItem(String entityClassName) {
		return _openAPIResourceItemMap.get(entityClassName);
	}

	@Activate
	protected void activate(BundleContext bundleContext)
		throws InvalidSyntaxException {

		Filter filter = bundleContext.createFilter(
			"(openapi.resource.item=true)");

		_serviceTracker = new ServiceTracker<>(
			bundleContext, filter,
			new OpenAPIResourceItemServiceTrackerCustomizer(bundleContext));

		_serviceTracker.open();
	}

	@Deactivate
	protected void deactivate() {
		_serviceTracker.close();
	}

	private final Map<String, OpenAPIResourceItem> _openAPIResourceItemMap =
		new HashMap<>();
	private ServiceTracker<?, ?> _serviceTracker;

	private class OpenAPIResourceItemServiceTrackerCustomizer
		implements ServiceTrackerCustomizer
			<OpenAPIResourceItem, OpenAPIResourceItem> {

		@Override
		public OpenAPIResourceItem addingService(
			ServiceReference<OpenAPIResourceItem> serviceReference) {

			OpenAPIResourceItem openAPIResourceItem = _bundleContext.getService(
				serviceReference);

			Class<?> resourceItemClass = openAPIResourceItem.getClass();

			_openAPIResourceItemMap.put(
				resourceItemClass.getName(), openAPIResourceItem);

			return openAPIResourceItem;
		}

		@Override
		public void modifiedService(
			ServiceReference<OpenAPIResourceItem> serviceReference,
			OpenAPIResourceItem openAPIResourceItem) {
		}

		@Override
		public void removedService(
			ServiceReference<OpenAPIResourceItem> serviceReference,
			OpenAPIResourceItem openAPIResourceItem) {

			Class<?> resourceItemClass = openAPIResourceItem.getClass();

			_openAPIResourceItemMap.remove(resourceItemClass.getName());
		}

		private OpenAPIResourceItemServiceTrackerCustomizer(
			BundleContext bundleContext) {

			_bundleContext = bundleContext;
		}

		private final BundleContext _bundleContext;

	}

}