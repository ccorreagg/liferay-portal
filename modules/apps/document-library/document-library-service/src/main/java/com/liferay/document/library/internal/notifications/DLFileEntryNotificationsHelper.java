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

package com.liferay.document.library.internal.notifications;

import com.liferay.document.library.kernel.model.DLFileEntryConstants;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.notifications.NotificationsHelper;
import com.liferay.portal.kernel.notifications.UserNotificationDefinition;
import com.liferay.portal.kernel.service.UserService;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.Validator;

import java.util.Locale;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Alicia García
 */
@Component(service = NotificationsHelper.class)
public class DLFileEntryNotificationsHelper implements NotificationsHelper {

	@Override
	public String getClassName() {
		return DLFileEntryConstants.getClassName();
	}

	@Override
	public JSONObject getJSONObject(JSONObject jsonObject, Locale locale)
		throws PortalException {

		if (!jsonObject.has("notificationMessage")) {
			jsonObject.put(
				"notificationMessage",
				_getNotificationMessage(jsonObject, locale));
		}

		return jsonObject;
	}

	private String _getNotificationMessage(JSONObject jsonObject, Locale locale)
		throws PortalException {

		if (locale == null) {
			long userId = jsonObject.getLong("userId");

			User user = _userService.getUserById(userId);

			locale = user.getLocale();
		}

		String message = StringPool.BLANK;

		int notificationType = jsonObject.getInt("notificationType");

		if (notificationType ==
				UserNotificationDefinition.NOTIFICATION_TYPE_ADD_ENTRY) {

			message = "x-added-a-new-x";
		}
		else if (notificationType ==
					UserNotificationDefinition.
						NOTIFICATION_TYPE_EXPIRED_ENTRY) {

			message = "x-x-has-expired";
		}
		else if (notificationType ==
					UserNotificationDefinition.NOTIFICATION_TYPE_REVIEW_ENTRY) {

			message = "x-review-a-x";
		}
		else if (notificationType ==
					UserNotificationDefinition.NOTIFICATION_TYPE_UPDATE_ENTRY) {

			message = "x-updated-a-x";
		}

		return _language.format(
			locale, message,
			new String[] {
				HtmlUtil.escape(_getUserFullName(jsonObject)), "document"
			},
			false);
	}

	private String _getUserFullName(JSONObject jsonObject) {
		String fullName = jsonObject.getString("fullName");

		if (Validator.isNotNull(fullName)) {
			return fullName;
		}

		return _portal.getUserName(
			jsonObject.getLong("userId"), StringPool.BLANK);
	}

	@Reference
	private Language _language;

	@Reference
	private Portal _portal;

	@Reference
	private UserService _userService;

}