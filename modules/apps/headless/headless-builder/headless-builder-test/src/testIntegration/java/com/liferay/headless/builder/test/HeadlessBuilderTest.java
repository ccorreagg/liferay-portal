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

package com.liferay.headless.builder.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.headless.builder.application.HeadlessBuilderApplication;
import com.liferay.headless.builder.application.HeadlessBuilderApplicationFactory;
import com.liferay.headless.builder.application.HeadlessBuilderApplicationManager;
import com.liferay.headless.builder.test.info.item.provider.TestEntryInfoItemFieldValuesProvider;
import com.liferay.headless.builder.test.info.item.provider.TestEntryInfoItemFormProvider;
import com.liferay.headless.builder.test.info.item.provider.TestEntryInfoItemObjectProvider;
import com.liferay.headless.builder.test.model.TestEntry;
import com.liferay.headless.builder.test.object.util.ObjectDefinitionTestUtil;
import com.liferay.headless.builder.test.object.util.ObjectEntryTestUtil;
import com.liferay.headless.builder.test.object.util.ObjectRelationshipTestUtil;
import com.liferay.info.item.provider.InfoItemFieldValuesProvider;
import com.liferay.info.item.provider.InfoItemFormProvider;
import com.liferay.info.item.provider.InfoItemObjectProvider;
import com.liferay.object.entry.util.ObjectEntryThreadLocal;
import com.liferay.object.field.util.ObjectFieldUtil;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectEntry;
import com.liferay.object.model.ObjectField;
import com.liferay.object.model.ObjectRelationship;
import com.liferay.object.related.models.ObjectRelatedModelsProviderRegistry;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.service.ObjectDefinitionLocalServiceUtil;
import com.liferay.object.service.ObjectEntryLocalServiceUtil;
import com.liferay.object.service.ObjectRelationshipLocalService;
import com.liferay.object.service.ObjectRelationshipLocalServiceUtil;
import com.liferay.petra.function.UnsafeRunnable;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.test.rule.FeatureFlags;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.yaml.YAMLUtil;
import com.liferay.portal.vulcan.yaml.openapi.OpenAPIYAML;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

import java.net.HttpURLConnection;
import java.net.URL;

import java.nio.charset.StandardCharsets;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.core.Application;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;

import org.skyscreamer.jsonassert.JSONAssert;

/**
 * @author Carlos Correa
 */
