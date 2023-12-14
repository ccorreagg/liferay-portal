/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.account.dto.v1_0;

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
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Alessio Antonio Rendina
 * @generated
 */
@Generated("")
@GraphQLName("Account")
@JsonFilter("Liferay.Vulcan")
@Schema(requiredProperties = {"externalReferenceCode", "name"})
@XmlRootElement(name = "Account")
public class Account implements Serializable {

	public static Account toDTO(String json) {
		return ObjectMapperUtil.readValue(Account.class, json);
	}

	public static Account unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Account.class, json);
	}

	@Schema(
		example = "[{city=Diamond Bar, countryISOCode=US, defaultBilling=true, defaultShipping=true, description=right stairs, first room on the left, id=31130, latitude=33.9976884, longitude=-117.8144595, name=Alessio Antonio Rendina, phoneNumber=(123) 456 7890, regionISOCode=CA, street1=1400 Montefino Ave, street2=1st floor, street3=suite 200, zip=91765}]"
	)
	@Valid
	public AccountAddress[] getAccountAddresses() {
		if (accountAddresses != null) {
			return accountAddresses;
		}

		accountAddresses = _accountAddressesSupplier.get();

		return accountAddresses;
	}

	public void setAccountAddresses(AccountAddress[] accountAddresses) {
		this.accountAddresses = accountAddresses;

		_accountAddressesSupplier = () -> accountAddresses;
	}

	@JsonIgnore
	public void setAccountAddresses(
		UnsafeSupplier<AccountAddress[], Exception>
			accountAddressesUnsafeSupplier) {

		accountAddresses = null;

		_accountAddressesSupplier = () -> {
			try {
				return accountAddressesUnsafeSupplier.get();
			}
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
	protected AccountAddress[] accountAddresses;

	private Supplier<AccountAddress[]> _accountAddressesSupplier = () -> null;

	@Schema(
		example = "[{description={en_US=Account Administrator Description US, hr_HR=Account Administrator Description HR, hu_HU=Account Administrator Description HU}}, {id=31256, name=Alessio Antonio Rendina, roles=null}]"
	)
	@Valid
	public AccountMember[] getAccountMembers() {
		if (accountMembers != null) {
			return accountMembers;
		}

		accountMembers = _accountMembersSupplier.get();

		return accountMembers;
	}

	public void setAccountMembers(AccountMember[] accountMembers) {
		this.accountMembers = accountMembers;

		_accountMembersSupplier = () -> accountMembers;
	}

	@JsonIgnore
	public void setAccountMembers(
		UnsafeSupplier<AccountMember[], Exception>
			accountMembersUnsafeSupplier) {

		accountMembers = null;

		_accountMembersSupplier = () -> {
			try {
				return accountMembersUnsafeSupplier.get();
			}
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
	protected AccountMember[] accountMembers;

	private Supplier<AccountMember[]> _accountMembersSupplier = () -> null;

	@Schema(
		example = "[{id=20546, name=Liferay Italy, organizationId=20433, treePath=/Liferay/Liferay Italy}]"
	)
	@Valid
	public AccountOrganization[] getAccountOrganizations() {
		if (accountOrganizations != null) {
			return accountOrganizations;
		}

		accountOrganizations = _accountOrganizationsSupplier.get();

		return accountOrganizations;
	}

	public void setAccountOrganizations(
		AccountOrganization[] accountOrganizations) {

		this.accountOrganizations = accountOrganizations;

		_accountOrganizationsSupplier = () -> accountOrganizations;
	}

	@JsonIgnore
	public void setAccountOrganizations(
		UnsafeSupplier<AccountOrganization[], Exception>
			accountOrganizationsUnsafeSupplier) {

		accountOrganizations = null;

		_accountOrganizationsSupplier = () -> {
			try {
				return accountOrganizationsUnsafeSupplier.get();
			}
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
	protected AccountOrganization[] accountOrganizations;

	private Supplier<AccountOrganization[]> _accountOrganizationsSupplier =
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

	@DecimalMin("0")
	@Schema(example = "10130")
	public Long getDefaultBillingAccountAddressId() {
		if (defaultBillingAccountAddressId != null) {
			return defaultBillingAccountAddressId;
		}

		defaultBillingAccountAddressId =
			_defaultBillingAccountAddressIdSupplier.get();

		return defaultBillingAccountAddressId;
	}

	public void setDefaultBillingAccountAddressId(
		Long defaultBillingAccountAddressId) {

		this.defaultBillingAccountAddressId = defaultBillingAccountAddressId;

		_defaultBillingAccountAddressIdSupplier =
			() -> defaultBillingAccountAddressId;
	}

	@JsonIgnore
	public void setDefaultBillingAccountAddressId(
		UnsafeSupplier<Long, Exception>
			defaultBillingAccountAddressIdUnsafeSupplier) {

		defaultBillingAccountAddressId = null;

		_defaultBillingAccountAddressIdSupplier = () -> {
			try {
				return defaultBillingAccountAddressIdUnsafeSupplier.get();
			}
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
	protected Long defaultBillingAccountAddressId;

	private Supplier<Long> _defaultBillingAccountAddressIdSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "10131")
	public Long getDefaultShippingAccountAddressId() {
		if (defaultShippingAccountAddressId != null) {
			return defaultShippingAccountAddressId;
		}

		defaultShippingAccountAddressId =
			_defaultShippingAccountAddressIdSupplier.get();

		return defaultShippingAccountAddressId;
	}

	public void setDefaultShippingAccountAddressId(
		Long defaultShippingAccountAddressId) {

		this.defaultShippingAccountAddressId = defaultShippingAccountAddressId;

		_defaultShippingAccountAddressIdSupplier =
			() -> defaultShippingAccountAddressId;
	}

	@JsonIgnore
	public void setDefaultShippingAccountAddressId(
		UnsafeSupplier<Long, Exception>
			defaultShippingAccountAddressIdUnsafeSupplier) {

		defaultShippingAccountAddressId = null;

		_defaultShippingAccountAddressIdSupplier = () -> {
			try {
				return defaultShippingAccountAddressIdUnsafeSupplier.get();
			}
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
	protected Long defaultShippingAccountAddressId;

	private Supplier<Long> _defaultShippingAccountAddressIdSupplier =
		() -> null;

	@Schema(
		example = "[joe.1@commerce.com, joe.2@commerce.com, joe.3@commerce.com]"
	)
	public String[] getEmailAddresses() {
		if (emailAddresses != null) {
			return emailAddresses;
		}

		emailAddresses = _emailAddressesSupplier.get();

		return emailAddresses;
	}

	public void setEmailAddresses(String[] emailAddresses) {
		this.emailAddresses = emailAddresses;

		_emailAddressesSupplier = () -> emailAddresses;
	}

	@JsonIgnore
	public void setEmailAddresses(
		UnsafeSupplier<String[], Exception> emailAddressesUnsafeSupplier) {

		emailAddresses = null;

		_emailAddressesSupplier = () -> {
			try {
				return emailAddressesUnsafeSupplier.get();
			}
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
	protected String[] emailAddresses;

	private Supplier<String[]> _emailAddressesSupplier = () -> null;

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
	@NotEmpty
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

	@DecimalMin("0")
	@Schema(example = "20078")
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

	@Schema(example = "AB-34098-789-N")
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

	@Schema(example = "Account Name")
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
	public Boolean getRoot() {
		if (root != null) {
			return root;
		}

		root = _rootSupplier.get();

		return root;
	}

	public void setRoot(Boolean root) {
		this.root = root;

		_rootSupplier = () -> root;
	}

	@JsonIgnore
	public void setRoot(UnsafeSupplier<Boolean, Exception> rootUnsafeSupplier) {
		root = null;

		_rootSupplier = () -> {
			try {
				return rootUnsafeSupplier.get();
			}
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
	protected Boolean root;

	private Supplier<Boolean> _rootSupplier = () -> null;

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

	@DecimalMax("2")
	@DecimalMin("0")
	@Schema(example = "1")
	public Integer getType() {
		if (type != null) {
			return type;
		}

		type = _typeSupplier.get();

		return type;
	}

	public void setType(Integer type) {
		this.type = type;

		_typeSupplier = () -> type;
	}

	@JsonIgnore
	public void setType(UnsafeSupplier<Integer, Exception> typeUnsafeSupplier) {
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
	protected Integer type;

	private Supplier<Integer> _typeSupplier = () -> null;

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

		if (accountAddresses != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountAddresses\": ");

			sb.append("[");

			for (int i = 0; i < accountAddresses.length; i++) {
				sb.append(String.valueOf(accountAddresses[i]));

				if ((i + 1) < accountAddresses.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (accountMembers != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountMembers\": ");

			sb.append("[");

			for (int i = 0; i < accountMembers.length; i++) {
				sb.append(String.valueOf(accountMembers[i]));

				if ((i + 1) < accountMembers.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (accountOrganizations != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountOrganizations\": ");

			sb.append("[");

			for (int i = 0; i < accountOrganizations.length; i++) {
				sb.append(String.valueOf(accountOrganizations[i]));

				if ((i + 1) < accountOrganizations.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (active != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"active\": ");

			sb.append(active);
		}

		if (customFields != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"customFields\": ");

			sb.append(_toJSON(customFields));
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

		if (defaultBillingAccountAddressId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"defaultBillingAccountAddressId\": ");

			sb.append(defaultBillingAccountAddressId);
		}

		if (defaultShippingAccountAddressId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"defaultShippingAccountAddressId\": ");

			sb.append(defaultShippingAccountAddressId);
		}

		if (emailAddresses != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"emailAddresses\": ");

			sb.append("[");

			for (int i = 0; i < emailAddresses.length; i++) {
				sb.append("\"");

				sb.append(_escape(emailAddresses[i]));

				sb.append("\"");

				if ((i + 1) < emailAddresses.length) {
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

		if (root != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"root\": ");

			sb.append(root);
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

			sb.append(type);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.account.dto.v1_0.Account",
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