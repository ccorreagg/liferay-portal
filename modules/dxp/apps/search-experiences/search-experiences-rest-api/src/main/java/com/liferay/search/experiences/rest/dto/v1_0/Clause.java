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
@GraphQLName("Clause")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Clause")
public class Clause implements Serializable {

	public static Clause toDTO(String json) {
		return ObjectMapperUtil.readValue(Clause.class, json);
	}

	public static Clause unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Clause.class, json);
	}

	@Schema
	public Boolean getAdditive() {
		if (additive != null) {
			return additive;
		}

		additive = _additiveSupplier.get();

		return additive;
	}

	public void setAdditive(Boolean additive) {
		this.additive = additive;

		_additiveSupplier = () -> additive;
	}

	@JsonIgnore
	public void setAdditive(
		UnsafeSupplier<Boolean, Exception> additiveUnsafeSupplier) {

		additive = null;

		_additiveSupplier = () -> {
			try {
				return additiveUnsafeSupplier.get();
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
	protected Boolean additive;

	private Supplier<Boolean> _additiveSupplier = () -> null;

	@Schema
	@Valid
	public Float getBoost() {
		if (boost != null) {
			return boost;
		}

		boost = _boostSupplier.get();

		return boost;
	}

	public void setBoost(Float boost) {
		this.boost = boost;

		_boostSupplier = () -> boost;
	}

	@JsonIgnore
	public void setBoost(UnsafeSupplier<Float, Exception> boostUnsafeSupplier) {
		boost = null;

		_boostSupplier = () -> {
			try {
				return boostUnsafeSupplier.get();
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
	protected Float boost;

	private Supplier<Float> _boostSupplier = () -> null;

	@Schema
	public String getContext() {
		if (context != null) {
			return context;
		}

		context = _contextSupplier.get();

		return context;
	}

	public void setContext(String context) {
		this.context = context;

		_contextSupplier = () -> context;
	}

	@JsonIgnore
	public void setContext(
		UnsafeSupplier<String, Exception> contextUnsafeSupplier) {

		context = null;

		_contextSupplier = () -> {
			try {
				return contextUnsafeSupplier.get();
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
	protected String context;

	private Supplier<String> _contextSupplier = () -> null;

	@Schema
	public Boolean getDisabled() {
		if (disabled != null) {
			return disabled;
		}

		disabled = _disabledSupplier.get();

		return disabled;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;

		_disabledSupplier = () -> disabled;
	}

	@JsonIgnore
	public void setDisabled(
		UnsafeSupplier<Boolean, Exception> disabledUnsafeSupplier) {

		disabled = null;

		_disabledSupplier = () -> {
			try {
				return disabledUnsafeSupplier.get();
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
	protected Boolean disabled;

	private Supplier<Boolean> _disabledSupplier = () -> null;

	@Schema
	public String getField() {
		if (field != null) {
			return field;
		}

		field = _fieldSupplier.get();

		return field;
	}

	public void setField(String field) {
		this.field = field;

		_fieldSupplier = () -> field;
	}

	@JsonIgnore
	public void setField(
		UnsafeSupplier<String, Exception> fieldUnsafeSupplier) {

		field = null;

		_fieldSupplier = () -> {
			try {
				return fieldUnsafeSupplier.get();
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
	protected String field;

	private Supplier<String> _fieldSupplier = () -> null;

	@Schema
	public String getName() {
		if (name != null) {
			return name;
		}

		name = _nameSupplier.get();

		return name;
	}

	public void setName(String name) {
		this.name = name;

		_nameSupplier = () -> name;
	}

	@JsonIgnore
	public void setName(UnsafeSupplier<String, Exception> nameUnsafeSupplier) {
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
	protected String name;

	private Supplier<String> _nameSupplier = () -> null;

	@Schema
	public String getOccur() {
		if (occur != null) {
			return occur;
		}

		occur = _occurSupplier.get();

		return occur;
	}

	public void setOccur(String occur) {
		this.occur = occur;

		_occurSupplier = () -> occur;
	}

	@JsonIgnore
	public void setOccur(
		UnsafeSupplier<String, Exception> occurUnsafeSupplier) {

		occur = null;

		_occurSupplier = () -> {
			try {
				return occurUnsafeSupplier.get();
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
	protected String occur;

	private Supplier<String> _occurSupplier = () -> null;

	@Schema
	public String getParent() {
		if (parent != null) {
			return parent;
		}

		parent = _parentSupplier.get();

		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;

		_parentSupplier = () -> parent;
	}

	@JsonIgnore
	public void setParent(
		UnsafeSupplier<String, Exception> parentUnsafeSupplier) {

		parent = null;

		_parentSupplier = () -> {
			try {
				return parentUnsafeSupplier.get();
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
	protected String parent;

	private Supplier<String> _parentSupplier = () -> null;

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
	public String getType() {
		if (type != null) {
			return type;
		}

		type = _typeSupplier.get();

		return type;
	}

	public void setType(String type) {
		this.type = type;

		_typeSupplier = () -> type;
	}

	@JsonIgnore
	public void setType(UnsafeSupplier<String, Exception> typeUnsafeSupplier) {
		type = null;

		_typeSupplier = () -> {
			try {
				return typeUnsafeSupplier.get();
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
	protected String type;

	private Supplier<String> _typeSupplier = () -> null;

	@Schema
	public String getValue() {
		if (value != null) {
			return value;
		}

		value = _valueSupplier.get();

		return value;
	}

	public void setValue(String value) {
		this.value = value;

		_valueSupplier = () -> value;
	}

	@JsonIgnore
	public void setValue(
		UnsafeSupplier<String, Exception> valueUnsafeSupplier) {

		value = null;

		_valueSupplier = () -> {
			try {
				return valueUnsafeSupplier.get();
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
	protected String value;

	private Supplier<String> _valueSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Clause)) {
			return false;
		}

		Clause clause = (Clause)object;

		return Objects.equals(toString(), clause.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (additive != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"additive\": ");

			sb.append(additive);
		}

		if (boost != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"boost\": ");

			sb.append(boost);
		}

		if (context != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"context\": ");

			sb.append("\"");

			sb.append(_escape(context));

			sb.append("\"");
		}

		if (disabled != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"disabled\": ");

			sb.append(disabled);
		}

		if (field != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"field\": ");

			sb.append("\"");

			sb.append(_escape(field));

			sb.append("\"");
		}

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(name));

			sb.append("\"");
		}

		if (occur != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"occur\": ");

			sb.append("\"");

			sb.append(_escape(occur));

			sb.append("\"");
		}

		if (parent != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parent\": ");

			sb.append("\"");

			sb.append(_escape(parent));

			sb.append("\"");
		}

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

		if (type != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"type\": ");

			sb.append("\"");

			sb.append(_escape(type));

			sb.append("\"");
		}

		if (value != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"value\": ");

			sb.append("\"");

			sb.append(_escape(value));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.search.experiences.rest.dto.v1_0.Clause",
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