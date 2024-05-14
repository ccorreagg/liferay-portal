/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.oauth2.provider.scope.internal.model.listener;

import com.liferay.oauth2.provider.model.OAuth2ScopeGrant;
import com.liferay.oauth2.provider.scope.internal.constants.OAuth2ProviderScopeConstants;
import com.liferay.oauth2.provider.scope.spi.scope.alias.mapper.ScopeAliasMapper;
import com.liferay.osgi.service.tracker.collections.map.ScopedServiceTrackerMap;
import com.liferay.osgi.service.tracker.collections.map.ScopedServiceTrackerMapFactory;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;

import java.util.ArrayList;
import java.util.List;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

/**
 * @author Carlos Correa
 */
@Component(service = ModelListener.class)
public class OAuth2ScopeGrantModelListener
	extends BaseModelListener<OAuth2ScopeGrant> {

	@Override
	public void onBeforeCreate(OAuth2ScopeGrant oAuth2ScopeGrant)
		throws ModelListenerException {

		ScopeAliasMapper scopeAliasMapper =
			_scopeAliasMapperFactoryScopedServiceTrackerMap.getService(
				oAuth2ScopeGrant.getCompanyId(),
				oAuth2ScopeGrant.getApplicationName());

		List<String> scopeAliases = new ArrayList<>();

		for (String scopeAlias : oAuth2ScopeGrant.getScopeAliasesList()) {
			scopeAliases.add(scopeAliasMapper.map(scopeAlias));
		}

		oAuth2ScopeGrant.setScopeAliasesList(scopeAliases);
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_scopeAliasMapperFactoryScopedServiceTrackerMap =
			ScopedServiceTrackerMapFactory.create(
				bundleContext, ScopeAliasMapper.class,
				OAuth2ProviderScopeConstants.OSGI_JAXRS_NAME,
				() -> ScopeAliasMapper.PASS_THROUGH_SCOPE_ALIAS_MAPPER);
	}

	@Deactivate
	protected void deactivate() {
		_scopeAliasMapperFactoryScopedServiceTrackerMap.close();
	}

	private ScopedServiceTrackerMap<ScopeAliasMapper>
		_scopeAliasMapperFactoryScopedServiceTrackerMap;

}