/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.engine.internal.unit;

import com.liferay.batch.engine.internal.bundle.FeatureFlagBatchEngineUnitWrapper;
import com.liferay.batch.engine.internal.unit.util.BatchEngineUnitUtil;
import com.liferay.batch.engine.unit.BatchEngineUnit;
import com.liferay.batch.engine.unit.BatchEngineUnitConfiguration;
import com.liferay.batch.engine.unit.BatchEngineUnitProcessor;
import com.liferay.petra.executor.PortalExecutorManager;
import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.portal.kernel.feature.flag.FeatureFlag;
import com.liferay.portal.kernel.feature.flag.FeatureFlagManagerUtil;
import com.liferay.portal.kernel.feature.flag.listener.FeatureFlagListener;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Tuple;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(
	property = "processor.type=feature.flag",
	service = InternalBatchEngineUnitProcessor.class
)
public class FeatureFlagInternalBatchEngineUnitProcessor
	implements InternalBatchEngineUnitProcessor {

	@Override
	public CompletableFuture<Void> processBatchEngineUnit(
		BatchEngineUnit batchEngineUnit) {

		try {
			BatchEngineUnitConfiguration batchEngineUnitConfiguration =
				batchEngineUnit.getBatchEngineUnitConfiguration();

			String featureFlag = BatchEngineUnitUtil.getFeatureFlag(
				batchEngineUnitConfiguration);

			FeatureFlagBatchEngineUnitWrapper
				featureFlagBatchEngineUnitWrapper =
					new FeatureFlagBatchEngineUnitWrapper(
						batchEngineUnit, null);

			if (FeatureFlagManagerUtil.isEnabled(featureFlag)) {
				return _batchEngineUnitProcessor.processBatchEngineUnit(
					featureFlagBatchEngineUnitWrapper);
			}

			_unsafeSuppliers.compute(
				_getTuple(
					batchEngineUnitConfiguration.getCompanyId(), featureFlag),
				(key, unsafeSuppliers) -> {
					if (unsafeSuppliers == null) {
						unsafeSuppliers = new ArrayList<>();
					}

					unsafeSuppliers.add(
						() -> _batchEngineUnitProcessor.processBatchEngineUnit(
							featureFlagBatchEngineUnitWrapper));

					return unsafeSuppliers;
				});
		}
		catch (Exception exception) {
			if (_log.isWarnEnabled()) {
				_log.warn(exception);
			}
		}

		return null;
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_serviceRegistration = bundleContext.registerService(
			FeatureFlagListener.class, new FeatureFlagListenerImpl(), null);
	}

	@Deactivate
	protected void deactivate() {
		_serviceRegistration.unregister();
	}

	private Tuple _getTuple(long companyId, String featureFlagKey) {
		return new Tuple(companyId, featureFlagKey);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		FeatureFlagInternalBatchEngineUnitProcessor.class);

	@Reference
	private BatchEngineUnitProcessor _batchEngineUnitProcessor;

	@Reference
	private PortalExecutorManager _portalExecutorManager;

	private ServiceRegistration<FeatureFlagListener> _serviceRegistration;
	private final Map
		<Tuple, List<UnsafeSupplier<CompletableFuture<Void>, Exception>>>
			_unsafeSuppliers = new ConcurrentHashMap<>();

	private class FeatureFlagListenerImpl implements FeatureFlagListener {

		@Override
		public void onDisabled(long companyId, FeatureFlag featureFlag) {
		}

		@Override
		public void onEnabled(long companyId, FeatureFlag featureFlag) {
			Tuple tuple = _getTuple(companyId, featureFlag.getKey());

			if (!_unsafeSuppliers.containsKey(tuple)) {
				return;
			}

			synchronized (_unsafeSuppliers) {
				List<UnsafeSupplier<CompletableFuture<Void>, Exception>>
					unsafeSuppliers = _unsafeSuppliers.remove(tuple);

				ExecutorService executorService =
					_portalExecutorManager.getPortalExecutor(
						FeatureFlagListenerImpl.class.getName());

				executorService.submit(
					() -> {
						for (UnsafeSupplier<CompletableFuture<Void>, Exception>
								unsafeSupplier : unsafeSuppliers) {

							try {
								CompletableFuture<Void> completableFuture =
									unsafeSupplier.get();

								completableFuture.get();
							}
							catch (Exception exception) {
								throw new RuntimeException(exception);
							}
						}
					});
			}
		}

	}

}