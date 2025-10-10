/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.exportimport.content.processor;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import java.io.Serializable;

/**
 * @author Carlos Correa
 */
public interface ExportImportContentParser<T extends Serializable> {

	public static final String DOCUMENT_LIBRARY = "DOCUMENT_LIBRARY";

	public T parseExportContent(
			T content, PortletDataContext portletDataContext)
		throws Exception;

	public T parseImportContent(
			T content, PortletDataContext portletDataContext)
		throws Exception;

}