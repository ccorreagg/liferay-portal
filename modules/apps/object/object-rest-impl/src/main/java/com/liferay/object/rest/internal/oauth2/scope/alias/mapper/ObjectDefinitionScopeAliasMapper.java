/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.rest.internal.oauth2.scope.alias.mapper;

import com.liferay.oauth2.provider.scope.spi.scope.alias.mapper.ScopeAliasMapper;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.StringUtil;

/**
 * @author Carlos Correa
 */
public class ObjectDefinitionScopeAliasMapper implements ScopeAliasMapper {

	public ObjectDefinitionScopeAliasMapper(ObjectDefinition objectDefinition) {
		_objectDefinition = objectDefinition;
	}

	@Override
	public String map(String scopeAlias) {
		if (StringUtil.startsWith(
				scopeAlias, _objectDefinition.getName() + StringPool.PERIOD)) {

			return StringUtil.replaceFirst(
				scopeAlias, _objectDefinition.getName(),
				_objectDefinition.getOSGiJaxRsName());
		}

		return scopeAlias;
	}

	private final ObjectDefinition _objectDefinition;

}