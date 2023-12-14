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

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Andrea Sbarra
 * @generated
 */
@Generated("")
@GraphQLName("Price")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Price")
public class Price implements Serializable {

	public static Price toDTO(String json) {
		return ObjectMapperUtil.readValue(Price.class, json);
	}

	public static Price unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Price.class, json);
	}

	@Schema
	public String getCurrency() {
		if (currency != null) {
			return currency;
		}

		currency = _currencySupplier.get();

		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;

		_currencySupplier = () -> currency;
	}

	@JsonIgnore
	public void setCurrency(
		UnsafeSupplier<String, Exception> currencyUnsafeSupplier) {

		currency = null;

		_currencySupplier = () -> {
			try {
				return currencyUnsafeSupplier.get();
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
	protected String currency;

	private Supplier<String> _currencySupplier = () -> null;

	@Schema
	public Double getDiscount() {
		if (discount != null) {
			return discount;
		}

		discount = _discountSupplier.get();

		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;

		_discountSupplier = () -> discount;
	}

	@JsonIgnore
	public void setDiscount(
		UnsafeSupplier<Double, Exception> discountUnsafeSupplier) {

		discount = null;

		_discountSupplier = () -> {
			try {
				return discountUnsafeSupplier.get();
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
	protected Double discount;

	private Supplier<Double> _discountSupplier = () -> null;

	@Schema
	public String getDiscountFormatted() {
		if (discountFormatted != null) {
			return discountFormatted;
		}

		discountFormatted = _discountFormattedSupplier.get();

		return discountFormatted;
	}

	public void setDiscountFormatted(String discountFormatted) {
		this.discountFormatted = discountFormatted;

		_discountFormattedSupplier = () -> discountFormatted;
	}

	@JsonIgnore
	public void setDiscountFormatted(
		UnsafeSupplier<String, Exception> discountFormattedUnsafeSupplier) {

		discountFormatted = null;

		_discountFormattedSupplier = () -> {
			try {
				return discountFormattedUnsafeSupplier.get();
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
	protected String discountFormatted;

	private Supplier<String> _discountFormattedSupplier = () -> null;

	@Schema
	public String getDiscountPercentage() {
		if (discountPercentage != null) {
			return discountPercentage;
		}

		discountPercentage = _discountPercentageSupplier.get();

		return discountPercentage;
	}

	public void setDiscountPercentage(String discountPercentage) {
		this.discountPercentage = discountPercentage;

		_discountPercentageSupplier = () -> discountPercentage;
	}

	@JsonIgnore
	public void setDiscountPercentage(
		UnsafeSupplier<String, Exception> discountPercentageUnsafeSupplier) {

		discountPercentage = null;

		_discountPercentageSupplier = () -> {
			try {
				return discountPercentageUnsafeSupplier.get();
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
	protected String discountPercentage;

	private Supplier<String> _discountPercentageSupplier = () -> null;

	@Schema
	public Double getDiscountPercentageLevel1() {
		if (discountPercentageLevel1 != null) {
			return discountPercentageLevel1;
		}

		discountPercentageLevel1 = _discountPercentageLevel1Supplier.get();

		return discountPercentageLevel1;
	}

	public void setDiscountPercentageLevel1(Double discountPercentageLevel1) {
		this.discountPercentageLevel1 = discountPercentageLevel1;

		_discountPercentageLevel1Supplier = () -> discountPercentageLevel1;
	}

	@JsonIgnore
	public void setDiscountPercentageLevel1(
		UnsafeSupplier<Double, Exception>
			discountPercentageLevel1UnsafeSupplier) {

		discountPercentageLevel1 = null;

		_discountPercentageLevel1Supplier = () -> {
			try {
				return discountPercentageLevel1UnsafeSupplier.get();
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
	protected Double discountPercentageLevel1;

	private Supplier<Double> _discountPercentageLevel1Supplier = () -> null;

	@Schema
	public Double getDiscountPercentageLevel2() {
		if (discountPercentageLevel2 != null) {
			return discountPercentageLevel2;
		}

		discountPercentageLevel2 = _discountPercentageLevel2Supplier.get();

		return discountPercentageLevel2;
	}

	public void setDiscountPercentageLevel2(Double discountPercentageLevel2) {
		this.discountPercentageLevel2 = discountPercentageLevel2;

		_discountPercentageLevel2Supplier = () -> discountPercentageLevel2;
	}

	@JsonIgnore
	public void setDiscountPercentageLevel2(
		UnsafeSupplier<Double, Exception>
			discountPercentageLevel2UnsafeSupplier) {

		discountPercentageLevel2 = null;

		_discountPercentageLevel2Supplier = () -> {
			try {
				return discountPercentageLevel2UnsafeSupplier.get();
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
	protected Double discountPercentageLevel2;

	private Supplier<Double> _discountPercentageLevel2Supplier = () -> null;

	@Schema
	public Double getDiscountPercentageLevel3() {
		if (discountPercentageLevel3 != null) {
			return discountPercentageLevel3;
		}

		discountPercentageLevel3 = _discountPercentageLevel3Supplier.get();

		return discountPercentageLevel3;
	}

	public void setDiscountPercentageLevel3(Double discountPercentageLevel3) {
		this.discountPercentageLevel3 = discountPercentageLevel3;

		_discountPercentageLevel3Supplier = () -> discountPercentageLevel3;
	}

	@JsonIgnore
	public void setDiscountPercentageLevel3(
		UnsafeSupplier<Double, Exception>
			discountPercentageLevel3UnsafeSupplier) {

		discountPercentageLevel3 = null;

		_discountPercentageLevel3Supplier = () -> {
			try {
				return discountPercentageLevel3UnsafeSupplier.get();
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
	protected Double discountPercentageLevel3;

	private Supplier<Double> _discountPercentageLevel3Supplier = () -> null;

	@Schema
	public Double getDiscountPercentageLevel4() {
		if (discountPercentageLevel4 != null) {
			return discountPercentageLevel4;
		}

		discountPercentageLevel4 = _discountPercentageLevel4Supplier.get();

		return discountPercentageLevel4;
	}

	public void setDiscountPercentageLevel4(Double discountPercentageLevel4) {
		this.discountPercentageLevel4 = discountPercentageLevel4;

		_discountPercentageLevel4Supplier = () -> discountPercentageLevel4;
	}

	@JsonIgnore
	public void setDiscountPercentageLevel4(
		UnsafeSupplier<Double, Exception>
			discountPercentageLevel4UnsafeSupplier) {

		discountPercentageLevel4 = null;

		_discountPercentageLevel4Supplier = () -> {
			try {
				return discountPercentageLevel4UnsafeSupplier.get();
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
	protected Double discountPercentageLevel4;

	private Supplier<Double> _discountPercentageLevel4Supplier = () -> null;

	@Schema
	public Double getFinalPrice() {
		if (finalPrice != null) {
			return finalPrice;
		}

		finalPrice = _finalPriceSupplier.get();

		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;

		_finalPriceSupplier = () -> finalPrice;
	}

	@JsonIgnore
	public void setFinalPrice(
		UnsafeSupplier<Double, Exception> finalPriceUnsafeSupplier) {

		finalPrice = null;

		_finalPriceSupplier = () -> {
			try {
				return finalPriceUnsafeSupplier.get();
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
	protected Double finalPrice;

	private Supplier<Double> _finalPriceSupplier = () -> null;

	@Schema
	public String getFinalPriceFormatted() {
		if (finalPriceFormatted != null) {
			return finalPriceFormatted;
		}

		finalPriceFormatted = _finalPriceFormattedSupplier.get();

		return finalPriceFormatted;
	}

	public void setFinalPriceFormatted(String finalPriceFormatted) {
		this.finalPriceFormatted = finalPriceFormatted;

		_finalPriceFormattedSupplier = () -> finalPriceFormatted;
	}

	@JsonIgnore
	public void setFinalPriceFormatted(
		UnsafeSupplier<String, Exception> finalPriceFormattedUnsafeSupplier) {

		finalPriceFormatted = null;

		_finalPriceFormattedSupplier = () -> {
			try {
				return finalPriceFormattedUnsafeSupplier.get();
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
	protected String finalPriceFormatted;

	private Supplier<String> _finalPriceFormattedSupplier = () -> null;

	@Schema
	public Double getPrice() {
		if (price != null) {
			return price;
		}

		price = _priceSupplier.get();

		return price;
	}

	public void setPrice(Double price) {
		this.price = price;

		_priceSupplier = () -> price;
	}

	@JsonIgnore
	public void setPrice(
		UnsafeSupplier<Double, Exception> priceUnsafeSupplier) {

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
	protected Double price;

	private Supplier<Double> _priceSupplier = () -> null;

	@Schema
	public String getPriceFormatted() {
		if (priceFormatted != null) {
			return priceFormatted;
		}

		priceFormatted = _priceFormattedSupplier.get();

		return priceFormatted;
	}

	public void setPriceFormatted(String priceFormatted) {
		this.priceFormatted = priceFormatted;

		_priceFormattedSupplier = () -> priceFormatted;
	}

	@JsonIgnore
	public void setPriceFormatted(
		UnsafeSupplier<String, Exception> priceFormattedUnsafeSupplier) {

		priceFormatted = null;

		_priceFormattedSupplier = () -> {
			try {
				return priceFormattedUnsafeSupplier.get();
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
	protected String priceFormatted;

	private Supplier<String> _priceFormattedSupplier = () -> null;

	@Schema
	public Boolean getPriceOnApplication() {
		if (priceOnApplication != null) {
			return priceOnApplication;
		}

		priceOnApplication = _priceOnApplicationSupplier.get();

		return priceOnApplication;
	}

	public void setPriceOnApplication(Boolean priceOnApplication) {
		this.priceOnApplication = priceOnApplication;

		_priceOnApplicationSupplier = () -> priceOnApplication;
	}

	@JsonIgnore
	public void setPriceOnApplication(
		UnsafeSupplier<Boolean, Exception> priceOnApplicationUnsafeSupplier) {

		priceOnApplication = null;

		_priceOnApplicationSupplier = () -> {
			try {
				return priceOnApplicationUnsafeSupplier.get();
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
	protected Boolean priceOnApplication;

	private Supplier<Boolean> _priceOnApplicationSupplier = () -> null;

	@Schema
	public Double getPromoPrice() {
		if (promoPrice != null) {
			return promoPrice;
		}

		promoPrice = _promoPriceSupplier.get();

		return promoPrice;
	}

	public void setPromoPrice(Double promoPrice) {
		this.promoPrice = promoPrice;

		_promoPriceSupplier = () -> promoPrice;
	}

	@JsonIgnore
	public void setPromoPrice(
		UnsafeSupplier<Double, Exception> promoPriceUnsafeSupplier) {

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
	protected Double promoPrice;

	private Supplier<Double> _promoPriceSupplier = () -> null;

	@Schema
	public String getPromoPriceFormatted() {
		if (promoPriceFormatted != null) {
			return promoPriceFormatted;
		}

		promoPriceFormatted = _promoPriceFormattedSupplier.get();

		return promoPriceFormatted;
	}

	public void setPromoPriceFormatted(String promoPriceFormatted) {
		this.promoPriceFormatted = promoPriceFormatted;

		_promoPriceFormattedSupplier = () -> promoPriceFormatted;
	}

	@JsonIgnore
	public void setPromoPriceFormatted(
		UnsafeSupplier<String, Exception> promoPriceFormattedUnsafeSupplier) {

		promoPriceFormatted = null;

		_promoPriceFormattedSupplier = () -> {
			try {
				return promoPriceFormattedUnsafeSupplier.get();
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
	protected String promoPriceFormatted;

	private Supplier<String> _promoPriceFormattedSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Price)) {
			return false;
		}

		Price price = (Price)object;

		return Objects.equals(toString(), price.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (currency != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"currency\": ");

			sb.append("\"");

			sb.append(_escape(currency));

			sb.append("\"");
		}

		if (discount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discount\": ");

			sb.append(discount);
		}

		if (discountFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountFormatted\": ");

			sb.append("\"");

			sb.append(_escape(discountFormatted));

			sb.append("\"");
		}

		if (discountPercentage != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountPercentage\": ");

			sb.append("\"");

			sb.append(_escape(discountPercentage));

			sb.append("\"");
		}

		if (discountPercentageLevel1 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountPercentageLevel1\": ");

			sb.append(discountPercentageLevel1);
		}

		if (discountPercentageLevel2 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountPercentageLevel2\": ");

			sb.append(discountPercentageLevel2);
		}

		if (discountPercentageLevel3 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountPercentageLevel3\": ");

			sb.append(discountPercentageLevel3);
		}

		if (discountPercentageLevel4 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountPercentageLevel4\": ");

			sb.append(discountPercentageLevel4);
		}

		if (finalPrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"finalPrice\": ");

			sb.append(finalPrice);
		}

		if (finalPriceFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"finalPriceFormatted\": ");

			sb.append("\"");

			sb.append(_escape(finalPriceFormatted));

			sb.append("\"");
		}

		if (price != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"price\": ");

			sb.append(price);
		}

		if (priceFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceFormatted\": ");

			sb.append("\"");

			sb.append(_escape(priceFormatted));

			sb.append("\"");
		}

		if (priceOnApplication != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceOnApplication\": ");

			sb.append(priceOnApplication);
		}

		if (promoPrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"promoPrice\": ");

			sb.append(promoPrice);
		}

		if (promoPriceFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"promoPriceFormatted\": ");

			sb.append("\"");

			sb.append(_escape(promoPriceFormatted));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.delivery.cart.dto.v1_0.Price",
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