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

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@Generated("")
@GraphQLName("Configuration")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Configuration")
public class Configuration implements Serializable {

	public static Configuration toDTO(String json) {
		return ObjectMapperUtil.readValue(Configuration.class, json);
	}

	public static Configuration unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Configuration.class, json);
	}

	@Schema
	@Valid
	public AdvancedConfiguration getAdvancedConfiguration() {
		if (advancedConfiguration != null) {
			return advancedConfiguration;
		}

		advancedConfiguration = _advancedConfigurationSupplier.get();

		return advancedConfiguration;
	}

	public void setAdvancedConfiguration(
		AdvancedConfiguration advancedConfiguration) {

		this.advancedConfiguration = advancedConfiguration;

		_advancedConfigurationSupplier = () -> advancedConfiguration;
	}

	@JsonIgnore
	public void setAdvancedConfiguration(
		UnsafeSupplier<AdvancedConfiguration, Exception>
			advancedConfigurationUnsafeSupplier) {

		advancedConfiguration = null;

		_advancedConfigurationSupplier = () -> {
			try {
				return advancedConfigurationUnsafeSupplier.get();
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
	protected AdvancedConfiguration advancedConfiguration;

	private Supplier<AdvancedConfiguration> _advancedConfigurationSupplier =
		() -> null;

	@Schema
	@Valid
	public AggregationConfiguration getAggregationConfiguration() {
		if (aggregationConfiguration != null) {
			return aggregationConfiguration;
		}

		aggregationConfiguration = _aggregationConfigurationSupplier.get();

		return aggregationConfiguration;
	}

	public void setAggregationConfiguration(
		AggregationConfiguration aggregationConfiguration) {

		this.aggregationConfiguration = aggregationConfiguration;

		_aggregationConfigurationSupplier = () -> aggregationConfiguration;
	}

	@JsonIgnore
	public void setAggregationConfiguration(
		UnsafeSupplier<AggregationConfiguration, Exception>
			aggregationConfigurationUnsafeSupplier) {

		aggregationConfiguration = null;

		_aggregationConfigurationSupplier = () -> {
			try {
				return aggregationConfigurationUnsafeSupplier.get();
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
	protected AggregationConfiguration aggregationConfiguration;

	private Supplier<AggregationConfiguration>
		_aggregationConfigurationSupplier = () -> null;

	@Schema
	@Valid
	public GeneralConfiguration getGeneralConfiguration() {
		if (generalConfiguration != null) {
			return generalConfiguration;
		}

		generalConfiguration = _generalConfigurationSupplier.get();

		return generalConfiguration;
	}

	public void setGeneralConfiguration(
		GeneralConfiguration generalConfiguration) {

		this.generalConfiguration = generalConfiguration;

		_generalConfigurationSupplier = () -> generalConfiguration;
	}

	@JsonIgnore
	public void setGeneralConfiguration(
		UnsafeSupplier<GeneralConfiguration, Exception>
			generalConfigurationUnsafeSupplier) {

		generalConfiguration = null;

		_generalConfigurationSupplier = () -> {
			try {
				return generalConfigurationUnsafeSupplier.get();
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
	protected GeneralConfiguration generalConfiguration;

	private Supplier<GeneralConfiguration> _generalConfigurationSupplier =
		() -> null;

	@Schema
	@Valid
	public HighlightConfiguration getHighlightConfiguration() {
		if (highlightConfiguration != null) {
			return highlightConfiguration;
		}

		highlightConfiguration = _highlightConfigurationSupplier.get();

		return highlightConfiguration;
	}

	public void setHighlightConfiguration(
		HighlightConfiguration highlightConfiguration) {

		this.highlightConfiguration = highlightConfiguration;

		_highlightConfigurationSupplier = () -> highlightConfiguration;
	}

	@JsonIgnore
	public void setHighlightConfiguration(
		UnsafeSupplier<HighlightConfiguration, Exception>
			highlightConfigurationUnsafeSupplier) {

		highlightConfiguration = null;

		_highlightConfigurationSupplier = () -> {
			try {
				return highlightConfigurationUnsafeSupplier.get();
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
	protected HighlightConfiguration highlightConfiguration;

	private Supplier<HighlightConfiguration> _highlightConfigurationSupplier =
		() -> null;

	@Schema
	@Valid
	public IndexConfiguration getIndexConfiguration() {
		if (indexConfiguration != null) {
			return indexConfiguration;
		}

		indexConfiguration = _indexConfigurationSupplier.get();

		return indexConfiguration;
	}

	public void setIndexConfiguration(IndexConfiguration indexConfiguration) {
		this.indexConfiguration = indexConfiguration;

		_indexConfigurationSupplier = () -> indexConfiguration;
	}

	@JsonIgnore
	public void setIndexConfiguration(
		UnsafeSupplier<IndexConfiguration, Exception>
			indexConfigurationUnsafeSupplier) {

		indexConfiguration = null;

		_indexConfigurationSupplier = () -> {
			try {
				return indexConfigurationUnsafeSupplier.get();
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
	protected IndexConfiguration indexConfiguration;

	private Supplier<IndexConfiguration> _indexConfigurationSupplier =
		() -> null;

	@Schema
	@Valid
	public ParameterConfiguration getParameterConfiguration() {
		if (parameterConfiguration != null) {
			return parameterConfiguration;
		}

		parameterConfiguration = _parameterConfigurationSupplier.get();

		return parameterConfiguration;
	}

	public void setParameterConfiguration(
		ParameterConfiguration parameterConfiguration) {

		this.parameterConfiguration = parameterConfiguration;

		_parameterConfigurationSupplier = () -> parameterConfiguration;
	}

	@JsonIgnore
	public void setParameterConfiguration(
		UnsafeSupplier<ParameterConfiguration, Exception>
			parameterConfigurationUnsafeSupplier) {

		parameterConfiguration = null;

		_parameterConfigurationSupplier = () -> {
			try {
				return parameterConfigurationUnsafeSupplier.get();
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
	protected ParameterConfiguration parameterConfiguration;

	private Supplier<ParameterConfiguration> _parameterConfigurationSupplier =
		() -> null;

	@Schema
	@Valid
	public QueryConfiguration getQueryConfiguration() {
		if (queryConfiguration != null) {
			return queryConfiguration;
		}

		queryConfiguration = _queryConfigurationSupplier.get();

		return queryConfiguration;
	}

	public void setQueryConfiguration(QueryConfiguration queryConfiguration) {
		this.queryConfiguration = queryConfiguration;

		_queryConfigurationSupplier = () -> queryConfiguration;
	}

	@JsonIgnore
	public void setQueryConfiguration(
		UnsafeSupplier<QueryConfiguration, Exception>
			queryConfigurationUnsafeSupplier) {

		queryConfiguration = null;

		_queryConfigurationSupplier = () -> {
			try {
				return queryConfigurationUnsafeSupplier.get();
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
	protected QueryConfiguration queryConfiguration;

	private Supplier<QueryConfiguration> _queryConfigurationSupplier =
		() -> null;

	@Schema
	@Valid
	public Map<String, Object> getSearchContextAttributes() {
		if (searchContextAttributes != null) {
			return searchContextAttributes;
		}

		searchContextAttributes = _searchContextAttributesSupplier.get();

		return searchContextAttributes;
	}

	public void setSearchContextAttributes(
		Map<String, Object> searchContextAttributes) {

		this.searchContextAttributes = searchContextAttributes;

		_searchContextAttributesSupplier = () -> searchContextAttributes;
	}

	@JsonIgnore
	public void setSearchContextAttributes(
		UnsafeSupplier<Map<String, Object>, Exception>
			searchContextAttributesUnsafeSupplier) {

		searchContextAttributes = null;

		_searchContextAttributesSupplier = () -> {
			try {
				return searchContextAttributesUnsafeSupplier.get();
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
	protected Map<String, Object> searchContextAttributes;

	private Supplier<Map<String, Object>> _searchContextAttributesSupplier =
		() -> null;

	@Schema
	@Valid
	public SortConfiguration getSortConfiguration() {
		if (sortConfiguration != null) {
			return sortConfiguration;
		}

		sortConfiguration = _sortConfigurationSupplier.get();

		return sortConfiguration;
	}

	public void setSortConfiguration(SortConfiguration sortConfiguration) {
		this.sortConfiguration = sortConfiguration;

		_sortConfigurationSupplier = () -> sortConfiguration;
	}

	@JsonIgnore
	public void setSortConfiguration(
		UnsafeSupplier<SortConfiguration, Exception>
			sortConfigurationUnsafeSupplier) {

		sortConfiguration = null;

		_sortConfigurationSupplier = () -> {
			try {
				return sortConfigurationUnsafeSupplier.get();
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
	protected SortConfiguration sortConfiguration;

	private Supplier<SortConfiguration> _sortConfigurationSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Configuration)) {
			return false;
		}

		Configuration configuration = (Configuration)object;

		return Objects.equals(toString(), configuration.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (advancedConfiguration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"advancedConfiguration\": ");

			sb.append(String.valueOf(advancedConfiguration));
		}

		if (aggregationConfiguration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"aggregationConfiguration\": ");

			sb.append(String.valueOf(aggregationConfiguration));
		}

		if (generalConfiguration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"generalConfiguration\": ");

			sb.append(String.valueOf(generalConfiguration));
		}

		if (highlightConfiguration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"highlightConfiguration\": ");

			sb.append(String.valueOf(highlightConfiguration));
		}

		if (indexConfiguration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"indexConfiguration\": ");

			sb.append(String.valueOf(indexConfiguration));
		}

		if (parameterConfiguration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parameterConfiguration\": ");

			sb.append(String.valueOf(parameterConfiguration));
		}

		if (queryConfiguration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"queryConfiguration\": ");

			sb.append(String.valueOf(queryConfiguration));
		}

		if (searchContextAttributes != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"searchContextAttributes\": ");

			sb.append(_toJSON(searchContextAttributes));
		}

		if (sortConfiguration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sortConfiguration\": ");

			sb.append(String.valueOf(sortConfiguration));
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.search.experiences.rest.dto.v1_0.Configuration",
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