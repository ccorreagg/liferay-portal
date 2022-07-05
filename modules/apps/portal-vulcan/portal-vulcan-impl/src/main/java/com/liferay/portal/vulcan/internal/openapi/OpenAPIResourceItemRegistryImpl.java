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

import com.liferay.osgi.util.ServiceTrackerFactory;
import com.liferay.portal.vulcan.openapi.OpenAPIResourceItem;
import com.liferay.portal.vulcan.openapi.OpenAPIResourceItemRegistry;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
	public List<OpenAPIResourceItem> getOpenAPIResourceItems() {
		return Arrays.asList(_serviceTracker.getServices(new OpenAPIResourceItem[0]));
	}

	@Activate
	protected void activate(BundleContext bundleContext)
		throws InvalidSyntaxException {

		_serviceTracker = ServiceTrackerFactory.create(
			bundleContext, OpenAPIResourceItem.class, null);

		_serviceTracker.open();
	}

	@Deactivate
	protected void deactivate() {
		_serviceTracker.close();
	}

	private ServiceTracker<OpenAPIResourceItem, OpenAPIResourceItem> _serviceTracker;

}