/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.site.cms.site.initializer.internal.display.context;

import com.liferay.depot.model.DepotEntry;
import com.liferay.depot.service.DepotEntryLocalService;
import com.liferay.document.library.configuration.DLConfiguration;
import com.liferay.frontend.data.set.model.FDSActionDropdownItem;
import com.liferay.frontend.data.set.model.FDSActionDropdownItemBuilder;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItem;
import com.liferay.object.constants.ObjectEntryFolderConstants;
import com.liferay.object.constants.ObjectFolderConstants;
import com.liferay.object.model.ObjectEntryFolder;
import com.liferay.object.service.ObjectDefinitionService;
import com.liferay.object.service.ObjectDefinitionSettingLocalService;
import com.liferay.object.service.ObjectEntryFolderLocalService;
import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.GroupConstants;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.sharing.security.permission.SharingEntryAction;
import com.liferay.sharing.service.SharingEntryLocalService;
import com.liferay.site.cms.site.initializer.internal.constants.CMSSiteInitializerFDSNames;
import com.liferay.site.cms.site.initializer.internal.util.ActionUtil;
import com.liferay.translation.exporter.TranslationInfoItemFieldValuesExporterRegistry;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Marco Galluzzi
 */
public class ViewFolderSectionDisplayContext extends BaseSectionDisplayContext {

	public ViewFolderSectionDisplayContext(
		DepotEntryLocalService depotEntryLocalService,
		ModelResourcePermission<DepotEntry> depotEntryModelResourcePermission,
		DLConfiguration dlConfiguration, GroupLocalService groupLocalService,
		HttpServletRequest httpServletRequest, Language language,
		ObjectDefinitionService objectDefinitionService,
		ObjectDefinitionSettingLocalService objectDefinitionSettingLocalService,
		ObjectEntryFolderLocalService objectEntryFolderLocalService,
		ModelResourcePermission<ObjectEntryFolder>
			objectEntryFolderModelResourcePermission,
		Portal portal, SharingEntryLocalService sharingEntryLocalService,
		TranslationInfoItemFieldValuesExporterRegistry
			translationInfoItemFieldValuesExporterRegistry) {

		super(
			depotEntryLocalService, dlConfiguration, groupLocalService,
			httpServletRequest, language, objectDefinitionService,
			objectDefinitionSettingLocalService,
			objectEntryFolderModelResourcePermission, portal,
			translationInfoItemFieldValuesExporterRegistry);

		_depotEntryModelResourcePermission = depotEntryModelResourcePermission;
		_httpServletRequest = httpServletRequest;
		_objectEntryFolderLocalService = objectEntryFolderLocalService;
		_sharingEntryLocalService = sharingEntryLocalService;
	}

	@Override
	public Map<String, Object> getAdditionalProps() {
		Boolean contentsFolder = Objects.equals(
			getRootObjectEntryFolderExternalReferenceCode(),
			ObjectEntryFolderConstants.EXTERNAL_REFERENCE_CODE_CONTENTS);

		boolean rootFolder = false;

		if (objectEntryFolder != null) {
			rootFolder = Objects.equals(
				objectEntryFolder.getExternalReferenceCode(),
				getRootObjectEntryFolderExternalReferenceCode());
		}

		return new HashMapBuilder<>().putAll(
			super.getAdditionalProps()
		).put(
			"breadcrumbProps", getBreadcrumbProps()
		).put(
			"galleryViewEnabled", !contentsFolder
		).put(
			"rootFolder", rootFolder
		).put(
			"rootObjectEntryFolderExternalReferenceCode",
			getRootObjectEntryFolderExternalReferenceCode()
		).build();
	}

