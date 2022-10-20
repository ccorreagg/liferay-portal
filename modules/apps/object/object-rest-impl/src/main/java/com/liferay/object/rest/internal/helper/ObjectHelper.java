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

package com.liferay.object.rest.internal.helper;

import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.system.SystemObjectDefinitionMetadata;
import com.liferay.object.system.SystemObjectDefinitionMetadataTracker;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.ClassUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterRegistry;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(service = ObjectHelper.class)
public class ObjectHelper {

	public DTOConverter<?, ?> getDTOConverter(
		SystemObjectDefinitionMetadata systemObjectDefinitionMetadata) {

		List<DTOConverter<?, ?>> dtoConverters =
			_dtoConverterRegistry.getDTOConverters(
				systemObjectDefinitionMetadata.getModelClassName());

		if (ListUtil.isEmpty(dtoConverters)) {
			return null;
		}
		else if (dtoConverters.size() == 1) {
			return dtoConverters.get(0);
		}

		String[] restContextPaths = StringUtil.split(
			systemObjectDefinitionMetadata.getRESTContextPath(),
			StringPool.SLASH);

		String restPackage = restContextPaths[0].replaceAll(
			StringPool.DASH, StringPool.PERIOD);
		String version = restContextPaths[1].replaceAll(
			StringPool.PERIOD, StringPool.UNDERLINE);

		for (DTOConverter<?, ?> dtoConverter : dtoConverters) {
			String className = ClassUtil.getClassName(dtoConverter);

			if (className.contains(restPackage) &&
				className.contains(version)) {

				return dtoConverter;
			}
		}

		return dtoConverters.get(0);
	}

	public String getExternalDTOClassName(ObjectDefinition objectDefinition) {
		DTOConverter<?, ?> dtoConverter = getDTOConverter(
			_systemObjectDefinitionMetadataTracker.
				getSystemObjectDefinitionMetadata(objectDefinition.getName()));

		return dtoConverter.getExternalDTOClassName();
	}

	public String getSchemaName(ObjectDefinition objectDefinition) {
		if (objectDefinition.isSystem()) {
			return StringUtil.extractLast(
				getExternalDTOClassName(objectDefinition), StringPool.PERIOD);
		}

		return objectDefinition.getShortName();
	}

	@Reference
	private DTOConverterRegistry _dtoConverterRegistry;

	@Reference
	private SystemObjectDefinitionMetadataTracker
		_systemObjectDefinitionMetadataTracker;

}