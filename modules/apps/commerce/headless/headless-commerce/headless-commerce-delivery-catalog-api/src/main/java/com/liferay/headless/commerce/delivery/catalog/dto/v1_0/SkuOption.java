/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.delivery.catalog.dto.v1_0;

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
 * @author Andrea Sbarra
 * @generated
 */
@Generated("")
@GraphQLName("SkuOption")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "SkuOption")
public class SkuOption implements Serializable {

	public static SkuOption toDTO(String json) {
		return ObjectMapperUtil.readValue(SkuOption.class, json);
	}

	public static SkuOption unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(SkuOption.class, json);
	}

	@DecimalMin("0")
	@Schema(example = "31130")
	public Long getKey() {
		if (key != null) {
			return key;
		}

		key = _keySupplier.get();

		return key;
	}

	public void setKey(Long key) {
		this.key = key;

		_keySupplier = () -> key;
	}

	@JsonIgnore
	public void setKey(UnsafeSupplier<Long, Exception> keyUnsafeSupplier) {
		key = null;

		_keySupplier = () -> {
			try {
				return keyUnsafeSupplier.get();
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
	protected Long key;

	private Supplier<Long> _keySupplier = () -> null;

	@Schema
	public String getPrice() {
		if (price != null) {
			return price;
		}

		price = _priceSupplier.get();

		return price;
	}

	public void setPrice(String price) {
		this.price = price;

		_priceSupplier = () -> price;
	}

	@JsonIgnore
	public void setPrice(
		UnsafeSupplier<String, Exception> priceUnsafeSupplier) {

		price = null;

		_priceSupplier = () -> {
			try {
				return priceUnsafeSupplier.get();
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
	protected String price;

	private Supplier<String> _priceSupplier = () -> null;

	@Schema(example = "static")
	public String getPriceType() {
		if (priceType != null) {
			return priceType;
		}

		priceType = _priceTypeSupplier.get();

		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;

		_priceTypeSupplier = () -> priceType;
	}

	@JsonIgnore
	public void setPriceType(
		UnsafeSupplier<String, Exception> priceTypeUnsafeSupplier) {

		priceType = null;

		_priceTypeSupplier = () -> {
			try {
				return priceTypeUnsafeSupplier.get();
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
	protected String priceType;

	private Supplier<String> _priceTypeSupplier = () -> null;

	@Schema
	public String getQuantity() {
		if (quantity != null) {
			return quantity;
		}

		quantity = _quantitySupplier.get();

		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;

		_quantitySupplier = () -> quantity;
	}

	@JsonIgnore
	public void setQuantity(
		UnsafeSupplier<String, Exception> quantityUnsafeSupplier) {

		quantity = null;

		_quantitySupplier = () -> {
			try {
				return quantityUnsafeSupplier.get();
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
	protected String quantity;

	private Supplier<String> _quantitySupplier = () -> null;

	@Schema(example = "30130")
	public Long getSkuId() {
		if (skuId != null) {
			return skuId;
		}

		skuId = _skuIdSupplier.get();

		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;

		_skuIdSupplier = () -> skuId;
	}

	@JsonIgnore
	public void setSkuId(UnsafeSupplier<Long, Exception> skuIdUnsafeSupplier) {
		skuId = null;

		_skuIdSupplier = () -> {
			try {
				return skuIdUnsafeSupplier.get();
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
	protected Long skuId;

	private Supplier<Long> _skuIdSupplier = () -> null;

	@Schema(example = "30130")
	public Long getSkuOptionId() {
		if (skuOptionId != null) {
			return skuOptionId;
		}

		skuOptionId = _skuOptionIdSupplier.get();

		return skuOptionId;
	}

	public void setSkuOptionId(Long skuOptionId) {
		this.skuOptionId = skuOptionId;

		_skuOptionIdSupplier = () -> skuOptionId;
	}

	@JsonIgnore
	public void setSkuOptionId(
		UnsafeSupplier<Long, Exception> skuOptionIdUnsafeSupplier) {

		skuOptionId = null;

		_skuOptionIdSupplier = () -> {
			try {
				return skuOptionIdUnsafeSupplier.get();
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
	protected Long skuOptionId;

	private Supplier<Long> _skuOptionIdSupplier = () -> null;

	@Schema(example = "Sku Option Key")
	public String getSkuOptionKey() {
		if (skuOptionKey != null) {
			return skuOptionKey;
		}

		skuOptionKey = _skuOptionKeySupplier.get();

		return skuOptionKey;
	}

	public void setSkuOptionKey(String skuOptionKey) {
		this.skuOptionKey = skuOptionKey;

		_skuOptionKeySupplier = () -> skuOptionKey;
	}

	@JsonIgnore
	public void setSkuOptionKey(
		UnsafeSupplier<String, Exception> skuOptionKeyUnsafeSupplier) {

		skuOptionKey = null;

		_skuOptionKeySupplier = () -> {
			try {
				return skuOptionKeyUnsafeSupplier.get();
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
	protected String skuOptionKey;

	private Supplier<String> _skuOptionKeySupplier = () -> null;

	@Schema(example = "Sku Option Name")
	public String getSkuOptionName() {
		if (skuOptionName != null) {
			return skuOptionName;
		}

		skuOptionName = _skuOptionNameSupplier.get();

		return skuOptionName;
	}

	public void setSkuOptionName(String skuOptionName) {
		this.skuOptionName = skuOptionName;

		_skuOptionNameSupplier = () -> skuOptionName;
	}

	@JsonIgnore
	public void setSkuOptionName(
		UnsafeSupplier<String, Exception> skuOptionNameUnsafeSupplier) {

		skuOptionName = null;

		_skuOptionNameSupplier = () -> {
			try {
				return skuOptionNameUnsafeSupplier.get();
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
	protected String skuOptionName;

	private Supplier<String> _skuOptionNameSupplier = () -> null;

	@Schema(example = "30130")
	public Long getSkuOptionValueId() {
		if (skuOptionValueId != null) {
			return skuOptionValueId;
		}

		skuOptionValueId = _skuOptionValueIdSupplier.get();

		return skuOptionValueId;
	}

	public void setSkuOptionValueId(Long skuOptionValueId) {
		this.skuOptionValueId = skuOptionValueId;

		_skuOptionValueIdSupplier = () -> skuOptionValueId;
	}

	@JsonIgnore
	public void setSkuOptionValueId(
		UnsafeSupplier<Long, Exception> skuOptionValueIdUnsafeSupplier) {

		skuOptionValueId = null;

		_skuOptionValueIdSupplier = () -> {
			try {
				return skuOptionValueIdUnsafeSupplier.get();
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
	protected Long skuOptionValueId;

	private Supplier<Long> _skuOptionValueIdSupplier = () -> null;

	@Schema(example = "Sku Option Value Key")
	public String getSkuOptionValueKey() {
		if (skuOptionValueKey != null) {
			return skuOptionValueKey;
		}

		skuOptionValueKey = _skuOptionValueKeySupplier.get();

		return skuOptionValueKey;
	}

	public void setSkuOptionValueKey(String skuOptionValueKey) {
		this.skuOptionValueKey = skuOptionValueKey;

		_skuOptionValueKeySupplier = () -> skuOptionValueKey;
	}

	@JsonIgnore
	public void setSkuOptionValueKey(
		UnsafeSupplier<String, Exception> skuOptionValueKeyUnsafeSupplier) {

		skuOptionValueKey = null;

		_skuOptionValueKeySupplier = () -> {
			try {
				return skuOptionValueKeyUnsafeSupplier.get();
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
	protected String skuOptionValueKey;

	private Supplier<String> _skuOptionValueKeySupplier = () -> null;

	@Schema
	public String[] getSkuOptionValueNames() {
		if (skuOptionValueNames != null) {
			return skuOptionValueNames;
		}

		skuOptionValueNames = _skuOptionValueNamesSupplier.get();

		return skuOptionValueNames;
	}

	public void setSkuOptionValueNames(String[] skuOptionValueNames) {
		this.skuOptionValueNames = skuOptionValueNames;

		_skuOptionValueNamesSupplier = () -> skuOptionValueNames;
	}

	@JsonIgnore
	public void setSkuOptionValueNames(
		UnsafeSupplier<String[], Exception> skuOptionValueNamesUnsafeSupplier) {

		skuOptionValueNames = null;

		_skuOptionValueNamesSupplier = () -> {
			try {
				return skuOptionValueNamesUnsafeSupplier.get();
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
	protected String[] skuOptionValueNames;

	private Supplier<String[]> _skuOptionValueNamesSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "31130")
	public Long getValue() {
		if (value != null) {
			return value;
		}

		value = _valueSupplier.get();

		return value;
	}

	public void setValue(Long value) {
		this.value = value;

		_valueSupplier = () -> value;
	}

	@JsonIgnore
	public void setValue(UnsafeSupplier<Long, Exception> valueUnsafeSupplier) {
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long value;

	private Supplier<Long> _valueSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SkuOption)) {
			return false;
		}

		SkuOption skuOption = (SkuOption)object;

		return Objects.equals(toString(), skuOption.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (key != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"key\": ");

			sb.append(key);
		}

		if (price != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"price\": ");

			sb.append("\"");

			sb.append(_escape(price));

			sb.append("\"");
		}

		if (priceType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceType\": ");

			sb.append("\"");

			sb.append(_escape(priceType));

			sb.append("\"");
		}

		if (quantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"quantity\": ");

			sb.append("\"");

			sb.append(_escape(quantity));

			sb.append("\"");
		}

		if (skuId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuId\": ");

			sb.append(skuId);
		}

		if (skuOptionId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuOptionId\": ");

			sb.append(skuOptionId);
		}

		if (skuOptionKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuOptionKey\": ");

			sb.append("\"");

			sb.append(_escape(skuOptionKey));

			sb.append("\"");
		}

		if (skuOptionName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuOptionName\": ");

			sb.append("\"");

			sb.append(_escape(skuOptionName));

			sb.append("\"");
		}

		if (skuOptionValueId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuOptionValueId\": ");

			sb.append(skuOptionValueId);
		}

		if (skuOptionValueKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuOptionValueKey\": ");

			sb.append("\"");

			sb.append(_escape(skuOptionValueKey));

			sb.append("\"");
		}

		if (skuOptionValueNames != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuOptionValueNames\": ");

			sb.append("[");

			for (int i = 0; i < skuOptionValueNames.length; i++) {
				sb.append("\"");

				sb.append(_escape(skuOptionValueNames[i]));

				sb.append("\"");

				if ((i + 1) < skuOptionValueNames.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (value != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"value\": ");

			sb.append(value);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.delivery.catalog.dto.v1_0.SkuOption",
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