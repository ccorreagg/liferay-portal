/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.layout.set.prototype.internal.helper.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.exportimport.kernel.background.task.BackgroundTaskExecutorNames;
import com.liferay.exportimport.kernel.lar.ExportImportThreadLocal;
import com.liferay.layout.set.prototype.constants.LayoutSetPrototypeConstants;
import com.liferay.layout.set.prototype.constants.LayoutSetPrototypePortletKeys;
import com.liferay.layout.set.prototype.exception.LayoutSetPrototypeSyncException;
import com.liferay.layout.set.prototype.helper.LayoutSetPrototypeHelper;
import com.liferay.layout.test.util.LayoutTestUtil;
import com.liferay.petra.lang.SafeCloseable;
import com.liferay.portal.kernel.backgroundtask.BackgroundTask;
import com.liferay.portal.kernel.backgroundtask.BackgroundTaskExecutor;
import com.liferay.portal.kernel.backgroundtask.BackgroundTaskResult;
import com.liferay.portal.kernel.backgroundtask.BaseBackgroundTaskExecutor;
import com.liferay.portal.kernel.backgroundtask.constants.BackgroundTaskConstants;
import com.liferay.portal.kernel.backgroundtask.display.BackgroundTaskDisplay;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.LayoutSetPrototype;
import com.liferay.portal.kernel.model.UserNotificationEvent;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutLocalService;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.UserNotificationEventLocalService;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.kernel.test.rule.Sync;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.ServiceContextTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.kernel.test.util.UserTestUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HashMapDictionaryBuilder;
import com.liferay.portal.test.log.LogCapture;
import com.liferay.portal.test.log.LoggerTestUtil;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.sites.kernel.util.Sites;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

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
 * @author Vendel Toreki
 */
