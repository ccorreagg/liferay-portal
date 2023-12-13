/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.fields;

import com.liferay.petra.lang.CentralizedThreadLocal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carlos Correa
 */
public class CurrentFieldsThreadLocal {

	public static void addFieldName(String fieldName) {
		List<String> fieldNames = _fieldNamesThreadLocal.get();

		fieldNames.add(fieldName);
	}

	public static void removeFieldName(String fieldName) {
		List<String> fieldNames = _fieldNamesThreadLocal.get();

		fieldNames.remove(fieldName);
	}

	public static void clearFieldNames() {
		List<String> fieldNames = _fieldNamesThreadLocal.get();

		fieldNames.clear();
	}

	private static final ThreadLocal<List<String>> _fieldNamesThreadLocal =
		new CentralizedThreadLocal<>(
			CurrentFieldsThreadLocal.class + "._fieldNames",
			ArrayList::new);

}