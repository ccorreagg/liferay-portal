/**
 * SPDX-FileCopyrightText:(c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.user.dto.v1_0;

import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;
import com.liferay.portal.vulcan.dto.converter.FieldProvider;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

/**
 * @author Carlos Correa
 * @generated
 */
public abstract class UserAccountFieldProvider<T>
	implements FieldProvider<T, UserAccount> {

	public abstract AccountBrief[] getAccountBriefs(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract Map<String, Map<String, String>> getActions(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getAdditionalName(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getAlternateName(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract Date getBirthDate(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getCurrentPassword(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract CustomField[] getCustomFields(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getDashboardURL(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract Date getDateCreated(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract Date getDateModified(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getEmailAddress(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getExternalReferenceCode(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getFamilyName(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getGivenName(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getHonorificPrefix(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getHonorificSuffix(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract Long getId(DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getImage(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract Long getImageId(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getJobTitle(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String[] getKeywords(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getLanguageDisplayName(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getLanguageId(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract Date getLastLoginDate(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getName(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract OrganizationBrief[] getOrganizationBriefs(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getPassword(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract String getProfileURL(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract RoleBrief[] getRoleBriefs(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract SiteBrief[] getSiteBriefs(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract UserAccount.Status getStatus(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract UserAccountContactInformation
			getUserAccountContactInformation(
				DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public abstract UserGroupBrief[] getUserGroupBriefs(
			DTOConverterContext dtoConverterContext, T item)
		throws Exception;

	public final void setFieldValue(
			UserAccount userAccount, DTOConverterContext dtoConverterContext,
			String fieldName, T item)
		throws Exception {

		if (Objects.equals(fieldName, "accountBriefs")) {
			userAccount.setAccountBriefs(
				getAccountBriefs(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "actions")) {
			userAccount.setActions(getActions(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "additionalName")) {
			userAccount.setAdditionalName(
				getAdditionalName(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "alternateName")) {
			userAccount.setAlternateName(
				getAlternateName(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "birthDate")) {
			userAccount.setBirthDate(getBirthDate(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "currentPassword")) {
			userAccount.setCurrentPassword(
				getCurrentPassword(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "customFields")) {
			userAccount.setCustomFields(
				getCustomFields(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "dashboardURL")) {
			userAccount.setDashboardURL(
				getDashboardURL(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "dateCreated")) {
			userAccount.setDateCreated(
				getDateCreated(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "dateModified")) {
			userAccount.setDateModified(
				getDateModified(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "emailAddress")) {
			userAccount.setEmailAddress(
				getEmailAddress(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "externalReferenceCode")) {
			userAccount.setExternalReferenceCode(
				getExternalReferenceCode(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "familyName")) {
			userAccount.setFamilyName(getFamilyName(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "givenName")) {
			userAccount.setGivenName(getGivenName(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "honorificPrefix")) {
			userAccount.setHonorificPrefix(
				getHonorificPrefix(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "honorificSuffix")) {
			userAccount.setHonorificSuffix(
				getHonorificSuffix(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "id")) {
			userAccount.setId(getId(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "image")) {
			userAccount.setImage(getImage(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "imageId")) {
			userAccount.setImageId(getImageId(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "jobTitle")) {
			userAccount.setJobTitle(getJobTitle(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "keywords")) {
			userAccount.setKeywords(getKeywords(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "languageDisplayName")) {
			userAccount.setLanguageDisplayName(
				getLanguageDisplayName(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "languageId")) {
			userAccount.setLanguageId(getLanguageId(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "lastLoginDate")) {
			userAccount.setLastLoginDate(
				getLastLoginDate(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "name")) {
			userAccount.setName(getName(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "organizationBriefs")) {
			userAccount.setOrganizationBriefs(
				getOrganizationBriefs(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "password")) {
			userAccount.setPassword(getPassword(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "profileURL")) {
			userAccount.setProfileURL(getProfileURL(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "roleBriefs")) {
			userAccount.setRoleBriefs(getRoleBriefs(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "siteBriefs")) {
			userAccount.setSiteBriefs(getSiteBriefs(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "status")) {
			userAccount.setStatus(getStatus(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "userAccountContactInformation")) {
			userAccount.setUserAccountContactInformation(
				getUserAccountContactInformation(dtoConverterContext, item));
		}
		else if (Objects.equals(fieldName, "userGroupBriefs")) {
			userAccount.setUserGroupBriefs(
				getUserGroupBriefs(dtoConverterContext, item));
		}
	}

	protected Object item;

}