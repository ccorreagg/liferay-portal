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

package com.liferay.portal.vulcan.internal.jaxrs.writer.interceptor;

import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.internal.jaxrs.extension.ExtendedEntity;
import com.liferay.portal.vulcan.jaxrs.context.ExtensionContext;

import java.io.IOException;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.Providers;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;

/**
 * @author Javier de Arcos
 */
@Provider
public class EntityExtensionWriterInterceptor implements WriterInterceptor {

	@Override
	public void aroundWriteTo(WriterInterceptorContext writerInterceptorContext)
		throws IOException {

		Optional.ofNullable(
			_providers.getContextResolver(
				ExtensionContext.class, writerInterceptorContext.getMediaType())
		).map(
			contextResolver -> contextResolver.getContext(
				writerInterceptorContext.getType())
		).ifPresent(
			extensionContext -> _extendEntity(
				extensionContext, writerInterceptorContext)
		);

		writerInterceptorContext.proceed();
	}

	private void _extendEntity(
		ExtensionContext extensionContext,
		WriterInterceptorContext writerInterceptorContext) {

		extensionContext.setContextAcceptLanguage(_contextAcceptLanguage);
		extensionContext.setContextCompany(_contextCompany);
		extensionContext.setContextHttpServletRequest(
			_contextHttpServletRequest);
		extensionContext.setContextUriInfo(_contextUriInfo);
		extensionContext.setContextUser(_contextUser);

		writerInterceptorContext.setEntity(
			ExtendedEntity.extend(
				writerInterceptorContext.getEntity(),
				extensionContext.getExtendedProperties(
					writerInterceptorContext.getEntity()),
				extensionContext.getFilteredPropertyKeys(
					writerInterceptorContext.getEntity())));

		writerInterceptorContext.setGenericType(ExtendedEntity.class);
	}

	@Context
	private AcceptLanguage _contextAcceptLanguage;

	@Context
	private Company _contextCompany;

	@Context
	private HttpServletRequest _contextHttpServletRequest;

	@Context
	private UriInfo _contextUriInfo;

	@Context
	private User _contextUser;

	@Context
	private Providers _providers;

}