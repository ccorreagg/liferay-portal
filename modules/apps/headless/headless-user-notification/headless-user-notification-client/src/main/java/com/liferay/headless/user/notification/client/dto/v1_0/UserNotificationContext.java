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

package com.liferay.headless.user.notification.client.dto.v1_0;

import com.liferay.headless.user.notification.client.function.UnsafeSupplier;
import com.liferay.headless.user.notification.client.serdes.v1_0.UserNotificationContextSerDes;

import java.io.Serializable;

import java.util.Map;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Carlos Correa
 * @generated
 */
@Generated("")
public class UserNotificationContext implements Cloneable, Serializable {

	public static UserNotificationContext toDTO(String json) {
		return UserNotificationContextSerDes.toDTO(json);
	}

	public Map<String, Map<String, String>> getNotifier() {
		return notifier;
	}

	public void setNotifier(Map<String, Map<String, String>> notifier) {
		this.notifier = notifier;
	}

	public void setNotifier(
		UnsafeSupplier<Map<String, Map<String, String>>, Exception>
			notifierUnsafeSupplier) {

		try {
			notifier = notifierUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Map<String, Map<String, String>> notifier;

	@Override
	public UserNotificationContext clone() throws CloneNotSupportedException {
		return (UserNotificationContext)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserNotificationContext)) {
			return false;
		}

		UserNotificationContext userNotificationContext =
			(UserNotificationContext)object;

		return Objects.equals(toString(), userNotificationContext.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return UserNotificationContextSerDes.toJSON(this);
	}

}