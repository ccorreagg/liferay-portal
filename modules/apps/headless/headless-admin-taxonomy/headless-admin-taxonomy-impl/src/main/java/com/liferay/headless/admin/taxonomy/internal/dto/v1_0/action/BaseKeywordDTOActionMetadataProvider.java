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

/**
 * @author Javier Gamarra
 * @generated
 */
public abstract class BaseKeywordDTOActionMetadataProvider {

	protected String getDeleteActionKey() {
		return ActionKeys.DELETE;
	}

	protected String getDeleteResourceMethodName() {
		return "deleteKeyword";
	}

	protected String getGetActionKey() {
		return ActionKeys.VIEW;
	}

	protected String getGetResourceMethodName() {
		return "getKeyword";
	}

	protected String getReplaceActionKey() {
		return ActionKeys.UPDATE;
	}

	protected String getReplaceResourceMethodName() {
		return "putKeyword";
	}

	protected abstract String getSubscribeActionKey();

	protected abstract String getSubscribeResourceMethodName();

	protected abstract String getUnsubscribeActionKey();

	protected abstract String getUnsubscribeResourceMethodName();

	protected abstract String getPermissionName();

}