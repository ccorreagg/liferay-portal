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

package com.liferay.api.builder.internal.servlet;

import com.liferay.api.builder.constants.APIBuilderConstants;
import com.liferay.api.builder.internal.handler.GETHttpServletRequestHandler;
import com.liferay.api.builder.registry.APIBuilderOpenAPIRegistry;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.vulcan.yaml.openapi.PathItem;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Matija Petanjek
 */
@Component(
	property = {
		"osgi.http.whiteboard.context.path=" + APIBuilderConstants.SERVLET_PATH,
		"osgi.http.whiteboard.servlet.name=com.liferay.api.builder.internal.servlet.ApiBuilderServlet",
		"osgi.http.whiteboard.servlet.pattern=" + APIBuilderConstants.SERVLET_PATH + "/*"
	},
	service = Servlet.class
)
public class APIBuilderServlet extends HttpServlet {

	@Override
	protected void doGet(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws IOException, ServletException {

		Map.Entry<Pattern, Map.Entry<String, PathItem>> pathItem =
			_apiBuilderOpenAPIRegistry.getPathItem(
				httpServletRequest.getRequestURI());

		GETHttpServletRequestHandler getHttpServletRequestHandler =
			new GETHttpServletRequestHandler();

		httpServletResponse.setContentType(ContentTypes.APPLICATION_JSON);
		httpServletResponse.setCharacterEncoding(StringPool.UTF8);
		httpServletResponse.setStatus(HttpServletResponse.SC_OK);

		PrintWriter printWriter = httpServletResponse.getWriter();

		printWriter.print(
			getHttpServletRequestHandler.handle(httpServletRequest, pathItem));
		printWriter.flush();
	}

	@Reference
	private APIBuilderOpenAPIRegistry _apiBuilderOpenAPIRegistry;

}