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
import com.liferay.oauth2.provider.scope.liferay.OAuth2ProviderScopeLiferayAccessControlContext;
import com.liferay.oauth2.provider.scope.liferay.ScopeContext;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.access.control.AccessControlUtil;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.security.auth.AccessControlContext;
import com.liferay.portal.kernel.security.auth.verifier.AuthVerifierResult;
import com.liferay.portal.kernel.security.service.access.policy.ServiceAccessPolicy;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.security.access.control.AccessControlAdvisor;
import com.liferay.portal.security.access.control.AccessControlAdvisorImpl;
import com.liferay.portal.vulcan.internal.graphql.constants.GraphQLConstants;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import graphql.schema.GraphQLType;

import graphql.servlet.GraphQLContext;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.ForbiddenException;
import javax.ws.rs.core.Application;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * @author Carlos Correa
 */
public abstract class BaseOAuth2DataFetcher implements DataFetcher<Object> {

	public BaseOAuth2DataFetcher(
		String applicationName, Bundle bundle, String httpMethod, Method method,
		ScopeChecker scopeChecker, ScopeContext scopeContext) {

		_applicationName = applicationName;
		_bundle = bundle;
		_httpMethod = httpMethod;
		this.method = method;
		_scopeChecker = scopeChecker;
		_scopeContext = scopeContext;
	}

	@Override
	public final Object get(DataFetchingEnvironment dataFetchingEnvironment)
		throws Exception {

		try {
			HttpServletRequest httpServletRequest = _getHttpServletRequest(
				dataFetchingEnvironment);

			GraphQLType graphQLType = dataFetchingEnvironment.getParentType();

			if (_graphQLNamespaces.contains(graphQLType.getName())) {
				_scopeContext.setApplicationName(_applicationName);
				_scopeContext.setBundle(_bundle);
				_scopeContext.setCompanyId(
					PortalUtil.getCompanyId(httpServletRequest));

				if (OAuth2ProviderScopeLiferayAccessControlContext.
						isOAuth2AuthVerified()) {

					_enableSAP();

					if (!_scopeChecker.checkScope(_httpMethod)) {
						throw new ForbiddenException();
					}
				}

				if (method != null) {
					_incrementServiceDepth();

					_accessControlAdvisor.accept(
						method, new Object[0], _NULL_ACCESS_CONTROLLED);
				}
			}

			return get(
				dataFetchingEnvironment, httpServletRequest,
				_getHttpServletResponse(dataFetchingEnvironment));
		}
		catch (InvocationTargetException invocationTargetException) {
			if (_log.isWarnEnabled()) {
				_log.warn(invocationTargetException);
			}

			throw new RuntimeException(
				invocationTargetException.getTargetException());
		}
		catch (Exception exception) {
			if (_log.isWarnEnabled()) {
				_log.warn(exception);
			}

			throw new RuntimeException(exception);
		}
	}

	public abstract Object get(
			DataFetchingEnvironment dataFetchingEnvironment,
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws Exception;

	protected Method method;

	private void _enableSAP() throws Exception {
		AccessControlContext accessControlContext =
			AccessControlUtil.getAccessControlContext();

		AuthVerifierResult authVerifierResult =
			accessControlContext.getAuthVerifierResult();

		if (authVerifierResult == null) {
			return;
		}

		Map<String, Object> settings = authVerifierResult.getSettings();

		List<String> serviceAccessPolicyNames =
			(List<String>)settings.computeIfAbsent(
				ServiceAccessPolicy.SERVICE_ACCESS_POLICY_NAMES,
				value -> new ArrayList<>());

		String policyName = _getPolicyName();

		if (!serviceAccessPolicyNames.contains(policyName)) {
			serviceAccessPolicyNames.add(policyName);
		}
	}

	private HttpServletRequest _getHttpServletRequest(
		DataFetchingEnvironment dataFetchingEnvironment) {

		GraphQLContext graphQLContext = dataFetchingEnvironment.getContext();

		Optional<HttpServletRequest> httpServletRequestOptional =
			graphQLContext.getHttpServletRequest();

		return httpServletRequestOptional.orElse(null);
	}

	private HttpServletResponse _getHttpServletResponse(
		DataFetchingEnvironment dataFetchingEnvironment) {

		GraphQLContext graphQLContext = dataFetchingEnvironment.getContext();

		Optional<HttpServletResponse> httpServletResponseOptional =
			graphQLContext.getHttpServletResponse();

		return httpServletResponseOptional.orElse(null);
	}

	private String _getPolicyName() throws Exception {
		BundleContext bundleContext = _bundle.getBundleContext();

		List<ServiceReference<Application>> serviceReferences =
			(List<ServiceReference<Application>>)
				bundleContext.getServiceReferences(
					Application.class,
					"(osgi.jaxrs.name=" + _applicationName + ")");

		if (ListUtil.isNotEmpty(serviceReferences)) {
			for (ServiceReference<?> serviceReference : serviceReferences) {
				String policyName = (String)serviceReference.getProperty(
					"oauth2.service.access.policy.name");

				if (!Validator.isBlank(policyName)) {
					return policyName;
				}
			}
		}

		return "AUTHORIZED_OAUTH2_SAP";
	}

	private void _incrementServiceDepth() {
		AccessControlContext accessControlContext =
			AccessControlUtil.getAccessControlContext();

		if (accessControlContext == null) {
			return;
		}

		Map<String, Object> settings = accessControlContext.getSettings();

		Integer serviceDepth = (Integer)settings.get(
			AccessControlContext.Settings.SERVICE_DEPTH.toString());

		if (serviceDepth == null) {
			serviceDepth = Integer.valueOf(1);
		}
		else {
			serviceDepth++;
		}

		settings.put(
			AccessControlContext.Settings.SERVICE_DEPTH.toString(),
			serviceDepth);
	}

	private static final AccessControlled _NULL_ACCESS_CONTROLLED =
		new AccessControlled() {

			@Override
			public Class<? extends Annotation> annotationType() {
				return AccessControlled.class;
			}

			@Override
			public boolean guestAccessEnabled() {
				return false;
			}

			@Override
			public boolean hostAllowedValidationEnabled() {
				return false;
			}

		};

	private static final Log _log = LogFactoryUtil.getLog(
		BaseOAuth2DataFetcher.class);

	private static final List<String> _graphQLNamespaces = Arrays.asList(
		GraphQLConstants.NAMESPACE_C, GraphQLConstants.NAMESPACE_MUTATION,
		GraphQLConstants.NAMESPACE_QUERY);

	private final AccessControlAdvisor _accessControlAdvisor =
		new AccessControlAdvisorImpl();
	private final String _applicationName;
	private final Bundle _bundle;
	private final String _httpMethod;
	private final ScopeChecker _scopeChecker;
	private final ScopeContext _scopeContext;

}