@RunWith(Arquillian.class)
@Sync
public class LayoutSetPrototypeHelperTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@Before
	public void setUp() throws Exception {
		ServiceContextThreadLocal.pushServiceContext(
			ServiceContextTestUtil.getServiceContext());

		UserTestUtil.setUser(TestPropsValues.getUser());

		_group = GroupTestUtil.addGroup();

		_layoutSetPrototype = LayoutTestUtil.addLayoutSetPrototype(
			RandomTestUtil.randomString());

		_layoutSetPrototypeGroup = _layoutSetPrototype.getGroup();

		_prototypeLayout = LayoutTestUtil.addTypePortletLayout(
			_layoutSetPrototypeGroup, true);

		setLinkEnabled();

		_siteLayout = LayoutLocalServiceUtil.getFriendlyURLLayout(
			_group.getGroupId(), false, _prototypeLayout.getFriendlyURL());
	}

	@Test
	public void testDuplicatedFriendlyURLsInLayoutSet() throws Exception {
		List<Layout> layouts = new ArrayList<>();

		for (String name : RandomTestUtil.randomStrings(3)) {
			layouts.add(
				LayoutTestUtil.addTypePortletLayout(
					_group.getGroupId(), name, false));

			LayoutTestUtil.addTypePortletLayout(
				_group.getGroupId(), RandomTestUtil.randomString(5), false);
			LayoutTestUtil.addTypePortletLayout(
				_layoutSetPrototypeGroup.getGroupId(), name, true);
			LayoutTestUtil.addTypePortletLayout(
				_layoutSetPrototypeGroup.getGroupId(),
				RandomTestUtil.randomString(5), true);
		}

		List<Long> duplicatedFriendlyURLPlids =
			_layoutSetPrototypeHelper.getDuplicatedFriendlyURLPlids(
				_group.getPublicLayoutSet());

		Assert.assertEquals(
			duplicatedFriendlyURLPlids.toString(), 3,
			duplicatedFriendlyURLPlids.size());

		for (Layout layout : layouts) {
			Assert.assertTrue(
				duplicatedFriendlyURLPlids.contains(layout.getPlid()));
		}
	}

	@Test
	public void testDuplicatedFriendlyURLsInLayoutSetPrototype()
		throws Exception {

		List<Layout> layouts = new ArrayList<>();

		for (String name : RandomTestUtil.randomStrings(3)) {
			LayoutTestUtil.addTypePortletLayout(
				_group.getGroupId(), name, false);
			LayoutTestUtil.addTypePortletLayout(
				_group.getGroupId(), RandomTestUtil.randomString(5), false);

			layouts.add(
				LayoutTestUtil.addTypePortletLayout(
					_layoutSetPrototypeGroup.getGroupId(), name, true));

			LayoutTestUtil.addTypePortletLayout(
				_layoutSetPrototypeGroup.getGroupId(),
				RandomTestUtil.randomString(5), true);
		}

		List<Long> duplicatedFriendlyURLPlids =
			_layoutSetPrototypeHelper.getDuplicatedFriendlyURLPlids(
				_layoutSetPrototype);

		Assert.assertEquals(
			duplicatedFriendlyURLPlids.toString(), 3,
			duplicatedFriendlyURLPlids.size());

		for (Layout layout : layouts) {
			Assert.assertTrue(
				duplicatedFriendlyURLPlids.contains(layout.getPlid()));
		}
	}

	@Test
	public void testExecuteLayoutSetPrototypeSync() throws Exception {
		long userId = TestPropsValues.getUserId();

		int initialCount = _layoutLocalService.getLayoutsCount(
			_group.getGroupId(), false);

		LayoutTestUtil.addTypePortletLayout(_layoutSetPrototypeGroup, true);

		long timestamp = System.currentTimeMillis();

		_layoutSetPrototypeHelper.executeLayoutSetPrototypeSync(
			_layoutSetPrototype.getLayoutSetPrototypeId(), userId);

		Assert.assertEquals(
			LayoutSetPrototypeConstants.STATUS_SUCCESSFUL,
			_getLatestSyncNotificationResult(timestamp, userId));

		Assert.assertEquals(
			initialCount + 1,
			_layoutLocalService.getLayoutsCount(_group.getGroupId(), false));
	}

	@Test
	public void testExecuteLayoutSetPrototypeSyncCheckNotification()
		throws Exception {

		_testExecuteLayoutSetPrototypeSyncCheckNotification(
			LayoutSetPrototypeConstants.STATUS_COMPLETED_WITH_ERRORS,
			_getRandomStatus(
				BackgroundTaskConstants.STATUS_COMPLETED_WITH_ERRORS,
				BackgroundTaskConstants.STATUS_SUCCESSFUL),
			BackgroundTaskConstants.STATUS_COMPLETED_WITH_ERRORS);

		_testExecuteLayoutSetPrototypeSyncCheckNotification(
			LayoutSetPrototypeConstants.STATUS_FAILED,
			_getRandomStatus(
				BackgroundTaskConstants.STATUS_COMPLETED_WITH_ERRORS,
				BackgroundTaskConstants.STATUS_SUCCESSFUL),
			BackgroundTaskConstants.STATUS_FAILED);

		_testExecuteLayoutSetPrototypeSyncCheckNotification(
			LayoutSetPrototypeConstants.STATUS_SUCCESSFUL,
			BackgroundTaskConstants.STATUS_SUCCESSFUL,
			BackgroundTaskConstants.STATUS_SUCCESSFUL);
	}

	@Test
	public void testExecuteLayoutSetPrototypeSyncExportImportInProcess()
		throws Exception {

		_testExecuteLayoutSetPrototypeSyncExportImportInProcess(
			ExportImportThreadLocal::setLayoutExportInProcess);
		_testExecuteLayoutSetPrototypeSyncExportImportInProcess(
			ExportImportThreadLocal::setLayoutImportInProcess);
		_testExecuteLayoutSetPrototypeSyncExportImportInProcess(
			ExportImportThreadLocal::setLayoutStagingInProcess);
	}

	@Test
	public void testExecuteLayoutSetPrototypeSyncWithLinkDisabled()
		throws Exception {

		long userId = TestPropsValues.getUserId();

		_sites.updateLayoutSetPrototypesLinks(
			_group, _layoutSetPrototype.getLayoutSetPrototypeId(), 0, false,
			false);

		int initialCount = _layoutLocalService.getLayoutsCount(
			_group.getGroupId(), false);

		LayoutTestUtil.addTypePortletLayout(_layoutSetPrototypeGroup, true);

		long timestamp = System.currentTimeMillis();

		_layoutSetPrototypeHelper.executeLayoutSetPrototypeSync(
			_layoutSetPrototype.getLayoutSetPrototypeId(), userId);

		Assert.assertEquals(
			LayoutSetPrototypeConstants.STATUS_SUCCESSFUL,
			_getLatestSyncNotificationResult(timestamp, userId));

		Assert.assertEquals(
			initialCount,
			_layoutLocalService.getLayoutsCount(_group.getGroupId(), false));
	}

	@Test
	public void testExecuteLayoutSetPrototypeSyncWithNonexistentLayoutSetPrototype()
		throws Exception {

		long timestamp = System.currentTimeMillis();

		_layoutSetPrototypeHelper.executeLayoutSetPrototypeSync(
			RandomTestUtil.randomLong(), RandomTestUtil.randomLong());

		Assert.assertNull(
			_getLatestSyncNotificationResult(
				timestamp, TestPropsValues.getUserId()));
	}

	@Test
	public void testLayoutSetPrototypeLayoutFriendlyURLConflictDetectionBeforeChange()
		throws Exception {

		LayoutTestUtil.addTypePortletLayout(_group.getGroupId(), "test", false);

		Layout layoutSetPrototypeLayout = LayoutTestUtil.addTypePortletLayout(
			_layoutSetPrototypeGroup.getGroupId(), "testNoConflict", true);

		boolean hasConflicts =
			_layoutSetPrototypeHelper.hasDuplicatedFriendlyURLs(
				layoutSetPrototypeLayout.getExternalReferenceCode(),
				layoutSetPrototypeLayout.getGroupId(),
				layoutSetPrototypeLayout.isPrivateLayout(), "/test");

		Assert.assertTrue(hasConflicts);
	}

	@Test
	public void testLayoutSetPrototypeLayoutFriendlyURLConflictDetectionBeforeCreate()
		throws Exception {

		LayoutTestUtil.addTypePortletLayout(_group.getGroupId(), "test", false);

		boolean hasConflicts =
			_layoutSetPrototypeHelper.hasDuplicatedFriendlyURLs(
				null, _layoutSetPrototypeGroup.getGroupId(), true, "/test");

		Assert.assertTrue(hasConflicts);
	}

	@Test
	public void testLayoutSetPrototypeLayoutFriendlyURLConflictDetectionBeforePropagate()
		throws Exception {

		Layout siteLayout = LayoutTestUtil.addTypePortletLayout(
			_group.getGroupId(), "test", false);

		Layout layoutSetPrototypeLayout = LayoutTestUtil.addTypePortletLayout(
			_layoutSetPrototypeGroup.getGroupId(), "test", true);

		List<Layout> conflictLayouts =
			_layoutSetPrototypeHelper.getDuplicatedFriendlyURLLayouts(
				layoutSetPrototypeLayout);

		Assert.assertEquals(
			conflictLayouts.toString(), 1, conflictLayouts.size());

		Layout conflictLayout = conflictLayouts.get(0);

		Assert.assertEquals(conflictLayout.getPlid(), siteLayout.getPlid());
	}

	@Test
	public void testLayoutSetPrototypeLayoutFriendlyURLConflictDetectionIgnorePropagated()
		throws Exception {

		boolean hasConflicts =
			_layoutSetPrototypeHelper.hasDuplicatedFriendlyURLs(
				_prototypeLayout.getExternalReferenceCode(),
				_prototypeLayout.getGroupId(),
				_prototypeLayout.isPrivateLayout(),
				_prototypeLayout.getFriendlyURL());

		Assert.assertFalse(hasConflicts);
	}

	@Test
	public void testSiteLayoutFriendlyURLConflictDetectionBeforeChange()
		throws Exception {

		Layout siteLayout = LayoutTestUtil.addTypePortletLayout(
			_group.getGroupId(), "testNoConflict", false);

		LayoutTestUtil.addTypePortletLayout(
			_layoutSetPrototypeGroup.getGroupId(), "test", true);

		boolean hasConflicts =
			_layoutSetPrototypeHelper.hasDuplicatedFriendlyURLs(
				siteLayout.getExternalReferenceCode(), siteLayout.getGroupId(),
				siteLayout.isPrivateLayout(), "/test");

		Assert.assertTrue(hasConflicts);
	}

	@Test
	public void testSiteLayoutFriendlyURLConflictDetectionBeforeCreate()
		throws Exception {

		LayoutTestUtil.addTypePortletLayout(
			_layoutSetPrototypeGroup.getGroupId(), "test", true);

		boolean hasConflicts =
			_layoutSetPrototypeHelper.hasDuplicatedFriendlyURLs(
				null, _group.getGroupId(), false, "/test");

		Assert.assertTrue(hasConflicts);
	}

	@Test
	public void testSiteLayoutFriendlyURLConflictDetectionBeforePropagate()
		throws Exception {

		Layout siteLayout = LayoutTestUtil.addTypePortletLayout(
			_group.getGroupId(), "test", false);

		Layout layoutSetPrototypeLayout = LayoutTestUtil.addTypePortletLayout(
			_layoutSetPrototypeGroup.getGroupId(), "test", true);

		List<Layout> conflicts =
			_layoutSetPrototypeHelper.getDuplicatedFriendlyURLLayouts(
				siteLayout);

		Assert.assertEquals(conflicts.toString(), 1, conflicts.size());

		Layout conflictLayout = conflicts.get(0);

		Assert.assertEquals(
			conflictLayout.getPlid(), layoutSetPrototypeLayout.getPlid());
	}

	@Test
	public void testSiteLayoutFriendlyURLConflictDetectionIgnorePropagated()
		throws Exception {

		boolean hasConflicts =
			_layoutSetPrototypeHelper.hasDuplicatedFriendlyURLs(
				_siteLayout.getExternalReferenceCode(),
				_siteLayout.getGroupId(), _siteLayout.isPrivateLayout(),
				_siteLayout.getFriendlyURL());

		Assert.assertFalse(hasConflicts);
	}

	protected void setLinkEnabled() throws Exception {
		_sites.updateLayoutSetPrototypesLinks(
			_group, _layoutSetPrototype.getLayoutSetPrototypeId(), 0, true,
			false);
	}

	private String _getLatestSyncNotificationResult(long timestamp, long userId)
		throws Exception {

		List<UserNotificationEvent> userNotificationEvents =
			_userNotificationEventLocalService.getUserNotificationEvents(
				userId);

		for (int i = userNotificationEvents.size() - 1; i >= 0; i--) {
			UserNotificationEvent userNotificationEvent =
				userNotificationEvents.get(i);

			if ((userNotificationEvent.getTimestamp() < timestamp) ||
				!Objects.equals(
					userNotificationEvent.getType(),
					LayoutSetPrototypePortletKeys.LAYOUT_SET_PROTOTYPE)) {

				continue;
			}

			JSONObject payloadJSONObject = JSONFactoryUtil.createJSONObject(
				userNotificationEvent.getPayload());

			return payloadJSONObject.getString("result");
		}

		return null;
	}

	private int _getRandomStatus(int... statuses) {
		return statuses[RandomTestUtil.randomInt(0, statuses.length - 1)];
	}

	private <S> SafeCloseable _registerServiceWithSafeCloseable(
		Class<S> clazz, Dictionary<String, ?> properties, S service) {

		Bundle bundle = FrameworkUtil.getBundle(
			LayoutSetPrototypeHelperTest.class);

		BundleContext bundleContext = bundle.getBundleContext();

		ServiceRegistration<S> serviceRegistration =
			bundleContext.registerService(clazz, service, properties);

		return serviceRegistration::unregister;
	}

	private void _testExecuteLayoutSetPrototypeSyncCheckNotification(
			String expectedResult, int status1, int status2)
		throws Exception {

		long userId = TestPropsValues.getUserId();

		Group group = GroupTestUtil.addGroup();

		try {
			_sites.updateLayoutSetPrototypesLinks(
				group, _layoutSetPrototype.getLayoutSetPrototypeId(), 0, true,
				false);

			try (SafeCloseable safeCloseable =
					_registerServiceWithSafeCloseable(
						BackgroundTaskExecutor.class,
						HashMapDictionaryBuilder.<String, Object>put(
							"background.task.executor.class.name",
							BackgroundTaskExecutorNames.
								LAYOUT_SET_PROTOTYPE_SYNC_BACKGROUND_TASK_EXECUTOR
						).put(
							"service.ranking", 1000
						).build(),
						new TestBackgroundTaskExecutor(
							HashMapBuilder.put(
								_group.getGroupId(), status1
							).put(
								group.getGroupId(), status2
							).build()))) {

				long timestamp = System.currentTimeMillis();

				try (LogCapture logCapture =
						LoggerTestUtil.configureLog4JLogger(
							"com.liferay.portal.background.task.internal." +
								"messaging.BackgroundTaskMessageListener",
							LoggerTestUtil.OFF)) {

					_layoutSetPrototypeHelper.executeLayoutSetPrototypeSync(
						_layoutSetPrototype.getLayoutSetPrototypeId(), userId);

					Assert.assertEquals(
						expectedResult,
						_getLatestSyncNotificationResult(timestamp, userId));
				}
			}
		}
		finally {
			GroupLocalServiceUtil.deleteGroup(group);
		}
	}

	private void _testExecuteLayoutSetPrototypeSyncExportImportInProcess(
			Consumer<Boolean> exportImportThreadLocalConsumer)
		throws Exception {

		try {
			exportImportThreadLocalConsumer.accept(true);

			_layoutSetPrototypeHelper.executeLayoutSetPrototypeSync(
				_layoutSetPrototype.getLayoutSetPrototypeId(),
				TestPropsValues.getUserId());

			Assert.fail();
		}
		catch (LayoutSetPrototypeSyncException.MustNotHaveExportImportInProgress
					layoutSetPrototypeSyncException) {
		}
		finally {
			exportImportThreadLocalConsumer.accept(false);
		}
	}

	@DeleteAfterTestRun
	private Group _group;

	@Inject
	private LayoutLocalService _layoutLocalService;

	@DeleteAfterTestRun
	private LayoutSetPrototype _layoutSetPrototype;

	@DeleteAfterTestRun
	private Group _layoutSetPrototypeGroup;

	@Inject
	private LayoutSetPrototypeHelper _layoutSetPrototypeHelper;

	private Layout _prototypeLayout;
	private Layout _siteLayout;

	@Inject
	private Sites _sites;

	@Inject
	private UserNotificationEventLocalService
		_userNotificationEventLocalService;

	private static class TestBackgroundTaskExecutor
		extends BaseBackgroundTaskExecutor {

		public TestBackgroundTaskExecutor(Map<Long, Integer> groupIdStatusMap) {
			_groupIdStatusMap = groupIdStatusMap;
		}

		@Override
		public BackgroundTaskExecutor clone() {
			return this;
		}

		@Override
		public BackgroundTaskResult execute(BackgroundTask backgroundTask) {
			Integer status = _groupIdStatusMap.getOrDefault(
				backgroundTask.getGroupId(),
				BackgroundTaskConstants.STATUS_SUCCESSFUL);

			if (status == BackgroundTaskConstants.STATUS_FAILED) {
				throw new RuntimeException();
			}

			return new BackgroundTaskResult(status);
		}

		@Override
		public BackgroundTaskDisplay getBackgroundTaskDisplay(
			BackgroundTask backgroundTask) {

			return null;
		}

		private final Map<Long, Integer> _groupIdStatusMap;

	}

}