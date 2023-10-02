/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.engine.internal.bundle;

import com.liferay.batch.engine.unit.BatchEngineUnit;
import com.liferay.batch.engine.unit.BatchEngineUnitConfiguration;
import com.liferay.batch.engine.unit.BundleBatchEngineUnit;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

import java.util.Map;

import org.osgi.framework.Bundle;

/**
 * @author Carlos Correa
 */
public class FeatureFlagBatchEngineUnitWrapper
	implements BundleBatchEngineUnit {

	public FeatureFlagBatchEngineUnitWrapper(
		BatchEngineUnit batchEngineUnit, String featureFlagKey) {

		_batchEngineUnit = batchEngineUnit;
		_featureFlagKey = featureFlagKey;
	}

	@Override
	public BatchEngineUnitConfiguration getBatchEngineUnitConfiguration()
		throws IOException {

		BatchEngineUnitConfiguration batchEngineUnitConfiguration =
			_batchEngineUnit.getBatchEngineUnitConfiguration();

		Map<String, Serializable> parameters =
			batchEngineUnitConfiguration.getParameters();

		parameters.put("featureFlag", _featureFlagKey);

		return new BatchEngineUnitConfiguration() {
			{
				setCallbackURL(batchEngineUnitConfiguration.getCallbackURL());
				setClassName(batchEngineUnitConfiguration.getClassName());
				setCompanyId(batchEngineUnitConfiguration.getCompanyId());
				setFieldNameMappingMap(
					batchEngineUnitConfiguration.getFieldNameMappingMap());
				setMultiCompany(batchEngineUnitConfiguration.isMultiCompany());
				setParameters(parameters);
				setTaskItemDelegateName(
					batchEngineUnitConfiguration.getTaskItemDelegateName());
				setUserId(batchEngineUnitConfiguration.getUserId());
				setVersion(batchEngineUnitConfiguration.getVersion());
			}
		};
	}

	@Override
	public Bundle getBundle() {
		if (_batchEngineUnit instanceof BundleBatchEngineUnit) {
			BundleBatchEngineUnit bundleBatchEngineUnit =
				(BundleBatchEngineUnit)_batchEngineUnit;

			return bundleBatchEngineUnit.getBundle();
		}

		return null;
	}

	@Override
	public InputStream getConfigurationInputStream() throws IOException {
		return _batchEngineUnit.getConfigurationInputStream();
	}

	@Override
	public String getDataFileName() {
		return _batchEngineUnit.getDataFileName();
	}

	@Override
	public InputStream getDataInputStream() throws IOException {
		return _batchEngineUnit.getDataInputStream();
	}

	@Override
	public String getFileName() {
		return _batchEngineUnit.getFileName();
	}

	@Override
	public boolean isValid() {
		return _batchEngineUnit.isValid();
	}

	private final BatchEngineUnit _batchEngineUnit;
	private final String _featureFlagKey;

}