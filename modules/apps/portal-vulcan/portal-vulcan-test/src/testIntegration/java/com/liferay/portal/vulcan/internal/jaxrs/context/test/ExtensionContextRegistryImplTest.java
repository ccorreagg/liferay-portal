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

package com.liferay.portal.vulcan.internal.jaxrs.context.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.util.HashMapDictionaryBuilder;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.jaxrs.context.EntityExtensionContext;
import com.liferay.portal.vulcan.jaxrs.context.ExtensionContext;
import com.liferay.portal.vulcan.jaxrs.context.ExtensionContextRegistry;

import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceRegistration;

/**
 * @author Javier de Arcos
 */
@RunWith(Arquillian.class)
public class ExtensionContextRegistryImplTest {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@Before
	public void setUp() throws Exception {
		Bundle bundle = FrameworkUtil.getBundle(
			ExtensionContextRegistryImplTest.class);

		BundleContext bundleContext = bundle.getBundleContext();

		_serviceRegistration = bundleContext.registerService(
			ExtensionContext.class, _testEntityExtensionContext,
			HashMapDictionaryBuilder.<String, Object>put(
				"extension.context.class.name", TestEntity.class.getName()
			).build());
	}

	@After
	public void tearDown() {
		_serviceRegistration.unregister();
	}

	@Test
	public void testGetExtensionContext() {
		ExtensionContext extensionContext =
			_extensionContextRegistry.getExtensionContext(
				TestEntity.class.getName());

		Assert.assertEquals(_testEntityExtensionContext, extensionContext);

		extensionContext = _extensionContextRegistry.getExtensionContext(
			"NonExistentClassName");

		Assert.assertNull(extensionContext);
	}

	@Inject
	private ExtensionContextRegistry _extensionContextRegistry;

	private ServiceRegistration<ExtensionContext> _serviceRegistration;
	private final TestEntityExtensionContext _testEntityExtensionContext =
		new TestEntityExtensionContext();

	private static class TestEntity {
	}

	private static class TestEntityExtensionContext
		extends EntityExtensionContext<TestEntity> {

		@Override
		public Map<String, Object> getEntityExtendedProperties(
			TestEntity entity) {

			return null;
		}

		@Override
		public Set<String> getEntityFilteredPropertyKeys(TestEntity entity) {
			return null;
		}

		@Override
		public void setEntityExtendedProperties(
			TestEntity entity, Map<String, Object> extendedProperties) {
		}

	}

}