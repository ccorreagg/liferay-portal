/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.engine.internal.unit.util;

import com.liferay.batch.engine.unit.BatchEngineUnitConfiguration;
import com.liferay.portal.kernel.util.MapUtil;

/**
 * @author Carlos Correa
 */
public class BatchEngineUnitUtil {

	public static String getFeatureFlag(
		BatchEngineUnitConfiguration batchEngineUnitConfiguration) {

		if (batchEngineUnitConfiguration.getParameters() == null) {
			return null;
		}

		return MapUtil.getString(
			batchEngineUnitConfiguration.getParameters(), "featureFlag");
	}

}