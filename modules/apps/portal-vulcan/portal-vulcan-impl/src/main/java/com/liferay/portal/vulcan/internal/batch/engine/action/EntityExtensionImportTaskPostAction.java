/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.vulcan.internal.batch.engine.action;

import com.liferay.batch.engine.action.ImportTaskPostAction;
import com.liferay.batch.engine.model.BatchEngineImportTask;
import com.liferay.portal.vulcan.dto.extension.EntityExtensionSupport;
import com.liferay.portal.vulcan.extension.EntityExtensionHandler;
import com.liferay.portal.vulcan.extension.ExtensionProviderRegistry;
import com.liferay.portal.vulcan.extension.util.ExtensionUtil;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Matija Petanjek
 */
@Component(service = ImportTaskPostAction.class)
public class EntityExtensionImportTaskPostAction
	implements ImportTaskPostAction {

	@Override
	public void run(
			BatchEngineImportTask batchEngineImportTask, Object item,
			Object persistedItem)
		throws Exception {

		if (!(item instanceof EntityExtensionSupport)) {
			return;
		}

		EntityExtensionHandler entityExtensionHandler =
			ExtensionUtil.getEntityExtensionHandler(
				batchEngineImportTask.getClassName(),
				batchEngineImportTask.getCompanyId(),
				_extensionProviderRegistry);

		if (entityExtensionHandler == null) {
			return;
		}

		EntityExtensionSupport entityExtensionSupport =
			(EntityExtensionSupport)item;

		entityExtensionHandler.setExtendedProperties(
			batchEngineImportTask.getCompanyId(),
			batchEngineImportTask.getUserId(), persistedItem,
			entityExtensionSupport.getExtendedProperties());
	}

	@Reference
	private ExtensionProviderRegistry _extensionProviderRegistry;

}