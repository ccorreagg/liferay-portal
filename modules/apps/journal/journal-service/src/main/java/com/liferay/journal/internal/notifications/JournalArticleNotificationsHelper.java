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

package com.liferay.journal.internal.notifications;

import com.liferay.journal.constants.JournalArticleConstants;
import com.liferay.journal.model.JournalArticle;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.notifications.NotificationsHelper;
import com.liferay.portal.kernel.notifications.UserNotificationDefinition;
import com.liferay.portal.kernel.service.UserService;
import com.liferay.portal.kernel.util.Html;
import com.liferay.portal.kernel.util.Portal;

import java.util.Locale;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Alicia García
 */
@Component(service = NotificationsHelper.class)
public class JournalArticleNotificationsHelper implements NotificationsHelper {

	@Override
	public String getClassName() {
		return JournalArticle.class.getName();
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

		long userId = jsonObject.getLong("userId");

		if (locale == null) {
			User user = _userService.getUserById(userId);

			locale = user.getLocale();
		}

		String title = StringPool.BLANK;

		String userFullName = _html.escape(
			_portal.getUserName(userId, StringPool.BLANK));

		int notificationType = jsonObject.getInt("notificationType");

		if (notificationType ==
				UserNotificationDefinition.NOTIFICATION_TYPE_ADD_ENTRY) {

			title = _language.format(
				locale, "x-added-a-new-web-content-article", userFullName);
		}
		else if (notificationType ==
					UserNotificationDefinition.NOTIFICATION_TYPE_UPDATE_ENTRY) {

			title = _language.format(
				locale, "x-updated-a-web-content-article", userFullName);
		}
		else if (notificationType ==
					JournalArticleConstants.
						NOTIFICATION_TYPE_MOVE_ENTRY_FROM_FOLDER) {

			title = _language.format(
				locale, "x-moved-a-web-content-from-a-folder", userFullName);
		}
		else if (notificationType ==
					JournalArticleConstants.
						NOTIFICATION_TYPE_MOVE_ENTRY_FROM_TRASH) {

			title = _language.format(
				locale, "x-restored-a-web-content-from-the-recycle-bin",
				userFullName);
		}
		else if (notificationType ==
					JournalArticleConstants.
						NOTIFICATION_TYPE_MOVE_ENTRY_TO_FOLDER) {

			title = _language.format(
				locale, "x-moved-a-web-content-to-a-folder", userFullName);
		}
		else if (notificationType ==
					JournalArticleConstants.
						NOTIFICATION_TYPE_MOVE_ENTRY_TO_TRASH) {

			title = _language.format(
				locale, "x-moved-a-web-content-to-the-recycle-bin",
				userFullName);
		}

		return title;
	}

	@Reference
	private Html _html;

	@Reference
	private Language _language;

	@Reference
	private Portal _portal;

	@Reference
	private UserService _userService;

}