/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.pricing.dto.v2_0;

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

import javax.validation.constraints.DecimalMin;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Zoltán Takács
 * @generated
 */
@Generated("")
@GraphQLName("Sku")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Sku")
public class Sku implements Serializable {

	public static Sku toDTO(String json) {
		return ObjectMapperUtil.readValue(Sku.class, json);
	}

	public static Sku unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Sku.class, json);
	}

	@Schema
	public Double getBasePrice() {
		if (basePrice != null) {
			return basePrice;
		}

		basePrice = _basePriceSupplier.get();

		return basePrice;
	}

	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;

		_basePriceSupplier = () -> basePrice;
	}

	@JsonIgnore
	public void setBasePrice(
		UnsafeSupplier<Double, Exception> basePriceUnsafeSupplier) {

		basePrice = null;

		_basePriceSupplier = () -> {
			try {
				return basePriceUnsafeSupplier.get();
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
	protected Double basePrice;

	private Supplier<Double> _basePriceSupplier = () -> null;

	@Schema
	public String getBasePriceFormatted() {
		if (basePriceFormatted != null) {
			return basePriceFormatted;
		}

		basePriceFormatted = _basePriceFormattedSupplier.get();

		return basePriceFormatted;
	}

	public void setBasePriceFormatted(String basePriceFormatted) {
		this.basePriceFormatted = basePriceFormatted;

		_basePriceFormattedSupplier = () -> basePriceFormatted;
	}

	@JsonIgnore
	public void setBasePriceFormatted(
		UnsafeSupplier<String, Exception> basePriceFormattedUnsafeSupplier) {

		basePriceFormatted = null;

		_basePriceFormattedSupplier = () -> {
			try {
				return basePriceFormattedUnsafeSupplier.get();
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
	protected String basePriceFormatted;

	private Supplier<String> _basePriceFormattedSupplier = () -> null;

	@Schema
	public Double getBasePromoPrice() {
		if (basePromoPrice != null) {
			return basePromoPrice;
		}

		basePromoPrice = _basePromoPriceSupplier.get();

		return basePromoPrice;
	}

	public void setBasePromoPrice(Double basePromoPrice) {
		this.basePromoPrice = basePromoPrice;

		_basePromoPriceSupplier = () -> basePromoPrice;
	}

	@JsonIgnore
	public void setBasePromoPrice(
		UnsafeSupplier<Double, Exception> basePromoPriceUnsafeSupplier) {

		basePromoPrice = null;

		_basePromoPriceSupplier = () -> {
			try {
				return basePromoPriceUnsafeSupplier.get();
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
	protected Double basePromoPrice;

	private Supplier<Double> _basePromoPriceSupplier = () -> null;

	@Schema
	public String getBasePromoPriceFormatted() {
		if (basePromoPriceFormatted != null) {
			return basePromoPriceFormatted;
		}

		basePromoPriceFormatted = _basePromoPriceFormattedSupplier.get();

		return basePromoPriceFormatted;
	}

	public void setBasePromoPriceFormatted(String basePromoPriceFormatted) {
		this.basePromoPriceFormatted = basePromoPriceFormatted;

		_basePromoPriceFormattedSupplier = () -> basePromoPriceFormatted;
	}

	@JsonIgnore
	public void setBasePromoPriceFormatted(
		UnsafeSupplier<String, Exception>
			basePromoPriceFormattedUnsafeSupplier) {

		basePromoPriceFormatted = null;

		_basePromoPriceFormattedSupplier = () -> {
			try {
				return basePromoPriceFormattedUnsafeSupplier.get();
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
	protected String basePromoPriceFormatted;

	private Supplier<String> _basePromoPriceFormattedSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema(example = "simple")
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String name;

	private Supplier<String> _nameSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Sku)) {
			return false;
		}

		Sku sku = (Sku)object;

		return Objects.equals(toString(), sku.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (basePrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"basePrice\": ");

			sb.append(basePrice);
		}

		if (basePriceFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"basePriceFormatted\": ");

			sb.append("\"");

			sb.append(_escape(basePriceFormatted));

			sb.append("\"");
		}

		if (basePromoPrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"basePromoPrice\": ");

			sb.append(basePromoPrice);
		}

		if (basePromoPriceFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"basePromoPriceFormatted\": ");

			sb.append("\"");

			sb.append(_escape(basePromoPriceFormatted));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
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

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.pricing.dto.v2_0.Sku",
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