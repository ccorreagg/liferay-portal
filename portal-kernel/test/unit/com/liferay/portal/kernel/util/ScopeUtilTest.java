/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.util;

import com.liferay.exportimport.kernel.lar.ExportImportThreadLocal;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.mockito.MockedStatic;
import org.mockito.Mockito;

/**
 * @author Georgel Pop
 */
public class ScopeUtilTest {

	@AfterClass
	public static void tearDownClass() throws Exception {
		_groupLocalServiceUtilMockedStatic.close();
	}

	@Before
	public void setUp() {
		_groupLocalServiceUtilMockedStatic.reset();
	}

	@Test
	public void testGetItemGroupId() {
		Group group = _getGroup(
			RandomTestUtil.randomString(), RandomTestUtil.randomLong());

		Mockito.when(
			GroupLocalServiceUtil.fetchGroupByExternalReferenceCode(
				group.getExternalReferenceCode(), _COMPANY_ID)
		).thenReturn(
			group
		);

		Long scopeGroupId = RandomTestUtil.randomLong();

		Assert.assertEquals(
			Long.valueOf(group.getGroupId()),
			ScopeUtil.getItemGroupId(
				_COMPANY_ID, group.getExternalReferenceCode(), scopeGroupId));
		Assert.assertEquals(
			scopeGroupId,
			ScopeUtil.getItemGroupId(_COMPANY_ID, "null", scopeGroupId));
		Assert.assertEquals(
			scopeGroupId,
			ScopeUtil.getItemGroupId(
				_COMPANY_ID, StringPool.BLANK, scopeGroupId));
		Assert.assertEquals(
			scopeGroupId,
			ScopeUtil.getItemGroupId(_COMPANY_ID, null, scopeGroupId));

		Assert.assertNull(
			ScopeUtil.getItemGroupId(
				_COMPANY_ID, RandomTestUtil.randomString(), scopeGroupId));
	}

	@Test
	public void testGetItemGroupIdWhileStagingInProcess() {
		Group liveGroup = _getGroup(
			RandomTestUtil.randomString(), RandomTestUtil.randomLong());

		Group stagingGroup = _getStagingGroup(
			RandomTestUtil.randomString(), RandomTestUtil.randomLong(),
			liveGroup);

		Mockito.when(
			GroupLocalServiceUtil.fetchGroupByExternalReferenceCode(
				stagingGroup.getExternalReferenceCode(), _COMPANY_ID)
		).thenReturn(
			stagingGroup
		);

		Long scopeGroupId = RandomTestUtil.randomLong();

		Assert.assertEquals(
			Long.valueOf(stagingGroup.getGroupId()),
			ScopeUtil.getItemGroupId(
				_COMPANY_ID, stagingGroup.getExternalReferenceCode(),
				scopeGroupId));

		ExportImportThreadLocal.setLayoutStagingInProcess(true);

		try {
			Assert.assertEquals(
				Long.valueOf(liveGroup.getGroupId()),
				ScopeUtil.getItemGroupId(
					_COMPANY_ID, stagingGroup.getExternalReferenceCode(),
					scopeGroupId));

			Group orphanStagingGroup = _getStagingGroup(
				RandomTestUtil.randomString(), RandomTestUtil.randomLong(),
				null);

			Mockito.when(
				GroupLocalServiceUtil.fetchGroupByExternalReferenceCode(
					orphanStagingGroup.getExternalReferenceCode(), _COMPANY_ID)
			).thenReturn(
				orphanStagingGroup
			);

			Assert.assertEquals(
				Long.valueOf(orphanStagingGroup.getGroupId()),
				ScopeUtil.getItemGroupId(
					_COMPANY_ID, orphanStagingGroup.getExternalReferenceCode(),
					scopeGroupId));
		}
		finally {
			ExportImportThreadLocal.setLayoutStagingInProcess(false);
		}
	}

