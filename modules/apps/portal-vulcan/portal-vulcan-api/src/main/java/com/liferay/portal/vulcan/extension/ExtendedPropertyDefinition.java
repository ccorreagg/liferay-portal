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

package com.liferay.portal.vulcan.extension;

import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.vulcan.extension.validation.DefaultExtendedPropertyValidator;
import com.liferay.portal.vulcan.extension.validation.ExtendedPropertyValidator;

import java.math.BigDecimal;

import java.util.Map;

/**
 * @author Carlos Correa
 */
public class ExtendedPropertyDefinition {

	public ExtendedPropertyDefinition(
		Class<?> clazz, String name, boolean required, FieldType type,
		ExtendedPropertyValidator validator) {

		_name = name;
		_required = required;
		_type = type;
		_validator = validator;

		_propertyClass = clazz;
	}

	public ExtendedPropertyDefinition(
		String name, boolean required, FieldType type) {

		_name = name;
		_required = required;
		_type = type;

		_propertyClass = _fieldTypeClassMap.getOrDefault(type, null);

		_validator = new DefaultExtendedPropertyValidator();
	}

	public ExtendedPropertyDefinition(
		String name, boolean required, FieldType type,
		ExtendedPropertyValidator validator) {

		_name = name;
		_required = required;
		_type = type;
		_validator = validator;

		_propertyClass = _fieldTypeClassMap.getOrDefault(type, null);
	}

	public String getName() {
		return _name;
	}

	public Class<?> getPropertyClass() {
		return _propertyClass;
	}

	public FieldType getType() {
		return _type;
	}

	public ExtendedPropertyValidator getValidator() {
		return _validator;
	}

	public boolean isRequired() {
		return _required;
	}

	public enum FieldType {

		BIG_DECIMAL, BOOLEAN, DATE, DECIMAL, DOUBLE, INTEGER, LONG,
		MULTIPLE_ELEMENT, SINGLE_ELEMENT, TEXT

	}

	private final Map<FieldType, Class<?>> _fieldTypeClassMap =
		HashMapBuilder.<FieldType, Class<?>>put(
			FieldType.BIG_DECIMAL, BigDecimal.class
		).<FieldType, Class<?>>put(
			FieldType.BOOLEAN, Boolean.class
		).<FieldType, Class<?>>put(
			FieldType.DECIMAL, Float.class
		).<FieldType, Class<?>>put(
			FieldType.DOUBLE, Double.class
		).<FieldType, Class<?>>put(
			FieldType.INTEGER, Integer.class
		).<FieldType, Class<?>>put(
			FieldType.LONG, Long.class
		).<FieldType, Class<?>>put(
			FieldType.TEXT, String.class
		).build();
	private final String _name;
	private final Class<?> _propertyClass;
	private final boolean _required;
	private final FieldType _type;
	private final ExtendedPropertyValidator _validator;

}