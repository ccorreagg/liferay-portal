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
 * @author Andrea Sbarra
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
	@Valid
	public DDMOption[] getDDMOptions() {
		if (DDMOptions != null) {
			return DDMOptions;
		}

		DDMOptions = _DDMOptionsSupplier.get();

		return DDMOptions;
	}

	public void setDDMOptions(DDMOption[] DDMOptions) {
		this.DDMOptions = DDMOptions;

		_DDMOptionsSupplier = () -> DDMOptions;
	}

	@JsonIgnore
	public void setDDMOptions(
		UnsafeSupplier<DDMOption[], Exception> DDMOptionsUnsafeSupplier) {

		DDMOptions = null;

		_DDMOptionsSupplier = () -> {
			try {
				return DDMOptionsUnsafeSupplier.get();
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
	protected DDMOption[] DDMOptions;

	private Supplier<DDMOption[]> _DDMOptionsSupplier = () -> null;

	@Schema(example = "[10, 20, 30, 40]")
	public String[] getAllowedOrderQuantities() {
		if (allowedOrderQuantities != null) {
			return allowedOrderQuantities;
		}

		allowedOrderQuantities = _allowedOrderQuantitiesSupplier.get();

		return allowedOrderQuantities;
	}

	public void setAllowedOrderQuantities(String[] allowedOrderQuantities) {
		this.allowedOrderQuantities = allowedOrderQuantities;

		_allowedOrderQuantitiesSupplier = () -> allowedOrderQuantities;
	}

	@JsonIgnore
	public void setAllowedOrderQuantities(
		UnsafeSupplier<String[], Exception>
			allowedOrderQuantitiesUnsafeSupplier) {

		allowedOrderQuantities = null;

		_allowedOrderQuantitiesSupplier = () -> {
			try {
				return allowedOrderQuantitiesUnsafeSupplier.get();
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
	protected String[] allowedOrderQuantities;

	private Supplier<String[]> _allowedOrderQuantitiesSupplier = () -> null;

	@Schema
	@Valid
	public Availability getAvailability() {
		if (availability != null) {
			return availability;
		}

		availability = _availabilitySupplier.get();

		return availability;
	}

	public void setAvailability(Availability availability) {
		this.availability = availability;

		_availabilitySupplier = () -> availability;
	}

	@JsonIgnore
	public void setAvailability(
		UnsafeSupplier<Availability, Exception> availabilityUnsafeSupplier) {

		availability = null;

		_availabilitySupplier = () -> {
			try {
				return availabilityUnsafeSupplier.get();
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
	protected Availability availability;

	private Supplier<Availability> _availabilitySupplier = () -> null;

	@Schema
	public Boolean getBackOrderAllowed() {
		if (backOrderAllowed != null) {
			return backOrderAllowed;
		}

		backOrderAllowed = _backOrderAllowedSupplier.get();

		return backOrderAllowed;
	}

	public void setBackOrderAllowed(Boolean backOrderAllowed) {
		this.backOrderAllowed = backOrderAllowed;

		_backOrderAllowedSupplier = () -> backOrderAllowed;
	}

	@JsonIgnore
	public void setBackOrderAllowed(
		UnsafeSupplier<Boolean, Exception> backOrderAllowedUnsafeSupplier) {

		backOrderAllowed = null;

		_backOrderAllowedSupplier = () -> {
			try {
				return backOrderAllowedUnsafeSupplier.get();
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
	protected Boolean backOrderAllowed;

	private Supplier<Boolean> _backOrderAllowedSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected CustomField[] customFields;

	private Supplier<CustomField[]> _customFieldsSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "1.1")
	public Double getDepth() {
		if (depth != null) {
			return depth;
		}

		depth = _depthSupplier.get();

		return depth;
	}

	public void setDepth(Double depth) {
		this.depth = depth;

		_depthSupplier = () -> depth;
	}

	@JsonIgnore
	public void setDepth(
		UnsafeSupplier<Double, Exception> depthUnsafeSupplier) {

		depth = null;

		_depthSupplier = () -> {
			try {
				return depthUnsafeSupplier.get();
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
	protected Double depth;

	private Supplier<Double> _depthSupplier = () -> null;

	@Schema(example = "false")
	public Boolean getDiscontinued() {
		if (discontinued != null) {
			return discontinued;
		}

		discontinued = _discontinuedSupplier.get();

		return discontinued;
	}

	public void setDiscontinued(Boolean discontinued) {
		this.discontinued = discontinued;

		_discontinuedSupplier = () -> discontinued;
	}

	@JsonIgnore
	public void setDiscontinued(
		UnsafeSupplier<Boolean, Exception> discontinuedUnsafeSupplier) {

		discontinued = null;

		_discontinuedSupplier = () -> {
			try {
				return discontinuedUnsafeSupplier.get();
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
	protected Boolean discontinued;

	private Supplier<Boolean> _discontinuedSupplier = () -> null;

	@Schema(example = "2017-07-21")
	public Date getDiscontinuedDate() {
		if (discontinuedDate != null) {
			return discontinuedDate;
		}

		discontinuedDate = _discontinuedDateSupplier.get();

		return discontinuedDate;
	}

	public void setDiscontinuedDate(Date discontinuedDate) {
		this.discontinuedDate = discontinuedDate;

		_discontinuedDateSupplier = () -> discontinuedDate;
	}

	@JsonIgnore
	public void setDiscontinuedDate(
		UnsafeSupplier<Date, Exception> discontinuedDateUnsafeSupplier) {

		discontinuedDate = null;

		_discontinuedDateSupplier = () -> {
			try {
				return discontinuedDateUnsafeSupplier.get();
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
	protected Date discontinuedDate;

	private Supplier<Date> _discontinuedDateSupplier = () -> null;

	@Schema(example = "2017-07-21")
	public Date getDisplayDate() {
		if (displayDate != null) {
			return displayDate;
		}

		displayDate = _displayDateSupplier.get();

		return displayDate;
	}

	public void setDisplayDate(Date displayDate) {
		this.displayDate = displayDate;

		_displayDateSupplier = () -> displayDate;
	}

	@JsonIgnore
	public void setDisplayDate(
		UnsafeSupplier<Date, Exception> displayDateUnsafeSupplier) {

		displayDate = null;

		_displayDateSupplier = () -> {
			try {
				return displayDateUnsafeSupplier.get();
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
	protected Date displayDate;

	private Supplier<Date> _displayDateSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getDisplayDiscountLevels() {
		if (displayDiscountLevels != null) {
			return displayDiscountLevels;
		}

		displayDiscountLevels = _displayDiscountLevelsSupplier.get();

		return displayDiscountLevels;
	}

	public void setDisplayDiscountLevels(Boolean displayDiscountLevels) {
		this.displayDiscountLevels = displayDiscountLevels;

		_displayDiscountLevelsSupplier = () -> displayDiscountLevels;
	}

	@JsonIgnore
	public void setDisplayDiscountLevels(
		UnsafeSupplier<Boolean, Exception>
			displayDiscountLevelsUnsafeSupplier) {

		displayDiscountLevels = null;

		_displayDiscountLevelsSupplier = () -> {
			try {
				return displayDiscountLevelsUnsafeSupplier.get();
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
	protected Boolean displayDiscountLevels;

	private Supplier<Boolean> _displayDiscountLevelsSupplier = () -> null;

	@Schema(example = "2017-08-21")
	public Date getExpirationDate() {
		if (expirationDate != null) {
			return expirationDate;
		}

		expirationDate = _expirationDateSupplier.get();

		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;

		_expirationDateSupplier = () -> expirationDate;
	}

	@JsonIgnore
	public void setExpirationDate(
		UnsafeSupplier<Date, Exception> expirationDateUnsafeSupplier) {

		expirationDate = null;

		_expirationDateSupplier = () -> {
			try {
				return expirationDateUnsafeSupplier.get();
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
	protected Date expirationDate;

	private Supplier<Date> _expirationDateSupplier = () -> null;

	@Schema(example = "12341234")
	public String getGtin() {
		if (gtin != null) {
			return gtin;
		}

		gtin = _gtinSupplier.get();

		return gtin;
	}

	public void setGtin(String gtin) {
		this.gtin = gtin;

		_gtinSupplier = () -> gtin;
	}

	@JsonIgnore
	public void setGtin(UnsafeSupplier<String, Exception> gtinUnsafeSupplier) {
		gtin = null;

		_gtinSupplier = () -> {
			try {
				return gtinUnsafeSupplier.get();
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
	protected String gtin;

	private Supplier<String> _gtinSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "20.2")
	public Double getHeight() {
		if (height != null) {
			return height;
		}

		height = _heightSupplier.get();

		return height;
	}

	public void setHeight(Double height) {
		this.height = height;

		_heightSupplier = () -> height;
	}

	@JsonIgnore
	public void setHeight(
		UnsafeSupplier<Double, Exception> heightUnsafeSupplier) {

		height = null;

		_heightSupplier = () -> {
			try {
				return heightUnsafeSupplier.get();
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
	protected Double height;

	private Supplier<Double> _heightSupplier = () -> null;

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

	@Schema
	public String getIncomingQuantityLabel() {
		if (incomingQuantityLabel != null) {
			return incomingQuantityLabel;
		}

		incomingQuantityLabel = _incomingQuantityLabelSupplier.get();

		return incomingQuantityLabel;
	}

	public void setIncomingQuantityLabel(String incomingQuantityLabel) {
		this.incomingQuantityLabel = incomingQuantityLabel;

		_incomingQuantityLabelSupplier = () -> incomingQuantityLabel;
	}

	@JsonIgnore
	public void setIncomingQuantityLabel(
		UnsafeSupplier<String, Exception> incomingQuantityLabelUnsafeSupplier) {

		incomingQuantityLabel = null;

		_incomingQuantityLabelSupplier = () -> {
			try {
				return incomingQuantityLabelUnsafeSupplier.get();
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
	protected String incomingQuantityLabel;

	private Supplier<String> _incomingQuantityLabelSupplier = () -> null;

	@Schema(example = "12341234")
	public String getManufacturerPartNumber() {
		if (manufacturerPartNumber != null) {
			return manufacturerPartNumber;
		}

		manufacturerPartNumber = _manufacturerPartNumberSupplier.get();

		return manufacturerPartNumber;
	}

	public void setManufacturerPartNumber(String manufacturerPartNumber) {
		this.manufacturerPartNumber = manufacturerPartNumber;

		_manufacturerPartNumberSupplier = () -> manufacturerPartNumber;
	}

	@JsonIgnore
	public void setManufacturerPartNumber(
		UnsafeSupplier<String, Exception>
			manufacturerPartNumberUnsafeSupplier) {

		manufacturerPartNumber = null;

		_manufacturerPartNumberSupplier = () -> {
			try {
				return manufacturerPartNumberUnsafeSupplier.get();
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
	protected String manufacturerPartNumber;

	private Supplier<String> _manufacturerPartNumberSupplier = () -> null;

	@Schema(example = "10.1")
	@Valid
	public BigDecimal getMaxOrderQuantity() {
		if (maxOrderQuantity != null) {
			return maxOrderQuantity;
		}

		maxOrderQuantity = _maxOrderQuantitySupplier.get();

		return maxOrderQuantity;
	}

	public void setMaxOrderQuantity(BigDecimal maxOrderQuantity) {
		this.maxOrderQuantity = maxOrderQuantity;

		_maxOrderQuantitySupplier = () -> maxOrderQuantity;
	}

	@JsonIgnore
	public void setMaxOrderQuantity(
		UnsafeSupplier<BigDecimal, Exception> maxOrderQuantityUnsafeSupplier) {

		maxOrderQuantity = null;

		_maxOrderQuantitySupplier = () -> {
			try {
				return maxOrderQuantityUnsafeSupplier.get();
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
	protected BigDecimal maxOrderQuantity;

	private Supplier<BigDecimal> _maxOrderQuantitySupplier = () -> null;

	@Schema(example = "10.1")
	@Valid
	public BigDecimal getMinOrderQuantity() {
		if (minOrderQuantity != null) {
			return minOrderQuantity;
		}

		minOrderQuantity = _minOrderQuantitySupplier.get();

		return minOrderQuantity;
	}

	public void setMinOrderQuantity(BigDecimal minOrderQuantity) {
		this.minOrderQuantity = minOrderQuantity;

		_minOrderQuantitySupplier = () -> minOrderQuantity;
	}

	@JsonIgnore
	public void setMinOrderQuantity(
		UnsafeSupplier<BigDecimal, Exception> minOrderQuantityUnsafeSupplier) {

		minOrderQuantity = null;

		_minOrderQuantitySupplier = () -> {
			try {
				return minOrderQuantityUnsafeSupplier.get();
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
	protected BigDecimal minOrderQuantity;

	private Supplier<BigDecimal> _minOrderQuantitySupplier = () -> null;

	@Schema(example = "true")
	public Boolean getNeverExpire() {
		if (neverExpire != null) {
			return neverExpire;
		}

		neverExpire = _neverExpireSupplier.get();

		return neverExpire;
	}

	public void setNeverExpire(Boolean neverExpire) {
		this.neverExpire = neverExpire;

		_neverExpireSupplier = () -> neverExpire;
	}

	@JsonIgnore
	public void setNeverExpire(
		UnsafeSupplier<Boolean, Exception> neverExpireUnsafeSupplier) {

		neverExpire = null;

		_neverExpireSupplier = () -> {
			try {
				return neverExpireUnsafeSupplier.get();
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
	protected Boolean neverExpire;

	private Supplier<Boolean> _neverExpireSupplier = () -> null;

	@Schema
	@Valid
	public Price getPrice() {
		if (price != null) {
			return price;
		}

		price = _priceSupplier.get();

		return price;
	}

	public void setPrice(Price price) {
		this.price = price;

		_priceSupplier = () -> price;
	}

	@JsonIgnore
	public void setPrice(UnsafeSupplier<Price, Exception> priceUnsafeSupplier) {
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
	protected Price price;

	private Supplier<Price> _priceSupplier = () -> null;

	@Schema
	@Valid
	public ProductConfiguration getProductConfiguration() {
		if (productConfiguration != null) {
			return productConfiguration;
		}

		productConfiguration = _productConfigurationSupplier.get();

		return productConfiguration;
	}

	public void setProductConfiguration(
		ProductConfiguration productConfiguration) {

		this.productConfiguration = productConfiguration;

		_productConfigurationSupplier = () -> productConfiguration;
	}

	@JsonIgnore
	public void setProductConfiguration(
		UnsafeSupplier<ProductConfiguration, Exception>
			productConfigurationUnsafeSupplier) {

		productConfiguration = null;

		_productConfigurationSupplier = () -> {
			try {
				return productConfigurationUnsafeSupplier.get();
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
	protected ProductConfiguration productConfiguration;

	private Supplier<ProductConfiguration> _productConfigurationSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
	public Long getProductId() {
		if (productId != null) {
			return productId;
		}

		productId = _productIdSupplier.get();

		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;

		_productIdSupplier = () -> productId;
	}

	@JsonIgnore
	public void setProductId(
		UnsafeSupplier<Long, Exception> productIdUnsafeSupplier) {

		productId = null;

		_productIdSupplier = () -> {
			try {
				return productIdUnsafeSupplier.get();
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
	protected Long productId;

	private Supplier<Long> _productIdSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getPublished() {
		if (published != null) {
			return published;
		}

		published = _publishedSupplier.get();

		return published;
	}

	public void setPublished(Boolean published) {
		this.published = published;

		_publishedSupplier = () -> published;
	}

	@JsonIgnore
	public void setPublished(
		UnsafeSupplier<Boolean, Exception> publishedUnsafeSupplier) {

		published = null;

		_publishedSupplier = () -> {
			try {
				return publishedUnsafeSupplier.get();
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
	protected Boolean published;

	private Supplier<Boolean> _publishedSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getPurchasable() {
		if (purchasable != null) {
			return purchasable;
		}

		purchasable = _purchasableSupplier.get();

		return purchasable;
	}

	public void setPurchasable(Boolean purchasable) {
		this.purchasable = purchasable;

		_purchasableSupplier = () -> purchasable;
	}

	@JsonIgnore
	public void setPurchasable(
		UnsafeSupplier<Boolean, Exception> purchasableUnsafeSupplier) {

		purchasable = null;

		_purchasableSupplier = () -> {
			try {
				return purchasableUnsafeSupplier.get();
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
	protected Boolean purchasable;

	private Supplier<Boolean> _purchasableSupplier = () -> null;

	@Schema
	@Valid
	public ReplacementSku getReplacementSku() {
		if (replacementSku != null) {
			return replacementSku;
		}

		replacementSku = _replacementSkuSupplier.get();

		return replacementSku;
	}

	public void setReplacementSku(ReplacementSku replacementSku) {
		this.replacementSku = replacementSku;

		_replacementSkuSupplier = () -> replacementSku;
	}

	@JsonIgnore
	public void setReplacementSku(
		UnsafeSupplier<ReplacementSku, Exception>
			replacementSkuUnsafeSupplier) {

		replacementSku = null;

		_replacementSkuSupplier = () -> {
			try {
				return replacementSkuUnsafeSupplier.get();
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
	protected ReplacementSku replacementSku;

	private Supplier<ReplacementSku> _replacementSkuSupplier = () -> null;

	@Schema(example = "SKU0111")
	public String getReplacementSkuExternalReferenceCode() {
		if (replacementSkuExternalReferenceCode != null) {
			return replacementSkuExternalReferenceCode;
		}

		replacementSkuExternalReferenceCode =
			_replacementSkuExternalReferenceCodeSupplier.get();

		return replacementSkuExternalReferenceCode;
	}

	public void setReplacementSkuExternalReferenceCode(
		String replacementSkuExternalReferenceCode) {

		this.replacementSkuExternalReferenceCode =
			replacementSkuExternalReferenceCode;

		_replacementSkuExternalReferenceCodeSupplier =
			() -> replacementSkuExternalReferenceCode;
	}

	@JsonIgnore
	public void setReplacementSkuExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			replacementSkuExternalReferenceCodeUnsafeSupplier) {

		replacementSkuExternalReferenceCode = null;

		_replacementSkuExternalReferenceCodeSupplier = () -> {
			try {
				return replacementSkuExternalReferenceCodeUnsafeSupplier.get();
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
	protected String replacementSkuExternalReferenceCode;

	private Supplier<String> _replacementSkuExternalReferenceCodeSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "33135")
	public Long getReplacementSkuId() {
		if (replacementSkuId != null) {
			return replacementSkuId;
		}

		replacementSkuId = _replacementSkuIdSupplier.get();

		return replacementSkuId;
	}

	public void setReplacementSkuId(Long replacementSkuId) {
		this.replacementSkuId = replacementSkuId;

		_replacementSkuIdSupplier = () -> replacementSkuId;
	}

	@JsonIgnore
	public void setReplacementSkuId(
		UnsafeSupplier<Long, Exception> replacementSkuIdUnsafeSupplier) {

		replacementSkuId = null;

		_replacementSkuIdSupplier = () -> {
			try {
				return replacementSkuIdUnsafeSupplier.get();
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
	protected Long replacementSkuId;

	private Supplier<Long> _replacementSkuIdSupplier = () -> null;

	@Schema
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

	@Schema
	@Valid
	public SkuOption[] getSkuOptions() {
		if (skuOptions != null) {
			return skuOptions;
		}

		skuOptions = _skuOptionsSupplier.get();

		return skuOptions;
	}

	public void setSkuOptions(SkuOption[] skuOptions) {
		this.skuOptions = skuOptions;

		_skuOptionsSupplier = () -> skuOptions;
	}

	@JsonIgnore
	public void setSkuOptions(
		UnsafeSupplier<SkuOption[], Exception> skuOptionsUnsafeSupplier) {

		skuOptions = null;

		_skuOptionsSupplier = () -> {
			try {
				return skuOptionsUnsafeSupplier.get();
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
	protected SkuOption[] skuOptions;

	private Supplier<SkuOption[]> _skuOptionsSupplier = () -> null;

	@Schema
	@Valid
	public SkuUnitOfMeasure[] getSkuUnitOfMeasures() {
		if (skuUnitOfMeasures != null) {
			return skuUnitOfMeasures;
		}

		skuUnitOfMeasures = _skuUnitOfMeasuresSupplier.get();

		return skuUnitOfMeasures;
	}

	public void setSkuUnitOfMeasures(SkuUnitOfMeasure[] skuUnitOfMeasures) {
		this.skuUnitOfMeasures = skuUnitOfMeasures;

		_skuUnitOfMeasuresSupplier = () -> skuUnitOfMeasures;
	}

	@JsonIgnore
	public void setSkuUnitOfMeasures(
		UnsafeSupplier<SkuUnitOfMeasure[], Exception>
			skuUnitOfMeasuresUnsafeSupplier) {

		skuUnitOfMeasures = null;

		_skuUnitOfMeasuresSupplier = () -> {
			try {
				return skuUnitOfMeasuresUnsafeSupplier.get();
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
	protected SkuUnitOfMeasure[] skuUnitOfMeasures;

	private Supplier<SkuUnitOfMeasure[]> _skuUnitOfMeasuresSupplier =
		() -> null;

	@Schema
	@Valid
	public TierPrice[] getTierPrices() {
		if (tierPrices != null) {
			return tierPrices;
		}

		tierPrices = _tierPricesSupplier.get();

		return tierPrices;
	}

	public void setTierPrices(TierPrice[] tierPrices) {
		this.tierPrices = tierPrices;

		_tierPricesSupplier = () -> tierPrices;
	}

	@JsonIgnore
	public void setTierPrices(
		UnsafeSupplier<TierPrice[], Exception> tierPricesUnsafeSupplier) {

		tierPrices = null;

		_tierPricesSupplier = () -> {
			try {
				return tierPricesUnsafeSupplier.get();
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
	protected TierPrice[] tierPrices;

	private Supplier<TierPrice[]> _tierPricesSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "1.1")
	public Double getWeight() {
		if (weight != null) {
			return weight;
		}

		weight = _weightSupplier.get();

		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;

		_weightSupplier = () -> weight;
	}

	@JsonIgnore
	public void setWeight(
		UnsafeSupplier<Double, Exception> weightUnsafeSupplier) {

		weight = null;

		_weightSupplier = () -> {
			try {
				return weightUnsafeSupplier.get();
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
	protected Double weight;

	private Supplier<Double> _weightSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "20.2")
	public Double getWidth() {
		if (width != null) {
			return width;
		}

		width = _widthSupplier.get();

		return width;
	}

	public void setWidth(Double width) {
		this.width = width;

		_widthSupplier = () -> width;
	}

	@JsonIgnore
	public void setWidth(
		UnsafeSupplier<Double, Exception> widthUnsafeSupplier) {

		width = null;

		_widthSupplier = () -> {
			try {
				return widthUnsafeSupplier.get();
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
	protected Double width;

	private Supplier<Double> _widthSupplier = () -> null;

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

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (DDMOptions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"DDMOptions\": ");

			sb.append("[");

			for (int i = 0; i < DDMOptions.length; i++) {
				sb.append(String.valueOf(DDMOptions[i]));

				if ((i + 1) < DDMOptions.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (allowedOrderQuantities != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"allowedOrderQuantities\": ");

			sb.append("[");

			for (int i = 0; i < allowedOrderQuantities.length; i++) {
				sb.append("\"");

				sb.append(_escape(allowedOrderQuantities[i]));

				sb.append("\"");

				if ((i + 1) < allowedOrderQuantities.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (availability != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"availability\": ");

			sb.append(String.valueOf(availability));
		}

		if (backOrderAllowed != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"backOrderAllowed\": ");

			sb.append(backOrderAllowed);
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

		if (depth != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"depth\": ");

			sb.append(depth);
		}

		if (discontinued != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discontinued\": ");

			sb.append(discontinued);
		}

		if (discontinuedDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discontinuedDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(discontinuedDate));

			sb.append("\"");
		}

		if (displayDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"displayDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(displayDate));

			sb.append("\"");
		}

		if (displayDiscountLevels != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"displayDiscountLevels\": ");

			sb.append(displayDiscountLevels);
		}

		if (expirationDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"expirationDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(expirationDate));

			sb.append("\"");
		}

		if (gtin != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"gtin\": ");

			sb.append("\"");

			sb.append(_escape(gtin));

			sb.append("\"");
		}

		if (height != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"height\": ");

			sb.append(height);
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (incomingQuantityLabel != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"incomingQuantityLabel\": ");

			sb.append("\"");

			sb.append(_escape(incomingQuantityLabel));

			sb.append("\"");
		}

		if (manufacturerPartNumber != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"manufacturerPartNumber\": ");

			sb.append("\"");

			sb.append(_escape(manufacturerPartNumber));

			sb.append("\"");
		}

		if (maxOrderQuantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"maxOrderQuantity\": ");

			sb.append(maxOrderQuantity);
		}

		if (minOrderQuantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"minOrderQuantity\": ");

			sb.append(minOrderQuantity);
		}

		if (neverExpire != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"neverExpire\": ");

			sb.append(neverExpire);
		}

		if (price != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"price\": ");

			sb.append(String.valueOf(price));
		}

		if (productConfiguration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productConfiguration\": ");

			sb.append(String.valueOf(productConfiguration));
		}

		if (productId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productId\": ");

			sb.append(productId);
		}

		if (published != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"published\": ");

			sb.append(published);
		}

		if (purchasable != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"purchasable\": ");

			sb.append(purchasable);
		}

		if (replacementSku != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"replacementSku\": ");

			sb.append(String.valueOf(replacementSku));
		}

		if (replacementSkuExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"replacementSkuExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(replacementSkuExternalReferenceCode));

			sb.append("\"");
		}

		if (replacementSkuId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"replacementSkuId\": ");

			sb.append(replacementSkuId);
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

		if (skuOptions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuOptions\": ");

			sb.append("[");

			for (int i = 0; i < skuOptions.length; i++) {
				sb.append(String.valueOf(skuOptions[i]));

				if ((i + 1) < skuOptions.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (skuUnitOfMeasures != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuUnitOfMeasures\": ");

			sb.append("[");

			for (int i = 0; i < skuUnitOfMeasures.length; i++) {
				sb.append(String.valueOf(skuUnitOfMeasures[i]));

				if ((i + 1) < skuUnitOfMeasures.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (tierPrices != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tierPrices\": ");

			sb.append("[");

			for (int i = 0; i < tierPrices.length; i++) {
				sb.append(String.valueOf(tierPrices[i]));

				if ((i + 1) < tierPrices.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (weight != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"weight\": ");

			sb.append(weight);
		}

		if (width != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"width\": ");

			sb.append(width);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.delivery.catalog.dto.v1_0.Sku",
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