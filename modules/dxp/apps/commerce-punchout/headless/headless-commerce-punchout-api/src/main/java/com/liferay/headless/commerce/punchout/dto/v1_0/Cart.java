/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.punchout.dto.v1_0;

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
import javax.validation.constraints.NotEmpty;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Jaclyn Ong
 * @generated
 */
@Generated("")
@GraphQLName("Cart")
@JsonFilter("Liferay.Vulcan")
@Schema(requiredProperties = {"currencyCode"})
@XmlRootElement(name = "Cart")
public class Cart implements Serializable {

	public static Cart toDTO(String json) {
		return ObjectMapperUtil.readValue(Cart.class, json);
	}

	public static Cart unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Cart.class, json);
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
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
	@Valid
	public Address getBillingAddress() {
		if (billingAddress != null) {
			return billingAddress;
		}

		billingAddress = _billingAddressSupplier.get();

		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;

		_billingAddressSupplier = () -> billingAddress;
	}

	@JsonIgnore
	public void setBillingAddress(
		UnsafeSupplier<Address, Exception> billingAddressUnsafeSupplier) {

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
	protected Address billingAddress;

	private Supplier<Address> _billingAddressSupplier = () -> null;

	@Schema
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
	public CartItem[] getCartItems() {
		if (cartItems != null) {
			return cartItems;
		}

		cartItems = _cartItemsSupplier.get();

		return cartItems;
	}

	public void setCartItems(CartItem[] cartItems) {
		this.cartItems = cartItems;

		_cartItemsSupplier = () -> cartItems;
	}

	@JsonIgnore
	public void setCartItems(
		UnsafeSupplier<CartItem[], Exception> cartItemsUnsafeSupplier) {

		cartItems = null;

		_cartItemsSupplier = () -> {
			try {
				return cartItemsUnsafeSupplier.get();
			}
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
	protected CartItem[] cartItems;

	private Supplier<CartItem[]> _cartItemsSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Map<String, ?> customFields;

	private Supplier<Map<String, ?>> _customFieldsSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
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
	public CartComment[] getNotes() {
		if (notes != null) {
			return notes;
		}

		notes = _notesSupplier.get();

		return notes;
	}

	public void setNotes(CartComment[] notes) {
		this.notes = notes;

		_notesSupplier = () -> notes;
	}

	@JsonIgnore
	public void setNotes(
		UnsafeSupplier<CartComment[], Exception> notesUnsafeSupplier) {

		notes = null;

		_notesSupplier = () -> {
			try {
				return notesUnsafeSupplier.get();
			}
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
	protected CartComment[] notes;

	private Supplier<CartComment[]> _notesSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
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
	@Valid
	public Address getShippingAddress() {
		if (shippingAddress != null) {
			return shippingAddress;
		}

		shippingAddress = _shippingAddressSupplier.get();

		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;

		_shippingAddressSupplier = () -> shippingAddress;
	}

	@JsonIgnore
	public void setShippingAddress(
		UnsafeSupplier<Address, Exception> shippingAddressUnsafeSupplier) {

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
	protected Address shippingAddress;

	private Supplier<Address> _shippingAddressSupplier = () -> null;

	@Schema
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean useAsBilling;

	private Supplier<Boolean> _useAsBillingSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Cart)) {
			return false;
		}

		Cart cart = (Cart)object;

		return Objects.equals(toString(), cart.toString());
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

		if (cartItems != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cartItems\": ");

			sb.append("[");

			for (int i = 0; i < cartItems.length; i++) {
				sb.append(String.valueOf(cartItems[i]));

				if ((i + 1) < cartItems.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
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

		if (notes != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"notes\": ");

			sb.append("[");

			for (int i = 0; i < notes.length; i++) {
				sb.append(String.valueOf(notes[i]));

				if ((i + 1) < notes.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
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

		if (paymentStatusLabel != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paymentStatusLabel\": ");

			sb.append("\"");

			sb.append(_escape(paymentStatusLabel));

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

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.punchout.dto.v1_0.Cart",
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