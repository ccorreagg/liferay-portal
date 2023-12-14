/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.user.dto.v1_0;

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
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "Represents an organization. Organizations can contain other organizations (suborganizations). Properties follow the [Organization](https://schema.org/Organization) specification.",
	value = "Organization"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Organization")
public class Organization implements Serializable {

	public static Organization toDTO(String json) {
		return ObjectMapperUtil.readValue(Organization.class, json);
	}

	public static Organization unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Organization.class, json);
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

	@Schema
	@Valid
	public Organization[] getChildOrganizations() {
		if (childOrganizations != null) {
			return childOrganizations;
		}

		childOrganizations = _childOrganizationsSupplier.get();

		return childOrganizations;
	}

	public void setChildOrganizations(Organization[] childOrganizations) {
		this.childOrganizations = childOrganizations;

		_childOrganizationsSupplier = () -> childOrganizations;
	}

	@JsonIgnore
	public void setChildOrganizations(
		UnsafeSupplier<Organization[], Exception>
			childOrganizationsUnsafeSupplier) {

		childOrganizations = null;

		_childOrganizationsSupplier = () -> {
			try {
				return childOrganizationsUnsafeSupplier.get();
			}
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
	protected Organization[] childOrganizations;

	private Supplier<Organization[]> _childOrganizationsSupplier = () -> null;

	@Schema(
		description = "The text of a comment associated with the organization."
	)
	public String getComment() {
		if (comment != null) {
			return comment;
		}

		comment = _commentSupplier.get();

		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;

		_commentSupplier = () -> comment;
	}

	@JsonIgnore
	public void setComment(
		UnsafeSupplier<String, Exception> commentUnsafeSupplier) {

		comment = null;

		_commentSupplier = () -> {
			try {
				return commentUnsafeSupplier.get();
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
		description = "The text of a comment associated with the organization."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String comment;

	private Supplier<String> _commentSupplier = () -> null;

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

	@Schema(description = "The organization's creation date.")
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

	@GraphQLField(description = "The organization's creation date.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateCreated;

	private Supplier<Date> _dateCreatedSupplier = () -> null;

	@Schema(
		description = "The most recent time any of the organization's fields changed."
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
		description = "The most recent time any of the organization's fields changed."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateModified;

	private Supplier<Date> _dateModifiedSupplier = () -> null;

	@Schema(description = "The optional external key of this organization.")
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
		description = "The optional external key of this organization."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String externalReferenceCode;

	private Supplier<String> _externalReferenceCodeSupplier = () -> null;

	@Schema(description = "The organization's ID.")
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

	@GraphQLField(description = "The organization's ID.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String id;

	private Supplier<String> _idSupplier = () -> null;

	@Schema(description = "A relative URL to the organization's image.")
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

	@GraphQLField(description = "A relative URL to the organization's image.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String image;

	private Supplier<String> _imageSupplier = () -> null;

	@Schema(description = "A list of keywords describing the organization.")
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

	@GraphQLField(
		description = "A list of keywords describing the organization."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String[] keywords;

	private Supplier<String[]> _keywordsSupplier = () -> null;

	@Schema(
		description = "The organization's postal information (country and region)."
	)
	@Valid
	public Location getLocation() {
		if (location != null) {
			return location;
		}

		location = _locationSupplier.get();

		return location;
	}

	public void setLocation(Location location) {
		this.location = location;

		_locationSupplier = () -> location;
	}

	@JsonIgnore
	public void setLocation(
		UnsafeSupplier<Location, Exception> locationUnsafeSupplier) {

		location = null;

		_locationSupplier = () -> {
			try {
				return locationUnsafeSupplier.get();
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
		description = "The organization's postal information (country and region)."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Location location;

	private Supplier<Location> _locationSupplier = () -> null;

	@Schema(description = "The organization's name.")
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

	@GraphQLField(description = "The organization's name.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String name;

	private Supplier<String> _nameSupplier = () -> null;

	@Schema(
		description = "The number of this organization's associated accounts."
	)
	public Integer getNumberOfAccounts() {
		if (numberOfAccounts != null) {
			return numberOfAccounts;
		}

		numberOfAccounts = _numberOfAccountsSupplier.get();

		return numberOfAccounts;
	}

	public void setNumberOfAccounts(Integer numberOfAccounts) {
		this.numberOfAccounts = numberOfAccounts;

		_numberOfAccountsSupplier = () -> numberOfAccounts;
	}

	@JsonIgnore
	public void setNumberOfAccounts(
		UnsafeSupplier<Integer, Exception> numberOfAccountsUnsafeSupplier) {

		numberOfAccounts = null;

		_numberOfAccountsSupplier = () -> {
			try {
				return numberOfAccountsUnsafeSupplier.get();
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
		description = "The number of this organization's associated accounts."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Integer numberOfAccounts;

	private Supplier<Integer> _numberOfAccountsSupplier = () -> null;

	@Schema(
		description = "The number of this organization's child organizations."
	)
	public Integer getNumberOfOrganizations() {
		if (numberOfOrganizations != null) {
			return numberOfOrganizations;
		}

		numberOfOrganizations = _numberOfOrganizationsSupplier.get();

		return numberOfOrganizations;
	}

	public void setNumberOfOrganizations(Integer numberOfOrganizations) {
		this.numberOfOrganizations = numberOfOrganizations;

		_numberOfOrganizationsSupplier = () -> numberOfOrganizations;
	}

	@JsonIgnore
	public void setNumberOfOrganizations(
		UnsafeSupplier<Integer, Exception>
			numberOfOrganizationsUnsafeSupplier) {

		numberOfOrganizations = null;

		_numberOfOrganizationsSupplier = () -> {
			try {
				return numberOfOrganizationsUnsafeSupplier.get();
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
		description = "The number of this organization's child organizations."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Integer numberOfOrganizations;

	private Supplier<Integer> _numberOfOrganizationsSupplier = () -> null;

	@Schema(description = "The number of this organization's associated users.")
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
		description = "The number of this organization's associated users."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Integer numberOfUsers;

	private Supplier<Integer> _numberOfUsersSupplier = () -> null;

	@Schema
	@Valid
	public Account[] getOrganizationAccounts() {
		if (organizationAccounts != null) {
			return organizationAccounts;
		}

		organizationAccounts = _organizationAccountsSupplier.get();

		return organizationAccounts;
	}

	public void setOrganizationAccounts(Account[] organizationAccounts) {
		this.organizationAccounts = organizationAccounts;

		_organizationAccountsSupplier = () -> organizationAccounts;
	}

	@JsonIgnore
	public void setOrganizationAccounts(
		UnsafeSupplier<Account[], Exception>
			organizationAccountsUnsafeSupplier) {

		organizationAccounts = null;

		_organizationAccountsSupplier = () -> {
			try {
				return organizationAccountsUnsafeSupplier.get();
			}
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
	protected Account[] organizationAccounts;

	private Supplier<Account[]> _organizationAccountsSupplier = () -> null;

	@Schema(
		description = "The organization's contact information, which includes email addresses, postal addresses, phone numbers, and web URLs. This is modeled internally as a `Contact`."
	)
	@Valid
	public OrganizationContactInformation getOrganizationContactInformation() {
		if (organizationContactInformation != null) {
			return organizationContactInformation;
		}

		organizationContactInformation =
			_organizationContactInformationSupplier.get();

		return organizationContactInformation;
	}

	public void setOrganizationContactInformation(
		OrganizationContactInformation organizationContactInformation) {

		this.organizationContactInformation = organizationContactInformation;

		_organizationContactInformationSupplier =
			() -> organizationContactInformation;
	}

	@JsonIgnore
	public void setOrganizationContactInformation(
		UnsafeSupplier<OrganizationContactInformation, Exception>
			organizationContactInformationUnsafeSupplier) {

		organizationContactInformation = null;

		_organizationContactInformationSupplier = () -> {
			try {
				return organizationContactInformationUnsafeSupplier.get();
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
		description = "The organization's contact information, which includes email addresses, postal addresses, phone numbers, and web URLs. This is modeled internally as a `Contact`."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected OrganizationContactInformation organizationContactInformation;

	private Supplier<OrganizationContactInformation>
		_organizationContactInformationSupplier = () -> null;

	@Schema(description = "The organization's parent organization.")
	@Valid
	public Organization getParentOrganization() {
		if (parentOrganization != null) {
			return parentOrganization;
		}

		parentOrganization = _parentOrganizationSupplier.get();

		return parentOrganization;
	}

	public void setParentOrganization(Organization parentOrganization) {
		this.parentOrganization = parentOrganization;

		_parentOrganizationSupplier = () -> parentOrganization;
	}

	@JsonIgnore
	public void setParentOrganization(
		UnsafeSupplier<Organization, Exception>
			parentOrganizationUnsafeSupplier) {

		parentOrganization = null;

		_parentOrganizationSupplier = () -> {
			try {
				return parentOrganizationUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The organization's parent organization.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Organization parentOrganization;

	private Supplier<Organization> _parentOrganizationSupplier = () -> null;

	@Schema(
		description = "A list of services the organization provides. This follows the [`Service`](https://www.schema.org/Service) specification."
	)
	@Valid
	public Service[] getServices() {
		if (services != null) {
			return services;
		}

		services = _servicesSupplier.get();

		return services;
	}

	public void setServices(Service[] services) {
		this.services = services;

		_servicesSupplier = () -> services;
	}

	@JsonIgnore
	public void setServices(
		UnsafeSupplier<Service[], Exception> servicesUnsafeSupplier) {

		services = null;

		_servicesSupplier = () -> {
			try {
				return servicesUnsafeSupplier.get();
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
		description = "A list of services the organization provides. This follows the [`Service`](https://www.schema.org/Service) specification."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Service[] services;

	private Supplier<Service[]> _servicesSupplier = () -> null;

	@Schema(description = "The tree path of the organization.")
	public String getTreePath() {
		if (treePath != null) {
			return treePath;
		}

		treePath = _treePathSupplier.get();

		return treePath;
	}

	public void setTreePath(String treePath) {
		this.treePath = treePath;

		_treePathSupplier = () -> treePath;
	}

	@JsonIgnore
	public void setTreePath(
		UnsafeSupplier<String, Exception> treePathUnsafeSupplier) {

		treePath = null;

		_treePathSupplier = () -> {
			try {
				return treePathUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The tree path of the organization.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String treePath;

	private Supplier<String> _treePathSupplier = () -> null;

	@Schema
	@Valid
	public UserAccount[] getUserAccounts() {
		if (userAccounts != null) {
			return userAccounts;
		}

		userAccounts = _userAccountsSupplier.get();

		return userAccounts;
	}

	public void setUserAccounts(UserAccount[] userAccounts) {
		this.userAccounts = userAccounts;

		_userAccountsSupplier = () -> userAccounts;
	}

	@JsonIgnore
	public void setUserAccounts(
		UnsafeSupplier<UserAccount[], Exception> userAccountsUnsafeSupplier) {

		userAccounts = null;

		_userAccountsSupplier = () -> {
			try {
				return userAccountsUnsafeSupplier.get();
			}
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
	protected UserAccount[] userAccounts;

	private Supplier<UserAccount[]> _userAccountsSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Organization)) {
			return false;
		}

		Organization organization = (Organization)object;

		return Objects.equals(toString(), organization.toString());
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

		if (childOrganizations != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"childOrganizations\": ");

			sb.append("[");

			for (int i = 0; i < childOrganizations.length; i++) {
				sb.append(String.valueOf(childOrganizations[i]));

				if ((i + 1) < childOrganizations.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (comment != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"comment\": ");

			sb.append("\"");

			sb.append(_escape(comment));

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

			sb.append("\"");

			sb.append(_escape(id));

			sb.append("\"");
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

		if (location != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"location\": ");

			sb.append(String.valueOf(location));
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

		if (numberOfAccounts != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfAccounts\": ");

			sb.append(numberOfAccounts);
		}

		if (numberOfOrganizations != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfOrganizations\": ");

			sb.append(numberOfOrganizations);
		}

		if (numberOfUsers != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfUsers\": ");

			sb.append(numberOfUsers);
		}

		if (organizationAccounts != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"organizationAccounts\": ");

			sb.append("[");

			for (int i = 0; i < organizationAccounts.length; i++) {
				sb.append(String.valueOf(organizationAccounts[i]));

				if ((i + 1) < organizationAccounts.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (organizationContactInformation != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"organizationContactInformation\": ");

			sb.append(String.valueOf(organizationContactInformation));
		}

		if (parentOrganization != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parentOrganization\": ");

			sb.append(String.valueOf(parentOrganization));
		}

		if (services != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"services\": ");

			sb.append("[");

			for (int i = 0; i < services.length; i++) {
				sb.append(String.valueOf(services[i]));

				if ((i + 1) < services.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (treePath != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"treePath\": ");

			sb.append("\"");

			sb.append(_escape(treePath));

			sb.append("\"");
		}

		if (userAccounts != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userAccounts\": ");

			sb.append("[");

			for (int i = 0; i < userAccounts.length; i++) {
				sb.append(String.valueOf(userAccounts[i]));

				if ((i + 1) < userAccounts.length) {
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
		defaultValue = "com.liferay.headless.admin.user.dto.v1_0.Organization",
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