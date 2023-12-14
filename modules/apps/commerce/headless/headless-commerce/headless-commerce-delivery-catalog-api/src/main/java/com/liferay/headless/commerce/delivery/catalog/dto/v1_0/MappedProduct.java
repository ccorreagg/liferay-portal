/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.delivery.catalog.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

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

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Andrea Sbarra
 * @generated
 */
@Generated("")
@GraphQLName("MappedProduct")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "MappedProduct")
public class MappedProduct implements Serializable {

	public static MappedProduct toDTO(String json) {
		return ObjectMapperUtil.readValue(MappedProduct.class, json);
	}

	public static MappedProduct unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(MappedProduct.class, json);
	}

	@Schema
	@Valid
	public Map<String, Map<String, String>> getActions() {
		if (actions != null) {
			return actions;
		}

		actions = _actionsSupplier.get();

		return actions;
	}

	public void setActions(Map<String, Map<String, String>> actions) {
		this.actions = actions;

		_actionsSupplier = () -> actions;
	}

	@JsonIgnore
	public void setActions(
		UnsafeSupplier<Map<String, Map<String, String>>, Exception>
			actionsUnsafeSupplier) {

		actions = null;

		_actionsSupplier = () -> {
			try {
				return actionsUnsafeSupplier.get();
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
	protected Map<String, Map<String, String>> actions;

	private Supplier<Map<String, Map<String, String>>> _actionsSupplier =
		() -> null;

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
	@Valid
	public MappedProduct getFirstAvailableReplacementMappedProduct() {
		if (firstAvailableReplacementMappedProduct != null) {
			return firstAvailableReplacementMappedProduct;
		}

		firstAvailableReplacementMappedProduct =
			_firstAvailableReplacementMappedProductSupplier.get();

		return firstAvailableReplacementMappedProduct;
	}

	public void setFirstAvailableReplacementMappedProduct(
		MappedProduct firstAvailableReplacementMappedProduct) {

		this.firstAvailableReplacementMappedProduct =
			firstAvailableReplacementMappedProduct;

		_firstAvailableReplacementMappedProductSupplier =
			() -> firstAvailableReplacementMappedProduct;
	}

	@JsonIgnore
	public void setFirstAvailableReplacementMappedProduct(
		UnsafeSupplier<MappedProduct, Exception>
			firstAvailableReplacementMappedProductUnsafeSupplier) {

		firstAvailableReplacementMappedProduct = null;

		_firstAvailableReplacementMappedProductSupplier = () -> {
			try {
				return firstAvailableReplacementMappedProductUnsafeSupplier.
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected MappedProduct firstAvailableReplacementMappedProduct;

	private Supplier<MappedProduct>
		_firstAvailableReplacementMappedProductSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "33130")
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected ProductConfiguration productConfiguration;

	private Supplier<ProductConfiguration> _productConfigurationSupplier =
		() -> null;

	@Schema(example = "exampleERC")
	public String getProductExternalReferenceCode() {
		if (productExternalReferenceCode != null) {
			return productExternalReferenceCode;
		}

		productExternalReferenceCode =
			_productExternalReferenceCodeSupplier.get();

		return productExternalReferenceCode;
	}

	public void setProductExternalReferenceCode(
		String productExternalReferenceCode) {

		this.productExternalReferenceCode = productExternalReferenceCode;

		_productExternalReferenceCodeSupplier =
			() -> productExternalReferenceCode;
	}

	@JsonIgnore
	public void setProductExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			productExternalReferenceCodeUnsafeSupplier) {

		productExternalReferenceCode = null;

		_productExternalReferenceCodeSupplier = () -> {
			try {
				return productExternalReferenceCodeUnsafeSupplier.get();
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
	protected String productExternalReferenceCode;

	private Supplier<String> _productExternalReferenceCodeSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "33131")
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long productId;

	private Supplier<Long> _productIdSupplier = () -> null;

	@Schema(
		example = "{en_US=Hand Saw, hr_HR=Product Name HR, hu_HU=Product Name HU}"
	)
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

	@Schema
	@Valid
	public ProductOption[] getProductOptions() {
		if (productOptions != null) {
			return productOptions;
		}

		productOptions = _productOptionsSupplier.get();

		return productOptions;
	}

	public void setProductOptions(ProductOption[] productOptions) {
		this.productOptions = productOptions;

		_productOptionsSupplier = () -> productOptions;
	}

	@JsonIgnore
	public void setProductOptions(
		UnsafeSupplier<ProductOption[], Exception>
			productOptionsUnsafeSupplier) {

		productOptions = null;

		_productOptionsSupplier = () -> {
			try {
				return productOptionsUnsafeSupplier.get();
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
	protected ProductOption[] productOptions;

	private Supplier<ProductOption[]> _productOptionsSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Boolean purchasable;

	private Supplier<Boolean> _purchasableSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "1")
	public Integer getQuantity() {
		if (quantity != null) {
			return quantity;
		}

		quantity = _quantitySupplier.get();

		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;

		_quantitySupplier = () -> quantity;
	}

	@JsonIgnore
	public void setQuantity(
		UnsafeSupplier<Integer, Exception> quantityUnsafeSupplier) {

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
	protected Integer quantity;

	private Supplier<Integer> _quantitySupplier = () -> null;

	@Schema
	@Valid
	public MappedProduct getReplacementMappedProduct() {
		if (replacementMappedProduct != null) {
			return replacementMappedProduct;
		}

		replacementMappedProduct = _replacementMappedProductSupplier.get();

		return replacementMappedProduct;
	}

	public void setReplacementMappedProduct(
		MappedProduct replacementMappedProduct) {

		this.replacementMappedProduct = replacementMappedProduct;

		_replacementMappedProductSupplier = () -> replacementMappedProduct;
	}

	@JsonIgnore
	public void setReplacementMappedProduct(
		UnsafeSupplier<MappedProduct, Exception>
			replacementMappedProductUnsafeSupplier) {

		replacementMappedProduct = null;

		_replacementMappedProductSupplier = () -> {
			try {
				return replacementMappedProductUnsafeSupplier.get();
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
	protected MappedProduct replacementMappedProduct;

	private Supplier<MappedProduct> _replacementMappedProductSupplier =
		() -> null;

	@Schema(example = "MIN3123 has been replaced by MIN1289")
	public String getReplacementMessage() {
		if (replacementMessage != null) {
			return replacementMessage;
		}

		replacementMessage = _replacementMessageSupplier.get();

		return replacementMessage;
	}

	public void setReplacementMessage(String replacementMessage) {
		this.replacementMessage = replacementMessage;

		_replacementMessageSupplier = () -> replacementMessage;
	}

	@JsonIgnore
	public void setReplacementMessage(
		UnsafeSupplier<String, Exception> replacementMessageUnsafeSupplier) {

		replacementMessage = null;

		_replacementMessageSupplier = () -> {
			try {
				return replacementMessageUnsafeSupplier.get();
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
	protected String replacementMessage;

	private Supplier<String> _replacementMessageSupplier = () -> null;

	@Schema(example = "1")
	public String getSequence() {
		if (sequence != null) {
			return sequence;
		}

		sequence = _sequenceSupplier.get();

		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;

		_sequenceSupplier = () -> sequence;
	}

	@JsonIgnore
	public void setSequence(
		UnsafeSupplier<String, Exception> sequenceUnsafeSupplier) {

		sequence = null;

		_sequenceSupplier = () -> {
			try {
				return sequenceUnsafeSupplier.get();
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
	protected String sequence;

	private Supplier<String> _sequenceSupplier = () -> null;

	@Schema(example = "SKU01")
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

	@Schema(example = "SKU0111")
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
	@Schema(example = "33135")
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

	@Schema(example = "simple")
	public String getThumbnail() {
		if (thumbnail != null) {
			return thumbnail;
		}

		thumbnail = _thumbnailSupplier.get();

		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;

		_thumbnailSupplier = () -> thumbnail;
	}

	@JsonIgnore
	public void setThumbnail(
		UnsafeSupplier<String, Exception> thumbnailUnsafeSupplier) {

		thumbnail = null;

		_thumbnailSupplier = () -> {
			try {
				return thumbnailUnsafeSupplier.get();
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
	protected String thumbnail;

	private Supplier<String> _thumbnailSupplier = () -> null;

	@Schema(example = "sku")
	@Valid
	public Type getType() {
		if (type != null) {
			return type;
		}

		type = _typeSupplier.get();

		return type;
	}

	@JsonIgnore
	public String getTypeAsString() {
		if (type == null) {
			return null;
		}

		return type.toString();
	}

	public void setType(Type type) {
		this.type = type;

		_typeSupplier = () -> type;
	}

	@JsonIgnore
	public void setType(UnsafeSupplier<Type, Exception> typeUnsafeSupplier) {
		type = null;

		_typeSupplier = () -> {
			try {
				return typeUnsafeSupplier.get();
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
	protected Type type;

	private Supplier<Type> _typeSupplier = () -> null;

	@Schema(
		example = "{en_US=product-url-us, hr_HR=product-url-hr, hu_HU=product-url-hu}"
	)
	@Valid
	public Map<String, String> getUrls() {
		if (urls != null) {
			return urls;
		}

		urls = _urlsSupplier.get();

		return urls;
	}

	public void setUrls(Map<String, String> urls) {
		this.urls = urls;

		_urlsSupplier = () -> urls;
	}

	@JsonIgnore
	public void setUrls(
		UnsafeSupplier<Map<String, String>, Exception> urlsUnsafeSupplier) {

		urls = null;

		_urlsSupplier = () -> {
			try {
				return urlsUnsafeSupplier.get();
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
	protected Map<String, String> urls;

	private Supplier<Map<String, String>> _urlsSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MappedProduct)) {
			return false;
		}

		MappedProduct mappedProduct = (MappedProduct)object;

		return Objects.equals(toString(), mappedProduct.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (actions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actions\": ");

			sb.append(_toJSON(actions));
		}

		if (availability != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"availability\": ");

			sb.append(String.valueOf(availability));
		}

		if (firstAvailableReplacementMappedProduct != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"firstAvailableReplacementMappedProduct\": ");

			sb.append(String.valueOf(firstAvailableReplacementMappedProduct));
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
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

		if (productExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(productExternalReferenceCode));

			sb.append("\"");
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

		if (productOptions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productOptions\": ");

			sb.append("[");

			for (int i = 0; i < productOptions.length; i++) {
				sb.append(String.valueOf(productOptions[i]));

				if ((i + 1) < productOptions.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (purchasable != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"purchasable\": ");

			sb.append(purchasable);
		}

		if (quantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"quantity\": ");

			sb.append(quantity);
		}

		if (replacementMappedProduct != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"replacementMappedProduct\": ");

			sb.append(String.valueOf(replacementMappedProduct));
		}

		if (replacementMessage != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"replacementMessage\": ");

			sb.append("\"");

			sb.append(_escape(replacementMessage));

			sb.append("\"");
		}

		if (sequence != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sequence\": ");

			sb.append("\"");

			sb.append(_escape(sequence));

			sb.append("\"");
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

		if (thumbnail != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"thumbnail\": ");

			sb.append("\"");

			sb.append(_escape(thumbnail));

			sb.append("\"");
		}

		if (type != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"type\": ");

			sb.append("\"");

			sb.append(type);

			sb.append("\"");
		}

		if (urls != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"urls\": ");

			sb.append(_toJSON(urls));
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.delivery.catalog.dto.v1_0.MappedProduct",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("Type")
	public static enum Type {

		DIAGRAM("diagram"), EXTERNAL("external"), SKU("sku");

		@JsonCreator
		public static Type create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (Type type : values()) {
				if (Objects.equals(type.getValue(), value)) {
					return type;
				}
			}

			throw new IllegalArgumentException("Invalid enum value: " + value);
		}

		@JsonValue
		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private Type(String value) {
			_value = value;
		}

		private final String _value;

	}

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