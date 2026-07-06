/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.jaxrs.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import com.liferay.exportimport.kernel.lar.ExportImportThreadLocal;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.vulcan.scope.Scope;

import java.io.IOException;

/**
 * @author Carlos Correa
 */
public class ScopeStdSerializer extends StdSerializer<Scope> {

	public ScopeStdSerializer(JsonSerializer<Object> jsonSerializer) {
		super(Scope.class);

		_jsonSerializer = jsonSerializer;
	}

	@Override
	public void serialize(
			Scope scope, JsonGenerator jsonGenerator,
			SerializerProvider serializerProvider)
		throws IOException {

		if (ExportImportThreadLocal.isStagingInProcess()) {
			Group group =
				GroupLocalServiceUtil.fetchGroupByExternalReferenceCode(
					scope.getExternalReferenceCode(),
					CompanyThreadLocal.getCompanyId());

			if ((group != null) && group.isStagingGroup()) {
				Group liveGroup = group.getLiveGroup();

				if (liveGroup != null) {
					if (_log.isDebugEnabled()) {
						_log.debug(
							StringBundler.concat(
								"Replacing staging group external reference ",
								"code ", scope.getExternalReferenceCode(),
								" with live group external reference code ",
								liveGroup.getExternalReferenceCode()));
					}

					scope.setExternalReferenceCode(
						liveGroup.getExternalReferenceCode());
				}
			}
		}

		_jsonSerializer.serialize(scope, jsonGenerator, serializerProvider);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		ScopeStdSerializer.class);

	private final JsonSerializer<Object> _jsonSerializer;

}