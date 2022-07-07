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

package com.liferay.object.rest.internal.resource.v1_0;

import com.liferay.object.constants.ObjectFieldConstants;
import com.liferay.object.constants.ObjectRelationshipConstants;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectField;
import com.liferay.object.model.ObjectRelationship;
import com.liferay.object.rest.dto.v1_0.ObjectEntry;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.service.ObjectEntryLocalService;
import com.liferay.object.service.ObjectFieldLocalService;
import com.liferay.object.service.ObjectRelationshipLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterRegistry;
import com.liferay.portal.vulcan.extension.ExtensionProvider;
import com.liferay.portal.vulcan.extension.PropertyDefinition;

import java.io.Serializable;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(immediate = true, service = ExtensionProvider.class)
public class ObjectEntryExtensionProvider implements ExtensionProvider {

	@Override
	public Map<String, Serializable> getExtendedProperties(
			long companyId, Object entity)
		throws Exception {

		return HashMapBuilder.<String, Serializable>put(
			"field", "value"
		).build();
	}

	@Override
	public Map<String, PropertyDefinition> getExtendedPropertyDefinitions(
		long companyId, String className) {

		ObjectDefinition objectDefinition = _getObjectDefinition(
			companyId, className);

		Map<String, PropertyDefinition> extendedPropertyMap = new HashMap<>();

		for (ObjectField objectField :
				_objectFieldLocalService.getObjectFields(
					objectDefinition.getObjectDefinitionId())) {

			if (objectField.isSystem()) {
				continue;
			}

			PropertyDefinition.PropertyType propertyType = _getType(
				objectField);

			if (propertyType == null) {
				continue;
			}

			extendedPropertyMap.put(
				objectField.getName(),
				new PropertyDefinition(
					objectField.getName(), propertyType,
					objectField.isRequired()));
		}

		for (ObjectRelationship objectRelationship :
				_getObjectRelationships(objectDefinition)) {

			ObjectDefinition relatedObjectDefinition;

			if (objectRelationship.getObjectDefinitionId1() ==
					objectDefinition.getObjectDefinitionId()) {

				relatedObjectDefinition =
					_objectDefinitionLocalService.fetchObjectDefinition(
						objectRelationship.getObjectDefinitionId2());
			}
			else {
				relatedObjectDefinition =
					_objectDefinitionLocalService.fetchObjectDefinition(
						objectRelationship.getObjectDefinitionId1());
			}

			PropertyDefinition.PropertyType propertyType = _getType(
				relatedObjectDefinition, objectRelationship);

			if (propertyType == null) {
				continue;
			}

			extendedPropertyMap.put(
				objectRelationship.getName(),
				new PropertyDefinition(
					ObjectEntry.class, objectRelationship.getName(),
					propertyType,
					new ObjectEntryPropertyValidator(relatedObjectDefinition),
					false));
		}

		return extendedPropertyMap;
	}

	@Override
	public Collection<String> getFilteredPropertyNames(
		long companyId, Object entity) {

		return Collections.emptyList();
	}

	@Override
	public boolean isApplicableExtension(long companyId, String className) {
		if (_getObjectDefinition(companyId, className) != null) {
			return true;
		}

		return false;
	}

	@Override
	public void setExtendedProperties(
			long companyId, Object entity,
			Map<String, Serializable> extensionProviderExtendedProperties)
		throws Exception {

		// Set properties

	}

	private static PropertyDefinition.PropertyType _getType(
		ObjectDefinition objectDefinition,
		ObjectRelationship objectRelationship) {

		PropertyDefinition.PropertyType propertyType = null;

		if (StringUtil.equals(
				objectRelationship.getType(),
				ObjectRelationshipConstants.TYPE_ONE_TO_MANY)) {

			if (objectDefinition.getObjectDefinitionId() ==
					objectRelationship.getObjectDefinitionId1()) {

				propertyType = PropertyDefinition.PropertyType.SINGLE_ELEMENT;
			}
			else {
				propertyType = PropertyDefinition.PropertyType.MULTIPLE_ELEMENT;
			}
		}
		else if (StringUtil.equals(
					objectRelationship.getType(),
					ObjectRelationshipConstants.TYPE_MANY_TO_MANY)) {

			propertyType = PropertyDefinition.PropertyType.MULTIPLE_ELEMENT;
		}

		return propertyType;
	}

