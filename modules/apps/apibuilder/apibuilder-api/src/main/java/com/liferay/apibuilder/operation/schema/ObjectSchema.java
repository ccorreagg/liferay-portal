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

import java.util.Map;

/**
 * @author Carlos Correa
 */
public class ObjectSchema implements Schema {

	public ObjectSchema(
		String className, String name, Map<String, Schema> properties,
		boolean required) {

		_className = className;
		_name = name;
		_properties = properties;
		_required = required;
	}

	public String getClassName() {
		return _className;
	}

	@Override
	public String getName() {
		return _name;
	}

	public Schema getPrimaryKey() {
		for (Schema schema : _properties.values()) {
			if (schema instanceof AttributeSchema) {
				AttributeSchema attributeSchema = (AttributeSchema)schema;

				if (attributeSchema.isPrimaryKey()) {
					return attributeSchema;
				}
			}
			else if (schema instanceof ObjectSchema) {
				ObjectSchema objectSchema = (ObjectSchema)schema;

				return objectSchema.getPrimaryKey();
			}
		}

		throw new IllegalStateException();
	}

	public Map<String, Schema> getProperties() {
		return _properties;
	}

	@Override
	public boolean isRequired() {
		return _required;
	}

	private final String _className;
	private final String _name;
	private final Map<String, Schema> _properties;
	private final boolean _required;

}