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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Alessio Antonio Rendina
 * @generated
 */
@Generated("")
@GraphQLName("Order")
@JsonFilter("Liferay.Vulcan")
@Schema(requiredProperties = {"channelId", "currencyCode"})
@XmlRootElement(name = "Order")
public class Order implements Serializable {

	public static Order toDTO(String json) {
		return ObjectMapperUtil.readValue(Order.class, json);
	}

	public static Order unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Order.class, json);
	}

	@Schema
	@Valid
	public Account getAccount() {
		if (account != null) {
			return account;
		}

		account = _accountSupplier.get();

		return account;
	}

	public void setAccount(Account account) {
		this.account = account;

		_accountSupplier = () -> account;
	}

	@JsonIgnore
	public void setAccount(
		UnsafeSupplier<Account, Exception> accountUnsafeSupplier) {

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
	protected Account account;

	private Supplier<Account> _accountSupplier = () -> null;

	@Schema(example = "AAB-34098-789-N")
	public String getAccountExternalReferenceCode() {
		if (accountExternalReferenceCode != null) {
			return accountExternalReferenceCode;
		}

		accountExternalReferenceCode =
			_accountExternalReferenceCodeSupplier.get();

		return accountExternalReferenceCode;
	}

	public void setAccountExternalReferenceCode(
		String accountExternalReferenceCode) {

		this.accountExternalReferenceCode = accountExternalReferenceCode;

		_accountExternalReferenceCodeSupplier =
			() -> accountExternalReferenceCode;
	}

	@JsonIgnore
	public void setAccountExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			accountExternalReferenceCodeUnsafeSupplier) {

		accountExternalReferenceCode = null;

		_accountExternalReferenceCodeSupplier = () -> {
			try {
				return accountExternalReferenceCodeUnsafeSupplier.get();
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
	protected String accountExternalReferenceCode;

	private Supplier<String> _accountExternalReferenceCodeSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long accountId;

	private Supplier<Long> _accountIdSupplier = () -> null;

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

	@Schema(example = "trasmitted")
	public String getAdvanceStatus() {
		if (advanceStatus != null) {
			return advanceStatus;
		}

		advanceStatus = _advanceStatusSupplier.get();

		return advanceStatus;
	}

	public void setAdvanceStatus(String advanceStatus) {
		this.advanceStatus = advanceStatus;

		_advanceStatusSupplier = () -> advanceStatus;
	}

	@JsonIgnore
	public void setAdvanceStatus(
		UnsafeSupplier<String, Exception> advanceStatusUnsafeSupplier) {

		advanceStatus = null;

		_advanceStatusSupplier = () -> {
			try {
				return advanceStatusUnsafeSupplier.get();
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
	protected String advanceStatus;

	private Supplier<String> _advanceStatusSupplier = () -> null;

	@Schema
	@Valid
	public BillingAddress getBillingAddress() {
		if (billingAddress != null) {
			return billingAddress;
		}

		billingAddress = _billingAddressSupplier.get();

		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;

		_billingAddressSupplier = () -> billingAddress;
	}

	@JsonIgnore
	public void setBillingAddress(
		UnsafeSupplier<BillingAddress, Exception>
			billingAddressUnsafeSupplier) {

		billingAddress = null;

		_billingAddressSupplier = () -> {
			try {
				return billingAddressUnsafeSupplier.get();
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
	protected BillingAddress billingAddress;

	private Supplier<BillingAddress> _billingAddressSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "31130")
	public Long getBillingAddressId() {
		if (billingAddressId != null) {
			return billingAddressId;
		}

		billingAddressId = _billingAddressIdSupplier.get();

		return billingAddressId;
	}

	public void setBillingAddressId(Long billingAddressId) {
		this.billingAddressId = billingAddressId;

		_billingAddressIdSupplier = () -> billingAddressId;
	}

	@JsonIgnore
	public void setBillingAddressId(
		UnsafeSupplier<Long, Exception> billingAddressIdUnsafeSupplier) {

		billingAddressId = null;

		_billingAddressIdSupplier = () -> {
			try {
				return billingAddressIdUnsafeSupplier.get();
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
	protected Long billingAddressId;

	private Supplier<Long> _billingAddressIdSupplier = () -> null;

	@Schema
	@Valid
	public Channel getChannel() {
		if (channel != null) {
			return channel;
		}

		channel = _channelSupplier.get();

		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;

		_channelSupplier = () -> channel;
	}

	@JsonIgnore
	public void setChannel(
		UnsafeSupplier<Channel, Exception> channelUnsafeSupplier) {

		channel = null;

		_channelSupplier = () -> {
			try {
				return channelUnsafeSupplier.get();
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
	protected Channel channel;

	private Supplier<Channel> _channelSupplier = () -> null;

	@Schema(example = "AAB-34098-789-N")
	public String getChannelExternalReferenceCode() {
		if (channelExternalReferenceCode != null) {
			return channelExternalReferenceCode;
		}

		channelExternalReferenceCode =
			_channelExternalReferenceCodeSupplier.get();

		return channelExternalReferenceCode;
	}

	public void setChannelExternalReferenceCode(
		String channelExternalReferenceCode) {

		this.channelExternalReferenceCode = channelExternalReferenceCode;

		_channelExternalReferenceCodeSupplier =
			() -> channelExternalReferenceCode;
	}

	@JsonIgnore
	public void setChannelExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			channelExternalReferenceCodeUnsafeSupplier) {

		channelExternalReferenceCode = null;

		_channelExternalReferenceCodeSupplier = () -> {
			try {
				return channelExternalReferenceCodeUnsafeSupplier.get();
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
	protected String channelExternalReferenceCode;

	private Supplier<String> _channelExternalReferenceCodeSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	@NotNull
	protected Long channelId;

	private Supplier<Long> _channelIdSupplier = () -> null;

	@Schema(example = "save20")
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String couponCode;

	private Supplier<String> _couponCodeSupplier = () -> null;

	@Schema(example = "2017-07-21")
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date createDate;

	private Supplier<Date> _createDateSupplier = () -> null;

	@Schema
	public String getCreatorEmailAddress() {
		if (creatorEmailAddress != null) {
			return creatorEmailAddress;
		}

		creatorEmailAddress = _creatorEmailAddressSupplier.get();

		return creatorEmailAddress;
	}

	public void setCreatorEmailAddress(String creatorEmailAddress) {
		this.creatorEmailAddress = creatorEmailAddress;

		_creatorEmailAddressSupplier = () -> creatorEmailAddress;
	}

	@JsonIgnore
	public void setCreatorEmailAddress(
		UnsafeSupplier<String, Exception> creatorEmailAddressUnsafeSupplier) {

		creatorEmailAddress = null;

		_creatorEmailAddressSupplier = () -> {
			try {
				return creatorEmailAddressUnsafeSupplier.get();
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
	protected String creatorEmailAddress;

	private Supplier<String> _creatorEmailAddressSupplier = () -> null;

	@Schema(example = "USD")
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	@NotEmpty
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, ?> customFields;

	private Supplier<Map<String, ?>> _customFieldsSupplier = () -> null;

	@Schema(example = "Orders delivery terms description")
	public String getDeliveryTermDescription() {
		if (deliveryTermDescription != null) {
			return deliveryTermDescription;
		}

		deliveryTermDescription = _deliveryTermDescriptionSupplier.get();

		return deliveryTermDescription;
	}

	public void setDeliveryTermDescription(String deliveryTermDescription) {
		this.deliveryTermDescription = deliveryTermDescription;

		_deliveryTermDescriptionSupplier = () -> deliveryTermDescription;
	}

	@JsonIgnore
	public void setDeliveryTermDescription(
		UnsafeSupplier<String, Exception>
			deliveryTermDescriptionUnsafeSupplier) {

		deliveryTermDescription = null;

		_deliveryTermDescriptionSupplier = () -> {
			try {
				return deliveryTermDescriptionUnsafeSupplier.get();
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
	protected String deliveryTermDescription;

	private Supplier<String> _deliveryTermDescriptionSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
	public Long getDeliveryTermId() {
		if (deliveryTermId != null) {
			return deliveryTermId;
		}

		deliveryTermId = _deliveryTermIdSupplier.get();

		return deliveryTermId;
	}

	public void setDeliveryTermId(Long deliveryTermId) {
		this.deliveryTermId = deliveryTermId;

		_deliveryTermIdSupplier = () -> deliveryTermId;
	}

	@JsonIgnore
	public void setDeliveryTermId(
		UnsafeSupplier<Long, Exception> deliveryTermIdUnsafeSupplier) {

		deliveryTermId = null;

		_deliveryTermIdSupplier = () -> {
			try {
				return deliveryTermIdUnsafeSupplier.get();
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
	protected Long deliveryTermId;

	private Supplier<Long> _deliveryTermIdSupplier = () -> null;

	@Schema(example = "Orders delivery terms name")
	public String getDeliveryTermName() {
		if (deliveryTermName != null) {
			return deliveryTermName;
		}

		deliveryTermName = _deliveryTermNameSupplier.get();

		return deliveryTermName;
	}

	public void setDeliveryTermName(String deliveryTermName) {
		this.deliveryTermName = deliveryTermName;

		_deliveryTermNameSupplier = () -> deliveryTermName;
	}

	@JsonIgnore
	public void setDeliveryTermName(
		UnsafeSupplier<String, Exception> deliveryTermNameUnsafeSupplier) {

		deliveryTermName = null;

		_deliveryTermNameSupplier = () -> {
			try {
				return deliveryTermNameUnsafeSupplier.get();
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
	protected String deliveryTermName;

	private Supplier<String> _deliveryTermNameSupplier = () -> null;

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

	@Schema(example = "2017-07-21")
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date lastPriceUpdateDate;

	private Supplier<Date> _lastPriceUpdateDateSupplier = () -> null;

	@Schema(example = "2017-08-21")
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date modifiedDate;

	private Supplier<Date> _modifiedDateSupplier = () -> null;

	@Schema(example = "2017-07-21")
	public Date getOrderDate() {
		if (orderDate != null) {
			return orderDate;
		}

		orderDate = _orderDateSupplier.get();

		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;

		_orderDateSupplier = () -> orderDate;
	}

	@JsonIgnore
	public void setOrderDate(
		UnsafeSupplier<Date, Exception> orderDateUnsafeSupplier) {

		orderDate = null;

		_orderDateSupplier = () -> {
			try {
				return orderDateUnsafeSupplier.get();
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
	protected Date orderDate;

	private Supplier<Date> _orderDateSupplier = () -> null;

	@Schema
	@Valid
	public OrderItem[] getOrderItems() {
		if (orderItems != null) {
			return orderItems;
		}

		orderItems = _orderItemsSupplier.get();

		return orderItems;
	}

	public void setOrderItems(OrderItem[] orderItems) {
		this.orderItems = orderItems;

		_orderItemsSupplier = () -> orderItems;
	}

	@JsonIgnore
	public void setOrderItems(
		UnsafeSupplier<OrderItem[], Exception> orderItemsUnsafeSupplier) {

		orderItems = null;

		_orderItemsSupplier = () -> {
			try {
				return orderItemsUnsafeSupplier.get();
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
	protected OrderItem[] orderItems;

	private Supplier<OrderItem[]> _orderItemsSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	public Integer getOrderStatus() {
		if (orderStatus != null) {
			return orderStatus;
		}

		orderStatus = _orderStatusSupplier.get();

		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;

		_orderStatusSupplier = () -> orderStatus;
	}

	@JsonIgnore
	public void setOrderStatus(
		UnsafeSupplier<Integer, Exception> orderStatusUnsafeSupplier) {

		orderStatus = null;

		_orderStatusSupplier = () -> {
			try {
				return orderStatusUnsafeSupplier.get();
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
	protected Integer orderStatus;

	private Supplier<Integer> _orderStatusSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String orderTypeExternalReferenceCode;

	private Supplier<String> _orderTypeExternalReferenceCodeSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long orderTypeId;

	private Supplier<Long> _orderTypeIdSupplier = () -> null;

	@Schema(example = "paypal")
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String paymentMethod;

	private Supplier<String> _paymentMethodSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
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

	@Schema(example = "Orders payment terms description")
	public String getPaymentTermDescription() {
		if (paymentTermDescription != null) {
			return paymentTermDescription;
		}

		paymentTermDescription = _paymentTermDescriptionSupplier.get();

		return paymentTermDescription;
	}

	public void setPaymentTermDescription(String paymentTermDescription) {
		this.paymentTermDescription = paymentTermDescription;

		_paymentTermDescriptionSupplier = () -> paymentTermDescription;
	}

	@JsonIgnore
	public void setPaymentTermDescription(
		UnsafeSupplier<String, Exception>
			paymentTermDescriptionUnsafeSupplier) {

		paymentTermDescription = null;

		_paymentTermDescriptionSupplier = () -> {
			try {
				return paymentTermDescriptionUnsafeSupplier.get();
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
	protected String paymentTermDescription;

	private Supplier<String> _paymentTermDescriptionSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
	public Long getPaymentTermId() {
		if (paymentTermId != null) {
			return paymentTermId;
		}

		paymentTermId = _paymentTermIdSupplier.get();

		return paymentTermId;
	}

	public void setPaymentTermId(Long paymentTermId) {
		this.paymentTermId = paymentTermId;

		_paymentTermIdSupplier = () -> paymentTermId;
	}

	@JsonIgnore
	public void setPaymentTermId(
		UnsafeSupplier<Long, Exception> paymentTermIdUnsafeSupplier) {

		paymentTermId = null;

		_paymentTermIdSupplier = () -> {
			try {
				return paymentTermIdUnsafeSupplier.get();
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
	protected Long paymentTermId;

	private Supplier<Long> _paymentTermIdSupplier = () -> null;

	@Schema(example = "Orders payment terms name")
	public String getPaymentTermName() {
		if (paymentTermName != null) {
			return paymentTermName;
		}

		paymentTermName = _paymentTermNameSupplier.get();

		return paymentTermName;
	}

	public void setPaymentTermName(String paymentTermName) {
		this.paymentTermName = paymentTermName;

		_paymentTermNameSupplier = () -> paymentTermName;
	}

	@JsonIgnore
	public void setPaymentTermName(
		UnsafeSupplier<String, Exception> paymentTermNameUnsafeSupplier) {

		paymentTermName = null;

		_paymentTermNameSupplier = () -> {
			try {
				return paymentTermNameUnsafeSupplier.get();
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
	protected String paymentTermName;

	private Supplier<String> _paymentTermNameSupplier = () -> null;

	@Schema(example = "Order printed note")
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

	@Schema(example = "Abcd1234")
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String purchaseOrderNumber;

	private Supplier<String> _purchaseOrderNumberSupplier = () -> null;

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

	@DecimalMin("0")
	@Schema(example = "12")
	@Valid
	public BigDecimal getShippingAmount() {
		if (shippingAmount != null) {
			return shippingAmount;
		}

		shippingAmount = _shippingAmountSupplier.get();

		return shippingAmount;
	}

	public void setShippingAmount(BigDecimal shippingAmount) {
		this.shippingAmount = shippingAmount;

		_shippingAmountSupplier = () -> shippingAmount;
	}

	@JsonIgnore
	public void setShippingAmount(
		UnsafeSupplier<BigDecimal, Exception> shippingAmountUnsafeSupplier) {

		shippingAmount = null;

		_shippingAmountSupplier = () -> {
			try {
				return shippingAmountUnsafeSupplier.get();
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
	protected BigDecimal shippingAmount;

	private Supplier<BigDecimal> _shippingAmountSupplier = () -> null;

	@Schema
	public String getShippingAmountFormatted() {
		if (shippingAmountFormatted != null) {
			return shippingAmountFormatted;
		}

		shippingAmountFormatted = _shippingAmountFormattedSupplier.get();

		return shippingAmountFormatted;
	}

	public void setShippingAmountFormatted(String shippingAmountFormatted) {
		this.shippingAmountFormatted = shippingAmountFormatted;

		_shippingAmountFormattedSupplier = () -> shippingAmountFormatted;
	}

	@JsonIgnore
	public void setShippingAmountFormatted(
		UnsafeSupplier<String, Exception>
			shippingAmountFormattedUnsafeSupplier) {

		shippingAmountFormatted = null;

		_shippingAmountFormattedSupplier = () -> {
			try {
				return shippingAmountFormattedUnsafeSupplier.get();
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
	protected String shippingAmountFormatted;

	private Supplier<String> _shippingAmountFormattedSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "12")
	public Double getShippingAmountValue() {
		if (shippingAmountValue != null) {
			return shippingAmountValue;
		}

		shippingAmountValue = _shippingAmountValueSupplier.get();

		return shippingAmountValue;
	}

	public void setShippingAmountValue(Double shippingAmountValue) {
		this.shippingAmountValue = shippingAmountValue;

		_shippingAmountValueSupplier = () -> shippingAmountValue;
	}

	@JsonIgnore
	public void setShippingAmountValue(
		UnsafeSupplier<Double, Exception> shippingAmountValueUnsafeSupplier) {

		shippingAmountValue = null;

		_shippingAmountValueSupplier = () -> {
			try {
				return shippingAmountValueUnsafeSupplier.get();
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
	protected Double shippingAmountValue;

	private Supplier<Double> _shippingAmountValueSupplier = () -> null;

	@Schema
	@Valid
	public BigDecimal getShippingDiscountAmount() {
		if (shippingDiscountAmount != null) {
			return shippingDiscountAmount;
		}

		shippingDiscountAmount = _shippingDiscountAmountSupplier.get();

		return shippingDiscountAmount;
	}

	public void setShippingDiscountAmount(BigDecimal shippingDiscountAmount) {
		this.shippingDiscountAmount = shippingDiscountAmount;

		_shippingDiscountAmountSupplier = () -> shippingDiscountAmount;
	}

	@JsonIgnore
	public void setShippingDiscountAmount(
		UnsafeSupplier<BigDecimal, Exception>
			shippingDiscountAmountUnsafeSupplier) {

		shippingDiscountAmount = null;

		_shippingDiscountAmountSupplier = () -> {
			try {
				return shippingDiscountAmountUnsafeSupplier.get();
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
	protected BigDecimal shippingDiscountAmount;

	private Supplier<BigDecimal> _shippingDiscountAmountSupplier = () -> null;

	@Schema
	public String getShippingDiscountAmountFormatted() {
		if (shippingDiscountAmountFormatted != null) {
			return shippingDiscountAmountFormatted;
		}

		shippingDiscountAmountFormatted =
			_shippingDiscountAmountFormattedSupplier.get();

		return shippingDiscountAmountFormatted;
	}

	public void setShippingDiscountAmountFormatted(
		String shippingDiscountAmountFormatted) {

		this.shippingDiscountAmountFormatted = shippingDiscountAmountFormatted;

		_shippingDiscountAmountFormattedSupplier =
			() -> shippingDiscountAmountFormatted;
	}

	@JsonIgnore
	public void setShippingDiscountAmountFormatted(
		UnsafeSupplier<String, Exception>
			shippingDiscountAmountFormattedUnsafeSupplier) {

		shippingDiscountAmountFormatted = null;

		_shippingDiscountAmountFormattedSupplier = () -> {
			try {
				return shippingDiscountAmountFormattedUnsafeSupplier.get();
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
	protected String shippingDiscountAmountFormatted;

	private Supplier<String> _shippingDiscountAmountFormattedSupplier =
		() -> null;

	@Schema
	public Double getShippingDiscountAmountValue() {
		if (shippingDiscountAmountValue != null) {
			return shippingDiscountAmountValue;
		}

		shippingDiscountAmountValue =
			_shippingDiscountAmountValueSupplier.get();

		return shippingDiscountAmountValue;
	}

	public void setShippingDiscountAmountValue(
		Double shippingDiscountAmountValue) {

		this.shippingDiscountAmountValue = shippingDiscountAmountValue;

		_shippingDiscountAmountValueSupplier =
			() -> shippingDiscountAmountValue;
	}

	@JsonIgnore
	public void setShippingDiscountAmountValue(
		UnsafeSupplier<Double, Exception>
			shippingDiscountAmountValueUnsafeSupplier) {

		shippingDiscountAmountValue = null;

		_shippingDiscountAmountValueSupplier = () -> {
			try {
				return shippingDiscountAmountValueUnsafeSupplier.get();
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
	protected Double shippingDiscountAmountValue;

	private Supplier<Double> _shippingDiscountAmountValueSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "20")
	@Valid
	public BigDecimal getShippingDiscountPercentageLevel1() {
		if (shippingDiscountPercentageLevel1 != null) {
			return shippingDiscountPercentageLevel1;
		}

		shippingDiscountPercentageLevel1 =
			_shippingDiscountPercentageLevel1Supplier.get();

		return shippingDiscountPercentageLevel1;
	}

	public void setShippingDiscountPercentageLevel1(
		BigDecimal shippingDiscountPercentageLevel1) {

		this.shippingDiscountPercentageLevel1 =
			shippingDiscountPercentageLevel1;

		_shippingDiscountPercentageLevel1Supplier =
			() -> shippingDiscountPercentageLevel1;
	}

	@JsonIgnore
	public void setShippingDiscountPercentageLevel1(
		UnsafeSupplier<BigDecimal, Exception>
			shippingDiscountPercentageLevel1UnsafeSupplier) {

		shippingDiscountPercentageLevel1 = null;

		_shippingDiscountPercentageLevel1Supplier = () -> {
			try {
				return shippingDiscountPercentageLevel1UnsafeSupplier.get();
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
	protected BigDecimal shippingDiscountPercentageLevel1;

	private Supplier<BigDecimal> _shippingDiscountPercentageLevel1Supplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "20")
	@Valid
	public BigDecimal getShippingDiscountPercentageLevel1WithTaxAmount() {
		if (shippingDiscountPercentageLevel1WithTaxAmount != null) {
			return shippingDiscountPercentageLevel1WithTaxAmount;
		}

		shippingDiscountPercentageLevel1WithTaxAmount =
			_shippingDiscountPercentageLevel1WithTaxAmountSupplier.get();

		return shippingDiscountPercentageLevel1WithTaxAmount;
	}

	public void setShippingDiscountPercentageLevel1WithTaxAmount(
		BigDecimal shippingDiscountPercentageLevel1WithTaxAmount) {

		this.shippingDiscountPercentageLevel1WithTaxAmount =
			shippingDiscountPercentageLevel1WithTaxAmount;

		_shippingDiscountPercentageLevel1WithTaxAmountSupplier =
			() -> shippingDiscountPercentageLevel1WithTaxAmount;
	}

	@JsonIgnore
	public void setShippingDiscountPercentageLevel1WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			shippingDiscountPercentageLevel1WithTaxAmountUnsafeSupplier) {

		shippingDiscountPercentageLevel1WithTaxAmount = null;

		_shippingDiscountPercentageLevel1WithTaxAmountSupplier = () -> {
			try {
				return shippingDiscountPercentageLevel1WithTaxAmountUnsafeSupplier.
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
	protected BigDecimal shippingDiscountPercentageLevel1WithTaxAmount;

	private Supplier<BigDecimal>
		_shippingDiscountPercentageLevel1WithTaxAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getShippingDiscountPercentageLevel2() {
		if (shippingDiscountPercentageLevel2 != null) {
			return shippingDiscountPercentageLevel2;
		}

		shippingDiscountPercentageLevel2 =
			_shippingDiscountPercentageLevel2Supplier.get();

		return shippingDiscountPercentageLevel2;
	}

	public void setShippingDiscountPercentageLevel2(
		BigDecimal shippingDiscountPercentageLevel2) {

		this.shippingDiscountPercentageLevel2 =
			shippingDiscountPercentageLevel2;

		_shippingDiscountPercentageLevel2Supplier =
			() -> shippingDiscountPercentageLevel2;
	}

	@JsonIgnore
	public void setShippingDiscountPercentageLevel2(
		UnsafeSupplier<BigDecimal, Exception>
			shippingDiscountPercentageLevel2UnsafeSupplier) {

		shippingDiscountPercentageLevel2 = null;

		_shippingDiscountPercentageLevel2Supplier = () -> {
			try {
				return shippingDiscountPercentageLevel2UnsafeSupplier.get();
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
	protected BigDecimal shippingDiscountPercentageLevel2;

	private Supplier<BigDecimal> _shippingDiscountPercentageLevel2Supplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getShippingDiscountPercentageLevel2WithTaxAmount() {
		if (shippingDiscountPercentageLevel2WithTaxAmount != null) {
			return shippingDiscountPercentageLevel2WithTaxAmount;
		}

		shippingDiscountPercentageLevel2WithTaxAmount =
			_shippingDiscountPercentageLevel2WithTaxAmountSupplier.get();

		return shippingDiscountPercentageLevel2WithTaxAmount;
	}

	public void setShippingDiscountPercentageLevel2WithTaxAmount(
		BigDecimal shippingDiscountPercentageLevel2WithTaxAmount) {

		this.shippingDiscountPercentageLevel2WithTaxAmount =
			shippingDiscountPercentageLevel2WithTaxAmount;

		_shippingDiscountPercentageLevel2WithTaxAmountSupplier =
			() -> shippingDiscountPercentageLevel2WithTaxAmount;
	}

	@JsonIgnore
	public void setShippingDiscountPercentageLevel2WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			shippingDiscountPercentageLevel2WithTaxAmountUnsafeSupplier) {

		shippingDiscountPercentageLevel2WithTaxAmount = null;

		_shippingDiscountPercentageLevel2WithTaxAmountSupplier = () -> {
			try {
				return shippingDiscountPercentageLevel2WithTaxAmountUnsafeSupplier.
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
	protected BigDecimal shippingDiscountPercentageLevel2WithTaxAmount;

	private Supplier<BigDecimal>
		_shippingDiscountPercentageLevel2WithTaxAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getShippingDiscountPercentageLevel3() {
		if (shippingDiscountPercentageLevel3 != null) {
			return shippingDiscountPercentageLevel3;
		}

		shippingDiscountPercentageLevel3 =
			_shippingDiscountPercentageLevel3Supplier.get();

		return shippingDiscountPercentageLevel3;
	}

	public void setShippingDiscountPercentageLevel3(
		BigDecimal shippingDiscountPercentageLevel3) {

		this.shippingDiscountPercentageLevel3 =
			shippingDiscountPercentageLevel3;

		_shippingDiscountPercentageLevel3Supplier =
			() -> shippingDiscountPercentageLevel3;
	}

	@JsonIgnore
	public void setShippingDiscountPercentageLevel3(
		UnsafeSupplier<BigDecimal, Exception>
			shippingDiscountPercentageLevel3UnsafeSupplier) {

		shippingDiscountPercentageLevel3 = null;

		_shippingDiscountPercentageLevel3Supplier = () -> {
			try {
				return shippingDiscountPercentageLevel3UnsafeSupplier.get();
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
	protected BigDecimal shippingDiscountPercentageLevel3;

	private Supplier<BigDecimal> _shippingDiscountPercentageLevel3Supplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getShippingDiscountPercentageLevel3WithTaxAmount() {
		if (shippingDiscountPercentageLevel3WithTaxAmount != null) {
			return shippingDiscountPercentageLevel3WithTaxAmount;
		}

		shippingDiscountPercentageLevel3WithTaxAmount =
			_shippingDiscountPercentageLevel3WithTaxAmountSupplier.get();

		return shippingDiscountPercentageLevel3WithTaxAmount;
	}

	public void setShippingDiscountPercentageLevel3WithTaxAmount(
		BigDecimal shippingDiscountPercentageLevel3WithTaxAmount) {

		this.shippingDiscountPercentageLevel3WithTaxAmount =
			shippingDiscountPercentageLevel3WithTaxAmount;

		_shippingDiscountPercentageLevel3WithTaxAmountSupplier =
			() -> shippingDiscountPercentageLevel3WithTaxAmount;
	}

	@JsonIgnore
	public void setShippingDiscountPercentageLevel3WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			shippingDiscountPercentageLevel3WithTaxAmountUnsafeSupplier) {

		shippingDiscountPercentageLevel3WithTaxAmount = null;

		_shippingDiscountPercentageLevel3WithTaxAmountSupplier = () -> {
			try {
				return shippingDiscountPercentageLevel3WithTaxAmountUnsafeSupplier.
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
	protected BigDecimal shippingDiscountPercentageLevel3WithTaxAmount;

	private Supplier<BigDecimal>
		_shippingDiscountPercentageLevel3WithTaxAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getShippingDiscountPercentageLevel4() {
		if (shippingDiscountPercentageLevel4 != null) {
			return shippingDiscountPercentageLevel4;
		}

		shippingDiscountPercentageLevel4 =
			_shippingDiscountPercentageLevel4Supplier.get();

		return shippingDiscountPercentageLevel4;
	}

	public void setShippingDiscountPercentageLevel4(
		BigDecimal shippingDiscountPercentageLevel4) {

		this.shippingDiscountPercentageLevel4 =
			shippingDiscountPercentageLevel4;

		_shippingDiscountPercentageLevel4Supplier =
			() -> shippingDiscountPercentageLevel4;
	}

	@JsonIgnore
	public void setShippingDiscountPercentageLevel4(
		UnsafeSupplier<BigDecimal, Exception>
			shippingDiscountPercentageLevel4UnsafeSupplier) {

		shippingDiscountPercentageLevel4 = null;

		_shippingDiscountPercentageLevel4Supplier = () -> {
			try {
				return shippingDiscountPercentageLevel4UnsafeSupplier.get();
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
	protected BigDecimal shippingDiscountPercentageLevel4;

	private Supplier<BigDecimal> _shippingDiscountPercentageLevel4Supplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getShippingDiscountPercentageLevel4WithTaxAmount() {
		if (shippingDiscountPercentageLevel4WithTaxAmount != null) {
			return shippingDiscountPercentageLevel4WithTaxAmount;
		}

		shippingDiscountPercentageLevel4WithTaxAmount =
			_shippingDiscountPercentageLevel4WithTaxAmountSupplier.get();

		return shippingDiscountPercentageLevel4WithTaxAmount;
	}

	public void setShippingDiscountPercentageLevel4WithTaxAmount(
		BigDecimal shippingDiscountPercentageLevel4WithTaxAmount) {

		this.shippingDiscountPercentageLevel4WithTaxAmount =
			shippingDiscountPercentageLevel4WithTaxAmount;

		_shippingDiscountPercentageLevel4WithTaxAmountSupplier =
			() -> shippingDiscountPercentageLevel4WithTaxAmount;
	}

	@JsonIgnore
	public void setShippingDiscountPercentageLevel4WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			shippingDiscountPercentageLevel4WithTaxAmountUnsafeSupplier) {

		shippingDiscountPercentageLevel4WithTaxAmount = null;

		_shippingDiscountPercentageLevel4WithTaxAmountSupplier = () -> {
			try {
				return shippingDiscountPercentageLevel4WithTaxAmountUnsafeSupplier.
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
	protected BigDecimal shippingDiscountPercentageLevel4WithTaxAmount;

	private Supplier<BigDecimal>
		_shippingDiscountPercentageLevel4WithTaxAmountSupplier = () -> null;

	@Schema
	@Valid
	public BigDecimal getShippingDiscountWithTaxAmount() {
		if (shippingDiscountWithTaxAmount != null) {
			return shippingDiscountWithTaxAmount;
		}

		shippingDiscountWithTaxAmount =
			_shippingDiscountWithTaxAmountSupplier.get();

		return shippingDiscountWithTaxAmount;
	}

	public void setShippingDiscountWithTaxAmount(
		BigDecimal shippingDiscountWithTaxAmount) {

		this.shippingDiscountWithTaxAmount = shippingDiscountWithTaxAmount;

		_shippingDiscountWithTaxAmountSupplier =
			() -> shippingDiscountWithTaxAmount;
	}

	@JsonIgnore
	public void setShippingDiscountWithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			shippingDiscountWithTaxAmountUnsafeSupplier) {

		shippingDiscountWithTaxAmount = null;

		_shippingDiscountWithTaxAmountSupplier = () -> {
			try {
				return shippingDiscountWithTaxAmountUnsafeSupplier.get();
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
	protected BigDecimal shippingDiscountWithTaxAmount;

	private Supplier<BigDecimal> _shippingDiscountWithTaxAmountSupplier =
		() -> null;

	@Schema
	public String getShippingDiscountWithTaxAmountFormatted() {
		if (shippingDiscountWithTaxAmountFormatted != null) {
			return shippingDiscountWithTaxAmountFormatted;
		}

		shippingDiscountWithTaxAmountFormatted =
			_shippingDiscountWithTaxAmountFormattedSupplier.get();

		return shippingDiscountWithTaxAmountFormatted;
	}

	public void setShippingDiscountWithTaxAmountFormatted(
		String shippingDiscountWithTaxAmountFormatted) {

		this.shippingDiscountWithTaxAmountFormatted =
			shippingDiscountWithTaxAmountFormatted;

		_shippingDiscountWithTaxAmountFormattedSupplier =
			() -> shippingDiscountWithTaxAmountFormatted;
	}

	@JsonIgnore
	public void setShippingDiscountWithTaxAmountFormatted(
		UnsafeSupplier<String, Exception>
			shippingDiscountWithTaxAmountFormattedUnsafeSupplier) {

		shippingDiscountWithTaxAmountFormatted = null;

		_shippingDiscountWithTaxAmountFormattedSupplier = () -> {
			try {
				return shippingDiscountWithTaxAmountFormattedUnsafeSupplier.
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
	protected String shippingDiscountWithTaxAmountFormatted;

	private Supplier<String> _shippingDiscountWithTaxAmountFormattedSupplier =
		() -> null;

	@Schema(example = "fixed")
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String shippingMethod;

	private Supplier<String> _shippingMethodSupplier = () -> null;

	@Schema(example = "by Air")
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String shippingOption;

	private Supplier<String> _shippingOptionSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "12")
	@Valid
	public BigDecimal getShippingWithTaxAmount() {
		if (shippingWithTaxAmount != null) {
			return shippingWithTaxAmount;
		}

		shippingWithTaxAmount = _shippingWithTaxAmountSupplier.get();

		return shippingWithTaxAmount;
	}

	public void setShippingWithTaxAmount(BigDecimal shippingWithTaxAmount) {
		this.shippingWithTaxAmount = shippingWithTaxAmount;

		_shippingWithTaxAmountSupplier = () -> shippingWithTaxAmount;
	}

	@JsonIgnore
	public void setShippingWithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			shippingWithTaxAmountUnsafeSupplier) {

		shippingWithTaxAmount = null;

		_shippingWithTaxAmountSupplier = () -> {
			try {
				return shippingWithTaxAmountUnsafeSupplier.get();
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
	protected BigDecimal shippingWithTaxAmount;

	private Supplier<BigDecimal> _shippingWithTaxAmountSupplier = () -> null;

	@Schema
	public String getShippingWithTaxAmountFormatted() {
		if (shippingWithTaxAmountFormatted != null) {
			return shippingWithTaxAmountFormatted;
		}

		shippingWithTaxAmountFormatted =
			_shippingWithTaxAmountFormattedSupplier.get();

		return shippingWithTaxAmountFormatted;
	}

	public void setShippingWithTaxAmountFormatted(
		String shippingWithTaxAmountFormatted) {

		this.shippingWithTaxAmountFormatted = shippingWithTaxAmountFormatted;

		_shippingWithTaxAmountFormattedSupplier =
			() -> shippingWithTaxAmountFormatted;
	}

	@JsonIgnore
	public void setShippingWithTaxAmountFormatted(
		UnsafeSupplier<String, Exception>
			shippingWithTaxAmountFormattedUnsafeSupplier) {

		shippingWithTaxAmountFormatted = null;

		_shippingWithTaxAmountFormattedSupplier = () -> {
			try {
				return shippingWithTaxAmountFormattedUnsafeSupplier.get();
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
	protected String shippingWithTaxAmountFormatted;

	private Supplier<String> _shippingWithTaxAmountFormattedSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "12")
	public Double getShippingWithTaxAmountValue() {
		if (shippingWithTaxAmountValue != null) {
			return shippingWithTaxAmountValue;
		}

		shippingWithTaxAmountValue = _shippingWithTaxAmountValueSupplier.get();

		return shippingWithTaxAmountValue;
	}

	public void setShippingWithTaxAmountValue(
		Double shippingWithTaxAmountValue) {

		this.shippingWithTaxAmountValue = shippingWithTaxAmountValue;

		_shippingWithTaxAmountValueSupplier = () -> shippingWithTaxAmountValue;
	}

	@JsonIgnore
	public void setShippingWithTaxAmountValue(
		UnsafeSupplier<Double, Exception>
			shippingWithTaxAmountValueUnsafeSupplier) {

		shippingWithTaxAmountValue = null;

		_shippingWithTaxAmountValueSupplier = () -> {
			try {
				return shippingWithTaxAmountValueUnsafeSupplier.get();
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
	protected Double shippingWithTaxAmountValue;

	private Supplier<Double> _shippingWithTaxAmountValueSupplier = () -> null;

	@Schema
	@Valid
	public BigDecimal getSubtotal() {
		if (subtotal != null) {
			return subtotal;
		}

		subtotal = _subtotalSupplier.get();

		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;

		_subtotalSupplier = () -> subtotal;
	}

	@JsonIgnore
	public void setSubtotal(
		UnsafeSupplier<BigDecimal, Exception> subtotalUnsafeSupplier) {

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
	protected BigDecimal subtotal;

	private Supplier<BigDecimal> _subtotalSupplier = () -> null;

	@Schema
	public Double getSubtotalAmount() {
		if (subtotalAmount != null) {
			return subtotalAmount;
		}

		subtotalAmount = _subtotalAmountSupplier.get();

		return subtotalAmount;
	}

	public void setSubtotalAmount(Double subtotalAmount) {
		this.subtotalAmount = subtotalAmount;

		_subtotalAmountSupplier = () -> subtotalAmount;
	}

	@JsonIgnore
	public void setSubtotalAmount(
		UnsafeSupplier<Double, Exception> subtotalAmountUnsafeSupplier) {

		subtotalAmount = null;

		_subtotalAmountSupplier = () -> {
			try {
				return subtotalAmountUnsafeSupplier.get();
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
	protected Double subtotalAmount;

	private Supplier<Double> _subtotalAmountSupplier = () -> null;

	@Schema
	@Valid
	public BigDecimal getSubtotalDiscountAmount() {
		if (subtotalDiscountAmount != null) {
			return subtotalDiscountAmount;
		}

		subtotalDiscountAmount = _subtotalDiscountAmountSupplier.get();

		return subtotalDiscountAmount;
	}

	public void setSubtotalDiscountAmount(BigDecimal subtotalDiscountAmount) {
		this.subtotalDiscountAmount = subtotalDiscountAmount;

		_subtotalDiscountAmountSupplier = () -> subtotalDiscountAmount;
	}

	@JsonIgnore
	public void setSubtotalDiscountAmount(
		UnsafeSupplier<BigDecimal, Exception>
			subtotalDiscountAmountUnsafeSupplier) {

		subtotalDiscountAmount = null;

		_subtotalDiscountAmountSupplier = () -> {
			try {
				return subtotalDiscountAmountUnsafeSupplier.get();
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
	protected BigDecimal subtotalDiscountAmount;

	private Supplier<BigDecimal> _subtotalDiscountAmountSupplier = () -> null;

	@Schema
	public String getSubtotalDiscountAmountFormatted() {
		if (subtotalDiscountAmountFormatted != null) {
			return subtotalDiscountAmountFormatted;
		}

		subtotalDiscountAmountFormatted =
			_subtotalDiscountAmountFormattedSupplier.get();

		return subtotalDiscountAmountFormatted;
	}

	public void setSubtotalDiscountAmountFormatted(
		String subtotalDiscountAmountFormatted) {

		this.subtotalDiscountAmountFormatted = subtotalDiscountAmountFormatted;

		_subtotalDiscountAmountFormattedSupplier =
			() -> subtotalDiscountAmountFormatted;
	}

	@JsonIgnore
	public void setSubtotalDiscountAmountFormatted(
		UnsafeSupplier<String, Exception>
			subtotalDiscountAmountFormattedUnsafeSupplier) {

		subtotalDiscountAmountFormatted = null;

		_subtotalDiscountAmountFormattedSupplier = () -> {
			try {
				return subtotalDiscountAmountFormattedUnsafeSupplier.get();
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
	protected String subtotalDiscountAmountFormatted;

	private Supplier<String> _subtotalDiscountAmountFormattedSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "20")
	@Valid
	public BigDecimal getSubtotalDiscountPercentageLevel1() {
		if (subtotalDiscountPercentageLevel1 != null) {
			return subtotalDiscountPercentageLevel1;
		}

		subtotalDiscountPercentageLevel1 =
			_subtotalDiscountPercentageLevel1Supplier.get();

		return subtotalDiscountPercentageLevel1;
	}

	public void setSubtotalDiscountPercentageLevel1(
		BigDecimal subtotalDiscountPercentageLevel1) {

		this.subtotalDiscountPercentageLevel1 =
			subtotalDiscountPercentageLevel1;

		_subtotalDiscountPercentageLevel1Supplier =
			() -> subtotalDiscountPercentageLevel1;
	}

	@JsonIgnore
	public void setSubtotalDiscountPercentageLevel1(
		UnsafeSupplier<BigDecimal, Exception>
			subtotalDiscountPercentageLevel1UnsafeSupplier) {

		subtotalDiscountPercentageLevel1 = null;

		_subtotalDiscountPercentageLevel1Supplier = () -> {
			try {
				return subtotalDiscountPercentageLevel1UnsafeSupplier.get();
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
	protected BigDecimal subtotalDiscountPercentageLevel1;

	private Supplier<BigDecimal> _subtotalDiscountPercentageLevel1Supplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "20")
	@Valid
	public BigDecimal getSubtotalDiscountPercentageLevel1WithTaxAmount() {
		if (subtotalDiscountPercentageLevel1WithTaxAmount != null) {
			return subtotalDiscountPercentageLevel1WithTaxAmount;
		}

		subtotalDiscountPercentageLevel1WithTaxAmount =
			_subtotalDiscountPercentageLevel1WithTaxAmountSupplier.get();

		return subtotalDiscountPercentageLevel1WithTaxAmount;
	}

	public void setSubtotalDiscountPercentageLevel1WithTaxAmount(
		BigDecimal subtotalDiscountPercentageLevel1WithTaxAmount) {

		this.subtotalDiscountPercentageLevel1WithTaxAmount =
			subtotalDiscountPercentageLevel1WithTaxAmount;

		_subtotalDiscountPercentageLevel1WithTaxAmountSupplier =
			() -> subtotalDiscountPercentageLevel1WithTaxAmount;
	}

	@JsonIgnore
	public void setSubtotalDiscountPercentageLevel1WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			subtotalDiscountPercentageLevel1WithTaxAmountUnsafeSupplier) {

		subtotalDiscountPercentageLevel1WithTaxAmount = null;

		_subtotalDiscountPercentageLevel1WithTaxAmountSupplier = () -> {
			try {
				return subtotalDiscountPercentageLevel1WithTaxAmountUnsafeSupplier.
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
	protected BigDecimal subtotalDiscountPercentageLevel1WithTaxAmount;

	private Supplier<BigDecimal>
		_subtotalDiscountPercentageLevel1WithTaxAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getSubtotalDiscountPercentageLevel2() {
		if (subtotalDiscountPercentageLevel2 != null) {
			return subtotalDiscountPercentageLevel2;
		}

		subtotalDiscountPercentageLevel2 =
			_subtotalDiscountPercentageLevel2Supplier.get();

		return subtotalDiscountPercentageLevel2;
	}

	public void setSubtotalDiscountPercentageLevel2(
		BigDecimal subtotalDiscountPercentageLevel2) {

		this.subtotalDiscountPercentageLevel2 =
			subtotalDiscountPercentageLevel2;

		_subtotalDiscountPercentageLevel2Supplier =
			() -> subtotalDiscountPercentageLevel2;
	}

	@JsonIgnore
	public void setSubtotalDiscountPercentageLevel2(
		UnsafeSupplier<BigDecimal, Exception>
			subtotalDiscountPercentageLevel2UnsafeSupplier) {

		subtotalDiscountPercentageLevel2 = null;

		_subtotalDiscountPercentageLevel2Supplier = () -> {
			try {
				return subtotalDiscountPercentageLevel2UnsafeSupplier.get();
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
	protected BigDecimal subtotalDiscountPercentageLevel2;

	private Supplier<BigDecimal> _subtotalDiscountPercentageLevel2Supplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getSubtotalDiscountPercentageLevel2WithTaxAmount() {
		if (subtotalDiscountPercentageLevel2WithTaxAmount != null) {
			return subtotalDiscountPercentageLevel2WithTaxAmount;
		}

		subtotalDiscountPercentageLevel2WithTaxAmount =
			_subtotalDiscountPercentageLevel2WithTaxAmountSupplier.get();

		return subtotalDiscountPercentageLevel2WithTaxAmount;
	}

	public void setSubtotalDiscountPercentageLevel2WithTaxAmount(
		BigDecimal subtotalDiscountPercentageLevel2WithTaxAmount) {

		this.subtotalDiscountPercentageLevel2WithTaxAmount =
			subtotalDiscountPercentageLevel2WithTaxAmount;

		_subtotalDiscountPercentageLevel2WithTaxAmountSupplier =
			() -> subtotalDiscountPercentageLevel2WithTaxAmount;
	}

	@JsonIgnore
	public void setSubtotalDiscountPercentageLevel2WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			subtotalDiscountPercentageLevel2WithTaxAmountUnsafeSupplier) {

		subtotalDiscountPercentageLevel2WithTaxAmount = null;

		_subtotalDiscountPercentageLevel2WithTaxAmountSupplier = () -> {
			try {
				return subtotalDiscountPercentageLevel2WithTaxAmountUnsafeSupplier.
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
	protected BigDecimal subtotalDiscountPercentageLevel2WithTaxAmount;

	private Supplier<BigDecimal>
		_subtotalDiscountPercentageLevel2WithTaxAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getSubtotalDiscountPercentageLevel3() {
		if (subtotalDiscountPercentageLevel3 != null) {
			return subtotalDiscountPercentageLevel3;
		}

		subtotalDiscountPercentageLevel3 =
			_subtotalDiscountPercentageLevel3Supplier.get();

		return subtotalDiscountPercentageLevel3;
	}

	public void setSubtotalDiscountPercentageLevel3(
		BigDecimal subtotalDiscountPercentageLevel3) {

		this.subtotalDiscountPercentageLevel3 =
			subtotalDiscountPercentageLevel3;

		_subtotalDiscountPercentageLevel3Supplier =
			() -> subtotalDiscountPercentageLevel3;
	}

	@JsonIgnore
	public void setSubtotalDiscountPercentageLevel3(
		UnsafeSupplier<BigDecimal, Exception>
			subtotalDiscountPercentageLevel3UnsafeSupplier) {

		subtotalDiscountPercentageLevel3 = null;

		_subtotalDiscountPercentageLevel3Supplier = () -> {
			try {
				return subtotalDiscountPercentageLevel3UnsafeSupplier.get();
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
	protected BigDecimal subtotalDiscountPercentageLevel3;

	private Supplier<BigDecimal> _subtotalDiscountPercentageLevel3Supplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getSubtotalDiscountPercentageLevel3WithTaxAmount() {
		if (subtotalDiscountPercentageLevel3WithTaxAmount != null) {
			return subtotalDiscountPercentageLevel3WithTaxAmount;
		}

		subtotalDiscountPercentageLevel3WithTaxAmount =
			_subtotalDiscountPercentageLevel3WithTaxAmountSupplier.get();

		return subtotalDiscountPercentageLevel3WithTaxAmount;
	}

	public void setSubtotalDiscountPercentageLevel3WithTaxAmount(
		BigDecimal subtotalDiscountPercentageLevel3WithTaxAmount) {

		this.subtotalDiscountPercentageLevel3WithTaxAmount =
			subtotalDiscountPercentageLevel3WithTaxAmount;

		_subtotalDiscountPercentageLevel3WithTaxAmountSupplier =
			() -> subtotalDiscountPercentageLevel3WithTaxAmount;
	}

	@JsonIgnore
	public void setSubtotalDiscountPercentageLevel3WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			subtotalDiscountPercentageLevel3WithTaxAmountUnsafeSupplier) {

		subtotalDiscountPercentageLevel3WithTaxAmount = null;

		_subtotalDiscountPercentageLevel3WithTaxAmountSupplier = () -> {
			try {
				return subtotalDiscountPercentageLevel3WithTaxAmountUnsafeSupplier.
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
	protected BigDecimal subtotalDiscountPercentageLevel3WithTaxAmount;

	private Supplier<BigDecimal>
		_subtotalDiscountPercentageLevel3WithTaxAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getSubtotalDiscountPercentageLevel4() {
		if (subtotalDiscountPercentageLevel4 != null) {
			return subtotalDiscountPercentageLevel4;
		}

		subtotalDiscountPercentageLevel4 =
			_subtotalDiscountPercentageLevel4Supplier.get();

		return subtotalDiscountPercentageLevel4;
	}

	public void setSubtotalDiscountPercentageLevel4(
		BigDecimal subtotalDiscountPercentageLevel4) {

		this.subtotalDiscountPercentageLevel4 =
			subtotalDiscountPercentageLevel4;

		_subtotalDiscountPercentageLevel4Supplier =
			() -> subtotalDiscountPercentageLevel4;
	}

	@JsonIgnore
	public void setSubtotalDiscountPercentageLevel4(
		UnsafeSupplier<BigDecimal, Exception>
			subtotalDiscountPercentageLevel4UnsafeSupplier) {

		subtotalDiscountPercentageLevel4 = null;

		_subtotalDiscountPercentageLevel4Supplier = () -> {
			try {
				return subtotalDiscountPercentageLevel4UnsafeSupplier.get();
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
	protected BigDecimal subtotalDiscountPercentageLevel4;

	private Supplier<BigDecimal> _subtotalDiscountPercentageLevel4Supplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getSubtotalDiscountPercentageLevel4WithTaxAmount() {
		if (subtotalDiscountPercentageLevel4WithTaxAmount != null) {
			return subtotalDiscountPercentageLevel4WithTaxAmount;
		}

		subtotalDiscountPercentageLevel4WithTaxAmount =
			_subtotalDiscountPercentageLevel4WithTaxAmountSupplier.get();

		return subtotalDiscountPercentageLevel4WithTaxAmount;
	}

	public void setSubtotalDiscountPercentageLevel4WithTaxAmount(
		BigDecimal subtotalDiscountPercentageLevel4WithTaxAmount) {

		this.subtotalDiscountPercentageLevel4WithTaxAmount =
			subtotalDiscountPercentageLevel4WithTaxAmount;

		_subtotalDiscountPercentageLevel4WithTaxAmountSupplier =
			() -> subtotalDiscountPercentageLevel4WithTaxAmount;
	}

	@JsonIgnore
	public void setSubtotalDiscountPercentageLevel4WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			subtotalDiscountPercentageLevel4WithTaxAmountUnsafeSupplier) {

		subtotalDiscountPercentageLevel4WithTaxAmount = null;

		_subtotalDiscountPercentageLevel4WithTaxAmountSupplier = () -> {
			try {
				return subtotalDiscountPercentageLevel4WithTaxAmountUnsafeSupplier.
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
	protected BigDecimal subtotalDiscountPercentageLevel4WithTaxAmount;

	private Supplier<BigDecimal>
		_subtotalDiscountPercentageLevel4WithTaxAmountSupplier = () -> null;

	@Schema
	@Valid
	public BigDecimal getSubtotalDiscountWithTaxAmount() {
		if (subtotalDiscountWithTaxAmount != null) {
			return subtotalDiscountWithTaxAmount;
		}

		subtotalDiscountWithTaxAmount =
			_subtotalDiscountWithTaxAmountSupplier.get();

		return subtotalDiscountWithTaxAmount;
	}

	public void setSubtotalDiscountWithTaxAmount(
		BigDecimal subtotalDiscountWithTaxAmount) {

		this.subtotalDiscountWithTaxAmount = subtotalDiscountWithTaxAmount;

		_subtotalDiscountWithTaxAmountSupplier =
			() -> subtotalDiscountWithTaxAmount;
	}

	@JsonIgnore
	public void setSubtotalDiscountWithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			subtotalDiscountWithTaxAmountUnsafeSupplier) {

		subtotalDiscountWithTaxAmount = null;

		_subtotalDiscountWithTaxAmountSupplier = () -> {
			try {
				return subtotalDiscountWithTaxAmountUnsafeSupplier.get();
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
	protected BigDecimal subtotalDiscountWithTaxAmount;

	private Supplier<BigDecimal> _subtotalDiscountWithTaxAmountSupplier =
		() -> null;

	@Schema
	public String getSubtotalDiscountWithTaxAmountFormatted() {
		if (subtotalDiscountWithTaxAmountFormatted != null) {
			return subtotalDiscountWithTaxAmountFormatted;
		}

		subtotalDiscountWithTaxAmountFormatted =
			_subtotalDiscountWithTaxAmountFormattedSupplier.get();

		return subtotalDiscountWithTaxAmountFormatted;
	}

	public void setSubtotalDiscountWithTaxAmountFormatted(
		String subtotalDiscountWithTaxAmountFormatted) {

		this.subtotalDiscountWithTaxAmountFormatted =
			subtotalDiscountWithTaxAmountFormatted;

		_subtotalDiscountWithTaxAmountFormattedSupplier =
			() -> subtotalDiscountWithTaxAmountFormatted;
	}

	@JsonIgnore
	public void setSubtotalDiscountWithTaxAmountFormatted(
		UnsafeSupplier<String, Exception>
			subtotalDiscountWithTaxAmountFormattedUnsafeSupplier) {

		subtotalDiscountWithTaxAmountFormatted = null;

		_subtotalDiscountWithTaxAmountFormattedSupplier = () -> {
			try {
				return subtotalDiscountWithTaxAmountFormattedUnsafeSupplier.
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
	protected String subtotalDiscountWithTaxAmountFormatted;

	private Supplier<String> _subtotalDiscountWithTaxAmountFormattedSupplier =
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
	@Valid
	public BigDecimal getSubtotalWithTaxAmount() {
		if (subtotalWithTaxAmount != null) {
			return subtotalWithTaxAmount;
		}

		subtotalWithTaxAmount = _subtotalWithTaxAmountSupplier.get();

		return subtotalWithTaxAmount;
	}

	public void setSubtotalWithTaxAmount(BigDecimal subtotalWithTaxAmount) {
		this.subtotalWithTaxAmount = subtotalWithTaxAmount;

		_subtotalWithTaxAmountSupplier = () -> subtotalWithTaxAmount;
	}

	@JsonIgnore
	public void setSubtotalWithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			subtotalWithTaxAmountUnsafeSupplier) {

		subtotalWithTaxAmount = null;

		_subtotalWithTaxAmountSupplier = () -> {
			try {
				return subtotalWithTaxAmountUnsafeSupplier.get();
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
	protected BigDecimal subtotalWithTaxAmount;

	private Supplier<BigDecimal> _subtotalWithTaxAmountSupplier = () -> null;

	@Schema
	public String getSubtotalWithTaxAmountFormatted() {
		if (subtotalWithTaxAmountFormatted != null) {
			return subtotalWithTaxAmountFormatted;
		}

		subtotalWithTaxAmountFormatted =
			_subtotalWithTaxAmountFormattedSupplier.get();

		return subtotalWithTaxAmountFormatted;
	}

	public void setSubtotalWithTaxAmountFormatted(
		String subtotalWithTaxAmountFormatted) {

		this.subtotalWithTaxAmountFormatted = subtotalWithTaxAmountFormatted;

		_subtotalWithTaxAmountFormattedSupplier =
			() -> subtotalWithTaxAmountFormatted;
	}

	@JsonIgnore
	public void setSubtotalWithTaxAmountFormatted(
		UnsafeSupplier<String, Exception>
			subtotalWithTaxAmountFormattedUnsafeSupplier) {

		subtotalWithTaxAmountFormatted = null;

		_subtotalWithTaxAmountFormattedSupplier = () -> {
			try {
				return subtotalWithTaxAmountFormattedUnsafeSupplier.get();
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
	protected String subtotalWithTaxAmountFormatted;

	private Supplier<String> _subtotalWithTaxAmountFormattedSupplier =
		() -> null;

	@Schema
	public Double getSubtotalWithTaxAmountValue() {
		if (subtotalWithTaxAmountValue != null) {
			return subtotalWithTaxAmountValue;
		}

		subtotalWithTaxAmountValue = _subtotalWithTaxAmountValueSupplier.get();

		return subtotalWithTaxAmountValue;
	}

	public void setSubtotalWithTaxAmountValue(
		Double subtotalWithTaxAmountValue) {

		this.subtotalWithTaxAmountValue = subtotalWithTaxAmountValue;

		_subtotalWithTaxAmountValueSupplier = () -> subtotalWithTaxAmountValue;
	}

	@JsonIgnore
	public void setSubtotalWithTaxAmountValue(
		UnsafeSupplier<Double, Exception>
			subtotalWithTaxAmountValueUnsafeSupplier) {

		subtotalWithTaxAmountValue = null;

		_subtotalWithTaxAmountValueSupplier = () -> {
			try {
				return subtotalWithTaxAmountValueUnsafeSupplier.get();
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
	protected Double subtotalWithTaxAmountValue;

	private Supplier<Double> _subtotalWithTaxAmountValueSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "11")
	@Valid
	public BigDecimal getTaxAmount() {
		if (taxAmount != null) {
			return taxAmount;
		}

		taxAmount = _taxAmountSupplier.get();

		return taxAmount;
	}

	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;

		_taxAmountSupplier = () -> taxAmount;
	}

	@JsonIgnore
	public void setTaxAmount(
		UnsafeSupplier<BigDecimal, Exception> taxAmountUnsafeSupplier) {

		taxAmount = null;

		_taxAmountSupplier = () -> {
			try {
				return taxAmountUnsafeSupplier.get();
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
	protected BigDecimal taxAmount;

	private Supplier<BigDecimal> _taxAmountSupplier = () -> null;

	@Schema
	public String getTaxAmountFormatted() {
		if (taxAmountFormatted != null) {
			return taxAmountFormatted;
		}

		taxAmountFormatted = _taxAmountFormattedSupplier.get();

		return taxAmountFormatted;
	}

	public void setTaxAmountFormatted(String taxAmountFormatted) {
		this.taxAmountFormatted = taxAmountFormatted;

		_taxAmountFormattedSupplier = () -> taxAmountFormatted;
	}

	@JsonIgnore
	public void setTaxAmountFormatted(
		UnsafeSupplier<String, Exception> taxAmountFormattedUnsafeSupplier) {

		taxAmountFormatted = null;

		_taxAmountFormattedSupplier = () -> {
			try {
				return taxAmountFormattedUnsafeSupplier.get();
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
	protected String taxAmountFormatted;

	private Supplier<String> _taxAmountFormattedSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "12")
	public Double getTaxAmountValue() {
		if (taxAmountValue != null) {
			return taxAmountValue;
		}

		taxAmountValue = _taxAmountValueSupplier.get();

		return taxAmountValue;
	}

	public void setTaxAmountValue(Double taxAmountValue) {
		this.taxAmountValue = taxAmountValue;

		_taxAmountValueSupplier = () -> taxAmountValue;
	}

	@JsonIgnore
	public void setTaxAmountValue(
		UnsafeSupplier<Double, Exception> taxAmountValueUnsafeSupplier) {

		taxAmountValue = null;

		_taxAmountValueSupplier = () -> {
			try {
				return taxAmountValueUnsafeSupplier.get();
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
	protected Double taxAmountValue;

	private Supplier<Double> _taxAmountValueSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "113")
	@Valid
	public BigDecimal getTotal() {
		if (total != null) {
			return total;
		}

		total = _totalSupplier.get();

		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;

		_totalSupplier = () -> total;
	}

	@JsonIgnore
	public void setTotal(
		UnsafeSupplier<BigDecimal, Exception> totalUnsafeSupplier) {

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
	protected BigDecimal total;

	private Supplier<BigDecimal> _totalSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "113")
	public Double getTotalAmount() {
		if (totalAmount != null) {
			return totalAmount;
		}

		totalAmount = _totalAmountSupplier.get();

		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;

		_totalAmountSupplier = () -> totalAmount;
	}

	@JsonIgnore
	public void setTotalAmount(
		UnsafeSupplier<Double, Exception> totalAmountUnsafeSupplier) {

		totalAmount = null;

		_totalAmountSupplier = () -> {
			try {
				return totalAmountUnsafeSupplier.get();
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
	protected Double totalAmount;

	private Supplier<Double> _totalAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "11")
	@Valid
	public BigDecimal getTotalDiscountAmount() {
		if (totalDiscountAmount != null) {
			return totalDiscountAmount;
		}

		totalDiscountAmount = _totalDiscountAmountSupplier.get();

		return totalDiscountAmount;
	}

	public void setTotalDiscountAmount(BigDecimal totalDiscountAmount) {
		this.totalDiscountAmount = totalDiscountAmount;

		_totalDiscountAmountSupplier = () -> totalDiscountAmount;
	}

	@JsonIgnore
	public void setTotalDiscountAmount(
		UnsafeSupplier<BigDecimal, Exception>
			totalDiscountAmountUnsafeSupplier) {

		totalDiscountAmount = null;

		_totalDiscountAmountSupplier = () -> {
			try {
				return totalDiscountAmountUnsafeSupplier.get();
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
	protected BigDecimal totalDiscountAmount;

	private Supplier<BigDecimal> _totalDiscountAmountSupplier = () -> null;

	@Schema
	public String getTotalDiscountAmountFormatted() {
		if (totalDiscountAmountFormatted != null) {
			return totalDiscountAmountFormatted;
		}

		totalDiscountAmountFormatted =
			_totalDiscountAmountFormattedSupplier.get();

		return totalDiscountAmountFormatted;
	}

	public void setTotalDiscountAmountFormatted(
		String totalDiscountAmountFormatted) {

		this.totalDiscountAmountFormatted = totalDiscountAmountFormatted;

		_totalDiscountAmountFormattedSupplier =
			() -> totalDiscountAmountFormatted;
	}

	@JsonIgnore
	public void setTotalDiscountAmountFormatted(
		UnsafeSupplier<String, Exception>
			totalDiscountAmountFormattedUnsafeSupplier) {

		totalDiscountAmountFormatted = null;

		_totalDiscountAmountFormattedSupplier = () -> {
			try {
				return totalDiscountAmountFormattedUnsafeSupplier.get();
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
	protected String totalDiscountAmountFormatted;

	private Supplier<String> _totalDiscountAmountFormattedSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "11")
	public Double getTotalDiscountAmountValue() {
		if (totalDiscountAmountValue != null) {
			return totalDiscountAmountValue;
		}

		totalDiscountAmountValue = _totalDiscountAmountValueSupplier.get();

		return totalDiscountAmountValue;
	}

	public void setTotalDiscountAmountValue(Double totalDiscountAmountValue) {
		this.totalDiscountAmountValue = totalDiscountAmountValue;

		_totalDiscountAmountValueSupplier = () -> totalDiscountAmountValue;
	}

	@JsonIgnore
	public void setTotalDiscountAmountValue(
		UnsafeSupplier<Double, Exception>
			totalDiscountAmountValueUnsafeSupplier) {

		totalDiscountAmountValue = null;

		_totalDiscountAmountValueSupplier = () -> {
			try {
				return totalDiscountAmountValueUnsafeSupplier.get();
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
	protected Double totalDiscountAmountValue;

	private Supplier<Double> _totalDiscountAmountValueSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "20")
	@Valid
	public BigDecimal getTotalDiscountPercentageLevel1() {
		if (totalDiscountPercentageLevel1 != null) {
			return totalDiscountPercentageLevel1;
		}

		totalDiscountPercentageLevel1 =
			_totalDiscountPercentageLevel1Supplier.get();

		return totalDiscountPercentageLevel1;
	}

	public void setTotalDiscountPercentageLevel1(
		BigDecimal totalDiscountPercentageLevel1) {

		this.totalDiscountPercentageLevel1 = totalDiscountPercentageLevel1;

		_totalDiscountPercentageLevel1Supplier =
			() -> totalDiscountPercentageLevel1;
	}

	@JsonIgnore
	public void setTotalDiscountPercentageLevel1(
		UnsafeSupplier<BigDecimal, Exception>
			totalDiscountPercentageLevel1UnsafeSupplier) {

		totalDiscountPercentageLevel1 = null;

		_totalDiscountPercentageLevel1Supplier = () -> {
			try {
				return totalDiscountPercentageLevel1UnsafeSupplier.get();
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
	protected BigDecimal totalDiscountPercentageLevel1;

	private Supplier<BigDecimal> _totalDiscountPercentageLevel1Supplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "20")
	@Valid
	public BigDecimal getTotalDiscountPercentageLevel1WithTaxAmount() {
		if (totalDiscountPercentageLevel1WithTaxAmount != null) {
			return totalDiscountPercentageLevel1WithTaxAmount;
		}

		totalDiscountPercentageLevel1WithTaxAmount =
			_totalDiscountPercentageLevel1WithTaxAmountSupplier.get();

		return totalDiscountPercentageLevel1WithTaxAmount;
	}

	public void setTotalDiscountPercentageLevel1WithTaxAmount(
		BigDecimal totalDiscountPercentageLevel1WithTaxAmount) {

		this.totalDiscountPercentageLevel1WithTaxAmount =
			totalDiscountPercentageLevel1WithTaxAmount;

		_totalDiscountPercentageLevel1WithTaxAmountSupplier =
			() -> totalDiscountPercentageLevel1WithTaxAmount;
	}

	@JsonIgnore
	public void setTotalDiscountPercentageLevel1WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			totalDiscountPercentageLevel1WithTaxAmountUnsafeSupplier) {

		totalDiscountPercentageLevel1WithTaxAmount = null;

		_totalDiscountPercentageLevel1WithTaxAmountSupplier = () -> {
			try {
				return totalDiscountPercentageLevel1WithTaxAmountUnsafeSupplier.
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
	protected BigDecimal totalDiscountPercentageLevel1WithTaxAmount;

	private Supplier<BigDecimal>
		_totalDiscountPercentageLevel1WithTaxAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getTotalDiscountPercentageLevel2() {
		if (totalDiscountPercentageLevel2 != null) {
			return totalDiscountPercentageLevel2;
		}

		totalDiscountPercentageLevel2 =
			_totalDiscountPercentageLevel2Supplier.get();

		return totalDiscountPercentageLevel2;
	}

	public void setTotalDiscountPercentageLevel2(
		BigDecimal totalDiscountPercentageLevel2) {

		this.totalDiscountPercentageLevel2 = totalDiscountPercentageLevel2;

		_totalDiscountPercentageLevel2Supplier =
			() -> totalDiscountPercentageLevel2;
	}

	@JsonIgnore
	public void setTotalDiscountPercentageLevel2(
		UnsafeSupplier<BigDecimal, Exception>
			totalDiscountPercentageLevel2UnsafeSupplier) {

		totalDiscountPercentageLevel2 = null;

		_totalDiscountPercentageLevel2Supplier = () -> {
			try {
				return totalDiscountPercentageLevel2UnsafeSupplier.get();
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
	protected BigDecimal totalDiscountPercentageLevel2;

	private Supplier<BigDecimal> _totalDiscountPercentageLevel2Supplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getTotalDiscountPercentageLevel2WithTaxAmount() {
		if (totalDiscountPercentageLevel2WithTaxAmount != null) {
			return totalDiscountPercentageLevel2WithTaxAmount;
		}

		totalDiscountPercentageLevel2WithTaxAmount =
			_totalDiscountPercentageLevel2WithTaxAmountSupplier.get();

		return totalDiscountPercentageLevel2WithTaxAmount;
	}

	public void setTotalDiscountPercentageLevel2WithTaxAmount(
		BigDecimal totalDiscountPercentageLevel2WithTaxAmount) {

		this.totalDiscountPercentageLevel2WithTaxAmount =
			totalDiscountPercentageLevel2WithTaxAmount;

		_totalDiscountPercentageLevel2WithTaxAmountSupplier =
			() -> totalDiscountPercentageLevel2WithTaxAmount;
	}

	@JsonIgnore
	public void setTotalDiscountPercentageLevel2WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			totalDiscountPercentageLevel2WithTaxAmountUnsafeSupplier) {

		totalDiscountPercentageLevel2WithTaxAmount = null;

		_totalDiscountPercentageLevel2WithTaxAmountSupplier = () -> {
			try {
				return totalDiscountPercentageLevel2WithTaxAmountUnsafeSupplier.
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
	protected BigDecimal totalDiscountPercentageLevel2WithTaxAmount;

	private Supplier<BigDecimal>
		_totalDiscountPercentageLevel2WithTaxAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getTotalDiscountPercentageLevel3() {
		if (totalDiscountPercentageLevel3 != null) {
			return totalDiscountPercentageLevel3;
		}

		totalDiscountPercentageLevel3 =
			_totalDiscountPercentageLevel3Supplier.get();

		return totalDiscountPercentageLevel3;
	}

	public void setTotalDiscountPercentageLevel3(
		BigDecimal totalDiscountPercentageLevel3) {

		this.totalDiscountPercentageLevel3 = totalDiscountPercentageLevel3;

		_totalDiscountPercentageLevel3Supplier =
			() -> totalDiscountPercentageLevel3;
	}

	@JsonIgnore
	public void setTotalDiscountPercentageLevel3(
		UnsafeSupplier<BigDecimal, Exception>
			totalDiscountPercentageLevel3UnsafeSupplier) {

		totalDiscountPercentageLevel3 = null;

		_totalDiscountPercentageLevel3Supplier = () -> {
			try {
				return totalDiscountPercentageLevel3UnsafeSupplier.get();
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
	protected BigDecimal totalDiscountPercentageLevel3;

	private Supplier<BigDecimal> _totalDiscountPercentageLevel3Supplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getTotalDiscountPercentageLevel3WithTaxAmount() {
		if (totalDiscountPercentageLevel3WithTaxAmount != null) {
			return totalDiscountPercentageLevel3WithTaxAmount;
		}

		totalDiscountPercentageLevel3WithTaxAmount =
			_totalDiscountPercentageLevel3WithTaxAmountSupplier.get();

		return totalDiscountPercentageLevel3WithTaxAmount;
	}

	public void setTotalDiscountPercentageLevel3WithTaxAmount(
		BigDecimal totalDiscountPercentageLevel3WithTaxAmount) {

		this.totalDiscountPercentageLevel3WithTaxAmount =
			totalDiscountPercentageLevel3WithTaxAmount;

		_totalDiscountPercentageLevel3WithTaxAmountSupplier =
			() -> totalDiscountPercentageLevel3WithTaxAmount;
	}

	@JsonIgnore
	public void setTotalDiscountPercentageLevel3WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			totalDiscountPercentageLevel3WithTaxAmountUnsafeSupplier) {

		totalDiscountPercentageLevel3WithTaxAmount = null;

		_totalDiscountPercentageLevel3WithTaxAmountSupplier = () -> {
			try {
				return totalDiscountPercentageLevel3WithTaxAmountUnsafeSupplier.
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
	protected BigDecimal totalDiscountPercentageLevel3WithTaxAmount;

	private Supplier<BigDecimal>
		_totalDiscountPercentageLevel3WithTaxAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getTotalDiscountPercentageLevel4() {
		if (totalDiscountPercentageLevel4 != null) {
			return totalDiscountPercentageLevel4;
		}

		totalDiscountPercentageLevel4 =
			_totalDiscountPercentageLevel4Supplier.get();

		return totalDiscountPercentageLevel4;
	}

	public void setTotalDiscountPercentageLevel4(
		BigDecimal totalDiscountPercentageLevel4) {

		this.totalDiscountPercentageLevel4 = totalDiscountPercentageLevel4;

		_totalDiscountPercentageLevel4Supplier =
			() -> totalDiscountPercentageLevel4;
	}

	@JsonIgnore
	public void setTotalDiscountPercentageLevel4(
		UnsafeSupplier<BigDecimal, Exception>
			totalDiscountPercentageLevel4UnsafeSupplier) {

		totalDiscountPercentageLevel4 = null;

		_totalDiscountPercentageLevel4Supplier = () -> {
			try {
				return totalDiscountPercentageLevel4UnsafeSupplier.get();
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
	protected BigDecimal totalDiscountPercentageLevel4;

	private Supplier<BigDecimal> _totalDiscountPercentageLevel4Supplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getTotalDiscountPercentageLevel4WithTaxAmount() {
		if (totalDiscountPercentageLevel4WithTaxAmount != null) {
			return totalDiscountPercentageLevel4WithTaxAmount;
		}

		totalDiscountPercentageLevel4WithTaxAmount =
			_totalDiscountPercentageLevel4WithTaxAmountSupplier.get();

		return totalDiscountPercentageLevel4WithTaxAmount;
	}

	public void setTotalDiscountPercentageLevel4WithTaxAmount(
		BigDecimal totalDiscountPercentageLevel4WithTaxAmount) {

		this.totalDiscountPercentageLevel4WithTaxAmount =
			totalDiscountPercentageLevel4WithTaxAmount;

		_totalDiscountPercentageLevel4WithTaxAmountSupplier =
			() -> totalDiscountPercentageLevel4WithTaxAmount;
	}

	@JsonIgnore
	public void setTotalDiscountPercentageLevel4WithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			totalDiscountPercentageLevel4WithTaxAmountUnsafeSupplier) {

		totalDiscountPercentageLevel4WithTaxAmount = null;

		_totalDiscountPercentageLevel4WithTaxAmountSupplier = () -> {
			try {
				return totalDiscountPercentageLevel4WithTaxAmountUnsafeSupplier.
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
	protected BigDecimal totalDiscountPercentageLevel4WithTaxAmount;

	private Supplier<BigDecimal>
		_totalDiscountPercentageLevel4WithTaxAmountSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "11")
	@Valid
	public BigDecimal getTotalDiscountWithTaxAmount() {
		if (totalDiscountWithTaxAmount != null) {
			return totalDiscountWithTaxAmount;
		}

		totalDiscountWithTaxAmount = _totalDiscountWithTaxAmountSupplier.get();

		return totalDiscountWithTaxAmount;
	}

	public void setTotalDiscountWithTaxAmount(
		BigDecimal totalDiscountWithTaxAmount) {

		this.totalDiscountWithTaxAmount = totalDiscountWithTaxAmount;

		_totalDiscountWithTaxAmountSupplier = () -> totalDiscountWithTaxAmount;
	}

	@JsonIgnore
	public void setTotalDiscountWithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			totalDiscountWithTaxAmountUnsafeSupplier) {

		totalDiscountWithTaxAmount = null;

		_totalDiscountWithTaxAmountSupplier = () -> {
			try {
				return totalDiscountWithTaxAmountUnsafeSupplier.get();
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
	protected BigDecimal totalDiscountWithTaxAmount;

	private Supplier<BigDecimal> _totalDiscountWithTaxAmountSupplier =
		() -> null;

	@Schema
	public String getTotalDiscountWithTaxAmountFormatted() {
		if (totalDiscountWithTaxAmountFormatted != null) {
			return totalDiscountWithTaxAmountFormatted;
		}

		totalDiscountWithTaxAmountFormatted =
			_totalDiscountWithTaxAmountFormattedSupplier.get();

		return totalDiscountWithTaxAmountFormatted;
	}

	public void setTotalDiscountWithTaxAmountFormatted(
		String totalDiscountWithTaxAmountFormatted) {

		this.totalDiscountWithTaxAmountFormatted =
			totalDiscountWithTaxAmountFormatted;

		_totalDiscountWithTaxAmountFormattedSupplier =
			() -> totalDiscountWithTaxAmountFormatted;
	}

	@JsonIgnore
	public void setTotalDiscountWithTaxAmountFormatted(
		UnsafeSupplier<String, Exception>
			totalDiscountWithTaxAmountFormattedUnsafeSupplier) {

		totalDiscountWithTaxAmountFormatted = null;

		_totalDiscountWithTaxAmountFormattedSupplier = () -> {
			try {
				return totalDiscountWithTaxAmountFormattedUnsafeSupplier.get();
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
	protected String totalDiscountWithTaxAmountFormatted;

	private Supplier<String> _totalDiscountWithTaxAmountFormattedSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "11")
	public Double getTotalDiscountWithTaxAmountValue() {
		if (totalDiscountWithTaxAmountValue != null) {
			return totalDiscountWithTaxAmountValue;
		}

		totalDiscountWithTaxAmountValue =
			_totalDiscountWithTaxAmountValueSupplier.get();

		return totalDiscountWithTaxAmountValue;
	}

	public void setTotalDiscountWithTaxAmountValue(
		Double totalDiscountWithTaxAmountValue) {

		this.totalDiscountWithTaxAmountValue = totalDiscountWithTaxAmountValue;

		_totalDiscountWithTaxAmountValueSupplier =
			() -> totalDiscountWithTaxAmountValue;
	}

	@JsonIgnore
	public void setTotalDiscountWithTaxAmountValue(
		UnsafeSupplier<Double, Exception>
			totalDiscountWithTaxAmountValueUnsafeSupplier) {

		totalDiscountWithTaxAmountValue = null;

		_totalDiscountWithTaxAmountValueSupplier = () -> {
			try {
				return totalDiscountWithTaxAmountValueUnsafeSupplier.get();
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
	protected Double totalDiscountWithTaxAmountValue;

	private Supplier<Double> _totalDiscountWithTaxAmountValueSupplier =
		() -> null;

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

	@DecimalMin("0")
	@Schema(example = "113")
	@Valid
	public BigDecimal getTotalWithTaxAmount() {
		if (totalWithTaxAmount != null) {
			return totalWithTaxAmount;
		}

		totalWithTaxAmount = _totalWithTaxAmountSupplier.get();

		return totalWithTaxAmount;
	}

	public void setTotalWithTaxAmount(BigDecimal totalWithTaxAmount) {
		this.totalWithTaxAmount = totalWithTaxAmount;

		_totalWithTaxAmountSupplier = () -> totalWithTaxAmount;
	}

	@JsonIgnore
	public void setTotalWithTaxAmount(
		UnsafeSupplier<BigDecimal, Exception>
			totalWithTaxAmountUnsafeSupplier) {

		totalWithTaxAmount = null;

		_totalWithTaxAmountSupplier = () -> {
			try {
				return totalWithTaxAmountUnsafeSupplier.get();
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
	protected BigDecimal totalWithTaxAmount;

	private Supplier<BigDecimal> _totalWithTaxAmountSupplier = () -> null;

	@Schema
	public String getTotalWithTaxAmountFormatted() {
		if (totalWithTaxAmountFormatted != null) {
			return totalWithTaxAmountFormatted;
		}

		totalWithTaxAmountFormatted =
			_totalWithTaxAmountFormattedSupplier.get();

		return totalWithTaxAmountFormatted;
	}

	public void setTotalWithTaxAmountFormatted(
		String totalWithTaxAmountFormatted) {

		this.totalWithTaxAmountFormatted = totalWithTaxAmountFormatted;

		_totalWithTaxAmountFormattedSupplier =
			() -> totalWithTaxAmountFormatted;
	}

	@JsonIgnore
	public void setTotalWithTaxAmountFormatted(
		UnsafeSupplier<String, Exception>
			totalWithTaxAmountFormattedUnsafeSupplier) {

		totalWithTaxAmountFormatted = null;

		_totalWithTaxAmountFormattedSupplier = () -> {
			try {
				return totalWithTaxAmountFormattedUnsafeSupplier.get();
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
	protected String totalWithTaxAmountFormatted;

	private Supplier<String> _totalWithTaxAmountFormattedSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "113")
	public Double getTotalWithTaxAmountValue() {
		if (totalWithTaxAmountValue != null) {
			return totalWithTaxAmountValue;
		}

		totalWithTaxAmountValue = _totalWithTaxAmountValueSupplier.get();

		return totalWithTaxAmountValue;
	}

	public void setTotalWithTaxAmountValue(Double totalWithTaxAmountValue) {
		this.totalWithTaxAmountValue = totalWithTaxAmountValue;

		_totalWithTaxAmountValueSupplier = () -> totalWithTaxAmountValue;
	}

	@JsonIgnore
	public void setTotalWithTaxAmountValue(
		UnsafeSupplier<Double, Exception>
			totalWithTaxAmountValueUnsafeSupplier) {

		totalWithTaxAmountValue = null;

		_totalWithTaxAmountValueSupplier = () -> {
			try {
				return totalWithTaxAmountValueUnsafeSupplier.get();
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
	protected Double totalWithTaxAmountValue;

	private Supplier<Double> _totalWithTaxAmountValueSupplier = () -> null;

	@Schema
	public String getTransactionId() {
		if (transactionId != null) {
			return transactionId;
		}

		transactionId = _transactionIdSupplier.get();

		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;

		_transactionIdSupplier = () -> transactionId;
	}

	@JsonIgnore
	public void setTransactionId(
		UnsafeSupplier<String, Exception> transactionIdUnsafeSupplier) {

		transactionId = null;

		_transactionIdSupplier = () -> {
			try {
				return transactionIdUnsafeSupplier.get();
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
	protected String transactionId;

	private Supplier<String> _transactionIdSupplier = () -> null;

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

		if (!(object instanceof Order)) {
			return false;
		}

		Order order = (Order)object;

		return Objects.equals(toString(), order.toString());
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

			sb.append(String.valueOf(account));
		}

		if (accountExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(accountExternalReferenceCode));

			sb.append("\"");
		}

		if (accountId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountId\": ");

			sb.append(accountId);
		}

		if (actions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actions\": ");

			sb.append(_toJSON(actions));
		}

		if (advanceStatus != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"advanceStatus\": ");

			sb.append("\"");

			sb.append(_escape(advanceStatus));

			sb.append("\"");
		}

		if (billingAddress != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"billingAddress\": ");

			sb.append(String.valueOf(billingAddress));
		}

		if (billingAddressId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"billingAddressId\": ");

			sb.append(billingAddressId);
		}

		if (channel != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"channel\": ");

			sb.append(String.valueOf(channel));
		}

		if (channelExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"channelExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(channelExternalReferenceCode));

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

		if (creatorEmailAddress != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"creatorEmailAddress\": ");

			sb.append("\"");

			sb.append(_escape(creatorEmailAddress));

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

		if (deliveryTermDescription != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"deliveryTermDescription\": ");

			sb.append("\"");

			sb.append(_escape(deliveryTermDescription));

			sb.append("\"");
		}

		if (deliveryTermId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"deliveryTermId\": ");

			sb.append(deliveryTermId);
		}

		if (deliveryTermName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"deliveryTermName\": ");

			sb.append("\"");

			sb.append(_escape(deliveryTermName));

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

		if (orderDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(orderDate));

			sb.append("\"");
		}

		if (orderItems != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderItems\": ");

			sb.append("[");

			for (int i = 0; i < orderItems.length; i++) {
				sb.append(String.valueOf(orderItems[i]));

				if ((i + 1) < orderItems.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (orderStatus != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderStatus\": ");

			sb.append(orderStatus);
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

		if (paymentMethod != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paymentMethod\": ");

			sb.append("\"");

			sb.append(_escape(paymentMethod));

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

		if (paymentTermDescription != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paymentTermDescription\": ");

			sb.append("\"");

			sb.append(_escape(paymentTermDescription));

			sb.append("\"");
		}

		if (paymentTermId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paymentTermId\": ");

			sb.append(paymentTermId);
		}

		if (paymentTermName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paymentTermName\": ");

			sb.append("\"");

			sb.append(_escape(paymentTermName));

			sb.append("\"");
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

		if (requestedDeliveryDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"requestedDeliveryDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(requestedDeliveryDate));

			sb.append("\"");
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

		if (shippingAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingAmount\": ");

			sb.append(shippingAmount);
		}

		if (shippingAmountFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingAmountFormatted\": ");

			sb.append("\"");

			sb.append(_escape(shippingAmountFormatted));

			sb.append("\"");
		}

		if (shippingAmountValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingAmountValue\": ");

			sb.append(shippingAmountValue);
		}

		if (shippingDiscountAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountAmount\": ");

			sb.append(shippingDiscountAmount);
		}

		if (shippingDiscountAmountFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountAmountFormatted\": ");

			sb.append("\"");

			sb.append(_escape(shippingDiscountAmountFormatted));

			sb.append("\"");
		}

		if (shippingDiscountAmountValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountAmountValue\": ");

			sb.append(shippingDiscountAmountValue);
		}

		if (shippingDiscountPercentageLevel1 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountPercentageLevel1\": ");

			sb.append(shippingDiscountPercentageLevel1);
		}

		if (shippingDiscountPercentageLevel1WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountPercentageLevel1WithTaxAmount\": ");

			sb.append(shippingDiscountPercentageLevel1WithTaxAmount);
		}

		if (shippingDiscountPercentageLevel2 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountPercentageLevel2\": ");

			sb.append(shippingDiscountPercentageLevel2);
		}

		if (shippingDiscountPercentageLevel2WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountPercentageLevel2WithTaxAmount\": ");

			sb.append(shippingDiscountPercentageLevel2WithTaxAmount);
		}

		if (shippingDiscountPercentageLevel3 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountPercentageLevel3\": ");

			sb.append(shippingDiscountPercentageLevel3);
		}

		if (shippingDiscountPercentageLevel3WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountPercentageLevel3WithTaxAmount\": ");

			sb.append(shippingDiscountPercentageLevel3WithTaxAmount);
		}

		if (shippingDiscountPercentageLevel4 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountPercentageLevel4\": ");

			sb.append(shippingDiscountPercentageLevel4);
		}

		if (shippingDiscountPercentageLevel4WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountPercentageLevel4WithTaxAmount\": ");

			sb.append(shippingDiscountPercentageLevel4WithTaxAmount);
		}

		if (shippingDiscountWithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountWithTaxAmount\": ");

			sb.append(shippingDiscountWithTaxAmount);
		}

		if (shippingDiscountWithTaxAmountFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingDiscountWithTaxAmountFormatted\": ");

			sb.append("\"");

			sb.append(_escape(shippingDiscountWithTaxAmountFormatted));

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

		if (shippingWithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingWithTaxAmount\": ");

			sb.append(shippingWithTaxAmount);
		}

		if (shippingWithTaxAmountFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingWithTaxAmountFormatted\": ");

			sb.append("\"");

			sb.append(_escape(shippingWithTaxAmountFormatted));

			sb.append("\"");
		}

		if (shippingWithTaxAmountValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingWithTaxAmountValue\": ");

			sb.append(shippingWithTaxAmountValue);
		}

		if (subtotal != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotal\": ");

			sb.append(subtotal);
		}

		if (subtotalAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalAmount\": ");

			sb.append(subtotalAmount);
		}

		if (subtotalDiscountAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalDiscountAmount\": ");

			sb.append(subtotalDiscountAmount);
		}

		if (subtotalDiscountAmountFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalDiscountAmountFormatted\": ");

			sb.append("\"");

			sb.append(_escape(subtotalDiscountAmountFormatted));

			sb.append("\"");
		}

		if (subtotalDiscountPercentageLevel1 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalDiscountPercentageLevel1\": ");

			sb.append(subtotalDiscountPercentageLevel1);
		}

		if (subtotalDiscountPercentageLevel1WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalDiscountPercentageLevel1WithTaxAmount\": ");

			sb.append(subtotalDiscountPercentageLevel1WithTaxAmount);
		}

		if (subtotalDiscountPercentageLevel2 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalDiscountPercentageLevel2\": ");

			sb.append(subtotalDiscountPercentageLevel2);
		}

		if (subtotalDiscountPercentageLevel2WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalDiscountPercentageLevel2WithTaxAmount\": ");

			sb.append(subtotalDiscountPercentageLevel2WithTaxAmount);
		}

		if (subtotalDiscountPercentageLevel3 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalDiscountPercentageLevel3\": ");

			sb.append(subtotalDiscountPercentageLevel3);
		}

		if (subtotalDiscountPercentageLevel3WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalDiscountPercentageLevel3WithTaxAmount\": ");

			sb.append(subtotalDiscountPercentageLevel3WithTaxAmount);
		}

		if (subtotalDiscountPercentageLevel4 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalDiscountPercentageLevel4\": ");

			sb.append(subtotalDiscountPercentageLevel4);
		}

		if (subtotalDiscountPercentageLevel4WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalDiscountPercentageLevel4WithTaxAmount\": ");

			sb.append(subtotalDiscountPercentageLevel4WithTaxAmount);
		}

		if (subtotalDiscountWithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalDiscountWithTaxAmount\": ");

			sb.append(subtotalDiscountWithTaxAmount);
		}

		if (subtotalDiscountWithTaxAmountFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalDiscountWithTaxAmountFormatted\": ");

			sb.append("\"");

			sb.append(_escape(subtotalDiscountWithTaxAmountFormatted));

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

		if (subtotalWithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalWithTaxAmount\": ");

			sb.append(subtotalWithTaxAmount);
		}

		if (subtotalWithTaxAmountFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalWithTaxAmountFormatted\": ");

			sb.append("\"");

			sb.append(_escape(subtotalWithTaxAmountFormatted));

			sb.append("\"");
		}

		if (subtotalWithTaxAmountValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subtotalWithTaxAmountValue\": ");

			sb.append(subtotalWithTaxAmountValue);
		}

		if (taxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"taxAmount\": ");

			sb.append(taxAmount);
		}

		if (taxAmountFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"taxAmountFormatted\": ");

			sb.append("\"");

			sb.append(_escape(taxAmountFormatted));

			sb.append("\"");
		}

		if (taxAmountValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"taxAmountValue\": ");

			sb.append(taxAmountValue);
		}

		if (total != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"total\": ");

			sb.append(total);
		}

		if (totalAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalAmount\": ");

			sb.append(totalAmount);
		}

		if (totalDiscountAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountAmount\": ");

			sb.append(totalDiscountAmount);
		}

		if (totalDiscountAmountFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountAmountFormatted\": ");

			sb.append("\"");

			sb.append(_escape(totalDiscountAmountFormatted));

			sb.append("\"");
		}

		if (totalDiscountAmountValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountAmountValue\": ");

			sb.append(totalDiscountAmountValue);
		}

		if (totalDiscountPercentageLevel1 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountPercentageLevel1\": ");

			sb.append(totalDiscountPercentageLevel1);
		}

		if (totalDiscountPercentageLevel1WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountPercentageLevel1WithTaxAmount\": ");

			sb.append(totalDiscountPercentageLevel1WithTaxAmount);
		}

		if (totalDiscountPercentageLevel2 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountPercentageLevel2\": ");

			sb.append(totalDiscountPercentageLevel2);
		}

		if (totalDiscountPercentageLevel2WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountPercentageLevel2WithTaxAmount\": ");

			sb.append(totalDiscountPercentageLevel2WithTaxAmount);
		}

		if (totalDiscountPercentageLevel3 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountPercentageLevel3\": ");

			sb.append(totalDiscountPercentageLevel3);
		}

		if (totalDiscountPercentageLevel3WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountPercentageLevel3WithTaxAmount\": ");

			sb.append(totalDiscountPercentageLevel3WithTaxAmount);
		}

		if (totalDiscountPercentageLevel4 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountPercentageLevel4\": ");

			sb.append(totalDiscountPercentageLevel4);
		}

		if (totalDiscountPercentageLevel4WithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountPercentageLevel4WithTaxAmount\": ");

			sb.append(totalDiscountPercentageLevel4WithTaxAmount);
		}

		if (totalDiscountWithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountWithTaxAmount\": ");

			sb.append(totalDiscountWithTaxAmount);
		}

		if (totalDiscountWithTaxAmountFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountWithTaxAmountFormatted\": ");

			sb.append("\"");

			sb.append(_escape(totalDiscountWithTaxAmountFormatted));

			sb.append("\"");
		}

		if (totalDiscountWithTaxAmountValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalDiscountWithTaxAmountValue\": ");

			sb.append(totalDiscountWithTaxAmountValue);
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

		if (totalWithTaxAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalWithTaxAmount\": ");

			sb.append(totalWithTaxAmount);
		}

		if (totalWithTaxAmountFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalWithTaxAmountFormatted\": ");

			sb.append("\"");

			sb.append(_escape(totalWithTaxAmountFormatted));

			sb.append("\"");
		}

		if (totalWithTaxAmountValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalWithTaxAmountValue\": ");

			sb.append(totalWithTaxAmountValue);
		}

		if (transactionId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"transactionId\": ");

			sb.append("\"");

			sb.append(_escape(transactionId));

			sb.append("\"");
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
		defaultValue = "com.liferay.headless.commerce.admin.order.dto.v1_0.Order",
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