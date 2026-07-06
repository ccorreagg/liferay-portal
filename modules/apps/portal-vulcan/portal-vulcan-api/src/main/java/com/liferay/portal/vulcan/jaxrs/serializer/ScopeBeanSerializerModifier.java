/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.jaxrs.serializer;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;

import com.liferay.portal.vulcan.scope.Scope;

/**
 * @author Carlos Correa
 */
public class ScopeBeanSerializerModifier extends BeanSerializerModifier {

	@Override
	public JsonSerializer<?> modifySerializer(
		SerializationConfig serializationConfig,
		BeanDescription beanDescription, JsonSerializer<?> jsonSerializer) {

		if (Scope.class.isAssignableFrom(beanDescription.getBeanClass())) {
			return new ScopeStdSerializer(
				(JsonSerializer<Object>)jsonSerializer);
		}

		return jsonSerializer;
	}

}