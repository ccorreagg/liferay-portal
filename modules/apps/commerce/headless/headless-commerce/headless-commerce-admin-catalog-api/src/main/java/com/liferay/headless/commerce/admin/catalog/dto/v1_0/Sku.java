/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.catalog.dto.v1_0;

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
import javax.validation.constraints.NotEmpty;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Zoltán Takács
 * @generated
 */
@Generated("")
@GraphQLName("Sku")
@JsonFilter("Liferay.Vulcan")
@Schema(requiredProperties = {"sku"})
@XmlRootElement(name = "Sku")
public class Sku implements Serializable {

	public static Sku toDTO(String json) {
		return ObjectMapperUtil.readValue(Sku.class, json);
	}

	public static Sku unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Sku.class, json);
	}

	@DecimalMin("0")
	@Schema(example = "101")
	@Valid
	public BigDecimal getCost() {
		if (cost != null) {
			return cost;
		}

		cost = _costSupplier.get();

		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;

		_costSupplier = () -> cost;
	}

	@JsonIgnore
	public void setCost(
		UnsafeSupplier<BigDecimal, Exception> costUnsafeSupplier) {

		cost = null;

		_costSupplier = () -> {
			try {
				return costUnsafeSupplier.get();
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
	protected BigDecimal cost;

	private Supplier<BigDecimal> _costSupplier = () -> null;

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

	@Schema(example = "29")
	public Integer getInventoryLevel() {
		if (inventoryLevel != null) {
			return inventoryLevel;
		}

		inventoryLevel = _inventoryLevelSupplier.get();

		return inventoryLevel;
	}

	public void setInventoryLevel(Integer inventoryLevel) {
		this.inventoryLevel = inventoryLevel;

		_inventoryLevelSupplier = () -> inventoryLevel;
	}

	@JsonIgnore
	public void setInventoryLevel(
		UnsafeSupplier<Integer, Exception> inventoryLevelUnsafeSupplier) {

		inventoryLevel = null;

		_inventoryLevelSupplier = () -> {
			try {
				return inventoryLevelUnsafeSupplier.get();
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
	protected Integer inventoryLevel;

	private Supplier<Integer> _inventoryLevelSupplier = () -> null;

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

	@DecimalMin("0")
	@Schema(example = "101")
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

	@DecimalMin("0")
	@Schema(example = "30129")
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

	@Schema(example = "{en_US=Croatia, hr_HR=Hrvatska, hu_HU=Horvatorszag}")
	@Valid
	public Map<String, String> getProductName() {
		if (productName != null) {
			return productName;
		}

		productName = _productNameSupplier.get();

		return productName;
	}

	public void setProductName(Map<String, String> productName) {
		this.productName = productName;

		_productNameSupplier = () -> productName;
	}

	@JsonIgnore
	public void setProductName(
		UnsafeSupplier<Map<String, String>, Exception>
			productNameUnsafeSupplier) {

		productName = null;

		_productNameSupplier = () -> {
			try {
				return productNameUnsafeSupplier.get();
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
	protected Map<String, String> productName;

	private Supplier<Map<String, String>> _productNameSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "202")
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
	@NotEmpty
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
	public SkuSubscriptionConfiguration getSkuSubscriptionConfiguration() {
		if (skuSubscriptionConfiguration != null) {
			return skuSubscriptionConfiguration;
		}

		skuSubscriptionConfiguration =
			_skuSubscriptionConfigurationSupplier.get();

		return skuSubscriptionConfiguration;
	}

	public void setSkuSubscriptionConfiguration(
		SkuSubscriptionConfiguration skuSubscriptionConfiguration) {

		this.skuSubscriptionConfiguration = skuSubscriptionConfiguration;

		_skuSubscriptionConfigurationSupplier =
			() -> skuSubscriptionConfiguration;
	}

	@JsonIgnore
	public void setSkuSubscriptionConfiguration(
		UnsafeSupplier<SkuSubscriptionConfiguration, Exception>
			skuSubscriptionConfigurationUnsafeSupplier) {

		skuSubscriptionConfiguration = null;

		_skuSubscriptionConfigurationSupplier = () -> {
			try {
				return skuSubscriptionConfigurationUnsafeSupplier.get();
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
	protected SkuSubscriptionConfiguration skuSubscriptionConfiguration;

	private Supplier<SkuSubscriptionConfiguration>
		_skuSubscriptionConfigurationSupplier = () -> null;

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
	public SkuVirtualSettings getSkuVirtualSettings() {
		if (skuVirtualSettings != null) {
			return skuVirtualSettings;
		}

		skuVirtualSettings = _skuVirtualSettingsSupplier.get();

		return skuVirtualSettings;
	}

	public void setSkuVirtualSettings(SkuVirtualSettings skuVirtualSettings) {
		this.skuVirtualSettings = skuVirtualSettings;

		_skuVirtualSettingsSupplier = () -> skuVirtualSettings;
	}

	@JsonIgnore
	public void setSkuVirtualSettings(
		UnsafeSupplier<SkuVirtualSettings, Exception>
			skuVirtualSettingsUnsafeSupplier) {

		skuVirtualSettings = null;

		_skuVirtualSettingsSupplier = () -> {
			try {
				return skuVirtualSettingsUnsafeSupplier.get();
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
	protected SkuVirtualSettings skuVirtualSettings;

	private Supplier<SkuVirtualSettings> _skuVirtualSettingsSupplier =
		() -> null;

	@Schema(example = "pl")
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String unitOfMeasureKey;

	private Supplier<String> _unitOfMeasureKeySupplier = () -> null;

	@Schema(example = "{en_US=Pallet, hr_HR=Pallet HR, hu_HU=Pallet HU}")
	@Valid
	public Map<String, String> getUnitOfMeasureName() {
		if (unitOfMeasureName != null) {
			return unitOfMeasureName;
		}

		unitOfMeasureName = _unitOfMeasureNameSupplier.get();

		return unitOfMeasureName;
	}

	public void setUnitOfMeasureName(Map<String, String> unitOfMeasureName) {
		this.unitOfMeasureName = unitOfMeasureName;

		_unitOfMeasureNameSupplier = () -> unitOfMeasureName;
	}

	@JsonIgnore
	public void setUnitOfMeasureName(
		UnsafeSupplier<Map<String, String>, Exception>
			unitOfMeasureNameUnsafeSupplier) {

		unitOfMeasureName = null;

		_unitOfMeasureNameSupplier = () -> {
			try {
				return unitOfMeasureNameUnsafeSupplier.get();
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
	protected Map<String, String> unitOfMeasureName;

	private Supplier<Map<String, String>> _unitOfMeasureNameSupplier =
		() -> null;

	@Schema
	public String getUnitOfMeasureSkuId() {
		if (unitOfMeasureSkuId != null) {
			return unitOfMeasureSkuId;
		}

		unitOfMeasureSkuId = _unitOfMeasureSkuIdSupplier.get();

		return unitOfMeasureSkuId;
	}

	public void setUnitOfMeasureSkuId(String unitOfMeasureSkuId) {
		this.unitOfMeasureSkuId = unitOfMeasureSkuId;

		_unitOfMeasureSkuIdSupplier = () -> unitOfMeasureSkuId;
	}

	@JsonIgnore
	public void setUnitOfMeasureSkuId(
		UnsafeSupplier<String, Exception> unitOfMeasureSkuIdUnsafeSupplier) {

		unitOfMeasureSkuId = null;

		_unitOfMeasureSkuIdSupplier = () -> {
			try {
				return unitOfMeasureSkuIdUnsafeSupplier.get();
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
	protected String unitOfMeasureSkuId;

	private Supplier<String> _unitOfMeasureSkuIdSupplier = () -> null;

	@Schema(example = "1234567890")
	public String getUnspsc() {
		if (unspsc != null) {
			return unspsc;
		}

		unspsc = _unspscSupplier.get();

		return unspsc;
	}

	public void setUnspsc(String unspsc) {
		this.unspsc = unspsc;

		_unspscSupplier = () -> unspsc;
	}

	@JsonIgnore
	public void setUnspsc(
		UnsafeSupplier<String, Exception> unspscUnsafeSupplier) {

		unspsc = null;

		_unspscSupplier = () -> {
			try {
				return unspscUnsafeSupplier.get();
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
	protected String unspsc;

	private Supplier<String> _unspscSupplier = () -> null;

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

		if (cost != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cost\": ");

			sb.append(cost);
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

		if (expirationDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"expirationDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(expirationDate));

			sb.append("\"");
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

		if (inventoryLevel != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"inventoryLevel\": ");

			sb.append(inventoryLevel);
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

			sb.append(price);
		}

		if (productId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productId\": ");

			sb.append(productId);
		}

		if (productName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productName\": ");

			sb.append(_toJSON(productName));
		}

		if (promoPrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"promoPrice\": ");

			sb.append(promoPrice);
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

		if (skuSubscriptionConfiguration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuSubscriptionConfiguration\": ");

			sb.append(String.valueOf(skuSubscriptionConfiguration));
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

		if (skuVirtualSettings != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuVirtualSettings\": ");

			sb.append(String.valueOf(skuVirtualSettings));
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

		if (unitOfMeasureName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"unitOfMeasureName\": ");

			sb.append(_toJSON(unitOfMeasureName));
		}

		if (unitOfMeasureSkuId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"unitOfMeasureSkuId\": ");

			sb.append("\"");

			sb.append(_escape(unitOfMeasureSkuId));

			sb.append("\"");
		}

		if (unspsc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"unspsc\": ");

			sb.append("\"");

			sb.append(_escape(unspsc));

			sb.append("\"");
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
		defaultValue = "com.liferay.headless.commerce.admin.catalog.dto.v1_0.Sku",
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