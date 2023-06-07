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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.action.ActionInfo;

import java.util.Set;

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

	protected abstract String getPermissionName();

	public Set<String> getActionNames() {
		return SetUtil.fromArray("delete", "get", "replace");
	}

	public ActionInfo getActionInfo(String actionName) {
		ActionInfo actionInfo = new ActionInfo();

		if (StringUtil.equals(actionName, "delete")) {
			actionInfo.setActionKey(getDeleteActionKey());
			actionInfo.setResourceMethodName(getDeleteResourceMethodName());
		}
		else if (StringUtil.equals(actionName, "get")) {
			actionInfo.setActionKey(getGetActionKey());
			actionInfo.setResourceMethodName(getGetResourceMethodName());
		}
		else if (StringUtil.equals(actionName, "replace")) {
			actionInfo.setActionKey(getReplaceActionKey());
			actionInfo.setResourceMethodName(getReplaceResourceMethodName());
		}

		throw new IllegalStateException("No action defined for the name " + actionName);
	}

}