/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.order.dto.v1_0;

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

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
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
 * @author Alessio Antonio Rendina
 * @generated
 */
@Generated("")
@GraphQLName("OrderItem")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "OrderItem")
public class OrderItem implements Serializable {

	public static OrderItem toDTO(String json) {
		return ObjectMapperUtil.readValue(OrderItem.class, json);
	}

	public static OrderItem unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(OrderItem.class, json);
	}

	@DecimalMin("0")
	@Schema(example = "32144")
	public Long getBookedQuantityId() {
		if (bookedQuantityId != null) {
			return bookedQuantityId;
		}

		bookedQuantityId = _bookedQuantityIdSupplier.get();

		return bookedQuantityId;
	}

	public void setBookedQuantityId(Long bookedQuantityId) {
		this.bookedQuantityId = bookedQuantityId;

		_bookedQuantityIdSupplier = () -> bookedQuantityId;
	}

	@JsonIgnore
	public void setBookedQuantityId(
		UnsafeSupplier<Long, Exception> bookedQuantityIdUnsafeSupplier) {

		bookedQuantityId = null;

		_bookedQuantityIdSupplier = () -> {
			try {
				return bookedQuantityIdUnsafeSupplier.get();
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
	protected Long bookedQuantityId;

	private Supplier<Long> _bookedQuantityIdSupplier = () -> null;

	@Schema
	@Valid
	public CustomField[] getCustomFields() {
		if (customFields != null) {
			return customFields;
		}

		customFields = _customFieldsSupplier.get();

		return customFields;
	}

	public void setCustomFields(CustomField[] customFields) {
		this.customFields = customFields;

		_customFieldsSupplier = () -> customFields;
	}

	@JsonIgnore
	public void setCustomFields(
		UnsafeSupplier<CustomField[], Exception> customFieldsUnsafeSupplier) {

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
	protected CustomField[] customFields;

	private Supplier<CustomField[]> _customFieldsSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "10.1")
	@Valid
	public BigDecimal getDecimalQuantity() {
		if (decimalQuantity != null) {
			return decimalQuantity;
		}

		decimalQuantity = _decimalQuantitySupplier.get();

		return decimalQuantity;
	}

	public void setDecimalQuantity(BigDecimal decimalQuantity) {
		this.decimalQuantity = decimalQuantity;

		_decimalQuantitySupplier = () -> decimalQuantity;
	}

	@JsonIgnore
	public void setDecimalQuantity(
		UnsafeSupplier<BigDecimal, Exception> decimalQuantityUnsafeSupplier) {

		decimalQuantity = null;

		_decimalQuantitySupplier = () -> {
			try {
				return decimalQuantityUnsafeSupplier.get();
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
	protected BigDecimal decimalQuantity;

	private Supplier<BigDecimal> _decimalQuantitySupplier = () -> null;

	@Schema(example = "separate package")
	public String getDeliveryGroup() {
		if (deliveryGroup != null) {
			return deliveryGroup;
		}

		deliveryGroup = _deliveryGroupSupplier.get();

		return deliveryGroup;
	}

	public void setDeliveryGroup(String deliveryGroup) {
		this.deliveryGroup = deliveryGroup;

		_deliveryGroupSupplier = () -> deliveryGroup;
	}

	@JsonIgnore
	public void setDeliveryGroup(
		UnsafeSupplier<String, Exception> deliveryGroupUnsafeSupplier) {

		deliveryGroup = null;

		_deliveryGroupSupplier = () -> {
			try {
				return deliveryGroupUnsafeSupplier.get();
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
	protected String deliveryGroup;

	private Supplier<String> _deliveryGroupSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "2")
	@Valid
	public BigDecimal getDiscountAmount() {
		if (discountAmount != null) {
			return discountAmount;
		}

		discountAmount = _discountAmountSupplier.get();

		return discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;

		_discountAmountSupplier = () -> discountAmount;
	}

	@JsonIgnore
	public void setDiscountAmount(
		UnsafeSupplier<BigDecimal, Exception> discountAmountUnsafeSupplier) {

		discountAmount = null;

		_discountAmountSupplier = () -> {
			try {
				return discountAmountUnsafeSupplier.get();
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
	protected BigDecimal discountAmount;

	private Supplier<BigDecimal> _discountAmountSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getDiscountManuallyAdjusted() {
		if (discountManuallyAdjusted != null) {
			return discountManuallyAdjusted;
		}

		discountManuallyAdjusted = _discountManuallyAdjustedSupplier.get();

		return discountManuallyAdjusted;
	}

	public void setDiscountManuallyAdjusted(Boolean discountManuallyAdjusted) {
		this.discountManuallyAdjusted = discountManuallyAdjusted;

		_discountManuallyAdjustedSupplier = () -> discountManuallyAdjusted;
	}

	@JsonIgnore
	public void setDiscountManuallyAdjusted(
		UnsafeSupplier<Boolean, Exception>
			discountManuallyAdjustedUnsafeSupplier) {

		discountManuallyAdjusted = null;

		_discountManuallyAdjustedSupplier = () -> {
			try {
				return discountManuallyAdjustedUnsafeSupplier.get();
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
	protected Boolean discountManuallyAdjusted;

	private Supplier<Boolean> _discountManuallyAdjustedSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "20")
	@Valid
	public BigDecimal getDiscountPercentageLevel1() {
		if (discountPercentageLevel1 != null) {
			return discountPercentageLevel1;
		}

		discountPercentageLevel1 = _discountPercentageLevel1Supplier.get();

		return discountPercentageLevel1;
	}

	public void setDiscountPercentageLevel1(
		BigDecimal discountPercentageLevel1) {

		this.discountPercentageLevel1 = discountPercentageLevel1;

		_discountPercentageLevel1Supplier = () -> discountPercentageLevel1;
	}

	@JsonIgnore
	public void setDiscountPercentageLevel1(
		UnsafeSupplier<BigDecimal, Exception>
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
	protected BigDecimal discountPercentageLevel1;

	private Supplier<BigDecimal> _discountPercentageLevel1Supplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "20")
	@Valid
	public BigDecimal getDiscountPercentageLevel1WithTaxAmount() {
		if (discountPercentageLevel1WithTaxAmount != null) {
			return discountPercentageLevel1WithTaxAmount;
		}

		discountPercentageLevel1WithTaxAmount =
			_discountPercentageLevel1WithTaxAmountSupplier.get();

		return discountPercentageLevel1WithTaxAmount;
	}

	public void setDiscountPercentageLevel1WithTaxAmount(
		BigDecimal discountPercentageLevel1WithTaxAmount) {

		this.discountPercentageLevel1WithTaxAmount =
			discountPercentageLevel1WithTaxAmount;

		_discountPercentageLevel1WithTaxAmountSupplier =
			() -> discountPercentageLevel1WithTaxAmount;
	}

	@JsonIgnore
	public void setDiscountPercentageLevel1WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			discountPercentageLevel1WithTaxAmountUnsafeSupplier) {

		discountPercentageLevel1WithTaxAmount = null;

		_discountPercentageLevel1WithTaxAmountSupplier = () -> {
			try {
				return discountPercentageLevel1WithTaxAmountUnsafeSupplier.
					get();
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
	protected BigDecimal discountPercentageLevel1WithTaxAmount;

	private Supplier<BigDecimal>
		_discountPercentageLevel1WithTaxAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getDiscountPercentageLevel2() {
		if (discountPercentageLevel2 != null) {
			return discountPercentageLevel2;
		}

		discountPercentageLevel2 = _discountPercentageLevel2Supplier.get();

		return discountPercentageLevel2;
	}

	public void setDiscountPercentageLevel2(
		BigDecimal discountPercentageLevel2) {

		this.discountPercentageLevel2 = discountPercentageLevel2;

		_discountPercentageLevel2Supplier = () -> discountPercentageLevel2;
	}

	@JsonIgnore
	public void setDiscountPercentageLevel2(
		UnsafeSupplier<BigDecimal, Exception>
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
	protected BigDecimal discountPercentageLevel2;

	private Supplier<BigDecimal> _discountPercentageLevel2Supplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getDiscountPercentageLevel2WithTaxAmount() {
		if (discountPercentageLevel2WithTaxAmount != null) {
			return discountPercentageLevel2WithTaxAmount;
		}

		discountPercentageLevel2WithTaxAmount =
			_discountPercentageLevel2WithTaxAmountSupplier.get();

		return discountPercentageLevel2WithTaxAmount;
	}

	public void setDiscountPercentageLevel2WithTaxAmount(
		BigDecimal discountPercentageLevel2WithTaxAmount) {

		this.discountPercentageLevel2WithTaxAmount =
			discountPercentageLevel2WithTaxAmount;

		_discountPercentageLevel2WithTaxAmountSupplier =
			() -> discountPercentageLevel2WithTaxAmount;
	}

	@JsonIgnore
	public void setDiscountPercentageLevel2WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			discountPercentageLevel2WithTaxAmountUnsafeSupplier) {

		discountPercentageLevel2WithTaxAmount = null;

		_discountPercentageLevel2WithTaxAmountSupplier = () -> {
			try {
				return discountPercentageLevel2WithTaxAmountUnsafeSupplier.
					get();
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
	protected BigDecimal discountPercentageLevel2WithTaxAmount;

	private Supplier<BigDecimal>
		_discountPercentageLevel2WithTaxAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getDiscountPercentageLevel3() {
		if (discountPercentageLevel3 != null) {
			return discountPercentageLevel3;
		}

		discountPercentageLevel3 = _discountPercentageLevel3Supplier.get();

		return discountPercentageLevel3;
	}

	public void setDiscountPercentageLevel3(
		BigDecimal discountPercentageLevel3) {

		this.discountPercentageLevel3 = discountPercentageLevel3;

		_discountPercentageLevel3Supplier = () -> discountPercentageLevel3;
	}

	@JsonIgnore
	public void setDiscountPercentageLevel3(
		UnsafeSupplier<BigDecimal, Exception>
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
	protected BigDecimal discountPercentageLevel3;

	private Supplier<BigDecimal> _discountPercentageLevel3Supplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getDiscountPercentageLevel3WithTaxAmount() {
		if (discountPercentageLevel3WithTaxAmount != null) {
			return discountPercentageLevel3WithTaxAmount;
		}

		discountPercentageLevel3WithTaxAmount =
			_discountPercentageLevel3WithTaxAmountSupplier.get();

		return discountPercentageLevel3WithTaxAmount;
	}

	public void setDiscountPercentageLevel3WithTaxAmount(
		BigDecimal discountPercentageLevel3WithTaxAmount) {

		this.discountPercentageLevel3WithTaxAmount =
			discountPercentageLevel3WithTaxAmount;

		_discountPercentageLevel3WithTaxAmountSupplier =
			() -> discountPercentageLevel3WithTaxAmount;
	}

	@JsonIgnore
	public void setDiscountPercentageLevel3WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			discountPercentageLevel3WithTaxAmountUnsafeSupplier) {

		discountPercentageLevel3WithTaxAmount = null;

		_discountPercentageLevel3WithTaxAmountSupplier = () -> {
			try {
				return discountPercentageLevel3WithTaxAmountUnsafeSupplier.
					get();
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
	protected BigDecimal discountPercentageLevel3WithTaxAmount;

	private Supplier<BigDecimal>
		_discountPercentageLevel3WithTaxAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getDiscountPercentageLevel4() {
		if (discountPercentageLevel4 != null) {
			return discountPercentageLevel4;
		}

		discountPercentageLevel4 = _discountPercentageLevel4Supplier.get();

		return discountPercentageLevel4;
	}

	public void setDiscountPercentageLevel4(
		BigDecimal discountPercentageLevel4) {

		this.discountPercentageLevel4 = discountPercentageLevel4;

		_discountPercentageLevel4Supplier = () -> discountPercentageLevel4;
	}

	@JsonIgnore
	public void setDiscountPercentageLevel4(
		UnsafeSupplier<BigDecimal, Exception>
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
	protected BigDecimal discountPercentageLevel4;

	private Supplier<BigDecimal> _discountPercentageLevel4Supplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getDiscountPercentageLevel4WithTaxAmount() {
		if (discountPercentageLevel4WithTaxAmount != null) {
			return discountPercentageLevel4WithTaxAmount;
		}

		discountPercentageLevel4WithTaxAmount =
			_discountPercentageLevel4WithTaxAmountSupplier.get();

		return discountPercentageLevel4WithTaxAmount;
	}

	public void setDiscountPercentageLevel4WithTaxAmount(
		BigDecimal discountPercentageLevel4WithTaxAmount) {

		this.discountPercentageLevel4WithTaxAmount =
			discountPercentageLevel4WithTaxAmount;

		_discountPercentageLevel4WithTaxAmountSupplier =
			() -> discountPercentageLevel4WithTaxAmount;
	}

	@JsonIgnore
	public void setDiscountPercentageLevel4WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			discountPercentageLevel4WithTaxAmountUnsafeSupplier) {

		discountPercentageLevel4WithTaxAmount = null;

		_discountPercentageLevel4WithTaxAmountSupplier = () -> {
			try {
				return discountPercentageLevel4WithTaxAmountUnsafeSupplier.
					get();
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
	protected BigDecimal discountPercentageLevel4WithTaxAmount;

	private Supplier<BigDecimal>
		_discountPercentageLevel4WithTaxAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "2")
	@Valid
	public BigDecimal getDiscountWithTaxAmount() {
		if (discountWithTaxAmount != null) {
			return discountWithTaxAmount;
		}

		discountWithTaxAmount = _discountWithTaxAmountSupplier.get();

		return discountWithTaxAmount;
	}

	public void setDiscountWithTaxAmount(BigDecimal discountWithTaxAmount) {
		this.discountWithTaxAmount = discountWithTaxAmount;

		_discountWithTaxAmountSupplier = () -> discountWithTaxAmount;
	}

	@JsonIgnore
	public void setDiscountWithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			discountWithTaxAmountUnsafeSupplier) {

		discountWithTaxAmount = null;

		_discountWithTaxAmountSupplier = () -> {
			try {
				return discountWithTaxAmountUnsafeSupplier.get();
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
	protected BigDecimal discountWithTaxAmount;

	private Supplier<BigDecimal> _discountWithTaxAmountSupplier = () -> null;

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
	@Schema(example = "200")
	@Valid
	public BigDecimal getFinalPrice() {
		if (finalPrice != null) {
			return finalPrice;
		}

		finalPrice = _finalPriceSupplier.get();

		return finalPrice;
	}

	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;

		_finalPriceSupplier = () -> finalPrice;
	}

	@JsonIgnore
	public void setFinalPrice(
		UnsafeSupplier<BigDecimal, Exception> finalPriceUnsafeSupplier) {

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
	protected BigDecimal finalPrice;

	private Supplier<BigDecimal> _finalPriceSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "200")
	@Valid
	public BigDecimal getFinalPriceWithTaxAmount() {
		if (finalPriceWithTaxAmount != null) {
			return finalPriceWithTaxAmount;
		}

		finalPriceWithTaxAmount = _finalPriceWithTaxAmountSupplier.get();

		return finalPriceWithTaxAmount;
	}

	public void setFinalPriceWithTaxAmount(BigDecimal finalPriceWithTaxAmount) {
		this.finalPriceWithTaxAmount = finalPriceWithTaxAmount;

		_finalPriceWithTaxAmountSupplier = () -> finalPriceWithTaxAmount;
	}

	@JsonIgnore
	public void setFinalPriceWithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			finalPriceWithTaxAmountUnsafeSupplier) {

		finalPriceWithTaxAmount = null;

		_finalPriceWithTaxAmountSupplier = () -> {
			try {
				return finalPriceWithTaxAmountUnsafeSupplier.get();
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
	protected BigDecimal finalPriceWithTaxAmount;

	private Supplier<BigDecimal> _finalPriceWithTaxAmountSupplier = () -> null;

	@Schema
	public String getFormattedQuantity() {
		if (formattedQuantity != null) {
			return formattedQuantity;
		}

		formattedQuantity = _formattedQuantitySupplier.get();

		return formattedQuantity;
	}

	public void setFormattedQuantity(String formattedQuantity) {
		this.formattedQuantity = formattedQuantity;

		_formattedQuantitySupplier = () -> formattedQuantity;
	}

	@JsonIgnore
	public void setFormattedQuantity(
		UnsafeSupplier<String, Exception> formattedQuantityUnsafeSupplier) {

		formattedQuantity = null;

		_formattedQuantitySupplier = () -> {
			try {
				return formattedQuantityUnsafeSupplier.get();
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
	protected String formattedQuantity;

	private Supplier<String> _formattedQuantitySupplier = () -> null;

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
	protected Map<String, String> name;

	private Supplier<Map<String, String>> _nameSupplier = () -> null;

	@Schema
	public String getOptions() {
		if (options != null) {
			return options;
		}

		options = _optionsSupplier.get();

		return options;
	}

	public void setOptions(String options) {
		this.options = options;

		_optionsSupplier = () -> options;
	}

	@JsonIgnore
	public void setOptions(
		UnsafeSupplier<String, Exception> optionsUnsafeSupplier) {

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
	protected String options;

	private Supplier<String> _optionsSupplier = () -> null;

	@Schema(example = "CAB-34098-789-N")
	public String getOrderExternalReferenceCode() {
		if (orderExternalReferenceCode != null) {
			return orderExternalReferenceCode;
		}

		orderExternalReferenceCode = _orderExternalReferenceCodeSupplier.get();

		return orderExternalReferenceCode;
	}

	public void setOrderExternalReferenceCode(
		String orderExternalReferenceCode) {

		this.orderExternalReferenceCode = orderExternalReferenceCode;

		_orderExternalReferenceCodeSupplier = () -> orderExternalReferenceCode;
	}

	@JsonIgnore
	public void setOrderExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			orderExternalReferenceCodeUnsafeSupplier) {

		orderExternalReferenceCode = null;

		_orderExternalReferenceCodeSupplier = () -> {
			try {
				return orderExternalReferenceCodeUnsafeSupplier.get();
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
	protected String orderExternalReferenceCode;

	private Supplier<String> _orderExternalReferenceCodeSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30128")
	public Long getOrderId() {
		if (orderId != null) {
			return orderId;
		}

		orderId = _orderIdSupplier.get();

		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;

		_orderIdSupplier = () -> orderId;
	}

	@JsonIgnore
	public void setOrderId(
		UnsafeSupplier<Long, Exception> orderIdUnsafeSupplier) {

		orderId = null;

		_orderIdSupplier = () -> {
			try {
				return orderIdUnsafeSupplier.get();
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
	protected Long orderId;

	private Supplier<Long> _orderIdSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getPriceManuallyAdjusted() {
		if (priceManuallyAdjusted != null) {
			return priceManuallyAdjusted;
		}

		priceManuallyAdjusted = _priceManuallyAdjustedSupplier.get();

		return priceManuallyAdjusted;
	}

	public void setPriceManuallyAdjusted(Boolean priceManuallyAdjusted) {
		this.priceManuallyAdjusted = priceManuallyAdjusted;

		_priceManuallyAdjustedSupplier = () -> priceManuallyAdjusted;
	}

	@JsonIgnore
	public void setPriceManuallyAdjusted(
		UnsafeSupplier<Boolean, Exception>
			priceManuallyAdjustedUnsafeSupplier) {

		priceManuallyAdjusted = null;

		_priceManuallyAdjustedSupplier = () -> {
			try {
				return priceManuallyAdjustedUnsafeSupplier.get();
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
	protected Boolean priceManuallyAdjusted;

	private Supplier<Boolean> _priceManuallyAdjustedSupplier = () -> null;

	@Schema(example = "Order item printed note")
	public String getPrintedNote() {
		if (printedNote != null) {
			return printedNote;
		}

		printedNote = _printedNoteSupplier.get();

		return printedNote;
	}

	public void setPrintedNote(String printedNote) {
		this.printedNote = printedNote;

		_printedNoteSupplier = () -> printedNote;
	}

	@JsonIgnore
	public void setPrintedNote(
		UnsafeSupplier<String, Exception> printedNoteUnsafeSupplier) {

		printedNote = null;

		_printedNoteSupplier = () -> {
			try {
				return printedNoteUnsafeSupplier.get();
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
	protected String printedNote;

	private Supplier<String> _printedNoteSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "101")
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

	@DecimalMin("0")
	@Schema(example = "101")
	@Valid
	public BigDecimal getPromoPriceWithTaxAmount() {
		if (promoPriceWithTaxAmount != null) {
			return promoPriceWithTaxAmount;
		}

		promoPriceWithTaxAmount = _promoPriceWithTaxAmountSupplier.get();

		return promoPriceWithTaxAmount;
	}

	public void setPromoPriceWithTaxAmount(BigDecimal promoPriceWithTaxAmount) {
		this.promoPriceWithTaxAmount = promoPriceWithTaxAmount;

		_promoPriceWithTaxAmountSupplier = () -> promoPriceWithTaxAmount;
	}

	@JsonIgnore
	public void setPromoPriceWithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			promoPriceWithTaxAmountUnsafeSupplier) {

		promoPriceWithTaxAmount = null;

		_promoPriceWithTaxAmountSupplier = () -> {
			try {
				return promoPriceWithTaxAmountUnsafeSupplier.get();
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
	protected BigDecimal promoPriceWithTaxAmount;

	private Supplier<BigDecimal> _promoPriceWithTaxAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "2.1")
	@Valid
	public BigDecimal getQuantity() {
		if (quantity != null) {
			return quantity;
		}

		quantity = _quantitySupplier.get();

		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;

		_quantitySupplier = () -> quantity;
	}

	@JsonIgnore
	public void setQuantity(
		UnsafeSupplier<BigDecimal, Exception> quantityUnsafeSupplier) {

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
	protected BigDecimal quantity;

	private Supplier<BigDecimal> _quantitySupplier = () -> null;

	@Schema(example = "1234123124")
	public String getReplacedSku() {
		if (replacedSku != null) {
			return replacedSku;
		}

		replacedSku = _replacedSkuSupplier.get();

		return replacedSku;
	}

	public void setReplacedSku(String replacedSku) {
		this.replacedSku = replacedSku;

		_replacedSkuSupplier = () -> replacedSku;
	}

	@JsonIgnore
	public void setReplacedSku(
		UnsafeSupplier<String, Exception> replacedSkuUnsafeSupplier) {

		replacedSku = null;

		_replacedSkuSupplier = () -> {
			try {
				return replacedSkuUnsafeSupplier.get();
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
	protected String replacedSku;

	private Supplier<String> _replacedSkuSupplier = () -> null;

	@Schema
	public Long getReplacedSkuId() {
		if (replacedSkuId != null) {
			return replacedSkuId;
		}

		replacedSkuId = _replacedSkuIdSupplier.get();

		return replacedSkuId;
	}

	public void setReplacedSkuId(Long replacedSkuId) {
		this.replacedSkuId = replacedSkuId;

		_replacedSkuIdSupplier = () -> replacedSkuId;
	}

	@JsonIgnore
	public void setReplacedSkuId(
		UnsafeSupplier<Long, Exception> replacedSkuIdUnsafeSupplier) {

		replacedSkuId = null;

		_replacedSkuIdSupplier = () -> {
			try {
				return replacedSkuIdUnsafeSupplier.get();
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
	protected Long replacedSkuId;

	private Supplier<Long> _replacedSkuIdSupplier = () -> null;

	@Schema(example = "2017-07-21")
	public Date getRequestedDeliveryDate() {
		if (requestedDeliveryDate != null) {
			return requestedDeliveryDate;
		}

		requestedDeliveryDate = _requestedDeliveryDateSupplier.get();

		return requestedDeliveryDate;
	}

	public void setRequestedDeliveryDate(Date requestedDeliveryDate) {
		this.requestedDeliveryDate = requestedDeliveryDate;

		_requestedDeliveryDateSupplier = () -> requestedDeliveryDate;
	}

	@JsonIgnore
	public void setRequestedDeliveryDate(
		UnsafeSupplier<Date, Exception> requestedDeliveryDateUnsafeSupplier) {

		requestedDeliveryDate = null;

		_requestedDeliveryDateSupplier = () -> {
			try {
				return requestedDeliveryDateUnsafeSupplier.get();
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
	protected Date requestedDeliveryDate;

	private Supplier<Date> _requestedDeliveryDateSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "1.1")
	@Valid
	public BigDecimal getShippedQuantity() {
		if (shippedQuantity != null) {
			return shippedQuantity;
		}

		shippedQuantity = _shippedQuantitySupplier.get();

		return shippedQuantity;
	}

	public void setShippedQuantity(BigDecimal shippedQuantity) {
		this.shippedQuantity = shippedQuantity;

		_shippedQuantitySupplier = () -> shippedQuantity;
	}

	@JsonIgnore
	public void setShippedQuantity(
		UnsafeSupplier<BigDecimal, Exception> shippedQuantityUnsafeSupplier) {

		shippedQuantity = null;

		_shippedQuantitySupplier = () -> {
			try {
				return shippedQuantityUnsafeSupplier.get();
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
	protected BigDecimal shippedQuantity;

	private Supplier<BigDecimal> _shippedQuantitySupplier = () -> null;

	@Schema
	@Valid
	public ShippingAddress getShippingAddress() {
		if (shippingAddress != null) {
			return shippingAddress;
		}

		shippingAddress = _shippingAddressSupplier.get();

		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;

		_shippingAddressSupplier = () -> shippingAddress;
	}

	@JsonIgnore
	public void setShippingAddress(
		UnsafeSupplier<ShippingAddress, Exception>
			shippingAddressUnsafeSupplier) {

		shippingAddress = null;

		_shippingAddressSupplier = () -> {
			try {
				return shippingAddressUnsafeSupplier.get();
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
	protected ShippingAddress shippingAddress;

	private Supplier<ShippingAddress> _shippingAddressSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "31130")
	public Long getShippingAddressId() {
		if (shippingAddressId != null) {
			return shippingAddressId;
		}

		shippingAddressId = _shippingAddressIdSupplier.get();

		return shippingAddressId;
	}

	public void setShippingAddressId(Long shippingAddressId) {
		this.shippingAddressId = shippingAddressId;

		_shippingAddressIdSupplier = () -> shippingAddressId;
	}

	@JsonIgnore
	public void setShippingAddressId(
		UnsafeSupplier<Long, Exception> shippingAddressIdUnsafeSupplier) {

		shippingAddressId = null;

		_shippingAddressIdSupplier = () -> {
			try {
				return shippingAddressIdUnsafeSupplier.get();
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
	protected Long shippingAddressId;

	private Supplier<Long> _shippingAddressIdSupplier = () -> null;

	@Schema(example = "12341234")
	public String getSku() {
		if (sku != null) {
			return sku;
		}

		sku = _skuSupplier.get();

		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;

		_skuSupplier = () -> sku;
	}

	@JsonIgnore
	public void setSku(UnsafeSupplier<String, Exception> skuUnsafeSupplier) {
		sku = null;

		_skuSupplier = () -> {
			try {
				return skuUnsafeSupplier.get();
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
	protected String sku;

	private Supplier<String> _skuSupplier = () -> null;

	@Schema(example = "CAB-34098-789-N")
	public String getSkuExternalReferenceCode() {
		if (skuExternalReferenceCode != null) {
			return skuExternalReferenceCode;
		}

		skuExternalReferenceCode = _skuExternalReferenceCodeSupplier.get();

		return skuExternalReferenceCode;
	}

	public void setSkuExternalReferenceCode(String skuExternalReferenceCode) {
		this.skuExternalReferenceCode = skuExternalReferenceCode;

		_skuExternalReferenceCodeSupplier = () -> skuExternalReferenceCode;
	}

	@JsonIgnore
	public void setSkuExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			skuExternalReferenceCodeUnsafeSupplier) {

		skuExternalReferenceCode = null;

		_skuExternalReferenceCodeSupplier = () -> {
			try {
				return skuExternalReferenceCodeUnsafeSupplier.get();
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
	protected String skuExternalReferenceCode;

	private Supplier<String> _skuExternalReferenceCodeSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30128")
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

	@Schema(example = "true")
	public Boolean getSubscription() {
		if (subscription != null) {
			return subscription;
		}

		subscription = _subscriptionSupplier.get();

		return subscription;
	}

	public void setSubscription(Boolean subscription) {
		this.subscription = subscription;

		_subscriptionSupplier = () -> subscription;
	}

	@JsonIgnore
	public void setSubscription(
		UnsafeSupplier<Boolean, Exception> subscriptionUnsafeSupplier) {

		subscription = null;

		_subscriptionSupplier = () -> {
			try {
				return subscriptionUnsafeSupplier.get();
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
	protected Boolean subscription;

	private Supplier<Boolean> _subscriptionSupplier = () -> null;

	@Schema(example = "pc")
	public String getUnitOfMeasure() {
		if (unitOfMeasure != null) {
			return unitOfMeasure;
		}

		unitOfMeasure = _unitOfMeasureSupplier.get();

		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;

		_unitOfMeasureSupplier = () -> unitOfMeasure;
	}

	@JsonIgnore
	public void setUnitOfMeasure(
		UnsafeSupplier<String, Exception> unitOfMeasureUnsafeSupplier) {

		unitOfMeasure = null;

		_unitOfMeasureSupplier = () -> {
			try {
				return unitOfMeasureUnsafeSupplier.get();
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
	protected String unitOfMeasure;

	private Supplier<String> _unitOfMeasureSupplier = () -> null;

	@Schema(example = "s")
	public String getUnitOfMeasureKey() {
		if (unitOfMeasureKey != null) {
			return unitOfMeasureKey;
		}

		unitOfMeasureKey = _unitOfMeasureKeySupplier.get();

		return unitOfMeasureKey;
	}

	public void setUnitOfMeasureKey(String unitOfMeasureKey) {
		this.unitOfMeasureKey = unitOfMeasureKey;

		_unitOfMeasureKeySupplier = () -> unitOfMeasureKey;
	}

	@JsonIgnore
	public void setUnitOfMeasureKey(
		UnsafeSupplier<String, Exception> unitOfMeasureKeyUnsafeSupplier) {

		unitOfMeasureKey = null;

		_unitOfMeasureKeySupplier = () -> {
			try {
				return unitOfMeasureKeyUnsafeSupplier.get();
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
	protected String unitOfMeasureKey;

	private Supplier<String> _unitOfMeasureKeySupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "101")
	@Valid
	public BigDecimal getUnitPrice() {
		if (unitPrice != null) {
			return unitPrice;
		}

		unitPrice = _unitPriceSupplier.get();

		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;

		_unitPriceSupplier = () -> unitPrice;
	}

	@JsonIgnore
	public void setUnitPrice(
		UnsafeSupplier<BigDecimal, Exception> unitPriceUnsafeSupplier) {

		unitPrice = null;

		_unitPriceSupplier = () -> {
			try {
				return unitPriceUnsafeSupplier.get();
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
	protected BigDecimal unitPrice;

	private Supplier<BigDecimal> _unitPriceSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "101")
	@Valid
	public BigDecimal getUnitPriceWithTaxAmount() {
		if (unitPriceWithTaxAmount != null) {
			return unitPriceWithTaxAmount;
		}

		unitPriceWithTaxAmount = _unitPriceWithTaxAmountSupplier.get();

		return unitPriceWithTaxAmount;
	}

	public void setUnitPriceWithTaxAmount(BigDecimal unitPriceWithTaxAmount) {
		this.unitPriceWithTaxAmount = unitPriceWithTaxAmount;

		_unitPriceWithTaxAmountSupplier = () -> unitPriceWithTaxAmount;
	}

	@JsonIgnore
	public void setUnitPriceWithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			unitPriceWithTaxAmountUnsafeSupplier) {

		unitPriceWithTaxAmount = null;

		_unitPriceWithTaxAmountSupplier = () -> {
			try {
				return unitPriceWithTaxAmountUnsafeSupplier.get();
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
	protected BigDecimal unitPriceWithTaxAmount;

	private Supplier<BigDecimal> _unitPriceWithTaxAmountSupplier = () -> null;

	@Schema
	public String[] getVirtualItemURLs() {
		if (virtualItemURLs != null) {
			return virtualItemURLs;
		}

		virtualItemURLs = _virtualItemURLsSupplier.get();

		return virtualItemURLs;
	}

	public void setVirtualItemURLs(String[] virtualItemURLs) {
		this.virtualItemURLs = virtualItemURLs;

		_virtualItemURLsSupplier = () -> virtualItemURLs;
	}

	@JsonIgnore
	public void setVirtualItemURLs(
		UnsafeSupplier<String[], Exception> virtualItemURLsUnsafeSupplier) {

		virtualItemURLs = null;

		_virtualItemURLsSupplier = () -> {
			try {
				return virtualItemURLsUnsafeSupplier.get();
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
	protected String[] virtualItemURLs;

	private Supplier<String[]> _virtualItemURLsSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OrderItem)) {
			return false;
		}

		OrderItem orderItem = (OrderItem)object;

		return Objects.equals(toString(), orderItem.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (bookedQuantityId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"bookedQuantityId\": ");

			sb.append(bookedQuantityId);
		}

		if (customFields != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"customFields\": ");

			sb.append("[");

			for (int i = 0; i < customFields.length; i++) {
				sb.append(String.valueOf(customFields[i]));

				if ((i + 1) < customFields.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (decimalQuantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"decimalQuantity\": ");

			sb.append(decimalQuantity);
		}

		if (deliveryGroup != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"deliveryGroup\": ");

			sb.append("\"");

			sb.append(_escape(deliveryGroup));

			sb.append("\"");
		}

		if (discountAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountAmount\": ");

			sb.append(discountAmount);
		}

		if (discountManuallyAdjusted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountManuallyAdjusted\": ");

			sb.append(discountManuallyAdjusted);
		}

		if (discountPercentageLevel1 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountPercentageLevel1\": ");

			sb.append(discountPercentageLevel1);
		}

		if (discountPercentageLevel1WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountPercentageLevel1WithTaxAmount\": ");

			sb.append(discountPercentageLevel1WithTaxAmount);
		}

		if (discountPercentageLevel2 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountPercentageLevel2\": ");

			sb.append(discountPercentageLevel2);
		}

		if (discountPercentageLevel2WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountPercentageLevel2WithTaxAmount\": ");

			sb.append(discountPercentageLevel2WithTaxAmount);
		}

		if (discountPercentageLevel3 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountPercentageLevel3\": ");

			sb.append(discountPercentageLevel3);
		}

		if (discountPercentageLevel3WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountPercentageLevel3WithTaxAmount\": ");

			sb.append(discountPercentageLevel3WithTaxAmount);
		}

		if (discountPercentageLevel4 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountPercentageLevel4\": ");

			sb.append(discountPercentageLevel4);
		}

		if (discountPercentageLevel4WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountPercentageLevel4WithTaxAmount\": ");

			sb.append(discountPercentageLevel4WithTaxAmount);
		}

		if (discountWithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountWithTaxAmount\": ");

			sb.append(discountWithTaxAmount);
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

		if (finalPrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"finalPrice\": ");

			sb.append(finalPrice);
		}

		if (finalPriceWithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"finalPriceWithTaxAmount\": ");

			sb.append(finalPriceWithTaxAmount);
		}

		if (formattedQuantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"formattedQuantity\": ");

			sb.append("\"");

			sb.append(_escape(formattedQuantity));

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

			sb.append(_toJSON(name));
		}

		if (options != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"options\": ");

			sb.append("\"");

			sb.append(_escape(options));

			sb.append("\"");
		}

		if (orderExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(orderExternalReferenceCode));

			sb.append("\"");
		}

		if (orderId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderId\": ");

			sb.append(orderId);
		}

		if (priceManuallyAdjusted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceManuallyAdjusted\": ");

			sb.append(priceManuallyAdjusted);
		}

		if (printedNote != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"printedNote\": ");

			sb.append("\"");

			sb.append(_escape(printedNote));

			sb.append("\"");
		}

		if (promoPrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"promoPrice\": ");

			sb.append(promoPrice);
		}

		if (promoPriceWithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"promoPriceWithTaxAmount\": ");

			sb.append(promoPriceWithTaxAmount);
		}

		if (quantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"quantity\": ");

			sb.append(quantity);
		}

		if (replacedSku != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"replacedSku\": ");

			sb.append("\"");

			sb.append(_escape(replacedSku));

			sb.append("\"");
		}

		if (replacedSkuId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"replacedSkuId\": ");

			sb.append(replacedSkuId);
		}

		if (requestedDeliveryDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"requestedDeliveryDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(requestedDeliveryDate));

			sb.append("\"");
		}

		if (shippedQuantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippedQuantity\": ");

			sb.append(shippedQuantity);
		}

		if (shippingAddress != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingAddress\": ");

			sb.append(String.valueOf(shippingAddress));
		}

		if (shippingAddressId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingAddressId\": ");

			sb.append(shippingAddressId);
		}

		if (sku != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sku\": ");

			sb.append("\"");

			sb.append(_escape(sku));

			sb.append("\"");
		}

		if (skuExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(skuExternalReferenceCode));

			sb.append("\"");
		}

		if (skuId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuId\": ");

			sb.append(skuId);
		}

		if (subscription != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subscription\": ");

			sb.append(subscription);
		}

		if (unitOfMeasure != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"unitOfMeasure\": ");

			sb.append("\"");

			sb.append(_escape(unitOfMeasure));

			sb.append("\"");
		}

		if (unitOfMeasureKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"unitOfMeasureKey\": ");

			sb.append("\"");

			sb.append(_escape(unitOfMeasureKey));

			sb.append("\"");
		}

		if (unitPrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"unitPrice\": ");

			sb.append(unitPrice);
		}

		if (unitPriceWithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"unitPriceWithTaxAmount\": ");

			sb.append(unitPriceWithTaxAmount);
		}

		if (virtualItemURLs != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"virtualItemURLs\": ");

			sb.append("[");

			for (int i = 0; i < virtualItemURLs.length; i++) {
				sb.append("\"");

				sb.append(_escape(virtualItemURLs[i]));

				sb.append("\"");

				if ((i + 1) < virtualItemURLs.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.order.dto.v1_0.OrderItem",
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