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

package com.liferay.headless.builder.internal.generator.resource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.headless.builder.internal.generator.application.ApiApplication;
import com.liferay.portal.kernel.util.Portal;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.util.tracker.ServiceTracker;

/**
 * @author Carlos Correa
 */
public class OpenAPIResource extends BaseOpenAPIResource {

	public OpenAPIResource(
		com.liferay.portal.vulcan.resource.OpenAPIResource openAPIResource,
		Portal portal,
		ServiceTracker<Application, ApiApplication> serviceTracker) {

		_openAPIResource = openAPIResource;
		_portal = portal;
		_serviceTracker = serviceTracker;
	}

	public Response get(
			HttpServletRequest httpServletRequest, String type, UriInfo uriInfo)
		throws Exception {

		Response response = _openAPIResource.getOpenAPI(
			contextHttpServletRequest, _resourceClasses, "json", uriInfo);

		System.out.println(
			_objectMapper.writeValueAsString(response.getEntity()));

		return response;
	}

	private static final ObjectMapper _objectMapper = new ObjectMapper() {
		{
			configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
			enable(SerializationFeature.INDENT_OUTPUT);
			setDateFormat(new ISO8601DateFormat());
			setFilterProvider(
				new SimpleFilterProvider() {
					{
						addFilter(
							"Liferay.Vulcan",
							SimpleBeanPropertyFilter.serializeAll());
					}
				});
			setSerializationInclusion(JsonInclude.Include.NON_ABSENT);
		}
	};

	private final com.liferay.portal.vulcan.resource.OpenAPIResource
		_openAPIResource;
	private final Portal _portal;
	private final Set<Class<?>> _resourceClasses = new HashSet<Class<?>>() {
		{
			add(OpenAPIResource.class);
		}
	};
	private final ServiceTracker<Application, ApiApplication> _serviceTracker;

}