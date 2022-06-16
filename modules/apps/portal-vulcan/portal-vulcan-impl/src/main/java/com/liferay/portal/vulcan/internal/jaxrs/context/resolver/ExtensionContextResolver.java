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

import com.liferay.portal.vulcan.jaxrs.context.ExtensionContext;
import com.liferay.portal.vulcan.jaxrs.context.ExtensionContextRegistry;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

/**
 * @author Javier de Arcos
 */
@Provider
public class ExtensionContextResolver
	implements ContextResolver<ExtensionContext> {

	public ExtensionContextResolver(
		ExtensionContextRegistry extensionContextRegistry) {

		_extensionContextRegistry = extensionContextRegistry;
	}

	@Override
	public ExtensionContext getContext(Class<?> clazz) {
		return _extensionContextRegistry.getExtensionContext(clazz.getName());
	}

	private final ExtensionContextRegistry _extensionContextRegistry;

}