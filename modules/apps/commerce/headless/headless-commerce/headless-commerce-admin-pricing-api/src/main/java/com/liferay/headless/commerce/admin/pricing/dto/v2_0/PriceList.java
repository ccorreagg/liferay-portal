/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.pricing.dto.v2_0;

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
@GraphQLName("PriceList")
@JsonFilter("Liferay.Vulcan")
@Schema(requiredProperties = {"catalogId", "currencyCode", "name", "type"})
@XmlRootElement(name = "PriceList")
public class PriceList implements Serializable {

	public static PriceList toDTO(String json) {
		return ObjectMapperUtil.readValue(PriceList.class, json);
	}

	public static PriceList unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(PriceList.class, json);
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

	@Schema(example = "admin")
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String author;

	private Supplier<String> _authorSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getCatalogBasePriceList() {
		if (catalogBasePriceList != null) {
			return catalogBasePriceList;
		}

		catalogBasePriceList = _catalogBasePriceListSupplier.get();

		return catalogBasePriceList;
	}

	public void setCatalogBasePriceList(Boolean catalogBasePriceList) {
		this.catalogBasePriceList = catalogBasePriceList;

		_catalogBasePriceListSupplier = () -> catalogBasePriceList;
	}

	@JsonIgnore
	public void setCatalogBasePriceList(
		UnsafeSupplier<Boolean, Exception> catalogBasePriceListUnsafeSupplier) {

		catalogBasePriceList = null;

		_catalogBasePriceListSupplier = () -> {
			try {
				return catalogBasePriceListUnsafeSupplier.get();
			}
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
	protected Boolean catalogBasePriceList;

	private Supplier<Boolean> _catalogBasePriceListSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "23130")
	public Long getCatalogId() {
		if (catalogId != null) {
			return catalogId;
		}

		catalogId = _catalogIdSupplier.get();

		return catalogId;
	}

	public void setCatalogId(Long catalogId) {
		this.catalogId = catalogId;

		_catalogIdSupplier = () -> catalogId;
	}

	@JsonIgnore
	public void setCatalogId(
		UnsafeSupplier<Long, Exception> catalogIdUnsafeSupplier) {

		catalogId = null;

		_catalogIdSupplier = () -> {
			try {
				return catalogIdUnsafeSupplier.get();
			}
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
	protected Long catalogId;

	private Supplier<Long> _catalogIdSupplier = () -> null;

	@Schema(example = "catalog")
	public String getCatalogName() {
		if (catalogName != null) {
			return catalogName;
		}

		catalogName = _catalogNameSupplier.get();

		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;

		_catalogNameSupplier = () -> catalogName;
	}

	@JsonIgnore
	public void setCatalogName(
		UnsafeSupplier<String, Exception> catalogNameUnsafeSupplier) {

		catalogName = null;

		_catalogNameSupplier = () -> {
			try {
				return catalogNameUnsafeSupplier.get();
			}
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
	protected String catalogName;

	private Supplier<String> _catalogNameSupplier = () -> null;

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

	@Schema(example = "EUR")
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

	@Schema(example = "Laptops, Beverages")
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
	@NotEmpty
	protected String name;

	private Supplier<String> _nameSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getNetPrice() {
		if (netPrice != null) {
			return netPrice;
		}

		netPrice = _netPriceSupplier.get();

		return netPrice;
	}

	public void setNetPrice(Boolean netPrice) {
		this.netPrice = netPrice;

		_netPriceSupplier = () -> netPrice;
	}

	@JsonIgnore
	public void setNetPrice(
		UnsafeSupplier<Boolean, Exception> netPriceUnsafeSupplier) {

		netPrice = null;

		_netPriceSupplier = () -> {
			try {
				return netPriceUnsafeSupplier.get();
			}
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
	protected Boolean netPrice;

	private Supplier<Boolean> _netPriceSupplier = () -> null;

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
	@Schema(example = "30130")
	public Long getParentPriceListId() {
		if (parentPriceListId != null) {
			return parentPriceListId;
		}

		parentPriceListId = _parentPriceListIdSupplier.get();

		return parentPriceListId;
	}

	public void setParentPriceListId(Long parentPriceListId) {
		this.parentPriceListId = parentPriceListId;

		_parentPriceListIdSupplier = () -> parentPriceListId;
	}

	@JsonIgnore
	public void setParentPriceListId(
		UnsafeSupplier<Long, Exception> parentPriceListIdUnsafeSupplier) {

		parentPriceListId = null;

		_parentPriceListIdSupplier = () -> {
			try {
				return parentPriceListIdUnsafeSupplier.get();
			}
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
	protected Long parentPriceListId;

	private Supplier<Long> _parentPriceListIdSupplier = () -> null;

	@Schema
	@Valid
	public PriceEntry[] getPriceEntries() {
		if (priceEntries != null) {
			return priceEntries;
		}

		priceEntries = _priceEntriesSupplier.get();

		return priceEntries;
	}

	public void setPriceEntries(PriceEntry[] priceEntries) {
		this.priceEntries = priceEntries;

		_priceEntriesSupplier = () -> priceEntries;
	}

	@JsonIgnore
	public void setPriceEntries(
		UnsafeSupplier<PriceEntry[], Exception> priceEntriesUnsafeSupplier) {

		priceEntries = null;

		_priceEntriesSupplier = () -> {
			try {
				return priceEntriesUnsafeSupplier.get();
			}
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
	protected PriceEntry[] priceEntries;

	private Supplier<PriceEntry[]> _priceEntriesSupplier = () -> null;

	@Schema
	@Valid
	public PriceListAccountGroup[] getPriceListAccountGroups() {
		if (priceListAccountGroups != null) {
			return priceListAccountGroups;
		}

		priceListAccountGroups = _priceListAccountGroupsSupplier.get();

		return priceListAccountGroups;
	}

	public void setPriceListAccountGroups(
		PriceListAccountGroup[] priceListAccountGroups) {

		this.priceListAccountGroups = priceListAccountGroups;

		_priceListAccountGroupsSupplier = () -> priceListAccountGroups;
	}

	@JsonIgnore
	public void setPriceListAccountGroups(
		UnsafeSupplier<PriceListAccountGroup[], Exception>
			priceListAccountGroupsUnsafeSupplier) {

		priceListAccountGroups = null;

		_priceListAccountGroupsSupplier = () -> {
			try {
				return priceListAccountGroupsUnsafeSupplier.get();
			}
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
	protected PriceListAccountGroup[] priceListAccountGroups;

	private Supplier<PriceListAccountGroup[]> _priceListAccountGroupsSupplier =
		() -> null;

	@Schema
	@Valid
	public PriceListAccount[] getPriceListAccounts() {
		if (priceListAccounts != null) {
			return priceListAccounts;
		}

		priceListAccounts = _priceListAccountsSupplier.get();

		return priceListAccounts;
	}

	public void setPriceListAccounts(PriceListAccount[] priceListAccounts) {
		this.priceListAccounts = priceListAccounts;

		_priceListAccountsSupplier = () -> priceListAccounts;
	}

	@JsonIgnore
	public void setPriceListAccounts(
		UnsafeSupplier<PriceListAccount[], Exception>
			priceListAccountsUnsafeSupplier) {

		priceListAccounts = null;

		_priceListAccountsSupplier = () -> {
			try {
				return priceListAccountsUnsafeSupplier.get();
			}
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
	protected PriceListAccount[] priceListAccounts;

	private Supplier<PriceListAccount[]> _priceListAccountsSupplier =
		() -> null;

	@Schema
	@Valid
	public PriceListChannel[] getPriceListChannels() {
		if (priceListChannels != null) {
			return priceListChannels;
		}

		priceListChannels = _priceListChannelsSupplier.get();

		return priceListChannels;
	}

	public void setPriceListChannels(PriceListChannel[] priceListChannels) {
		this.priceListChannels = priceListChannels;

		_priceListChannelsSupplier = () -> priceListChannels;
	}

	@JsonIgnore
	public void setPriceListChannels(
		UnsafeSupplier<PriceListChannel[], Exception>
			priceListChannelsUnsafeSupplier) {

		priceListChannels = null;

		_priceListChannelsSupplier = () -> {
			try {
				return priceListChannelsUnsafeSupplier.get();
			}
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
	protected PriceListChannel[] priceListChannels;

	private Supplier<PriceListChannel[]> _priceListChannelsSupplier =
		() -> null;

	@Schema
	@Valid
	public PriceListDiscount[] getPriceListDiscounts() {
		if (priceListDiscounts != null) {
			return priceListDiscounts;
		}

		priceListDiscounts = _priceListDiscountsSupplier.get();

		return priceListDiscounts;
	}

	public void setPriceListDiscounts(PriceListDiscount[] priceListDiscounts) {
		this.priceListDiscounts = priceListDiscounts;

		_priceListDiscountsSupplier = () -> priceListDiscounts;
	}

	@JsonIgnore
	public void setPriceListDiscounts(
		UnsafeSupplier<PriceListDiscount[], Exception>
			priceListDiscountsUnsafeSupplier) {

		priceListDiscounts = null;

		_priceListDiscountsSupplier = () -> {
			try {
				return priceListDiscountsUnsafeSupplier.get();
			}
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
	protected PriceListDiscount[] priceListDiscounts;

	private Supplier<PriceListDiscount[]> _priceListDiscountsSupplier =
		() -> null;

	@Schema
	@Valid
	public PriceListOrderType[] getPriceListOrderTypes() {
		if (priceListOrderTypes != null) {
			return priceListOrderTypes;
		}

		priceListOrderTypes = _priceListOrderTypesSupplier.get();

		return priceListOrderTypes;
	}

	public void setPriceListOrderTypes(
		PriceListOrderType[] priceListOrderTypes) {

		this.priceListOrderTypes = priceListOrderTypes;

		_priceListOrderTypesSupplier = () -> priceListOrderTypes;
	}

	@JsonIgnore
	public void setPriceListOrderTypes(
		UnsafeSupplier<PriceListOrderType[], Exception>
			priceListOrderTypesUnsafeSupplier) {

		priceListOrderTypes = null;

		_priceListOrderTypesSupplier = () -> {
			try {
				return priceListOrderTypesUnsafeSupplier.get();
			}
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
	protected PriceListOrderType[] priceListOrderTypes;

	private Supplier<PriceListOrderType[]> _priceListOrderTypesSupplier =
		() -> null;

	@Schema
	@Valid
	public PriceModifier[] getPriceModifiers() {
		if (priceModifiers != null) {
			return priceModifiers;
		}

		priceModifiers = _priceModifiersSupplier.get();

		return priceModifiers;
	}

	public void setPriceModifiers(PriceModifier[] priceModifiers) {
		this.priceModifiers = priceModifiers;

		_priceModifiersSupplier = () -> priceModifiers;
	}

	@JsonIgnore
	public void setPriceModifiers(
		UnsafeSupplier<PriceModifier[], Exception>
			priceModifiersUnsafeSupplier) {

		priceModifiers = null;

		_priceModifiersSupplier = () -> {
			try {
				return priceModifiersUnsafeSupplier.get();
			}
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
	protected PriceModifier[] priceModifiers;

	private Supplier<PriceModifier[]> _priceModifiersSupplier = () -> null;

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

	@Schema(example = "price-list, promotion, contract")
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
	@NotNull
	protected Type type;

	private Supplier<Type> _typeSupplier = () -> null;

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

		if (!(object instanceof PriceList)) {
			return false;
		}

		PriceList priceList = (PriceList)object;

		return Objects.equals(toString(), priceList.toString());
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

		if (author != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"author\": ");

			sb.append("\"");

			sb.append(_escape(author));

			sb.append("\"");
		}

		if (catalogBasePriceList != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"catalogBasePriceList\": ");

			sb.append(catalogBasePriceList);
		}

		if (catalogId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"catalogId\": ");

			sb.append(catalogId);
		}

		if (catalogName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"catalogName\": ");

			sb.append("\"");

			sb.append(_escape(catalogName));

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

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(name));

			sb.append("\"");
		}

		if (netPrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"netPrice\": ");

			sb.append(netPrice);
		}

		if (neverExpire != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"neverExpire\": ");

			sb.append(neverExpire);
		}

		if (parentPriceListId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parentPriceListId\": ");

			sb.append(parentPriceListId);
		}

		if (priceEntries != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceEntries\": ");

			sb.append("[");

			for (int i = 0; i < priceEntries.length; i++) {
				sb.append(String.valueOf(priceEntries[i]));

				if ((i + 1) < priceEntries.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (priceListAccountGroups != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceListAccountGroups\": ");

			sb.append("[");

			for (int i = 0; i < priceListAccountGroups.length; i++) {
				sb.append(String.valueOf(priceListAccountGroups[i]));

				if ((i + 1) < priceListAccountGroups.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (priceListAccounts != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceListAccounts\": ");

			sb.append("[");

			for (int i = 0; i < priceListAccounts.length; i++) {
				sb.append(String.valueOf(priceListAccounts[i]));

				if ((i + 1) < priceListAccounts.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (priceListChannels != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceListChannels\": ");

			sb.append("[");

			for (int i = 0; i < priceListChannels.length; i++) {
				sb.append(String.valueOf(priceListChannels[i]));

				if ((i + 1) < priceListChannels.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (priceListDiscounts != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceListDiscounts\": ");

			sb.append("[");

			for (int i = 0; i < priceListDiscounts.length; i++) {
				sb.append(String.valueOf(priceListDiscounts[i]));

				if ((i + 1) < priceListDiscounts.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (priceListOrderTypes != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceListOrderTypes\": ");

			sb.append("[");

			for (int i = 0; i < priceListOrderTypes.length; i++) {
				sb.append(String.valueOf(priceListOrderTypes[i]));

				if ((i + 1) < priceListOrderTypes.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (priceModifiers != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceModifiers\": ");

			sb.append("[");

			for (int i = 0; i < priceModifiers.length; i++) {
				sb.append(String.valueOf(priceModifiers[i]));

				if ((i + 1) < priceModifiers.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (priority != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priority\": ");

			sb.append(priority);
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
		defaultValue = "com.liferay.headless.commerce.admin.pricing.dto.v2_0.PriceList",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("Type")
	public static enum Type {

		PRICE_LIST("price-list"), PROMOTION("promotion"), CONTRACT("contract");

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