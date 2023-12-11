/**
 * SPDX-FileCopyrightText:(c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.user.dto.v1_0;

import com.liferay.portal.kernel.util.StringUtil;

import java.util.Date;
import java.util.Map;

/**
 * @author Carlos Correa
 */
public abstract class UserAccountFieldProvider implements FieldProvider {

	public UserAccountFieldProvider(long id) {
		_id = id;
	}


	private Long _id;


	public abstract AccountBrief[] getAccountBriefs(Object item);

	public abstract Map<String, Map<String, String>> getActions(Object item);

	public abstract String getAdditionalName(Object item);

	public abstract String getAlternateName(Object item);

	public abstract Date getBirthDate(Object item);

	public abstract String getCurrentPassword(Object item);

	public abstract CustomField[] getCustomFields(Object item);

	public abstract String getDashboardURL(Object item);

	public abstract Date getDateCreated(Object item);

	public abstract Date getDateModified(Object item);

	public abstract String getEmailAddress(Object item);

	public abstract String getExternalReferenceCode(Object item);

	public abstract String getFamilyName(Object item);

	public abstract String getGivenName(Object item);

	public abstract String getHonorificPrefix(Object item);

	public abstract String getHonorificSuffix(Object item);

	public abstract Long getId(Object item);

	public abstract String getImage(Object item);

	public abstract Long getImageId(Object item);

	public abstract String getJobTitle(Object item);

	public abstract String[] getKeywords(Object item);

	public abstract String getLanguageDisplayName(Object item);

	public abstract String getLanguageId(Object item);

	public abstract Date getLastLoginDate(Object item);

	public abstract String getName(Object item);

	public abstract OrganizationBrief[] getOrganizationBriefs(Object item);

	public abstract String getPassword(Object item);

	public abstract String getProfileURL(Object item);

	public abstract RoleBrief[] getRoleBriefs(Object item);

	public abstract SiteBrief[] getSiteBriefs(Object item);

	public abstract UserAccount.Status getStatus(Object item);

	public abstract UserAccountContactInformation getUserAccountContactInformation(Object item);

	public abstract UserGroupBrief[] getUserGroupBriefs(Object item);

}