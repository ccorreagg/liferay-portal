/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.engine.unit;

import java.util.concurrent.CompletableFuture;

/**
 * @author Raymond Augé
 */
public interface BatchEngineUnitProcessor {

	public CompletableFuture<Void> processBatchEngineUnit(
		BatchEngineUnit batchEngineUnit);

}