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
@GraphQLName("ProductOptionValue")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ProductOptionValue")
public class ProductOptionValue implements Serializable {

	public static ProductOptionValue toDTO(String json) {
		return ObjectMapperUtil.readValue(ProductOptionValue.class, json);
	}

	public static ProductOptionValue unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(ProductOptionValue.class, json);
	}

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
	public String getInfoMessage() {
		if (infoMessage != null) {
			return infoMessage;
		}

		infoMessage = _infoMessageSupplier.get();

		return infoMessage;
	}

	public void setInfoMessage(String infoMessage) {
		this.infoMessage = infoMessage;

		_infoMessageSupplier = () -> infoMessage;
	}

	@JsonIgnore
	public void setInfoMessage(
		UnsafeSupplier<String, Exception> infoMessageUnsafeSupplier) {

		infoMessage = null;

		_infoMessageSupplier = () -> {
			try {
				return infoMessageUnsafeSupplier.get();
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
	protected String infoMessage;

	private Supplier<String> _infoMessageSupplier = () -> null;

	@Schema(example = "black")
	public String getKey() {
		if (key != null) {
			return key;
		}

		key = _keySupplier.get();

		return key;
	}

	public void setKey(String key) {
		this.key = key;

		_keySupplier = () -> key;
	}

	@JsonIgnore
	public void setKey(UnsafeSupplier<String, Exception> keyUnsafeSupplier) {
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String key;

	private Supplier<String> _keySupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String name;

	private Supplier<String> _nameSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getPreselected() {
		if (preselected != null) {
			return preselected;
		}

		preselected = _preselectedSupplier.get();

		return preselected;
	}

	public void setPreselected(Boolean preselected) {
		this.preselected = preselected;

		_preselectedSupplier = () -> preselected;
	}

	@JsonIgnore
	public void setPreselected(
		UnsafeSupplier<Boolean, Exception> preselectedUnsafeSupplier) {

		preselected = null;

		_preselectedSupplier = () -> {
			try {
				return preselectedUnsafeSupplier.get();
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
	protected Boolean preselected;

	private Supplier<Boolean> _preselectedSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String priceType;

	private Supplier<String> _priceTypeSupplier = () -> null;

	@Schema(example = "1.2")
	public Double getPriority() {
		if (priority != null) {
			return priority;
		}

		priority = _prioritySupplier.get();

		return priority;
	}

	public void setPriority(Double priority) {
		this.priority = priority;

		_prioritySupplier = () -> priority;
	}

	@JsonIgnore
	public void setPriority(
		UnsafeSupplier<Double, Exception> priorityUnsafeSupplier) {

		priority = null;

		_prioritySupplier = () -> {
			try {
				return priorityUnsafeSupplier.get();
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
	protected Double priority;

	private Supplier<Double> _prioritySupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
	public Long getProductOptionId() {
		if (productOptionId != null) {
			return productOptionId;
		}

		productOptionId = _productOptionIdSupplier.get();

		return productOptionId;
	}

	public void setProductOptionId(Long productOptionId) {
		this.productOptionId = productOptionId;

		_productOptionIdSupplier = () -> productOptionId;
	}

	@JsonIgnore
	public void setProductOptionId(
		UnsafeSupplier<Long, Exception> productOptionIdUnsafeSupplier) {

		productOptionId = null;

		_productOptionIdSupplier = () -> {
			try {
				return productOptionIdUnsafeSupplier.get();
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
	protected Long productOptionId;

	private Supplier<Long> _productOptionIdSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String quantity;

	private Supplier<String> _quantitySupplier = () -> null;

	@Schema
	public String getRelativePriceFormatted() {
		if (relativePriceFormatted != null) {
			return relativePriceFormatted;
		}

		relativePriceFormatted = _relativePriceFormattedSupplier.get();

		return relativePriceFormatted;
	}

	public void setRelativePriceFormatted(String relativePriceFormatted) {
		this.relativePriceFormatted = relativePriceFormatted;

		_relativePriceFormattedSupplier = () -> relativePriceFormatted;
	}

	@JsonIgnore
	public void setRelativePriceFormatted(
		UnsafeSupplier<String, Exception>
			relativePriceFormattedUnsafeSupplier) {

		relativePriceFormatted = null;

		_relativePriceFormattedSupplier = () -> {
			try {
				return relativePriceFormattedUnsafeSupplier.get();
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
	protected String relativePriceFormatted;

	private Supplier<String> _relativePriceFormattedSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getSelectable() {
		if (selectable != null) {
			return selectable;
		}

		selectable = _selectableSupplier.get();

		return selectable;
	}

	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;

		_selectableSupplier = () -> selectable;
	}

	@JsonIgnore
	public void setSelectable(
		UnsafeSupplier<Boolean, Exception> selectableUnsafeSupplier) {

		selectable = null;

		_selectableSupplier = () -> {
			try {
				return selectableUnsafeSupplier.get();
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
	protected Boolean selectable;

	private Supplier<Boolean> _selectableSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long skuId;

	private Supplier<Long> _skuIdSupplier = () -> null;

	@Schema
	public String getTotalPrice() {
		if (totalPrice != null) {
			return totalPrice;
		}

		totalPrice = _totalPriceSupplier.get();

		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;

		_totalPriceSupplier = () -> totalPrice;
	}

	@JsonIgnore
	public void setTotalPrice(
		UnsafeSupplier<String, Exception> totalPriceUnsafeSupplier) {

		totalPrice = null;

		_totalPriceSupplier = () -> {
			try {
				return totalPriceUnsafeSupplier.get();
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
	protected String totalPrice;

	private Supplier<String> _totalPriceSupplier = () -> null;

	@Schema
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

	@Schema(example = "true")
	public Boolean getVisible() {
		if (visible != null) {
			return visible;
		}

		visible = _visibleSupplier.get();

		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;

		_visibleSupplier = () -> visible;
	}

	@JsonIgnore
	public void setVisible(
		UnsafeSupplier<Boolean, Exception> visibleUnsafeSupplier) {

		visible = null;

		_visibleSupplier = () -> {
			try {
				return visibleUnsafeSupplier.get();
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
	protected Boolean visible;

	private Supplier<Boolean> _visibleSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProductOptionValue)) {
			return false;
		}

		ProductOptionValue productOptionValue = (ProductOptionValue)object;

		return Objects.equals(toString(), productOptionValue.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (infoMessage != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"infoMessage\": ");

			sb.append("\"");

			sb.append(_escape(infoMessage));

			sb.append("\"");
		}

		if (key != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"key\": ");

			sb.append("\"");

			sb.append(_escape(key));

			sb.append("\"");
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

		if (preselected != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"preselected\": ");

			sb.append(preselected);
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

		if (priority != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priority\": ");

			sb.append(priority);
		}

		if (productOptionId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productOptionId\": ");

			sb.append(productOptionId);
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

		if (relativePriceFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"relativePriceFormatted\": ");

			sb.append("\"");

			sb.append(_escape(relativePriceFormatted));

			sb.append("\"");
		}

		if (selectable != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"selectable\": ");

			sb.append(selectable);
		}

		if (skuId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuId\": ");

			sb.append(skuId);
		}

		if (totalPrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalPrice\": ");

			sb.append("\"");

			sb.append(_escape(totalPrice));

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

		if (visible != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"visible\": ");

			sb.append(visible);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.delivery.catalog.dto.v1_0.ProductOptionValue",
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