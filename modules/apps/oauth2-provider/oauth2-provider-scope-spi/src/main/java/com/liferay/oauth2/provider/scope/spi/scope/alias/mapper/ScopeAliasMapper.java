/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.oauth2.provider.scope.spi.scope.alias.mapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Carlos Correa
 */
@ProviderType
public interface ScopeAliasMapper {

	public static final ScopeAliasMapper PASS_THROUGH_SCOPE_ALIAS_MAPPER =
		scopeAlias -> scopeAlias;

	public String map(String scopeAlias);

}