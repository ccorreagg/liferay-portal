/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.dto.converter.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.test.TestInfo;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.HashMapDictionaryBuilder;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterRegistry;

import java.util.Set;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceRegistration;

/**
 * @author Carlos Correa
 */
@RunWith(Arquillian.class)
public class DTOConverterRegistryTest {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() {
		Bundle bundle = FrameworkUtil.getBundle(DTOConverterRegistryTest.class);

		_bundleContext = bundle.getBundleContext();
	}

	@Test
	public void testGetDTOClassNames() throws Exception {
		String dtoClassName = RandomTestUtil.randomString();

		Set<String> dtoClassNames = _dtoConverterRegistry.getDTOClassNames();

		Assert.assertFalse(dtoClassNames.contains(dtoClassName));

		try (AutoCloseable autoCloseable = _registerDTOConverter(
				null, null, dtoClassName, new TestDTOConverter(), null)) {

			dtoClassNames = _dtoConverterRegistry.getDTOClassNames();

			Assert.assertTrue(dtoClassNames.contains(dtoClassName));
		}
	}

	@Test
	@TestInfo("LPD-57341")
	public void testGetDTOConverterWithApplicationNameDefaultDTOClassNameAndVersionProperties()
		throws Exception {

		String applicationName = RandomTestUtil.randomString();
		String dtoClassName = RandomTestUtil.randomString();
		DTOConverter<?, ?> dtoConverter = new TestDTOConverter();
		String version = RandomTestUtil.randomString();

		try (AutoCloseable autoCloseable1 = _registerDTOConverter(
				applicationName, null, dtoClassName, new TestDTOConverter(),
				version);
			AutoCloseable autoCloseable2 = _registerDTOConverter(
				applicationName, false, dtoClassName, new TestDTOConverter(),
				version);
			AutoCloseable autoCloseable3 = _registerDTOConverter(
				applicationName, true, dtoClassName, dtoConverter, version)) {

			Assert.assertSame(
				dtoConverter,
				_dtoConverterRegistry.getDTOConverter(dtoClassName));

			Assert.assertSame(
				dtoConverter,
				_dtoConverterRegistry.getDTOConverter(
					applicationName, dtoClassName, version));
		}
	}

	@Test
	public void testGetDTOConverterWithApplicationNameDTOClassNameAndVersionProperties()
		throws Exception {

		String applicationName = RandomTestUtil.randomString();
		String dtoClassName = RandomTestUtil.randomString();
		DTOConverter<?, ?> dtoConverter = new TestDTOConverter();
		String version = RandomTestUtil.randomString();

		try (AutoCloseable autoCloseable = _registerDTOConverter(
				applicationName, null, dtoClassName, dtoConverter, version)) {

			Assert.assertSame(
				dtoConverter,
				_dtoConverterRegistry.getDTOConverter(dtoClassName));

			Assert.assertSame(
				dtoConverter,
				_dtoConverterRegistry.getDTOConverter(
					applicationName, dtoClassName, version));
		}
	}

	@Test
	@TestInfo("LPD-57341")
	public void testGetDTOConverterWithDefaultAndDTOClassNameProperties()
		throws Exception {

		String dtoClassName = RandomTestUtil.randomString();
		DTOConverter<?, ?> dtoConverter = new TestDTOConverter();

		try (AutoCloseable autoCloseable1 = _registerDTOConverter(
				null, null, dtoClassName, new TestDTOConverter(), null);
			AutoCloseable autoCloseable2 = _registerDTOConverter(
				null, false, dtoClassName, new TestDTOConverter(), null);
			AutoCloseable autoCloseable3 = _registerDTOConverter(
				null, true, dtoClassName, dtoConverter, null)) {

			Assert.assertSame(
				dtoConverter,
				_dtoConverterRegistry.getDTOConverter(dtoClassName));
		}
	}

	@Test
	public void testGetDTOConverterWithDTOClassNameProperty() throws Exception {
		String dtoClassName = RandomTestUtil.randomString();

		Assert.assertNull(_dtoConverterRegistry.getDTOConverter(dtoClassName));

		DTOConverter<?, ?> dtoConverter = new TestDTOConverter();

		try (AutoCloseable autoCloseable = _registerDTOConverter(
				null, null, dtoClassName, dtoConverter, null)) {

			Assert.assertSame(
				dtoConverter,
				_dtoConverterRegistry.getDTOConverter(dtoClassName));
		}
	}

	private AutoCloseable _registerDTOConverter(
		String applicationName, Boolean defaultDTOConverter,
		String dtoClassName, DTOConverter<?, ?> dtoConverter, String version) {

		ServiceRegistration<DTOConverter<?, ?>> serviceRegistration =
			_bundleContext.registerService(
				(Class<DTOConverter<?, ?>>)(Class<?>)DTOConverter.class,
				dtoConverter,
				HashMapDictionaryBuilder.put(
					"application.name", () -> applicationName
				).put(
					"default",
					() -> {
						if (defaultDTOConverter == null) {
							return null;
						}

						return defaultDTOConverter.toString();
					}
				).put(
					"dto.class.name", dtoClassName
				).put(
					"version", () -> version
				).build());

		return serviceRegistration::unregister;
	}

	private static BundleContext _bundleContext;

	@Inject
	private DTOConverterRegistry _dtoConverterRegistry;

	private static class TestDTOConverter
		implements DTOConverter<Object, Object> {

		@Override
		public String getContentType() {
			return "";
		}

	}

}