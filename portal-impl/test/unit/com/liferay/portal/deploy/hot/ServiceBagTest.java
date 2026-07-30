/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.deploy.hot;

import com.liferay.portal.kernel.module.util.SystemBundleUtil;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.spring.aop.AopCacheManager;
import com.liferay.portal.spring.aop.AopInvocationHandler;
import com.liferay.portal.test.rule.LiferayUnitTestRule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Carlos Correa
 */
public class ServiceBagTest {

	@ClassRule
	@Rule
	public static final LiferayUnitTestRule liferayUnitTestRule =
		LiferayUnitTestRule.INSTANCE;

	@Before
	public void setUp() {
		_testService = new TestServiceImpl();

		_aopInvocationHandler = AopCacheManager.create(_testService, null);

		_executorService = Executors.newFixedThreadPool(2);
	}

	@After
	public void tearDown() {
		AopCacheManager.destroy(_aopInvocationHandler);

		_executorService.shutdownNow();
	}

	@Test
	public void testConcurrentRegistrationAndReplacement() throws Exception {
		for (int i = 0; i < _ITERATIONS; i++) {
			_aopInvocationHandler.setTarget(_testService);

			ServiceWrapper<TestService> serviceWrapper1 =
				new TestServiceWrapper();

			ServiceBag<TestService> serviceBag1 = _createServiceBag(
				serviceWrapper1);

			ServiceWrapper<TestService> serviceWrapper2 =
				new TestServiceWrapper();

			_invokeConcurrently(
				() -> _createServiceBag(serviceWrapper2),
				() -> {
					serviceBag1.replace();

					return null;
				});

			List<Object> serviceWrappers = _getServiceWrappers();

			Assert.assertFalse(
				"Lost wrapper replacement at iteration " + i,
				serviceWrappers.contains(serviceWrapper1));
			Assert.assertTrue(
				"Lost wrapper at iteration " + i,
				serviceWrappers.contains(serviceWrapper2));
		}
	}

	@Test
	public void testConcurrentRegistrations() throws Exception {
		for (int i = 0; i < _ITERATIONS; i++) {
			_aopInvocationHandler.setTarget(_testService);

			ServiceWrapper<TestService> serviceWrapper1 =
				new TestServiceWrapper();
			ServiceWrapper<TestService> serviceWrapper2 =
				new TestServiceWrapper();

			_invokeConcurrently(
				() -> _createServiceBag(serviceWrapper1),
				() -> _createServiceBag(serviceWrapper2));

			List<Object> serviceWrappers = _getServiceWrappers();

			Assert.assertTrue(
				"Lost wrapper at iteration " + i,
				serviceWrappers.contains(serviceWrapper1));
			Assert.assertTrue(
				"Lost wrapper at iteration " + i,
				serviceWrappers.contains(serviceWrapper2));
		}
	}

	private ServiceBag<TestService> _createServiceBag(
		ServiceWrapper<TestService> serviceWrapper) {

		serviceWrapper.setWrappedService(
			(TestService)_aopInvocationHandler.getTarget());

		return new ServiceBag<>(
			_aopInvocationHandler, TestService.class, serviceWrapper,
			SystemBundleUtil.getBundleContext(), null);
	}

	private List<Object> _getServiceWrappers() {
		List<Object> serviceWrappers = new ArrayList<>();

		Object target = _aopInvocationHandler.getTarget();

		while (target instanceof ServiceWrapper) {
			serviceWrappers.add(target);

			ServiceWrapper<?> serviceWrapper = (ServiceWrapper<?>)target;

			target = serviceWrapper.getWrappedService();
		}

		Assert.assertSame(_testService, target);

		return serviceWrappers;
	}

	private void _invokeConcurrently(
			Callable<Object> callable1, Callable<Object> callable2)
		throws Exception {

		CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

		List<Future<Object>> futures = _executorService.invokeAll(
			Arrays.asList(
				() -> {
					cyclicBarrier.await();

					return callable1.call();
				},
				() -> {
					cyclicBarrier.await();

					return callable2.call();
				}));

		for (Future<Object> future : futures) {
			future.get();
		}
	}

	private static final int _ITERATIONS = 10000;

	private AopInvocationHandler _aopInvocationHandler;
	private ExecutorService _executorService;
	private TestService _testService;

	private static class TestServiceImpl implements TestService {
	}

	private static class TestServiceWrapper
		implements ServiceWrapper<TestService>, TestService {

		@Override
		public TestService getWrappedService() {
			return _testService;
		}

		@Override
		public void setWrappedService(TestService testService) {
			_testService = testService;
		}

		private volatile TestService _testService;

	}

	private interface TestService {
	}

}