/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.rest.internal.oauth2.scope.mapper.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.oauth2.provider.scope.spi.scope.mapper.ScopeAliasMapper;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.rest.internal.odata.entity.v1_0.test.ObjectEntryEntityModelTest;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.test.util.ObjectDefinitionTestUtil;
import com.liferay.osgi.service.tracker.collections.list.ServiceTrackerList;
import com.liferay.osgi.service.tracker.collections.list.ServiceTrackerListFactory;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import java.util.Collection;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * @author Carlos Correa
 */
@RunWith(Arquillian.class)
public class IgnoreCaseScopeAliasMapperTest {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@Test
	public void test() throws Exception {
		Bundle bundle = FrameworkUtil.getBundle(
			ObjectEntryEntityModelTest.class);

		try (ServiceTrackerList<ScopeAliasMapper> serviceTrackerList =
				ServiceTrackerListFactory.open(
					bundle.getBundleContext(), ScopeAliasMapper.class)) {

			int initialCount = serviceTrackerList.size();

			String name = "X" + RandomTestUtil.randomString();

			ObjectDefinition objectDefinition =
				ObjectDefinitionTestUtil.addCustomObjectDefinition(
					name, _objectDefinitionLocalService);

			Assert.assertEquals(
				serviceTrackerList.toString(), initialCount,
				serviceTrackerList.size());

			String scopeAlias = objectDefinition.getName() + ".everything";

			Collection<String> scopeAliases = SetUtil.fromArray(scopeAlias);

			for (ScopeAliasMapper scopeAliasMapper : serviceTrackerList) {
				scopeAliases = scopeAliasMapper.map(scopeAliases);
			}

			Assert.assertEquals(
				SetUtil.fromArray(scopeAlias),
				SetUtil.fromCollection(scopeAliases));

			_objectDefinitionLocalService.publishCustomObjectDefinition(
				TestPropsValues.getUserId(),
				objectDefinition.getObjectDefinitionId());

			Assert.assertEquals(
				serviceTrackerList.toString(), initialCount + 1,
				serviceTrackerList.size());

			for (ScopeAliasMapper scopeAliasMapper : serviceTrackerList) {
				scopeAliases = scopeAliasMapper.map(scopeAliases);
			}

			Assert.assertEquals(
				SetUtil.fromArray(StringUtil.toLowerCase(scopeAlias)),
				SetUtil.fromCollection(scopeAliases));
		}
	}

	@Inject
	private ObjectDefinitionLocalService _objectDefinitionLocalService;

}