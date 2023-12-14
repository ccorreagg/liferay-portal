/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.catalog.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Zoltán Takács
 * @generated
 */
@Generated("")
@GraphQLName("Currency")
@JsonFilter("Liferay.Vulcan")
@Schema(requiredProperties = {"code", "name"})
@XmlRootElement(name = "Currency")
public class Currency implements Serializable {

	public static Currency toDTO(String json) {
		return ObjectMapperUtil.readValue(Currency.class, json);
	}

	public static Currency unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Currency.class, json);
	}

	@Schema(example = "true")
	public Boolean getActive() {
		if (active != null) {
			return active;
		}

		active = _activeSupplier.get();

		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;

		_activeSupplier = () -> active;
	}

	@JsonIgnore
	public void setActive(
		UnsafeSupplier<Boolean, Exception> activeUnsafeSupplier) {

		active = null;

		_activeSupplier = () -> {
			try {
				return activeUnsafeSupplier.get();
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
	protected Boolean active;

	private Supplier<Boolean> _activeSupplier = () -> null;

	@Schema(example = "USD")
	public String getCode() {
		if (code != null) {
			return code;
		}

		code = _codeSupplier.get();

		return code;
	}

	public void setCode(String code) {
		this.code = code;

		_codeSupplier = () -> code;
	}

	@JsonIgnore
	public void setCode(UnsafeSupplier<String, Exception> codeUnsafeSupplier) {
		code = null;

		_codeSupplier = () -> {
			try {
				return codeUnsafeSupplier.get();
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
	@NotEmpty
	protected String code;

	private Supplier<String> _codeSupplier = () -> null;

	@Schema(
		example = "{en_US=Hand Saw, hr_HR=Product Name HR, hu_HU=Product Name HU}"
	)
	@Valid
	public Map<String, String> getFormatPattern() {
		if (formatPattern != null) {
			return formatPattern;
		}

		formatPattern = _formatPatternSupplier.get();

		return formatPattern;
	}

	public void setFormatPattern(Map<String, String> formatPattern) {
		this.formatPattern = formatPattern;

		_formatPatternSupplier = () -> formatPattern;
	}

	@JsonIgnore
	public void setFormatPattern(
		UnsafeSupplier<Map<String, String>, Exception>
			formatPatternUnsafeSupplier) {

		formatPattern = null;

		_formatPatternSupplier = () -> {
			try {
				return formatPatternUnsafeSupplier.get();
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
	protected Map<String, String> formatPattern;

	private Supplier<Map<String, String>> _formatPatternSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
	public Long getId() {
		if (id != null) {
			return id;
		}

		id = _idSupplier.get();

		return id;
	}

	public void setId(Long id) {
		this.id = id;

		_idSupplier = () -> id;
	}

	@JsonIgnore
	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		id = null;

		_idSupplier = () -> {
			try {
				return idUnsafeSupplier.get();
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
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@DecimalMin("0")
	@Schema
	public Integer getMaxFractionDigits() {
		if (maxFractionDigits != null) {
			return maxFractionDigits;
		}

		maxFractionDigits = _maxFractionDigitsSupplier.get();

		return maxFractionDigits;
	}

	public void setMaxFractionDigits(Integer maxFractionDigits) {
		this.maxFractionDigits = maxFractionDigits;

		_maxFractionDigitsSupplier = () -> maxFractionDigits;
	}

	@JsonIgnore
	public void setMaxFractionDigits(
		UnsafeSupplier<Integer, Exception> maxFractionDigitsUnsafeSupplier) {

		maxFractionDigits = null;

		_maxFractionDigitsSupplier = () -> {
			try {
				return maxFractionDigitsUnsafeSupplier.get();
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
	protected Integer maxFractionDigits;

	private Supplier<Integer> _maxFractionDigitsSupplier = () -> null;

	@DecimalMin("0")
	@Schema
	public Integer getMinFractionDigits() {
		if (minFractionDigits != null) {
			return minFractionDigits;
		}

		minFractionDigits = _minFractionDigitsSupplier.get();

		return minFractionDigits;
	}

	public void setMinFractionDigits(Integer minFractionDigits) {
		this.minFractionDigits = minFractionDigits;

		_minFractionDigitsSupplier = () -> minFractionDigits;
	}

	@JsonIgnore
	public void setMinFractionDigits(
		UnsafeSupplier<Integer, Exception> minFractionDigitsUnsafeSupplier) {

		minFractionDigits = null;

		_minFractionDigitsSupplier = () -> {
			try {
				return minFractionDigitsUnsafeSupplier.get();
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
	protected Integer minFractionDigits;

	private Supplier<Integer> _minFractionDigitsSupplier = () -> null;

	@Schema(
		example = "{en_US=Hand Saw, hr_HR=Product Name HR, hu_HU=Product Name HU}"
	)
	@Valid
	public Map<String, String> getName() {
		if (name != null) {
			return name;
		}

		name = _nameSupplier.get();

		return name;
	}

	public void setName(Map<String, String> name) {
		this.name = name;

		_nameSupplier = () -> name;
	}

	@JsonIgnore
	public void setName(
		UnsafeSupplier<Map<String, String>, Exception> nameUnsafeSupplier) {

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
	@NotNull
	protected Map<String, String> name;

	private Supplier<Map<String, String>> _nameSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getPrimary() {
		if (primary != null) {
			return primary;
		}

		primary = _primarySupplier.get();

		return primary;
	}

	public void setPrimary(Boolean primary) {
		this.primary = primary;

		_primarySupplier = () -> primary;
	}

	@JsonIgnore
	public void setPrimary(
		UnsafeSupplier<Boolean, Exception> primaryUnsafeSupplier) {

		primary = null;

		_primarySupplier = () -> {
			try {
				return primaryUnsafeSupplier.get();
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
	protected Boolean primary;

	private Supplier<Boolean> _primarySupplier = () -> null;

	@Schema(example = "1.2")
	public Double getPriority() {
		if (priority != null) {
			return priority;
		}

		priority = _prioritySupplier.get();

		return priority;
	}

	public void setPriority(Double priority) {
		this.priority = priority;

		_prioritySupplier = () -> priority;
	}

	@JsonIgnore
	public void setPriority(
		UnsafeSupplier<Double, Exception> priorityUnsafeSupplier) {

		priority = null;

		_prioritySupplier = () -> {
			try {
				return priorityUnsafeSupplier.get();
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
	protected Double priority;

	private Supplier<Double> _prioritySupplier = () -> null;

	@Schema(example = "33.54")
	@Valid
	public BigDecimal getRate() {
		if (rate != null) {
			return rate;
		}

		rate = _rateSupplier.get();

		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;

		_rateSupplier = () -> rate;
	}

	@JsonIgnore
	public void setRate(
		UnsafeSupplier<BigDecimal, Exception> rateUnsafeSupplier) {

		rate = null;

		_rateSupplier = () -> {
			try {
				return rateUnsafeSupplier.get();
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
	protected BigDecimal rate;

	private Supplier<BigDecimal> _rateSupplier = () -> null;

	@Schema(example = "HALF_EVEN")
	@Valid
	public RoundingMode getRoundingMode() {
		if (roundingMode != null) {
			return roundingMode;
		}

		roundingMode = _roundingModeSupplier.get();

		return roundingMode;
	}

	@JsonIgnore
	public String getRoundingModeAsString() {
		if (roundingMode == null) {
			return null;
		}

		return roundingMode.toString();
	}

	public void setRoundingMode(RoundingMode roundingMode) {
		this.roundingMode = roundingMode;

		_roundingModeSupplier = () -> roundingMode;
	}

	@JsonIgnore
	public void setRoundingMode(
		UnsafeSupplier<RoundingMode, Exception> roundingModeUnsafeSupplier) {

		roundingMode = null;

		_roundingModeSupplier = () -> {
			try {
				return roundingModeUnsafeSupplier.get();
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
	protected RoundingMode roundingMode;

	private Supplier<RoundingMode> _roundingModeSupplier = () -> null;

	@Schema(example = "$")
	public String getSymbol() {
		if (symbol != null) {
			return symbol;
		}

		symbol = _symbolSupplier.get();

		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;

		_symbolSupplier = () -> symbol;
	}

	@JsonIgnore
	public void setSymbol(
		UnsafeSupplier<String, Exception> symbolUnsafeSupplier) {

		symbol = null;

		_symbolSupplier = () -> {
			try {
				return symbolUnsafeSupplier.get();
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
	protected String symbol;

	private Supplier<String> _symbolSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Currency)) {
			return false;
		}

		Currency currency = (Currency)object;

		return Objects.equals(toString(), currency.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (active != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"active\": ");

			sb.append(active);
		}

		if (code != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"code\": ");

			sb.append("\"");

			sb.append(_escape(code));

			sb.append("\"");
		}

		if (formatPattern != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"formatPattern\": ");

			sb.append(_toJSON(formatPattern));
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (maxFractionDigits != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"maxFractionDigits\": ");

			sb.append(maxFractionDigits);
		}

		if (minFractionDigits != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"minFractionDigits\": ");

			sb.append(minFractionDigits);
		}

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append(_toJSON(name));
		}

		if (primary != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"primary\": ");

			sb.append(primary);
		}

		if (priority != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priority\": ");

			sb.append(priority);
		}

		if (rate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"rate\": ");

			sb.append(rate);
		}

		if (roundingMode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"roundingMode\": ");

			sb.append("\"");

			sb.append(roundingMode);

			sb.append("\"");
		}

		if (symbol != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"symbol\": ");

			sb.append("\"");

			sb.append(_escape(symbol));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.catalog.dto.v1_0.Currency",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("RoundingMode")
	public static enum RoundingMode {

		UP("UP"), DOWN("DOWN"), CEILING("CEILING"), FLOOR("FLOOR"),
		HALF_UP("HALF_UP"), HALF_DOWN("HALF_DOWN"), HALF_EVEN("HALF_EVEN"),
		UNNECESSARY("UNNECESSARY");

		@JsonCreator
		public static RoundingMode create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (RoundingMode roundingMode : values()) {
				if (Objects.equals(roundingMode.getValue(), value)) {
					return roundingMode;
				}
			}

			throw new IllegalArgumentException("Invalid enum value: " + value);
		}

		@JsonValue
		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private RoundingMode(String value) {
			_value = value;
		}

		private final String _value;

	}

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