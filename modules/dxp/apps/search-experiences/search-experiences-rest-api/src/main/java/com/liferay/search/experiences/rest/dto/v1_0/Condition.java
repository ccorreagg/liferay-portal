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
@GraphQLName("Condition")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Condition")
public class Condition implements Serializable {

	public static Condition toDTO(String json) {
		return ObjectMapperUtil.readValue(Condition.class, json);
	}

	public static Condition unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Condition.class, json);
	}

	@Schema
	@Valid
	public Condition[] getAllConditions() {
		if (allConditions != null) {
			return allConditions;
		}

		allConditions = _allConditionsSupplier.get();

		return allConditions;
	}

	public void setAllConditions(Condition[] allConditions) {
		this.allConditions = allConditions;

		_allConditionsSupplier = () -> allConditions;
	}

	@JsonIgnore
	public void setAllConditions(
		UnsafeSupplier<Condition[], Exception> allConditionsUnsafeSupplier) {

		allConditions = null;

		_allConditionsSupplier = () -> {
			try {
				return allConditionsUnsafeSupplier.get();
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
	protected Condition[] allConditions;

	private Supplier<Condition[]> _allConditionsSupplier = () -> null;

	@Schema
	@Valid
	public Condition[] getAnyConditions() {
		if (anyConditions != null) {
			return anyConditions;
		}

		anyConditions = _anyConditionsSupplier.get();

		return anyConditions;
	}

	public void setAnyConditions(Condition[] anyConditions) {
		this.anyConditions = anyConditions;

		_anyConditionsSupplier = () -> anyConditions;
	}

	@JsonIgnore
	public void setAnyConditions(
		UnsafeSupplier<Condition[], Exception> anyConditionsUnsafeSupplier) {

		anyConditions = null;

		_anyConditionsSupplier = () -> {
			try {
				return anyConditionsUnsafeSupplier.get();
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
	protected Condition[] anyConditions;

	private Supplier<Condition[]> _anyConditionsSupplier = () -> null;

	@Schema
	@Valid
	public Contains getContains() {
		if (contains != null) {
			return contains;
		}

		contains = _containsSupplier.get();

		return contains;
	}

	public void setContains(Contains contains) {
		this.contains = contains;

		_containsSupplier = () -> contains;
	}

	@JsonIgnore
	public void setContains(
		UnsafeSupplier<Contains, Exception> containsUnsafeSupplier) {

		contains = null;

		_containsSupplier = () -> {
			try {
				return containsUnsafeSupplier.get();
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
	protected Contains contains;

	private Supplier<Contains> _containsSupplier = () -> null;

	@Schema
	@Valid
	public Equals getEquals() {
		if (equals != null) {
			return equals;
		}

		equals = _equalsSupplier.get();

		return equals;
	}

	public void setEquals(Equals equals) {
		this.equals = equals;

		_equalsSupplier = () -> equals;
	}

	@JsonIgnore
	public void setEquals(
		UnsafeSupplier<Equals, Exception> equalsUnsafeSupplier) {

		equals = null;

		_equalsSupplier = () -> {
			try {
				return equalsUnsafeSupplier.get();
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
	protected Equals equals;

	private Supplier<Equals> _equalsSupplier = () -> null;

	@Schema
	@Valid
	public Exists getExists() {
		if (exists != null) {
			return exists;
		}

		exists = _existsSupplier.get();

		return exists;
	}

	public void setExists(Exists exists) {
		this.exists = exists;

		_existsSupplier = () -> exists;
	}

	@JsonIgnore
	public void setExists(
		UnsafeSupplier<Exists, Exception> existsUnsafeSupplier) {

		exists = null;

		_existsSupplier = () -> {
			try {
				return existsUnsafeSupplier.get();
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
	protected Exists exists;

	private Supplier<Exists> _existsSupplier = () -> null;

	@Schema
	@Valid
	public In getIn() {
		if (in != null) {
			return in;
		}

		in = _inSupplier.get();

		return in;
	}

	public void setIn(In in) {
		this.in = in;

		_inSupplier = () -> in;
	}

	@JsonIgnore
	public void setIn(UnsafeSupplier<In, Exception> inUnsafeSupplier) {
		in = null;

		_inSupplier = () -> {
			try {
				return inUnsafeSupplier.get();
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
	protected In in;

	private Supplier<In> _inSupplier = () -> null;

	@Schema
	@Valid
	public Condition getNot() {
		if (not != null) {
			return not;
		}

		not = _notSupplier.get();

		return not;
	}

	public void setNot(Condition not) {
		this.not = not;

		_notSupplier = () -> not;
	}

	@JsonIgnore
	public void setNot(UnsafeSupplier<Condition, Exception> notUnsafeSupplier) {
		not = null;

		_notSupplier = () -> {
			try {
				return notUnsafeSupplier.get();
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
	protected Condition not;

	private Supplier<Condition> _notSupplier = () -> null;

	@Schema
	@Valid
	public Range getRange() {
		if (range != null) {
			return range;
		}

		range = _rangeSupplier.get();

		return range;
	}

	public void setRange(Range range) {
		this.range = range;

		_rangeSupplier = () -> range;
	}

	@JsonIgnore
	public void setRange(UnsafeSupplier<Range, Exception> rangeUnsafeSupplier) {
		range = null;

		_rangeSupplier = () -> {
			try {
				return rangeUnsafeSupplier.get();
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
	protected Range range;

	private Supplier<Range> _rangeSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Condition)) {
			return false;
		}

		Condition condition = (Condition)object;

		return Objects.equals(toString(), condition.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (allConditions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"allConditions\": ");

			sb.append("[");

			for (int i = 0; i < allConditions.length; i++) {
				sb.append(String.valueOf(allConditions[i]));

				if ((i + 1) < allConditions.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (anyConditions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"anyConditions\": ");

			sb.append("[");

			for (int i = 0; i < anyConditions.length; i++) {
				sb.append(String.valueOf(anyConditions[i]));

				if ((i + 1) < anyConditions.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (contains != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"contains\": ");

			sb.append(String.valueOf(contains));
		}

		if (equals != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"equals\": ");

			sb.append(String.valueOf(equals));
		}

		if (exists != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"exists\": ");

			sb.append(String.valueOf(exists));
		}

		if (in != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"in\": ");

			sb.append(String.valueOf(in));
		}

		if (not != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"not\": ");

			sb.append(String.valueOf(not));
		}

		if (range != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"range\": ");

			sb.append(String.valueOf(range));
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.search.experiences.rest.dto.v1_0.Condition",
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