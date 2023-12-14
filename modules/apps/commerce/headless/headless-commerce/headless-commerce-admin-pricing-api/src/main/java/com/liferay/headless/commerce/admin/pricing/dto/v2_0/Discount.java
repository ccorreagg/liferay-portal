/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.pricing.dto.v2_0;

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
 * @author Zoltán Takács
 * @generated
 */
@Generated("")
@GraphQLName("Discount")
@JsonFilter("Liferay.Vulcan")
@Schema(
	requiredProperties = {
		"level", "limitationType", "target", "title", "usePercentage"
	}
)
@XmlRootElement(name = "Discount")
public class Discount implements Serializable {

	public static Discount toDTO(String json) {
		return ObjectMapperUtil.readValue(Discount.class, json);
	}

	public static Discount unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Discount.class, json);
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

	@Schema(example = "true")
	public Boolean getActive() {
		if (active != null) {
			return active;
		}

		active = _activeSupplier.get();

		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;

		_activeSupplier = () -> active;
	}

	@JsonIgnore
	public void setActive(
		UnsafeSupplier<Boolean, Exception> activeUnsafeSupplier) {

		active = null;

		_activeSupplier = () -> {
			try {
				return activeUnsafeSupplier.get();
			}
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
	protected Boolean active;

	private Supplier<Boolean> _activeSupplier = () -> null;

	@Schema
	public String getAmountFormatted() {
		if (amountFormatted != null) {
			return amountFormatted;
		}

		amountFormatted = _amountFormattedSupplier.get();

		return amountFormatted;
	}

	public void setAmountFormatted(String amountFormatted) {
		this.amountFormatted = amountFormatted;

		_amountFormattedSupplier = () -> amountFormatted;
	}

	@JsonIgnore
	public void setAmountFormatted(
		UnsafeSupplier<String, Exception> amountFormattedUnsafeSupplier) {

		amountFormatted = null;

		_amountFormattedSupplier = () -> {
			try {
				return amountFormattedUnsafeSupplier.get();
			}
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
	protected String amountFormatted;

	private Supplier<String> _amountFormattedSupplier = () -> null;

	@Schema(example = "SAVE20")
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

	@Schema
	@Valid
	public DiscountAccountGroup[] getDiscountAccountGroups() {
		if (discountAccountGroups != null) {
			return discountAccountGroups;
		}

		discountAccountGroups = _discountAccountGroupsSupplier.get();

		return discountAccountGroups;
	}

	public void setDiscountAccountGroups(
		DiscountAccountGroup[] discountAccountGroups) {

		this.discountAccountGroups = discountAccountGroups;

		_discountAccountGroupsSupplier = () -> discountAccountGroups;
	}

	@JsonIgnore
	public void setDiscountAccountGroups(
		UnsafeSupplier<DiscountAccountGroup[], Exception>
			discountAccountGroupsUnsafeSupplier) {

		discountAccountGroups = null;

		_discountAccountGroupsSupplier = () -> {
			try {
				return discountAccountGroupsUnsafeSupplier.get();
			}
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
	protected DiscountAccountGroup[] discountAccountGroups;

	private Supplier<DiscountAccountGroup[]> _discountAccountGroupsSupplier =
		() -> null;

	@Schema
	@Valid
	public DiscountAccount[] getDiscountAccounts() {
		if (discountAccounts != null) {
			return discountAccounts;
		}

		discountAccounts = _discountAccountsSupplier.get();

		return discountAccounts;
	}

	public void setDiscountAccounts(DiscountAccount[] discountAccounts) {
		this.discountAccounts = discountAccounts;

		_discountAccountsSupplier = () -> discountAccounts;
	}

	@JsonIgnore
	public void setDiscountAccounts(
		UnsafeSupplier<DiscountAccount[], Exception>
			discountAccountsUnsafeSupplier) {

		discountAccounts = null;

		_discountAccountsSupplier = () -> {
			try {
				return discountAccountsUnsafeSupplier.get();
			}
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
	protected DiscountAccount[] discountAccounts;

	private Supplier<DiscountAccount[]> _discountAccountsSupplier = () -> null;

	@Schema
	@Valid
	public DiscountCategory[] getDiscountCategories() {
		if (discountCategories != null) {
			return discountCategories;
		}

		discountCategories = _discountCategoriesSupplier.get();

		return discountCategories;
	}

	public void setDiscountCategories(DiscountCategory[] discountCategories) {
		this.discountCategories = discountCategories;

		_discountCategoriesSupplier = () -> discountCategories;
	}

	@JsonIgnore
	public void setDiscountCategories(
		UnsafeSupplier<DiscountCategory[], Exception>
			discountCategoriesUnsafeSupplier) {

		discountCategories = null;

		_discountCategoriesSupplier = () -> {
			try {
				return discountCategoriesUnsafeSupplier.get();
			}
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
	protected DiscountCategory[] discountCategories;

	private Supplier<DiscountCategory[]> _discountCategoriesSupplier =
		() -> null;

	@Schema
	@Valid
	public DiscountChannel[] getDiscountChannels() {
		if (discountChannels != null) {
			return discountChannels;
		}

		discountChannels = _discountChannelsSupplier.get();

		return discountChannels;
	}

	public void setDiscountChannels(DiscountChannel[] discountChannels) {
		this.discountChannels = discountChannels;

		_discountChannelsSupplier = () -> discountChannels;
	}

	@JsonIgnore
	public void setDiscountChannels(
		UnsafeSupplier<DiscountChannel[], Exception>
			discountChannelsUnsafeSupplier) {

		discountChannels = null;

		_discountChannelsSupplier = () -> {
			try {
				return discountChannelsUnsafeSupplier.get();
			}
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
	protected DiscountChannel[] discountChannels;

	private Supplier<DiscountChannel[]> _discountChannelsSupplier = () -> null;

	@Schema
	@Valid
	public DiscountOrderType[] getDiscountOrderTypes() {
		if (discountOrderTypes != null) {
			return discountOrderTypes;
		}

		discountOrderTypes = _discountOrderTypesSupplier.get();

		return discountOrderTypes;
	}

	public void setDiscountOrderTypes(DiscountOrderType[] discountOrderTypes) {
		this.discountOrderTypes = discountOrderTypes;

		_discountOrderTypesSupplier = () -> discountOrderTypes;
	}

	@JsonIgnore
	public void setDiscountOrderTypes(
		UnsafeSupplier<DiscountOrderType[], Exception>
			discountOrderTypesUnsafeSupplier) {

		discountOrderTypes = null;

		_discountOrderTypesSupplier = () -> {
			try {
				return discountOrderTypesUnsafeSupplier.get();
			}
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
	protected DiscountOrderType[] discountOrderTypes;

	private Supplier<DiscountOrderType[]> _discountOrderTypesSupplier =
		() -> null;

	@Schema
	@Valid
	public DiscountProductGroup[] getDiscountProductGroups() {
		if (discountProductGroups != null) {
			return discountProductGroups;
		}

		discountProductGroups = _discountProductGroupsSupplier.get();

		return discountProductGroups;
	}

	public void setDiscountProductGroups(
		DiscountProductGroup[] discountProductGroups) {

		this.discountProductGroups = discountProductGroups;

		_discountProductGroupsSupplier = () -> discountProductGroups;
	}

	@JsonIgnore
	public void setDiscountProductGroups(
		UnsafeSupplier<DiscountProductGroup[], Exception>
			discountProductGroupsUnsafeSupplier) {

		discountProductGroups = null;

		_discountProductGroupsSupplier = () -> {
			try {
				return discountProductGroupsUnsafeSupplier.get();
			}
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
	protected DiscountProductGroup[] discountProductGroups;

	private Supplier<DiscountProductGroup[]> _discountProductGroupsSupplier =
		() -> null;

	@Schema
	@Valid
	public DiscountProduct[] getDiscountProducts() {
		if (discountProducts != null) {
			return discountProducts;
		}

		discountProducts = _discountProductsSupplier.get();

		return discountProducts;
	}

	public void setDiscountProducts(DiscountProduct[] discountProducts) {
		this.discountProducts = discountProducts;

		_discountProductsSupplier = () -> discountProducts;
	}

	@JsonIgnore
	public void setDiscountProducts(
		UnsafeSupplier<DiscountProduct[], Exception>
			discountProductsUnsafeSupplier) {

		discountProducts = null;

		_discountProductsSupplier = () -> {
			try {
				return discountProductsUnsafeSupplier.get();
			}
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
	protected DiscountProduct[] discountProducts;

	private Supplier<DiscountProduct[]> _discountProductsSupplier = () -> null;

	@Schema
	@Valid
	public DiscountRule[] getDiscountRules() {
		if (discountRules != null) {
			return discountRules;
		}

		discountRules = _discountRulesSupplier.get();

		return discountRules;
	}

	public void setDiscountRules(DiscountRule[] discountRules) {
		this.discountRules = discountRules;

		_discountRulesSupplier = () -> discountRules;
	}

	@JsonIgnore
	public void setDiscountRules(
		UnsafeSupplier<DiscountRule[], Exception> discountRulesUnsafeSupplier) {

		discountRules = null;

		_discountRulesSupplier = () -> {
			try {
				return discountRulesUnsafeSupplier.get();
			}
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
	protected DiscountRule[] discountRules;

	private Supplier<DiscountRule[]> _discountRulesSupplier = () -> null;

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

	@Schema(example = "L1")
	public String getLevel() {
		if (level != null) {
			return level;
		}

		level = _levelSupplier.get();

		return level;
	}

	public void setLevel(String level) {
		this.level = level;

		_levelSupplier = () -> level;
	}

	@JsonIgnore
	public void setLevel(
		UnsafeSupplier<String, Exception> levelUnsafeSupplier) {

		level = null;

		_levelSupplier = () -> {
			try {
				return levelUnsafeSupplier.get();
			}
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
	protected String level;

	private Supplier<String> _levelSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	public Integer getLimitationTimes() {
		if (limitationTimes != null) {
			return limitationTimes;
		}

		limitationTimes = _limitationTimesSupplier.get();

		return limitationTimes;
	}

	public void setLimitationTimes(Integer limitationTimes) {
		this.limitationTimes = limitationTimes;

		_limitationTimesSupplier = () -> limitationTimes;
	}

	@JsonIgnore
	public void setLimitationTimes(
		UnsafeSupplier<Integer, Exception> limitationTimesUnsafeSupplier) {

		limitationTimes = null;

		_limitationTimesSupplier = () -> {
			try {
				return limitationTimesUnsafeSupplier.get();
			}
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
	protected Integer limitationTimes;

	private Supplier<Integer> _limitationTimesSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	public Integer getLimitationTimesPerAccount() {
		if (limitationTimesPerAccount != null) {
			return limitationTimesPerAccount;
		}

		limitationTimesPerAccount = _limitationTimesPerAccountSupplier.get();

		return limitationTimesPerAccount;
	}

	public void setLimitationTimesPerAccount(
		Integer limitationTimesPerAccount) {

		this.limitationTimesPerAccount = limitationTimesPerAccount;

		_limitationTimesPerAccountSupplier = () -> limitationTimesPerAccount;
	}

	@JsonIgnore
	public void setLimitationTimesPerAccount(
		UnsafeSupplier<Integer, Exception>
			limitationTimesPerAccountUnsafeSupplier) {

		limitationTimesPerAccount = null;

		_limitationTimesPerAccountSupplier = () -> {
			try {
				return limitationTimesPerAccountUnsafeSupplier.get();
			}
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
	protected Integer limitationTimesPerAccount;

	private Supplier<Integer> _limitationTimesPerAccountSupplier = () -> null;

	@Schema(example = "unlimited")
	public String getLimitationType() {
		if (limitationType != null) {
			return limitationType;
		}

		limitationType = _limitationTypeSupplier.get();

		return limitationType;
	}

	public void setLimitationType(String limitationType) {
		this.limitationType = limitationType;

		_limitationTypeSupplier = () -> limitationType;
	}

	@JsonIgnore
	public void setLimitationType(
		UnsafeSupplier<String, Exception> limitationTypeUnsafeSupplier) {

		limitationType = null;

		_limitationTypeSupplier = () -> {
			try {
				return limitationTypeUnsafeSupplier.get();
			}
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
	protected String limitationType;

	private Supplier<String> _limitationTypeSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "25")
	@Valid
	public BigDecimal getMaximumDiscountAmount() {
		if (maximumDiscountAmount != null) {
			return maximumDiscountAmount;
		}

		maximumDiscountAmount = _maximumDiscountAmountSupplier.get();

		return maximumDiscountAmount;
	}

	public void setMaximumDiscountAmount(BigDecimal maximumDiscountAmount) {
		this.maximumDiscountAmount = maximumDiscountAmount;

		_maximumDiscountAmountSupplier = () -> maximumDiscountAmount;
	}

	@JsonIgnore
	public void setMaximumDiscountAmount(
		UnsafeSupplier<BigDecimal, Exception>
			maximumDiscountAmountUnsafeSupplier) {

		maximumDiscountAmount = null;

		_maximumDiscountAmountSupplier = () -> {
			try {
				return maximumDiscountAmountUnsafeSupplier.get();
			}
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
	protected BigDecimal maximumDiscountAmount;

	private Supplier<BigDecimal> _maximumDiscountAmountSupplier = () -> null;

	@Schema(example = "2017-07-21")
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
	@Schema(example = "5")
	public Integer getNumberOfUse() {
		if (numberOfUse != null) {
			return numberOfUse;
		}

		numberOfUse = _numberOfUseSupplier.get();

		return numberOfUse;
	}

	public void setNumberOfUse(Integer numberOfUse) {
		this.numberOfUse = numberOfUse;

		_numberOfUseSupplier = () -> numberOfUse;
	}

	@JsonIgnore
	public void setNumberOfUse(
		UnsafeSupplier<Integer, Exception> numberOfUseUnsafeSupplier) {

		numberOfUse = null;

		_numberOfUseSupplier = () -> {
			try {
				return numberOfUseUnsafeSupplier.get();
			}
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
	protected Integer numberOfUse;

	private Supplier<Integer> _numberOfUseSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "20")
	@Valid
	public BigDecimal getPercentageLevel1() {
		if (percentageLevel1 != null) {
			return percentageLevel1;
		}

		percentageLevel1 = _percentageLevel1Supplier.get();

		return percentageLevel1;
	}

	public void setPercentageLevel1(BigDecimal percentageLevel1) {
		this.percentageLevel1 = percentageLevel1;

		_percentageLevel1Supplier = () -> percentageLevel1;
	}

	@JsonIgnore
	public void setPercentageLevel1(
		UnsafeSupplier<BigDecimal, Exception> percentageLevel1UnsafeSupplier) {

		percentageLevel1 = null;

		_percentageLevel1Supplier = () -> {
			try {
				return percentageLevel1UnsafeSupplier.get();
			}
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
	protected BigDecimal percentageLevel1;

	private Supplier<BigDecimal> _percentageLevel1Supplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getPercentageLevel2() {
		if (percentageLevel2 != null) {
			return percentageLevel2;
		}

		percentageLevel2 = _percentageLevel2Supplier.get();

		return percentageLevel2;
	}

	public void setPercentageLevel2(BigDecimal percentageLevel2) {
		this.percentageLevel2 = percentageLevel2;

		_percentageLevel2Supplier = () -> percentageLevel2;
	}

	@JsonIgnore
	public void setPercentageLevel2(
		UnsafeSupplier<BigDecimal, Exception> percentageLevel2UnsafeSupplier) {

		percentageLevel2 = null;

		_percentageLevel2Supplier = () -> {
			try {
				return percentageLevel2UnsafeSupplier.get();
			}
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
	protected BigDecimal percentageLevel2;

	private Supplier<BigDecimal> _percentageLevel2Supplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getPercentageLevel3() {
		if (percentageLevel3 != null) {
			return percentageLevel3;
		}

		percentageLevel3 = _percentageLevel3Supplier.get();

		return percentageLevel3;
	}

	public void setPercentageLevel3(BigDecimal percentageLevel3) {
		this.percentageLevel3 = percentageLevel3;

		_percentageLevel3Supplier = () -> percentageLevel3;
	}

	@JsonIgnore
	public void setPercentageLevel3(
		UnsafeSupplier<BigDecimal, Exception> percentageLevel3UnsafeSupplier) {

		percentageLevel3 = null;

		_percentageLevel3Supplier = () -> {
			try {
				return percentageLevel3UnsafeSupplier.get();
			}
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
	protected BigDecimal percentageLevel3;

	private Supplier<BigDecimal> _percentageLevel3Supplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "0")
	@Valid
	public BigDecimal getPercentageLevel4() {
		if (percentageLevel4 != null) {
			return percentageLevel4;
		}

		percentageLevel4 = _percentageLevel4Supplier.get();

		return percentageLevel4;
	}

	public void setPercentageLevel4(BigDecimal percentageLevel4) {
		this.percentageLevel4 = percentageLevel4;

		_percentageLevel4Supplier = () -> percentageLevel4;
	}

	@JsonIgnore
	public void setPercentageLevel4(
		UnsafeSupplier<BigDecimal, Exception> percentageLevel4UnsafeSupplier) {

		percentageLevel4 = null;

		_percentageLevel4Supplier = () -> {
			try {
				return percentageLevel4UnsafeSupplier.get();
			}
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
	protected BigDecimal percentageLevel4;

	private Supplier<BigDecimal> _percentageLevel4Supplier = () -> null;

	@Schema(example = "true")
	public Boolean getRulesConjunction() {
		if (rulesConjunction != null) {
			return rulesConjunction;
		}

		rulesConjunction = _rulesConjunctionSupplier.get();

		return rulesConjunction;
	}

	public void setRulesConjunction(Boolean rulesConjunction) {
		this.rulesConjunction = rulesConjunction;

		_rulesConjunctionSupplier = () -> rulesConjunction;
	}

	@JsonIgnore
	public void setRulesConjunction(
		UnsafeSupplier<Boolean, Exception> rulesConjunctionUnsafeSupplier) {

		rulesConjunction = null;

		_rulesConjunctionSupplier = () -> {
			try {
				return rulesConjunctionUnsafeSupplier.get();
			}
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
	protected Boolean rulesConjunction;

	private Supplier<Boolean> _rulesConjunctionSupplier = () -> null;

	@Schema(example = "subtotal")
	public String getTarget() {
		if (target != null) {
			return target;
		}

		target = _targetSupplier.get();

		return target;
	}

	public void setTarget(String target) {
		this.target = target;

		_targetSupplier = () -> target;
	}

	@JsonIgnore
	public void setTarget(
		UnsafeSupplier<String, Exception> targetUnsafeSupplier) {

		target = null;

		_targetSupplier = () -> {
			try {
				return targetUnsafeSupplier.get();
			}
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
	protected String target;

	private Supplier<String> _targetSupplier = () -> null;

	@Schema(example = "20% Off")
	public String getTitle() {
		if (title != null) {
			return title;
		}

		title = _titleSupplier.get();

		return title;
	}

	public void setTitle(String title) {
		this.title = title;

		_titleSupplier = () -> title;
	}

	@JsonIgnore
	public void setTitle(
		UnsafeSupplier<String, Exception> titleUnsafeSupplier) {

		title = null;

		_titleSupplier = () -> {
			try {
				return titleUnsafeSupplier.get();
			}
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
	protected String title;

	private Supplier<String> _titleSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getUseCouponCode() {
		if (useCouponCode != null) {
			return useCouponCode;
		}

		useCouponCode = _useCouponCodeSupplier.get();

		return useCouponCode;
	}

	public void setUseCouponCode(Boolean useCouponCode) {
		this.useCouponCode = useCouponCode;

		_useCouponCodeSupplier = () -> useCouponCode;
	}

	@JsonIgnore
	public void setUseCouponCode(
		UnsafeSupplier<Boolean, Exception> useCouponCodeUnsafeSupplier) {

		useCouponCode = null;

		_useCouponCodeSupplier = () -> {
			try {
				return useCouponCodeUnsafeSupplier.get();
			}
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
	protected Boolean useCouponCode;

	private Supplier<Boolean> _useCouponCodeSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getUsePercentage() {
		if (usePercentage != null) {
			return usePercentage;
		}

		usePercentage = _usePercentageSupplier.get();

		return usePercentage;
	}

	public void setUsePercentage(Boolean usePercentage) {
		this.usePercentage = usePercentage;

		_usePercentageSupplier = () -> usePercentage;
	}

	@JsonIgnore
	public void setUsePercentage(
		UnsafeSupplier<Boolean, Exception> usePercentageUnsafeSupplier) {

		usePercentage = null;

		_usePercentageSupplier = () -> {
			try {
				return usePercentageUnsafeSupplier.get();
			}
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
	protected Boolean usePercentage;

	private Supplier<Boolean> _usePercentageSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Discount)) {
			return false;
		}

		Discount discount = (Discount)object;

		return Objects.equals(toString(), discount.toString());
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

		if (actions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actions\": ");

			sb.append(_toJSON(actions));
		}

		if (active != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"active\": ");

			sb.append(active);
		}

		if (amountFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"amountFormatted\": ");

			sb.append("\"");

			sb.append(_escape(amountFormatted));

			sb.append("\"");
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

		if (customFields != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"customFields\": ");

			sb.append(_toJSON(customFields));
		}

		if (discountAccountGroups != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountAccountGroups\": ");

			sb.append("[");

			for (int i = 0; i < discountAccountGroups.length; i++) {
				sb.append(String.valueOf(discountAccountGroups[i]));

				if ((i + 1) < discountAccountGroups.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (discountAccounts != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountAccounts\": ");

			sb.append("[");

			for (int i = 0; i < discountAccounts.length; i++) {
				sb.append(String.valueOf(discountAccounts[i]));

				if ((i + 1) < discountAccounts.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (discountCategories != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountCategories\": ");

			sb.append("[");

			for (int i = 0; i < discountCategories.length; i++) {
				sb.append(String.valueOf(discountCategories[i]));

				if ((i + 1) < discountCategories.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (discountChannels != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountChannels\": ");

			sb.append("[");

			for (int i = 0; i < discountChannels.length; i++) {
				sb.append(String.valueOf(discountChannels[i]));

				if ((i + 1) < discountChannels.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (discountOrderTypes != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountOrderTypes\": ");

			sb.append("[");

			for (int i = 0; i < discountOrderTypes.length; i++) {
				sb.append(String.valueOf(discountOrderTypes[i]));

				if ((i + 1) < discountOrderTypes.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (discountProductGroups != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountProductGroups\": ");

			sb.append("[");

			for (int i = 0; i < discountProductGroups.length; i++) {
				sb.append(String.valueOf(discountProductGroups[i]));

				if ((i + 1) < discountProductGroups.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (discountProducts != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountProducts\": ");

			sb.append("[");

			for (int i = 0; i < discountProducts.length; i++) {
				sb.append(String.valueOf(discountProducts[i]));

				if ((i + 1) < discountProducts.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (discountRules != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountRules\": ");

			sb.append("[");

			for (int i = 0; i < discountRules.length; i++) {
				sb.append(String.valueOf(discountRules[i]));

				if ((i + 1) < discountRules.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
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

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (level != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"level\": ");

			sb.append("\"");

			sb.append(_escape(level));

			sb.append("\"");
		}

		if (limitationTimes != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"limitationTimes\": ");

			sb.append(limitationTimes);
		}

		if (limitationTimesPerAccount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"limitationTimesPerAccount\": ");

			sb.append(limitationTimesPerAccount);
		}

		if (limitationType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"limitationType\": ");

			sb.append("\"");

			sb.append(_escape(limitationType));

			sb.append("\"");
		}

		if (maximumDiscountAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"maximumDiscountAmount\": ");

			sb.append(maximumDiscountAmount);
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

		if (neverExpire != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"neverExpire\": ");

			sb.append(neverExpire);
		}

		if (numberOfUse != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfUse\": ");

			sb.append(numberOfUse);
		}

		if (percentageLevel1 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"percentageLevel1\": ");

			sb.append(percentageLevel1);
		}

		if (percentageLevel2 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"percentageLevel2\": ");

			sb.append(percentageLevel2);
		}

		if (percentageLevel3 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"percentageLevel3\": ");

			sb.append(percentageLevel3);
		}

		if (percentageLevel4 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"percentageLevel4\": ");

			sb.append(percentageLevel4);
		}

		if (rulesConjunction != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"rulesConjunction\": ");

			sb.append(rulesConjunction);
		}

		if (target != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"target\": ");

			sb.append("\"");

			sb.append(_escape(target));

			sb.append("\"");
		}

		if (title != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(title));

			sb.append("\"");
		}

		if (useCouponCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"useCouponCode\": ");

			sb.append(useCouponCode);
		}

		if (usePercentage != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"usePercentage\": ");

			sb.append(usePercentage);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.pricing.dto.v2_0.Discount",
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