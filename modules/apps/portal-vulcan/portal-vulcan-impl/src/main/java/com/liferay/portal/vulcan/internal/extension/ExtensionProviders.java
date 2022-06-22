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

package com.liferay.portal.vulcan.internal.extension;

import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.vulcan.extension.ExtensionProvider;

import java.util.List;
import java.util.Map;

/**
 * @author Javier de Arcos
 */
public class ExtensionProviders {

	public ExtensionProviders(
		Class<?> clazz, List<ExtensionProvider> extensionProviderList) {

		_clazz = clazz;
		_extensionProviderList = extensionProviderList;
	}

	public boolean exists() {
		return ListUtil.isNotEmpty(_extensionProviderList);
	}

	public void validate(
		Map<String, Object> extendedProperties, boolean partialUpdate) {

		/*
		List<ExtendedProperty> extendedProperties = new ArrayList<>();

		Obtener todos los tipos (nombre, tipo del dato, mandatory) de los extension providers registrados

		for (ExtensionProvider extensionProvider: _extensionProviderList) {
			extendedProperties.addAll(extensionProvider.getExtendedProperties(className));
		}

		Recorrer todas las extended properties para validar su tipo, que no haya ninguna desconocida.
		De alguna manera habría que quedarse con las mandatory para comprobar después que están todas

		Lanzar ValidationException si no es válido
		 */
	}

	private final Class<?> _clazz;
	private final List<ExtensionProvider> _extensionProviderList;

}