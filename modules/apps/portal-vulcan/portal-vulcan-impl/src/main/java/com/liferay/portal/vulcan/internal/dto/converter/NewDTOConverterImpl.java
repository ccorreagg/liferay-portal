/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.internal.dto.converter;

import com.liferay.petra.function.UnsafeFunction;
import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.dto.converter.NewDTOConverter;

import java.lang.reflect.Field;

import java.lang.reflect.Method;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * @author Carlos Correa
 */
@Component(service = NewDTOConverter.class)
public class NewDTOConverterImpl<E, D> implements NewDTOConverter<E, D> {

	@Override
	public D toDTO(
			Class<? extends D> clazz,
			Map<String, UnsafeFunction<E, Object, Exception>>
				fieldUnsafeFunctions,
			E object)
		throws Exception {

		D dto = clazz.newInstance();

		for (Map.Entry<String, UnsafeFunction<E, Object, Exception>> entry :
				fieldUnsafeFunctions.entrySet()) {

			Method method = clazz.getMethod("set" + StringUtil.upperCaseFirstLetter(entry.getKey()), UnsafeSupplier.class);

//			Field field = clazz.getDeclaredField(entry.getKey());

			UnsafeFunction<E, Object, Exception> unsafeFunction =
				entry.getValue();

			method.invoke(dto, (UnsafeSupplier) () -> unsafeFunction.apply(object));

//			field.set(dto, unsafeFunction.apply(object));
		}

		return dto;
	}

}