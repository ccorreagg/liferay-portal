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

package com.liferay.headless.builder.internal.openapi;

import com.liferay.headless.builder.internal.generator.application.ApiApplication;
import com.liferay.headless.builder.internal.generator.application.Operation;
import com.liferay.headless.builder.internal.generator.application.Property;
import com.liferay.headless.builder.internal.generator.application.Schema;
import com.liferay.headless.builder.internal.generator.consumer.Consumer;
import com.liferay.petra.string.CharPool;
import com.liferay.portal.kernel.exception.NoSuchModelException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.util.CamelCaseUtil;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.openapi.OpenAPIContext;
import com.liferay.portal.vulcan.openapi.contributor.OpenAPIContributor;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.media.MediaType;
import io.swagger.v3.oas.models.media.ObjectSchema;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;

import java.util.Map;
import java.util.TreeMap;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(service = OpenAPIContributor.class)
public class HeadlessBuilderApplicationOpenApiContributor
	implements OpenAPIContributor {

	@Override
	public void contribute(OpenAPI openAPI, OpenAPIContext openAPIContext) {
		if (openAPIContext == null) {
			return;
		}

		ApiApplication apiApplication = _fetchApiApplication(openAPIContext);

		if (apiApplication == null) {
			return;
		}

		Components components = openAPI.getComponents();

		if (components == null) {
			components = new Components();

			openAPI.setComponents(components);
		}

		openAPI.setInfo(
			new Info() {
				{
					setDescription(
						"OpenAPI Specification of the " +
							apiApplication.getTitle() + " REST API");
					setLicense(
						new License() {
							{
								setName("Apache 2.0");
								setUrl(
									"http://www.apache.org/licenses" +
										"/LICENSE-2.0.html");
							}
						});
					setTitle(apiApplication.getTitle());
					setVersion(apiApplication.getVersion());
				}
			});

		Map<String, io.swagger.v3.oas.models.media.Schema> schemas =
			components.getSchemas();

		if (schemas == null) {
			schemas = new TreeMap<>();

			components.setSchemas(schemas);
		}

		for (Schema schema : apiApplication.getSchemas()) {
			schemas.put(schema.getName(), _toOpenAPISchema(schema));
		}

		Paths oldPaths = openAPI.getPaths();

		Paths paths = new Paths() {
			{
				put("/openapi.{type}", oldPaths.get("/openapi.{type}"));
			}
		};

		for (Operation operation : apiApplication.getOperations()) {
			paths.put(operation.getPath(), _toOpenAPIPathItem(operation));
		}

		openAPI.setPaths(paths);
	}

	private ApiApplication _fetchApiApplication(OpenAPIContext openAPIContext) {
		String path = openAPIContext.getPath();

		if (path.startsWith("/o")) {
			path = path.substring(2);
		}

		if (path.startsWith("/")) {
			path = path.substring(1);
		}

		if (path.endsWith("/")) {
			path = path.substring(0, path.length() - 1);
		}

		try {
			return _consumer.getApiApplication(
				path + "#" + CompanyThreadLocal.getCompanyId());
		}
		catch (Exception exception) {
			if (!(exception instanceof NoSuchModelException)) {
				_log.error(exception);
			}

			return null;
		}
	}

	private String _getOperationId(Operation operation) {
		Http.Method method = operation.getMethod();

		String path = StringUtil.removeChar(
			operation.getPath(), CharPool.SLASH);

		path = StringUtil.upperCaseFirstLetter(CamelCaseUtil.toCamelCase(path));

		return StringUtil.toLowerCase(method.name()) + path;
	}

	private PathItem _toOpenAPIPathItem(Operation operation) {
		io.swagger.v3.oas.models.Operation openAPIOperation =
			new io.swagger.v3.oas.models.Operation() {
				{
					setOperationId(_getOperationId(operation));
				}
			};

		Schema responseSchema = operation.getResponseSchema();

		if (responseSchema != null) {
			MediaType mediaType = new MediaType() {
				{
					setSchema(
						new io.swagger.v3.oas.models.media.Schema() {
							{
								set$ref(responseSchema.getName());
							}
						});
				}
			};

			Content content = new Content() {
				{
					put("application/json", mediaType);
					put("application/xml", mediaType);
				}
			};

			ApiResponse apiResponse = new ApiResponse() {
				{
					setContent(content);
					setDescription("default response");
				}
			};

			openAPIOperation.setResponses(
				new ApiResponses() {
					{
						setDefault(apiResponse);
					}
				});
		}

		return new PathItem() {
			{
				operation(
					PathItem.HttpMethod.valueOf(
						operation.getMethod(
						).name()),
					openAPIOperation);
			}
		};
	}

	private io.swagger.v3.oas.models.media.Schema _toOpenAPISchema(
		Schema schema) {

		Map<String, io.swagger.v3.oas.models.media.Schema> properties =
			new TreeMap<>();

		for (Property property : schema.getProperties()) {
			if (StringUtil.equals(property.getType(), "Text")) {
				properties.put(
					property.getName(),
					new StringSchema() {
						{
							setDescription(property.getDescription());
							setName(property.getName());
						}
					});
			}
			else {
				throw new IllegalStateException(
					"The OpenAPI property type " + property.getType() +
						" is not implemented");
			}
		}

		return new ObjectSchema() {
			{
				setDescription(schema.getDescription());
				setName(schema.getName());
				setProperties(properties);
			}
		};
	}

	private static final Log _log = LogFactoryUtil.getLog(
		HeadlessBuilderApplicationOpenApiContributor.class);

	@Reference
	private Consumer<String> _consumer;

}