	public Map<String, Object> getBreadcrumbProps() {
		if (objectEntryFolder == null) {
			return Collections.emptyMap();
		}

		Group group = groupLocalService.fetchGroup(
			objectEntryFolder.getGroupId());

		if (group == null) {
			return Collections.emptyMap();
		}

		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		String[] parts = StringUtil.split(
			objectEntryFolder.getTreePath(), CharPool.SLASH);

		int firstAncestorIndex = 1;

		boolean hideSpace = true;

		PermissionChecker permissionChecker =
			themeDisplay.getPermissionChecker();

		if (_hasViewPermission(group, permissionChecker)) {
			hideSpace = false;

			addBreadcrumbItem(
				jsonArray, false,
				ActionUtil.getSpaceURL(group.getClassPK(), themeDisplay),
				group.getName(themeDisplay.getLocale()));
		}
		else {
			firstAncestorIndex = _getFirstAncestorIndex(
				parts, permissionChecker.getUserId());
		}

		for (int i = firstAncestorIndex; i < (parts.length - 1); i++) {
			ObjectEntryFolder ancestorObjectEntryFolder =
				_objectEntryFolderLocalService.fetchObjectEntryFolder(
					GetterUtil.getLong(parts[i]));

			if (ancestorObjectEntryFolder == null) {
				continue;
			}

			addBreadcrumbItem(
				jsonArray, false,
				ActionUtil.getViewFolderURL(
					ancestorObjectEntryFolder.getObjectEntryFolderId(),
					themeDisplay),
				ancestorObjectEntryFolder.getLabel(themeDisplay.getLocale()));
		}

		addBreadcrumbItem(
			jsonArray, true, null,
			objectEntryFolder.getLabel(themeDisplay.getLocale()));

		return HashMapBuilder.<String, Object>put(
			"breadcrumbItems", jsonArray
		).put(
			"displayType",
			() -> {
				UnicodeProperties unicodeProperties =
					group.getTypeSettingsProperties();

				return GetterUtil.get(
					unicodeProperties.get("logoColor"), "outline-0");
			}
		).put(
			"hideSpace", hideSpace
		).put(
			"size", "sm"
		).build();
	}

	@Override
	public List<DropdownItem> getBulkActionDropdownItems() {
		List<DropdownItem> fdsBulkActionDropdownItems =
			super.getBulkActionDropdownItems();

		fdsBulkActionDropdownItems.add(
			FDSActionDropdownItemBuilder.setHighlighted(
				true
			).setHref(
				"#"
			).setIcon(
				"move-folder"
			).setLabel(
				LanguageUtil.get(httpServletRequest, "move-to")
			).build(
				"move-to"
			));
		fdsBulkActionDropdownItems.add(
			FDSActionDropdownItemBuilder.setHighlighted(
				true
			).setHref(
				"#"
			).setIcon(
				"copy"
			).setLabel(
				LanguageUtil.get(httpServletRequest, "copy-to")
			).build(
				"copy-to"
			));
		fdsBulkActionDropdownItems.add(
			FDSActionDropdownItemBuilder.setHighlighted(
				true
			).setHref(
				"#"
			).setIcon(
				"upload"
			).setLabel(
				LanguageUtil.get(httpServletRequest, "export-for-translation")
			).build(
				"export-for-translation"
			));
		fdsBulkActionDropdownItems.add(
			new FDSActionDropdownItem(
				"#", "password-policies", "permissions",
				LanguageUtil.get(httpServletRequest, "permissions"), null, null,
				null));
		fdsBulkActionDropdownItems.add(
			new FDSActionDropdownItem(
				"#", "password-policies", "default-permissions",
				LanguageUtil.get(httpServletRequest, "default-permissions"),
				null, null, null));
		fdsBulkActionDropdownItems.add(
			new FDSActionDropdownItem(
				null, "pencil", "edit-categories",
				LanguageUtil.get(httpServletRequest, "edit-categories"), "post",
				"edit-categories", null));
		fdsBulkActionDropdownItems.add(
			new FDSActionDropdownItem(
				null, "pencil", "edit-tags",
				LanguageUtil.get(httpServletRequest, "edit-tags"), "post",
				"edit-tags", null));
		fdsBulkActionDropdownItems.add(
			FDSActionDropdownItemBuilder.setHighlighted(
				true
			).setHref(
				"#"
			).setIcon(
				"time"
			).setLabel(
				LanguageUtil.get(_httpServletRequest, "expire")
			).build(
				"expire"
			));
		fdsBulkActionDropdownItems.add(
			new FDSActionDropdownItem(
				StringPool.BLANK, "password-policies",
				"edit-default-permissions-by-role",
				LanguageUtil.get(
					httpServletRequest, "edit-default-permissions-by-role"),
				null, null, null));
		fdsBulkActionDropdownItems.add(
			new FDSActionDropdownItem(
				StringPool.BLANK, "password-policies",
				"edit-permissions-by-role",
				LanguageUtil.get(
					httpServletRequest, "edit-permissions-by-role"),
				null, null, null));
		fdsBulkActionDropdownItems.add(
			new FDSActionDropdownItem(
				StringPool.BLANK, "password-policies",
				"reset-to-default-permissions",
				LanguageUtil.get(
					httpServletRequest, "reset-to-default-permissions"),
				null, null, null));

		return fdsBulkActionDropdownItems;
	}

