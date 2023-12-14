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
@GraphQLName("PlacedOrderItemShipment")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "PlacedOrderItemShipment")
public class PlacedOrderItemShipment implements Serializable {

	public static PlacedOrderItemShipment toDTO(String json) {
		return ObjectMapperUtil.readValue(PlacedOrderItemShipment.class, json);
	}

	public static PlacedOrderItemShipment unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			PlacedOrderItemShipment.class, json);
	}

	@DecimalMin("0")
	@Schema(example = "30130")
	public Long getAccountId() {
		if (accountId != null) {
			return accountId;
		}

		accountId = _accountIdSupplier.get();

		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;

		_accountIdSupplier = () -> accountId;
	}

	@JsonIgnore
	public void setAccountId(
		UnsafeSupplier<Long, Exception> accountIdUnsafeSupplier) {

		accountId = null;

		_accountIdSupplier = () -> {
			try {
				return accountIdUnsafeSupplier.get();
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
	protected Long accountId;

	private Supplier<Long> _accountIdSupplier = () -> null;

	@Schema(example = "Author")
	public String getAuthor() {
		if (author != null) {
			return author;
		}

		author = _authorSupplier.get();

		return author;
	}

	public void setAuthor(String author) {
		this.author = author;

		_authorSupplier = () -> author;
	}

	@JsonIgnore
	public void setAuthor(
		UnsafeSupplier<String, Exception> authorUnsafeSupplier) {

		author = null;

		_authorSupplier = () -> {
			try {
				return authorUnsafeSupplier.get();
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
	protected String author;

	private Supplier<String> _authorSupplier = () -> null;

	@Schema(example = "FedEx")
	public String getCarrier() {
		if (carrier != null) {
			return carrier;
		}

		carrier = _carrierSupplier.get();

		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;

		_carrierSupplier = () -> carrier;
	}

	@JsonIgnore
	public void setCarrier(
		UnsafeSupplier<String, Exception> carrierUnsafeSupplier) {

		carrier = null;

		_carrierSupplier = () -> {
			try {
				return carrierUnsafeSupplier.get();
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
	protected String carrier;

	private Supplier<String> _carrierSupplier = () -> null;

	@Schema
	public Date getCreateDate() {
		if (createDate != null) {
			return createDate;
		}

		createDate = _createDateSupplier.get();

		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;

		_createDateSupplier = () -> createDate;
	}

	@JsonIgnore
	public void setCreateDate(
		UnsafeSupplier<Date, Exception> createDateUnsafeSupplier) {

		createDate = null;

		_createDateSupplier = () -> {
			try {
				return createDateUnsafeSupplier.get();
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
	protected Date createDate;

	private Supplier<Date> _createDateSupplier = () -> null;

	@Schema
	public Date getEstimatedDeliveryDate() {
		if (estimatedDeliveryDate != null) {
			return estimatedDeliveryDate;
		}

		estimatedDeliveryDate = _estimatedDeliveryDateSupplier.get();

		return estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;

		_estimatedDeliveryDateSupplier = () -> estimatedDeliveryDate;
	}

	@JsonIgnore
	public void setEstimatedDeliveryDate(
		UnsafeSupplier<Date, Exception> estimatedDeliveryDateUnsafeSupplier) {

		estimatedDeliveryDate = null;

		_estimatedDeliveryDateSupplier = () -> {
			try {
				return estimatedDeliveryDateUnsafeSupplier.get();
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
	protected Date estimatedDeliveryDate;

	private Supplier<Date> _estimatedDeliveryDateSupplier = () -> null;

	@Schema
	public Date getEstimatedShippingDate() {
		if (estimatedShippingDate != null) {
			return estimatedShippingDate;
		}

		estimatedShippingDate = _estimatedShippingDateSupplier.get();

		return estimatedShippingDate;
	}

	public void setEstimatedShippingDate(Date estimatedShippingDate) {
		this.estimatedShippingDate = estimatedShippingDate;

		_estimatedShippingDateSupplier = () -> estimatedShippingDate;
	}

	@JsonIgnore
	public void setEstimatedShippingDate(
		UnsafeSupplier<Date, Exception> estimatedShippingDateUnsafeSupplier) {

		estimatedShippingDate = null;

		_estimatedShippingDateSupplier = () -> {
			try {
				return estimatedShippingDateUnsafeSupplier.get();
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
	protected Date estimatedShippingDate;

	private Supplier<Date> _estimatedShippingDateSupplier = () -> null;

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
	public Date getModifiedDate() {
		if (modifiedDate != null) {
			return modifiedDate;
		}

		modifiedDate = _modifiedDateSupplier.get();

		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;

		_modifiedDateSupplier = () -> modifiedDate;
	}

	@JsonIgnore
	public void setModifiedDate(
		UnsafeSupplier<Date, Exception> modifiedDateUnsafeSupplier) {

		modifiedDate = null;

		_modifiedDateSupplier = () -> {
			try {
				return modifiedDateUnsafeSupplier.get();
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
	protected Date modifiedDate;

	private Supplier<Date> _modifiedDateSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long orderId;

	private Supplier<Long> _orderIdSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long shippingAddressId;

	private Supplier<Long> _shippingAddressIdSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
	public Long getShippingMethodId() {
		if (shippingMethodId != null) {
			return shippingMethodId;
		}

		shippingMethodId = _shippingMethodIdSupplier.get();

		return shippingMethodId;
	}

	public void setShippingMethodId(Long shippingMethodId) {
		this.shippingMethodId = shippingMethodId;

		_shippingMethodIdSupplier = () -> shippingMethodId;
	}

	@JsonIgnore
	public void setShippingMethodId(
		UnsafeSupplier<Long, Exception> shippingMethodIdUnsafeSupplier) {

		shippingMethodId = null;

		_shippingMethodIdSupplier = () -> {
			try {
				return shippingMethodIdUnsafeSupplier.get();
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
	protected Long shippingMethodId;

	private Supplier<Long> _shippingMethodIdSupplier = () -> null;

	@Schema(example = "Standard Delivery")
	public String getShippingOptionName() {
		if (shippingOptionName != null) {
			return shippingOptionName;
		}

		shippingOptionName = _shippingOptionNameSupplier.get();

		return shippingOptionName;
	}

	public void setShippingOptionName(String shippingOptionName) {
		this.shippingOptionName = shippingOptionName;

		_shippingOptionNameSupplier = () -> shippingOptionName;
	}

	@JsonIgnore
	public void setShippingOptionName(
		UnsafeSupplier<String, Exception> shippingOptionNameUnsafeSupplier) {

		shippingOptionName = null;

		_shippingOptionNameSupplier = () -> {
			try {
				return shippingOptionNameUnsafeSupplier.get();
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
	protected String shippingOptionName;

	private Supplier<String> _shippingOptionNameSupplier = () -> null;

	@Schema
	@Valid
	public Status getStatus() {
		if (status != null) {
			return status;
		}

		status = _statusSupplier.get();

		return status;
	}

	public void setStatus(Status status) {
		this.status = status;

		_statusSupplier = () -> status;
	}

	@JsonIgnore
	public void setStatus(
		UnsafeSupplier<Status, Exception> statusUnsafeSupplier) {

		status = null;

		_statusSupplier = () -> {
			try {
				return statusUnsafeSupplier.get();
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
	protected Status status;

	private Supplier<Status> _statusSupplier = () -> null;

	@Schema
	public Boolean getSupplierShipment() {
		if (supplierShipment != null) {
			return supplierShipment;
		}

		supplierShipment = _supplierShipmentSupplier.get();

		return supplierShipment;
	}

	public void setSupplierShipment(Boolean supplierShipment) {
		this.supplierShipment = supplierShipment;

		_supplierShipmentSupplier = () -> supplierShipment;
	}

	@JsonIgnore
	public void setSupplierShipment(
		UnsafeSupplier<Boolean, Exception> supplierShipmentUnsafeSupplier) {

		supplierShipment = null;

		_supplierShipmentSupplier = () -> {
			try {
				return supplierShipmentUnsafeSupplier.get();
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
	protected Boolean supplierShipment;

	private Supplier<Boolean> _supplierShipmentSupplier = () -> null;

	@Schema(example = "123AD-asd")
	public String getTrackingNumber() {
		if (trackingNumber != null) {
			return trackingNumber;
		}

		trackingNumber = _trackingNumberSupplier.get();

		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;

		_trackingNumberSupplier = () -> trackingNumber;
	}

	@JsonIgnore
	public void setTrackingNumber(
		UnsafeSupplier<String, Exception> trackingNumberUnsafeSupplier) {

		trackingNumber = null;

		_trackingNumberSupplier = () -> {
			try {
				return trackingNumberUnsafeSupplier.get();
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
	protected String trackingNumber;

	private Supplier<String> _trackingNumberSupplier = () -> null;

	@Schema
	public String getTrackingURL() {
		if (trackingURL != null) {
			return trackingURL;
		}

		trackingURL = _trackingURLSupplier.get();

		return trackingURL;
	}

	public void setTrackingURL(String trackingURL) {
		this.trackingURL = trackingURL;

		_trackingURLSupplier = () -> trackingURL;
	}

	@JsonIgnore
	public void setTrackingURL(
		UnsafeSupplier<String, Exception> trackingURLUnsafeSupplier) {

		trackingURL = null;

		_trackingURLSupplier = () -> {
			try {
				return trackingURLUnsafeSupplier.get();
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
	protected String trackingURL;

	private Supplier<String> _trackingURLSupplier = () -> null;

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

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PlacedOrderItemShipment)) {
			return false;
		}

		PlacedOrderItemShipment placedOrderItemShipment =
			(PlacedOrderItemShipment)object;

		return Objects.equals(toString(), placedOrderItemShipment.toString());
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

		if (accountId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountId\": ");

			sb.append(accountId);
		}

		if (author != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"author\": ");

			sb.append("\"");

			sb.append(_escape(author));

			sb.append("\"");
		}

		if (carrier != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"carrier\": ");

			sb.append("\"");

			sb.append(_escape(carrier));

			sb.append("\"");
		}

		if (createDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"createDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(createDate));

			sb.append("\"");
		}

		if (estimatedDeliveryDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"estimatedDeliveryDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(estimatedDeliveryDate));

			sb.append("\"");
		}

		if (estimatedShippingDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"estimatedShippingDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(estimatedShippingDate));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (modifiedDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modifiedDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(modifiedDate));

			sb.append("\"");
		}

		if (orderId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderId\": ");

			sb.append(orderId);
		}

		if (quantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"quantity\": ");

			sb.append(quantity);
		}

		if (shippingAddressId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingAddressId\": ");

			sb.append(shippingAddressId);
		}

		if (shippingMethodId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingMethodId\": ");

			sb.append(shippingMethodId);
		}

		if (shippingOptionName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingOptionName\": ");

			sb.append("\"");

			sb.append(_escape(shippingOptionName));

			sb.append("\"");
		}

		if (status != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append(String.valueOf(status));
		}

		if (supplierShipment != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"supplierShipment\": ");

			sb.append(supplierShipment);
		}

		if (trackingNumber != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"trackingNumber\": ");

			sb.append("\"");

			sb.append(_escape(trackingNumber));

			sb.append("\"");
		}

		if (trackingURL != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"trackingURL\": ");

			sb.append("\"");

			sb.append(_escape(trackingURL));

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

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.delivery.order.dto.v1_0.PlacedOrderItemShipment",
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