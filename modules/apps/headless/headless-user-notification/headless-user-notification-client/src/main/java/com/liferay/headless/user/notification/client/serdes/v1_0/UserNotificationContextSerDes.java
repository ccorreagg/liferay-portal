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

package com.liferay.headless.user.notification.client.serdes.v1_0;

import com.liferay.headless.user.notification.client.dto.v1_0.UserNotificationContext;
import com.liferay.headless.user.notification.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author Carlos Correa
 * @generated
 */
@Generated("")
public class UserNotificationContextSerDes {

	public static UserNotificationContext toDTO(String json) {
		UserNotificationContextJSONParser userNotificationContextJSONParser =
			new UserNotificationContextJSONParser();

		return userNotificationContextJSONParser.parseToDTO(json);
	}

	public static UserNotificationContext[] toDTOs(String json) {
		UserNotificationContextJSONParser userNotificationContextJSONParser =
			new UserNotificationContextJSONParser();

		return userNotificationContextJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		UserNotificationContext userNotificationContext) {

		if (userNotificationContext == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (userNotificationContext.getNotifier() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"notifier\": ");

			sb.append(_toJSON(userNotificationContext.getNotifier()));
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		UserNotificationContextJSONParser userNotificationContextJSONParser =
			new UserNotificationContextJSONParser();

		return userNotificationContextJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		UserNotificationContext userNotificationContext) {

		if (userNotificationContext == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (userNotificationContext.getNotifier() == null) {
			map.put("notifier", null);
		}
		else {
			map.put(
				"notifier",
				String.valueOf(userNotificationContext.getNotifier()));
		}

		return map;
	}

	public static class UserNotificationContextJSONParser
		extends BaseJSONParser<UserNotificationContext> {

		@Override
		protected UserNotificationContext createDTO() {
			return new UserNotificationContext();
		}

		@Override
		protected UserNotificationContext[] createDTOArray(int size) {
			return new UserNotificationContext[size];
		}

		@Override
		protected void setField(
			UserNotificationContext userNotificationContext,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "notifier")) {
				if (jsonParserFieldValue != null) {
					userNotificationContext.setNotifier(
						(Map)UserNotificationContextSerDes.toMap(
							(String)jsonParserFieldValue));
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}