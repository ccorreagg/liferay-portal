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

package com.liferay.headless.admin.taxonomy.internal.dto.v1_0.action;

import com.liferay.headless.admin.taxonomy.dto.v1_0.Action;
import com.liferay.headless.admin.taxonomy.dto.v1_0.KeywordActions;
import com.liferay.headless.admin.taxonomy.internal.resource.v1_0.KeywordResourceImpl;
import com.liferay.oauth2.provider.scope.ScopeChecker;
import com.liferay.portal.vulcan.action.ActionInfo;
import com.liferay.portal.vulcan.action.DTOActionProvider;
import com.liferay.portal.vulcan.util.ActionUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Javier Gamarra
 * @generated
 */
@Component(
	property = {
		"dto.class.name=com.liferay.headless.admin.taxonomy.dto.v1_0.Keyword"
	},
	service = DTOActionProvider.class
)
@Generated("")
public class KeywordDTOActionProvider
	implements DTOActionProvider<KeywordActions> {

	@Override
	public List<ActionInfo> getIndividualActionInfoList() throws Exception {
		KeywordDTOActionMetadataProvider keywordDTOActionMetadataProvider =
			new KeywordDTOActionMetadataProvider();

		List<ActionInfo> actionInfoList = new ArrayList<>();

		actionInfoList.add(
			ActionUtil.getActionInfo(
				"delete", KeywordResourceImpl.class,
				keywordDTOActionMetadataProvider.
					getDeleteResourceMethodName()));
		actionInfoList.add(
			ActionUtil.getActionInfo(
				"get", KeywordResourceImpl.class,
				keywordDTOActionMetadataProvider.getGetResourceMethodName()));
		actionInfoList.add(
			ActionUtil.getActionInfo(
				"replace", KeywordResourceImpl.class,
				keywordDTOActionMetadataProvider.
					getReplaceResourceMethodName()));
		actionInfoList.add(
			ActionUtil.getActionInfo(
				"subscribe", KeywordResourceImpl.class,
				keywordDTOActionMetadataProvider.
					getSubscribeResourceMethodName()));
		actionInfoList.add(
			ActionUtil.getActionInfo(
				"unsubscribe", KeywordResourceImpl.class,
				keywordDTOActionMetadataProvider.
					getUnsubscribeResourceMethodName()));

		return actionInfoList;
	}

	@Override
	public KeywordActions getActions(
		long groupId, long primaryKey, UriInfo uriInfo, long userId) {

		KeywordDTOActionMetadataProvider keywordDTOActionMetadataProvider =
			new KeywordDTOActionMetadataProvider();

		KeywordActions keywordactions = new KeywordActions();

		keywordactions.setDelete(
			_getAction(
				keywordDTOActionMetadataProvider.getDeleteActionKey(), groupId,
				primaryKey,
				keywordDTOActionMetadataProvider.getDeleteResourceMethodName(),
				uriInfo, userId));
		keywordactions.setGet(
			_getAction(
				keywordDTOActionMetadataProvider.getGetActionKey(), groupId,
				primaryKey,
				keywordDTOActionMetadataProvider.getGetResourceMethodName(),
				uriInfo, userId));
		keywordactions.setReplace(
			_getAction(
				keywordDTOActionMetadataProvider.getReplaceActionKey(), groupId,
				primaryKey,
				keywordDTOActionMetadataProvider.getReplaceResourceMethodName(),
				uriInfo, userId));
		keywordactions.setSubscribe(
			_getAction(
				keywordDTOActionMetadataProvider.getSubscribeActionKey(),
				groupId, primaryKey,
				keywordDTOActionMetadataProvider.
					getSubscribeResourceMethodName(),
				uriInfo, userId));
		keywordactions.setUnsubscribe(
			_getAction(
				keywordDTOActionMetadataProvider.getUnsubscribeActionKey(),
				groupId, primaryKey,
				keywordDTOActionMetadataProvider.
					getUnsubscribeResourceMethodName(),
				uriInfo, userId));

		return keywordactions;
	}

	private Action _getAction(
		String actionKey, long groupId, long primaryKey,
		String resourceMethodName, UriInfo uriInfo, long userId) {

		KeywordDTOActionMetadataProvider keywordDTOActionMetadataProvider =
			new KeywordDTOActionMetadataProvider();

		final Map<String, String> actionMap = ActionUtil.addAction(
			actionKey, KeywordResourceImpl.class, primaryKey,
			resourceMethodName, _scopeChecker, userId,
			keywordDTOActionMetadataProvider.getPermissionName(), groupId,
			uriInfo);

		if (actionMap == null) {
			return null;
		}

		return new Action() {
			{
				setHref(actionMap.get("href"));
				setMethod(actionMap.get("method"));
			}
		};
	}

	@Reference
	private ScopeChecker _scopeChecker;

}