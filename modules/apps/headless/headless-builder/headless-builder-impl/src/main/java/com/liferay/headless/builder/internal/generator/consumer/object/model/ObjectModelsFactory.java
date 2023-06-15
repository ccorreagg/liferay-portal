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

package com.liferay.headless.builder.internal.generator.consumer.object.model;

import com.liferay.asset.kernel.NoSuchClassTypeException;
import com.liferay.headless.builder.internal.generator.consumer.object.model.transformer.ApiApplicationModelTransformer;
import com.liferay.headless.builder.internal.generator.consumer.object.model.transformer.ApiEndpointModelTransformer;
import com.liferay.headless.builder.internal.generator.consumer.object.model.transformer.ApiSchemaModelTransformer;
import com.liferay.headless.builder.internal.generator.consumer.object.model.transformer.ObjectModelTransformer;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.rest.dto.v1_0.ObjectEntry;
import com.liferay.object.rest.manager.v1_0.ObjectEntryManager;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.service.ObjectEntryLocalService;
import com.liferay.object.service.ObjectFieldLocalService;
import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.security.permission.PermissionCheckerFactory;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.GroupThreadLocal;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.vulcan.dto.converter.DefaultDTOConverterContext;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;

import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Luis Miguel Barcos
 */
@Component(service = ObjectModelsFactory.class)
public class ObjectModelsFactory {

	@SuppressWarnings("unchecked")
	public <T extends ObjectModel> T getObjectModel(
			String apiApplicationERC, Class<T> clazz)
		throws Exception {

		if (clazz.isAssignableFrom(ApiApplicationModel.class)) {
			return (T)_apiApplicationModelTransformer.toModel(
				CompanyThreadLocal.getCompanyId(),
				_getObjectEntry(
					apiApplicationERC,
					"externalReferenceCode eq '" + apiApplicationERC + "'",
					"MSOD_API_APPLICATION"));
		}

		throw new NoSuchClassTypeException();
	}

	@SuppressWarnings("unchecked")
	public <T extends ObjectModel> List<T> getObjectModels(
			String apiApplicationERC, Class<T> clazz)
		throws Exception {

		long companyId = CompanyThreadLocal.getCompanyId();

		if (clazz.isAssignableFrom(ApiEndpointModel.class)) {
			Page<ObjectEntry> objectEntriesPage = _getObjectEntries(
				apiApplicationERC,
				String.format(
					"%s/externalReferenceCode eq '%s'",
					_APPLICATION_ENDPOINT_OBJECT_RELATIONSHIP_NAME,
					apiApplicationERC),
				"MSOD_API_ENDPOINT");

			return (List<T>)TransformUtil.transform(
				objectEntriesPage.getItems(),
				objectEntry -> _apiEndpointModelTransformer.toModel(
					companyId, objectEntry));
		}
		else if (clazz.isAssignableFrom(ApiSchemaModel.class)) {
			Page<ObjectEntry> objectEntriesPage = _getObjectEntries(
				apiApplicationERC,
				String.format(
					"%s/externalReferenceCode eq '%s'",
					_API_SCHEMAS_OBJECT_RELATIONSHIP_NAME, apiApplicationERC),
				"MSOD_API_SCHEMA");

			return (List<T>)TransformUtil.transform(
				objectEntriesPage.getItems(),
				objectEntry -> {
					Page<ObjectEntry> apiPropertiesPage = _getObjectEntries(
						apiApplicationERC,
						String.format(
							"%s/externalReferenceCode eq '%s'",
							_SCHEMAS_PROPERTIES_OBJECT_RELATIONSHIP_NAME,
							objectEntry.getExternalReferenceCode()),
						"MSOD_API_PROPERTY");

					Map<String, Object> properties =
						objectEntry.getProperties();

					properties.put(
						_SCHEMAS_PROPERTIES_OBJECT_RELATIONSHIP_NAME,
						apiPropertiesPage.getItems());

					return _apiSchemaModelTransformer.toModel(
						companyId, objectEntry);
				});
		}

		throw new NoSuchClassTypeException();
	}

	private DefaultDTOConverterContext _getDefaultDTOConverterContext(
		User user) {

		return new DefaultDTOConverterContext(
			false, null, null, null, null, LocaleUtil.getSiteDefault(), null,
			user);
	}

	private ObjectDefinition _getObjectDefinition(String externalReferenceCode)
		throws Exception {

		return _objectDefinitionLocalService.
			getObjectDefinitionByExternalReferenceCode(
				externalReferenceCode, CompanyThreadLocal.getCompanyId());
	}

	private Page<ObjectEntry> _getObjectEntries(
			String apiApplicationERC, String filter, String objectDefinitionERC)
		throws Exception {

		User user = _getUser(apiApplicationERC);

		PermissionThreadLocal.setPermissionChecker(
			_permissionCheckerFactory.create(user));

		return _objectEntryManager.getObjectEntries(
			CompanyThreadLocal.getCompanyId(),
			_getObjectDefinition(objectDefinitionERC), null, null,
			_getDefaultDTOConverterContext(user), filter,
			Pagination.of(QueryUtil.ALL_POS, QueryUtil.ALL_POS), null, null);
	}

	private ObjectEntry _getObjectEntry(
			String apiApplicationERC, String filter, String objectDefinitionERC)
		throws Exception {

		Page<ObjectEntry> objectEntriesPage = _getObjectEntries(
			apiApplicationERC, filter, objectDefinitionERC);

		return objectEntriesPage.fetchFirstItem();
	}

	private User _getUser(String externalReferenceCode) throws Exception {
		com.liferay.object.model.ObjectEntry objectEntry =
			_objectEntryLocalService.getObjectEntry(
				externalReferenceCode, CompanyThreadLocal.getCompanyId(),
				GroupThreadLocal.getGroupId());

		return _userLocalService.getUser(objectEntry.getUserId());
	}

	private static final String _API_SCHEMAS_OBJECT_RELATIONSHIP_NAME =
		"apiApplicationToAPISchemas";

	private static final String _APPLICATION_ENDPOINT_OBJECT_RELATIONSHIP_NAME =
		"apiApplicationToAPIEndpoints";

	private static final String _SCHEMAS_PROPERTIES_OBJECT_RELATIONSHIP_NAME =
		"apiSchemaToAPIProperties";

	private final ObjectModelTransformer _apiApplicationModelTransformer =
		new ApiApplicationModelTransformer();
	private final ObjectModelTransformer _apiEndpointModelTransformer =
		new ApiEndpointModelTransformer();
	private final ObjectModelTransformer _apiSchemaModelTransformer =
		new ApiSchemaModelTransformer();

	@Reference
	private ObjectDefinitionLocalService _objectDefinitionLocalService;

	@Reference
	private ObjectEntryLocalService _objectEntryLocalService;

	@Reference(target = "(object.entry.manager.storage.type=default)")
	private ObjectEntryManager _objectEntryManager;

	@Reference
	private ObjectFieldLocalService _objectFieldLocalService;

	@Reference
	private PermissionCheckerFactory _permissionCheckerFactory;

	@Reference
	private UserLocalService _userLocalService;

}