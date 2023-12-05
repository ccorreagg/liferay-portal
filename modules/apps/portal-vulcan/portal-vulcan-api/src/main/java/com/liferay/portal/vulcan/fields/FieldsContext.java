/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.fields;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carlos Correa
 */
public class FieldsContext {

	public FieldsContext(List<String> fields, List<String> restrictFields) {
		_fields = fields;
		_restrictFields = restrictFields;
	}

	public void setCurrentField(String field) {
		_currentField = field;
	}

	private String _currentField;
	private List<String> _fields = new ArrayList<>();
	private List<String> _restrictFields = new ArrayList<>();

}