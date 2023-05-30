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

package com.liferay.headless.admin.taxonomy.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("KeywordActions")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "KeywordActions")
public class KeywordActions implements Serializable {

	public static KeywordActions toDTO(String json) {
		return ObjectMapperUtil.readValue(KeywordActions.class, json);
	}

	public static KeywordActions unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(KeywordActions.class, json);
	}

	@Schema
	@Valid
	public Action getDelete() {
		return delete;
	}

	public void setDelete(Action delete) {
		this.delete = delete;
	}

	@JsonIgnore
	public void setDelete(
		UnsafeSupplier<Action, Exception> deleteUnsafeSupplier) {

		try {
			delete = deleteUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Action delete;

	@Schema
	@Valid
	public Action getGet() {
		return get;
	}

	public void setGet(Action get) {
		this.get = get;
	}

	@JsonIgnore
	public void setGet(UnsafeSupplier<Action, Exception> getUnsafeSupplier) {
		try {
			get = getUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Action get;

	@Schema
	@Valid
	public Action getReplace() {
		return replace;
	}

	public void setReplace(Action replace) {
		this.replace = replace;
	}

	@JsonIgnore
	public void setReplace(
		UnsafeSupplier<Action, Exception> replaceUnsafeSupplier) {

		try {
			replace = replaceUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Action replace;

	@Schema
	@Valid
	public Action getSubscribe() {
		return subscribe;
	}

	public void setSubscribe(Action subscribe) {
		this.subscribe = subscribe;
	}

	@JsonIgnore
	public void setSubscribe(
		UnsafeSupplier<Action, Exception> subscribeUnsafeSupplier) {

		try {
			subscribe = subscribeUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Action subscribe;

	@Schema
	@Valid
	public Action getUnsubscribe() {
		return unsubscribe;
	}

	public void setUnsubscribe(Action unsubscribe) {
		this.unsubscribe = unsubscribe;
	}

	@JsonIgnore
	public void setUnsubscribe(
		UnsafeSupplier<Action, Exception> unsubscribeUnsafeSupplier) {

		try {
			unsubscribe = unsubscribeUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Action unsubscribe;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof KeywordActions)) {
			return false;
		}

		KeywordActions keywordActions = (KeywordActions)object;

		return Objects.equals(toString(), keywordActions.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (delete != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"delete\": ");

			sb.append(String.valueOf(delete));
		}

		if (get != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"get\": ");

			sb.append(String.valueOf(get));
		}

		if (replace != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"replace\": ");

			sb.append(String.valueOf(replace));
		}

		if (subscribe != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subscribe\": ");

			sb.append(String.valueOf(subscribe));
		}

		if (unsubscribe != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"unsubscribe\": ");

			sb.append(String.valueOf(unsubscribe));
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.admin.taxonomy.dto.v1_0.KeywordActions",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		return StringUtil.replace(
			String.valueOf(object), _JSON_ESCAPE_STRINGS[0],
			_JSON_ESCAPE_STRINGS[1]);
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
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
			sb.append(_escape(entry.getKey()));
			sb.append("\": ");

			Object value = entry.getValue();

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(value));
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static final String[][] _JSON_ESCAPE_STRINGS = {
		{"\\", "\"", "\b", "\f", "\n", "\r", "\t"},
		{"\\\\", "\\\"", "\\b", "\\f", "\\n", "\\r", "\\t"}
	};

}