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

package com.liferay.apibuilder.util;

import com.liferay.apibuilder.operation.schema.AttributeType;
import com.liferay.info.field.type.BooleanInfoFieldType;
import com.liferay.info.field.type.DateInfoFieldType;
import com.liferay.info.field.type.InfoFieldType;
import com.liferay.info.field.type.NumberInfoFieldType;
import com.liferay.info.field.type.TextInfoFieldType;

import java.util.Objects;

/**
 * @author Carlos Correa
 */
public class AttributeTypeUtil {

	public static InfoFieldType getInfoFieldType(AttributeType attributeType) {
		if (Objects.equals(attributeType, AttributeType.BOOLEAN)) {
			return BooleanInfoFieldType.INSTANCE;
		}
		else if (Objects.equals(attributeType, AttributeType.DATETIME)) {
			return DateInfoFieldType.INSTANCE;
		}
		else if (Objects.equals(attributeType, AttributeType.INTEGER) ||
				 Objects.equals(attributeType, AttributeType.LONG)) {

			return NumberInfoFieldType.INSTANCE;
		}
		else if (Objects.equals(attributeType, AttributeType.STRING)) {
			return TextInfoFieldType.INSTANCE;
		}

		return TextInfoFieldType.INSTANCE;
	}

}