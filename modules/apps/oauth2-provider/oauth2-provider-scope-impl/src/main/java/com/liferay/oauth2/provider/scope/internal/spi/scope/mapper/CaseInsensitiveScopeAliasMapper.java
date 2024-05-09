/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.oauth2.provider.scope.internal.spi.scope.mapper;

import com.liferay.oauth2.provider.scope.liferay.ScopeLocator;
import com.liferay.oauth2.provider.scope.spi.scope.mapper.ScopeAliasMapper;
import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.petra.string.StringUtil;

import java.util.Collection;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(service = ScopeAliasMapper.class)
public class CaseInsensitiveScopeAliasMapper implements ScopeAliasMapper {

	@Override
	public Collection<String> map(
		long companyId, Collection<String> scopeAliases) {

		Collection<String> companyIdScopeAliases =
			_scopeLocator.getScopeAliases(companyId);

		return TransformUtil.transform(
			scopeAliases,
			scopeAlias -> {
				if (!companyIdScopeAliases.contains(scopeAlias)) {
					for (String companyIdScopeAlias : companyIdScopeAliases) {
						if (StringUtil.equalsIgnoreCase(
								companyIdScopeAlias, scopeAlias)) {

							return companyIdScopeAlias;
						}
					}
				}

				return scopeAlias;
			});
	}

	@Reference
	private ScopeLocator _scopeLocator;

}