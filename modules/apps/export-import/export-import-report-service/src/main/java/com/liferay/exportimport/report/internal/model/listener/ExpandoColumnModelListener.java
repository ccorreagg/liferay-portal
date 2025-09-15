/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.exportimport.report.internal.model.listener;

import com.liferay.expando.kernel.model.ExpandoColumn;
import com.liferay.exportimport.kernel.lar.ExportImportThreadLocal;
import com.liferay.exportimport.report.internal.util.ExportImportReportEntryUtil;
import com.liferay.exportimport.report.service.ExportImportReportEntryLocalService;
import com.liferay.object.constants.ObjectDefinitionConstants;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.lazy.referencing.LazyReferencingThreadLocal;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.service.ClassNameLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(service = ModelListener.class)
public class ExpandoColumnModelListener
	extends BaseModelListener<ExpandoColumn> {

	@Override
	public void onAfterCreate(ExpandoColumn expandoColumn)
		throws ModelListenerException {

		if (!LazyReferencingThreadLocal.isEnabled()) {
			return;
		}

		_exportImportReportEntryLocalService.addEmptyExportImportReportEntry(
			0L, expandoColumn.getCompanyId(), null,
			_classNameLocalService.getClassNameId(ExpandoColumn.class),
			ExportImportThreadLocal.getExportImportConfigurationId(),
			ExpandoColumn.class.getName(),
			ExportImportReportEntryUtil.getOrigin(),
			ObjectDefinitionConstants.SCOPE_COMPANY, null);
	}

	@Reference
	private ClassNameLocalService _classNameLocalService;

	@Reference
	private ExportImportReportEntryLocalService
		_exportImportReportEntryLocalService;

}