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

import com.liferay.headless.admin.taxonomy.client.dto.v1_0.KeywordActions;
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
public class KeywordActionsSerDes {

	public static KeywordActions toDTO(String json) {
		KeywordActionsJSONParser keywordActionsJSONParser =
			new KeywordActionsJSONParser();

		return keywordActionsJSONParser.parseToDTO(json);
	}

	public static KeywordActions[] toDTOs(String json) {
		KeywordActionsJSONParser keywordActionsJSONParser =
			new KeywordActionsJSONParser();

		return keywordActionsJSONParser.parseToDTOs(json);
	}

	public static String toJSON(KeywordActions keywordActions) {
		if (keywordActions == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (keywordActions.getDelete() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"delete\": ");

			sb.append(String.valueOf(keywordActions.getDelete()));
		}

		if (keywordActions.getGet() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"get\": ");

			sb.append(String.valueOf(keywordActions.getGet()));
		}

		if (keywordActions.getReplace() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"replace\": ");

			sb.append(String.valueOf(keywordActions.getReplace()));
		}

		if (keywordActions.getSubscribe() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subscribe\": ");

			sb.append(String.valueOf(keywordActions.getSubscribe()));
		}

		if (keywordActions.getUnsubscribe() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"unsubscribe\": ");

			sb.append(String.valueOf(keywordActions.getUnsubscribe()));
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		KeywordActionsJSONParser keywordActionsJSONParser =
			new KeywordActionsJSONParser();

		return keywordActionsJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(KeywordActions keywordActions) {
		if (keywordActions == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (keywordActions.getDelete() == null) {
			map.put("delete", null);
		}
		else {
			map.put("delete", String.valueOf(keywordActions.getDelete()));
		}

		if (keywordActions.getGet() == null) {
			map.put("get", null);
		}
		else {
			map.put("get", String.valueOf(keywordActions.getGet()));
		}

		if (keywordActions.getReplace() == null) {
			map.put("replace", null);
		}
		else {
			map.put("replace", String.valueOf(keywordActions.getReplace()));
		}

		if (keywordActions.getSubscribe() == null) {
			map.put("subscribe", null);
		}
		else {
			map.put("subscribe", String.valueOf(keywordActions.getSubscribe()));
		}

		if (keywordActions.getUnsubscribe() == null) {
			map.put("unsubscribe", null);
		}
		else {
			map.put(
				"unsubscribe", String.valueOf(keywordActions.getUnsubscribe()));
		}

		return map;
	}

	public static class KeywordActionsJSONParser
		extends BaseJSONParser<KeywordActions> {

		@Override
		protected KeywordActions createDTO() {
			return new KeywordActions();
		}

		@Override
		protected KeywordActions[] createDTOArray(int size) {
			return new KeywordActions[size];
		}

		@Override
		protected void setField(
			KeywordActions keywordActions, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "delete")) {
				if (jsonParserFieldValue != null) {
					keywordActions.setDelete(
						ActionSerDes.toDTO((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "get")) {
				if (jsonParserFieldValue != null) {
					keywordActions.setGet(
						ActionSerDes.toDTO((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "replace")) {
				if (jsonParserFieldValue != null) {
					keywordActions.setReplace(
						ActionSerDes.toDTO((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "subscribe")) {
				if (jsonParserFieldValue != null) {
					keywordActions.setSubscribe(
						ActionSerDes.toDTO((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "unsubscribe")) {
				if (jsonParserFieldValue != null) {
					keywordActions.setUnsubscribe(
						ActionSerDes.toDTO((String)jsonParserFieldValue));
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