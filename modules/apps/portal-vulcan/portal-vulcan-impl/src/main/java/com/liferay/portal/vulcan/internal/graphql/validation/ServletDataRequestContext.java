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

import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.servlet.ServletData;
import com.liferay.portal.vulcan.graphql.validation.GraphQLRequestContext;

import javax.ws.rs.HttpMethod;
import java.lang.reflect.Method;
import java.util.Objects;

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
	public String getHttpMethod() {
		return _httpMethod;
	}

	@Override
	public Method getMethod() {
		return _method;
	}

	@Override
	public String getNamespace() {
		if (_servletData.getGraphQLNamespace() == null) {
			return null;
		}

		return StringUtil.upperCaseFirstLetter(
			_servletData.getGraphQLNamespace());
	}

	@Override
	public Class<?> getResourceClass() {
		String resourceMethod = _servletData.getResourceMethod(_method.getName(), Objects.equals(
			HttpMethod.GET, _httpMethod));

		if (resourceMethod == null) {
			return null;
		}

		try {
			return Class.forName(resourceMethod.substring(0, resourceMethod.indexOf("#")));
		}
		catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	private final long _companyId;
	private final String _httpMethod;
	private final Method _method;
	private final ServletData _servletData;

}