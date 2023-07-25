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

package com.liferay.headless.builder.internal.application.resource;

import com.liferay.headless.builder.application.APIApplication;
import com.liferay.headless.builder.internal.helper.ObjectEntryHelper;
import com.liferay.headless.builder.internal.util.PathUtil;
import com.liferay.portal.kernel.exception.NoSuchModelException;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.pagination.Pagination;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

/**
 * @author Luis Miguel Barcos
 */
public class HeadlessBuilderResourceImpl {

	public HeadlessBuilderResourceImpl(ObjectEntryHelper objectEntryHelper) {
		_objectEntryHelper = objectEntryHelper;
	}

	@GET
	@Path("{any: .*}")
	@Produces({"application/json", "application/xml"})
	public Response get(
			@QueryParam("filter") String filterString,
			@Context Pagination pagination)
		throws Exception {

		String endpointPath = StringUtil.removeSubstring(
			PathUtil.sanitize(contextHttpServletRequest.getRequestURI()),
			contextAPIApplication.getBaseURL());

		for (APIApplication.Endpoint endpoint :
				contextAPIApplication.getEndpoints()) {

			if (Objects.equals(endpoint.getPath(), endpointPath)) {
				if (endpoint.getResponseSchema() == null) {
					return Response.noContent(
					).build();
				}

				return Response.ok(
					_objectEntryHelper.getResponseEntityMapsPage(
						contextCompany.getCompanyId(), endpoint, filterString,
						pagination)
				).build();
			}
		}

		throw new NoSuchModelException(
			String.format(
				"Endpoint %s does not exist for %s", endpointPath,
				contextAPIApplication.getTitle()));
	}

	@Context
	protected APIApplication contextAPIApplication;

	@Context
	protected Company contextCompany;

	@Context
	protected HttpServletRequest contextHttpServletRequest;

	private final ObjectEntryHelper _objectEntryHelper;

}