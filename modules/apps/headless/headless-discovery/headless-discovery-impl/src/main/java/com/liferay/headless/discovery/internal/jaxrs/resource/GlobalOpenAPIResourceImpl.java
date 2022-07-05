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

package com.liferay.headless.discovery.internal.jaxrs.resource;

import com.liferay.portal.vulcan.openapi.OpenAPIResourceItem;
import com.liferay.portal.vulcan.resource.OpenAPIResource;
import com.liferay.portal.vulcan.util.OpenAPIUtil;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.runtime.JaxrsServiceRuntime;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

/**
 * @author Carlos Correa
 */
@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_SELECT + "=(osgi.jaxrs.name=Liferay.Headless.Discovery.OpenAPI)",
		JaxrsWhiteboardConstants.JAX_RS_RESOURCE + "=true"
	},
	service = GlobalOpenAPIResourceImpl.class
)
public class GlobalOpenAPIResourceImpl {

	@GET
	@Path("/openapi.{type:json|yaml}")
	@Produces({MediaType.APPLICATION_JSON, "application/yaml"})
	public Response getOpenAPI(@PathParam("type") String type)
		throws Exception {

		Map<String, Response> openAPIs = new HashMap<>();

		Collection<ServiceReference<OpenAPIResourceItem>> serviceReferences =
			_bundleContext.getServiceReferences(
				OpenAPIResourceItem.class, null);

		for (ServiceReference<OpenAPIResourceItem> serviceReference :
				serviceReferences) {

			OpenAPIResourceItem openAPIResourceItem = _bundleContext.getService(
				serviceReference);

			String basePath = openAPIResourceItem.getBasePath();

			if (basePath == null) {
				continue;
			}

			openAPIs.put(basePath, openAPIResourceItem.getOpenAPI());
		}

		return _openAPIResource.toResponse(
			OpenAPIUtil.mergeOpenAPIs("/openapi", openAPIs, _uriInfo), type);
	}

	public Set<Object> getSingletons() {
		return Collections.singleton(this);
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;
	}

	private BundleContext _bundleContext;

	@Reference
	private JaxrsServiceRuntime _jaxrsServiceRuntime;

	@Reference
	private OpenAPIResource _openAPIResource;

	@Context
	private UriInfo _uriInfo;

}