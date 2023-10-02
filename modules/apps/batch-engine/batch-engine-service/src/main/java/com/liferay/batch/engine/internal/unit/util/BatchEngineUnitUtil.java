/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.engine.internal.unit.util;

import com.liferay.batch.engine.unit.BatchEngineUnitConfiguration;

import java.io.Serializable;

import java.util.Map;

/**
 * @author Carlos Correa
 */
public class BatchEngineUnitUtil {

	public static String getFeatureFlag(
		BatchEngineUnitConfiguration batchEngineUnitConfiguration) {

		Map<String, Serializable> parameters =
			batchEngineUnitConfiguration.getParameters();

		return (String)parameters.get("featureFlag");
	}

}