	public String getCMSSiteInitializerFDSName() {
		if (Objects.equals(
				getRootObjectEntryFolderExternalReferenceCode(),
				ObjectEntryFolderConstants.EXTERNAL_REFERENCE_CODE_CONTENTS)) {

			return CMSSiteInitializerFDSNames.VIEW_CONTENTS_FOLDER;
		}

		return CMSSiteInitializerFDSNames.VIEW_FILES_FOLDER;
	}

	@Override
	public List<DropdownItem> getCreationMenuDropdownItems() {
		if (Objects.equals(
				getRootObjectEntryFolderExternalReferenceCode(),
				ObjectEntryFolderConstants.EXTERNAL_REFERENCE_CODE_CONTENTS)) {

			return ActionUtil.getContentsSectionCreationMenuDropdownItems(
				httpServletRequest, objectEntryFolder);
		}

		return ActionUtil.getFilesSectionCreationMenuDropdownItems(
			httpServletRequest, objectEntryFolder);
	}

	@Override
	public Map<String, Object> getEmptyState() {
		String rootObjectEntryFolderExternalReferenceCode =
			getRootObjectEntryFolderExternalReferenceCode();

		String description = "click-new-or-drag-and-drop-your-files-here";
		String image = "/states/cms_empty_state.svg";
		String title = "no-assets-yet";

		if (Objects.equals(
				rootObjectEntryFolderExternalReferenceCode,
				ObjectEntryFolderConstants.EXTERNAL_REFERENCE_CODE_CONTENTS)) {

			description = "click-new-to-create-your-first-piece-of-content";
			image = "/states/cms_empty_state_content.svg";
			title = "no-content-yet";
		}
		else if (Objects.equals(
					rootObjectEntryFolderExternalReferenceCode,
					ObjectEntryFolderConstants.EXTERNAL_REFERENCE_CODE_FILES)) {

			description = "click-new-or-drag-and-drop-your-files-here";
			image = "/states/cms_empty_state_files.svg";
			title = "no-files-yet";
		}

		return HashMapBuilder.<String, Object>put(
			"description", LanguageUtil.get(httpServletRequest, description)
		).put(
			"image", image
		).put(
			"title", LanguageUtil.get(httpServletRequest, title)
		).build();
	}

	@Override
	public List<FDSActionDropdownItem> getFDSActionDropdownItems() {
		List<FDSActionDropdownItem> fdsActionDropdownItems =
			super.getFDSActionDropdownItems();

		fdsActionDropdownItems.add(
			6,
			new FDSActionDropdownItem(
				"{embedded.file.link.href}", "download", "download",
				LanguageUtil.get(httpServletRequest, "download"), "get", null,
				"link"));

		if (!Objects.equals(
				getRootObjectEntryFolderExternalReferenceCode(),
				ObjectEntryFolderConstants.EXTERNAL_REFERENCE_CODE_CONTENTS)) {

			fdsActionDropdownItems.add(
				7,
				new FDSActionDropdownItem(
					StringBundler.concat(
						"/o", GroupConstants.CMS_FRIENDLY_URL,
						"/download-folder/",
						portal.getClassNameId(ObjectEntryFolder.class),
						"/{embedded.id}"),
					"download", "download-folder",
					LanguageUtil.get(httpServletRequest, "download"), "get",
					null, "link",
					HashMapBuilder.<String, Object>put(
						"entryClassName", ObjectEntryFolder.class.getName()
					).build()));
		}

		fdsActionDropdownItems.add(
			9,
			new FDSActionDropdownItem(
				StringPool.BLANK, "info-circle-open", "show-details",
				LanguageUtil.get(httpServletRequest, "show-details"), null,
				null, "infoPanel"));

		return fdsActionDropdownItems;
	}

