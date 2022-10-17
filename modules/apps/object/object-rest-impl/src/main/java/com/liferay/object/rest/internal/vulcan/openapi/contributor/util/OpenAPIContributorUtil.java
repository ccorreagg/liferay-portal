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

package com.liferay.object.rest.internal.vulcan.openapi.contributor.util;

import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.rest.openapi.v1_0.ObjectEntryOpenAPIResource;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.dto.converter.DTOMapper;
import com.liferay.portal.vulcan.resource.OpenAPIResource;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.media.Schema;

import java.util.Map;

import javax.ws.rs.core.Response;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * @author Carlos Correa
 */
public class OpenAPIContributorUtil {

	public static void copySchemas(
		DTOMapper dtoMapper, ObjectDefinition objectDefinition,
		OpenAPI sourceOpenAPI, OpenAPI targetOpenAPI) {

		if (objectDefinition.isSystem()) {
			Components components = sourceOpenAPI.getComponents();

			Map<String, Schema> schemas = components.getSchemas();

			for (String schemaName : schemas.keySet()) {
				_copySchema(schemaName, sourceOpenAPI, targetOpenAPI);
			}
		}
		else {
			_copySchema(
				getPageSchemaName(dtoMapper, objectDefinition), sourceOpenAPI,
				targetOpenAPI);
			_copySchema(
				getSchemaName(dtoMapper, objectDefinition), sourceOpenAPI,
				targetOpenAPI);
		}
	}

	public static OpenAPI getObjectEntryOpenAPI(
			ObjectDefinition objectDefinition,
			ObjectEntryOpenAPIResource objectEntryOpenAPIResource)
		throws Exception {

		Response response = objectEntryOpenAPIResource.getOpenAPI(
			objectDefinition, "json", null);

		return (OpenAPI)response.getEntity();
	}

	public static String getObjectEntrySchemaName(
		ObjectDefinition objectDefinition) {

		return objectDefinition.getShortName();
	}

	public static String getPageSchemaName(
		DTOMapper dtoMapper, ObjectDefinition objectDefinition) {

		return "Page" + getSchemaName(dtoMapper, objectDefinition);
	}

	public static String getSchemaName(
		DTOMapper dtoMapper, ObjectDefinition objectDefinition) {

		if (objectDefinition.isSystem()) {
			String className = dtoMapper.toExternalDTOClassName(
				objectDefinition.getClassName());

			return StringUtil.extractLast(className, StringPool.PERIOD);
		}

		return getObjectEntrySchemaName(objectDefinition);
	}

	public static OpenAPI getSystemObjectOpenAPI(
			BundleContext bundleContext, DTOMapper dtoMapper,
			ObjectDefinition objectDefinition, OpenAPIResource openAPIResource)
		throws Exception {

		String className = dtoMapper.toExternalDTOClassName(
			objectDefinition.getClassName());

		ServiceReference[] serviceReferences =
			bundleContext.getServiceReferences(
				(String)null,
				"(&(entity.class.name=" + className +
					")(osgi.jaxrs.resource=true))");

		if (ArrayUtil.isEmpty(serviceReferences)) {
			throw new IllegalStateException();
		}

		Object resource = bundleContext.getService(serviceReferences[0]);

		Response response = openAPIResource.getOpenAPI(
			null, SetUtil.fromArray(resource.getClass()), "json", null);

		return (OpenAPI)response.getEntity();
	}

	private static void _copySchema(
		String schemaName, OpenAPI sourceOpenAPI, OpenAPI targetOpenAPI) {

		Components targetComponents = targetOpenAPI.getComponents();

		Map<String, Schema> targetSchemas = targetComponents.getSchemas();

		if (!targetSchemas.containsKey(schemaName)) {
			Components components = sourceOpenAPI.getComponents();

			Map<String, Schema> schemas = components.getSchemas();

			targetSchemas.put(schemaName, schemas.get(schemaName));
		}
	}

}