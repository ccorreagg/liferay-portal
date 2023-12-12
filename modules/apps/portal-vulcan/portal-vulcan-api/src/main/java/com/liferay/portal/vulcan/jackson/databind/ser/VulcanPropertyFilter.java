/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;

import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.portal.vulcan.util.FieldUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Alejandro Hernández
 */
public class VulcanPropertyFilter
	extends SimpleBeanPropertyFilter implements PropertyFilter {

	public static VulcanPropertyFilter of(
		Set<String> fieldNames, Set<String> restrictFieldNames) {

		return new VulcanPropertyFilter(fieldNames, restrictFieldNames);
	}

	@Override
	public void serializeAsField(
			Object object, JsonGenerator jsonGenerator,
			SerializerProvider serializerProvider,
			PropertyWriter propertyWriter)
		throws Exception {

		if (!include(propertyWriter)) {
			return;
		}

		if (_shouldWrite(jsonGenerator, propertyWriter)) {
			propertyWriter.serializeAsField(
				object, jsonGenerator, serializerProvider);
		}
	}

	private VulcanPropertyFilter(
		Set<String> fieldNames, Set<String> restrictFieldNames) {

		if (fieldNames == null) {
			_fieldNames = new HashSet<>();
		}
		else {
			_fieldNames = fieldNames;
		}

		if (restrictFieldNames == null) {
			_restrictFieldNames = new HashSet<>();
		}
		else {
			_restrictFieldNames = restrictFieldNames;
		}
	}

	private boolean _shouldWrite(
		JsonGenerator jsonGenerator, PropertyWriter propertyWriter) {

		return FieldUtil.shouldWrite(
			_fieldNames, _toPaths(jsonGenerator, propertyWriter.getName()),
			_restrictFieldNames);
	}

	private List<String> _toPaths(JsonGenerator jsonGenerator, String name) {
		List<String> paths = new ArrayList<>();

		paths.add(name);

		JsonStreamContext jsonStreamContext = jsonGenerator.getOutputContext();

		if (jsonStreamContext != null) {
			jsonStreamContext = jsonStreamContext.getParent();
		}

		while (jsonStreamContext != null) {
			String currentName = jsonStreamContext.getCurrentName();

			if ((currentName != null) && currentName.contains("items")) {
				break;
			}

			if (currentName != null) {
				paths = TransformUtil.transform(
					paths, (currentName + ".")::concat);

				paths.add(currentName);
			}

			jsonStreamContext = jsonStreamContext.getParent();
		}

		return paths;
	}

	private final Set<String> _fieldNames;
	private final Set<String> _restrictFieldNames;

}