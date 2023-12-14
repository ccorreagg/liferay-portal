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
	public String getDiscount() {
		if (discount != null) {
			return discount;
		}

		discount = _discountSupplier.get();

		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;

		_discountSupplier = () -> discount;
	}

	@JsonIgnore
	public void setDiscount(
		UnsafeSupplier<String, Exception> discountUnsafeSupplier) {

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
	protected String discount;

	private Supplier<String> _discountSupplier = () -> null;

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
	public String[] getDiscountPercentages() {
		if (discountPercentages != null) {
			return discountPercentages;
		}

		discountPercentages = _discountPercentagesSupplier.get();

		return discountPercentages;
	}

	public void setDiscountPercentages(String[] discountPercentages) {
		this.discountPercentages = discountPercentages;

		_discountPercentagesSupplier = () -> discountPercentages;
	}

	@JsonIgnore
	public void setDiscountPercentages(
		UnsafeSupplier<String[], Exception> discountPercentagesUnsafeSupplier) {

		discountPercentages = null;

		_discountPercentagesSupplier = () -> {
			try {
				return discountPercentagesUnsafeSupplier.get();
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
	protected String[] discountPercentages;

	private Supplier<String[]> _discountPercentagesSupplier = () -> null;

	@Schema
	public String getFinalPrice() {
		if (finalPrice != null) {
			return finalPrice;
		}

		finalPrice = _finalPriceSupplier.get();

		return finalPrice;
	}

	public void setFinalPrice(String finalPrice) {
		this.finalPrice = finalPrice;

		_finalPriceSupplier = () -> finalPrice;
	}

	@JsonIgnore
	public void setFinalPrice(
		UnsafeSupplier<String, Exception> finalPriceUnsafeSupplier) {

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
	protected String finalPrice;

	private Supplier<String> _finalPriceSupplier = () -> null;

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

	@Schema
	public Double getTierPrice() {
		if (tierPrice != null) {
			return tierPrice;
		}

		tierPrice = _tierPriceSupplier.get();

		return tierPrice;
	}

	public void setTierPrice(Double tierPrice) {
		this.tierPrice = tierPrice;

		_tierPriceSupplier = () -> tierPrice;
	}

	@JsonIgnore
	public void setTierPrice(
		UnsafeSupplier<Double, Exception> tierPriceUnsafeSupplier) {

		tierPrice = null;

		_tierPriceSupplier = () -> {
			try {
				return tierPriceUnsafeSupplier.get();
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
	protected Double tierPrice;

	private Supplier<Double> _tierPriceSupplier = () -> null;

	@Schema
	public String getTierPriceFormatted() {
		if (tierPriceFormatted != null) {
			return tierPriceFormatted;
		}

		tierPriceFormatted = _tierPriceFormattedSupplier.get();

		return tierPriceFormatted;
	}

	public void setTierPriceFormatted(String tierPriceFormatted) {
		this.tierPriceFormatted = tierPriceFormatted;

		_tierPriceFormattedSupplier = () -> tierPriceFormatted;
	}

	@JsonIgnore
	public void setTierPriceFormatted(
		UnsafeSupplier<String, Exception> tierPriceFormattedUnsafeSupplier) {

		tierPriceFormatted = null;

		_tierPriceFormattedSupplier = () -> {
			try {
				return tierPriceFormattedUnsafeSupplier.get();
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
	protected String tierPriceFormatted;

	private Supplier<String> _tierPriceFormattedSupplier = () -> null;

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

			sb.append("\"");

			sb.append(_escape(discount));

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

		if (discountPercentages != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountPercentages\": ");

			sb.append("[");

			for (int i = 0; i < discountPercentages.length; i++) {
				sb.append("\"");

				sb.append(_escape(discountPercentages[i]));

				sb.append("\"");

				if ((i + 1) < discountPercentages.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (finalPrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"finalPrice\": ");

			sb.append("\"");

			sb.append(_escape(finalPrice));

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

		if (tierPrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tierPrice\": ");

			sb.append(tierPrice);
		}

		if (tierPriceFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tierPriceFormatted\": ");

			sb.append("\"");

			sb.append(_escape(tierPriceFormatted));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.delivery.catalog.dto.v1_0.Price",
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