/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.dto.converter;

import com.liferay.petra.function.UnsafeFunction;

import java.util.Map;

/**
 * @author Carlos Correa
 */
public interface NewDTOConverter<D, E> {

	public E toDTO(
			Class<? extends E> clazz, DTOConverterContext dtoConverterContext,
			D item)
		throws Exception;

	public E toDTO(
			Class<? extends E> clazz,
			Map<String, UnsafeFunction<D, Object, Exception>>
				fieldUnsafeFunctions,
			D object)
		throws Exception;

}