/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.data.engine.rest.dto.v2_0;

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
 * @author Jeyvison Nascimento
 * @generated
 */
@Generated("")
@GraphQLName("DataRule")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "DataRule")
public class DataRule implements Serializable {

	public static DataRule toDTO(String json) {
		return ObjectMapperUtil.readValue(DataRule.class, json);
	}

	public static DataRule unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(DataRule.class, json);
	}

	@Schema
	@Valid
	public Map[] getActions() {
		if (actions != null) {
			return actions;
		}

		actions = _actionsSupplier.get();

		return actions;
	}

	public void setActions(Map[] actions) {
		this.actions = actions;

		_actionsSupplier = () -> actions;
	}

	@JsonIgnore
	public void setActions(
		UnsafeSupplier<Map[], Exception> actionsUnsafeSupplier) {

		actions = null;

		_actionsSupplier = () -> {
			try {
				return actionsUnsafeSupplier.get();
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
	protected Map[] actions;

	private Supplier<Map[]> _actionsSupplier = () -> null;

	@Schema
	@Valid
	public Map[] getConditions() {
		if (conditions != null) {
			return conditions;
		}

		conditions = _conditionsSupplier.get();

		return conditions;
	}

	public void setConditions(Map[] conditions) {
		this.conditions = conditions;

		_conditionsSupplier = () -> conditions;
	}

	@JsonIgnore
	public void setConditions(
		UnsafeSupplier<Map[], Exception> conditionsUnsafeSupplier) {

		conditions = null;

		_conditionsSupplier = () -> {
			try {
				return conditionsUnsafeSupplier.get();
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
	protected Map[] conditions;

	private Supplier<Map[]> _conditionsSupplier = () -> null;

	@Schema
	public String getLogicalOperator() {
		if (logicalOperator != null) {
			return logicalOperator;
		}

		logicalOperator = _logicalOperatorSupplier.get();

		return logicalOperator;
	}

	public void setLogicalOperator(String logicalOperator) {
		this.logicalOperator = logicalOperator;

		_logicalOperatorSupplier = () -> logicalOperator;
	}

	@JsonIgnore
	public void setLogicalOperator(
		UnsafeSupplier<String, Exception> logicalOperatorUnsafeSupplier) {

		logicalOperator = null;

		_logicalOperatorSupplier = () -> {
			try {
				return logicalOperatorUnsafeSupplier.get();
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
	protected String logicalOperator;

	private Supplier<String> _logicalOperatorSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, Object> getName() {
		if (name != null) {
			return name;
		}

		name = _nameSupplier.get();

		return name;
	}

	public void setName(Map<String, Object> name) {
		this.name = name;

		_nameSupplier = () -> name;
	}

	@JsonIgnore
	public void setName(
		UnsafeSupplier<Map<String, Object>, Exception> nameUnsafeSupplier) {

		name = null;

		_nameSupplier = () -> {
			try {
				return nameUnsafeSupplier.get();
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
	protected Map<String, Object> name;

	private Supplier<Map<String, Object>> _nameSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DataRule)) {
			return false;
		}

		DataRule dataRule = (DataRule)object;

		return Objects.equals(toString(), dataRule.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (actions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actions\": ");

			sb.append("[");

			for (int i = 0; i < actions.length; i++) {
				sb.append(actions[i]);

				if ((i + 1) < actions.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (conditions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"conditions\": ");

			sb.append("[");

			for (int i = 0; i < conditions.length; i++) {
				sb.append(conditions[i]);

				if ((i + 1) < conditions.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (logicalOperator != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"logicalOperator\": ");

			sb.append("\"");

			sb.append(_escape(logicalOperator));

			sb.append("\"");
		}

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append(_toJSON(name));
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.data.engine.rest.dto.v2_0.DataRule",
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