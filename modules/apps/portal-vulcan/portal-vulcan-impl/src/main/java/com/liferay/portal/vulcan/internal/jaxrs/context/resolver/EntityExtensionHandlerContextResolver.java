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

package com.liferay.portal.vulcan.internal.jaxrs.context.resolver;

import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.vulcan.extension.ClassNameSupplier;
import com.liferay.portal.vulcan.extension.ExtensionProviderRegistry;
import com.liferay.portal.vulcan.internal.extension.EntityExtensionHandler;
import com.liferay.portal.vulcan.internal.extension.util.ExtensionUtil;

import javax.ws.rs.core.Context;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import java.util.Optional;

/**
 * @author Javier de Arcos
 */
@Provider
public class EntityExtensionHandlerContextResolver
	implements ContextResolver<EntityExtensionHandler> {

	public EntityExtensionHandlerContextResolver(
		ExtensionProviderRegistry extensionProviderRegistry) {

		_extensionProviderRegistry = extensionProviderRegistry;
	}

	@Override
	public EntityExtensionHandler getContext(Class<?> clazz) {
		String className = _classNameSupplier.getClassName();

		if (className == null) {
			className = clazz.getName();
		}

		return ExtensionUtil.getEntityExtensionHandler(
			className, _company.getCompanyId(), _extensionProviderRegistry);
	}

	@Context
	private ClassNameSupplier _classNameSupplier;

	@Context
	private Company _company;

	private final ExtensionProviderRegistry _extensionProviderRegistry;

}