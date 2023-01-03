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

package com.liferay.headless.delivery.internal.dto.v1_0.action;

import com.liferay.headless.delivery.dto.v1_0.StructuredContent;
import com.liferay.headless.delivery.internal.resource.v1_0.StructuredContentResourceImpl;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.service.JournalArticleLocalService;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.vulcan.action.ActionProvider;
import com.liferay.portal.vulcan.action.ActionProviderContext;
import com.liferay.portal.vulcan.util.ActionUtil;

import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(
	service = {ActionProvider.class, StructuredContentActionProvider.class}
)
public class StructuredContentActionProvider implements ActionProvider {

	@Override
	public Map<String, Map<String, String>> getActions(
			ActionProviderContext actionProviderContext, long id)
		throws Exception {

		JournalArticle journalArticle = _journalArticleLocalService.getArticle(
			id);

		long resourcePrimKey = journalArticle.getResourcePrimKey();

		return HashMapBuilder.<String, Map<String, String>>put(
			"delete",
			ActionUtil.addAction(
				ActionKeys.DELETE, StructuredContentResourceImpl.class,
				resourcePrimKey, "deleteStructuredContent",
				actionProviderContext.getScopeChecker(),
				actionProviderContext.getUserId(),
				JournalArticle.class.getName(),
				actionProviderContext.getGroupId(),
				actionProviderContext.getUriInfo())
		).put(
			"get",
			ActionUtil.addAction(
				ActionKeys.VIEW, StructuredContentResourceImpl.class,
				resourcePrimKey, "getStructuredContent",
				actionProviderContext.getScopeChecker(),
				actionProviderContext.getUserId(),
				JournalArticle.class.getName(),
				actionProviderContext.getGroupId(),
				actionProviderContext.getUriInfo())
		).put(
			"get-rendered-content",
			ActionUtil.addAction(
				ActionKeys.VIEW, StructuredContentResourceImpl.class,
				resourcePrimKey,
				"getStructuredContentRenderedContentContentTemplate",
				actionProviderContext.getScopeChecker(),
				actionProviderContext.getUserId(),
				JournalArticle.class.getName(),
				actionProviderContext.getGroupId(),
				actionProviderContext.getUriInfo())
		).put(
			"get-rendered-content-by-display-page",
			ActionUtil.addAction(
				ActionKeys.VIEW, StructuredContentResourceImpl.class,
				resourcePrimKey,
				"getStructuredContentRenderedContentByDisplayPage" +
					"DisplayPageKey",
				actionProviderContext.getScopeChecker(),
				actionProviderContext.getUserId(),
				JournalArticle.class.getName(),
				actionProviderContext.getGroupId(),
				actionProviderContext.getUriInfo())
		).put(
			"replace",
			ActionUtil.addAction(
				ActionKeys.UPDATE, StructuredContentResourceImpl.class,
				resourcePrimKey, "putStructuredContent",
				actionProviderContext.getScopeChecker(),
				actionProviderContext.getUserId(),
				JournalArticle.class.getName(),
				actionProviderContext.getGroupId(),
				actionProviderContext.getUriInfo())
		).put(
			"subscribe",
			ActionUtil.addAction(
				ActionKeys.SUBSCRIBE, StructuredContentResourceImpl.class,
				resourcePrimKey, "putStructuredContentSubscribe",
				actionProviderContext.getScopeChecker(),
				actionProviderContext.getUserId(),
				JournalArticle.class.getName(),
				actionProviderContext.getGroupId(),
				actionProviderContext.getUriInfo())
		).put(
			"unsubscribe",
			ActionUtil.addAction(
				ActionKeys.SUBSCRIBE, StructuredContentResourceImpl.class,
				resourcePrimKey, "putStructuredContentUnsubscribe",
				actionProviderContext.getScopeChecker(),
				actionProviderContext.getUserId(),
				JournalArticle.class.getName(),
				actionProviderContext.getGroupId(),
				actionProviderContext.getUriInfo())
		).put(
			"update",
			ActionUtil.addAction(
				ActionKeys.UPDATE, StructuredContentResourceImpl.class,
				resourcePrimKey, "patchStructuredContent",
				actionProviderContext.getScopeChecker(),
				actionProviderContext.getUserId(),
				JournalArticle.class.getName(),
				actionProviderContext.getGroupId(),
				actionProviderContext.getUriInfo())
		).build();
	}

	@Override
	public String getClassName() {
		return StructuredContent.class.getName();
	}

	@Reference
	private JournalArticleLocalService _journalArticleLocalService;

}