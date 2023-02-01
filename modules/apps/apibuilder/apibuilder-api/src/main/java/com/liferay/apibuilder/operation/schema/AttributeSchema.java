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

/**
 * @author Carlos Correa
 */
public class AttributeSchema implements Schema {

	public AttributeSchema(
		AttributeType attributeType, String externalName, String name,
		boolean primaryKey, boolean required) {

		_attributeType = attributeType;
		_externalName = externalName;
		_name = name;
		_primaryKey = primaryKey;
		_required = required;
	}

	public AttributeType getAttributeType() {
		return _attributeType;
	}

	public String getExternalName() {
		return _externalName;
	}

	@Override
	public String getName() {
		return _name;
	}

	public boolean isPrimaryKey() {
		return _primaryKey;
	}

	@Override
	public boolean isRequired() {
		return _required;
	}

	private final AttributeType _attributeType;
	private final String _externalName;
	private final String _name;
	private final boolean _primaryKey;
	private final boolean _required;

}