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

package com.liferay.headless.admin.taxonomy.client.serdes.v1_0;

import com.liferay.headless.admin.taxonomy.client.dto.v1_0.Action;
import com.liferay.headless.admin.taxonomy.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ActionSerDes {

	public static Action toDTO(String json) {
		ActionJSONParser actionJSONParser = new ActionJSONParser();

		return actionJSONParser.parseToDTO(json);
	}

	public static Action[] toDTOs(String json) {
		ActionJSONParser actionJSONParser = new ActionJSONParser();

		return actionJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Action action) {
		if (action == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (action.getHref() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"href\": ");

			sb.append("\"");

			sb.append(_escape(action.getHref()));

			sb.append("\"");
		}

		if (action.getMethod() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"method\": ");

			sb.append("\"");

			sb.append(_escape(action.getMethod()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ActionJSONParser actionJSONParser = new ActionJSONParser();

		return actionJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Action action) {
		if (action == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (action.getHref() == null) {
			map.put("href", null);
		}
		else {
			map.put("href", String.valueOf(action.getHref()));
		}

		if (action.getMethod() == null) {
			map.put("method", null);
		}
		else {
			map.put("method", String.valueOf(action.getMethod()));
		}

		return map;
	}

	public static class ActionJSONParser extends BaseJSONParser<Action> {

		@Override
		protected Action createDTO() {
			return new Action();
		}

		@Override
		protected Action[] createDTOArray(int size) {
			return new Action[size];
		}

		@Override
		protected void setField(
			Action action, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "href")) {
				if (jsonParserFieldValue != null) {
					action.setHref((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "method")) {
				if (jsonParserFieldValue != null) {
					action.setMethod((String)jsonParserFieldValue);
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