/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.delivery.cart.dto.v1_0;

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

import java.math.BigDecimal;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Andrea Sbarra
 * @generated
 */
@Generated("")
@GraphQLName("Settings")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Settings")
public class Settings implements Serializable {

	public static Settings toDTO(String json) {
		return ObjectMapperUtil.readValue(Settings.class, json);
	}

	public static Settings unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Settings.class, json);
	}

	@Schema
	@Valid
	public BigDecimal[] getAllowedQuantities() {
		if (allowedQuantities != null) {
			return allowedQuantities;
		}

		allowedQuantities = _allowedQuantitiesSupplier.get();

		return allowedQuantities;
	}

	public void setAllowedQuantities(BigDecimal[] allowedQuantities) {
		this.allowedQuantities = allowedQuantities;

		_allowedQuantitiesSupplier = () -> allowedQuantities;
	}

	@JsonIgnore
	public void setAllowedQuantities(
		UnsafeSupplier<BigDecimal[], Exception>
			allowedQuantitiesUnsafeSupplier) {

		allowedQuantities = null;

		_allowedQuantitiesSupplier = () -> {
			try {
				return allowedQuantitiesUnsafeSupplier.get();
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
	protected BigDecimal[] allowedQuantities;

	private Supplier<BigDecimal[]> _allowedQuantitiesSupplier = () -> null;

	@Schema(example = "10.1")
	@Valid
	public BigDecimal getMaxQuantity() {
		if (maxQuantity != null) {
			return maxQuantity;
		}

		maxQuantity = _maxQuantitySupplier.get();

		return maxQuantity;
	}

	public void setMaxQuantity(BigDecimal maxQuantity) {
		this.maxQuantity = maxQuantity;

		_maxQuantitySupplier = () -> maxQuantity;
	}

	@JsonIgnore
	public void setMaxQuantity(
		UnsafeSupplier<BigDecimal, Exception> maxQuantityUnsafeSupplier) {

		maxQuantity = null;

		_maxQuantitySupplier = () -> {
			try {
				return maxQuantityUnsafeSupplier.get();
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
	protected BigDecimal maxQuantity;

	private Supplier<BigDecimal> _maxQuantitySupplier = () -> null;

	@Schema(example = "10.1")
	@Valid
	public BigDecimal getMinQuantity() {
		if (minQuantity != null) {
			return minQuantity;
		}

		minQuantity = _minQuantitySupplier.get();

		return minQuantity;
	}

	public void setMinQuantity(BigDecimal minQuantity) {
		this.minQuantity = minQuantity;

		_minQuantitySupplier = () -> minQuantity;
	}

	@JsonIgnore
	public void setMinQuantity(
		UnsafeSupplier<BigDecimal, Exception> minQuantityUnsafeSupplier) {

		minQuantity = null;

		_minQuantitySupplier = () -> {
			try {
				return minQuantityUnsafeSupplier.get();
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
	protected BigDecimal minQuantity;

	private Supplier<BigDecimal> _minQuantitySupplier = () -> null;

	@Schema(example = "10.1")
	@Valid
	public BigDecimal getMultipleQuantity() {
		if (multipleQuantity != null) {
			return multipleQuantity;
		}

		multipleQuantity = _multipleQuantitySupplier.get();

		return multipleQuantity;
	}

	public void setMultipleQuantity(BigDecimal multipleQuantity) {
		this.multipleQuantity = multipleQuantity;

		_multipleQuantitySupplier = () -> multipleQuantity;
	}

	@JsonIgnore
	public void setMultipleQuantity(
		UnsafeSupplier<BigDecimal, Exception> multipleQuantityUnsafeSupplier) {

		multipleQuantity = null;

		_multipleQuantitySupplier = () -> {
			try {
				return multipleQuantityUnsafeSupplier.get();
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
	protected BigDecimal multipleQuantity;

	private Supplier<BigDecimal> _multipleQuantitySupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Settings)) {
			return false;
		}

		Settings settings = (Settings)object;

		return Objects.equals(toString(), settings.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (allowedQuantities != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"allowedQuantities\": ");

			sb.append("[");

			for (int i = 0; i < allowedQuantities.length; i++) {
				sb.append(allowedQuantities[i]);

				if ((i + 1) < allowedQuantities.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (maxQuantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"maxQuantity\": ");

			sb.append(maxQuantity);
		}

		if (minQuantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"minQuantity\": ");

			sb.append(minQuantity);
		}

		if (multipleQuantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"multipleQuantity\": ");

			sb.append(multipleQuantity);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.delivery.cart.dto.v1_0.Settings",
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