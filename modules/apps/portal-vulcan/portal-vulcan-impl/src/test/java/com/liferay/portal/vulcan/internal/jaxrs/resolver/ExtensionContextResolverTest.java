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

package com.liferay.portal.vulcan.internal.jaxrs.resolver;

import com.liferay.portal.test.rule.LiferayUnitTestRule;
import com.liferay.portal.vulcan.internal.jaxrs.context.resolver.ExtensionContextResolver;
import com.liferay.portal.vulcan.jaxrs.context.ExtensionContextRegistry;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

import org.mockito.Mockito;

/**
 * @author Javier de Arcos
 */
public class ExtensionContextResolverTest {

	@ClassRule
	@Rule
	public static final LiferayUnitTestRule liferayUnitTestRule =
		LiferayUnitTestRule.INSTANCE;

	@Test
	public void testGetContext() {
		ExtensionContextRegistry mockedExtensionContextRegistry = Mockito.mock(
			ExtensionContextRegistry.class);

		ExtensionContextResolver extensionContextResolver =
			new ExtensionContextResolver(mockedExtensionContextRegistry);

		extensionContextResolver.getContext(TestClass.class);

		Mockito.verify(
			mockedExtensionContextRegistry
		).getExtensionContext(
			Mockito.eq(TestClass.class.getName())
		);
	}

	private static class TestClass {
	}

}