@RunWith(Arquillian.class)
public class HeadlessBuilderTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@Before
	public void setUp() throws Exception {
		PrincipalThreadLocal.setName(TestPropsValues.getUserId());

		_apiApplicationObjectDefinition =
			ObjectDefinitionLocalServiceUtil.
				getObjectDefinitionByExternalReferenceCode(
					"MSOD_API_APPLICATION", TestPropsValues.getCompanyId());
		//			ObjectDefinitionTestUtil.publishObjectDefinition(
		//				"MSOD_API_APPLICATION",
		//				new ArrayList<ObjectField>() {

		//					{
		//						add(
		//							ObjectFieldUtil.createObjectField(
		//								"Text", "String", true, true, null,
		//								RandomTestUtil.randomString(),
		//								_API_APPLICATION_TITLE, false));
		//						add(
		//							ObjectFieldUtil.createObjectField(
		//								"Text", "String", true, true, null,
		//								RandomTestUtil.randomString(),
		//								_API_APPLICATION_BASE_URL, false));
		//					}
		//				});

		_apiEndpointObjectDefinition =
			ObjectDefinitionLocalServiceUtil.
				getObjectDefinitionByExternalReferenceCode(
					"MSOD_API_ENDPOINT", TestPropsValues.getCompanyId());
		//			ObjectDefinitionTestUtil.publishObjectDefinition(
		//				"MSOD_API_ENDPOINT",
		//				new ArrayList<ObjectField>() {

		//					{
		//						add(
		//							ObjectFieldUtil.createObjectField(
		//								"Text", "String", true, true, null,
		//								RandomTestUtil.randomString(),
		//								_API_ENDPOINT_HTTP_METHOD, false));
		//						add(
		//							ObjectFieldUtil.createObjectField(
		//								"Text", "String", true, true, null,
		//								RandomTestUtil.randomString(),
		//								_API_ENDPOINT_PATH, false));
		//						add(
		//							ObjectFieldUtil.createObjectField(
		//								"Text", "String", true, true, null,
		//								RandomTestUtil.randomString(),
		//								_API_ENDPOINT_SCOPE, false));
		//					}
		//				});

		_apiSchemaObjectDefinition =
			ObjectDefinitionLocalServiceUtil.
				getObjectDefinitionByExternalReferenceCode(
					"MSOD_API_SCHEMA", TestPropsValues.getCompanyId());
		_schemaPropertyObjectDefinition =
			ObjectDefinitionLocalServiceUtil.
				getObjectDefinitionByExternalReferenceCode(
					"MSOD_API_PROPERTY", TestPropsValues.getCompanyId());
		_applicationEndpointsObjectRelationship =
			ObjectRelationshipLocalServiceUtil.getObjectRelationship(
				_apiApplicationObjectDefinition.getObjectDefinitionId(),
				"apiApplicationToAPIEndpoints");
		//			ObjectRelationshipTestUtil.addObjectRelationship(
		//				_apiApplicationObjectDefinition, "applicationEndpoints",
		//				_apiEndpointObjectDefinition, TestPropsValues.getUserId(),
		//				ObjectRelationshipConstants.TYPE_ONE_TO_MANY);

		_applicationSchemasObjectRelationship =
			ObjectRelationshipLocalServiceUtil.getObjectRelationship(
				_apiApplicationObjectDefinition.getObjectDefinitionId(),
				"apiApplicationToAPISchemas");
		_schemasPropertiesObjectRelationship =
			ObjectRelationshipLocalServiceUtil.getObjectRelationship(
				_apiSchemaObjectDefinition.getObjectDefinitionId(),
				"apiSchemaToAPIProperties");
		_responseSchemaEndpointsObjectRelationship =
			ObjectRelationshipLocalServiceUtil.getObjectRelationship(
				_apiSchemaObjectDefinition.getObjectDefinitionId(),
				"responseAPISchemaToAPIEndpoints");
		Bundle bundle = FrameworkUtil.getBundle(HeadlessBuilderTest.class);
		BundleContext bundleContext = bundle.getBundleContext();
		_infoItemFieldValuesProviderServiceRegistration =
			bundleContext.registerService(
				InfoItemFieldValuesProvider.class,
				new TestEntryInfoItemFieldValuesProvider(), null);
		_infoItemFormProviderServiceRegistration =
			bundleContext.registerService(
				InfoItemFormProvider.class, new TestEntryInfoItemFormProvider(),
				null);
		_infoItemObjectProviderServiceRegistration =
			bundleContext.registerService(
				InfoItemObjectProvider.class,
				new TestEntryInfoItemObjectProvider(), null);

	}

	@After
	public void tearDown() throws Exception {
		_infoItemFieldValuesProviderServiceRegistration.unregister();
		_infoItemFormProviderServiceRegistration.unregister();
		_infoItemObjectProviderServiceRegistration.unregister();

		//		_objectRelationshipLocalService.deleteObjectRelationship(
		//			_applicationEndpointsObjectRelationship);
		//		_objectDefinitionLocalService.deleteObjectDefinition(
		//			_apiApplicationObjectDefinition);
		//		_objectDefinitionLocalService.deleteObjectDefinition(
		//			_apiEndpointObjectDefinition);
	}

	// TODO Missing tests:
	//  Create multiple api applications with multiple endpoints
	//  that should be accessible but not others
	//  Create same endpoints in different applications with
	//  different responses and ensure that the responses are ok

	@FeatureFlags("LPS-171047")
	@Test
	public void testHeadlessBuilderApplication() throws Exception {
		_withHeadlessBuilderApplication(
			TestPropsValues.getCompanyId(),
			() -> {
				JSONObject jsonObject = _invoke(
					"headless-builder/v1.0/test-entries/" +
						_testEntry.getTestEntryId(),
					Http.Method.GET);

				JSONAssert.assertEquals(
					JSONUtil.put(
						"date", _formatDate(_testEntry.getDateField())
					).put(
						"number", (int)_testEntry.getLongField()
					).toString(),
					jsonObject.toString(), true);
			});
	}

	@FeatureFlags("LPS-171047")
	@Test
	public void testHeadlessBuilderApplicationOnADifferentCompany()
		throws Exception {

		_withHeadlessBuilderApplication(
			0,
			() -> {
				JSONObject jsonObject = _invoke(
					"headless-builder/v1.0/test-entries/" +
						_testEntry.getTestEntryId(),
					Http.Method.GET);

				JSONAssert.assertEquals(
					JSONUtil.put(
						"status", "NOT_FOUND"
					).put(
						"title", "The operation could not be found."
					).toString(),
					jsonObject.toString(), true);
			});
	}

	@Test
	public void testHeadlessBuilderApplicationWithoutFeatureFlag()
		throws Exception {

		HttpURLConnection httpURLConnection = _createHttpURLConnection(
			"headless-builder/v1.0/test-entries/" + _testEntry.getTestEntryId(),
			Http.Method.GET);

		httpURLConnection.connect();

		Assert.assertEquals(404, httpURLConnection.getResponseCode());
	}

	@FeatureFlags("LPS-171047")
	@Test
	public void testMissingHeadlessBuilderApplication() throws Exception {
		JSONObject jsonObject = _invoke(
			"headless-builder/v1.0/test-entries/1234", Http.Method.GET);

		JSONAssert.assertEquals(
			JSONUtil.put(
				"status", "NOT_FOUND"
			).put(
				"title", "The operation could not be found."
			).toString(),
			jsonObject.toString(), true);
	}

	@Test
	public void testPublishApiApplication() throws Exception {
		String apiApplicationBaseURL = "base-url";
		String apiEndpointPath = "/new-path";

		ObjectEntry apiApplication = _createApiApplicationObjectEntry(
			apiApplicationBaseURL, "ApiApplication");

		ObjectEntry apiEndpoint = _createApiEndpointObjectEntry(
			"GET", apiEndpointPath, "company");

		ObjectRelationshipTestUtil.relateObjectEntries(
			apiApplication.getObjectEntryId(), apiEndpoint.getObjectEntryId(),
			_applicationEndpointsObjectRelationship,
			TestPropsValues.getUserId());

		List<ObjectField> objectFields = Arrays.asList(
			ObjectFieldUtil.createObjectField(
				"Text", "String", true, true, null,
				RandomTestUtil.randomString(), "stringField1", false),
			ObjectFieldUtil.createObjectField(
				"Text", "String", true, true, null,
				RandomTestUtil.randomString(), "stringField2", false));

		ObjectDefinition objectDefinition =
			ObjectDefinitionTestUtil.publishObjectDefinition(
				"TEST_OBJECT_DEFINITION", objectFields);

		ObjectEntry apiSchema = _createApiSchemaObjectEntry(
			"TestSchema", objectDefinition);

		ObjectRelationshipTestUtil.relateObjectEntries(
			apiApplication.getObjectEntryId(), apiSchema.getObjectEntryId(),
			_applicationSchemasObjectRelationship, TestPropsValues.getUserId());

		List<ObjectEntry> schemaProperties = new ArrayList<>();

		for (ObjectField objectField : objectFields) {
			ObjectEntry schemaProperty = _createSchemaPropertyObjectEntry(
				objectField.getName(), objectField);

			schemaProperties.add(schemaProperty);

			ObjectRelationshipTestUtil.relateObjectEntries(
				apiSchema.getObjectEntryId(), schemaProperty.getObjectEntryId(),
				_schemasPropertiesObjectRelationship,
				TestPropsValues.getUserId());
		}

		ObjectRelationshipTestUtil.relateObjectEntries(
			apiSchema.getObjectEntryId(), apiEndpoint.getObjectEntryId(),
			_responseSchemaEndpointsObjectRelationship,
			TestPropsValues.getUserId());

		CountDownLatch addedCountLatch = new CountDownLatch(1);

		Bundle bundle = FrameworkUtil.getBundle(getClass());

		BundleContext bundleContext = bundle.getBundleContext();

		ServiceTracker<?, ?> serviceTracker =
			new ServiceTracker<Application, Application>(
				bundleContext, Application.class, null) {

				@Override
				public Application addingService(
					ServiceReference<Application> serviceReference) {

					String property = (String)serviceReference.getProperty(
						"osgi.jaxrs.application.base");

					if (property.contains(_API_APPLICATION_BASE_URL_VALUE)) {
						addedCountLatch.countDown();

						return super.addingService(serviceReference);
					}

					return null;
				}

			};

		try {
			serviceTracker.open();

			_headlessBuilderApplicationManager.publishApplication(
				apiApplication.getExternalReferenceCode());

			addedCountLatch.await(1, TimeUnit.MINUTES);

			HttpURLConnection httpURLConnection = _createHttpURLConnection(
				apiApplicationBaseURL + apiEndpointPath, Http.Method.GET);

			httpURLConnection.connect();

			Assert.assertEquals(200, httpURLConnection.getResponseCode());

			httpURLConnection = _createHttpURLConnection(
				apiApplicationBaseURL + "/openapi.json", Http.Method.GET);

			httpURLConnection.connect();

			Assert.assertEquals(200, httpURLConnection.getResponseCode());
		}
		finally {
			serviceTracker.close();
			_headlessBuilderApplicationManager.unpublishApplication(
				apiApplication.getExternalReferenceCode());

			try {
				ObjectEntryThreadLocal.setDisassociateRelatedModels(true);

				for (ObjectEntry schemaProperty : schemaProperties) {
					ObjectEntryLocalServiceUtil.deleteObjectEntry(
						schemaProperty.getObjectEntryId());
				}

				ObjectEntryLocalServiceUtil.deleteObjectEntry(
					apiEndpoint.getObjectEntryId());
				ObjectEntryLocalServiceUtil.deleteObjectEntry(
					apiApplication.getObjectEntryId());
				ObjectEntryLocalServiceUtil.deleteObjectEntry(
					apiSchema.getObjectEntryId());
			}
			finally {
				ObjectEntryThreadLocal.setDisassociateRelatedModels(false);
			}
		}
	}

	@Test
	public void testPublishMultipleApiApplications() throws Exception {
		String apiApplication1baseURL = "base-url-one";
		String apiEndpoint1Path = "/endpoint-one";

		ObjectEntry apiApplication1 = _createApiApplicationObjectEntry(
			apiApplication1baseURL, "ApiApplication1");

		ObjectEntry apiEndpoint1 = _createApiEndpointObjectEntry(
			"GET", apiEndpoint1Path, "company");

		ObjectRelationshipTestUtil.relateObjectEntries(
			apiApplication1.getObjectEntryId(), apiEndpoint1.getObjectEntryId(),
			_applicationEndpointsObjectRelationship,
			TestPropsValues.getUserId());

		String apiApplication2baseURL = "base-url-two";
		String apiEndpoint2Path = "/endpoint-two";

		ObjectEntry apiApplication2 = _createApiApplicationObjectEntry(
			apiApplication2baseURL, "ApiApplication2");

		ObjectEntry apiEndpoint2 = _createApiEndpointObjectEntry(
			"GET", apiEndpoint2Path, "Instance");

		ObjectRelationshipTestUtil.relateObjectEntries(
			apiApplication2.getObjectEntryId(), apiEndpoint2.getObjectEntryId(),
			_applicationEndpointsObjectRelationship,
			TestPropsValues.getUserId());

		CountDownLatch addedCountLatch = new CountDownLatch(2);
		CountDownLatch removedCountLatch = new CountDownLatch(1);

		Bundle bundle = FrameworkUtil.getBundle(getClass());

		BundleContext bundleContext = bundle.getBundleContext();

		ServiceTracker<?, ?> serviceTracker =
			new ServiceTracker<Application, Application>(
				bundleContext, Application.class, null) {

				@Override
				public Application addingService(
					ServiceReference<Application> serviceReference) {

					Object property = serviceReference.getProperty(
						"liferay.headless.builder.application");

					if ((property != null) && (Boolean)property) {
						addedCountLatch.countDown();

						return super.addingService(serviceReference);
					}

					return null;
				}

				@Override
				public void removedService(
					ServiceReference<Application> serviceReference,
					Application service) {

					removedCountLatch.countDown();
					super.removedService(serviceReference, service);
				}

			};

		try {
			serviceTracker.open();

			_headlessBuilderApplicationManager.publishApplication(
				apiApplication1.getExternalReferenceCode());

			_headlessBuilderApplicationManager.publishApplication(
				apiApplication2.getExternalReferenceCode());

			addedCountLatch.await(1, TimeUnit.MINUTES);

			HttpURLConnection httpURLConnection = _createHttpURLConnection(
				apiApplication1baseURL + apiEndpoint1Path, Http.Method.GET);

			httpURLConnection.connect();

			Assert.assertEquals(200, httpURLConnection.getResponseCode());

			httpURLConnection = _createHttpURLConnection(
				apiApplication2baseURL + apiEndpoint2Path, Http.Method.GET);

			httpURLConnection.connect();

			Assert.assertEquals(200, httpURLConnection.getResponseCode());

			_headlessBuilderApplicationManager.unpublishApplication(
				apiApplication1.getExternalReferenceCode());

			removedCountLatch.await(1, TimeUnit.MINUTES);

			httpURLConnection = _createHttpURLConnection(
				apiApplication1baseURL + apiEndpoint1Path, Http.Method.GET);

			httpURLConnection.connect();

			Assert.assertEquals(404, httpURLConnection.getResponseCode());

			httpURLConnection = _createHttpURLConnection(
				apiApplication2baseURL + apiEndpoint2Path, Http.Method.GET);

			httpURLConnection.connect();

			Assert.assertEquals(200, httpURLConnection.getResponseCode());
		}
		finally {
			serviceTracker.close();
			_headlessBuilderApplicationManager.unpublishApplication(
				apiApplication1.getExternalReferenceCode());
			_headlessBuilderApplicationManager.unpublishApplication(
				apiApplication2.getExternalReferenceCode());
		}
	}

	private ObjectEntry _createApiApplicationObjectEntry(
			String baseURL, String title)
		throws Exception {

		return ObjectEntryTestUtil.addObjectEntry(
			_apiApplicationObjectDefinition,
			HashMapBuilder.<String, Serializable>put(
				_API_APPLICATION_BASE_URL, baseURL
			).put(
				_API_APPLICATION_TITLE, title
			).put(
				"externalReferenceCode",
				baseURL + "#" + TestPropsValues.getCompanyId()
			).put(
				"version", "v1.0"
			).build());
	}

	private ObjectEntry _createApiEndpointObjectEntry(
			String httpMethod, String path, String scope)
		throws Exception {

		return ObjectEntryTestUtil.addObjectEntry(
			_apiEndpointObjectDefinition,
			HashMapBuilder.<String, Serializable>put(
				_API_ENDPOINT_HTTP_METHOD, httpMethod
			).put(
				_API_ENDPOINT_PATH, path
			).put(
				_API_ENDPOINT_SCOPE, scope
			).put(
				"name", RandomTestUtil.randomString()
			).build());
	}

	private ObjectEntry _createApiSchemaObjectEntry(
			String name, ObjectDefinition objectDefinition)
		throws Exception {

		return ObjectEntryTestUtil.addObjectEntry(
			_apiSchemaObjectDefinition,
			HashMapBuilder.<String, Serializable>put(
				"description",
				"this is the description for the " + name + " schema"
			).put(
				"mainObjectDefinitionERC",
				objectDefinition.getExternalReferenceCode()
			).put(
				"name", name
			).build());
	}

	private HttpURLConnection _createHttpURLConnection(
			String endpoint, Http.Method method)
		throws Exception {

		URL url = new URL("http://localhost:8080/o/" + endpoint);

		HttpURLConnection httpURLConnection =
			(HttpURLConnection)url.openConnection();

		httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT, "*/*");

		httpURLConnection.setRequestProperty(
			HttpHeaders.CONTENT_TYPE, ContentTypes.APPLICATION_JSON);

		String encodedUserNameAndPassword = Base64.encode(
			"test@liferay.com:test".getBytes(StandardCharsets.UTF_8));

		httpURLConnection.setRequestProperty(
			"Authorization", "Basic " + encodedUserNameAndPassword);

		httpURLConnection.setRequestMethod(method.toString());

		return httpURLConnection;
	}

	private ObjectEntry _createSchemaPropertyObjectEntry(
			String name, ObjectField objectField)
		throws Exception {

		return ObjectEntryTestUtil.addObjectEntry(
			_schemaPropertyObjectDefinition,
			HashMapBuilder.<String, Serializable>put(
				"description",
				"this is the description for the " + name + " property"
			).put(
				"name", name
			).put(
				"objectFieldERC", objectField.getExternalReferenceCode()
			).build());
	}

	private String _formatDate(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		return simpleDateFormat.format(date);
	}

	private JSONObject _invoke(String endpoint, Http.Method method)
		throws Exception {

		HttpURLConnection httpURLConnection = _createHttpURLConnection(
			endpoint, method);

		httpURLConnection.connect();

		try {
			return JSONFactoryUtil.createJSONObject(
				StringUtil.read(httpURLConnection.getInputStream()));
		}
		catch (FileNotFoundException fileNotFoundException) {
			return JSONFactoryUtil.createJSONObject(
				StringUtil.read(httpURLConnection.getErrorStream()));
		}
	}

	private OpenAPIYAML _readOpenAPIYAML(String yamlFile) throws Exception {
		try (InputStream inputStream = getClass().getResourceAsStream(
				yamlFile)) {

			return YAMLUtil.loadOpenAPIYAML(StringUtil.read(inputStream));
		}
	}

	private void _withHeadlessBuilderApplication(
			long companyId, UnsafeRunnable<Exception> unsafeRunnable)
		throws Exception {

		HeadlessBuilderApplication headlessBuilderApplication =
			_headlessBuilderApplicationFactory.getHeadlessBuilderApplication(
				companyId, _readOpenAPIYAML("/rest-openapi.yaml"));

		HeadlessBuilderApplication.Handle handle =
			headlessBuilderApplication.deploy();

		try {
			unsafeRunnable.run();
		}
		finally {
			handle.undeploy();
		}
	}

	private static final String _API_APPLICATION_BASE_URL = "baseURL";

	private static final String _API_APPLICATION_BASE_URL_VALUE = "base-url";

	private static final String _API_APPLICATION_TITLE = "title";

	private static final String _API_ENDPOINT_HTTP_METHOD = "httpMethod";

	private static final String _API_ENDPOINT_PATH = "path";

	private static final String _API_ENDPOINT_SCOPE = "scope";

	private ObjectDefinition _apiApplicationObjectDefinition;
	private ObjectDefinition _apiEndpointObjectDefinition;
	private ObjectDefinition _apiSchemaObjectDefinition;
	private ObjectRelationship _applicationEndpointsObjectRelationship;
	private ObjectRelationship _applicationSchemasObjectRelationship;

	@Inject
	private HeadlessBuilderApplicationFactory
		_headlessBuilderApplicationFactory;

	@Inject
	private HeadlessBuilderApplicationManager
		_headlessBuilderApplicationManager;

	private ServiceRegistration<?>
		_infoItemFieldValuesProviderServiceRegistration;
	private ServiceRegistration<?> _infoItemFormProviderServiceRegistration;
	private ServiceRegistration<?> _infoItemObjectProviderServiceRegistration;

	@Inject
	private ObjectDefinitionLocalService _objectDefinitionLocalService;

	@Inject
	private ObjectRelatedModelsProviderRegistry
		_objectRelatedModelsProviderRegistry;

	@Inject
	private ObjectRelationshipLocalService _objectRelationshipLocalService;

	private ObjectRelationship _responseSchemaEndpointsObjectRelationship;
	private ObjectDefinition _schemaPropertyObjectDefinition;
	private ObjectRelationship _schemasPropertiesObjectRelationship;
	private final TestEntry _testEntry = TestEntry.INSTANCE;

}