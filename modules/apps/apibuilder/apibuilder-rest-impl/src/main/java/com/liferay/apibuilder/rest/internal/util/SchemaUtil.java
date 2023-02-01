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

package com.liferay.apibuilder.rest.internal.util;

import com.liferay.apibuilder.operation.schema.AttributeSchema;
import com.liferay.apibuilder.operation.schema.ObjectSchema;
import com.liferay.apibuilder.operation.schema.Schema;
import com.liferay.portal.kernel.util.StringUtil;

import java.util.Map;

/**
 * @author Carlos Correa
 */
public class SchemaUtil {

	public static AttributeSchema getAttributeSchema(
		String parameterName, Schema schema) {

		if (schema instanceof ObjectSchema) {
			ObjectSchema objectSchema = (ObjectSchema)schema;

			Map<String, Schema> properties = objectSchema.getProperties();

			for (Schema schema1 : properties.values()) {
				if (schema1 instanceof AttributeSchema) {
					AttributeSchema attributeSchema = (AttributeSchema)schema1;

					if (StringUtil.equals(
							attributeSchema.getExternalName(), parameterName)) {

						return attributeSchema;
					}
				}
			}
		}

		throw new IllegalStateException();
	}

}