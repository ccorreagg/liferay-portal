/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.delivery.order.dto.v1_0;

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
@GraphQLName("PlacedOrderItem")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "PlacedOrderItem")
public class PlacedOrderItem implements Serializable {

	public static PlacedOrderItem toDTO(String json) {
		return ObjectMapperUtil.readValue(PlacedOrderItem.class, json);
	}

	public static PlacedOrderItem unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(PlacedOrderItem.class, json);
	}

	@Schema
	public String getAdaptiveMediaImageHTMLTag() {
		if (adaptiveMediaImageHTMLTag != null) {
			return adaptiveMediaImageHTMLTag;
		}

		adaptiveMediaImageHTMLTag = _adaptiveMediaImageHTMLTagSupplier.get();

		return adaptiveMediaImageHTMLTag;
	}

	public void setAdaptiveMediaImageHTMLTag(String adaptiveMediaImageHTMLTag) {
		this.adaptiveMediaImageHTMLTag = adaptiveMediaImageHTMLTag;

		_adaptiveMediaImageHTMLTagSupplier = () -> adaptiveMediaImageHTMLTag;
	}

	@JsonIgnore
	public void setAdaptiveMediaImageHTMLTag(
		UnsafeSupplier<String, Exception>
			adaptiveMediaImageHTMLTagUnsafeSupplier) {

		adaptiveMediaImageHTMLTag = null;

		_adaptiveMediaImageHTMLTagSupplier = () -> {
			try {
				return adaptiveMediaImageHTMLTagUnsafeSupplier.get();
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
	protected String adaptiveMediaImageHTMLTag;

	private Supplier<String> _adaptiveMediaImageHTMLTagSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Map<String, ?> customFields;

	private Supplier<Map<String, ?>> _customFieldsSupplier = () -> null;

	@Schema
	public String[] getErrorMessages() {
		if (errorMessages != null) {
			return errorMessages;
		}

		errorMessages = _errorMessagesSupplier.get();

		return errorMessages;
	}

	public void setErrorMessages(String[] errorMessages) {
		this.errorMessages = errorMessages;

		_errorMessagesSupplier = () -> errorMessages;
	}

	@JsonIgnore
	public void setErrorMessages(
		UnsafeSupplier<String[], Exception> errorMessagesUnsafeSupplier) {

		errorMessages = null;

		_errorMessagesSupplier = () -> {
			try {
				return errorMessagesUnsafeSupplier.get();
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
	protected String[] errorMessages;

	private Supplier<String[]> _errorMessagesSupplier = () -> null;

	@Schema
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String options;

	private Supplier<String> _optionsSupplier = () -> null;

	@Schema
	public Long getParentOrderItemId() {
		if (parentOrderItemId != null) {
			return parentOrderItemId;
		}

		parentOrderItemId = _parentOrderItemIdSupplier.get();

		return parentOrderItemId;
	}

	public void setParentOrderItemId(Long parentOrderItemId) {
		this.parentOrderItemId = parentOrderItemId;

		_parentOrderItemIdSupplier = () -> parentOrderItemId;
	}

	@JsonIgnore
	public void setParentOrderItemId(
		UnsafeSupplier<Long, Exception> parentOrderItemIdUnsafeSupplier) {

		parentOrderItemId = null;

		_parentOrderItemIdSupplier = () -> {
			try {
				return parentOrderItemIdUnsafeSupplier.get();
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
	protected Long parentOrderItemId;

	private Supplier<Long> _parentOrderItemIdSupplier = () -> null;

	@Schema
	@Valid
	public PlacedOrderItemShipment[] getPlacedOrderItemShipments() {
		if (placedOrderItemShipments != null) {
			return placedOrderItemShipments;
		}

		placedOrderItemShipments = _placedOrderItemShipmentsSupplier.get();

		return placedOrderItemShipments;
	}

	public void setPlacedOrderItemShipments(
		PlacedOrderItemShipment[] placedOrderItemShipments) {

		this.placedOrderItemShipments = placedOrderItemShipments;

		_placedOrderItemShipmentsSupplier = () -> placedOrderItemShipments;
	}

	@JsonIgnore
	public void setPlacedOrderItemShipments(
		UnsafeSupplier<PlacedOrderItemShipment[], Exception>
			placedOrderItemShipmentsUnsafeSupplier) {

		placedOrderItemShipments = null;

		_placedOrderItemShipmentsSupplier = () -> {
			try {
				return placedOrderItemShipmentsUnsafeSupplier.get();
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
	protected PlacedOrderItemShipment[] placedOrderItemShipments;

	private Supplier<PlacedOrderItemShipment[]>
		_placedOrderItemShipmentsSupplier = () -> null;

	@Schema
	@Valid
	public PlacedOrderItem[] getPlacedOrderItems() {
		if (placedOrderItems != null) {
			return placedOrderItems;
		}

		placedOrderItems = _placedOrderItemsSupplier.get();

		return placedOrderItems;
	}

	public void setPlacedOrderItems(PlacedOrderItem[] placedOrderItems) {
		this.placedOrderItems = placedOrderItems;

		_placedOrderItemsSupplier = () -> placedOrderItems;
	}

	@JsonIgnore
	public void setPlacedOrderItems(
		UnsafeSupplier<PlacedOrderItem[], Exception>
			placedOrderItemsUnsafeSupplier) {

		placedOrderItems = null;

		_placedOrderItemsSupplier = () -> {
			try {
				return placedOrderItemsUnsafeSupplier.get();
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
	protected PlacedOrderItem[] placedOrderItems;

	private Supplier<PlacedOrderItem[]> _placedOrderItemsSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Price price;

	private Supplier<Price> _priceSupplier = () -> null;

	@Schema
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

	@Schema(
		example = "{en_US=product-url-us, hr_HR=product-url-hr, hu_HU=product-url-hu}"
	)
	@Valid
	public Map<String, String> getProductURLs() {
		if (productURLs != null) {
			return productURLs;
		}

		productURLs = _productURLsSupplier.get();

		return productURLs;
	}

	public void setProductURLs(Map<String, String> productURLs) {
		this.productURLs = productURLs;

		_productURLsSupplier = () -> productURLs;
	}

	@JsonIgnore
	public void setProductURLs(
		UnsafeSupplier<Map<String, String>, Exception>
			productURLsUnsafeSupplier) {

		productURLs = null;

		_productURLsSupplier = () -> {
			try {
				return productURLsUnsafeSupplier.get();
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
	protected Map<String, String> productURLs;

	private Supplier<Map<String, String>> _productURLsSupplier = () -> null;

	@Schema(example = "10.1")
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected BigDecimal quantity;

	private Supplier<BigDecimal> _quantitySupplier = () -> null;

	@Schema
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
	@Valid
	public Settings getSettings() {
		if (settings != null) {
			return settings;
		}

		settings = _settingsSupplier.get();

		return settings;
	}

	public void setSettings(Settings settings) {
		this.settings = settings;

		_settingsSupplier = () -> settings;
	}

	@JsonIgnore
	public void setSettings(
		UnsafeSupplier<Settings, Exception> settingsUnsafeSupplier) {

		settings = null;

		_settingsSupplier = () -> {
			try {
				return settingsUnsafeSupplier.get();
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
	protected Settings settings;

	private Supplier<Settings> _settingsSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String sku;

	private Supplier<String> _skuSupplier = () -> null;

	@Schema
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Boolean subscription;

	private Supplier<Boolean> _subscriptionSupplier = () -> null;

	@Schema
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

	@Schema(example = "m")
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

	@Schema
	public Boolean getValid() {
		if (valid != null) {
			return valid;
		}

		valid = _validSupplier.get();

		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;

		_validSupplier = () -> valid;
	}

	@JsonIgnore
	public void setValid(
		UnsafeSupplier<Boolean, Exception> validUnsafeSupplier) {

		valid = null;

		_validSupplier = () -> {
			try {
				return validUnsafeSupplier.get();
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
	protected Boolean valid;

	private Supplier<Boolean> _validSupplier = () -> null;

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

		if (!(object instanceof PlacedOrderItem)) {
			return false;
		}

		PlacedOrderItem placedOrderItem = (PlacedOrderItem)object;

		return Objects.equals(toString(), placedOrderItem.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (adaptiveMediaImageHTMLTag != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"adaptiveMediaImageHTMLTag\": ");

			sb.append("\"");

			sb.append(_escape(adaptiveMediaImageHTMLTag));

			sb.append("\"");
		}

		if (customFields != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"customFields\": ");

			sb.append(_toJSON(customFields));
		}

		if (errorMessages != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"errorMessages\": ");

			sb.append("[");

			for (int i = 0; i < errorMessages.length; i++) {
				sb.append("\"");

				sb.append(_escape(errorMessages[i]));

				sb.append("\"");

				if ((i + 1) < errorMessages.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
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

		if (options != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"options\": ");

			sb.append("\"");

			sb.append(_escape(options));

			sb.append("\"");
		}

		if (parentOrderItemId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parentOrderItemId\": ");

			sb.append(parentOrderItemId);
		}

		if (placedOrderItemShipments != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"placedOrderItemShipments\": ");

			sb.append("[");

			for (int i = 0; i < placedOrderItemShipments.length; i++) {
				sb.append(String.valueOf(placedOrderItemShipments[i]));

				if ((i + 1) < placedOrderItemShipments.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (placedOrderItems != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"placedOrderItems\": ");

			sb.append("[");

			for (int i = 0; i < placedOrderItems.length; i++) {
				sb.append(String.valueOf(placedOrderItems[i]));

				if ((i + 1) < placedOrderItems.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (price != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"price\": ");

			sb.append(String.valueOf(price));
		}

		if (productId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productId\": ");

			sb.append(productId);
		}

		if (productURLs != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productURLs\": ");

			sb.append(_toJSON(productURLs));
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

		if (settings != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"settings\": ");

			sb.append(String.valueOf(settings));
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

		if (thumbnail != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"thumbnail\": ");

			sb.append("\"");

			sb.append(_escape(thumbnail));

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

		if (valid != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valid\": ");

			sb.append(valid);
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
		defaultValue = "com.liferay.headless.commerce.delivery.order.dto.v1_0.PlacedOrderItem",
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