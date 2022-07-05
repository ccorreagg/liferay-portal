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

package com.liferay.portal.vulcan.resource;

import com.liferay.portal.vulcan.openapi.OpenAPISchemaFilter;
import com.liferay.portal.vulcan.util.UriInfoUtil;

import io.swagger.v3.oas.models.OpenAPI;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletConfig;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * @author Javier Gamarra
 */
public interface OpenAPIResource {

	public default Response getOpenAPI(
			Application application, HttpHeaders httpHeaders,
			Set<Class<?>> resourceClasses, ServletConfig servletConfig,
			String type, UriInfo uriInfo)
		throws Exception {

		return getOpenAPI(resourceClasses, type);
	}

	public default Response getOpenAPI(
			OpenAPISchemaFilter openAPISchemaFilter,
			Set<Class<?>> resourceClasses, String type, UriInfo uriInfo)
		throws Exception {

		String basePath = null;
		Map<String, List<String>> queryParameters = null;

		if (uriInfo != null) {
			basePath = UriInfoUtil.getBasePath(uriInfo);
			queryParameters = uriInfo.getQueryParameters();
		}

		return getOpenAPI(
			basePath, openAPISchemaFilter, queryParameters, resourceClasses,
			type);
	}

	public default Response getOpenAPI(
			Set<Class<?>> resourceClasses, String type)
		throws Exception {

		return null;
	}

	public default Response getOpenAPI(
			Set<Class<?>> resourceClasses, String type, UriInfo uriInfo)
		throws Exception {

		return getOpenAPI(resourceClasses, type, uriInfo);
	}

	public Response getOpenAPI(
			String basePath, OpenAPISchemaFilter openAPISchemaFilter,
			Map<String, List<String>> parameters, Set<Class<?>> resourceClasses,
			String type)
		throws Exception;

	public Response getOpenAPI(
			String basePath, Set<Class<?>> resourceClasses, String type)
		throws Exception;

	public Response toResponse(OpenAPI openAPI, String type);

}