	@Override
	public String[] getObjectFolderExternalReferenceCodes() {
		if (_objectFolderExternalReferenceCode != null) {
			return new String[] {_objectFolderExternalReferenceCode};
		}

		String rootObjectEntryFolderExternalReferenceCode =
			getRootObjectEntryFolderExternalReferenceCode();

		if (rootObjectEntryFolderExternalReferenceCode == null) {
			return new String[0];
		}

		if (rootObjectEntryFolderExternalReferenceCode.equals(
				ObjectEntryFolderConstants.EXTERNAL_REFERENCE_CODE_CONTENTS)) {

			_objectFolderExternalReferenceCode =
				ObjectFolderConstants.
					EXTERNAL_REFERENCE_CODE_CONTENT_STRUCTURES;
		}

		if (rootObjectEntryFolderExternalReferenceCode.equals(
				ObjectEntryFolderConstants.EXTERNAL_REFERENCE_CODE_FILES)) {

			_objectFolderExternalReferenceCode =
				ObjectFolderConstants.EXTERNAL_REFERENCE_CODE_FILE_TYPES;
		}

		return new String[] {_objectFolderExternalReferenceCode};
	}

	public String getPropsTransformerModule() {
		String rootObjectEntryFolderExternalReferenceCode =
			getRootObjectEntryFolderExternalReferenceCode();

		if (rootObjectEntryFolderExternalReferenceCode.equals(
				ObjectEntryFolderConstants.EXTERNAL_REFERENCE_CODE_FILES)) {

			return "{AssetsFilesDropFDSPropsTransformer} from " +
				"site-cms-site-initializer";
		}

		return "{AssetsFDSPropsTransformer} from site-cms-site-initializer";
	}

	@Override
	public String getRootObjectEntryFolderExternalReferenceCode() {
		if (_rootObjectEntryFolderExternalReferenceCode != null) {
			return _rootObjectEntryFolderExternalReferenceCode;
		}

		if (objectEntryFolder == null) {
			return null;
		}

		String[] parts = StringUtil.split(
			objectEntryFolder.getTreePath(), CharPool.SLASH);

		if (parts.length <= 2) {
			_rootObjectEntryFolderExternalReferenceCode =
				objectEntryFolder.getExternalReferenceCode();

			return _rootObjectEntryFolderExternalReferenceCode;
		}

		ObjectEntryFolder rootObjectEntryFolder =
			_objectEntryFolderLocalService.fetchObjectEntryFolder(
				GetterUtil.getLong(parts[1]));

		if (rootObjectEntryFolder == null) {
			return null;
		}

		_rootObjectEntryFolderExternalReferenceCode =
			rootObjectEntryFolder.getExternalReferenceCode();

		return _rootObjectEntryFolderExternalReferenceCode;
	}

	@Override
	protected String getCMSSectionFilterString() {
		return null;
	}

	@Override
	protected boolean isFolderSearchEnabled() {
		return true;
	}

	private int _getFirstAncestorIndex(String[] parts, long userId) {
		long classNameId = portal.getClassNameId(
			ObjectEntryFolder.class.getName());

		for (int i = 1; i < (parts.length - 1); i++) {
			if (_sharingEntryLocalService.hasSharingPermission(
					userId, classNameId, GetterUtil.getLong(parts[i]),
					SharingEntryAction.VIEW)) {

				return i;
			}
		}

		return parts.length - 1;
	}

	private boolean _hasViewPermission(
		Group group, PermissionChecker permissionChecker) {

		DepotEntry depotEntry = depotEntryLocalService.fetchDepotEntry(
			group.getClassPK());

		if (depotEntry == null) {
			return false;
		}

		try {
			return _depotEntryModelResourcePermission.contains(
				permissionChecker, depotEntry, ActionKeys.VIEW);
		}
		catch (PortalException portalException) {
			if (_log.isDebugEnabled()) {
				_log.debug(portalException);
			}

			return false;
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		ViewFolderSectionDisplayContext.class);

	private final ModelResourcePermission<DepotEntry>
		_depotEntryModelResourcePermission;
	private final HttpServletRequest _httpServletRequest;
	private final ObjectEntryFolderLocalService _objectEntryFolderLocalService;
	private String _objectFolderExternalReferenceCode;
	private String _rootObjectEntryFolderExternalReferenceCode;
	private final SharingEntryLocalService _sharingEntryLocalService;

}