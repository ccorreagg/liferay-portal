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
@GraphQLName("Summary")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Summary")
public class Summary implements Serializable {

	public static Summary toDTO(String json) {
		return ObjectMapperUtil.readValue(Summary.class, json);
	}

	public static Summary unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Summary.class, json);
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

	@Schema(example = "1.1")
	@Valid
	public BigDecimal getItemsQuantity() {
		if (itemsQuantity != null) {
			return itemsQuantity;
		}

		itemsQuantity = _itemsQuantitySupplier.get();

		return itemsQuantity;
	}

	public void setItemsQuantity(BigDecimal itemsQuantity) {
		this.itemsQuantity = itemsQuantity;

		_itemsQuantitySupplier = () -> itemsQuantity;
	}

	@JsonIgnore
	public void setItemsQuantity(
		UnsafeSupplier<BigDecimal, Exception> itemsQuantityUnsafeSupplier) {

		itemsQuantity = null;

		_itemsQuantitySupplier = () -> {
			try {
				return itemsQuantityUnsafeSupplier.get();
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
	protected BigDecimal itemsQuantity;

	private Supplier<BigDecimal> _itemsQuantitySupplier = () -> null;

	@Schema
	public String[] getShippingDiscountPercentages() {
		if (shippingDiscountPercentages != null) {
			return shippingDiscountPercentages;
		}

		shippingDiscountPercentages =
			_shippingDiscountPercentagesSupplier.get();

		return shippingDiscountPercentages;
	}

	public void setShippingDiscountPercentages(
		String[] shippingDiscountPercentages) {

		this.shippingDiscountPercentages = shippingDiscountPercentages;

		_shippingDiscountPercentagesSupplier =
			() -> shippingDiscountPercentages;
	}

	@JsonIgnore
	public void setShippingDiscountPercentages(
		UnsafeSupplier<String[], Exception>
			shippingDiscountPercentagesUnsafeSupplier) {

		shippingDiscountPercentages = null;

		_shippingDiscountPercentagesSupplier = () -> {
			try {
				return shippingDiscountPercentagesUnsafeSupplier.get();
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
	protected String[] shippingDiscountPercentages;

	private Supplier<String[]> _shippingDiscountPercentagesSupplier =
		() -> null;

	@Schema
	public Double getShippingDiscountValue() {
		if (shippingDiscountValue != null) {
			return shippingDiscountValue;
		}

		shippingDiscountValue = _shippingDiscountValueSupplier.get();

		return shippingDiscountValue;
	}

	public void setShippingDiscountValue(Double shippingDiscountValue) {
		this.shippingDiscountValue = shippingDiscountValue;

		_shippingDiscountValueSupplier = () -> shippingDiscountValue;
	}

	@JsonIgnore
	public void setShippingDiscountValue(
		UnsafeSupplier<Double, Exception> shippingDiscountValueUnsafeSupplier) {

		shippingDiscountValue = null;

		_shippingDiscountValueSupplier = () -> {
			try {
				return shippingDiscountValueUnsafeSupplier.get();
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
	protected Double shippingDiscountValue;

	private Supplier<Double> _shippingDiscountValueSupplier = () -> null;

	@Schema
	public String getShippingDiscountValueFormatted() {
		if (shippingDiscountValueFormatted != null) {
			return shippingDiscountValueFormatted;
		}

		shippingDiscountValueFormatted =
			_shippingDiscountValueFormattedSupplier.get();

		return shippingDiscountValueFormatted;
	}

	public void setShippingDiscountValueFormatted(
		String shippingDiscountValueFormatted) {

		this.shippingDiscountValueFormatted = shippingDiscountValueFormatted;

		_shippingDiscountValueFormattedSupplier =
			() -> shippingDiscountValueFormatted;
	}

	@JsonIgnore
	public void setShippingDiscountValueFormatted(
		UnsafeSupplier<String, Exception>
			shippingDiscountValueFormattedUnsafeSupplier) {

		shippingDiscountValueFormatted = null;

		_shippingDiscountValueFormattedSupplier = () -> {
			try {
				return shippingDiscountValueFormattedUnsafeSupplier.get();
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
	protected String shippingDiscountValueFormatted;

	private Supplier<String> _shippingDiscountValueFormattedSupplier =
		() -> null;

	@Schema
	public Double getShippingValue() {
		if (shippingValue != null) {
			return shippingValue;
		}

		shippingValue = _shippingValueSupplier.get();

		return shippingValue;
	}

	public void setShippingValue(Double shippingValue) {
		this.shippingValue = shippingValue;

		_shippingValueSupplier = () -> shippingValue;
	}

	@JsonIgnore
	public void setShippingValue(
		UnsafeSupplier<Double, Exception> shippingValueUnsafeSupplier) {

		shippingValue = null;

		_shippingValueSupplier = () -> {
			try {
				return shippingValueUnsafeSupplier.get();
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
	protected Double shippingValue;

	private Supplier<Double> _shippingValueSupplier = () -> null;

	@Schema
	public String getShippingValueFormatted() {
		if (shippingValueFormatted != null) {
			return shippingValueFormatted;
		}

		shippingValueFormatted = _shippingValueFormattedSupplier.get();

		return shippingValueFormatted;
	}

	public void setShippingValueFormatted(String shippingValueFormatted) {
		this.shippingValueFormatted = shippingValueFormatted;

		_shippingValueFormattedSupplier = () -> shippingValueFormatted;
	}

	@JsonIgnore
	public void setShippingValueFormatted(
		UnsafeSupplier<String, Exception>
			shippingValueFormattedUnsafeSupplier) {

		shippingValueFormatted = null;

		_shippingValueFormattedSupplier = () -> {
			try {
				return shippingValueFormattedUnsafeSupplier.get();
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
	protected String shippingValueFormatted;

	private Supplier<String> _shippingValueFormattedSupplier = () -> null;

	@Schema
	public Double getShippingValueWithTaxAmount() {
		if (shippingValueWithTaxAmount != null) {
			return shippingValueWithTaxAmount;
		}

		shippingValueWithTaxAmount = _shippingValueWithTaxAmountSupplier.get();

		return shippingValueWithTaxAmount;
	}

	public void setShippingValueWithTaxAmount(
		Double shippingValueWithTaxAmount) {

		this.shippingValueWithTaxAmount = shippingValueWithTaxAmount;

		_shippingValueWithTaxAmountSupplier = () -> shippingValueWithTaxAmount;
	}

	@JsonIgnore
	public void setShippingValueWithTaxAmount(
		UnsafeSupplier<Double, Exception>
			shippingValueWithTaxAmountUnsafeSupplier) {

		shippingValueWithTaxAmount = null;

		_shippingValueWithTaxAmountSupplier = () -> {
			try {
				return shippingValueWithTaxAmountUnsafeSupplier.get();
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
	protected Double shippingValueWithTaxAmount;

	private Supplier<Double> _shippingValueWithTaxAmountSupplier = () -> null;

	@Schema
	public String getShippingValueWithTaxAmountFormatted() {
		if (shippingValueWithTaxAmountFormatted != null) {
			return shippingValueWithTaxAmountFormatted;
		}

		shippingValueWithTaxAmountFormatted =
			_shippingValueWithTaxAmountFormattedSupplier.get();

		return shippingValueWithTaxAmountFormatted;
	}

	public void setShippingValueWithTaxAmountFormatted(
		String shippingValueWithTaxAmountFormatted) {

		this.shippingValueWithTaxAmountFormatted =
			shippingValueWithTaxAmountFormatted;

		_shippingValueWithTaxAmountFormattedSupplier =
			() -> shippingValueWithTaxAmountFormatted;
	}

	@JsonIgnore
	public void setShippingValueWithTaxAmountFormatted(
		UnsafeSupplier<String, Exception>
			shippingValueWithTaxAmountFormattedUnsafeSupplier) {

		shippingValueWithTaxAmountFormatted = null;

		_shippingValueWithTaxAmountFormattedSupplier = () -> {
			try {
				return shippingValueWithTaxAmountFormattedUnsafeSupplier.get();
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
	protected String shippingValueWithTaxAmountFormatted;

	private Supplier<String> _shippingValueWithTaxAmountFormattedSupplier =
		() -> null;

	@Schema
	public Double getSubtotal() {
		if (subtotal != null) {
			return subtotal;
		}

		subtotal = _subtotalSupplier.get();

		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;

		_subtotalSupplier = () -> subtotal;
	}

	@JsonIgnore
	public void setSubtotal(
		UnsafeSupplier<Double, Exception> subtotalUnsafeSupplier) {

		subtotal = null;

		_subtotalSupplier = () -> {
			try {
				return subtotalUnsafeSupplier.get();
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
	protected Double subtotal;

	private Supplier<Double> _subtotalSupplier = () -> null;

	@Schema
	public String[] getSubtotalDiscountPercentages() {
		if (subtotalDiscountPercentages != null) {
			return subtotalDiscountPercentages;
		}

		subtotalDiscountPercentages =
			_subtotalDiscountPercentagesSupplier.get();

		return subtotalDiscountPercentages;
	}

	public void setSubtotalDiscountPercentages(
		String[] subtotalDiscountPercentages) {

		this.subtotalDiscountPercentages = subtotalDiscountPercentages;

		_subtotalDiscountPercentagesSupplier =
			() -> subtotalDiscountPercentages;
	}

	@JsonIgnore
	public void setSubtotalDiscountPercentages(
		UnsafeSupplier<String[], Exception>
			subtotalDiscountPercentagesUnsafeSupplier) {

		subtotalDiscountPercentages = null;

		_subtotalDiscountPercentagesSupplier = () -> {
			try {
				return subtotalDiscountPercentagesUnsafeSupplier.get();
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
	protected String[] subtotalDiscountPercentages;

	private Supplier<String[]> _subtotalDiscountPercentagesSupplier =
		() -> null;

	@Schema
	public Double getSubtotalDiscountValue() {
		if (subtotalDiscountValue != null) {
			return subtotalDiscountValue;
		}

		subtotalDiscountValue = _subtotalDiscountValueSupplier.get();

		return subtotalDiscountValue;
	}

	public void setSubtotalDiscountValue(Double subtotalDiscountValue) {
		this.subtotalDiscountValue = subtotalDiscountValue;

		_subtotalDiscountValueSupplier = () -> subtotalDiscountValue;
	}

	@JsonIgnore
	public void setSubtotalDiscountValue(
		UnsafeSupplier<Double, Exception> subtotalDiscountValueUnsafeSupplier) {

		subtotalDiscountValue = null;

		_subtotalDiscountValueSupplier = () -> {
			try {
				return subtotalDiscountValueUnsafeSupplier.get();
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
	protected Double subtotalDiscountValue;

	private Supplier<Double> _subtotalDiscountValueSupplier = () -> null;

	@Schema
	public String getSubtotalDiscountValueFormatted() {
		if (subtotalDiscountValueFormatted != null) {
			return subtotalDiscountValueFormatted;
		}

		subtotalDiscountValueFormatted =
			_subtotalDiscountValueFormattedSupplier.get();

		return subtotalDiscountValueFormatted;
	}

	public void setSubtotalDiscountValueFormatted(
		String subtotalDiscountValueFormatted) {

		this.subtotalDiscountValueFormatted = subtotalDiscountValueFormatted;

		_subtotalDiscountValueFormattedSupplier =
			() -> subtotalDiscountValueFormatted;
	}

	@JsonIgnore
	public void setSubtotalDiscountValueFormatted(
		UnsafeSupplier<String, Exception>
			subtotalDiscountValueFormattedUnsafeSupplier) {

		subtotalDiscountValueFormatted = null;

		_subtotalDiscountValueFormattedSupplier = () -> {
			try {
				return subtotalDiscountValueFormattedUnsafeSupplier.get();
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
	protected String subtotalDiscountValueFormatted;

	private Supplier<String> _subtotalDiscountValueFormattedSupplier =
		() -> null;

	@Schema
	public String getSubtotalFormatted() {
		if (subtotalFormatted != null) {
			return subtotalFormatted;
		}

		subtotalFormatted = _subtotalFormattedSupplier.get();

		return subtotalFormatted;
	}

	public void setSubtotalFormatted(String subtotalFormatted) {
		this.subtotalFormatted = subtotalFormatted;

		_subtotalFormattedSupplier = () -> subtotalFormatted;
	}

	@JsonIgnore
	public void setSubtotalFormatted(
		UnsafeSupplier<String, Exception> subtotalFormattedUnsafeSupplier) {

		subtotalFormatted = null;

		_subtotalFormattedSupplier = () -> {
			try {
				return subtotalFormattedUnsafeSupplier.get();
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
	protected String subtotalFormatted;

	private Supplier<String> _subtotalFormattedSupplier = () -> null;

	@Schema
	public Double getTaxValue() {
		if (taxValue != null) {
			return taxValue;
		}

		taxValue = _taxValueSupplier.get();

		return taxValue;
	}

	public void setTaxValue(Double taxValue) {
		this.taxValue = taxValue;

		_taxValueSupplier = () -> taxValue;
	}

	@JsonIgnore
	public void setTaxValue(
		UnsafeSupplier<Double, Exception> taxValueUnsafeSupplier) {

		taxValue = null;

		_taxValueSupplier = () -> {
			try {
				return taxValueUnsafeSupplier.get();
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
	protected Double taxValue;

	private Supplier<Double> _taxValueSupplier = () -> null;

	@Schema
	public String getTaxValueFormatted() {
		if (taxValueFormatted != null) {
			return taxValueFormatted;
		}

		taxValueFormatted = _taxValueFormattedSupplier.get();

		return taxValueFormatted;
	}

	public void setTaxValueFormatted(String taxValueFormatted) {
		this.taxValueFormatted = taxValueFormatted;

		_taxValueFormattedSupplier = () -> taxValueFormatted;
	}

	@JsonIgnore
	public void setTaxValueFormatted(
		UnsafeSupplier<String, Exception> taxValueFormattedUnsafeSupplier) {

		taxValueFormatted = null;

		_taxValueFormattedSupplier = () -> {
			try {
				return taxValueFormattedUnsafeSupplier.get();
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
	protected String taxValueFormatted;

	private Supplier<String> _taxValueFormattedSupplier = () -> null;

	@Schema
	public Double getTotal() {
		if (total != null) {
			return total;
		}

		total = _totalSupplier.get();

		return total;
	}

	public void setTotal(Double total) {
		this.total = total;

		_totalSupplier = () -> total;
	}

	@JsonIgnore
	public void setTotal(
		UnsafeSupplier<Double, Exception> totalUnsafeSupplier) {

		total = null;

		_totalSupplier = () -> {
			try {
				return totalUnsafeSupplier.get();
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
	protected Double total;

	private Supplier<Double> _totalSupplier = () -> null;

	@Schema
	public String[] getTotalDiscountPercentages() {
		if (totalDiscountPercentages != null) {
			return totalDiscountPercentages;
		}

		totalDiscountPercentages = _totalDiscountPercentagesSupplier.get();

		return totalDiscountPercentages;
	}

	public void setTotalDiscountPercentages(String[] totalDiscountPercentages) {
		this.totalDiscountPercentages = totalDiscountPercentages;

		_totalDiscountPercentagesSupplier = () -> totalDiscountPercentages;
	}

	@JsonIgnore
	public void setTotalDiscountPercentages(
		UnsafeSupplier<String[], Exception>
			totalDiscountPercentagesUnsafeSupplier) {

		totalDiscountPercentages = null;

		_totalDiscountPercentagesSupplier = () -> {
			try {
				return totalDiscountPercentagesUnsafeSupplier.get();
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
	protected String[] totalDiscountPercentages;

	private Supplier<String[]> _totalDiscountPercentagesSupplier = () -> null;

	@Schema
	public Double getTotalDiscountValue() {
		if (totalDiscountValue != null) {
			return totalDiscountValue;
		}

		totalDiscountValue = _totalDiscountValueSupplier.get();

		return totalDiscountValue;
	}

	public void setTotalDiscountValue(Double totalDiscountValue) {
		this.totalDiscountValue = totalDiscountValue;

		_totalDiscountValueSupplier = () -> totalDiscountValue;
	}

	@JsonIgnore
	public void setTotalDiscountValue(
		UnsafeSupplier<Double, Exception> totalDiscountValueUnsafeSupplier) {

		totalDiscountValue = null;

		_totalDiscountValueSupplier = () -> {
			try {
				return totalDiscountValueUnsafeSupplier.get();
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
	protected Double totalDiscountValue;

	private Supplier<Double> _totalDiscountValueSupplier = () -> null;

	@Schema
	public String getTotalDiscountValueFormatted() {
		if (totalDiscountValueFormatted != null) {
			return totalDiscountValueFormatted;
		}

		totalDiscountValueFormatted =
			_totalDiscountValueFormattedSupplier.get();

		return totalDiscountValueFormatted;
	}

	public void setTotalDiscountValueFormatted(
		String totalDiscountValueFormatted) {

		this.totalDiscountValueFormatted = totalDiscountValueFormatted;

		_totalDiscountValueFormattedSupplier =
			() -> totalDiscountValueFormatted;
	}

	@JsonIgnore
	public void setTotalDiscountValueFormatted(
		UnsafeSupplier<String, Exception>
			totalDiscountValueFormattedUnsafeSupplier) {

		totalDiscountValueFormatted = null;

		_totalDiscountValueFormattedSupplier = () -> {
			try {
				return totalDiscountValueFormattedUnsafeSupplier.get();
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
	protected String totalDiscountValueFormatted;

	private Supplier<String> _totalDiscountValueFormattedSupplier = () -> null;

	@Schema
	public String getTotalFormatted() {
		if (totalFormatted != null) {
			return totalFormatted;
		}

		totalFormatted = _totalFormattedSupplier.get();

		return totalFormatted;
	}

	public void setTotalFormatted(String totalFormatted) {
		this.totalFormatted = totalFormatted;

		_totalFormattedSupplier = () -> totalFormatted;
	}

	@JsonIgnore
	public void setTotalFormatted(
		UnsafeSupplier<String, Exception> totalFormattedUnsafeSupplier) {

		totalFormatted = null;

		_totalFormattedSupplier = () -> {
			try {
				return totalFormattedUnsafeSupplier.get();
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
	protected String totalFormatted;

	private Supplier<String> _totalFormattedSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Summary)) {
			return false;
		}

		Summary summary = (Summary)object;

		return Objects.equals(toString(), summary.toString());
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

		if (itemsQuantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"itemsQuantity\": ");

			sb.append(itemsQuantity);
		}

		if (shippingDiscountPercentages != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountPercentages\": ");

			sb.append("[");

			for (int i = 0; i < shippingDiscountPercentages.length; i++) {
				sb.append("\"");

				sb.append(_escape(shippingDiscountPercentages[i]));

				sb.append("\"");

				if ((i + 1) < shippingDiscountPercentages.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (shippingDiscountValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountValue\": ");

			sb.append(shippingDiscountValue);
		}

		if (shippingDiscountValueFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountValueFormatted\": ");

			sb.append("\"");

			sb.append(_escape(shippingDiscountValueFormatted));

			sb.append("\"");
		}

		if (shippingValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingValue\": ");

			sb.append(shippingValue);
		}

		if (shippingValueFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingValueFormatted\": ");

			sb.append("\"");

			sb.append(_escape(shippingValueFormatted));

			sb.append("\"");
		}

		if (shippingValueWithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingValueWithTaxAmount\": ");

			sb.append(shippingValueWithTaxAmount);
		}

		if (shippingValueWithTaxAmountFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingValueWithTaxAmountFormatted\": ");

			sb.append("\"");

			sb.append(_escape(shippingValueWithTaxAmountFormatted));

			sb.append("\"");
		}

		if (subtotal != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotal\": ");

			sb.append(subtotal);
		}

		if (subtotalDiscountPercentages != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalDiscountPercentages\": ");

			sb.append("[");

			for (int i = 0; i < subtotalDiscountPercentages.length; i++) {
				sb.append("\"");

				sb.append(_escape(subtotalDiscountPercentages[i]));

				sb.append("\"");

				if ((i + 1) < subtotalDiscountPercentages.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (subtotalDiscountValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalDiscountValue\": ");

			sb.append(subtotalDiscountValue);
		}

		if (subtotalDiscountValueFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalDiscountValueFormatted\": ");

			sb.append("\"");

			sb.append(_escape(subtotalDiscountValueFormatted));

			sb.append("\"");
		}

		if (subtotalFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalFormatted\": ");

			sb.append("\"");

			sb.append(_escape(subtotalFormatted));

			sb.append("\"");
		}

		if (taxValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"taxValue\": ");

			sb.append(taxValue);
		}

		if (taxValueFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"taxValueFormatted\": ");

			sb.append("\"");

			sb.append(_escape(taxValueFormatted));

			sb.append("\"");
		}

		if (total != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"total\": ");

			sb.append(total);
		}

		if (totalDiscountPercentages != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountPercentages\": ");

			sb.append("[");

			for (int i = 0; i < totalDiscountPercentages.length; i++) {
				sb.append("\"");

				sb.append(_escape(totalDiscountPercentages[i]));

				sb.append("\"");

				if ((i + 1) < totalDiscountPercentages.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (totalDiscountValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountValue\": ");

			sb.append(totalDiscountValue);
		}

		if (totalDiscountValueFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountValueFormatted\": ");

			sb.append("\"");

			sb.append(_escape(totalDiscountValueFormatted));

			sb.append("\"");
		}

		if (totalFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalFormatted\": ");

			sb.append("\"");

			sb.append(_escape(totalFormatted));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.delivery.cart.dto.v1_0.Summary",
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