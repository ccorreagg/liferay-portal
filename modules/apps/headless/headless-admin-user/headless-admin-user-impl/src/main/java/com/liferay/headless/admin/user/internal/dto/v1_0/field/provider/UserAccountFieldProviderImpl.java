/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.user.internal.dto.v1_0.field.provider;

import com.liferay.account.constants.AccountConstants;
import com.liferay.account.model.AccountEntry;
import com.liferay.account.model.AccountEntryUserRel;
import com.liferay.account.model.AccountRole;
import com.liferay.account.service.AccountEntryLocalService;
import com.liferay.account.service.AccountEntryUserRelLocalService;
import com.liferay.account.service.AccountRoleLocalService;
import com.liferay.asset.kernel.model.AssetTag;
import com.liferay.asset.kernel.service.AssetTagLocalService;
import com.liferay.headless.admin.user.dto.v1_0.AccountBrief;
import com.liferay.headless.admin.user.dto.v1_0.CustomField;
import com.liferay.headless.admin.user.dto.v1_0.EmailAddress;
import com.liferay.headless.admin.user.dto.v1_0.OrganizationBrief;
import com.liferay.headless.admin.user.dto.v1_0.Phone;
import com.liferay.headless.admin.user.dto.v1_0.PostalAddress;
import com.liferay.headless.admin.user.dto.v1_0.RoleBrief;
import com.liferay.headless.admin.user.dto.v1_0.SiteBrief;
import com.liferay.headless.admin.user.dto.v1_0.UserAccount;
import com.liferay.headless.admin.user.dto.v1_0.UserAccountContactInformation;
import com.liferay.headless.admin.user.dto.v1_0.UserAccountFieldProvider;
import com.liferay.headless.admin.user.dto.v1_0.UserGroupBrief;
import com.liferay.headless.admin.user.dto.v1_0.WebUrl;
import com.liferay.headless.admin.user.internal.dto.v1_0.util.CustomFieldsUtil;
import com.liferay.headless.admin.user.internal.dto.v1_0.util.EmailAddressUtil;
import com.liferay.headless.admin.user.internal.dto.v1_0.util.PhoneUtil;
import com.liferay.headless.admin.user.internal.dto.v1_0.util.PostalAddressUtil;
import com.liferay.headless.admin.user.internal.dto.v1_0.util.ServiceBuilderListTypeUtil;
import com.liferay.headless.admin.user.internal.dto.v1_0.util.WebUrlUtil;
import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.Contact;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.security.permission.UserBag;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.service.UserGroupLocalService;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.security.permission.UserBagFactoryUtil;
import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;
import com.liferay.portal.vulcan.dto.converter.FieldProvider;
import com.liferay.portal.vulcan.util.LocalizedMapUtil;

