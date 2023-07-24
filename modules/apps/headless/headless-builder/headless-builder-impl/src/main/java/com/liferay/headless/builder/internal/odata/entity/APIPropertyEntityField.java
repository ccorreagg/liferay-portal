/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.headless.builder.internal.odata.entity;

import com.liferay.portal.odata.entity.EntityField;

import java.util.Locale;
import java.util.function.Function;

/**
 * @author Carlos Correa
 */
public class APIPropertyEntityField extends EntityField {

	public APIPropertyEntityField(
		String internalName, String name, Type type,
		Function<Locale, String> sortableFieldNameFunction,
		Function<Locale, String> filterableFieldNameFunction,
		Function<Object, String> filterableFieldValueFunction) {

		super(
			name, type, sortableFieldNameFunction, filterableFieldNameFunction,
			filterableFieldValueFunction);

		_internalName = internalName;
	}

	public String getInternalName() {
		return _internalName;
	}

	private final String _internalName;

}