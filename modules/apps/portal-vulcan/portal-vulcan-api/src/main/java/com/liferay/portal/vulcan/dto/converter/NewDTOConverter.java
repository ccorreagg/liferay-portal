/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.dto.converter;

import com.liferay.petra.function.UnsafeFunction;

import java.util.Map;

/**
 * @author Carlos Correa
 */
public interface NewDTOConverter<E, D> {

	public D toDTO(
			Class<? extends D> clazz,
			Map<String, UnsafeFunction<E, Object, Exception>>
				fieldUnsafeFunctions,
			E object)
		throws Exception;

}