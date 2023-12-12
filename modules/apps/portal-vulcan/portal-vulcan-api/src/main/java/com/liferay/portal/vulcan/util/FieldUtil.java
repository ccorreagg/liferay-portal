/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Carlos Correa
 */
public class FieldUtil {

	public static Set<String> parseFields(String fieldNamesString) {
		if (fieldNamesString == null) {
			return null;
		}

		Set<String> fieldNames = new HashSet<>();

		if (fieldNamesString.isEmpty()) {
			return fieldNames;
		}

		for (String fieldName : fieldNamesString.split(",")) {
			fieldNames.addAll(_toPaths(fieldName));
		}

		return fieldNames;
	}

	public static Set<String> parseRestrictFields(String fieldNamesString) {
		if (fieldNamesString == null) {
			return null;
		}

		if (fieldNamesString.isEmpty()) {
			return Collections.emptySet();
		}

		return new HashSet<>(Arrays.asList(fieldNamesString.split(",")));
	}

	public static boolean shouldWrite(
		Set<String> fieldNames, List<String> paths,
		Set<String> restrictFieldNames) {

		if (_isFiltered(fieldNames, paths.get(0), restrictFieldNames)) {
			return true;
		}

		if (paths.size() == 1) {
			return false;
		}

		for (int i = 1; i < paths.size(); i++) {
			if (_isFilteredWithoutNested(
					fieldNames, paths.get(i), restrictFieldNames)) {

				return true;
			}
		}

		return false;
	}

	private static boolean _isFiltered(
		Set<String> fieldNames, String path, Set<String> restrictFieldNames) {

		if ((fieldNames.isEmpty() || fieldNames.contains(path)) &&
			!restrictFieldNames.contains(path)) {

			return true;
		}

		return false;
	}

	private static boolean _isFilteredWithoutNested(
		Set<String> fieldNames, String path, Set<String> restrictFieldNames) {

		if (_isFiltered(fieldNames, path, restrictFieldNames)) {
			for (String fieldName : fieldNames) {
				if (fieldName.startsWith(path + ".")) {
					return false;
				}
			}

			for (String restrictFieldName : restrictFieldNames) {
				if (restrictFieldName.startsWith(path + ".")) {
					return false;
				}
			}

			return true;
		}

		return false;
	}

	private static List<String> _toPaths(String fieldName) {
		if (!fieldName.contains(".")) {
			return Collections.singletonList(fieldName);
		}

		List<String> list = new ArrayList<>();

		String pending = fieldName;

		while (!pending.equals("")) {
			list.add(pending);

			if (pending.contains(".")) {
				pending = pending.substring(0, pending.lastIndexOf("."));
			}
			else {
				pending = "";
			}
		}

		return list;
	}

}