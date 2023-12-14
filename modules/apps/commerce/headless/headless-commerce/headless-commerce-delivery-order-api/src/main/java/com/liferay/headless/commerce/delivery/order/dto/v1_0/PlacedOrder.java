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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Andrea Sbarra
 * @generated
 */
@Generated("")
@GraphQLName("PlacedOrder")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "PlacedOrder")
public class PlacedOrder implements Serializable {

	public static PlacedOrder toDTO(String json) {
		return ObjectMapperUtil.readValue(PlacedOrder.class, json);
	}

	public static PlacedOrder unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(PlacedOrder.class, json);
	}

	@Schema
	public String getAccount() {
		if (account != null) {
			return account;
		}

		account = _accountSupplier.get();

		return account;
	}

	public void setAccount(String account) {
		this.account = account;

		_accountSupplier = () -> account;
	}

	@JsonIgnore
	public void setAccount(
		UnsafeSupplier<String, Exception> accountUnsafeSupplier) {

		account = null;

		_accountSupplier = () -> {
			try {
				return accountUnsafeSupplier.get();
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
	protected String account;

	private Supplier<String> _accountSupplier = () -> null;

	@Schema
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

	@Schema
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

	@Schema
	public Long getChannelId() {
		if (channelId != null) {
			return channelId;
		}

		channelId = _channelIdSupplier.get();

		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;

		_channelIdSupplier = () -> channelId;
	}

	@JsonIgnore
	public void setChannelId(
		UnsafeSupplier<Long, Exception> channelIdUnsafeSupplier) {

		channelId = null;

		_channelIdSupplier = () -> {
			try {
				return channelIdUnsafeSupplier.get();
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
	protected Long channelId;

	private Supplier<Long> _channelIdSupplier = () -> null;

	@Schema
	public String getCouponCode() {
		if (couponCode != null) {
			return couponCode;
		}

		couponCode = _couponCodeSupplier.get();

		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;

		_couponCodeSupplier = () -> couponCode;
	}

	@JsonIgnore
	public void setCouponCode(
		UnsafeSupplier<String, Exception> couponCodeUnsafeSupplier) {

		couponCode = null;

		_couponCodeSupplier = () -> {
			try {
				return couponCodeUnsafeSupplier.get();
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
	protected String couponCode;

	private Supplier<String> _couponCodeSupplier = () -> null;

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
	public String getCurrencyCode() {
		if (currencyCode != null) {
			return currencyCode;
		}

		currencyCode = _currencyCodeSupplier.get();

		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;

		_currencyCodeSupplier = () -> currencyCode;
	}

	@JsonIgnore
	public void setCurrencyCode(
		UnsafeSupplier<String, Exception> currencyCodeUnsafeSupplier) {

		currencyCode = null;

		_currencyCodeSupplier = () -> {
			try {
				return currencyCodeUnsafeSupplier.get();
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
	protected String currencyCode;

	private Supplier<String> _currencyCodeSupplier = () -> null;

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
	public Date getLastPriceUpdateDate() {
		if (lastPriceUpdateDate != null) {
			return lastPriceUpdateDate;
		}

		lastPriceUpdateDate = _lastPriceUpdateDateSupplier.get();

		return lastPriceUpdateDate;
	}

	public void setLastPriceUpdateDate(Date lastPriceUpdateDate) {
		this.lastPriceUpdateDate = lastPriceUpdateDate;

		_lastPriceUpdateDateSupplier = () -> lastPriceUpdateDate;
	}

	@JsonIgnore
	public void setLastPriceUpdateDate(
		UnsafeSupplier<Date, Exception> lastPriceUpdateDateUnsafeSupplier) {

		lastPriceUpdateDate = null;

		_lastPriceUpdateDateSupplier = () -> {
			try {
				return lastPriceUpdateDateUnsafeSupplier.get();
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
	protected Date lastPriceUpdateDate;

	private Supplier<Date> _lastPriceUpdateDateSupplier = () -> null;

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

	@Schema
	@Valid
	public Status getOrderStatusInfo() {
		if (orderStatusInfo != null) {
			return orderStatusInfo;
		}

		orderStatusInfo = _orderStatusInfoSupplier.get();

		return orderStatusInfo;
	}

	public void setOrderStatusInfo(Status orderStatusInfo) {
		this.orderStatusInfo = orderStatusInfo;

		_orderStatusInfoSupplier = () -> orderStatusInfo;
	}

	@JsonIgnore
	public void setOrderStatusInfo(
		UnsafeSupplier<Status, Exception> orderStatusInfoUnsafeSupplier) {

		orderStatusInfo = null;

		_orderStatusInfoSupplier = () -> {
			try {
				return orderStatusInfoUnsafeSupplier.get();
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
	protected Status orderStatusInfo;

	private Supplier<Status> _orderStatusInfoSupplier = () -> null;

	@Schema(example = "AB-34098-789-N")
	public String getOrderTypeExternalReferenceCode() {
		if (orderTypeExternalReferenceCode != null) {
			return orderTypeExternalReferenceCode;
		}

		orderTypeExternalReferenceCode =
			_orderTypeExternalReferenceCodeSupplier.get();

		return orderTypeExternalReferenceCode;
	}

	public void setOrderTypeExternalReferenceCode(
		String orderTypeExternalReferenceCode) {

		this.orderTypeExternalReferenceCode = orderTypeExternalReferenceCode;

		_orderTypeExternalReferenceCodeSupplier =
			() -> orderTypeExternalReferenceCode;
	}

	@JsonIgnore
	public void setOrderTypeExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			orderTypeExternalReferenceCodeUnsafeSupplier) {

		orderTypeExternalReferenceCode = null;

		_orderTypeExternalReferenceCodeSupplier = () -> {
			try {
				return orderTypeExternalReferenceCodeUnsafeSupplier.get();
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
	protected String orderTypeExternalReferenceCode;

	private Supplier<String> _orderTypeExternalReferenceCodeSupplier =
		() -> null;

	@Schema
	public Long getOrderTypeId() {
		if (orderTypeId != null) {
			return orderTypeId;
		}

		orderTypeId = _orderTypeIdSupplier.get();

		return orderTypeId;
	}

	public void setOrderTypeId(Long orderTypeId) {
		this.orderTypeId = orderTypeId;

		_orderTypeIdSupplier = () -> orderTypeId;
	}

	@JsonIgnore
	public void setOrderTypeId(
		UnsafeSupplier<Long, Exception> orderTypeIdUnsafeSupplier) {

		orderTypeId = null;

		_orderTypeIdSupplier = () -> {
			try {
				return orderTypeIdUnsafeSupplier.get();
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
	protected Long orderTypeId;

	private Supplier<Long> _orderTypeIdSupplier = () -> null;

	@Schema
	public String getOrderUUID() {
		if (orderUUID != null) {
			return orderUUID;
		}

		orderUUID = _orderUUIDSupplier.get();

		return orderUUID;
	}

	public void setOrderUUID(String orderUUID) {
		this.orderUUID = orderUUID;

		_orderUUIDSupplier = () -> orderUUID;
	}

	@JsonIgnore
	public void setOrderUUID(
		UnsafeSupplier<String, Exception> orderUUIDUnsafeSupplier) {

		orderUUID = null;

		_orderUUIDSupplier = () -> {
			try {
				return orderUUIDUnsafeSupplier.get();
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
	protected String orderUUID;

	private Supplier<String> _orderUUIDSupplier = () -> null;

	@Schema
	public String getPaymentMethod() {
		if (paymentMethod != null) {
			return paymentMethod;
		}

		paymentMethod = _paymentMethodSupplier.get();

		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;

		_paymentMethodSupplier = () -> paymentMethod;
	}

	@JsonIgnore
	public void setPaymentMethod(
		UnsafeSupplier<String, Exception> paymentMethodUnsafeSupplier) {

		paymentMethod = null;

		_paymentMethodSupplier = () -> {
			try {
				return paymentMethodUnsafeSupplier.get();
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
	protected String paymentMethod;

	private Supplier<String> _paymentMethodSupplier = () -> null;

	@Schema
	public String getPaymentMethodLabel() {
		if (paymentMethodLabel != null) {
			return paymentMethodLabel;
		}

		paymentMethodLabel = _paymentMethodLabelSupplier.get();

		return paymentMethodLabel;
	}

	public void setPaymentMethodLabel(String paymentMethodLabel) {
		this.paymentMethodLabel = paymentMethodLabel;

		_paymentMethodLabelSupplier = () -> paymentMethodLabel;
	}

	@JsonIgnore
	public void setPaymentMethodLabel(
		UnsafeSupplier<String, Exception> paymentMethodLabelUnsafeSupplier) {

		paymentMethodLabel = null;

		_paymentMethodLabelSupplier = () -> {
			try {
				return paymentMethodLabelUnsafeSupplier.get();
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
	protected String paymentMethodLabel;

	private Supplier<String> _paymentMethodLabelSupplier = () -> null;

	@Schema
	public Integer getPaymentStatus() {
		if (paymentStatus != null) {
			return paymentStatus;
		}

		paymentStatus = _paymentStatusSupplier.get();

		return paymentStatus;
	}

	public void setPaymentStatus(Integer paymentStatus) {
		this.paymentStatus = paymentStatus;

		_paymentStatusSupplier = () -> paymentStatus;
	}

	@JsonIgnore
	public void setPaymentStatus(
		UnsafeSupplier<Integer, Exception> paymentStatusUnsafeSupplier) {

		paymentStatus = null;

		_paymentStatusSupplier = () -> {
			try {
				return paymentStatusUnsafeSupplier.get();
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
	protected Integer paymentStatus;

	private Supplier<Integer> _paymentStatusSupplier = () -> null;

	@Schema
	@Valid
	public Status getPaymentStatusInfo() {
		if (paymentStatusInfo != null) {
			return paymentStatusInfo;
		}

		paymentStatusInfo = _paymentStatusInfoSupplier.get();

		return paymentStatusInfo;
	}

	public void setPaymentStatusInfo(Status paymentStatusInfo) {
		this.paymentStatusInfo = paymentStatusInfo;

		_paymentStatusInfoSupplier = () -> paymentStatusInfo;
	}

	@JsonIgnore
	public void setPaymentStatusInfo(
		UnsafeSupplier<Status, Exception> paymentStatusInfoUnsafeSupplier) {

		paymentStatusInfo = null;

		_paymentStatusInfoSupplier = () -> {
			try {
				return paymentStatusInfoUnsafeSupplier.get();
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
	protected Status paymentStatusInfo;

	private Supplier<Status> _paymentStatusInfoSupplier = () -> null;

	@Schema
	public String getPaymentStatusLabel() {
		if (paymentStatusLabel != null) {
			return paymentStatusLabel;
		}

		paymentStatusLabel = _paymentStatusLabelSupplier.get();

		return paymentStatusLabel;
	}

	public void setPaymentStatusLabel(String paymentStatusLabel) {
		this.paymentStatusLabel = paymentStatusLabel;

		_paymentStatusLabelSupplier = () -> paymentStatusLabel;
	}

	@JsonIgnore
	public void setPaymentStatusLabel(
		UnsafeSupplier<String, Exception> paymentStatusLabelUnsafeSupplier) {

		paymentStatusLabel = null;

		_paymentStatusLabelSupplier = () -> {
			try {
				return paymentStatusLabelUnsafeSupplier.get();
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
	protected String paymentStatusLabel;

	private Supplier<String> _paymentStatusLabelSupplier = () -> null;

	@Schema
	@Valid
	public PlacedOrderAddress getPlacedOrderBillingAddress() {
		if (placedOrderBillingAddress != null) {
			return placedOrderBillingAddress;
		}

		placedOrderBillingAddress = _placedOrderBillingAddressSupplier.get();

		return placedOrderBillingAddress;
	}

	public void setPlacedOrderBillingAddress(
		PlacedOrderAddress placedOrderBillingAddress) {

		this.placedOrderBillingAddress = placedOrderBillingAddress;

		_placedOrderBillingAddressSupplier = () -> placedOrderBillingAddress;
	}

	@JsonIgnore
	public void setPlacedOrderBillingAddress(
		UnsafeSupplier<PlacedOrderAddress, Exception>
			placedOrderBillingAddressUnsafeSupplier) {

		placedOrderBillingAddress = null;

		_placedOrderBillingAddressSupplier = () -> {
			try {
				return placedOrderBillingAddressUnsafeSupplier.get();
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
	protected PlacedOrderAddress placedOrderBillingAddress;

	private Supplier<PlacedOrderAddress> _placedOrderBillingAddressSupplier =
		() -> null;

	@Schema
	public Long getPlacedOrderBillingAddressId() {
		if (placedOrderBillingAddressId != null) {
			return placedOrderBillingAddressId;
		}

		placedOrderBillingAddressId =
			_placedOrderBillingAddressIdSupplier.get();

		return placedOrderBillingAddressId;
	}

	public void setPlacedOrderBillingAddressId(
		Long placedOrderBillingAddressId) {

		this.placedOrderBillingAddressId = placedOrderBillingAddressId;

		_placedOrderBillingAddressIdSupplier =
			() -> placedOrderBillingAddressId;
	}

	@JsonIgnore
	public void setPlacedOrderBillingAddressId(
		UnsafeSupplier<Long, Exception>
			placedOrderBillingAddressIdUnsafeSupplier) {

		placedOrderBillingAddressId = null;

		_placedOrderBillingAddressIdSupplier = () -> {
			try {
				return placedOrderBillingAddressIdUnsafeSupplier.get();
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
	protected Long placedOrderBillingAddressId;

	private Supplier<Long> _placedOrderBillingAddressIdSupplier = () -> null;

	@Schema
	@Valid
	public PlacedOrderComment[] getPlacedOrderComments() {
		if (placedOrderComments != null) {
			return placedOrderComments;
		}

		placedOrderComments = _placedOrderCommentsSupplier.get();

		return placedOrderComments;
	}

	public void setPlacedOrderComments(
		PlacedOrderComment[] placedOrderComments) {

		this.placedOrderComments = placedOrderComments;

		_placedOrderCommentsSupplier = () -> placedOrderComments;
	}

	@JsonIgnore
	public void setPlacedOrderComments(
		UnsafeSupplier<PlacedOrderComment[], Exception>
			placedOrderCommentsUnsafeSupplier) {

		placedOrderComments = null;

		_placedOrderCommentsSupplier = () -> {
			try {
				return placedOrderCommentsUnsafeSupplier.get();
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
	protected PlacedOrderComment[] placedOrderComments;

	private Supplier<PlacedOrderComment[]> _placedOrderCommentsSupplier =
		() -> null;

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
	public PlacedOrderAddress getPlacedOrderShippingAddress() {
		if (placedOrderShippingAddress != null) {
			return placedOrderShippingAddress;
		}

		placedOrderShippingAddress = _placedOrderShippingAddressSupplier.get();

		return placedOrderShippingAddress;
	}

	public void setPlacedOrderShippingAddress(
		PlacedOrderAddress placedOrderShippingAddress) {

		this.placedOrderShippingAddress = placedOrderShippingAddress;

		_placedOrderShippingAddressSupplier = () -> placedOrderShippingAddress;
	}

	@JsonIgnore
	public void setPlacedOrderShippingAddress(
		UnsafeSupplier<PlacedOrderAddress, Exception>
			placedOrderShippingAddressUnsafeSupplier) {

		placedOrderShippingAddress = null;

		_placedOrderShippingAddressSupplier = () -> {
			try {
				return placedOrderShippingAddressUnsafeSupplier.get();
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
	protected PlacedOrderAddress placedOrderShippingAddress;

	private Supplier<PlacedOrderAddress> _placedOrderShippingAddressSupplier =
		() -> null;

	@Schema
	public Long getPlacedOrderShippingAddressId() {
		if (placedOrderShippingAddressId != null) {
			return placedOrderShippingAddressId;
		}

		placedOrderShippingAddressId =
			_placedOrderShippingAddressIdSupplier.get();

		return placedOrderShippingAddressId;
	}

	public void setPlacedOrderShippingAddressId(
		Long placedOrderShippingAddressId) {

		this.placedOrderShippingAddressId = placedOrderShippingAddressId;

		_placedOrderShippingAddressIdSupplier =
			() -> placedOrderShippingAddressId;
	}

	@JsonIgnore
	public void setPlacedOrderShippingAddressId(
		UnsafeSupplier<Long, Exception>
			placedOrderShippingAddressIdUnsafeSupplier) {

		placedOrderShippingAddressId = null;

		_placedOrderShippingAddressIdSupplier = () -> {
			try {
				return placedOrderShippingAddressIdUnsafeSupplier.get();
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
	protected Long placedOrderShippingAddressId;

	private Supplier<Long> _placedOrderShippingAddressIdSupplier = () -> null;

	@Schema
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String printedNote;

	private Supplier<String> _printedNoteSupplier = () -> null;

	@Schema
	public String getPurchaseOrderNumber() {
		if (purchaseOrderNumber != null) {
			return purchaseOrderNumber;
		}

		purchaseOrderNumber = _purchaseOrderNumberSupplier.get();

		return purchaseOrderNumber;
	}

	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;

		_purchaseOrderNumberSupplier = () -> purchaseOrderNumber;
	}

	@JsonIgnore
	public void setPurchaseOrderNumber(
		UnsafeSupplier<String, Exception> purchaseOrderNumberUnsafeSupplier) {

		purchaseOrderNumber = null;

		_purchaseOrderNumberSupplier = () -> {
			try {
				return purchaseOrderNumberUnsafeSupplier.get();
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
	protected String purchaseOrderNumber;

	private Supplier<String> _purchaseOrderNumberSupplier = () -> null;

	@Schema
	public String getShippingMethod() {
		if (shippingMethod != null) {
			return shippingMethod;
		}

		shippingMethod = _shippingMethodSupplier.get();

		return shippingMethod;
	}

	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;

		_shippingMethodSupplier = () -> shippingMethod;
	}

	@JsonIgnore
	public void setShippingMethod(
		UnsafeSupplier<String, Exception> shippingMethodUnsafeSupplier) {

		shippingMethod = null;

		_shippingMethodSupplier = () -> {
			try {
				return shippingMethodUnsafeSupplier.get();
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
	protected String shippingMethod;

	private Supplier<String> _shippingMethodSupplier = () -> null;

	@Schema
	public String getShippingOption() {
		if (shippingOption != null) {
			return shippingOption;
		}

		shippingOption = _shippingOptionSupplier.get();

		return shippingOption;
	}

	public void setShippingOption(String shippingOption) {
		this.shippingOption = shippingOption;

		_shippingOptionSupplier = () -> shippingOption;
	}

	@JsonIgnore
	public void setShippingOption(
		UnsafeSupplier<String, Exception> shippingOptionUnsafeSupplier) {

		shippingOption = null;

		_shippingOptionSupplier = () -> {
			try {
				return shippingOptionUnsafeSupplier.get();
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
	protected String shippingOption;

	private Supplier<String> _shippingOptionSupplier = () -> null;

	@Schema
	public String getStatus() {
		if (status != null) {
			return status;
		}

		status = _statusSupplier.get();

		return status;
	}

	public void setStatus(String status) {
		this.status = status;

		_statusSupplier = () -> status;
	}

	@JsonIgnore
	public void setStatus(
		UnsafeSupplier<String, Exception> statusUnsafeSupplier) {

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
	protected String status;

	private Supplier<String> _statusSupplier = () -> null;

	@Schema
	@Valid
	public Summary getSummary() {
		if (summary != null) {
			return summary;
		}

		summary = _summarySupplier.get();

		return summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;

		_summarySupplier = () -> summary;
	}

	@JsonIgnore
	public void setSummary(
		UnsafeSupplier<Summary, Exception> summaryUnsafeSupplier) {

		summary = null;

		_summarySupplier = () -> {
			try {
				return summaryUnsafeSupplier.get();
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
	protected Summary summary;

	private Supplier<Summary> _summarySupplier = () -> null;

	@Schema
	public Boolean getUseAsBilling() {
		if (useAsBilling != null) {
			return useAsBilling;
		}

		useAsBilling = _useAsBillingSupplier.get();

		return useAsBilling;
	}

	public void setUseAsBilling(Boolean useAsBilling) {
		this.useAsBilling = useAsBilling;

		_useAsBillingSupplier = () -> useAsBilling;
	}

	@JsonIgnore
	public void setUseAsBilling(
		UnsafeSupplier<Boolean, Exception> useAsBillingUnsafeSupplier) {

		useAsBilling = null;

		_useAsBillingSupplier = () -> {
			try {
				return useAsBillingUnsafeSupplier.get();
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
	protected Boolean useAsBilling;

	private Supplier<Boolean> _useAsBillingSupplier = () -> null;

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
	@Valid
	public Status getWorkflowStatusInfo() {
		if (workflowStatusInfo != null) {
			return workflowStatusInfo;
		}

		workflowStatusInfo = _workflowStatusInfoSupplier.get();

		return workflowStatusInfo;
	}

	public void setWorkflowStatusInfo(Status workflowStatusInfo) {
		this.workflowStatusInfo = workflowStatusInfo;

		_workflowStatusInfoSupplier = () -> workflowStatusInfo;
	}

	@JsonIgnore
	public void setWorkflowStatusInfo(
		UnsafeSupplier<Status, Exception> workflowStatusInfoUnsafeSupplier) {

		workflowStatusInfo = null;

		_workflowStatusInfoSupplier = () -> {
			try {
				return workflowStatusInfoUnsafeSupplier.get();
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
	protected Status workflowStatusInfo;

	private Supplier<Status> _workflowStatusInfoSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PlacedOrder)) {
			return false;
		}

		PlacedOrder placedOrder = (PlacedOrder)object;

		return Objects.equals(toString(), placedOrder.toString());
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

		if (account != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"account\": ");

			sb.append("\"");

			sb.append(_escape(account));

			sb.append("\"");
		}

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

		if (channelId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"channelId\": ");

			sb.append(channelId);
		}

		if (couponCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"couponCode\": ");

			sb.append("\"");

			sb.append(_escape(couponCode));

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

		if (currencyCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"currencyCode\": ");

			sb.append("\"");

			sb.append(_escape(currencyCode));

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

		if (lastPriceUpdateDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"lastPriceUpdateDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(lastPriceUpdateDate));

			sb.append("\"");
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

		if (orderStatusInfo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderStatusInfo\": ");

			sb.append(String.valueOf(orderStatusInfo));
		}

		if (orderTypeExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderTypeExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(orderTypeExternalReferenceCode));

			sb.append("\"");
		}

		if (orderTypeId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderTypeId\": ");

			sb.append(orderTypeId);
		}

		if (orderUUID != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderUUID\": ");

			sb.append("\"");

			sb.append(_escape(orderUUID));

			sb.append("\"");
		}

		if (paymentMethod != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paymentMethod\": ");

			sb.append("\"");

			sb.append(_escape(paymentMethod));

			sb.append("\"");
		}

		if (paymentMethodLabel != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paymentMethodLabel\": ");

			sb.append("\"");

			sb.append(_escape(paymentMethodLabel));

			sb.append("\"");
		}

		if (paymentStatus != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paymentStatus\": ");

			sb.append(paymentStatus);
		}

		if (paymentStatusInfo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paymentStatusInfo\": ");

			sb.append(String.valueOf(paymentStatusInfo));
		}

		if (paymentStatusLabel != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paymentStatusLabel\": ");

			sb.append("\"");

			sb.append(_escape(paymentStatusLabel));

			sb.append("\"");
		}

		if (placedOrderBillingAddress != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"placedOrderBillingAddress\": ");

			sb.append(String.valueOf(placedOrderBillingAddress));
		}

		if (placedOrderBillingAddressId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"placedOrderBillingAddressId\": ");

			sb.append(placedOrderBillingAddressId);
		}

		if (placedOrderComments != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"placedOrderComments\": ");

			sb.append("[");

			for (int i = 0; i < placedOrderComments.length; i++) {
				sb.append(String.valueOf(placedOrderComments[i]));

				if ((i + 1) < placedOrderComments.length) {
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

		if (placedOrderShippingAddress != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"placedOrderShippingAddress\": ");

			sb.append(String.valueOf(placedOrderShippingAddress));
		}

		if (placedOrderShippingAddressId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"placedOrderShippingAddressId\": ");

			sb.append(placedOrderShippingAddressId);
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

		if (purchaseOrderNumber != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"purchaseOrderNumber\": ");

			sb.append("\"");

			sb.append(_escape(purchaseOrderNumber));

			sb.append("\"");
		}

		if (shippingMethod != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingMethod\": ");

			sb.append("\"");

			sb.append(_escape(shippingMethod));

			sb.append("\"");
		}

		if (shippingOption != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingOption\": ");

			sb.append("\"");

			sb.append(_escape(shippingOption));

			sb.append("\"");
		}

		if (status != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append("\"");

			sb.append(_escape(status));

			sb.append("\"");
		}

		if (summary != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"summary\": ");

			sb.append(String.valueOf(summary));
		}

		if (useAsBilling != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"useAsBilling\": ");

			sb.append(useAsBilling);
		}

		if (valid != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valid\": ");

			sb.append(valid);
		}

		if (workflowStatusInfo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"workflowStatusInfo\": ");

			sb.append(String.valueOf(workflowStatusInfo));
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.delivery.order.dto.v1_0.PlacedOrder",
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