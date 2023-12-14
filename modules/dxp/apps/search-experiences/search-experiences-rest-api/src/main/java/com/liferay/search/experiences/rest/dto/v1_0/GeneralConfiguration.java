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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@Generated("")
@GraphQLName("GeneralConfiguration")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "GeneralConfiguration")
public class GeneralConfiguration implements Serializable {

	public static GeneralConfiguration toDTO(String json) {
		return ObjectMapperUtil.readValue(GeneralConfiguration.class, json);
	}

	public static GeneralConfiguration unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			GeneralConfiguration.class, json);
	}

	@Schema
	public String[] getClauseContributorsExcludes() {
		if (clauseContributorsExcludes != null) {
			return clauseContributorsExcludes;
		}

		clauseContributorsExcludes = _clauseContributorsExcludesSupplier.get();

		return clauseContributorsExcludes;
	}

	public void setClauseContributorsExcludes(
		String[] clauseContributorsExcludes) {

		this.clauseContributorsExcludes = clauseContributorsExcludes;

		_clauseContributorsExcludesSupplier = () -> clauseContributorsExcludes;
	}

	@JsonIgnore
	public void setClauseContributorsExcludes(
		UnsafeSupplier<String[], Exception>
			clauseContributorsExcludesUnsafeSupplier) {

		clauseContributorsExcludes = null;

		_clauseContributorsExcludesSupplier = () -> {
			try {
				return clauseContributorsExcludesUnsafeSupplier.get();
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
	protected String[] clauseContributorsExcludes;

	private Supplier<String[]> _clauseContributorsExcludesSupplier = () -> null;

	@Schema
	public String[] getClauseContributorsIncludes() {
		if (clauseContributorsIncludes != null) {
			return clauseContributorsIncludes;
		}

		clauseContributorsIncludes = _clauseContributorsIncludesSupplier.get();

		return clauseContributorsIncludes;
	}

	public void setClauseContributorsIncludes(
		String[] clauseContributorsIncludes) {

		this.clauseContributorsIncludes = clauseContributorsIncludes;

		_clauseContributorsIncludesSupplier = () -> clauseContributorsIncludes;
	}

	@JsonIgnore
	public void setClauseContributorsIncludes(
		UnsafeSupplier<String[], Exception>
			clauseContributorsIncludesUnsafeSupplier) {

		clauseContributorsIncludes = null;

		_clauseContributorsIncludesSupplier = () -> {
			try {
				return clauseContributorsIncludesUnsafeSupplier.get();
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
	protected String[] clauseContributorsIncludes;

	private Supplier<String[]> _clauseContributorsIncludesSupplier = () -> null;

	@Schema
	public Boolean getEmptySearchEnabled() {
		if (emptySearchEnabled != null) {
			return emptySearchEnabled;
		}

		emptySearchEnabled = _emptySearchEnabledSupplier.get();

		return emptySearchEnabled;
	}

	public void setEmptySearchEnabled(Boolean emptySearchEnabled) {
		this.emptySearchEnabled = emptySearchEnabled;

		_emptySearchEnabledSupplier = () -> emptySearchEnabled;
	}

	@JsonIgnore
	public void setEmptySearchEnabled(
		UnsafeSupplier<Boolean, Exception> emptySearchEnabledUnsafeSupplier) {

		emptySearchEnabled = null;

		_emptySearchEnabledSupplier = () -> {
			try {
				return emptySearchEnabledUnsafeSupplier.get();
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
	protected Boolean emptySearchEnabled;

	private Supplier<Boolean> _emptySearchEnabledSupplier = () -> null;

	@Schema
	public Boolean getExplain() {
		if (explain != null) {
			return explain;
		}

		explain = _explainSupplier.get();

		return explain;
	}

	public void setExplain(Boolean explain) {
		this.explain = explain;

		_explainSupplier = () -> explain;
	}

	@JsonIgnore
	public void setExplain(
		UnsafeSupplier<Boolean, Exception> explainUnsafeSupplier) {

		explain = null;

		_explainSupplier = () -> {
			try {
				return explainUnsafeSupplier.get();
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
	protected Boolean explain;

	private Supplier<Boolean> _explainSupplier = () -> null;

	@Schema
	public Boolean getIncludeResponseString() {
		if (includeResponseString != null) {
			return includeResponseString;
		}

		includeResponseString = _includeResponseStringSupplier.get();

		return includeResponseString;
	}

	public void setIncludeResponseString(Boolean includeResponseString) {
		this.includeResponseString = includeResponseString;

		_includeResponseStringSupplier = () -> includeResponseString;
	}

	@JsonIgnore
	public void setIncludeResponseString(
		UnsafeSupplier<Boolean, Exception>
			includeResponseStringUnsafeSupplier) {

		includeResponseString = null;

		_includeResponseStringSupplier = () -> {
			try {
				return includeResponseStringUnsafeSupplier.get();
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
	protected Boolean includeResponseString;

	private Supplier<Boolean> _includeResponseStringSupplier = () -> null;

	@Schema
	public String getLanguageId() {
		if (languageId != null) {
			return languageId;
		}

		languageId = _languageIdSupplier.get();

		return languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;

		_languageIdSupplier = () -> languageId;
	}

	@JsonIgnore
	public void setLanguageId(
		UnsafeSupplier<String, Exception> languageIdUnsafeSupplier) {

		languageId = null;

		_languageIdSupplier = () -> {
			try {
				return languageIdUnsafeSupplier.get();
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
	protected String languageId;

	private Supplier<String> _languageIdSupplier = () -> null;

	@Schema
	public String getQueryString() {
		if (queryString != null) {
			return queryString;
		}

		queryString = _queryStringSupplier.get();

		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;

		_queryStringSupplier = () -> queryString;
	}

	@JsonIgnore
	public void setQueryString(
		UnsafeSupplier<String, Exception> queryStringUnsafeSupplier) {

		queryString = null;

		_queryStringSupplier = () -> {
			try {
				return queryStringUnsafeSupplier.get();
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
	protected String queryString;

	private Supplier<String> _queryStringSupplier = () -> null;

	@Schema
	public String[] getSearchableAssetTypes() {
		if (searchableAssetTypes != null) {
			return searchableAssetTypes;
		}

		searchableAssetTypes = _searchableAssetTypesSupplier.get();

		return searchableAssetTypes;
	}

	public void setSearchableAssetTypes(String[] searchableAssetTypes) {
		this.searchableAssetTypes = searchableAssetTypes;

		_searchableAssetTypesSupplier = () -> searchableAssetTypes;
	}

	@JsonIgnore
	public void setSearchableAssetTypes(
		UnsafeSupplier<String[], Exception>
			searchableAssetTypesUnsafeSupplier) {

		searchableAssetTypes = null;

		_searchableAssetTypesSupplier = () -> {
			try {
				return searchableAssetTypesUnsafeSupplier.get();
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
	protected String[] searchableAssetTypes;

	private Supplier<String[]> _searchableAssetTypesSupplier = () -> null;

	@Schema
	public String getTimeZoneId() {
		if (timeZoneId != null) {
			return timeZoneId;
		}

		timeZoneId = _timeZoneIdSupplier.get();

		return timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;

		_timeZoneIdSupplier = () -> timeZoneId;
	}

	@JsonIgnore
	public void setTimeZoneId(
		UnsafeSupplier<String, Exception> timeZoneIdUnsafeSupplier) {

		timeZoneId = null;

		_timeZoneIdSupplier = () -> {
			try {
				return timeZoneIdUnsafeSupplier.get();
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
	protected String timeZoneId;

	private Supplier<String> _timeZoneIdSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GeneralConfiguration)) {
			return false;
		}

		GeneralConfiguration generalConfiguration =
			(GeneralConfiguration)object;

		return Objects.equals(toString(), generalConfiguration.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (clauseContributorsExcludes != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"clauseContributorsExcludes\": ");

			sb.append("[");

			for (int i = 0; i < clauseContributorsExcludes.length; i++) {
				sb.append("\"");

				sb.append(_escape(clauseContributorsExcludes[i]));

				sb.append("\"");

				if ((i + 1) < clauseContributorsExcludes.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (clauseContributorsIncludes != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"clauseContributorsIncludes\": ");

			sb.append("[");

			for (int i = 0; i < clauseContributorsIncludes.length; i++) {
				sb.append("\"");

				sb.append(_escape(clauseContributorsIncludes[i]));

				sb.append("\"");

				if ((i + 1) < clauseContributorsIncludes.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (emptySearchEnabled != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"emptySearchEnabled\": ");

			sb.append(emptySearchEnabled);
		}

		if (explain != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"explain\": ");

			sb.append(explain);
		}

		if (includeResponseString != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"includeResponseString\": ");

			sb.append(includeResponseString);
		}

		if (languageId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"languageId\": ");

			sb.append("\"");

			sb.append(_escape(languageId));

			sb.append("\"");
		}

		if (queryString != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"queryString\": ");

			sb.append("\"");

			sb.append(_escape(queryString));

			sb.append("\"");
		}

		if (searchableAssetTypes != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"searchableAssetTypes\": ");

			sb.append("[");

			for (int i = 0; i < searchableAssetTypes.length; i++) {
				sb.append("\"");

				sb.append(_escape(searchableAssetTypes[i]));

				sb.append("\"");

				if ((i + 1) < searchableAssetTypes.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (timeZoneId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"timeZoneId\": ");

			sb.append("\"");

			sb.append(_escape(timeZoneId));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.search.experiences.rest.dto.v1_0.GeneralConfiguration",
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