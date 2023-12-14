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
@GraphQLName("ProductConfiguration")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ProductConfiguration")
public class ProductConfiguration implements Serializable {

	public static ProductConfiguration toDTO(String json) {
		return ObjectMapperUtil.readValue(ProductConfiguration.class, json);
	}

	public static ProductConfiguration unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			ProductConfiguration.class, json);
	}

	@Schema(example = "true")
	public Boolean getAllowBackOrder() {
		if (allowBackOrder != null) {
			return allowBackOrder;
		}

		allowBackOrder = _allowBackOrderSupplier.get();

		return allowBackOrder;
	}

	public void setAllowBackOrder(Boolean allowBackOrder) {
		this.allowBackOrder = allowBackOrder;

		_allowBackOrderSupplier = () -> allowBackOrder;
	}

	@JsonIgnore
	public void setAllowBackOrder(
		UnsafeSupplier<Boolean, Exception> allowBackOrderUnsafeSupplier) {

		allowBackOrder = null;

		_allowBackOrderSupplier = () -> {
			try {
				return allowBackOrderUnsafeSupplier.get();
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
	protected Boolean allowBackOrder;

	private Supplier<Boolean> _allowBackOrderSupplier = () -> null;

	@Schema(example = "[10, 20, 30, 40]")
	@Valid
	public BigDecimal[] getAllowedOrderQuantities() {
		if (allowedOrderQuantities != null) {
			return allowedOrderQuantities;
		}

		allowedOrderQuantities = _allowedOrderQuantitiesSupplier.get();

		return allowedOrderQuantities;
	}

	public void setAllowedOrderQuantities(BigDecimal[] allowedOrderQuantities) {
		this.allowedOrderQuantities = allowedOrderQuantities;

		_allowedOrderQuantitiesSupplier = () -> allowedOrderQuantities;
	}

	@JsonIgnore
	public void setAllowedOrderQuantities(
		UnsafeSupplier<BigDecimal[], Exception>
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
	protected BigDecimal[] allowedOrderQuantities;

	private Supplier<BigDecimal[]> _allowedOrderQuantitiesSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "31130")
	public Long getAvailabilityEstimateId() {
		if (availabilityEstimateId != null) {
			return availabilityEstimateId;
		}

		availabilityEstimateId = _availabilityEstimateIdSupplier.get();

		return availabilityEstimateId;
	}

	public void setAvailabilityEstimateId(Long availabilityEstimateId) {
		this.availabilityEstimateId = availabilityEstimateId;

		_availabilityEstimateIdSupplier = () -> availabilityEstimateId;
	}

	@JsonIgnore
	public void setAvailabilityEstimateId(
		UnsafeSupplier<Long, Exception> availabilityEstimateIdUnsafeSupplier) {

		availabilityEstimateId = null;

		_availabilityEstimateIdSupplier = () -> {
			try {
				return availabilityEstimateIdUnsafeSupplier.get();
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
	protected Long availabilityEstimateId;

	private Supplier<Long> _availabilityEstimateIdSupplier = () -> null;

	@Schema
	public String getAvailabilityEstimateName() {
		if (availabilityEstimateName != null) {
			return availabilityEstimateName;
		}

		availabilityEstimateName = _availabilityEstimateNameSupplier.get();

		return availabilityEstimateName;
	}

	public void setAvailabilityEstimateName(String availabilityEstimateName) {
		this.availabilityEstimateName = availabilityEstimateName;

		_availabilityEstimateNameSupplier = () -> availabilityEstimateName;
	}

	@JsonIgnore
	public void setAvailabilityEstimateName(
		UnsafeSupplier<String, Exception>
			availabilityEstimateNameUnsafeSupplier) {

		availabilityEstimateName = null;

		_availabilityEstimateNameSupplier = () -> {
			try {
				return availabilityEstimateNameUnsafeSupplier.get();
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
	protected String availabilityEstimateName;

	private Supplier<String> _availabilityEstimateNameSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getDisplayAvailability() {
		if (displayAvailability != null) {
			return displayAvailability;
		}

		displayAvailability = _displayAvailabilitySupplier.get();

		return displayAvailability;
	}

	public void setDisplayAvailability(Boolean displayAvailability) {
		this.displayAvailability = displayAvailability;

		_displayAvailabilitySupplier = () -> displayAvailability;
	}

	@JsonIgnore
	public void setDisplayAvailability(
		UnsafeSupplier<Boolean, Exception> displayAvailabilityUnsafeSupplier) {

		displayAvailability = null;

		_displayAvailabilitySupplier = () -> {
			try {
				return displayAvailabilityUnsafeSupplier.get();
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
	protected Boolean displayAvailability;

	private Supplier<Boolean> _displayAvailabilitySupplier = () -> null;

	@Schema(example = "true")
	public Boolean getDisplayStockQuantity() {
		if (displayStockQuantity != null) {
			return displayStockQuantity;
		}

		displayStockQuantity = _displayStockQuantitySupplier.get();

		return displayStockQuantity;
	}

	public void setDisplayStockQuantity(Boolean displayStockQuantity) {
		this.displayStockQuantity = displayStockQuantity;

		_displayStockQuantitySupplier = () -> displayStockQuantity;
	}

	@JsonIgnore
	public void setDisplayStockQuantity(
		UnsafeSupplier<Boolean, Exception> displayStockQuantityUnsafeSupplier) {

		displayStockQuantity = null;

		_displayStockQuantitySupplier = () -> {
			try {
				return displayStockQuantityUnsafeSupplier.get();
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
	protected Boolean displayStockQuantity;

	private Supplier<Boolean> _displayStockQuantitySupplier = () -> null;

	@Schema(
		description = "The inventory engine that will be used to manage the product inventory"
	)
	public String getInventoryEngine() {
		if (inventoryEngine != null) {
			return inventoryEngine;
		}

		inventoryEngine = _inventoryEngineSupplier.get();

		return inventoryEngine;
	}

	public void setInventoryEngine(String inventoryEngine) {
		this.inventoryEngine = inventoryEngine;

		_inventoryEngineSupplier = () -> inventoryEngine;
	}

	@JsonIgnore
	public void setInventoryEngine(
		UnsafeSupplier<String, Exception> inventoryEngineUnsafeSupplier) {

		inventoryEngine = null;

		_inventoryEngineSupplier = () -> {
			try {
				return inventoryEngineUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(
		description = "The inventory engine that will be used to manage the product inventory"
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String inventoryEngine;

	private Supplier<String> _inventoryEngineSupplier = () -> null;

	@Schema(
		description = "The low stock action that will be performed when a product is out of stock"
	)
	public String getLowStockAction() {
		if (lowStockAction != null) {
			return lowStockAction;
		}

		lowStockAction = _lowStockActionSupplier.get();

		return lowStockAction;
	}

	public void setLowStockAction(String lowStockAction) {
		this.lowStockAction = lowStockAction;

		_lowStockActionSupplier = () -> lowStockAction;
	}

	@JsonIgnore
	public void setLowStockAction(
		UnsafeSupplier<String, Exception> lowStockActionUnsafeSupplier) {

		lowStockAction = null;

		_lowStockActionSupplier = () -> {
			try {
				return lowStockActionUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(
		description = "The low stock action that will be performed when a product is out of stock"
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String lowStockAction;

	private Supplier<String> _lowStockActionSupplier = () -> null;

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

	@Schema(example = "10.1")
	@Valid
	public BigDecimal getMinStockQuantity() {
		if (minStockQuantity != null) {
			return minStockQuantity;
		}

		minStockQuantity = _minStockQuantitySupplier.get();

		return minStockQuantity;
	}

	public void setMinStockQuantity(BigDecimal minStockQuantity) {
		this.minStockQuantity = minStockQuantity;

		_minStockQuantitySupplier = () -> minStockQuantity;
	}

	@JsonIgnore
	public void setMinStockQuantity(
		UnsafeSupplier<BigDecimal, Exception> minStockQuantityUnsafeSupplier) {

		minStockQuantity = null;

		_minStockQuantitySupplier = () -> {
			try {
				return minStockQuantityUnsafeSupplier.get();
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
	protected BigDecimal minStockQuantity;

	private Supplier<BigDecimal> _minStockQuantitySupplier = () -> null;

	@Schema(example = "10.1")
	@Valid
	public BigDecimal getMultipleOrderQuantity() {
		if (multipleOrderQuantity != null) {
			return multipleOrderQuantity;
		}

		multipleOrderQuantity = _multipleOrderQuantitySupplier.get();

		return multipleOrderQuantity;
	}

	public void setMultipleOrderQuantity(BigDecimal multipleOrderQuantity) {
		this.multipleOrderQuantity = multipleOrderQuantity;

		_multipleOrderQuantitySupplier = () -> multipleOrderQuantity;
	}

	@JsonIgnore
	public void setMultipleOrderQuantity(
		UnsafeSupplier<BigDecimal, Exception>
			multipleOrderQuantityUnsafeSupplier) {

		multipleOrderQuantity = null;

		_multipleOrderQuantitySupplier = () -> {
			try {
				return multipleOrderQuantityUnsafeSupplier.get();
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
	protected BigDecimal multipleOrderQuantity;

	private Supplier<BigDecimal> _multipleOrderQuantitySupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProductConfiguration)) {
			return false;
		}

		ProductConfiguration productConfiguration =
			(ProductConfiguration)object;

		return Objects.equals(toString(), productConfiguration.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (allowBackOrder != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"allowBackOrder\": ");

			sb.append(allowBackOrder);
		}

		if (allowedOrderQuantities != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"allowedOrderQuantities\": ");

			sb.append("[");

			for (int i = 0; i < allowedOrderQuantities.length; i++) {
				sb.append(allowedOrderQuantities[i]);

				if ((i + 1) < allowedOrderQuantities.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (availabilityEstimateId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"availabilityEstimateId\": ");

			sb.append(availabilityEstimateId);
		}

		if (availabilityEstimateName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"availabilityEstimateName\": ");

			sb.append("\"");

			sb.append(_escape(availabilityEstimateName));

			sb.append("\"");
		}

		if (displayAvailability != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"displayAvailability\": ");

			sb.append(displayAvailability);
		}

		if (displayStockQuantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"displayStockQuantity\": ");

			sb.append(displayStockQuantity);
		}

		if (inventoryEngine != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"inventoryEngine\": ");

			sb.append("\"");

			sb.append(_escape(inventoryEngine));

			sb.append("\"");
		}

		if (lowStockAction != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"lowStockAction\": ");

			sb.append("\"");

			sb.append(_escape(lowStockAction));

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

		if (minStockQuantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"minStockQuantity\": ");

			sb.append(minStockQuantity);
		}

		if (multipleOrderQuantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"multipleOrderQuantity\": ");

			sb.append(multipleOrderQuantity);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.delivery.catalog.dto.v1_0.ProductConfiguration",
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