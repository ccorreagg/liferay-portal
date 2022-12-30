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

package com.liferay.headless.user.notification.internal.dto.v1_0;

import com.liferay.headless.user.notification.dto.v1_0.UserNotification;
import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMap;
import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMapFactory;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.UserNotificationEvent;
import com.liferay.portal.kernel.notifications.NotificationsHelper;
import com.liferay.portal.kernel.service.UserNotificationEventLocalService;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;

import java.util.Date;
import java.util.Locale;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(
	property = "dto.class.name=com.liferay.portal.kernel.model.UserNotificationEvent",
	service = {DTOConverter.class, UserNotificationDTOConverter.class}
)
public class UserNotificationDTOConverter
	implements DTOConverter<UserNotificationEvent, UserNotification> {

	@Override
	public String getContentType() {
		return UserNotification.class.getSimpleName();
	}

	@Override
	public UserNotificationEvent getObject(String externalReferenceCode)
		throws Exception {

		return _userNotificationEventLocalService.getUserNotificationEvent(
			GetterUtil.getLong(externalReferenceCode));
	}

	@Override
	public UserNotification toDTO(
			DTOConverterContext dtoConverterContext,
			UserNotificationEvent userNotificationEvent)
		throws Exception {

		JSONObject jsonObject = _jsonFactory.createJSONObject(
			userNotificationEvent.getPayload());

		return new UserNotification() {
			{
				if (dtoConverterContext != null) {
					actions = dtoConverterContext.getActions();
				}

				dateCreated = new Date(userNotificationEvent.getTimestamp());
				id = userNotificationEvent.getUserNotificationEventId();
				message = _getNotificationMessage(
					jsonObject, dtoConverterContext.getLocale());
				read = userNotificationEvent.isArchived();

				if (jsonObject.has("notificationType")) {
					type = jsonObject.getInt("notificationType");
				}
			}
		};
	}

	private String _getNotificationMessage(JSONObject jsonObject, Locale locale)
		throws Exception {

		String className = jsonObject.getString("className");

		NotificationsHelper notificationsHelper = _getNotificationsHelper(
			className);

		if (notificationsHelper != null) {
			jsonObject = notificationsHelper.getJSONObject(jsonObject, locale);
		}

		if (jsonObject.has("notificationMessage")) {
			return jsonObject.getString("notificationMessage");
		}

		return jsonObject.toString();
	}

	private NotificationsHelper _getNotificationsHelper(String className) {
		if (_serviceTrackerMap == null) {
			Bundle bundle = FrameworkUtil.getBundle(
				UserNotificationDTOConverter.class);

			BundleContext bundleContext = bundle.getBundleContext();

			_serviceTrackerMap = ServiceTrackerMapFactory.openSingleValueMap(
				bundleContext, NotificationsHelper.class, null,
				(serviceReference, emitter) -> {
					NotificationsHelper notificationsHelper =
						bundleContext.getService(serviceReference);

					emitter.emit(notificationsHelper.getClassName());
				});
		}

		return _serviceTrackerMap.getService(className);
	}

	@Reference
	private JSONFactory _jsonFactory;

	private ServiceTrackerMap<String, NotificationsHelper> _serviceTrackerMap;

	@Reference
	private UserNotificationEventLocalService
		_userNotificationEventLocalService;

}