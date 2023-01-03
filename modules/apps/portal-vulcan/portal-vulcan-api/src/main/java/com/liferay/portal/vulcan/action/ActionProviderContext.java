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

package com.liferay.portal.vulcan.action;

import javax.ws.rs.core.UriInfo;

/**
 * @author Carlos Correa
 */
public class ActionProviderContext {

	public ActionProviderContext(
		long groupId, Object scopeChecker, UriInfo uriInfo, long userId) {

		_groupId = groupId;
		_scopeChecker = scopeChecker;
		_uriInfo = uriInfo;
		_userId = userId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public Object getScopeChecker() {
		return _scopeChecker;
	}

	public UriInfo getUriInfo() {
		return _uriInfo;
	}

	public long getUserId() {
		return _userId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public void setScopeChecker(Object scopeChecker) {
		_scopeChecker = scopeChecker;
	}

	public void setUriInfo(UriInfo uriInfo) {
		_uriInfo = uriInfo;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	private long _groupId;
	private Object _scopeChecker;
	private UriInfo _uriInfo;
	private long _userId;

}