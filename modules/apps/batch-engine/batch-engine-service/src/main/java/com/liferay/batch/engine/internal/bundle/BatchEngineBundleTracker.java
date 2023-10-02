/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.engine.internal.bundle;

import com.liferay.batch.engine.internal.unit.InternalBatchEngineUnitProcessor;
import com.liferay.batch.engine.internal.unit.MultiCompanyInternalBatchEngineUnitProcessor;
import com.liferay.batch.engine.unit.BatchEngineUnit;
import com.liferay.batch.engine.unit.BatchEngineUnitProcessor;
import com.liferay.batch.engine.unit.BatchEngineUnitReader;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;

import java.util.Dictionary;
import java.util.Map;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.tracker.BundleTracker;
import org.osgi.util.tracker.BundleTrackerCustomizer;

/**
 * @author Raymond Augé
 */
@Component(service = {})
public class BatchEngineBundleTracker {

	@Activate
	protected void activate(
		BundleContext bundleContext, Map<String, Object> properties) {

		_bundleTracker = new BundleTracker<>(
			bundleContext, Bundle.ACTIVE,
			new BatchEngineBundleTrackerCustomizer());

		_bundleTracker.open();
	}

	@Deactivate
	protected void deactivate() {
		_bundleTracker.close();
	}

	@Reference
	private BatchEngineUnitProcessor _batchEngineUnitProcessor;

	@Reference
	private BatchEngineUnitReader _batchEngineUnitReader;

	private BundleTracker<Bundle> _bundleTracker;

	@Reference(target = "(processor.type=multicompany)")
	private InternalBatchEngineUnitProcessor _internalBatchEngineUnitProcessor;

	@Reference(target = ModuleServiceLifecycle.PORTLETS_INITIALIZED)
	private ModuleServiceLifecycle _moduleServiceLifecycle;

	private class BatchEngineBundleTrackerCustomizer
		implements BundleTrackerCustomizer<Bundle> {

		@Override
		public Bundle addingBundle(Bundle bundle, BundleEvent bundleEvent) {
			Dictionary<String, String> headers = bundle.getHeaders(
				StringPool.BLANK);

			if (headers.get("Liferay-Client-Extension-Batch") == null) {
				return null;
			}

			for (BatchEngineUnit batchEngineUnit :
					_batchEngineUnitReader.getBatchEngineUnits(bundle)) {

				if (!batchEngineUnit.isValid()) {
					continue;
				}

				_batchEngineUnitProcessor.processBatchEngineUnit(
					batchEngineUnit);
			}

			return bundle;
		}

		@Override
		public void modifiedBundle(
			Bundle bundle, BundleEvent bundleEvent, Bundle unusedBundle) {
		}

		@Override
		public void removedBundle(
			Bundle bundle, BundleEvent bundleEvent, Bundle unusedBundle) {

			((MultiCompanyInternalBatchEngineUnitProcessor)
				_internalBatchEngineUnitProcessor).unregister(bundle);
		}

	}

}