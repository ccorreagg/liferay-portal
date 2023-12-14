/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.pricing.dto.v1_0;

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
import javax.validation.constraints.DecimalMin;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Zoltán Takács
 * @generated
 */
@Generated("")
@GraphQLName("TierPrice")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "TierPrice")
public class TierPrice implements Serializable {

	public static TierPrice toDTO(String json) {
		return ObjectMapperUtil.readValue(TierPrice.class, json);
	}

	public static TierPrice unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(TierPrice.class, json);
	}

	@Schema
	@Valid
	public Map<String, ?> getCustomFields() {
		if (customFields != null) {
			return customFields;
		}

		customFields = _customFieldsSupplier.get();

		return customFields;
	}

	public void setCustomFields(Map<String, ?> customFields) {
		this.customFields = customFields;

		_customFieldsSupplier = () -> customFields;
	}

	@JsonIgnore
	public void setCustomFields(
		UnsafeSupplier<Map<String, ?>, Exception> customFieldsUnsafeSupplier) {

		customFields = null;

		_customFieldsSupplier = () -> {
			try {
				return customFieldsUnsafeSupplier.get();
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
	protected Map<String, ?> customFields;

	private Supplier<Map<String, ?>> _customFieldsSupplier = () -> null;

	@Schema(example = "AB-34098-789-N")
	public String getExternalReferenceCode() {
		if (externalReferenceCode != null) {
			return externalReferenceCode;
		}

		externalReferenceCode = _externalReferenceCodeSupplier.get();

		return externalReferenceCode;
	}

	public void setExternalReferenceCode(String externalReferenceCode) {
		this.externalReferenceCode = externalReferenceCode;

		_externalReferenceCodeSupplier = () -> externalReferenceCode;
	}

	@JsonIgnore
	public void setExternalReferenceCode(
		UnsafeSupplier<String, Exception> externalReferenceCodeUnsafeSupplier) {

		externalReferenceCode = null;

		_externalReferenceCodeSupplier = () -> {
			try {
				return externalReferenceCodeUnsafeSupplier.get();
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
	protected String externalReferenceCode;

	private Supplier<String> _externalReferenceCodeSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "31130")
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
	@Schema(example = "5")
	public Integer getMinimumQuantity() {
		if (minimumQuantity != null) {
			return minimumQuantity;
		}

		minimumQuantity = _minimumQuantitySupplier.get();

		return minimumQuantity;
	}

	public void setMinimumQuantity(Integer minimumQuantity) {
		this.minimumQuantity = minimumQuantity;

		_minimumQuantitySupplier = () -> minimumQuantity;
	}

	@JsonIgnore
	public void setMinimumQuantity(
		UnsafeSupplier<Integer, Exception> minimumQuantityUnsafeSupplier) {

		minimumQuantity = null;

		_minimumQuantitySupplier = () -> {
			try {
				return minimumQuantityUnsafeSupplier.get();
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
	protected Integer minimumQuantity;

	private Supplier<Integer> _minimumQuantitySupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "25")
	@Valid
	public BigDecimal getPrice() {
		if (price != null) {
			return price;
		}

		price = _priceSupplier.get();

		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;

		_priceSupplier = () -> price;
	}

	@JsonIgnore
	public void setPrice(
		UnsafeSupplier<BigDecimal, Exception> priceUnsafeSupplier) {

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
	protected BigDecimal price;

	private Supplier<BigDecimal> _priceSupplier = () -> null;

	@Schema(example = "CAB-34098-789-N")
	public String getPriceEntryExternalReferenceCode() {
		if (priceEntryExternalReferenceCode != null) {
			return priceEntryExternalReferenceCode;
		}

		priceEntryExternalReferenceCode =
			_priceEntryExternalReferenceCodeSupplier.get();

		return priceEntryExternalReferenceCode;
	}

	public void setPriceEntryExternalReferenceCode(
		String priceEntryExternalReferenceCode) {

		this.priceEntryExternalReferenceCode = priceEntryExternalReferenceCode;

		_priceEntryExternalReferenceCodeSupplier =
			() -> priceEntryExternalReferenceCode;
	}

	@JsonIgnore
	public void setPriceEntryExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			priceEntryExternalReferenceCodeUnsafeSupplier) {

		priceEntryExternalReferenceCode = null;

		_priceEntryExternalReferenceCodeSupplier = () -> {
			try {
				return priceEntryExternalReferenceCodeUnsafeSupplier.get();
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
	protected String priceEntryExternalReferenceCode;

	private Supplier<String> _priceEntryExternalReferenceCodeSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
	public Long getPriceEntryId() {
		if (priceEntryId != null) {
			return priceEntryId;
		}

		priceEntryId = _priceEntryIdSupplier.get();

		return priceEntryId;
	}

	public void setPriceEntryId(Long priceEntryId) {
		this.priceEntryId = priceEntryId;

		_priceEntryIdSupplier = () -> priceEntryId;
	}

	@JsonIgnore
	public void setPriceEntryId(
		UnsafeSupplier<Long, Exception> priceEntryIdUnsafeSupplier) {

		priceEntryId = null;

		_priceEntryIdSupplier = () -> {
			try {
				return priceEntryIdUnsafeSupplier.get();
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
	protected Long priceEntryId;

	private Supplier<Long> _priceEntryIdSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "20")
	@Valid
	public BigDecimal getPromoPrice() {
		if (promoPrice != null) {
			return promoPrice;
		}

		promoPrice = _promoPriceSupplier.get();

		return promoPrice;
	}

	public void setPromoPrice(BigDecimal promoPrice) {
		this.promoPrice = promoPrice;

		_promoPriceSupplier = () -> promoPrice;
	}

	@JsonIgnore
	public void setPromoPrice(
		UnsafeSupplier<BigDecimal, Exception> promoPriceUnsafeSupplier) {

		promoPrice = null;

		_promoPriceSupplier = () -> {
			try {
				return promoPriceUnsafeSupplier.get();
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
	protected BigDecimal promoPrice;

	private Supplier<BigDecimal> _promoPriceSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TierPrice)) {
			return false;
		}

		TierPrice tierPrice = (TierPrice)object;

		return Objects.equals(toString(), tierPrice.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (customFields != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"customFields\": ");

			sb.append(_toJSON(customFields));
		}

		if (externalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"externalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(externalReferenceCode));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (minimumQuantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"minimumQuantity\": ");

			sb.append(minimumQuantity);
		}

		if (price != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"price\": ");

			sb.append(price);
		}

		if (priceEntryExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceEntryExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(priceEntryExternalReferenceCode));

			sb.append("\"");
		}

		if (priceEntryId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceEntryId\": ");

			sb.append(priceEntryId);
		}

		if (promoPrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"promoPrice\": ");

			sb.append(promoPrice);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.pricing.dto.v1_0.TierPrice",
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