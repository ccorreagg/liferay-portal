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

package com.liferay.portal.vulcan.extension.validation;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.vulcan.extension.ExtendedPropertyDefinition;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Map;

import javax.validation.ValidationException;

/**
 * @author Carlos Correa
 */
public class DefaultExtendedPropertyValidator
	implements ExtendedPropertyValidator {

	@Override
	public void validate(
		ExtendedPropertyDefinition extendedPropertyDefinition,
		Object fieldValue) {

		boolean valid = false;

		Class<?> clazz = extendedPropertyDefinition.getPropertyClass();

		ExtendedPropertyDefinition.FieldType fieldType =
			extendedPropertyDefinition.getType();

		if (fieldType == ExtendedPropertyDefinition.FieldType.DATE) {
			if (fieldValue instanceof String) {
				DateFormat dateFormat = new SimpleDateFormat(
					"yyyy-MM-dd'T'HH:mm:ss'Z'");

				try {
					dateFormat.parse((String)fieldValue);
					valid = true;
				}
				catch (ParseException parseException) {
				}
			}
		}
		else if (fieldType ==
					ExtendedPropertyDefinition.FieldType.MULTIPLE_ELEMENT) {

			Class<?> fieldValueClass = fieldValue.getClass();

			if ((clazz != null) && fieldValueClass.isArray()) {
				valid = true;

				for (Object object : (Object[])fieldValue) {
					if (ObjectMapperUtil.readValue(clazz, object) == null) {
						valid = false;

						break;
					}
				}
			}
		}
		else if (fieldType ==
					ExtendedPropertyDefinition.FieldType.SINGLE_ELEMENT) {

			if ((clazz != null) && (fieldValue instanceof Map) &&
				(ObjectMapperUtil.readValue(clazz, fieldValue) != null)) {

				valid = true;
			}
		}
		else if ((clazz != null) && clazz.isInstance(fieldValue)) {
			valid = true;
		}

		if (!valid) {
			throw new ValidationException(
				StringBundler.concat(
					"Invalid field ", extendedPropertyDefinition.getName(),
					", expected type: ", extendedPropertyDefinition.getType()));
		}
	}

}