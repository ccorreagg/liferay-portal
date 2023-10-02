/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.engine.internal.unit;

import com.liferay.batch.engine.internal.bundle.CompanyBatchEngineUnitWrapper;
import com.liferay.batch.engine.unit.BatchEngineUnit;
import com.liferay.batch.engine.unit.BatchEngineUnitProcessor;
import com.liferay.batch.engine.unit.BundleBatchEngineUnit;
import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.service.CompanyLocalService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.framework.Bundle;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(
	property = "processor.type=multicompany",
	service = InternalBatchEngineUnitProcessor.class
)
public class MultiCompanyInternalBatchEngineUnitProcessor
	implements InternalBatchEngineUnitProcessor {

	@Override
	public CompletableFuture<Void> processBatchEngineUnit(
		BatchEngineUnit batchEngineUnit) {

		BundleBatchEngineUnit bundleBatchEngineUnit =
			(BundleBatchEngineUnit)batchEngineUnit;

		_bundleBatchEngineUnits.compute(
			bundleBatchEngineUnit.getBundle(),
			(bundle, batchEngineUnits) -> {
				if (batchEngineUnits == null) {
					batchEngineUnits = new ArrayList<>();
				}

				batchEngineUnits.add(batchEngineUnit);

				return batchEngineUnits;
			});

		List<CompletableFuture<Void>> completableFutures = new ArrayList<>();

		_companyLocalService.forEachCompany(
			company -> completableFutures.add(
				_processBatchEngineUnits(
					bundleBatchEngineUnit.getBundle(), company)));

		return CompletableFuture.allOf(
			completableFutures.toArray(new CompletableFuture[0]));
	}

	public CompletableFuture<Void> processBatchEngineUnits(Company company) {
		List<CompletableFuture<Void>> completableFutures = new ArrayList<>();

		for (Bundle bundle :
				new ArrayList<>(_bundleBatchEngineUnits.keySet())) {

			completableFutures.add(_processBatchEngineUnits(bundle, company));
		}

		return CompletableFuture.allOf(
			completableFutures.toArray(new CompletableFuture[0]));
	}

	public void unregister(Bundle bundle) {
		_bundleBatchEngineUnits.remove(bundle);
		_bundleProcessedCompanies.remove(bundle);
	}

	public void unregister(Company company) {
		for (Set<Long> companyIds :
				new ArrayList<>(_bundleProcessedCompanies.values())) {

			companyIds.remove(company.getCompanyId());
		}
	}

	private CompletableFuture<Void> _processBatchEngineUnits(
		Bundle bundle, Company company) {

		Set<Long> companyIds = _bundleProcessedCompanies.computeIfAbsent(
			bundle, key -> new HashSet<>());

		if (companyIds.contains(company.getCompanyId())) {
			return CompletableFuture.completedFuture(null);
		}

		companyIds.add(company.getCompanyId());

		List<CompletableFuture<Void>> completableFutures =
			TransformUtil.transform(
				new ArrayList<>(_bundleBatchEngineUnits.get(bundle)),
				batchEngineUnit -> {
					BatchEngineUnit batchEngineUnitWrapper =
						new CompanyBatchEngineUnitWrapper(
							batchEngineUnit, company);

					return _batchEngineUnitProcessor.processBatchEngineUnit(
						batchEngineUnitWrapper);
				});

		return CompletableFuture.allOf(
			completableFutures.toArray(new CompletableFuture[0]));
	}

	@Reference
	private BatchEngineUnitProcessor _batchEngineUnitProcessor;

	private final Map<Bundle, List<BatchEngineUnit>> _bundleBatchEngineUnits =
		new ConcurrentHashMap<>();
	private final Map<Bundle, Set<Long>> _bundleProcessedCompanies =
		new ConcurrentHashMap<>();

	@Reference
	private CompanyLocalService _companyLocalService;

}