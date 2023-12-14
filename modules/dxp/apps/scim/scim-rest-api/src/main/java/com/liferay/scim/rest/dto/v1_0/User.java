/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.scim.rest.dto.v1_0;

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

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Olivér Kecskeméty
 * @generated
 */
@Generated("")
@GraphQLName("User")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "User")
public class User implements Serializable {

	public static User toDTO(String json) {
		return ObjectMapperUtil.readValue(User.class, json);
	}

	public static User unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(User.class, json);
	}

	@Schema(
		description = "A Boolean value indicating the user's administrative status."
	)
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

	@GraphQLField(
		description = "A Boolean value indicating the user's administrative status."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean active;

	private Supplier<Boolean> _activeSupplier = () -> null;

	@Schema(description = "A physical mailing address for this user.")
	@Valid
	public Object[] getAddresses() {
		if (addresses != null) {
			return addresses;
		}

		addresses = _addressesSupplier.get();

		return addresses;
	}

	public void setAddresses(Object[] addresses) {
		this.addresses = addresses;

		_addressesSupplier = () -> addresses;
	}

	@JsonIgnore
	public void setAddresses(
		UnsafeSupplier<Object[], Exception> addressesUnsafeSupplier) {

		addresses = null;

		_addressesSupplier = () -> {
			try {
				return addressesUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "A physical mailing address for this user.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Object[] addresses;

	private Supplier<Object[]> _addressesSupplier = () -> null;

	@Schema(
		description = "The name of the user, suitable for display to end-users."
	)
	public String getDisplayName() {
		if (displayName != null) {
			return displayName;
		}

		displayName = _displayNameSupplier.get();

		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;

		_displayNameSupplier = () -> displayName;
	}

	@JsonIgnore
	public void setDisplayName(
		UnsafeSupplier<String, Exception> displayNameUnsafeSupplier) {

		displayName = null;

		_displayNameSupplier = () -> {
			try {
				return displayNameUnsafeSupplier.get();
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
		description = "The name of the user, suitable for display to end-users."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String displayName;

	private Supplier<String> _displayNameSupplier = () -> null;

	@Schema(description = "Email addresses for the User.")
	@Valid
	public MultiValuedAttribute[] getEmails() {
		if (emails != null) {
			return emails;
		}

		emails = _emailsSupplier.get();

		return emails;
	}

	public void setEmails(MultiValuedAttribute[] emails) {
		this.emails = emails;

		_emailsSupplier = () -> emails;
	}

	@JsonIgnore
	public void setEmails(
		UnsafeSupplier<MultiValuedAttribute[], Exception>
			emailsUnsafeSupplier) {

		emails = null;

		_emailsSupplier = () -> {
			try {
				return emailsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "Email addresses for the User.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected MultiValuedAttribute[] emails;

	private Supplier<MultiValuedAttribute[]> _emailsSupplier = () -> null;

	@Schema(
		description = "A list of entitlements for the user that represent a thing the user has."
	)
	@Valid
	public MultiValuedAttribute[] getEntitlements() {
		if (entitlements != null) {
			return entitlements;
		}

		entitlements = _entitlementsSupplier.get();

		return entitlements;
	}

	public void setEntitlements(MultiValuedAttribute[] entitlements) {
		this.entitlements = entitlements;

		_entitlementsSupplier = () -> entitlements;
	}

	@JsonIgnore
	public void setEntitlements(
		UnsafeSupplier<MultiValuedAttribute[], Exception>
			entitlementsUnsafeSupplier) {

		entitlements = null;

		_entitlementsSupplier = () -> {
			try {
				return entitlementsUnsafeSupplier.get();
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
		description = "A list of entitlements for the user that represent a thing the user has."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected MultiValuedAttribute[] entitlements;

	private Supplier<MultiValuedAttribute[]> _entitlementsSupplier = () -> null;

	@Schema(
		description = "A String that is an identifier for the resource as defined by the provisioning client."
	)
	public String getExternalId() {
		if (externalId != null) {
			return externalId;
		}

		externalId = _externalIdSupplier.get();

		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;

		_externalIdSupplier = () -> externalId;
	}

	@JsonIgnore
	public void setExternalId(
		UnsafeSupplier<String, Exception> externalIdUnsafeSupplier) {

		externalId = null;

		_externalIdSupplier = () -> {
			try {
				return externalIdUnsafeSupplier.get();
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
		description = "A String that is an identifier for the resource as defined by the provisioning client."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String externalId;

	private Supplier<String> _externalIdSupplier = () -> null;

	@Schema(
		description = "A list of groups to which the user belongs, either through direct membership, through nested groups, or dynamically calculated."
	)
	@Valid
	public MultiValuedAttribute[] getGroups() {
		if (groups != null) {
			return groups;
		}

		groups = _groupsSupplier.get();

		return groups;
	}

	public void setGroups(MultiValuedAttribute[] groups) {
		this.groups = groups;

		_groupsSupplier = () -> groups;
	}

	@JsonIgnore
	public void setGroups(
		UnsafeSupplier<MultiValuedAttribute[], Exception>
			groupsUnsafeSupplier) {

		groups = null;

		_groupsSupplier = () -> {
			try {
				return groupsUnsafeSupplier.get();
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
		description = "A list of groups to which the user belongs, either through direct membership, through nested groups, or dynamically calculated."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected MultiValuedAttribute[] groups;

	private Supplier<MultiValuedAttribute[]> _groupsSupplier = () -> null;

	@Schema(
		description = "A unique identifier for a SCIM resource as defined by the service provider."
	)
	public String getId() {
		if (id != null) {
			return id;
		}

		id = _idSupplier.get();

		return id;
	}

	public void setId(String id) {
		this.id = id;

		_idSupplier = () -> id;
	}

	@JsonIgnore
	public void setId(UnsafeSupplier<String, Exception> idUnsafeSupplier) {
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

	@GraphQLField(
		description = "A unique identifier for a SCIM resource as defined by the service provider."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String id;

	private Supplier<String> _idSupplier = () -> null;

	@Schema(description = "Instant messaging address for the user.")
	@Valid
	public MultiValuedAttribute[] getIms() {
		if (ims != null) {
			return ims;
		}

		ims = _imsSupplier.get();

		return ims;
	}

	public void setIms(MultiValuedAttribute[] ims) {
		this.ims = ims;

		_imsSupplier = () -> ims;
	}

	@JsonIgnore
	public void setIms(
		UnsafeSupplier<MultiValuedAttribute[], Exception> imsUnsafeSupplier) {

		ims = null;

		_imsSupplier = () -> {
			try {
				return imsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "Instant messaging address for the user.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected MultiValuedAttribute[] ims;

	private Supplier<MultiValuedAttribute[]> _imsSupplier = () -> null;

	@Schema(
		description = "Used to indicate the User's default location for purposes of localizing such items as currency, date time format, or numerical representations."
	)
	public String getLocale() {
		if (locale != null) {
			return locale;
		}

		locale = _localeSupplier.get();

		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;

		_localeSupplier = () -> locale;
	}

	@JsonIgnore
	public void setLocale(
		UnsafeSupplier<String, Exception> localeUnsafeSupplier) {

		locale = null;

		_localeSupplier = () -> {
			try {
				return localeUnsafeSupplier.get();
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
		description = "Used to indicate the User's default location for purposes of localizing such items as currency, date time format, or numerical representations."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String locale;

	private Supplier<String> _localeSupplier = () -> null;

	@Schema
	@Valid
	public Meta getMeta() {
		if (meta != null) {
			return meta;
		}

		meta = _metaSupplier.get();

		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;

		_metaSupplier = () -> meta;
	}

	@JsonIgnore
	public void setMeta(UnsafeSupplier<Meta, Exception> metaUnsafeSupplier) {
		meta = null;

		_metaSupplier = () -> {
			try {
				return metaUnsafeSupplier.get();
			}
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
	protected Meta meta;

	private Supplier<Meta> _metaSupplier = () -> null;

	@Schema(description = "The components of the user's name.")
	@Valid
	public Name getName() {
		if (name != null) {
			return name;
		}

		name = _nameSupplier.get();

		return name;
	}

	public void setName(Name name) {
		this.name = name;

		_nameSupplier = () -> name;
	}

	@JsonIgnore
	public void setName(UnsafeSupplier<Name, Exception> nameUnsafeSupplier) {
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

	@GraphQLField(description = "The components of the user's name.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Name name;

	private Supplier<Name> _nameSupplier = () -> null;

	@Schema(
		description = "The casual way to address the user in real life, e.g., \"Bob\" or \"Bobby\" instead of \"Robert\"."
	)
	public String getNickName() {
		if (nickName != null) {
			return nickName;
		}

		nickName = _nickNameSupplier.get();

		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;

		_nickNameSupplier = () -> nickName;
	}

	@JsonIgnore
	public void setNickName(
		UnsafeSupplier<String, Exception> nickNameUnsafeSupplier) {

		nickName = null;

		_nickNameSupplier = () -> {
			try {
				return nickNameUnsafeSupplier.get();
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
		description = "The casual way to address the user in real life, e.g., \"Bob\" or \"Bobby\" instead of \"Robert\"."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String nickName;

	private Supplier<String> _nickNameSupplier = () -> null;

	@Schema(
		description = "This attribute is intended to be used as a means to set, replace, or compare (i.e., filter for equality) a password."
	)
	public String getPassword() {
		if (password != null) {
			return password;
		}

		password = _passwordSupplier.get();

		return password;
	}

	public void setPassword(String password) {
		this.password = password;

		_passwordSupplier = () -> password;
	}

	@JsonIgnore
	public void setPassword(
		UnsafeSupplier<String, Exception> passwordUnsafeSupplier) {

		password = null;

		_passwordSupplier = () -> {
			try {
				return passwordUnsafeSupplier.get();
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
		description = "This attribute is intended to be used as a means to set, replace, or compare (i.e., filter for equality) a password."
	)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	protected String password;

	private Supplier<String> _passwordSupplier = () -> null;

	@Schema(description = "Phone numbers for the user.")
	@Valid
	public MultiValuedAttribute[] getPhoneNumbers() {
		if (phoneNumbers != null) {
			return phoneNumbers;
		}

		phoneNumbers = _phoneNumbersSupplier.get();

		return phoneNumbers;
	}

	public void setPhoneNumbers(MultiValuedAttribute[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;

		_phoneNumbersSupplier = () -> phoneNumbers;
	}

	@JsonIgnore
	public void setPhoneNumbers(
		UnsafeSupplier<MultiValuedAttribute[], Exception>
			phoneNumbersUnsafeSupplier) {

		phoneNumbers = null;

		_phoneNumbersSupplier = () -> {
			try {
				return phoneNumbersUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "Phone numbers for the user.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected MultiValuedAttribute[] phoneNumbers;

	private Supplier<MultiValuedAttribute[]> _phoneNumbersSupplier = () -> null;

	@Schema(
		description = "A URI that is a uniform resource locator that points to a resource location representing the user's image."
	)
	@Valid
	public MultiValuedAttribute[] getPhotos() {
		if (photos != null) {
			return photos;
		}

		photos = _photosSupplier.get();

		return photos;
	}

	public void setPhotos(MultiValuedAttribute[] photos) {
		this.photos = photos;

		_photosSupplier = () -> photos;
	}

	@JsonIgnore
	public void setPhotos(
		UnsafeSupplier<MultiValuedAttribute[], Exception>
			photosUnsafeSupplier) {

		photos = null;

		_photosSupplier = () -> {
			try {
				return photosUnsafeSupplier.get();
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
		description = "A URI that is a uniform resource locator that points to a resource location representing the user's image."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected MultiValuedAttribute[] photos;

	private Supplier<MultiValuedAttribute[]> _photosSupplier = () -> null;

	@Schema(
		description = "Indicates the user's preferred written or spoken languages and is generally used for selecting a localized user interface."
	)
	public String getPreferredLanguage() {
		if (preferredLanguage != null) {
			return preferredLanguage;
		}

		preferredLanguage = _preferredLanguageSupplier.get();

		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;

		_preferredLanguageSupplier = () -> preferredLanguage;
	}

	@JsonIgnore
	public void setPreferredLanguage(
		UnsafeSupplier<String, Exception> preferredLanguageUnsafeSupplier) {

		preferredLanguage = null;

		_preferredLanguageSupplier = () -> {
			try {
				return preferredLanguageUnsafeSupplier.get();
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
		description = "Indicates the user's preferred written or spoken languages and is generally used for selecting a localized user interface."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String preferredLanguage;

	private Supplier<String> _preferredLanguageSupplier = () -> null;

	@Schema(
		description = "A URI that is a uniform resource locator and that points to a location representing the user's online profile (e.g., a web page)."
	)
	public String getProfileUrl() {
		if (profileUrl != null) {
			return profileUrl;
		}

		profileUrl = _profileUrlSupplier.get();

		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;

		_profileUrlSupplier = () -> profileUrl;
	}

	@JsonIgnore
	public void setProfileUrl(
		UnsafeSupplier<String, Exception> profileUrlUnsafeSupplier) {

		profileUrl = null;

		_profileUrlSupplier = () -> {
			try {
				return profileUrlUnsafeSupplier.get();
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
		description = "A URI that is a uniform resource locator and that points to a location representing the user's online profile (e.g., a web page)."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String profileUrl;

	private Supplier<String> _profileUrlSupplier = () -> null;

	@Schema(
		description = "A list of roles for the user that collectively represent who the user is, e.g., \"Student\", \"Faculty\"."
	)
	@Valid
	public MultiValuedAttribute[] getRoles() {
		if (roles != null) {
			return roles;
		}

		roles = _rolesSupplier.get();

		return roles;
	}

	public void setRoles(MultiValuedAttribute[] roles) {
		this.roles = roles;

		_rolesSupplier = () -> roles;
	}

	@JsonIgnore
	public void setRoles(
		UnsafeSupplier<MultiValuedAttribute[], Exception> rolesUnsafeSupplier) {

		roles = null;

		_rolesSupplier = () -> {
			try {
				return rolesUnsafeSupplier.get();
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
		description = "A list of roles for the user that collectively represent who the user is, e.g., \"Student\", \"Faculty\"."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected MultiValuedAttribute[] roles;

	private Supplier<MultiValuedAttribute[]> _rolesSupplier = () -> null;

	@Schema(
		description = "A multi-valued list of strings indicating the namespaces of the SCIM schemas that define the attributes present in the current JSON structure."
	)
	public String[] getSchemas() {
		if (schemas != null) {
			return schemas;
		}

		schemas = _schemasSupplier.get();

		return schemas;
	}

	public void setSchemas(String[] schemas) {
		this.schemas = schemas;

		_schemasSupplier = () -> schemas;
	}

	@JsonIgnore
	public void setSchemas(
		UnsafeSupplier<String[], Exception> schemasUnsafeSupplier) {

		schemas = null;

		_schemasSupplier = () -> {
			try {
				return schemasUnsafeSupplier.get();
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
		description = "A multi-valued list of strings indicating the namespaces of the SCIM schemas that define the attributes present in the current JSON structure."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String[] schemas;

	private Supplier<String[]> _schemasSupplier = () -> null;

	@Schema(
		description = "The User's time zone, in IANA Time Zone database format, also known as the \"Olson\" time zone database format (e.g., \"America/Los_Angeles\")."
	)
	public String getTimezone() {
		if (timezone != null) {
			return timezone;
		}

		timezone = _timezoneSupplier.get();

		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;

		_timezoneSupplier = () -> timezone;
	}

	@JsonIgnore
	public void setTimezone(
		UnsafeSupplier<String, Exception> timezoneUnsafeSupplier) {

		timezone = null;

		_timezoneSupplier = () -> {
			try {
				return timezoneUnsafeSupplier.get();
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
		description = "The User's time zone, in IANA Time Zone database format, also known as the \"Olson\" time zone database format (e.g., \"America/Los_Angeles\")."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String timezone;

	private Supplier<String> _timezoneSupplier = () -> null;

	@Schema(description = "The user's title, such as \"Vice President\".")
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

	@GraphQLField(description = "The user's title, such as \"Vice President\".")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String title;

	private Supplier<String> _titleSupplier = () -> null;

	@Schema(
		description = "A service provider's unique identifier for the user, typically used by the user to directly authenticate to the service provider."
	)
	public String getUserName() {
		if (userName != null) {
			return userName;
		}

		userName = _userNameSupplier.get();

		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;

		_userNameSupplier = () -> userName;
	}

	@JsonIgnore
	public void setUserName(
		UnsafeSupplier<String, Exception> userNameUnsafeSupplier) {

		userName = null;

		_userNameSupplier = () -> {
			try {
				return userNameUnsafeSupplier.get();
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
		description = "A service provider's unique identifier for the user, typically used by the user to directly authenticate to the service provider."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String userName;

	private Supplier<String> _userNameSupplier = () -> null;

	@Schema(
		description = "Used to identify the relationship between the organization and the user."
	)
	public String getUserType() {
		if (userType != null) {
			return userType;
		}

		userType = _userTypeSupplier.get();

		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;

		_userTypeSupplier = () -> userType;
	}

	@JsonIgnore
	public void setUserType(
		UnsafeSupplier<String, Exception> userTypeUnsafeSupplier) {

		userType = null;

		_userTypeSupplier = () -> {
			try {
				return userTypeUnsafeSupplier.get();
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
		description = "Used to identify the relationship between the organization and the user."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String userType;

	private Supplier<String> _userTypeSupplier = () -> null;

	@Schema(
		description = "A list of certificates associated with the resource (e.g., a User)."
	)
	@Valid
	public MultiValuedAttribute[] getX509Certificates() {
		if (x509Certificates != null) {
			return x509Certificates;
		}

		x509Certificates = _x509CertificatesSupplier.get();

		return x509Certificates;
	}

	public void setX509Certificates(MultiValuedAttribute[] x509Certificates) {
		this.x509Certificates = x509Certificates;

		_x509CertificatesSupplier = () -> x509Certificates;
	}

	@JsonIgnore
	public void setX509Certificates(
		UnsafeSupplier<MultiValuedAttribute[], Exception>
			x509CertificatesUnsafeSupplier) {

		x509Certificates = null;

		_x509CertificatesSupplier = () -> {
			try {
				return x509CertificatesUnsafeSupplier.get();
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
		description = "A list of certificates associated with the resource (e.g., a User)."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected MultiValuedAttribute[] x509Certificates;

	private Supplier<MultiValuedAttribute[]> _x509CertificatesSupplier =
		() -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof User)) {
			return false;
		}

		User user = (User)object;

		return Objects.equals(toString(), user.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (active != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"active\": ");

			sb.append(active);
		}

		if (addresses != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"addresses\": ");

			sb.append("[");

			for (int i = 0; i < addresses.length; i++) {
				sb.append("\"");

				sb.append(_escape(addresses[i]));

				sb.append("\"");

				if ((i + 1) < addresses.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (displayName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"displayName\": ");

			sb.append("\"");

			sb.append(_escape(displayName));

			sb.append("\"");
		}

		if (emails != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"emails\": ");

			sb.append("[");

			for (int i = 0; i < emails.length; i++) {
				sb.append(String.valueOf(emails[i]));

				if ((i + 1) < emails.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (entitlements != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"entitlements\": ");

			sb.append("[");

			for (int i = 0; i < entitlements.length; i++) {
				sb.append(String.valueOf(entitlements[i]));

				if ((i + 1) < entitlements.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (externalId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"externalId\": ");

			sb.append("\"");

			sb.append(_escape(externalId));

			sb.append("\"");
		}

		if (groups != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"groups\": ");

			sb.append("[");

			for (int i = 0; i < groups.length; i++) {
				sb.append(String.valueOf(groups[i]));

				if ((i + 1) < groups.length) {
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

			sb.append("\"");

			sb.append(_escape(id));

			sb.append("\"");
		}

		if (ims != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ims\": ");

			sb.append("[");

			for (int i = 0; i < ims.length; i++) {
				sb.append(String.valueOf(ims[i]));

				if ((i + 1) < ims.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (locale != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"locale\": ");

			sb.append("\"");

			sb.append(_escape(locale));

			sb.append("\"");
		}

		if (meta != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"meta\": ");

			sb.append(String.valueOf(meta));
		}

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append(String.valueOf(name));
		}

		if (nickName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"nickName\": ");

			sb.append("\"");

			sb.append(_escape(nickName));

			sb.append("\"");
		}

		if (password != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"password\": ");

			sb.append("\"");

			sb.append(_escape(password));

			sb.append("\"");
		}

		if (phoneNumbers != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"phoneNumbers\": ");

			sb.append("[");

			for (int i = 0; i < phoneNumbers.length; i++) {
				sb.append(String.valueOf(phoneNumbers[i]));

				if ((i + 1) < phoneNumbers.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (photos != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"photos\": ");

			sb.append("[");

			for (int i = 0; i < photos.length; i++) {
				sb.append(String.valueOf(photos[i]));

				if ((i + 1) < photos.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (preferredLanguage != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"preferredLanguage\": ");

			sb.append("\"");

			sb.append(_escape(preferredLanguage));

			sb.append("\"");
		}

		if (profileUrl != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"profileUrl\": ");

			sb.append("\"");

			sb.append(_escape(profileUrl));

			sb.append("\"");
		}

		if (roles != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"roles\": ");

			sb.append("[");

			for (int i = 0; i < roles.length; i++) {
				sb.append(String.valueOf(roles[i]));

				if ((i + 1) < roles.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (schemas != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"schemas\": ");

			sb.append("[");

			for (int i = 0; i < schemas.length; i++) {
				sb.append("\"");

				sb.append(_escape(schemas[i]));

				sb.append("\"");

				if ((i + 1) < schemas.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (timezone != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"timezone\": ");

			sb.append("\"");

			sb.append(_escape(timezone));

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

		if (userName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userName\": ");

			sb.append("\"");

			sb.append(_escape(userName));

			sb.append("\"");
		}

		if (userType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userType\": ");

			sb.append("\"");

			sb.append(_escape(userType));

			sb.append("\"");
		}

		if (x509Certificates != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"x509Certificates\": ");

			sb.append("[");

			for (int i = 0; i < x509Certificates.length; i++) {
				sb.append(String.valueOf(x509Certificates[i]));

				if ((i + 1) < x509Certificates.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.scim.rest.dto.v1_0.User",
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