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

package com.liferay.headless.builder.application.openapi.contributor.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.batch.engine.unit.BatchEngineUnitProcessor;
import com.liferay.batch.engine.unit.BatchEngineUnitReader;
import com.liferay.object.constants.ObjectDefinitionConstants;
import com.liferay.object.constants.ObjectFieldConstants;
import com.liferay.object.field.util.ObjectFieldUtil;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectField;
import com.liferay.object.service.ObjectDefinitionLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.HTTPTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.test.rule.FeatureFlags;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.openapi.OpenAPIContext;
import com.liferay.portal.vulcan.openapi.contributor.OpenAPIContributor;

import com.liferay.portal.vulcan.util.LocalizedMapUtil;
import io.swagger.v3.oas.models.OpenAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

import org.junit.After;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

/**
 * @author Carlos Correa
 */
@FeatureFlags({"LPS-184413", "LPS-167253", "LPS-153117"})
@RunWith(Arquillian.class)
public class APIApplicationOpenAPIContributorTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@Before
	public void setUp() throws Exception {
		Bundle testBundle = FrameworkUtil.getBundle(
			APIApplicationOpenAPIContributorTest.class);

		BundleContext bundleContext = testBundle.getBundleContext();

		for (Bundle bundle : bundleContext.getBundles()) {
			if (Objects.equals(
					bundle.getSymbolicName(),
					"com.liferay.headless.builder.impl")) {

				CompletableFuture<Void> completableFuture =
					_batchEngineUnitProcessor.processBatchEngineUnits(
						_batchEngineUnitReader.getBatchEngineUnits(bundle));

				completableFuture.join();
			}
		}

		_objectDefinition = _publishObjectDefinition(
			Arrays.asList(
				ObjectFieldUtil.createObjectField(
					ObjectFieldConstants.BUSINESS_TYPE_DECIMAL, ObjectFieldConstants.DB_TYPE_DOUBLE, RandomTestUtil.randomString(), "decimalField", false),
				ObjectFieldUtil.createObjectField(
					ObjectFieldConstants.BUSINESS_TYPE_INTEGER, ObjectFieldConstants.DB_TYPE_INTEGER, RandomTestUtil.randomString(), "integerField", false),
				ObjectFieldUtil.createObjectField(
					ObjectFieldConstants.BUSINESS_TYPE_LONG_INTEGER, ObjectFieldConstants.DB_TYPE_LONG, RandomTestUtil.randomString(), "longIntegerField", false),
				ObjectFieldUtil.createObjectField(
					ObjectFieldConstants.BUSINESS_TYPE_PRECISION_DECIMAL, ObjectFieldConstants.DB_TYPE_BIG_DECIMAL, RandomTestUtil.randomString(), "precisionDecimal", false),
				ObjectFieldUtil.createObjectField(
					ObjectFieldConstants.BUSINESS_TYPE_TEXT, ObjectFieldConstants.DB_TYPE_STRING, RandomTestUtil.randomString(), "textField", false)));
	}


	private ObjectDefinition _publishObjectDefinition(
		List<ObjectField> objectFields)
		throws Exception {

		long userId = TestPropsValues.getUserId();

		ObjectDefinition objectDefinition =
			_objectDefinitionLocalServiceUtil.addCustomObjectDefinition(
				userId, false, false,
				LocalizedMapUtil.getLocalizedMap(RandomTestUtil.randomString()),
				"A" + RandomTestUtil.randomString(), null, null,
				LocalizedMapUtil.getLocalizedMap(RandomTestUtil.randomString()),
				ObjectDefinitionConstants.SCOPE_COMPANY,
				ObjectDefinitionConstants.STORAGE_TYPE_DEFAULT,
				objectFields);

		return _objectDefinitionLocalServiceUtil.publishCustomObjectDefinition(
			userId, objectDefinition.getObjectDefinitionId());
	}

	@After
	public void tearDown() throws Exception {
		HTTPTestUtil.invoke(
			null,
			"headless-builder/applications/by-external-reference-code" +
				"/APPLICATION",
			Http.Method.DELETE);
	}

	@Test
	public void test() throws Exception {
		HTTPTestUtil.invoke(
			JSONUtil.put(
				"apiApplicationToAPIEndpoints",
				JSONUtil.put(
					JSONUtil.put(
						"description", "description"
					).put(
						"externalReferenceCode", "ENDPOINT"
					).put(
						"httpMethod", "get"
					).put(
						"name", "name"
					).put(
						"path", "path"
					).put(
						"scope", "company"
					))
			).put(
				"apiApplicationToAPISchemas",
				JSONUtil.put(
					JSONUtil.put(
						"apiSchemaToAPIProperties",
						JSONUtil.putAll(
							JSONUtil.put(
								"description", "decimalFieldDescription"
							).put(
								"name", "decimalFieldName"
							).put(
								"objectFieldERC", "decimalField"
							),
							JSONUtil.put(
								"description", "textFieldDescription"
							).put(
								"name", "textFieldName"
							).put(
								"objectFieldERC", "textField"
							),
							JSONUtil.put(
								"description", "textFieldDescription"
							).put(
								"name", "textFieldName"
							).put(
								"objectFieldERC", "textField"
							),
							JSONUtil.put(
								"description", "textFieldDescription"
							).put(
								"name", "textFieldName"
							).put(
								"objectFieldERC", "textField"
							),
							JSONUtil.put(
								"description", "textFieldDescription"
							).put(
								"name", "textFieldName"
							).put(
								"objectFieldERC", "textField"
							))
					).put(
						"description", "description"
					).put(
						"externalReferenceCode", "SCHEMA"
					).put(
						"mainObjectDefinitionERC", _objectDefinition.getExternalReferenceCode()
					).put(
						"name", "name"
					))
			).put(
				"applicationStatus", "published"
			).put(
				"baseURL", "test"
			).put(
				"externalReferenceCode", "APPLICATION"
			).put(
				"title", "title"
			).toString(),
			"headless-builder/applications", Http.Method.POST);
		HTTPTestUtil.invoke(
			null,
			"headless-builder/schemas/by-external-reference-code/SCHEMA" +
				"/requestAPISchemaToAPIEndpoints/ENDPOINT",
			Http.Method.PUT);
		HTTPTestUtil.invoke(
			null,
			"headless-builder/schemas/by-external-reference-code/SCHEMA" +
				"/responseAPISchemaToAPIEndpoints/ENDPOINT",
			Http.Method.PUT);

		OpenAPI openAPI = new OpenAPI();

		_apiApplicationOpenAPIContributor.contribute(
			openAPI,
			new OpenAPIContext() {
				{
					setPath("/o/test/");
				}
			});

		System.out.println(openAPI);
	}

	@Inject(
		filter = "component.name=com.liferay.headless.builder.internal.application.openapi.contributor.APIApplicationOpenApiContributor"
	)
	private OpenAPIContributor _apiApplicationOpenAPIContributor;

	@Inject
	private BatchEngineUnitProcessor _batchEngineUnitProcessor;

	@Inject
	private BatchEngineUnitReader _batchEngineUnitReader;

	private ObjectDefinition _objectDefinition;

	@Inject
	private ObjectDefinitionLocalServiceUtil _objectDefinitionLocalServiceUtil;

}