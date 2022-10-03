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

package com.liferay.portal.vulcan.internal.graphql.validation;

import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.servlet.ServletData;
import com.liferay.portal.vulcan.graphql.validation.GraphQLRequestContext;

import java.lang.reflect.Method;

import java.util.Objects;

import javax.ws.rs.HttpMethod;

/**
 * @author Carlos Correa
 */
public class ServletDataRequestContext implements GraphQLRequestContext {

	public ServletDataRequestContext(
		long companyId, String httpMethod, Method method,
		ServletData servletData) {

		_companyId = companyId;
		_httpMethod = httpMethod;
		_method = method;
		_servletData = servletData;

		_namespace = _getNamespace(servletData);
		_resourceClass = _getResourceClass(httpMethod, method, servletData);
		_resourceMethod = _getResourceMethod(httpMethod, method, servletData);
	}

	@Override
	public String getApplicationName() {
		return _servletData.getApplicationName();
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public Method getMethod() {
		return _method;
	}

	@Override
	public String getNamespace() {
		return _namespace;
	}

	@Override
	public Class<?> getResourceClass() {
		return _resourceClass;
	}

	@Override
	public Method getResourceMethod() {
		return _resourceMethod;
	}

	private String _getNamespace(ServletData servletData) {
		if (servletData.getGraphQLNamespace() == null) {
			return null;
		}

		return StringUtil.upperCaseFirstLetter(
			servletData.getGraphQLNamespace());
	}

	private Class<?> _getResourceClass(
		String httpMethod, Method method, ServletData servletData) {

		ObjectValuePair<Class<?>, String> resourceMethodPair =
			servletData.getResourceMethodPair(
				method.getName(), !Objects.equals(HttpMethod.GET, httpMethod));

		if (resourceMethodPair == null) {
			return null;
		}

		return resourceMethodPair.getKey();
	}

	private Method _getResourceMethod(
		String httpMethod, Method method, ServletData servletData) {

		ObjectValuePair<Class<?>, String> resourceMethodPair =
			servletData.getResourceMethodPair(
				method.getName(), !Objects.equals(HttpMethod.GET, httpMethod));

		if (resourceMethodPair == null) {
			return null;
		}

		Class<?> resourceClass = resourceMethodPair.getKey();

		for (Method resourceMethod : resourceClass.getMethods()) {
			if (Objects.equals(
					resourceMethod.getName(), resourceMethodPair.getValue())) {

				return resourceMethod;
			}
		}

		return null;
	}

	private final long _companyId;
	private final String _httpMethod;
	private final Method _method;
	private final String _namespace;
	private final Class<?> _resourceClass;
	private final Method _resourceMethod;
	private final ServletData _servletData;

}