import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(
	property = "dto.class.name=com.liferay.headless.admin.user.dto.v1_0.UserAccount",
	service = FieldProvider.class
)
public class UserAccountFieldProviderImpl
	extends UserAccountFieldProvider<User> {

	@Override
	public AccountBrief[] getAccountBriefs(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return TransformUtil.transformToArray(
			_accountEntryUserRelLocalService.
				getAccountEntryUserRelsByAccountUserId(user.getUserId()),
			accountEntryUserRel -> _toAccountBrief(
				accountEntryUserRel, dtoConverterContext, user),
			AccountBrief.class);
	}

	@Override
	public Map<String, Map<String, String>> getActions(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return dtoConverterContext.getActions();
	}

	@Override
	public String getAdditionalName(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return user.getMiddleName();
	}

	@Override
	public String getAlternateName(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return user.getScreenName();
	}

	@Override
	public Date getBirthDate(DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return user.getBirthday();
	}

	@Override
	public String getCurrentPassword(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return null;
	}

	@Override
	public CustomField[] getCustomFields(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return CustomFieldsUtil.toCustomFields(
			dtoConverterContext.isAcceptAllLanguages(), User.class.getName(),
			user.getUserId(), user.getCompanyId(),
			dtoConverterContext.getLocale());
	}

	@Override
	public String getDashboardURL(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		Group group = user.getGroup();

		if (group == null) {
			return null;
		}

		return group.getDisplayURL(_getThemeDisplay(group), true);
	}

	@Override
	public Date getDateCreated(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return user.getCreateDate();
	}

	@Override
	public Date getDateModified(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return user.getModifiedDate();
	}

	@Override
	public String getEmailAddress(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return user.getEmailAddress();
	}

	@Override
	public String getExternalReferenceCode(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return user.getExternalReferenceCode();
	}

	@Override
	public String getFamilyName(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return user.getLastName();
	}

	@Override
	public String getGivenName(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return user.getFirstName();
	}

	@Override
	public String getHonorificPrefix(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		Contact contact = user.getContact();

		return ServiceBuilderListTypeUtil.getServiceBuilderListTypeMessage(
			contact.getPrefixListTypeId(), dtoConverterContext.getLocale());
	}

	@Override
	public String getHonorificSuffix(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		Contact contact = user.getContact();

		return ServiceBuilderListTypeUtil.getServiceBuilderListTypeMessage(
			contact.getPrefixListTypeId(), dtoConverterContext.getLocale());
	}

	@Override
	public Long getId(DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return user.getUserId();
	}

	@Override
	public String getImage(DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		if (user.getPortraitId() == 0) {
			return null;
		}

		ThemeDisplay themeDisplay = new ThemeDisplay() {
			{
				setPathImage(_portal.getPathImage());
			}
		};

		return user.getPortraitURL(themeDisplay);
	}

	@Override
	public Long getImageId(DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return user.getPortraitId();
	}

	@Override
	public String getJobTitle(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return user.getJobTitle();
	}

	@Override
	public String[] getKeywords(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return ListUtil.toArray(
			_assetTagLocalService.getTags(
				User.class.getName(), user.getUserId()),
			AssetTag.NAME_ACCESSOR);
	}

	@Override
	public String getLanguageDisplayName(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		if (Validator.isNull(user.getLanguageId())) {
			return null;
		}

		Locale locale = LocaleUtil.fromLanguageId(user.getLanguageId());

		return locale.getDisplayName(dtoConverterContext.getLocale());
	}

	@Override
	public String getLanguageId(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return user.getLanguageId();
	}

	@Override
	public Date getLastLoginDate(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return user.getLastLoginDate();
	}

	@Override
	public String getName(DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return user.getFullName();
	}

	@Override
	public OrganizationBrief[] getOrganizationBriefs(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return TransformUtil.transformToArray(
			user.getOrganizations(),
			organization -> _toOrganizationBrief(
				dtoConverterContext, organization, user),
			OrganizationBrief.class);
	}

	@Override
	public String getPassword(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return null;
	}

	@Override
	public String getProfileURL(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		Group group = user.getGroup();

		if (group == null) {
			return null;
		}

		return group.getDisplayURL(_getThemeDisplay(group));
	}

	@Override
	public RoleBrief[] getRoleBriefs(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		UserBag userBag = UserBagFactoryUtil.create(user.getUserId());

		return _toRoleBriefs(dtoConverterContext, userBag.getRoles());
	}

	@Override
	public SiteBrief[] getSiteBriefs(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return TransformUtil.transformToArray(
			_groupLocalService.getUserSitesGroups(user.getUserId()),
			group -> _toSiteBrief(dtoConverterContext, group, user),
			SiteBrief.class);
	}

	@Override
	public UserAccount.Status getStatus(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		if (user.getStatus() == WorkflowConstants.STATUS_APPROVED) {
			return UserAccount.Status.ACTIVE;
		}

		if (user.getStatus() == WorkflowConstants.STATUS_INACTIVE) {
			return UserAccount.Status.INACTIVE;
		}

		return null;
	}

	@Override
	public UserAccountContactInformation getUserAccountContactInformation(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		Contact contact = user.getContact();

		return new UserAccountContactInformation() {
			{
				emailAddresses = TransformUtil.transformToArray(
					user.getEmailAddresses(), EmailAddressUtil::toEmailAddress,
					EmailAddress.class);
				facebook = contact.getFacebookSn();
				jabber = contact.getJabberSn();
				postalAddresses = TransformUtil.transformToArray(
					user.getAddresses(),
					address -> PostalAddressUtil.toPostalAddress(
						dtoConverterContext.isAcceptAllLanguages(), address,
						user.getCompanyId(), dtoConverterContext.getLocale()),
					PostalAddress.class);
				skype = contact.getSkypeSn();
				sms = contact.getSmsSn();
				telephones = TransformUtil.transformToArray(
					user.getPhones(), PhoneUtil::toPhone, Phone.class);
				twitter = contact.getTwitterSn();
				webUrls = TransformUtil.transformToArray(
					user.getWebsites(), WebUrlUtil::toWebUrl, WebUrl.class);
			}
		};
	}

	@Override
	public UserGroupBrief[] getUserGroupBriefs(
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		return TransformUtil.transformToArray(
			_userGroupLocalService.getUserUserGroups(user.getUserId()),
			userGroup -> _toUserGroupBrief(userGroup), UserGroupBrief.class);
	}

	private ThemeDisplay _getThemeDisplay(Group group) {
		return new ThemeDisplay() {
			{
				setPortalURL(StringPool.BLANK);

				if (group != null) {
					setSiteGroupId(group.getGroupId());
				}
			}
		};
	}

	private AccountBrief _toAccountBrief(
			AccountEntryUserRel accountEntryUserRel,
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		if (accountEntryUserRel.getAccountEntryId() ==
				AccountConstants.ACCOUNT_ENTRY_ID_DEFAULT) {

			return null;
		}

		AccountEntry accountEntry = _accountEntryLocalService.getAccountEntry(
			accountEntryUserRel.getAccountEntryId());

		return new AccountBrief() {
			{
				externalReferenceCode = accountEntry.getExternalReferenceCode();
				id = accountEntry.getAccountEntryId();
				name = accountEntry.getName();
				roleBriefs = TransformUtil.transformToArray(
					_accountRoleLocalService.getAccountRoles(
						accountEntry.getAccountEntryId(), user.getUserId()),
					accountRole -> _toRoleBrief(
						accountRole, dtoConverterContext),
					RoleBrief.class);
			}
		};
	}

	private OrganizationBrief _toOrganizationBrief(
			DTOConverterContext dtoConverterContext, Organization organization,
			User user)
		throws Exception {

		return new OrganizationBrief() {
			{
				id = organization.getOrganizationId();
				name = organization.getName();
				roleBriefs = _toRoleBriefs(
					dtoConverterContext,
					_roleLocalService.getUserGroupRoles(
						user.getUserId(), organization.getGroupId()));
			}
		};
	}

	private RoleBrief _toRoleBrief(
			AccountRole accountRole, DTOConverterContext dtoConverterContext)
		throws Exception {

		Role role = accountRole.getRole();

		return new RoleBrief() {
			{
				id = accountRole.getAccountRoleId();
				name = accountRole.getRoleName();
				name_i18n = LocalizedMapUtil.getI18nMap(
					dtoConverterContext.isAcceptAllLanguages(),
					role.getTitleMap());
			}
		};
	}

	private RoleBrief _toRoleBrief(
		DTOConverterContext dtoConverterContext, Role role) {

		return new RoleBrief() {
			{
				id = role.getRoleId();
				name = role.getTitle(dtoConverterContext.getLocale());
				name_i18n = LocalizedMapUtil.getI18nMap(
					dtoConverterContext.isAcceptAllLanguages(),
					role.getTitleMap());
			}
		};
	}

	private RoleBrief[] _toRoleBriefs(
			DTOConverterContext dtoConverterContext, Collection<Role> roles)
		throws Exception {

		return TransformUtil.transformToArray(
			roles,
			role -> {
				if (!_roleModelResourcePermission.contains(
						PermissionThreadLocal.getPermissionChecker(), role,
						ActionKeys.VIEW)) {

					return null;
				}

				return _toRoleBrief(dtoConverterContext, role);
			},
			RoleBrief.class);
	}

	private SiteBrief _toSiteBrief(
			DTOConverterContext dtoConverterContext, Group group, User user)
		throws Exception {

		return new SiteBrief() {
			{
				descriptiveName = group.getDescriptiveName(
					dtoConverterContext.getLocale());
				descriptiveName_i18n = LocalizedMapUtil.getI18nMap(
					dtoConverterContext.isAcceptAllLanguages(),
					group.getDescriptiveNameMap());
				id = group.getGroupId();
				name = group.getName(dtoConverterContext.getLocale());
				name_i18n = LocalizedMapUtil.getI18nMap(
					dtoConverterContext.isAcceptAllLanguages(),
					group.getNameMap());
				roleBriefs = _toRoleBriefs(
					dtoConverterContext,
					_roleLocalService.getUserGroupRoles(
						user.getUserId(), group.getGroupId()));
			}
		};
	}

	private UserGroupBrief _toUserGroupBrief(UserGroup userGroup)
		throws Exception {

		return new UserGroupBrief() {
			{
				description = userGroup.getDescription();
				id = userGroup.getGroupId();
				name = userGroup.getName();
			}
		};
	}

	@Reference
	private AccountEntryLocalService _accountEntryLocalService;

	@Reference
	private AccountEntryUserRelLocalService _accountEntryUserRelLocalService;

	@Reference
	private AccountRoleLocalService _accountRoleLocalService;

	@Reference
	private AssetTagLocalService _assetTagLocalService;

	@Reference
	private GroupLocalService _groupLocalService;

	@Reference
	private Portal _portal;

	@Reference
	private RoleLocalService _roleLocalService;

	@Reference(
		target = "(model.class.name=com.liferay.portal.kernel.model.Role)"
	)
	private ModelResourcePermission<Role> _roleModelResourcePermission;

	@Reference
	private UserGroupLocalService _userGroupLocalService;

}