/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.rest.internal.deployer;

import com.liferay.oauth2.provider.scope.spi.prefix.handler.PrefixHandler;
import com.liferay.oauth2.provider.scope.spi.prefix.handler.PrefixHandlerFactory;
import com.liferay.object.model.ObjectDefinition;

import java.util.function.Function;

/**
 * @author Carlos Correa
 */
public class ObjectDefinitionPrefixHandlerFactory
	implements PrefixHandlerFactory {

	public ObjectDefinitionPrefixHandlerFactory(
		ObjectDefinition objectDefinition) {

		_objectDefinition = objectDefinition;
	}

	@Override
	public PrefixHandler create(
		Function<String, Object> propertyAccessorFunction) {

		return input -> _objectDefinition.getName() + "." + input;
	}

	private final ObjectDefinition _objectDefinition;

}