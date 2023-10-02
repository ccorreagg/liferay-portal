/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.engine.internal.unit;

import com.liferay.batch.engine.BatchEngineImportTaskExecutor;
import com.liferay.batch.engine.internal.unit.util.BatchEngineUnitUtil;
import com.liferay.batch.engine.internal.writer.BatchEngineTaskItemDelegateProvider;
import com.liferay.batch.engine.service.BatchEngineImportTaskLocalService;
import com.liferay.batch.engine.unit.BatchEngineUnit;
import com.liferay.batch.engine.unit.BatchEngineUnitConfiguration;
import com.liferay.batch.engine.unit.BatchEngineUnitProcessor;
import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMap;
import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMapFactory;
import com.liferay.petra.executor.PortalExecutorManager;
import com.liferay.portal.kernel.service.CompanyLocalService;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.File;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.vulcan.batch.engine.VulcanBatchEngineTaskItemDelegateAdaptorFactory;

import java.util.concurrent.CompletableFuture;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Matija Petanjek
 * @author Carlos Correa
 */
@Component(service = BatchEngineUnitProcessor.class)
public class BatchEngineUnitProcessorImpl implements BatchEngineUnitProcessor {

	@Override
	public CompletableFuture<Void> processBatchEngineUnit(
		BatchEngineUnit batchEngineUnit) {

		InternalBatchEngineUnitProcessor internalBatchEngineUnitProcessor =
			_getInternalBatchEngineUnitProcessor(batchEngineUnit);

		return internalBatchEngineUnitProcessor.processBatchEngineUnit(
			batchEngineUnit);
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_serviceTrackerMap = ServiceTrackerMapFactory.openSingleValueMap(
			bundleContext, InternalBatchEngineUnitProcessor.class,
			"processor.type");
	}

	@Deactivate
	protected void deactivate() {
		_serviceTrackerMap.close();
	}

	private InternalBatchEngineUnitProcessor
		_getInternalBatchEngineUnitProcessor(BatchEngineUnit batchEngineUnit) {

		try {
			BatchEngineUnitConfiguration batchEngineUnitConfiguration =
				batchEngineUnit.getBatchEngineUnitConfiguration();

			if (batchEngineUnitConfiguration.isMultiCompany()) {
				return _serviceTrackerMap.getService("multicompany");
			}
			else if (batchEngineUnitConfiguration.isCheckFeatureFlag() &&
					 Validator.isNotNull(
						 BatchEngineUnitUtil.getFeatureFlag(
							 batchEngineUnitConfiguration))) {

				return _serviceTrackerMap.getService("feature.flag");
			}

			return _serviceTrackerMap.getService("default");
		}
		catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}

	@Reference
	private BatchEngineImportTaskExecutor _batchEngineImportTaskExecutor;

	@Reference
	private BatchEngineImportTaskLocalService
		_batchEngineImportTaskLocalService;

	@Reference
	private BatchEngineTaskItemDelegateProvider
		_batchEngineTaskItemDelegateProvider;

	@Reference
	private CompanyLocalService _companyLocalService;

	@Reference
	private File _file;

	@Reference
	private PortalExecutorManager _portalExecutorManager;

	private ServiceTrackerMap<String, InternalBatchEngineUnitProcessor>
		_serviceTrackerMap;

	@Reference
	private UserLocalService _userLocalService;

	@Reference
	private VulcanBatchEngineTaskItemDelegateAdaptorFactory
		_vulcanBatchEngineTaskItemDelegateAdaptorFactory;

}