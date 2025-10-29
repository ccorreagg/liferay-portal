/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.exportimport.internal.exportimport.content.processor;

import com.liferay.document.library.kernel.exception.NoSuchFileEntryException;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.document.library.util.DLURLHelper;
import com.liferay.exportimport.content.processor.ExportImportContentParser;
import com.liferay.exportimport.kernel.exception.ExportImportContentProcessorException;
import com.liferay.exportimport.kernel.lar.ExportImportPathUtil;
import com.liferay.exportimport.kernel.lar.ExportImportThreadLocal;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.VirtualHost;
import com.liferay.portal.kernel.portlet.constants.FriendlyURLResolverConstants;
import com.liferay.portal.kernel.repository.friendly.url.resolver.FileEntryFriendlyURLResolver;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.VirtualHostLocalService;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.HttpComponentsUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.PortletKeys;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.liferay.portal.kernel.xml.Element;
import org.apache.commons.lang.StringUtils;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(
	property = "content.parser.type=" + ExportImportContentParser.DOCUMENT_LIBRARY,
	service = ExportImportContentParser.class
)
public class DLReferencesExportImportContentParser
	implements ExportImportContentParser<String> {

	@Override
	public String parseExportContent(
			String content, PortletDataContext portletDataContext)
		throws Exception {

		Group group = _groupLocalService.getGroup(
			portletDataContext.getGroupId());

		if (group.isStagingGroup()) {
			group = group.getLiveGroup();
		}

		if (group.isStaged() && !group.isStagedRemotely() &&
			!group.isStagedPortlet(PortletKeys.DOCUMENT_LIBRARY) &&
			ExportImportThreadLocal.isStagingInProcess()) {

			return content;
		}

		StringBuilder sb = new StringBuilder(content);

		String contextPath = _portal.getPathContext();

		String[] patterns = {
			contextPath.concat("/c/document_library/get_file?"),
			contextPath.concat("/documents/"),
			contextPath.concat("/image/image_gallery?")
		};

		int beginPos = -1;
		int endPos = content.length();

		while (true) {
			beginPos = StringUtil.lastIndexOfAny(content, patterns, endPos);

			if (beginPos == -1) {
				break;
			}

			Map<String, String[]> dlReferenceParameters =
				_getDLReferenceParameters(
					portletDataContext.getScopeGroupId(), content,
					beginPos + contextPath.length(), endPos);

			FileEntry fileEntry = _getFileEntry(dlReferenceParameters);

			if ((fileEntry == null) ||
				_isExternalURL(
					portletDataContext.getScopeGroupId(), content, beginPos,
					endPos)) {

				endPos = beginPos - 1;

				continue;
			}

			endPos = MapUtil.getInteger(dlReferenceParameters, "endPos");

			try {
				DocumentLibraryReference documentLibraryReference =
					new DocumentLibraryReference(
						fileEntry,
						MapUtil.getString(dlReferenceParameters, "friendlyURL"));

//				StringBundler exportedReferenceSB = new StringBundler(10);
//
//				exportedReferenceSB.append("[$dl-reference$ $dl-external-reference-code=");
//				exportedReferenceSB.append(fileEntry.getExternalReferenceCode());
//				exportedReferenceSB.append("$,$dl-group-id=");
//				exportedReferenceSB.append(fileEntry.getGroupId());
//
//				if (dlReferenceParameters.containsKey("friendlyURL")) {
//					exportedReferenceSB.append("$,$include-friendly-url=true");
//				}
//				else {
//					exportedReferenceSB.append("$,$include-uuid=");
//					exportedReferenceSB.append(
//						dlReferenceParameters.containsKey("uuid"));
//				}
//
//				exportedReferenceSB.append("$]");
//
////				if (fileEntry.isInTrash()) {
////					String originalReference = sb.substring(beginPos, endPos);
////
////					exportedReferenceSB.append("[#dl-reference=");
////					exportedReferenceSB.append(originalReference);
////
////					if (dlReferenceParameters.containsKey("friendlyURL")) {
////						exportedReferenceSB.append(
////							"#,#include-friendly-url=true");
////					}
////					else {
////						exportedReferenceSB.append("#,#include-uuid=");
////						exportedReferenceSB.append(
////							dlReferenceParameters.containsKey("uuid"));
////					}
////
////					exportedReferenceSB.append("#]");
////				}

//				sb.replace(beginPos, endPos, exportedReferenceSB.toString());
				sb.replace(beginPos, endPos, documentLibraryReference.toString());
			}
			catch (Exception exception) {
				StringBundler exceptionSB = new StringBundler(2);

				exceptionSB.append("Unable to process file entry ");
				exceptionSB.append(fileEntry.getFileEntryId());

				ExportImportContentProcessorException
					exportImportContentProcessorException =
						new ExportImportContentProcessorException(
							exceptionSB.toString(), exception);

				if (_log.isDebugEnabled()) {
					_log.debug(
						exceptionSB.toString(),
						exportImportContentProcessorException);
				}
				else if (_log.isWarnEnabled()) {
					_log.warn(exceptionSB.toString());
				}
			}

			endPos = beginPos - 1;
		}

		return sb.toString();
	}

	private static class DocumentLibraryReference {

		public DocumentLibraryReference(
			FileEntry fileEntry, String friendlyURL) {
			_externalReferenceCode = fileEntry.getExternalReferenceCode();
			_groupId = fileEntry.getGroupId();
			_friendlyURL = friendlyURL;
		}

		private DocumentLibraryReference(
			String externalReferenceCode, String friendlyURL, long groupId) {

			_externalReferenceCode = externalReferenceCode;
			_friendlyURL = friendlyURL;
			_groupId = groupId;
		}

		public String getExternalReferenceCode() {
			return _externalReferenceCode;
		}

		public String getFriendlyURL() {
			return _friendlyURL;
		}

		public long getGroupId() {
			return _groupId;
		}

		@Override
		public String toString() {
			return StringBundler.concat(
				"[$dl-reference$ $dl-external-reference-code=", _externalReferenceCode,  "$,$dl-group-id=", _groupId, "$,$friendly-url=", _friendlyURL, "$]");
		}

		public static DocumentLibraryReference parse(String value) {
			if (!value.contains("[$dl-reference$")) {
				return null;
			}

			String externalReferenceCode = value.substring(value.indexOf("$dl-external-reference-code=") + "$dl-external-reference-code=".length(), value.indexOf("$,$dl-group-id="));
			long groupId = Long.parseLong(value.substring(value.indexOf("$,$dl-group-id=") + "$,$dl-group-id=".length(), value.indexOf("$,$friendly-url=")));
			String friendlyURL = value.substring(value.indexOf("$,$friendly-url=") + "$,$friendly-url=".length(), value.indexOf("$]"));

			return new DocumentLibraryReference(externalReferenceCode, friendlyURL, groupId);
		}

		private String _externalReferenceCode;
		private long _groupId;
		private String _friendlyURL;
	}

	@Override
	public String parseImportContent(
			String content, PortletDataContext portletDataContext)
		throws Exception {

		DocumentLibraryReference documentLibraryReference = null;

		while ((documentLibraryReference = DocumentLibraryReference.parse(content)) != null) {
			long groupId;

			if (documentLibraryReference.getGroupId() == portletDataContext.getSourceGroupId()) {
				groupId = portletDataContext.getGroupId();
			}
			else {
				groupId = documentLibraryReference.getGroupId();
			}

			FileEntry importedFileEntry = _dlAppLocalService.fetchFileEntryByExternalReferenceCode(
				groupId, documentLibraryReference.getExternalReferenceCode());

			String url = _getURL(documentLibraryReference, importedFileEntry, _groupLocalService.getGroup(groupId));

//			if (url.contains(StringPool.QUESTION)) {
//				url = url.substring(
//					0, url.lastIndexOf(StringPool.QUESTION));
//			}
//
//			String urlWithoutUUID = url.substring(
//				0, url.lastIndexOf(StringPool.SLASH));
//
//			String exportedReferenceFriendlyURL =
//				"[$dl-reference=" + path + "$,$include-friendly-url=true$]";
//			String exportedReferenceWithoutUUID =
//				"[$dl-reference=" + path + "$,$include-uuid=false$]";
//			String exportedReferenceWithUUID =
//				"[$dl-reference=" + path + "$,$include-uuid=true$]";
//
//			if (content.startsWith("[#dl-reference=", endPos)) {
//				int friendlyURLPosition = content.indexOf(
//					"#,#include-friendly-url=true", beginPos);
//
//				if (friendlyURLPosition != -1) {
//					endPos = friendlyURLPosition + 2;
//				}
//				else {
//					endPos =
//						content.indexOf("#,#include-uuid=", beginPos) + 2;
//				}
//
//				exportedReferenceFriendlyURL =
//					content.substring(beginPos, endPos) +
//					"#include-friendly-url=true#]";
//				exportedReferenceWithoutUUID =
//					content.substring(beginPos, endPos) +
//					"#include-uuid=false#]";
//				exportedReferenceWithUUID =
//					content.substring(beginPos, endPos) +
//					"#include-uuid=true#]";
//			}
//
//			content = StringUtil.replace(
//				content, exportedReferenceFriendlyURL, url);
//			content = StringUtil.replace(
//				content, exportedReferenceWithUUID, url);
//			content = StringUtil.replace(
//				content, exportedReferenceWithoutUUID, urlWithoutUUID);

			content = StringUtil.replace(content, documentLibraryReference.toString(), url);
		}

		return content;
	}

	private String _getURL(
		DocumentLibraryReference documentLibraryReference, FileEntry fileEntry,
		Group group)
		throws PortalException {

		if (fileEntry == null) {
			// Return a default friendly URL if the file entry does not exist
			// In the end, we could have:
			// * The file entry is imported after the Object Entry,
			//   then, we should update this first element to use the new
			//   possible URL (using the updated friendly URL)
			// * The file entry is not imported after the Object Entry,
			//   then, we should leave a default URL (the one we generate here)
			// To ensure the user knows this might be a wrong URL, we need to
			// add a value somewhere regarding the possible wrong value in this
			// Object Entry. If the File Entry is finally imported, the value
			// must be removed to avoid creating a warning report entry of the
			// Object Entry

			return "/documents/d/" + group.getGroupKey() + "/" + documentLibraryReference.getFriendlyURL();
		}

		return _dlURLHelper.getPreviewURL(
			fileEntry, fileEntry.getFileVersion(), null,
			StringPool.BLANK,
			documentLibraryReference.getFriendlyURL() == null,
			false);
	}

	@Reference
	private DLURLHelper _dlURLHelper;

	private ObjectValuePair<String, Integer>
		_getDLReferenceEndPosObjectValuePair(
			String content, int beginPos, int endPos) {

		String[] stopStrings = _DL_REFERENCE_LEGACY_STOP_STRINGS;

		if (!_isLegacyURL(content, beginPos)) {
			stopStrings = _DL_REFERENCE_STOP_STRINGS;
		}

		int urlPatternPos = StringUtil.indexOfAny(
			content, stopStrings, beginPos, endPos);

		if (urlPatternPos == -1) {
			if (endPos != content.length()) {
				return null;
			}

			urlPatternPos = endPos;
		}

		return new ObjectValuePair<>(
			content.substring(beginPos, urlPatternPos), urlPatternPos);
	}

	private Map<String, String[]> _getDLReferenceParameters(
		long groupId, String content, int beginPos, int endPos) {

		ObjectValuePair<String, Integer> dlReferenceEndPosObjectValuePair =
			_getDLReferenceEndPosObjectValuePair(content, beginPos, endPos);

		if (dlReferenceEndPosObjectValuePair == null) {
			return null;
		}

		boolean legacyURL = _isLegacyURL(content, beginPos);

		Map<String, String[]> map = new HashMap<>();

		String dlReference = dlReferenceEndPosObjectValuePair.getKey();

		endPos = dlReferenceEndPosObjectValuePair.getValue();

		while (dlReference.contains(StringPool.AMPERSAND_ENCODED)) {
			dlReference = StringUtil.replace(
				dlReference, StringPool.AMPERSAND_ENCODED,
				StringPool.AMPERSAND);
		}

		if (!legacyURL) {
			String[] pathArray = dlReference.split(StringPool.SLASH);

			if (pathArray.length < 3) {
				return map;
			}

			if (Objects.equals(
					pathArray[2],
					FriendlyURLResolverConstants.URL_SEPARATOR_Y_FILE_ENTRY)) {

				if (pathArray.length >= 5) {
					map.put(
						"friendlyURL",
						new String[] {
							StringUtils.substringBefore(
								HttpComponentsUtil.decodeURL(pathArray[4]),
								StringPool.POUND)
						});
				}

				if (pathArray.length >= 4) {
					map.put("groupName", new String[] {pathArray[3]});
				}
			}
			else if (Objects.equals(pathArray[2], "portlet_file_entry")) {
				if (pathArray.length >= 4) {
					map.put("groupId", new String[] {pathArray[3]});
				}

				if (pathArray.length >= 5) {
					map.put(
						"title",
						new String[] {
							StringUtils.substringBefore(
								HttpComponentsUtil.decodeURL(pathArray[4]),
								StringPool.POUND)
						});
				}
			}
			else {
				map.put("groupId", new String[] {pathArray[2]});

				if (pathArray.length == 5) {
					map.put("folderId", new String[] {pathArray[3]});
					map.put(
						"title",
						new String[] {
							StringUtils.substringBefore(
								HttpComponentsUtil.decodeURL(pathArray[4]),
								StringPool.POUND)
						});
				}
			}

			String uuid = _getUuid(dlReference);

			if (Validator.isNotNull(uuid)) {
				map.put("uuid", new String[] {uuid});
			}
		}
		else {
			dlReference = dlReference.substring(
				dlReference.indexOf(CharPool.QUESTION) + 1);

			map = HttpComponentsUtil.parameterMapFromString(dlReference);

			String[] imageIds = null;

			if (map.containsKey("img_id")) {
				imageIds = map.get("img_id");
			}
			else if (map.containsKey("i_id")) {
				imageIds = map.get("i_id");
			}

			imageIds = ArrayUtil.filter(imageIds, Validator::isNotNull);

			if (ArrayUtil.isNotEmpty(imageIds)) {
				map.put("image_id", imageIds);
			}
		}

		map.put("endPos", new String[] {String.valueOf(endPos)});

		String groupIdString = MapUtil.getString(map, "groupId");

		if (groupIdString.equals("@group_id@")) {
			groupIdString = String.valueOf(groupId);

			map.put("groupId", new String[] {groupIdString});
		}

		return map;
	}

	private FileEntry _getFileEntry(Map<String, String[]> map) {
		if (MapUtil.isEmpty(map)) {
			return null;
		}

		FileEntry fileEntry = null;

		try {
			String uuid = MapUtil.getString(map, "uuid");
			long groupId = MapUtil.getLong(map, "groupId");

			if (Validator.isNotNull(uuid)) {
				try {
					fileEntry = _dlAppLocalService.getFileEntryByUuidAndGroupId(
						uuid, groupId);
				}
				catch (PortalException portalException) {
					if (_log.isDebugEnabled()) {
						_log.debug("Unable to get file entry", portalException);
					}

					return _dlAppLocalService.
						getFileEntryByExternalReferenceCode(uuid, groupId);
				}
			}
			else {
				if (map.containsKey("friendlyURL")) {
					String friendlyURL = MapUtil.getString(map, "friendlyURL");

					fileEntry = _resolveFileEntry(
						MapUtil.getString(map, "groupName"), friendlyURL);

					if (fileEntry == null) {
						throw new NoSuchFileEntryException(
							"No file entry found for friendly URL " +
								friendlyURL);
					}
				}
				else if (map.containsKey("folderId")) {
					long folderId = MapUtil.getLong(map, "folderId");
					String name = MapUtil.getString(map, "name");
					String title = MapUtil.getString(map, "title");

					if (Validator.isNotNull(title)) {
						try {
							fileEntry =
								_dlAppLocalService.getFileEntryByFileName(
									groupId, folderId, title);
						}
						catch (NoSuchFileEntryException
									noSuchFileEntryException) {

							if (_log.isDebugEnabled()) {
								_log.debug(noSuchFileEntryException);
							}

							fileEntry = _dlAppLocalService.getFileEntry(
								groupId, folderId, title);
						}
					}
					else {
						DLFileEntry dlFileEntry =
							_dlFileEntryLocalService.fetchFileEntryByName(
								groupId, folderId, name);

						if (dlFileEntry != null) {
							fileEntry = _dlAppLocalService.getFileEntry(
								dlFileEntry.getFileEntryId());
						}
					}
				}
				else if (map.containsKey("image_id")) {
					DLFileEntry dlFileEntry =
						_dlFileEntryLocalService.fetchFileEntryByAnyImageId(
							MapUtil.getLong(map, "image_id"));

					if (dlFileEntry != null) {
						fileEntry = _dlAppLocalService.getFileEntry(
							dlFileEntry.getFileEntryId());
					}
				}
			}
		}
		catch (Exception exception) {
			if (_log.isWarnEnabled()) {
				_log.warn(exception);
			}
		}

		return fileEntry;
	}

	private Group _getGroup(String name) throws Exception {
		Group group = _groupLocalService.fetchFriendlyURLGroup(
			CompanyThreadLocal.getCompanyId(), StringPool.SLASH + name);

		if (group != null) {
			return group;
		}

		User user = _userLocalService.getUserByScreenName(
			CompanyThreadLocal.getCompanyId(), name);

		return user.getGroup();
	}

	private String _getUuid(String s) {
		Matcher matcher = _uuidPattern.matcher(s);

		String uuid = StringPool.BLANK;

		while (matcher.find()) {
			uuid = matcher.group(0);
		}

		return uuid;
	}

	private boolean _isCreoleReference(String content, int beginPos) {
		if (content.regionMatches(
				true, beginPos - 2, StringPool.DOUBLE_OPEN_BRACKET, 0, 2) ||
			content.regionMatches(
				true, beginPos - 2, StringPool.DOUBLE_OPEN_CURLY_BRACE, 0, 2)) {

			return true;
		}

		return false;
	}

	private boolean _isExternalURL(
			long groupId, String content, int beginPos, int endPos)
		throws Exception {

		if (((beginPos == 0) && (endPos == content.length())) ||
			_isCreoleReference(content, beginPos) ||
			_isHTMLReference(content, beginPos) ||
			_isJSONReference(content, beginPos) ||
			_isStyleReference(content, beginPos)) {

			return false;
		}

		String portalURL = _portal.getPathContext();

		if (Validator.isNull(portalURL)) {
			ServiceContext serviceContext =
				ServiceContextThreadLocal.getServiceContext();

			if ((serviceContext != null) &&
				(serviceContext.getThemeDisplay() != null)) {

				portalURL = _portal.getPortalURL(
					serviceContext.getThemeDisplay());
			}
		}

		Set<String> hostNames = new HashSet<>();

		hostNames.add(portalURL);

		Group group = _groupLocalService.getGroup(groupId);

		for (VirtualHost virtualHost :
				_virtualHostLocalService.getVirtualHosts(
					group.getCompanyId())) {

			String hostname = virtualHost.getHostname();

			hostNames.add(hostname);
			hostNames.add(Http.HTTP_WITH_SLASH + hostname);
			hostNames.add(Http.HTTPS_WITH_SLASH + hostname);
		}

		int colonPos = 0;

		for (int i = 1; i <= _OFFSET_COLON_PORT; i++) {
			if (i > beginPos) {
				break;
			}

			if (content.charAt(beginPos - i) == CharPool.COLON) {
				colonPos = i;

				break;
			}
		}

		long urlPort = 0;

		if (colonPos > 0) {
			urlPort = GetterUtil.getLong(
				content.substring(beginPos - colonPos + 1, beginPos));
		}

		for (String hostName : hostNames) {
			if (urlPort > 0) {
				int serverPort = _portal.getPortalServerPort(
					hostName.startsWith(Http.HTTPS_WITH_SLASH));

				if (urlPort != serverPort) {
					continue;
				}
			}

			int curBeginPos = beginPos - hostName.length() - colonPos;

			if (curBeginPos < 0) {
				continue;
			}

			String substring = content.substring(curBeginPos, endPos);

			if (substring.startsWith(hostName) &&
				(((curBeginPos == 0) && (endPos == content.length())) ||
				 _isCreoleReference(content, curBeginPos) ||
				 _isHTMLReference(content, curBeginPos) ||
				 _isJSONReference(content, curBeginPos) ||
				 _isStyleReference(content, curBeginPos))) {

				return false;
			}
		}

		return true;
	}

	private boolean _isHTMLReference(String content, int beginPos) {
		if (content.regionMatches(beginPos - 1, StringPool.APOSTROPHE, 0, 1) ||
			content.regionMatches(beginPos - 1, StringPool.QUOTE, 0, 1)) {

			beginPos = beginPos - 1;
		}

		if (content.regionMatches(
				true, beginPos - 1, StringPool.BACK_SLASH, 0, 1)) {

			beginPos = beginPos - 1;
		}

		String[] attributes = {"href=", "src="};

		for (String attribute : attributes) {
			if (content.regionMatches(
					true, beginPos - attribute.length(), attribute, 0,
					attribute.length())) {

				return true;
			}
		}

		return false;
	}

	private boolean _isJSONReference(String content, int beginPos) {
		String[] jsonAttributes = {"\"href\"", "\"url\""};

		int position = StringUtil.lastIndexOfAny(
			content, jsonAttributes, beginPos);

		if (position == -1) {
			return false;
		}

		if (_jsonAttributePattern.matcher(
				content.substring(position, beginPos)
			).matches() ||
			_jsonLocalizedPattern.matcher(
				content.substring(position, beginPos)
			).matches()) {

			return true;
		}

		return false;
	}

	private boolean _isLegacyURL(String content, int beginPos) {
		return !content.startsWith("/documents/", beginPos);
	}

	private boolean _isStyleReference(String content, int beginPos) {
		beginPos = _skipWhiteSpacePos(content, beginPos);

		if (content.regionMatches(beginPos - 1, StringPool.APOSTROPHE, 0, 1) ||
			content.regionMatches(beginPos - 1, StringPool.QUOTE, 0, 1)) {

			beginPos = beginPos - 1;
		}

		beginPos = _skipWhiteSpacePos(content, beginPos);

		String url = "url(";

		return content.regionMatches(true, beginPos - url.length(), url, 0, 2);
	}

	private FileEntry _resolveFileEntry(String groupName, String friendlyURL)
		throws Exception {

		if (_fileEntryFriendlyURLResolver == null) {
			return null;
		}

		Group group = _getGroup(groupName);

		return _fileEntryFriendlyURLResolver.resolveFriendlyURL(
			group.getGroupId(), friendlyURL);
	}

	private int _skipWhiteSpacePos(String content, int beginPos) {
		while (content.regionMatches(beginPos - 1, StringPool.NEW_LINE, 0, 1) ||
			   content.regionMatches(beginPos - 1, StringPool.RETURN, 0, 1) ||
			   content.regionMatches(beginPos - 1, StringPool.SPACE, 0, 1) ||
			   content.regionMatches(beginPos - 1, StringPool.TAB, 0, 1)) {

			beginPos = beginPos - 1;
		}

		return beginPos;
	}

	private static final String[] _DL_REFERENCE_LEGACY_STOP_STRINGS = {
		StringPool.APOSTROPHE, StringPool.APOSTROPHE_ENCODED,
		StringPool.BACK_SLASH + StringPool.APOSTROPHE,
		StringPool.BACK_SLASH + StringPool.QUOTE, StringPool.CLOSE_BRACKET,
		StringPool.CLOSE_CURLY_BRACE, StringPool.CLOSE_PARENTHESIS,
		StringPool.GREATER_THAN, StringPool.LESS_THAN, StringPool.PIPE,
		StringPool.POUND, StringPool.QUOTE, StringPool.QUOTE_ENCODED,
		StringPool.SPACE
	};

	private static final String[] _DL_REFERENCE_STOP_STRINGS = {
		StringPool.APOSTROPHE, StringPool.APOSTROPHE_ENCODED,
		StringPool.BACK_SLASH + StringPool.APOSTROPHE,
		StringPool.BACK_SLASH + StringPool.QUOTE, StringPool.CLOSE_BRACKET,
		StringPool.CLOSE_CURLY_BRACE, StringPool.CLOSE_PARENTHESIS,
		StringPool.GREATER_THAN, StringPool.LESS_THAN, StringPool.NEW_LINE,
		StringPool.PIPE, StringPool.POUND, StringPool.QUESTION,
		StringPool.QUOTE, StringPool.QUOTE_ENCODED, StringPool.SPACE
	};

	private static final int _OFFSET_COLON_PORT = 6;

	private static final Log _log = LogFactoryUtil.getLog(
		DLReferencesExportImportContentParser.class);

	private static final Pattern _jsonAttributePattern = Pattern.compile(
		"\\\"[^\"\\\\\\\\]*\\\"\\s*:\\s*\\\"");
	private static final Pattern _jsonLocalizedPattern = Pattern.compile(
		"\\\"[^\"\\\\]*\\\"\\s*:\\s*\\{\\\"[a-zA-Z_]+" +
			"\\\"\\s*:\\s*\\\"[^\"\\\\]*");
	private static final Pattern _uuidPattern = Pattern.compile(
		"[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-" +
			"[a-fA-F0-9]{12}(?=[&,?]|$)");

	@Reference
	private DLAppLocalService _dlAppLocalService;

	@Reference
	private DLFileEntryLocalService _dlFileEntryLocalService;

	@Reference
	private FileEntryFriendlyURLResolver _fileEntryFriendlyURLResolver;

	@Reference
	private GroupLocalService _groupLocalService;

	@Reference
	private Portal _portal;

	@Reference
	private UserLocalService _userLocalService;

	@Reference
	private VirtualHostLocalService _virtualHostLocalService;

}