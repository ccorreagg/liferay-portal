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

package com.liferay.object.rest.internal.jaxrs.context.provider;

import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.rest.internal.deployer.ObjectDefinitionDeployerImpl;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.vulcan.extension.ClassNameSupplier;

import javax.ws.rs.ext.Provider;

import org.apache.cxf.jaxrs.ext.ContextProvider;
import org.apache.cxf.message.Message;

/**
 * @author Carlos Correa
 */
@Provider
public class ClassNameSupplierContextProvider
	implements ContextProvider<ClassNameSupplier> {

	public ClassNameSupplierContextProvider(
		ObjectDefinitionDeployerImpl objectDefinitionDeployerImpl,
		Portal portal) {

		_objectDefinitionDeployerImpl = objectDefinitionDeployerImpl;
		_portal = portal;
	}

	@Override
	public ClassNameSupplier createContext(Message message) {
		return () -> {
			ObjectDefinitionContextProvider objectDefinitionContextProvider =
				new ObjectDefinitionContextProvider(
					_objectDefinitionDeployerImpl, _portal);

			ObjectDefinition objectDefinition =
				objectDefinitionContextProvider.createContext(message);

			return ObjectDefinition.class.getName() + "#" +
				objectDefinition.getObjectDefinitionId();
		};
	}

	private final ObjectDefinitionDeployerImpl _objectDefinitionDeployerImpl;
	private final Portal _portal;

}