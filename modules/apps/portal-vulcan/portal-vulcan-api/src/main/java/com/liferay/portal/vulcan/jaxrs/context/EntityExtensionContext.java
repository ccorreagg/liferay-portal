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

package com.liferay.portal.vulcan.jaxrs.context;

import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;

import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import javax.ws.rs.core.UriInfo;

/**
 * @author Javier de Arcos
 */
public abstract class EntityExtensionContext<T> implements ExtensionContext {

	public abstract Map<String, Object> getEntityExtendedProperties(T entity);

	public abstract Set<String> getEntityFilteredPropertyKeys(T entity);

	@Override
	public Map<String, Object> getExtendedProperties(Object object) {
		return getEntityExtendedProperties(_toEntity(object));
	}

	@Override
	public Set<String> getFilteredPropertyKeys(Object object) {
		return getEntityFilteredPropertyKeys(_toEntity(object));
	}

	public void setContextAcceptLanguage(AcceptLanguage acceptLanguage) {
		contextAcceptLanguage = acceptLanguage;
	}

	public void setContextCompany(Company company) {
		contextCompany = company;
	}

	public void setContextHttpServletRequest(
		HttpServletRequest httpServletRequest) {

		contextHttpServletRequest = httpServletRequest;
	}

	public void setContextUriInfo(UriInfo uriInfo) {
		contextUriInfo = uriInfo;
	}

	public void setContextUser(User user) {
		contextUser = user;
	}

	public abstract void setEntityExtendedProperties(
		T entity, Map<String, Object> extendedProperties);

	@Override
	public void setExtendedProperties(
		Object object, Map<String, Object> extendedProperties) {

		setEntityExtendedProperties(_toEntity(object), extendedProperties);
	}

	protected AcceptLanguage contextAcceptLanguage;
	protected Company contextCompany;
	protected HttpServletRequest contextHttpServletRequest;
	protected UriInfo contextUriInfo;
	protected User contextUser;

	private T _toEntity(Object object) {
		try {
			T entity = (T)object;

			if (entity == null) {
				throw new IllegalArgumentException(
					"Invalid object type " + object.getClass());
			}

			return entity;
		}
		catch (ClassCastException classCastException) {
			throw new IllegalArgumentException(
				"Invalid object type " + object.getClass(), classCastException);
		}
	}

}