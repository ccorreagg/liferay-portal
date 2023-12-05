/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.fields;

import com.liferay.petra.lang.CentralizedThreadLocal;

/**
 * @author Carlos Correa
 */
public class FieldsContextThreadLocal {

	public static FieldsContext getFieldsContext() {
		return _fieldsContextThreadLocal.get();
	}

	public static void setFieldsContext(FieldsContext fieldsContext) {
		_fieldsContextThreadLocal.set(fieldsContext);
	}

	private static final ThreadLocal<FieldsContext> _fieldsContextThreadLocal =
		new CentralizedThreadLocal<>(
			FieldsContextThreadLocal.class + "._fieldsContextThreadLocal");

}