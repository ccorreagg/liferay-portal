/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.rest.internal.oauth2.scope.alias.mapper;

import com.liferay.oauth2.provider.scope.liferay.ScopeLocator;
import com.liferay.oauth2.provider.scope.spi.scope.alias.mapper.ScopeAliasMapper;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.portal.kernel.util.StringUtil;

import java.util.Collection;

/**
 * @author Carlos Correa
 */
public class ObjectDefinitionScopeAliasMapper implements ScopeAliasMapper {

	public ObjectDefinitionScopeAliasMapper(
		ObjectDefinition objectDefinition, ScopeLocator scopeLocator) {

		_objectDefinition = objectDefinition;
		_scopeLocator = scopeLocator;
	}

	@Override
	public String map(String scopeAlias) {
		if ((scopeAlias == null) ||
			!scopeAlias.contains(_objectDefinition.getName())) {

			return scopeAlias;
		}

		Collection<String> scopeAliases = _scopeLocator.getScopeAliases(
			_objectDefinition.getCompanyId(),
			_objectDefinition.getOSGiJaxRsName());

		if (scopeAliases.contains(scopeAlias)) {
			return scopeAlias;
		}

		String updatedScopeAlias = StringUtil.replaceFirst(
			scopeAlias, _objectDefinition.getName(),
			_objectDefinition.getOSGiJaxRsName());

		if (!scopeAliases.contains(updatedScopeAlias)) {
			return scopeAlias;
		}

		return updatedScopeAlias;
	}

	private final ObjectDefinition _objectDefinition;
	private final ScopeLocator _scopeLocator;

}