	@Test
	public void testGetItemScopeExternalReferenceCode() throws Exception {
		Group group = _getGroup(
			RandomTestUtil.randomString(), RandomTestUtil.randomLong());

		Mockito.when(
			GroupLocalServiceUtil.getGroup(group.getGroupId())
		).thenReturn(
			group
		);

		String scopeExternalReferenceCode = RandomTestUtil.randomString();

		Assert.assertEquals(
			scopeExternalReferenceCode,
			ScopeUtil.getItemScopeExternalReferenceCode(
				scopeExternalReferenceCode, group.getGroupId()));

		long scopeGroupId = RandomTestUtil.randomLong();

		Assert.assertEquals(
			group.getExternalReferenceCode(),
			ScopeUtil.getItemScopeExternalReferenceCode(
				group.getGroupId(), scopeGroupId));

		Assert.assertNull(
			ScopeUtil.getItemScopeExternalReferenceCode(
				"null", group.getGroupId()));
		Assert.assertNull(
			ScopeUtil.getItemScopeExternalReferenceCode(0, scopeGroupId));
		Assert.assertNull(
			ScopeUtil.getItemScopeExternalReferenceCode(
				StringPool.BLANK, group.getGroupId()));
		Assert.assertNull(
			ScopeUtil.getItemScopeExternalReferenceCode(
				group.getExternalReferenceCode(), group.getGroupId()));
		Assert.assertNull(
			ScopeUtil.getItemScopeExternalReferenceCode(
				null, group.getGroupId()));
		Assert.assertNull(
			ScopeUtil.getItemScopeExternalReferenceCode(
				scopeGroupId, scopeGroupId));
	}

	@Test
	public void testGetItemScopeExternalReferenceCodeWhileStagingInProcess()
		throws Exception {

		Group liveGroup = _getGroup(
			RandomTestUtil.randomString(), RandomTestUtil.randomLong());

		Group stagingGroup = _getStagingGroup(
			RandomTestUtil.randomString(), RandomTestUtil.randomLong(),
			liveGroup);

		Group scopeGroup = _getGroup(
			RandomTestUtil.randomString(), RandomTestUtil.randomLong());

		Mockito.when(
			GroupLocalServiceUtil.fetchGroupByExternalReferenceCode(
				stagingGroup.getExternalReferenceCode(), _COMPANY_ID)
		).thenReturn(
			stagingGroup
		);

		Mockito.when(
			GroupLocalServiceUtil.getGroup(liveGroup.getGroupId())
		).thenReturn(
			liveGroup
		);

		Mockito.when(
			GroupLocalServiceUtil.getGroup(scopeGroup.getGroupId())
		).thenReturn(
			scopeGroup
		);

		Assert.assertEquals(
			stagingGroup.getExternalReferenceCode(),
			ScopeUtil.getItemScopeExternalReferenceCode(
				stagingGroup.getExternalReferenceCode(),
				scopeGroup.getGroupId()));

		ExportImportThreadLocal.setLayoutStagingInProcess(true);

		try {
			Assert.assertEquals(
				liveGroup.getExternalReferenceCode(),
				ScopeUtil.getItemScopeExternalReferenceCode(
					stagingGroup.getExternalReferenceCode(),
					scopeGroup.getGroupId()));

			Assert.assertNull(
				ScopeUtil.getItemScopeExternalReferenceCode(
					stagingGroup.getExternalReferenceCode(),
					liveGroup.getGroupId()));
		}
		finally {
			ExportImportThreadLocal.setLayoutStagingInProcess(false);
		}
	}

	private Group _getGroup(String externalReferenceCode, long groupId) {
		Group group = Mockito.mock(Group.class);

		Mockito.when(
			group.getCompanyId()
		).thenReturn(
			_COMPANY_ID
		);

		Mockito.when(
			group.getExternalReferenceCode()
		).thenReturn(
			externalReferenceCode
		);

		Mockito.when(
			group.getGroupId()
		).thenReturn(
			groupId
		);

		return group;
	}

	private Group _getStagingGroup(
		String externalReferenceCode, long groupId, Group liveGroup) {

		Group group = _getGroup(externalReferenceCode, groupId);

		Mockito.when(
			group.getLiveGroup()
		).thenReturn(
			liveGroup
		);

		Mockito.when(
			group.isStagingGroup()
		).thenReturn(
			true
		);

		return group;
	}

	private static final long _COMPANY_ID = RandomTestUtil.randomLong();

	private static final MockedStatic<GroupLocalServiceUtil>
		_groupLocalServiceUtilMockedStatic = Mockito.mockStatic(
			GroupLocalServiceUtil.class);

}