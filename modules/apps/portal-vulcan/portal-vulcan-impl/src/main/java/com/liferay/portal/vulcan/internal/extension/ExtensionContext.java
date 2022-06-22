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

package com.liferay.portal.vulcan.internal.extension;

import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import javax.ws.rs.core.UriInfo;

/**
 * @author Javier de Arcos
 */
public class ExtensionContext {

	public ExtensionContext(
		AcceptLanguage acceptLanguage, Company company,
		Map<String, Object> extendedProperties,
		ExtensionProviders extensionProviders,
		HttpServletRequest httpServletRequest, UriInfo uriInfo, User user) {

		_acceptLanguage = acceptLanguage;
		_company = company;
		_extendedProperties = extendedProperties;
		_extensionProviders = extensionProviders;
		_httpServletRequest = httpServletRequest;
		_uriInfo = uriInfo;
		_user = user;
	}

	public AcceptLanguage getAcceptLanguage() {
		return _acceptLanguage;
	}

	public Company getCompany() {
		return _company;
	}

	public Map<String, Object> getExtendedProperties() {
		return _extendedProperties;
	}

	public ExtensionProviders getExtensionProviders() {
		return _extensionProviders;
	}

	public HttpServletRequest getHttpServletRequest() {
		return _httpServletRequest;
	}

	public UriInfo getUriInfo() {
		return _uriInfo;
	}

	public User getUser() {
		return _user;
	}

	public static class Builder {

		public ExtensionContext build() {
			return new ExtensionContext(
				_acceptLanguage, _company, _extendedProperties,
				_extensionProviders, _httpServletRequest, _uriInfo, _user);
		}

		public void setAcceptLanguage(AcceptLanguage acceptLanguage) {
			_acceptLanguage = acceptLanguage;
		}

		public void setCompany(Company company) {
			_company = company;
		}

		public void setExtendedProperties(
			Map<String, Object> extendedProperties) {

			_extendedProperties = extendedProperties;
		}

		public void setExtensionProviders(
			ExtensionProviders extensionProviders) {

			_extensionProviders = extensionProviders;
		}

		public void setHttpServletRequest(
			HttpServletRequest httpServletRequest) {

			_httpServletRequest = httpServletRequest;
		}

		public void setUriInfo(UriInfo uriInfo) {
			_uriInfo = uriInfo;
		}

		public void setUser(User user) {
			_user = user;
		}

		private AcceptLanguage _acceptLanguage;
		private Company _company;
		private Map<String, Object> _extendedProperties;
		private ExtensionProviders _extensionProviders;
		private HttpServletRequest _httpServletRequest;
		private UriInfo _uriInfo;
		private User _user;

	}

	private final AcceptLanguage _acceptLanguage;
	private final Company _company;
	private final Map<String, Object> _extendedProperties;
	private final ExtensionProviders _extensionProviders;
	private final HttpServletRequest _httpServletRequest;
	private final UriInfo _uriInfo;
	private final User _user;

}