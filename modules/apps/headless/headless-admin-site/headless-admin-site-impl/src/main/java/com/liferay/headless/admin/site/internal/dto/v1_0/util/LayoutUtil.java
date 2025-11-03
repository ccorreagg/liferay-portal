/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.site.internal.dto.v1_0.util;

import com.liferay.headless.admin.site.dto.v1_0.Layout;
import com.liferay.headless.admin.site.dto.v1_0.Scope;
import com.liferay.headless.admin.site.internal.util.LogUtil;
import com.liferay.layout.converter.AlignConverter;
import com.liferay.layout.converter.ContentDisplayConverter;
import com.liferay.layout.converter.FlexWrapConverter;
import com.liferay.layout.converter.JustifyConverter;
import com.liferay.layout.util.constants.StyledLayoutStructureConstants;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.Objects;

/**
 * @author Mikel Lorza
 */
public class LayoutUtil {

	public static JSONObject getMappedLayoutJSONObject(
			long companyId, String externalReferenceCode, Scope scope,
			long scopeGroupId)
		throws PortalException {

		Long groupId = ItemScopeUtil.getGroupId(companyId, scope, scopeGroupId);

		if (groupId == null) {
			LogUtil.logOptionalReference(
				Layout.class.getName(), externalReferenceCode, scope,
				scopeGroupId);

			return JSONUtil.put(
				"externalReferenceCode", externalReferenceCode
			).put(
				"scopeExternalReferenceCode",
				ItemScopeUtil.getItemScopeExternalReferenceCode(
					scope, scopeGroupId)
			);
		}

		com.liferay.portal.kernel.model.Layout layout =
			LayoutLocalServiceUtil.fetchLayoutByExternalReferenceCode(
				externalReferenceCode, groupId);

		if (layout == null) {
			LogUtil.logOptionalReference(
				Layout.class.getName(), externalReferenceCode, scope,
				scopeGroupId);

			return JSONUtil.put(
				"externalReferenceCode", externalReferenceCode
			).put(
				"scopeExternalReferenceCode",
				ItemScopeUtil.getItemScopeExternalReferenceCode(
					scope, scopeGroupId)
			);
		}

		return JSONUtil.put(
			"externalReferenceCode", externalReferenceCode
		).put(
			"groupId", String.valueOf(layout.getGroupId())
		).put(
			"layoutId", String.valueOf(layout.getLayoutId())
		).put(
			"layoutUuid", layout.getUuid()
		).put(
			"privateLayout", layout.isPrivateLayout()
		).put(
			"scopeExternalReferenceCode",
			ItemScopeUtil.getItemScopeExternalReferenceCode(scope, scopeGroupId)
		).put(
			"title", layout.getName(LocaleUtil.getMostRelevantLocale())
		);
	}

	public static Layout toLayout(JSONObject jsonObject) {
		if (JSONUtil.isEmpty(jsonObject) ||
			((jsonObject.getString("align", null) == null) &&
			 (jsonObject.getString("contentVisibility", null) == null) &&
			 (jsonObject.getString("flexWrap", null) == null) &&
			 (jsonObject.getString("justify", null) == null) &&
			 (jsonObject.getString("widthType", null) == null))) {

			return null;
		}

		return new Layout() {
			{
				setAlign(
					() -> {
						String align = jsonObject.getString("align", null);

						if (Validator.isNull(align)) {
							return null;
						}

						return Align.create(
							AlignConverter.convertToExternalValue(align));
					});
				setContentDisplay(
					() -> {
						String contentDisplay = jsonObject.getString(
							"contentDisplay", null);

						if (Validator.isNull(contentDisplay)) {
							return null;
						}

						return ContentDisplay.create(
							ContentDisplayConverter.convertToExternalValue(
								GetterUtil.getString(contentDisplay)));
					});
				setFlexWrap(
					() -> {
						String flexWrap = jsonObject.getString(
							"flexWrap", null);

						if (Validator.isNull(flexWrap)) {
							return null;
						}

						return FlexWrap.create(
							FlexWrapConverter.convertToExternalValue(flexWrap));
					});
				setJustify(
					() -> {
						String justify = jsonObject.getString("justify", null);

						if (Validator.isNull(justify)) {
							return null;
						}

						return Justify.create(
							JustifyConverter.convertToExternalValue(justify));
					});
				setWidthType(
					() -> {
						String widthType = jsonObject.getString(
							"widthType", null);

						if (Validator.isNull(widthType) ||
							Objects.equals(
								widthType,
								StyledLayoutStructureConstants.WIDTH_TYPE)) {

							return null;
						}

						return WidthType.create(
							StringUtil.upperCaseFirstLetter(widthType));
					});
			}
		};
	}

}