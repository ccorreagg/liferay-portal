/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.internal.dto.converter;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMap;
import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMapFactory;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;
import com.liferay.portal.vulcan.dto.converter.FieldProvider;
import com.liferay.portal.vulcan.dto.converter.NewDTOConverter;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

/**
 * @author Carlos Correa
 */
@Component(service = NewDTOConverter.class)
public class NewDTOConverterImpl<E, D> implements NewDTOConverter<E, D> {

	@Override
	public D toDTO(
			Class<? extends D> clazz, DTOConverterContext dtoConverterContext,
			E item)
		throws Exception {

		FieldProvider<E, D> fieldProvider = _serviceTrackerMap.getService(
			clazz.getName());

		D dto = clazz.newInstance();

		for (Field field : clazz.getDeclaredFields()) {
			if (field.getAnnotation(JsonProperty.class) == null) {
				continue;
			}

			String fieldName = field.getName();

			fieldProvider.setFieldValue(
				dto, dtoConverterContext, fieldName, item);
		}

		return dto;
	}

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

			Method method = clazz.getMethod(
				"set" + StringUtil.upperCaseFirstLetter(entry.getKey()),
				UnsafeSupplier.class);

			UnsafeFunction<E, Object, Exception> unsafeFunction =
				entry.getValue();

			method.invoke(
				dto, (UnsafeSupplier)() -> unsafeFunction.apply(object));
		}

		return dto;
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_serviceTrackerMap = ServiceTrackerMapFactory.openSingleValueMap(
			bundleContext, FieldProvider.class, "dto.class.name");
	}

	@Deactivate
	protected void deactivate() {
		_serviceTrackerMap.close();
	}

	private ServiceTrackerMap<String, FieldProvider> _serviceTrackerMap;

}