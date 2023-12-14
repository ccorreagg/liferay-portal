/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.user.dto.v1_0;

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
import javax.validation.constraints.NotEmpty;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "An account represents an external account, for example a customer business.",
	value = "Account"
)
@JsonFilter("Liferay.Vulcan")
@Schema(
	description = "An account represents an external account, for example a customer business.",
	requiredProperties = {"name"}
)
@XmlRootElement(name = "Account")
public class Account implements Serializable {

	public static Account toDTO(String json) {
		return ObjectMapperUtil.readValue(Account.class, json);
	}

	public static Account unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Account.class, json);
	}

	@Schema(description = "The users linked to the account")
	@Valid
	public UserAccount[] getAccountUserAccounts() {
		if (accountUserAccounts != null) {
			return accountUserAccounts;
		}

		accountUserAccounts = _accountUserAccountsSupplier.get();

		return accountUserAccounts;
	}

	public void setAccountUserAccounts(UserAccount[] accountUserAccounts) {
		this.accountUserAccounts = accountUserAccounts;

		_accountUserAccountsSupplier = () -> accountUserAccounts;
	}

	@JsonIgnore
	public void setAccountUserAccounts(
		UnsafeSupplier<UserAccount[], Exception>
			accountUserAccountsUnsafeSupplier) {

		accountUserAccounts = null;

		_accountUserAccountsSupplier = () -> {
			try {
				return accountUserAccountsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The users linked to the account")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected UserAccount[] accountUserAccounts;

	private Supplier<UserAccount[]> _accountUserAccountsSupplier = () -> null;

	@Schema(
		description = "Block of actions allowed by the user making the request."
	)
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

	@GraphQLField(
		description = "Block of actions allowed by the user making the request."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Map<String, Map<String, String>> actions;

	private Supplier<Map<String, Map<String, String>>> _actionsSupplier =
		() -> null;

	@Schema
	@Valid
	public CustomField[] getCustomFields() {
		if (customFields != null) {
			return customFields;
		}

		customFields = _customFieldsSupplier.get();

		return customFields;
	}

	public void setCustomFields(CustomField[] customFields) {
		this.customFields = customFields;

		_customFieldsSupplier = () -> customFields;
	}

	@JsonIgnore
	public void setCustomFields(
		UnsafeSupplier<CustomField[], Exception> customFieldsUnsafeSupplier) {

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
	protected CustomField[] customFields;

	private Supplier<CustomField[]> _customFieldsSupplier = () -> null;

	@Schema(description = "The account's creation date.")
	public Date getDateCreated() {
		if (dateCreated != null) {
			return dateCreated;
		}

		dateCreated = _dateCreatedSupplier.get();

		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;

		_dateCreatedSupplier = () -> dateCreated;
	}

	@JsonIgnore
	public void setDateCreated(
		UnsafeSupplier<Date, Exception> dateCreatedUnsafeSupplier) {

		dateCreated = null;

		_dateCreatedSupplier = () -> {
			try {
				return dateCreatedUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The account's creation date.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateCreated;

	private Supplier<Date> _dateCreatedSupplier = () -> null;

	@Schema(description = "The account's most recent modification date.")
	public Date getDateModified() {
		if (dateModified != null) {
			return dateModified;
		}

		dateModified = _dateModifiedSupplier.get();

		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;

		_dateModifiedSupplier = () -> dateModified;
	}

	@JsonIgnore
	public void setDateModified(
		UnsafeSupplier<Date, Exception> dateModifiedUnsafeSupplier) {

		dateModified = null;

		_dateModifiedSupplier = () -> {
			try {
				return dateModifiedUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The account's most recent modification date.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateModified;

	private Supplier<Date> _dateModifiedSupplier = () -> null;

	@Schema
	public Long getDefaultBillingAddressId() {
		if (defaultBillingAddressId != null) {
			return defaultBillingAddressId;
		}

		defaultBillingAddressId = _defaultBillingAddressIdSupplier.get();

		return defaultBillingAddressId;
	}

	public void setDefaultBillingAddressId(Long defaultBillingAddressId) {
		this.defaultBillingAddressId = defaultBillingAddressId;

		_defaultBillingAddressIdSupplier = () -> defaultBillingAddressId;
	}

	@JsonIgnore
	public void setDefaultBillingAddressId(
		UnsafeSupplier<Long, Exception> defaultBillingAddressIdUnsafeSupplier) {

		defaultBillingAddressId = null;

		_defaultBillingAddressIdSupplier = () -> {
			try {
				return defaultBillingAddressIdUnsafeSupplier.get();
			}
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
	protected Long defaultBillingAddressId;

	private Supplier<Long> _defaultBillingAddressIdSupplier = () -> null;

	@Schema
	public Long getDefaultShippingAddressId() {
		if (defaultShippingAddressId != null) {
			return defaultShippingAddressId;
		}

		defaultShippingAddressId = _defaultShippingAddressIdSupplier.get();

		return defaultShippingAddressId;
	}

	public void setDefaultShippingAddressId(Long defaultShippingAddressId) {
		this.defaultShippingAddressId = defaultShippingAddressId;

		_defaultShippingAddressIdSupplier = () -> defaultShippingAddressId;
	}

	@JsonIgnore
	public void setDefaultShippingAddressId(
		UnsafeSupplier<Long, Exception>
			defaultShippingAddressIdUnsafeSupplier) {

		defaultShippingAddressId = null;

		_defaultShippingAddressIdSupplier = () -> {
			try {
				return defaultShippingAddressIdUnsafeSupplier.get();
			}
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
	protected Long defaultShippingAddressId;

	private Supplier<Long> _defaultShippingAddressIdSupplier = () -> null;

	@Schema
	public String getDescription() {
		if (description != null) {
			return description;
		}

		description = _descriptionSupplier.get();

		return description;
	}

	public void setDescription(String description) {
		this.description = description;

		_descriptionSupplier = () -> description;
	}

	@JsonIgnore
	public void setDescription(
		UnsafeSupplier<String, Exception> descriptionUnsafeSupplier) {

		description = null;

		_descriptionSupplier = () -> {
			try {
				return descriptionUnsafeSupplier.get();
			}
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
	protected String description;

	private Supplier<String> _descriptionSupplier = () -> null;

	@Schema(
		description = "The account's email domains. Users assigned to this account generally will have email addresses under one of these domains."
	)
	public String[] getDomains() {
		if (domains != null) {
			return domains;
		}

		domains = _domainsSupplier.get();

		return domains;
	}

	public void setDomains(String[] domains) {
		this.domains = domains;

		_domainsSupplier = () -> domains;
	}

	@JsonIgnore
	public void setDomains(
		UnsafeSupplier<String[], Exception> domainsUnsafeSupplier) {

		domains = null;

		_domainsSupplier = () -> {
			try {
				return domainsUnsafeSupplier.get();
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
		description = "The account's email domains. Users assigned to this account generally will have email addresses under one of these domains."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String[] domains;

	private Supplier<String[]> _domainsSupplier = () -> null;

	@Schema(description = "The optional external key of this account.")
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

	@GraphQLField(description = "The optional external key of this account.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String externalReferenceCode;

	private Supplier<String> _externalReferenceCodeSupplier = () -> null;

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
	public Long getLogoId() {
		if (logoId != null) {
			return logoId;
		}

		logoId = _logoIdSupplier.get();

		return logoId;
	}

	public void setLogoId(Long logoId) {
		this.logoId = logoId;

		_logoIdSupplier = () -> logoId;
	}

	@JsonIgnore
	public void setLogoId(
		UnsafeSupplier<Long, Exception> logoIdUnsafeSupplier) {

		logoId = null;

		_logoIdSupplier = () -> {
			try {
				return logoIdUnsafeSupplier.get();
			}
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
	protected Long logoId;

	private Supplier<Long> _logoIdSupplier = () -> null;

	@Schema
	public String getLogoURL() {
		if (logoURL != null) {
			return logoURL;
		}

		logoURL = _logoURLSupplier.get();

		return logoURL;
	}

	public void setLogoURL(String logoURL) {
		this.logoURL = logoURL;

		_logoURLSupplier = () -> logoURL;
	}

	@JsonIgnore
	public void setLogoURL(
		UnsafeSupplier<String, Exception> logoURLUnsafeSupplier) {

		logoURL = null;

		_logoURLSupplier = () -> {
			try {
				return logoURLUnsafeSupplier.get();
			}
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
	protected String logoURL;

	private Supplier<String> _logoURLSupplier = () -> null;

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
	@NotEmpty
	protected String name;

	private Supplier<String> _nameSupplier = () -> null;

	@Schema(description = "The number of this account's associated users.")
	public Integer getNumberOfUsers() {
		if (numberOfUsers != null) {
			return numberOfUsers;
		}

		numberOfUsers = _numberOfUsersSupplier.get();

		return numberOfUsers;
	}

	public void setNumberOfUsers(Integer numberOfUsers) {
		this.numberOfUsers = numberOfUsers;

		_numberOfUsersSupplier = () -> numberOfUsers;
	}

	@JsonIgnore
	public void setNumberOfUsers(
		UnsafeSupplier<Integer, Exception> numberOfUsersUnsafeSupplier) {

		numberOfUsers = null;

		_numberOfUsersSupplier = () -> {
			try {
				return numberOfUsersUnsafeSupplier.get();
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
		description = "The number of this account's associated users."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Integer numberOfUsers;

	private Supplier<Integer> _numberOfUsersSupplier = () -> null;

	@Schema
	public Long[] getOrganizationIds() {
		if (organizationIds != null) {
			return organizationIds;
		}

		organizationIds = _organizationIdsSupplier.get();

		return organizationIds;
	}

	public void setOrganizationIds(Long[] organizationIds) {
		this.organizationIds = organizationIds;

		_organizationIdsSupplier = () -> organizationIds;
	}

	@JsonIgnore
	public void setOrganizationIds(
		UnsafeSupplier<Long[], Exception> organizationIdsUnsafeSupplier) {

		organizationIds = null;

		_organizationIdsSupplier = () -> {
			try {
				return organizationIdsUnsafeSupplier.get();
			}
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
	protected Long[] organizationIds;

	private Supplier<Long[]> _organizationIdsSupplier = () -> null;

	@Schema
	public Long getParentAccountId() {
		if (parentAccountId != null) {
			return parentAccountId;
		}

		parentAccountId = _parentAccountIdSupplier.get();

		return parentAccountId;
	}

	public void setParentAccountId(Long parentAccountId) {
		this.parentAccountId = parentAccountId;

		_parentAccountIdSupplier = () -> parentAccountId;
	}

	@JsonIgnore
	public void setParentAccountId(
		UnsafeSupplier<Long, Exception> parentAccountIdUnsafeSupplier) {

		parentAccountId = null;

		_parentAccountIdSupplier = () -> {
			try {
				return parentAccountIdUnsafeSupplier.get();
			}
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
	protected Long parentAccountId;

	private Supplier<Long> _parentAccountIdSupplier = () -> null;

	@Schema(description = "The addresses linked to the account")
	@Valid
	public PostalAddress[] getPostalAddresses() {
		if (postalAddresses != null) {
			return postalAddresses;
		}

		postalAddresses = _postalAddressesSupplier.get();

		return postalAddresses;
	}

	public void setPostalAddresses(PostalAddress[] postalAddresses) {
		this.postalAddresses = postalAddresses;

		_postalAddressesSupplier = () -> postalAddresses;
	}

	@JsonIgnore
	public void setPostalAddresses(
		UnsafeSupplier<PostalAddress[], Exception>
			postalAddressesUnsafeSupplier) {

		postalAddresses = null;

		_postalAddressesSupplier = () -> {
			try {
				return postalAddressesUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The addresses linked to the account")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected PostalAddress[] postalAddresses;

	private Supplier<PostalAddress[]> _postalAddressesSupplier = () -> null;

	@Schema
	public Integer getStatus() {
		if (status != null) {
			return status;
		}

		status = _statusSupplier.get();

		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;

		_statusSupplier = () -> status;
	}

	@JsonIgnore
	public void setStatus(
		UnsafeSupplier<Integer, Exception> statusUnsafeSupplier) {

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer status;

	private Supplier<Integer> _statusSupplier = () -> null;

	@Schema(example = "Abcd1234")
	public String getTaxId() {
		if (taxId != null) {
			return taxId;
		}

		taxId = _taxIdSupplier.get();

		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;

		_taxIdSupplier = () -> taxId;
	}

	@JsonIgnore
	public void setTaxId(
		UnsafeSupplier<String, Exception> taxIdUnsafeSupplier) {

		taxId = null;

		_taxIdSupplier = () -> {
			try {
				return taxIdUnsafeSupplier.get();
			}
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
	protected String taxId;

	private Supplier<String> _taxIdSupplier = () -> null;

	@Schema
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

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Account)) {
			return false;
		}

		Account account = (Account)object;

		return Objects.equals(toString(), account.toString());
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

		if (accountUserAccounts != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountUserAccounts\": ");

			sb.append("[");

			for (int i = 0; i < accountUserAccounts.length; i++) {
				sb.append(String.valueOf(accountUserAccounts[i]));

				if ((i + 1) < accountUserAccounts.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (actions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actions\": ");

			sb.append(_toJSON(actions));
		}

		if (customFields != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"customFields\": ");

			sb.append("[");

			for (int i = 0; i < customFields.length; i++) {
				sb.append(String.valueOf(customFields[i]));

				if ((i + 1) < customFields.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (dateCreated != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateCreated\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dateCreated));

			sb.append("\"");
		}

		if (dateModified != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateModified\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dateModified));

			sb.append("\"");
		}

		if (defaultBillingAddressId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"defaultBillingAddressId\": ");

			sb.append(defaultBillingAddressId);
		}

		if (defaultShippingAddressId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"defaultShippingAddressId\": ");

			sb.append(defaultShippingAddressId);
		}

		if (description != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(description));

			sb.append("\"");
		}

		if (domains != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"domains\": ");

			sb.append("[");

			for (int i = 0; i < domains.length; i++) {
				sb.append("\"");

				sb.append(_escape(domains[i]));

				sb.append("\"");

				if ((i + 1) < domains.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
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

		if (logoId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"logoId\": ");

			sb.append(logoId);
		}

		if (logoURL != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"logoURL\": ");

			sb.append("\"");

			sb.append(_escape(logoURL));

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

		if (numberOfUsers != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfUsers\": ");

			sb.append(numberOfUsers);
		}

		if (organizationIds != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"organizationIds\": ");

			sb.append("[");

			for (int i = 0; i < organizationIds.length; i++) {
				sb.append(organizationIds[i]);

				if ((i + 1) < organizationIds.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (parentAccountId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parentAccountId\": ");

			sb.append(parentAccountId);
		}

		if (postalAddresses != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"postalAddresses\": ");

			sb.append("[");

			for (int i = 0; i < postalAddresses.length; i++) {
				sb.append(String.valueOf(postalAddresses[i]));

				if ((i + 1) < postalAddresses.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (status != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append(status);
		}

		if (taxId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"taxId\": ");

			sb.append("\"");

			sb.append(_escape(taxId));

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

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.admin.user.dto.v1_0.Account",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("Type")
	public static enum Type {

		BUSINESS("business"), GUEST("guest"), PERSON("person"),
		SUPPLIER("supplier");

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