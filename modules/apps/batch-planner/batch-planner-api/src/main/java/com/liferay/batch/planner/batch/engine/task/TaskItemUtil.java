/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.planner.batch.engine.task;

import com.liferay.batch.engine.constants.BatchEngineTaskConstants;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

/**
 * @author Igor Beslic
 */
public class TaskItemUtil {

	public static String getDelegateName(String internalClassName) {
		int idx = internalClassName.indexOf(StringPool.POUND);

		if (idx < 0) {
			return BatchEngineTaskConstants.TASK_ITEM_DELEGATE_NAME_DEFAULT;
		}

		return internalClassName.substring(idx + 1);
	}

	public static String getInternalClassName(String internalClassName) {
		int idx = internalClassName.indexOf(StringPool.POUND);

		if (idx < 0) {
			return internalClassName;
		}

		return internalClassName.substring(0, idx);
	}

	public static String getInternalClassName(
		String internalClassName, String taskItemDelegateName) {

		if (Validator.isBlank(taskItemDelegateName) ||
			StringUtil.equals(
				taskItemDelegateName,
				BatchEngineTaskConstants.TASK_ITEM_DELEGATE_NAME_DEFAULT)) {

			return internalClassName;
		}

		return internalClassName + StringPool.POUND + taskItemDelegateName;
	}

}