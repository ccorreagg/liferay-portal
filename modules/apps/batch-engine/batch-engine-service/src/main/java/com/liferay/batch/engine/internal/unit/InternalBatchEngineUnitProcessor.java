/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.engine.internal.unit;

import com.liferay.batch.engine.unit.BatchEngineUnit;

import java.util.concurrent.CompletableFuture;

/**
 * @author Carlos Correa
 */
public interface InternalBatchEngineUnitProcessor {

	public CompletableFuture<Void> processBatchEngineUnit(
		BatchEngineUnit batchEngineUnit);

}