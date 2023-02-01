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

package com.liferay.apibuilder.operation.schema;

import com.liferay.portal.kernel.util.GetterUtil;

import java.util.Objects;

/**
 * @author Carlos Correa
 */
public class AttributeValue {

	public static AttributeValue parse(
		AttributeSchema attributeSchema, String stringValue) {

		AttributeType attributeType = attributeSchema.getAttributeType();

		if (Objects.equals(AttributeType.BOOLEAN, attributeType)) {
			return new AttributeValue(
				attributeSchema, GetterUtil.getBoolean(stringValue));
		}
		else if (Objects.equals(AttributeType.INTEGER, attributeType)) {
			return new AttributeValue(
				attributeSchema, GetterUtil.getInteger(stringValue));
		}
		else if (Objects.equals(AttributeType.LONG, attributeType)) {
			return new AttributeValue(
				attributeSchema, GetterUtil.getLong(stringValue));
		}
		else if (Objects.equals(AttributeType.STRING, attributeType)) {
			return new AttributeValue(attributeSchema, stringValue);
		}

		throw new IllegalArgumentException("Invalid value " + stringValue);
	}

	public AttributeSchema getAttributeSchema() {
		return _attributeSchema;
	}

	public Object getValue() {
		return _value;
	}

	private AttributeValue(AttributeSchema attributeSchema, Object value) {
		_attributeSchema = attributeSchema;
		_value = value;
	}

	private final AttributeSchema _attributeSchema;
	private final Object _value;

}