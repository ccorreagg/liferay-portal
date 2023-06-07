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

import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portlet.asset.service.permission.AssetTagsPermission;

/**
 * @author Carlos Correa
 */
public class KeywordDTOActionMetadataProvider
	extends BaseKeywordDTOActionMetadataProvider {

	@Override
	protected String getDeleteActionKey() {
		return ActionKeys.MANAGE_TAG;
	}

	@Override
	protected String getGetActionKey() {
		return ActionKeys.MANAGE_TAG;
	}

	@Override
	protected String getPermissionName() {
		return AssetTagsPermission.RESOURCE_NAME;
	}

	@Override
	protected String getReplaceActionKey() {
		return ActionKeys.MANAGE_TAG;
	}

//	@Override
//	protected String getSubscribeActionKey() {
//		return ActionKeys.SUBSCRIBE;
//	}
//
//	@Override
//	protected String getSubscribeResourceMethodName() {
//		return "putKeywordSubscribe";
//	}
//
//	@Override
//	protected String getUnsubscribeActionKey() {
//		return ActionKeys.SUBSCRIBE;
//	}
//
//	@Override
//	protected String getUnsubscribeResourceMethodName() {
//		return "putKeywordUnsubscribe";
//	}

}