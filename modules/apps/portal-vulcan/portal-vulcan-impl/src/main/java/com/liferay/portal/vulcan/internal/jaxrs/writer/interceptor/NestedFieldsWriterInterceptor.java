/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.internal.jaxrs.writer.interceptor;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.vulcan.fields.NestedFieldsContext;
import com.liferay.portal.vulcan.fields.NestedFieldsContextThreadLocal;
import com.liferay.portal.vulcan.internal.extension.NestedFieldsExtensionProvider;
import com.liferay.portal.vulcan.pagination.Page;

import java.io.IOException;
import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;

/**
 * @author Ivica Cardic
 */
@Provider
public class NestedFieldsWriterInterceptor implements WriterInterceptor {

	public NestedFieldsWriterInterceptor(
		NestedFieldsExtensionProvider nestedFieldsExtensionProvider) {

		_nestedFieldsExtensionProvider = nestedFieldsExtensionProvider;
	}

	@Override
	public void aroundWriteTo(WriterInterceptorContext writerInterceptorContext)
		throws IOException, WebApplicationException {

		NestedFieldsContext nestedFieldsContext =
			NestedFieldsContextThreadLocal.getNestedFieldsContext();

		if ((nestedFieldsContext == null) ||
			ListUtil.isEmpty(nestedFieldsContext.getFieldNames())) {

			writerInterceptorContext.proceed();

			return;
		}

		try {
			_setFieldValues(
				writerInterceptorContext.getEntity(),
				nestedFieldsContext.getFieldNames());
		}
		catch (Exception exception) {
			_log.error(exception);

			throw new WebApplicationException(exception);
		}

		writerInterceptorContext.proceed();
	}

	private Class<?> _getClass(Object object) {
		Class<?> clazz = object.getClass();

		String name = clazz.getName();

		if (!name.contains("$")) {
			return clazz;
		}

		return clazz.getSuperclass();
	}

	private Field _getField(Class<?> entityClass, String fieldName) {
		List<Field> fields = new ArrayList<>(
			Arrays.asList(entityClass.getDeclaredFields()));

		Class<?> superClass = entityClass.getSuperclass();

		if (superClass != null) {
			Collections.addAll(fields, superClass.getDeclaredFields());
		}

		for (Field field : fields) {
			if (Objects.equals(field.getName(), fieldName) ||
				Objects.equals(field.getName(), "_" + fieldName)) {

				return field;
			}
		}

		return null;
	}

	private List<Object> _getItems(Object entity) {
		List<Object> items = new ArrayList<>();

		if (entity instanceof Collection) {
			items.addAll((Collection)entity);
		}
		else if (entity instanceof Page) {
			Page<?> page = (Page)entity;

			items.addAll(page.getItems());
		}
		else if (_isArray(entity)) {
			Collections.addAll(items, (Object[])entity);
		}
		else {
			items.add(entity);
		}

		return items;
	}

	private boolean _isArray(Object object) {
		Class<?> objectClass = object.getClass();

		return objectClass.isArray();
	}

	private void _setFieldValues(Object entity, List<String> fieldNames)
		throws Exception {

		List<Object> items = _getItems(entity);

		Map<String, String> nestedFields = new HashMap<>();

		for (String fieldName : fieldNames) {
			String nestedField = null;

			int index = fieldName.indexOf(".");

			if (index != -1) {
				nestedField = fieldName.substring(index + 1);

				fieldName = fieldName.substring(0, index);
			}

			nestedFields.put(fieldName, nestedField);
		}

		for (Object item : items) {
			Class<?> itemClass = _getClass(item);

			Map<String, Serializable> nestedProperties =
				_nestedFieldsExtensionProvider.getExtendedProperties(
					CompanyThreadLocal.getCompanyId(), 0, itemClass.getName(),
					item);

			if (MapUtil.isEmpty(nestedProperties)) {
				continue;
			}

			for (Map.Entry<String, String> entry : nestedFields.entrySet()) {
				String fieldName = entry.getKey();

				Field field = _getField(itemClass, fieldName);

				if (field == null) {
					continue;
				}

				field.setAccessible(true);

				Object value = nestedProperties.get(fieldName);

				field.set(item, value);

				if (entry.getValue() != null) {
					_setFieldValues(
						value, Collections.singletonList(entry.getValue()));
				}
			}
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		NestedFieldsWriterInterceptor.class);

	private final NestedFieldsExtensionProvider _nestedFieldsExtensionProvider;

}