	private static PropertyDefinition.PropertyType _getType(
		ObjectField objectField) {

		PropertyDefinition.PropertyType propertyType = null;

		if (StringUtil.equals(
				objectField.getBusinessType(),
				ObjectFieldConstants.BUSINESS_TYPE_BOOLEAN)) {

			propertyType = PropertyDefinition.PropertyType.BOOLEAN;
		}
		else if (StringUtil.equals(
					objectField.getBusinessType(),
					ObjectFieldConstants.BUSINESS_TYPE_DECIMAL)) {

			propertyType = PropertyDefinition.PropertyType.DOUBLE;
		}
		else if (StringUtil.equals(
					objectField.getBusinessType(),
					ObjectFieldConstants.BUSINESS_TYPE_INTEGER)) {

			propertyType = PropertyDefinition.PropertyType.INTEGER;
		}
		else if (StringUtil.equals(
					objectField.getBusinessType(),
					ObjectFieldConstants.BUSINESS_TYPE_LONG_INTEGER)) {

			propertyType = PropertyDefinition.PropertyType.LONG;
		}
		else if (StringUtil.equals(
					objectField.getBusinessType(),
					ObjectFieldConstants.BUSINESS_TYPE_LONG_TEXT)) {

			propertyType = PropertyDefinition.PropertyType.TEXT;
		}
		else if (StringUtil.equals(
					objectField.getBusinessType(),
					ObjectFieldConstants.BUSINESS_TYPE_PRECISION_DECIMAL)) {

			propertyType = PropertyDefinition.PropertyType.BIG_DECIMAL;
		}
		else if (StringUtil.equals(
					objectField.getBusinessType(),
					ObjectFieldConstants.BUSINESS_TYPE_RICH_TEXT)) {

			propertyType = PropertyDefinition.PropertyType.TEXT;
		}
		else if (StringUtil.equals(
					objectField.getBusinessType(),
					ObjectFieldConstants.BUSINESS_TYPE_TEXT)) {

			propertyType = PropertyDefinition.PropertyType.TEXT;
		}

		// Complete the rest of the missing types, relationships, etc

		return propertyType;
	}

	private String _getExternalClassName(DTOConverter<?, ?> dtoConverter) {
		Class<?> clazz = dtoConverter.getClass();

		Type[] types = clazz.getGenericInterfaces();

		for (Type type : types) {
			String typeName = type.getTypeName();

			if (!typeName.contains(DTOConverter.class.getSimpleName()) ||
				!(type instanceof ParameterizedType)) {

				continue;
			}

			ParameterizedType parameterizedType = (ParameterizedType)type;

			Type[] argumentTypes = parameterizedType.getActualTypeArguments();

			return argumentTypes[1].getTypeName();
		}

		return null;
	}

	private ObjectDefinition _getObjectDefinition(
		long companyId, String className) {

		String internalDTOClassName = null;

		for (String dtoClassName : _dtoConverterRegistry.getDTOClassNames()) {
			if (StringUtil.equals(
					_getExternalClassName(
						_dtoConverterRegistry.getDTOConverter(dtoClassName)),
					className)) {

				internalDTOClassName = dtoClassName;

				break;
			}
		}

		if (internalDTOClassName == null) {
			return null;
		}

		for (ObjectDefinition objectDefinition :
				_objectDefinitionLocalService.getObjectDefinitions(
					QueryUtil.ALL_POS, QueryUtil.ALL_POS)) {

			if ((objectDefinition.getCompanyId() == companyId) &&
				internalDTOClassName.equals(objectDefinition.getClassName())) {

				return objectDefinition;
			}
		}

		return null;
	}

	private List<ObjectRelationship> _getObjectRelationships(
		ObjectDefinition objectDefinition) {

		List<ObjectRelationship> objectRelationships = new ArrayList<>();

		for (ObjectRelationship objectRelationship :
				_objectRelationshipLocalService.getObjectRelationships(
					QueryUtil.ALL_POS, QueryUtil.ALL_POS)) {

			if ((objectRelationship.getObjectDefinitionId1() ==
					objectDefinition.getObjectDefinitionId()) ||
				(objectRelationship.getObjectDefinitionId2() ==
					objectDefinition.getObjectDefinitionId())) {

				objectRelationships.add(objectRelationship);
			}
		}

		return objectRelationships;
	}

	@Reference
	private DTOConverterRegistry _dtoConverterRegistry;

	@Reference
	private ObjectDefinitionLocalService _objectDefinitionLocalService;

	@Reference
	private ObjectEntryLocalService _objectEntryLocalService;

	@Reference
	private ObjectFieldLocalService _objectFieldLocalService;

	@Reference
	private ObjectRelationshipLocalService _objectRelationshipLocalService;

}