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
@GraphQLName("TypeOptions")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "TypeOptions")
public class TypeOptions implements Serializable {

	public static TypeOptions toDTO(String json) {
		return ObjectMapperUtil.readValue(TypeOptions.class, json);
	}

	public static TypeOptions unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(TypeOptions.class, json);
	}

	@Schema
	public Boolean getBoost() {
		if (boost != null) {
			return boost;
		}

		boost = _boostSupplier.get();

		return boost;
	}

	public void setBoost(Boolean boost) {
		this.boost = boost;

		_boostSupplier = () -> boost;
	}

	@JsonIgnore
	public void setBoost(
		UnsafeSupplier<Boolean, Exception> boostUnsafeSupplier) {

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
	protected Boolean boost;

	private Supplier<Boolean> _boostSupplier = () -> null;

	@Schema
	public String getFormat() {
		if (format != null) {
			return format;
		}

		format = _formatSupplier.get();

		return format;
	}

	public void setFormat(String format) {
		this.format = format;

		_formatSupplier = () -> format;
	}

	@JsonIgnore
	public void setFormat(
		UnsafeSupplier<String, Exception> formatUnsafeSupplier) {

		format = null;

		_formatSupplier = () -> {
			try {
				return formatUnsafeSupplier.get();
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
	protected String format;

	private Supplier<String> _formatSupplier = () -> null;

	@Schema
	@Valid
	public Object getMax() {
		if (max != null) {
			return max;
		}

		max = _maxSupplier.get();

		return max;
	}

	public void setMax(Object max) {
		this.max = max;

		_maxSupplier = () -> max;
	}

	@JsonIgnore
	public void setMax(UnsafeSupplier<Object, Exception> maxUnsafeSupplier) {
		max = null;

		_maxSupplier = () -> {
			try {
				return maxUnsafeSupplier.get();
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
	protected Object max;

	private Supplier<Object> _maxSupplier = () -> null;

	@Schema
	@Valid
	public Object getMin() {
		if (min != null) {
			return min;
		}

		min = _minSupplier.get();

		return min;
	}

	public void setMin(Object min) {
		this.min = min;

		_minSupplier = () -> min;
	}

	@JsonIgnore
	public void setMin(UnsafeSupplier<Object, Exception> minUnsafeSupplier) {
		min = null;

		_minSupplier = () -> {
			try {
				return minUnsafeSupplier.get();
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
	protected Object min;

	private Supplier<Object> _minSupplier = () -> null;

	@Schema
	public Boolean getNullable() {
		if (nullable != null) {
			return nullable;
		}

		nullable = _nullableSupplier.get();

		return nullable;
	}

	public void setNullable(Boolean nullable) {
		this.nullable = nullable;

		_nullableSupplier = () -> nullable;
	}

	@JsonIgnore
	public void setNullable(
		UnsafeSupplier<Boolean, Exception> nullableUnsafeSupplier) {

		nullable = null;

		_nullableSupplier = () -> {
			try {
				return nullableUnsafeSupplier.get();
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
	protected Boolean nullable;

	private Supplier<Boolean> _nullableSupplier = () -> null;

	@Schema
	@Valid
	public Option[] getOptions() {
		if (options != null) {
			return options;
		}

		options = _optionsSupplier.get();

		return options;
	}

	public void setOptions(Option[] options) {
		this.options = options;

		_optionsSupplier = () -> options;
	}

	@JsonIgnore
	public void setOptions(
		UnsafeSupplier<Option[], Exception> optionsUnsafeSupplier) {

		options = null;

		_optionsSupplier = () -> {
			try {
				return optionsUnsafeSupplier.get();
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
	protected Option[] options;

	private Supplier<Option[]> _optionsSupplier = () -> null;

	@Schema
	public Boolean getRequired() {
		if (required != null) {
			return required;
		}

		required = _requiredSupplier.get();

		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;

		_requiredSupplier = () -> required;
	}

	@JsonIgnore
	public void setRequired(
		UnsafeSupplier<Boolean, Exception> requiredUnsafeSupplier) {

		required = null;

		_requiredSupplier = () -> {
			try {
				return requiredUnsafeSupplier.get();
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
	protected Boolean required;

	private Supplier<Boolean> _requiredSupplier = () -> null;

	@Schema
	@Valid
	public Object getStep() {
		if (step != null) {
			return step;
		}

		step = _stepSupplier.get();

		return step;
	}

	public void setStep(Object step) {
		this.step = step;

		_stepSupplier = () -> step;
	}

	@JsonIgnore
	public void setStep(UnsafeSupplier<Object, Exception> stepUnsafeSupplier) {
		step = null;

		_stepSupplier = () -> {
			try {
				return stepUnsafeSupplier.get();
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
	protected Object step;

	private Supplier<Object> _stepSupplier = () -> null;

	@Schema
	public String getUnit() {
		if (unit != null) {
			return unit;
		}

		unit = _unitSupplier.get();

		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;

		_unitSupplier = () -> unit;
	}

	@JsonIgnore
	public void setUnit(UnsafeSupplier<String, Exception> unitUnsafeSupplier) {
		unit = null;

		_unitSupplier = () -> {
			try {
				return unitUnsafeSupplier.get();
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
	protected String unit;

	private Supplier<String> _unitSupplier = () -> null;

	@Schema
	public String getUnitSuffix() {
		if (unitSuffix != null) {
			return unitSuffix;
		}

		unitSuffix = _unitSuffixSupplier.get();

		return unitSuffix;
	}

	public void setUnitSuffix(String unitSuffix) {
		this.unitSuffix = unitSuffix;

		_unitSuffixSupplier = () -> unitSuffix;
	}

	@JsonIgnore
	public void setUnitSuffix(
		UnsafeSupplier<String, Exception> unitSuffixUnsafeSupplier) {

		unitSuffix = null;

		_unitSuffixSupplier = () -> {
			try {
				return unitSuffixUnsafeSupplier.get();
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
	protected String unitSuffix;

	private Supplier<String> _unitSuffixSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TypeOptions)) {
			return false;
		}

		TypeOptions typeOptions = (TypeOptions)object;

		return Objects.equals(toString(), typeOptions.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (boost != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"boost\": ");

			sb.append(boost);
		}

		if (format != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"format\": ");

			sb.append("\"");

			sb.append(_escape(format));

			sb.append("\"");
		}

		if (max != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"max\": ");

			if (max instanceof Map) {
				sb.append(JSONFactoryUtil.createJSONObject((Map<?, ?>)max));
			}
			else if (max instanceof String) {
				sb.append("\"");
				sb.append(_escape((String)max));
				sb.append("\"");
			}
			else {
				sb.append(max);
			}
		}

		if (min != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"min\": ");

			if (min instanceof Map) {
				sb.append(JSONFactoryUtil.createJSONObject((Map<?, ?>)min));
			}
			else if (min instanceof String) {
				sb.append("\"");
				sb.append(_escape((String)min));
				sb.append("\"");
			}
			else {
				sb.append(min);
			}
		}

		if (nullable != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"nullable\": ");

			sb.append(nullable);
		}

		if (options != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"options\": ");

			sb.append("[");

			for (int i = 0; i < options.length; i++) {
				sb.append(String.valueOf(options[i]));

				if ((i + 1) < options.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (required != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"required\": ");

			sb.append(required);
		}

		if (step != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"step\": ");

			if (step instanceof Map) {
				sb.append(JSONFactoryUtil.createJSONObject((Map<?, ?>)step));
			}
			else if (step instanceof String) {
				sb.append("\"");
				sb.append(_escape((String)step));
				sb.append("\"");
			}
			else {
				sb.append(step);
			}
		}

		if (unit != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"unit\": ");

			sb.append("\"");

			sb.append(_escape(unit));

			sb.append("\"");
		}

		if (unitSuffix != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"unitSuffix\": ");

			sb.append("\"");

			sb.append(_escape(unitSuffix));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.search.experiences.rest.dto.v1_0.TypeOptions",
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