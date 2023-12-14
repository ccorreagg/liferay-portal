/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.search.experiences.rest.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
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
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@Generated("")
@GraphQLName("Rescore")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Rescore")
public class Rescore implements Serializable {

	public static Rescore toDTO(String json) {
		return ObjectMapperUtil.readValue(Rescore.class, json);
	}

	public static Rescore unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Rescore.class, json);
	}

	@Schema
	@Valid
	public Object getQuery() {
		if (query != null) {
			return query;
		}

		query = _querySupplier.get();

		return query;
	}

	public void setQuery(Object query) {
		this.query = query;

		_querySupplier = () -> query;
	}

	@JsonIgnore
	public void setQuery(
		UnsafeSupplier<Object, Exception> queryUnsafeSupplier) {

		query = null;

		_querySupplier = () -> {
			try {
				return queryUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Object query;

	private Supplier<Object> _querySupplier = () -> null;

	@Schema
	@Valid
	public Object getQueryWeight() {
		if (queryWeight != null) {
			return queryWeight;
		}

		queryWeight = _queryWeightSupplier.get();

		return queryWeight;
	}

	public void setQueryWeight(Object queryWeight) {
		this.queryWeight = queryWeight;

		_queryWeightSupplier = () -> queryWeight;
	}

	@JsonIgnore
	public void setQueryWeight(
		UnsafeSupplier<Object, Exception> queryWeightUnsafeSupplier) {

		queryWeight = null;

		_queryWeightSupplier = () -> {
			try {
				return queryWeightUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Object queryWeight;

	private Supplier<Object> _queryWeightSupplier = () -> null;

	@Schema
	@Valid
	public Object getRescoreQueryWeight() {
		if (rescoreQueryWeight != null) {
			return rescoreQueryWeight;
		}

		rescoreQueryWeight = _rescoreQueryWeightSupplier.get();

		return rescoreQueryWeight;
	}

	public void setRescoreQueryWeight(Object rescoreQueryWeight) {
		this.rescoreQueryWeight = rescoreQueryWeight;

		_rescoreQueryWeightSupplier = () -> rescoreQueryWeight;
	}

	@JsonIgnore
	public void setRescoreQueryWeight(
		UnsafeSupplier<Object, Exception> rescoreQueryWeightUnsafeSupplier) {

		rescoreQueryWeight = null;

		_rescoreQueryWeightSupplier = () -> {
			try {
				return rescoreQueryWeightUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Object rescoreQueryWeight;

	private Supplier<Object> _rescoreQueryWeightSupplier = () -> null;

	@Schema
	public String getScoreMode() {
		if (scoreMode != null) {
			return scoreMode;
		}

		scoreMode = _scoreModeSupplier.get();

		return scoreMode;
	}

	public void setScoreMode(String scoreMode) {
		this.scoreMode = scoreMode;

		_scoreModeSupplier = () -> scoreMode;
	}

	@JsonIgnore
	public void setScoreMode(
		UnsafeSupplier<String, Exception> scoreModeUnsafeSupplier) {

		scoreMode = null;

		_scoreModeSupplier = () -> {
			try {
				return scoreModeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String scoreMode;

	private Supplier<String> _scoreModeSupplier = () -> null;

	@Schema
	@Valid
	public Object getWindowSize() {
		if (windowSize != null) {
			return windowSize;
		}

		windowSize = _windowSizeSupplier.get();

		return windowSize;
	}

	public void setWindowSize(Object windowSize) {
		this.windowSize = windowSize;

		_windowSizeSupplier = () -> windowSize;
	}

	@JsonIgnore
	public void setWindowSize(
		UnsafeSupplier<Object, Exception> windowSizeUnsafeSupplier) {

		windowSize = null;

		_windowSizeSupplier = () -> {
			try {
				return windowSizeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Object windowSize;

	private Supplier<Object> _windowSizeSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Rescore)) {
			return false;
		}

		Rescore rescore = (Rescore)object;

		return Objects.equals(toString(), rescore.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (query != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"query\": ");

			if (query instanceof Map) {
				sb.append(JSONFactoryUtil.createJSONObject((Map<?, ?>)query));
			}
			else if (query instanceof String) {
				sb.append("\"");
				sb.append(_escape((String)query));
				sb.append("\"");
			}
			else {
				sb.append(query);
			}
		}

		if (queryWeight != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"queryWeight\": ");

			if (queryWeight instanceof Map) {
				sb.append(
					JSONFactoryUtil.createJSONObject((Map<?, ?>)queryWeight));
			}
			else if (queryWeight instanceof String) {
				sb.append("\"");
				sb.append(_escape((String)queryWeight));
				sb.append("\"");
			}
			else {
				sb.append(queryWeight);
			}
		}

		if (rescoreQueryWeight != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"rescoreQueryWeight\": ");

			if (rescoreQueryWeight instanceof Map) {
				sb.append(
					JSONFactoryUtil.createJSONObject(
						(Map<?, ?>)rescoreQueryWeight));
			}
			else if (rescoreQueryWeight instanceof String) {
				sb.append("\"");
				sb.append(_escape((String)rescoreQueryWeight));
				sb.append("\"");
			}
			else {
				sb.append(rescoreQueryWeight);
			}
		}

		if (scoreMode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"scoreMode\": ");

			sb.append("\"");

			sb.append(_escape(scoreMode));

			sb.append("\"");
		}

		if (windowSize != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"windowSize\": ");

			if (windowSize instanceof Map) {
				sb.append(
					JSONFactoryUtil.createJSONObject((Map<?, ?>)windowSize));
			}
			else if (windowSize instanceof String) {
				sb.append("\"");
				sb.append(_escape((String)windowSize));
				sb.append("\"");
			}
			else {
				sb.append(windowSize);
			}
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.search.experiences.rest.dto.v1_0.Rescore",
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

	private Map<String, Serializable> _extendedProperties;

}