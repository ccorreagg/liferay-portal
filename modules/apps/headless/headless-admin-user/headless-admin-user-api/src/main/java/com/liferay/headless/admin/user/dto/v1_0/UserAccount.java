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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName(description = "Represents a user.", value = "UserAccount")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "UserAccount")
public class UserAccount implements Serializable {

	public static UserAccount toDTO(String json) {
		return ObjectMapperUtil.readValue(UserAccount.class, json);
	}

	public static UserAccount unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(UserAccount.class, json);
	}

	@Schema(description = "A list of the user's account.")
	@Valid
	public AccountBrief[] getAccountBriefs() {
		if (accountBriefs != null) {
			return accountBriefs;
		}

		accountBriefs = _accountBriefsSupplier.get();

		return accountBriefs;
	}

	public void setAccountBriefs(AccountBrief[] accountBriefs) {
		this.accountBriefs = accountBriefs;

		_accountBriefsSupplier = () -> accountBriefs;
	}

	@JsonIgnore
	public void setAccountBriefs(
		UnsafeSupplier<AccountBrief[], Exception> accountBriefsUnsafeSupplier) {

		accountBriefs = null;

		_accountBriefsSupplier = () -> {
			try {
				return accountBriefsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "A list of the user's account.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected AccountBrief[] accountBriefs;

	private Supplier<AccountBrief[]> _accountBriefsSupplier = () -> null;

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

	@Schema(description = "The user's additional name (e.g., middle name).")
	public String getAdditionalName() {
		if (additionalName != null) {
			return additionalName;
		}

		additionalName = _additionalNameSupplier.get();

		return additionalName;
	}

	public void setAdditionalName(String additionalName) {
		this.additionalName = additionalName;

		_additionalNameSupplier = () -> additionalName;
	}

	@JsonIgnore
	public void setAdditionalName(
		UnsafeSupplier<String, Exception> additionalNameUnsafeSupplier) {

		additionalName = null;

		_additionalNameSupplier = () -> {
			try {
				return additionalNameUnsafeSupplier.get();
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
		description = "The user's additional name (e.g., middle name)."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String additionalName;

	private Supplier<String> _additionalNameSupplier = () -> null;

	@Schema(description = "The user's alias or screen name.")
	public String getAlternateName() {
		if (alternateName != null) {
			return alternateName;
		}

		alternateName = _alternateNameSupplier.get();

		return alternateName;
	}

	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;

		_alternateNameSupplier = () -> alternateName;
	}

	@JsonIgnore
	public void setAlternateName(
		UnsafeSupplier<String, Exception> alternateNameUnsafeSupplier) {

		alternateName = null;

		_alternateNameSupplier = () -> {
			try {
				return alternateNameUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's alias or screen name.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String alternateName;

	private Supplier<String> _alternateNameSupplier = () -> null;

	@Schema(description = "The user's date of birth, in ISO 8601 format.")
	public Date getBirthDate() {
		if (birthDate != null) {
			return birthDate;
		}

		birthDate = _birthDateSupplier.get();

		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;

		_birthDateSupplier = () -> birthDate;
	}

	@JsonIgnore
	public void setBirthDate(
		UnsafeSupplier<Date, Exception> birthDateUnsafeSupplier) {

		birthDate = null;

		_birthDateSupplier = () -> {
			try {
				return birthDateUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's date of birth, in ISO 8601 format.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date birthDate;

	private Supplier<Date> _birthDateSupplier = () -> null;

	@Schema(
		description = "The user's current password. Used to authenticate a user when they attempt to update their own password."
	)
	public String getCurrentPassword() {
		if (currentPassword != null) {
			return currentPassword;
		}

		currentPassword = _currentPasswordSupplier.get();

		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;

		_currentPasswordSupplier = () -> currentPassword;
	}

	@JsonIgnore
	public void setCurrentPassword(
		UnsafeSupplier<String, Exception> currentPasswordUnsafeSupplier) {

		currentPassword = null;

		_currentPasswordSupplier = () -> {
			try {
				return currentPasswordUnsafeSupplier.get();
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
		description = "The user's current password. Used to authenticate a user when they attempt to update their own password."
	)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	protected String currentPassword;

	private Supplier<String> _currentPasswordSupplier = () -> null;

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

	@Schema(description = "A relative URL to the user's dashboard.")
	public String getDashboardURL() {
		if (dashboardURL != null) {
			return dashboardURL;
		}

		dashboardURL = _dashboardURLSupplier.get();

		return dashboardURL;
	}

	public void setDashboardURL(String dashboardURL) {
		this.dashboardURL = dashboardURL;

		_dashboardURLSupplier = () -> dashboardURL;
	}

	@JsonIgnore
	public void setDashboardURL(
		UnsafeSupplier<String, Exception> dashboardURLUnsafeSupplier) {

		dashboardURL = null;

		_dashboardURLSupplier = () -> {
			try {
				return dashboardURLUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "A relative URL to the user's dashboard.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String dashboardURL;

	private Supplier<String> _dashboardURLSupplier = () -> null;

	@Schema(description = "The creation date of the user's account.")
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

	@GraphQLField(description = "The creation date of the user's account.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateCreated;

	private Supplier<Date> _dateCreatedSupplier = () -> null;

	@Schema(
		description = "The last time any field of the user's account was changed."
	)
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

	@GraphQLField(
		description = "The last time any field of the user's account was changed."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateModified;

	private Supplier<Date> _dateModifiedSupplier = () -> null;

	@Schema(description = "The user's main email address.")
	public String getEmailAddress() {
		if (emailAddress != null) {
			return emailAddress;
		}

		emailAddress = _emailAddressSupplier.get();

		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;

		_emailAddressSupplier = () -> emailAddress;
	}

	@JsonIgnore
	public void setEmailAddress(
		UnsafeSupplier<String, Exception> emailAddressUnsafeSupplier) {

		emailAddress = null;

		_emailAddressSupplier = () -> {
			try {
				return emailAddressUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's main email address.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String emailAddress;

	private Supplier<String> _emailAddressSupplier = () -> null;

	@Schema(description = "The optional external key of this user account.")
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

	@GraphQLField(
		description = "The optional external key of this user account."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String externalReferenceCode;

	private Supplier<String> _externalReferenceCodeSupplier = () -> null;

	@Schema(description = "The user's surname (last name).")
	public String getFamilyName() {
		if (familyName != null) {
			return familyName;
		}

		familyName = _familyNameSupplier.get();

		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;

		_familyNameSupplier = () -> familyName;
	}

	@JsonIgnore
	public void setFamilyName(
		UnsafeSupplier<String, Exception> familyNameUnsafeSupplier) {

		familyName = null;

		_familyNameSupplier = () -> {
			try {
				return familyNameUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's surname (last name).")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String familyName;

	private Supplier<String> _familyNameSupplier = () -> null;

	@Schema(description = "The user's first name.")
	public String getGivenName() {
		if (givenName != null) {
			return givenName;
		}

		givenName = _givenNameSupplier.get();

		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;

		_givenNameSupplier = () -> givenName;
	}

	@JsonIgnore
	public void setGivenName(
		UnsafeSupplier<String, Exception> givenNameUnsafeSupplier) {

		givenName = null;

		_givenNameSupplier = () -> {
			try {
				return givenNameUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's first name.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String givenName;

	private Supplier<String> _givenNameSupplier = () -> null;

	@Schema(description = "The user's title (e.g., Dr., Mr., Mrs, Ms., etc.).")
	public String getHonorificPrefix() {
		if (honorificPrefix != null) {
			return honorificPrefix;
		}

		honorificPrefix = _honorificPrefixSupplier.get();

		return honorificPrefix;
	}

	public void setHonorificPrefix(String honorificPrefix) {
		this.honorificPrefix = honorificPrefix;

		_honorificPrefixSupplier = () -> honorificPrefix;
	}

	@JsonIgnore
	public void setHonorificPrefix(
		UnsafeSupplier<String, Exception> honorificPrefixUnsafeSupplier) {

		honorificPrefix = null;

		_honorificPrefixSupplier = () -> {
			try {
				return honorificPrefixUnsafeSupplier.get();
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
		description = "The user's title (e.g., Dr., Mr., Mrs, Ms., etc.)."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String honorificPrefix;

	private Supplier<String> _honorificPrefixSupplier = () -> null;

	@Schema(description = "The user's suffix (e.g., II, Jr., PhD, etc.).")
	public String getHonorificSuffix() {
		if (honorificSuffix != null) {
			return honorificSuffix;
		}

		honorificSuffix = _honorificSuffixSupplier.get();

		return honorificSuffix;
	}

	public void setHonorificSuffix(String honorificSuffix) {
		this.honorificSuffix = honorificSuffix;

		_honorificSuffixSupplier = () -> honorificSuffix;
	}

	@JsonIgnore
	public void setHonorificSuffix(
		UnsafeSupplier<String, Exception> honorificSuffixUnsafeSupplier) {

		honorificSuffix = null;

		_honorificSuffixSupplier = () -> {
			try {
				return honorificSuffixUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's suffix (e.g., II, Jr., PhD, etc.).")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String honorificSuffix;

	private Supplier<String> _honorificSuffixSupplier = () -> null;

	@Schema(description = "The user's ID.")
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

	@GraphQLField(description = "The user's ID.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema(description = "A relative URL to the user's profile image.")
	public String getImage() {
		if (image != null) {
			return image;
		}

		image = _imageSupplier.get();

		return image;
	}

	public void setImage(String image) {
		this.image = image;

		_imageSupplier = () -> image;
	}

	@JsonIgnore
	public void setImage(
		UnsafeSupplier<String, Exception> imageUnsafeSupplier) {

		image = null;

		_imageSupplier = () -> {
			try {
				return imageUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "A relative URL to the user's profile image.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String image;

	private Supplier<String> _imageSupplier = () -> null;

	@Schema(description = "The user's profile image id.")
	public Long getImageId() {
		if (imageId != null) {
			return imageId;
		}

		imageId = _imageIdSupplier.get();

		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;

		_imageIdSupplier = () -> imageId;
	}

	@JsonIgnore
	public void setImageId(
		UnsafeSupplier<Long, Exception> imageIdUnsafeSupplier) {

		imageId = null;

		_imageIdSupplier = () -> {
			try {
				return imageIdUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's profile image id.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long imageId;

	private Supplier<Long> _imageIdSupplier = () -> null;

	@Schema(description = "The user's job title.")
	public String getJobTitle() {
		if (jobTitle != null) {
			return jobTitle;
		}

		jobTitle = _jobTitleSupplier.get();

		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;

		_jobTitleSupplier = () -> jobTitle;
	}

	@JsonIgnore
	public void setJobTitle(
		UnsafeSupplier<String, Exception> jobTitleUnsafeSupplier) {

		jobTitle = null;

		_jobTitleSupplier = () -> {
			try {
				return jobTitleUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's job title.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String jobTitle;

	private Supplier<String> _jobTitleSupplier = () -> null;

	@Schema(description = "A list of keywords describing the user.")
	public String[] getKeywords() {
		if (keywords != null) {
			return keywords;
		}

		keywords = _keywordsSupplier.get();

		return keywords;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;

		_keywordsSupplier = () -> keywords;
	}

	@JsonIgnore
	public void setKeywords(
		UnsafeSupplier<String[], Exception> keywordsUnsafeSupplier) {

		keywords = null;

		_keywordsSupplier = () -> {
			try {
				return keywordsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "A list of keywords describing the user.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String[] keywords;

	private Supplier<String[]> _keywordsSupplier = () -> null;

	@Schema(description = "The user's preferred language.")
	public String getLanguageDisplayName() {
		if (languageDisplayName != null) {
			return languageDisplayName;
		}

		languageDisplayName = _languageDisplayNameSupplier.get();

		return languageDisplayName;
	}

	public void setLanguageDisplayName(String languageDisplayName) {
		this.languageDisplayName = languageDisplayName;

		_languageDisplayNameSupplier = () -> languageDisplayName;
	}

	@JsonIgnore
	public void setLanguageDisplayName(
		UnsafeSupplier<String, Exception> languageDisplayNameUnsafeSupplier) {

		languageDisplayName = null;

		_languageDisplayNameSupplier = () -> {
			try {
				return languageDisplayNameUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's preferred language.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String languageDisplayName;

	private Supplier<String> _languageDisplayNameSupplier = () -> null;

	@Schema(description = "The user's preferred language id.")
	public String getLanguageId() {
		if (languageId != null) {
			return languageId;
		}

		languageId = _languageIdSupplier.get();

		return languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;

		_languageIdSupplier = () -> languageId;
	}

	@JsonIgnore
	public void setLanguageId(
		UnsafeSupplier<String, Exception> languageIdUnsafeSupplier) {

		languageId = null;

		_languageIdSupplier = () -> {
			try {
				return languageIdUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's preferred language id.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String languageId;

	private Supplier<String> _languageIdSupplier = () -> null;

	@Schema(description = "The last time the user logged in.")
	public Date getLastLoginDate() {
		if (lastLoginDate != null) {
			return lastLoginDate;
		}

		lastLoginDate = _lastLoginDateSupplier.get();

		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;

		_lastLoginDateSupplier = () -> lastLoginDate;
	}

	@JsonIgnore
	public void setLastLoginDate(
		UnsafeSupplier<Date, Exception> lastLoginDateUnsafeSupplier) {

		lastLoginDate = null;

		_lastLoginDateSupplier = () -> {
			try {
				return lastLoginDateUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The last time the user logged in.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date lastLoginDate;

	private Supplier<Date> _lastLoginDateSupplier = () -> null;

	@Schema(description = "The user's full name.")
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

	@GraphQLField(description = "The user's full name.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String name;

	private Supplier<String> _nameSupplier = () -> null;

	@Schema(description = "A list of the user's organizations.")
	@Valid
	public OrganizationBrief[] getOrganizationBriefs() {
		if (organizationBriefs != null) {
			return organizationBriefs;
		}

		organizationBriefs = _organizationBriefsSupplier.get();

		return organizationBriefs;
	}

	public void setOrganizationBriefs(OrganizationBrief[] organizationBriefs) {
		this.organizationBriefs = organizationBriefs;

		_organizationBriefsSupplier = () -> organizationBriefs;
	}

	@JsonIgnore
	public void setOrganizationBriefs(
		UnsafeSupplier<OrganizationBrief[], Exception>
			organizationBriefsUnsafeSupplier) {

		organizationBriefs = null;

		_organizationBriefsSupplier = () -> {
			try {
				return organizationBriefsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "A list of the user's organizations.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected OrganizationBrief[] organizationBriefs;

	private Supplier<OrganizationBrief[]> _organizationBriefsSupplier =
		() -> null;

	@Schema(description = "The user's password.")
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

	@GraphQLField(description = "The user's password.")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	protected String password;

	private Supplier<String> _passwordSupplier = () -> null;

	@Schema(description = "A relative URL to the user's profile.")
	public String getProfileURL() {
		if (profileURL != null) {
			return profileURL;
		}

		profileURL = _profileURLSupplier.get();

		return profileURL;
	}

	public void setProfileURL(String profileURL) {
		this.profileURL = profileURL;

		_profileURLSupplier = () -> profileURL;
	}

	@JsonIgnore
	public void setProfileURL(
		UnsafeSupplier<String, Exception> profileURLUnsafeSupplier) {

		profileURL = null;

		_profileURLSupplier = () -> {
			try {
				return profileURLUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "A relative URL to the user's profile.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String profileURL;

	private Supplier<String> _profileURLSupplier = () -> null;

	@Schema(description = "A list of the user's roles.")
	@Valid
	public RoleBrief[] getRoleBriefs() {
		if (roleBriefs != null) {
			return roleBriefs;
		}

		roleBriefs = _roleBriefsSupplier.get();

		return roleBriefs;
	}

	public void setRoleBriefs(RoleBrief[] roleBriefs) {
		this.roleBriefs = roleBriefs;

		_roleBriefsSupplier = () -> roleBriefs;
	}

	@JsonIgnore
	public void setRoleBriefs(
		UnsafeSupplier<RoleBrief[], Exception> roleBriefsUnsafeSupplier) {

		roleBriefs = null;

		_roleBriefsSupplier = () -> {
			try {
				return roleBriefsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "A list of the user's roles.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected RoleBrief[] roleBriefs;

	private Supplier<RoleBrief[]> _roleBriefsSupplier = () -> null;

	@Schema(description = "A list of the user's sites.")
	@Valid
	public SiteBrief[] getSiteBriefs() {
		if (siteBriefs != null) {
			return siteBriefs;
		}

		siteBriefs = _siteBriefsSupplier.get();

		return siteBriefs;
	}

	public void setSiteBriefs(SiteBrief[] siteBriefs) {
		this.siteBriefs = siteBriefs;

		_siteBriefsSupplier = () -> siteBriefs;
	}

	@JsonIgnore
	public void setSiteBriefs(
		UnsafeSupplier<SiteBrief[], Exception> siteBriefsUnsafeSupplier) {

		siteBriefs = null;

		_siteBriefsSupplier = () -> {
			try {
				return siteBriefsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "A list of the user's sites.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected SiteBrief[] siteBriefs;

	private Supplier<SiteBrief[]> _siteBriefsSupplier = () -> null;

	@Schema(description = "The user's status.")
	@Valid
	public Status getStatus() {
		if (status != null) {
			return status;
		}

		status = _statusSupplier.get();

		return status;
	}

	@JsonIgnore
	public String getStatusAsString() {
		if (status == null) {
			return null;
		}

		return status.toString();
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

	@GraphQLField(description = "The user's status.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Status status;

	private Supplier<Status> _statusSupplier = () -> null;

	@Schema(description = "The user's contact information.")
	@Valid
	public UserAccountContactInformation getUserAccountContactInformation() {
		if (userAccountContactInformation != null) {
			return userAccountContactInformation;
		}

		userAccountContactInformation =
			_userAccountContactInformationSupplier.get();

		return userAccountContactInformation;
	}

	public void setUserAccountContactInformation(
		UserAccountContactInformation userAccountContactInformation) {

		this.userAccountContactInformation = userAccountContactInformation;

		_userAccountContactInformationSupplier =
			() -> userAccountContactInformation;
	}

	@JsonIgnore
	public void setUserAccountContactInformation(
		UnsafeSupplier<UserAccountContactInformation, Exception>
			userAccountContactInformationUnsafeSupplier) {

		userAccountContactInformation = null;

		_userAccountContactInformationSupplier = () -> {
			try {
				return userAccountContactInformationUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's contact information.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected UserAccountContactInformation userAccountContactInformation;

	private Supplier<UserAccountContactInformation>
		_userAccountContactInformationSupplier = () -> null;

	@Schema(description = "A list of the user's userGroups.")
	@Valid
	public UserGroupBrief[] getUserGroupBriefs() {
		if (userGroupBriefs != null) {
			return userGroupBriefs;
		}

		userGroupBriefs = _userGroupBriefsSupplier.get();

		return userGroupBriefs;
	}

	public void setUserGroupBriefs(UserGroupBrief[] userGroupBriefs) {
		this.userGroupBriefs = userGroupBriefs;

		_userGroupBriefsSupplier = () -> userGroupBriefs;
	}

	@JsonIgnore
	public void setUserGroupBriefs(
		UnsafeSupplier<UserGroupBrief[], Exception>
			userGroupBriefsUnsafeSupplier) {

		userGroupBriefs = null;

		_userGroupBriefsSupplier = () -> {
			try {
				return userGroupBriefsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "A list of the user's userGroups.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected UserGroupBrief[] userGroupBriefs;

	private Supplier<UserGroupBrief[]> _userGroupBriefsSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserAccount)) {
			return false;
		}

		UserAccount userAccount = (UserAccount)object;

		return Objects.equals(toString(), userAccount.toString());
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

		if (accountBriefs != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountBriefs\": ");

			sb.append("[");

			for (int i = 0; i < accountBriefs.length; i++) {
				sb.append(String.valueOf(accountBriefs[i]));

				if ((i + 1) < accountBriefs.length) {
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

		if (additionalName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"additionalName\": ");

			sb.append("\"");

			sb.append(_escape(additionalName));

			sb.append("\"");
		}

		if (alternateName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"alternateName\": ");

			sb.append("\"");

			sb.append(_escape(alternateName));

			sb.append("\"");
		}

		if (birthDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"birthDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(birthDate));

			sb.append("\"");
		}

		if (currentPassword != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"currentPassword\": ");

			sb.append("\"");

			sb.append(_escape(currentPassword));

			sb.append("\"");
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

		if (dashboardURL != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dashboardURL\": ");

			sb.append("\"");

			sb.append(_escape(dashboardURL));

			sb.append("\"");
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

		if (emailAddress != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"emailAddress\": ");

			sb.append("\"");

			sb.append(_escape(emailAddress));

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

		if (familyName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"familyName\": ");

			sb.append("\"");

			sb.append(_escape(familyName));

			sb.append("\"");
		}

		if (givenName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"givenName\": ");

			sb.append("\"");

			sb.append(_escape(givenName));

			sb.append("\"");
		}

		if (honorificPrefix != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"honorificPrefix\": ");

			sb.append("\"");

			sb.append(_escape(honorificPrefix));

			sb.append("\"");
		}

		if (honorificSuffix != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"honorificSuffix\": ");

			sb.append("\"");

			sb.append(_escape(honorificSuffix));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (image != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"image\": ");

			sb.append("\"");

			sb.append(_escape(image));

			sb.append("\"");
		}

		if (imageId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"imageId\": ");

			sb.append(imageId);
		}

		if (jobTitle != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"jobTitle\": ");

			sb.append("\"");

			sb.append(_escape(jobTitle));

			sb.append("\"");
		}

		if (keywords != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"keywords\": ");

			sb.append("[");

			for (int i = 0; i < keywords.length; i++) {
				sb.append("\"");

				sb.append(_escape(keywords[i]));

				sb.append("\"");

				if ((i + 1) < keywords.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (languageDisplayName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"languageDisplayName\": ");

			sb.append("\"");

			sb.append(_escape(languageDisplayName));

			sb.append("\"");
		}

		if (languageId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"languageId\": ");

			sb.append("\"");

			sb.append(_escape(languageId));

			sb.append("\"");
		}

		if (lastLoginDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"lastLoginDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(lastLoginDate));

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

		if (organizationBriefs != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"organizationBriefs\": ");

			sb.append("[");

			for (int i = 0; i < organizationBriefs.length; i++) {
				sb.append(String.valueOf(organizationBriefs[i]));

				if ((i + 1) < organizationBriefs.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
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

		if (profileURL != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"profileURL\": ");

			sb.append("\"");

			sb.append(_escape(profileURL));

			sb.append("\"");
		}

		if (roleBriefs != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"roleBriefs\": ");

			sb.append("[");

			for (int i = 0; i < roleBriefs.length; i++) {
				sb.append(String.valueOf(roleBriefs[i]));

				if ((i + 1) < roleBriefs.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (siteBriefs != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siteBriefs\": ");

			sb.append("[");

			for (int i = 0; i < siteBriefs.length; i++) {
				sb.append(String.valueOf(siteBriefs[i]));

				if ((i + 1) < siteBriefs.length) {
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

			sb.append("\"");

			sb.append(status);

			sb.append("\"");
		}

		if (userAccountContactInformation != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userAccountContactInformation\": ");

			sb.append(String.valueOf(userAccountContactInformation));
		}

		if (userGroupBriefs != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userGroupBriefs\": ");

			sb.append("[");

			for (int i = 0; i < userGroupBriefs.length; i++) {
				sb.append(String.valueOf(userGroupBriefs[i]));

				if ((i + 1) < userGroupBriefs.length) {
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
		defaultValue = "com.liferay.headless.admin.user.dto.v1_0.UserAccount",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("Status")
	public static enum Status {

		ACTIVE("Active"), INACTIVE("Inactive");

		@JsonCreator
		public static Status create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (Status status : values()) {
				if (Objects.equals(status.getValue(), value)) {
					return status;
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

		private Status(String value) {
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