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

package com.liferay.portal.vulcan.internal.graphql.data.fetcher;

import com.liferay.oauth2.provider.scope.ScopeChecker;
import com.liferay.oauth2.provider.scope.liferay.ScopeContext;
import com.liferay.portal.vulcan.internal.graphql.data.processor.LiferayMethodDataFetchingProcessor;

import graphql.schema.DataFetchingEnvironment;
import graphql.schema.GraphQLFieldDefinition;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.framework.Bundle;

/**
 * @author Carlos Correa
 */
public class LiferayMethodDataFetcher extends BaseOAuth2DataFetcher {

	public LiferayMethodDataFetcher(
		String applicationName, Bundle bundle, String httpMethod,
		LiferayMethodDataFetchingProcessor liferayMethodDataFetchingProcessor,
		Method method, ScopeChecker scopeChecker, ScopeContext scopeContext) {

		super(
			applicationName, bundle, httpMethod, method, scopeChecker,
			scopeContext);

		_liferayMethodDataFetchingProcessor =
			liferayMethodDataFetchingProcessor;
	}

	@Override
	public Object get(
			DataFetchingEnvironment dataFetchingEnvironment,
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws Exception {

		GraphQLFieldDefinition graphQLFieldDefinition =
			dataFetchingEnvironment.getFieldDefinition();

		return _liferayMethodDataFetchingProcessor.process(
			dataFetchingEnvironment.getArguments(),
			graphQLFieldDefinition.getName(), httpServletRequest,
			httpServletResponse, method, dataFetchingEnvironment.getRoot(),
			dataFetchingEnvironment.getSource());
	}

	private final LiferayMethodDataFetchingProcessor
		_liferayMethodDataFetchingProcessor;

}