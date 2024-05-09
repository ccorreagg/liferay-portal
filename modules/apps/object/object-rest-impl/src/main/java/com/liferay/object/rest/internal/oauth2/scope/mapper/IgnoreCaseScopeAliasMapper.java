/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.rest.internal.oauth2.scope.mapper;

import com.liferay.oauth2.provider.scope.liferay.ScopeLocator;
import com.liferay.oauth2.provider.scope.spi.scope.mapper.ScopeAliasMapper;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.petra.string.StringUtil;

import java.util.Collection;

/**
 * @author Carlos Correa
 */
public class IgnoreCaseScopeAliasMapper implements ScopeAliasMapper {

	public IgnoreCaseScopeAliasMapper(
		ObjectDefinition objectDefinition, ScopeLocator scopeLocator) {

		_objectDefinition = objectDefinition;
		_scopeLocator = scopeLocator;
	}

	@Override
	public Collection<String> map(Collection<String> scopeAliases) {
		Collection<String> objectDefinitionScopeAliases =
			_scopeLocator.getScopeAliases(
				_objectDefinition.getCompanyId(),
				_objectDefinition.getOSGiJaxRsName());

		return TransformUtil.transform(
			scopeAliases,
			scopeAlias -> {
				if (!objectDefinitionScopeAliases.contains(scopeAlias)) {
					for (String objectDefinitionScopeAlias :
							objectDefinitionScopeAliases) {

						if (StringUtil.equalsIgnoreCase(
								objectDefinitionScopeAlias, scopeAlias)) {

							return objectDefinitionScopeAlias;
						}
					}
				}

				return scopeAlias;
			});
	}

	private final ObjectDefinition _objectDefinition;
	private final ScopeLocator _scopeLocator;

}