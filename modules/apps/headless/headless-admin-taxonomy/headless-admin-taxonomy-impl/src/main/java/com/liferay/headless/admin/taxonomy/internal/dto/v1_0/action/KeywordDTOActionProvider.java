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

import com.liferay.headless.admin.taxonomy.internal.resource.v1_0.KeywordResourceImpl;
import com.liferay.oauth2.provider.scope.ScopeChecker;
import com.liferay.portal.vulcan.action.ActionInfo;
import com.liferay.portal.vulcan.action.DTOActionProvider;
import com.liferay.portal.vulcan.util.ActionUtil;

import java.util.HashMap;
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
	implements DTOActionProvider {

//	@Override
//	public List<ActionInfo> getIndividualActionInfoList() throws Exception {
//		KeywordDTOActionMetadataProvider keywordDTOActionMetadataProvider =
//			new KeywordDTOActionMetadataProvider();
//
//		List<ActionInfo> actionInfoList = new ArrayList<>();
//
//		actionInfoList.add(
//			ActionUtil.getActionInfo(
//				"delete", KeywordResourceImpl.class,
//				keywordDTOActionMetadataProvider.
//					getDeleteResourceMethodName()));
//		actionInfoList.add(
//			ActionUtil.getActionInfo(
//				"get", KeywordResourceImpl.class,
//				keywordDTOActionMetadataProvider.getGetResourceMethodName()));
//		actionInfoList.add(
//			ActionUtil.getActionInfo(
//				"replace", KeywordResourceImpl.class,
//				keywordDTOActionMetadataProvider.
//					getReplaceResourceMethodName()));
//		actionInfoList.add(
//			ActionUtil.getActionInfo(
//				"subscribe", KeywordResourceImpl.class,
//				keywordDTOActionMetadataProvider.
//					getSubscribeResourceMethodName()));
//		actionInfoList.add(
//			ActionUtil.getActionInfo(
//				"unsubscribe", KeywordResourceImpl.class,
//				keywordDTOActionMetadataProvider.
//					getUnsubscribeResourceMethodName()));
//
//		return actionInfoList;
//	}

	@Override
	public Map<String, Map<String, String>> getActions(
		long groupId, long primaryKey, UriInfo uriInfo, long userId) {

		Map<String, Map<String, String>> actions = new HashMap<>();

		KeywordDTOActionMetadataProvider keywordDTOActionMetadataProvider =
			new KeywordDTOActionMetadataProvider();

		for (String actionName : keywordDTOActionMetadataProvider.getActionNames()) {
			ActionInfo actionInfo =
				keywordDTOActionMetadataProvider.getActionInfo(actionName);

			actions.put(actionName, ActionUtil.addAction(
				actionInfo.getActionKey(), KeywordResourceImpl.class,
				primaryKey, actionInfo.getResourceMethodName(), _scopeChecker,
				userId, keywordDTOActionMetadataProvider.getPermissionName(),
				groupId, uriInfo));
		}

		return actions;
	}

	@Reference
	private ScopeChecker _scopeChecker;

}