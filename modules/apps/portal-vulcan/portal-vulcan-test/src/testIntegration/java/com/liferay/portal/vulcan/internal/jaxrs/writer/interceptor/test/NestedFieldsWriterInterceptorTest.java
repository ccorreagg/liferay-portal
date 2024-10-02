/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.internal.jaxrs.writer.interceptor.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.test.util.HTTPTestUtil;
import com.liferay.portal.kernel.util.HashMapDictionaryBuilder;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.fields.NestedField;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.PrototypeServiceFactory;
import org.osgi.framework.ServiceRegistration;

import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

/**
 * @author Carlos Correa
 */
@RunWith(Arquillian.class)
public class NestedFieldsWriterInterceptorTest {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() {
		Bundle bundle = FrameworkUtil.getBundle(
			NestedFieldsWriterInterceptorTest.class);

		BundleContext bundleContext = bundle.getBundleContext();

		_serviceRegistrations = Arrays.asList(
			bundleContext.registerService(
				Application.class, new TestProductApplication(),
				HashMapDictionaryBuilder.<String, Object>put(
					"osgi.jaxrs.application.base", "/test-product-application"
				).put(
					"osgi.jaxrs.extension.select",
					"(osgi.jaxrs.name=Liferay.Vulcan)"
				).put(
					"osgi.jaxrs.name", "Test.TestProduct.Application"
				).build()),
			bundleContext.registerService(
				TestProductResourceV1.class,
				new PrototypeServiceFactory<TestProductResourceV1>() {

					@Override
					public TestProductResourceV1 getService(
						Bundle bundle,
						ServiceRegistration<TestProductResourceV1>
							serviceRegistration) {

						return new TestProductResourceV1Impl();
					}

					@Override
					public void ungetService(
						Bundle bundle,
						ServiceRegistration<TestProductResourceV1>
							serviceRegistration,
						TestProductResourceV1 testTestProductResourceV10) {
					}

				},
				HashMapDictionaryBuilder.<String, Object>put(
					"api.version", "v1.0"
				).put(
					"nested.field.support", "true"
				).put(
					"osgi.jaxrs.application.select",
					"(osgi.jaxrs.name=Test.TestProduct.Application)"
				).put(
					"osgi.jaxrs.resource", "true"
				).build()),
			bundleContext.registerService(
				TestProductResourceV2.class,
				new PrototypeServiceFactory<TestProductResourceV2>() {

					@Override
					public TestProductResourceV2 getService(
						Bundle bundle,
						ServiceRegistration<TestProductResourceV2>
							serviceRegistration) {

						return new TestProductResourceV2Impl();
					}

					@Override
					public void ungetService(
						Bundle bundle,
						ServiceRegistration<TestProductResourceV2>
							serviceRegistration,
						TestProductResourceV2 testTestProductResourceV20) {
					}

				},
				HashMapDictionaryBuilder.<String, Object>put(
					"api.version", "v2.0"
				).put(
					"nested.field.support", "true"
				).put(
					"osgi.jaxrs.application.select",
					"(osgi.jaxrs.name=Test.TestProduct.Application)"
				).put(
					"osgi.jaxrs.resource", "true"
				).build()));
	}

	@AfterClass
	public static void tearDownClass() {
		_serviceRegistrations.forEach(ServiceRegistration::unregister);
	}

	@Test
	public void testGetMultipleItemsWithNestedFields() throws Exception {

		// v1.0

		JSONAssert.assertEquals(
			_toPageJSONString(
				JSONUtil.putAll(
					JSONUtil.put(
						"externalCode", "testProduct_erc_1_v1"
					).put(
						"id", 11
					).put(
						"testCategories",
						JSONUtil.putAll(
							JSONUtil.put(
								"id", 111
							).put(
								"name", "testCategory11"
							),
							JSONUtil.put(
								"id", 112
							).put(
								"name", "testCategory12"
							))
					).put(
						"testProductOptions",
						JSONUtil.putAll(
							JSONUtil.put(
								"id", 1111
							).put(
								"name", "testProductOption1111"
							),
							JSONUtil.put(
								"id", 1112
							).put(
								"name", "testProductOption1112"
							),
							JSONUtil.put(
								"id", 1113
							).put(
								"name", "testProductOption1113"
							))
					).put(
						"testSkus",
						JSONUtil.putAll(
							JSONUtil.put("id", 11011),
							JSONUtil.put("id", 11012))
					),
					JSONUtil.put(
						"externalCode", "testProduct_erc_2_v1"
					).put(
						"id", 12
					).put(
						"testCategories",
						JSONUtil.putAll(
							JSONUtil.put(
								"id", 121
							).put(
								"name", "testCategory13"
							),
							JSONUtil.put(
								"id", 122
							).put(
								"name", "testCategory14"
							))
					).put(
						"testProductOptions",
						JSONUtil.putAll(
							JSONUtil.put(
								"id", 1211
							).put(
								"name", "testProductOption1211"
							),
							JSONUtil.put(
								"id", 1212
							).put(
								"name", "testProductOption1212"
							),
							JSONUtil.put(
								"id", 1213
							).put(
								"name", "testProductOption1213"
							))
					).put(
						"testSkus",
						JSONUtil.putAll(
							JSONUtil.put("id", 12011),
							JSONUtil.put("id", 12012))
					))),
			HTTPTestUtil.invokeToString(
				null,
				"test-product-application/v1.0/test-products" +
					"?nestedFields=testProductOptions,testSkus",
				Http.Method.GET),
			JSONCompareMode.STRICT);

		// v2.0

		JSONAssert.assertEquals(
			_toPageJSONString(
				JSONUtil.putAll(
					JSONUtil.put(
						"externalCode", "testProduct_erc_1_v2"
					).put(
						"id", 21
					).put(
						"testCategories",
						JSONUtil.putAll(
							JSONUtil.put(
								"id", 211
							).put(
								"name", "testCategory21"
							),
							JSONUtil.put(
								"id", 212
							).put(
								"name", "testCategory22"
							))
					).put(
						"testProductOptions",
						JSONUtil.putAll(
							JSONUtil.put(
								"id", 2121
							).put(
								"name", "testProductOption2121"
							),
							JSONUtil.put(
								"id", 2122
							).put(
								"name", "testProductOption2122"
							),
							JSONUtil.put(
								"id", 2123
							).put(
								"name", "testProductOption2123"
							))
					).put(
						"testSkus",
						JSONUtil.putAll(
							JSONUtil.put("id", 21021),
							JSONUtil.put("id", 21022))
					),
					JSONUtil.put(
						"externalCode", "testProduct_erc_2_v2"
					).put(
						"id", 22
					).put(
						"testCategories",
						JSONUtil.putAll(
							JSONUtil.put(
								"id", 221
							).put(
								"name", "testCategory23"
							),
							JSONUtil.put(
								"id", 222
							).put(
								"name", "testCategory24"
							))
					).put(
						"testProductOptions",
						JSONUtil.putAll(
							JSONUtil.put(
								"id", 2221
							).put(
								"name", "testProductOption2221"
							),
							JSONUtil.put(
								"id", 2222
							).put(
								"name", "testProductOption2222"
							),
							JSONUtil.put(
								"id", 2223
							).put(
								"name", "testProductOption2223"
							))
					).put(
						"testSkus",
						JSONUtil.putAll(
							JSONUtil.put("id", 22021),
							JSONUtil.put("id", 22022))
					))),
			HTTPTestUtil.invokeToString(
				null,
				"test-product-application/v2.0/test-products" +
					"?nestedFields=testProductOptions,testSkus",
				Http.Method.GET),
			JSONCompareMode.STRICT);
	}

	@Test
	public void testGetMultipleItemsWithoutNestedFields() throws Exception {

		// v1.0

		JSONAssert.assertEquals(
			_toPageJSONString(
				JSONUtil.putAll(
					JSONUtil.put(
						"externalCode", "testProduct_erc_1_v1"
					).put(
						"id", 11
					).put(
						"testCategories",
						JSONUtil.putAll(
							JSONUtil.put(
								"id", 111
							).put(
								"name", "testCategory11"
							),
							JSONUtil.put(
								"id", 112
							).put(
								"name", "testCategory12"
							))
					),
					JSONUtil.put(
						"externalCode", "testProduct_erc_2_v1"
					).put(
						"id", 12
					).put(
						"testCategories",
						JSONUtil.putAll(
							JSONUtil.put(
								"id", 121
							).put(
								"name", "testCategory13"
							),
							JSONUtil.put(
								"id", 122
							).put(
								"name", "testCategory14"
							))
					))),
			HTTPTestUtil.invokeToString(
				null, "test-product-application/v1.0/test-products",
				Http.Method.GET),
			JSONCompareMode.STRICT);

		// v2.0

		JSONAssert.assertEquals(
			_toPageJSONString(
				JSONUtil.putAll(
					JSONUtil.put(
						"externalCode", "testProduct_erc_1_v2"
					).put(
						"id", 21
					).put(
						"testCategories",
						JSONUtil.putAll(
							JSONUtil.put(
								"id", 211
							).put(
								"name", "testCategory21"
							),
							JSONUtil.put(
								"id", 212
							).put(
								"name", "testCategory22"
							))
					),
					JSONUtil.put(
						"externalCode", "testProduct_erc_2_v2"
					).put(
						"id", 22
					).put(
						"testCategories",
						JSONUtil.putAll(
							JSONUtil.put(
								"id", 221
							).put(
								"name", "testCategory23"
							),
							JSONUtil.put(
								"id", 222
							).put(
								"name", "testCategory24"
							))
					))),
			HTTPTestUtil.invokeToString(
				null, "test-product-application/v2.0/test-products",
				Http.Method.GET),
			JSONCompareMode.STRICT);
	}

	@Path("/v1.0")
	public static class BaseTestProductResourceV1Impl
		implements TestProductResourceV1 {

		@GET
		@Path("/test-products/{id}/test-product-options")
		@Produces("application/json")
		public List<TestProductOption> getTestProductOptions(
			@PathParam("id") Long id, @QueryParam("name") String name) {

			return Collections.emptyList();
		}

		@GET
		@Path("/test-products")
		@Produces("application/json")
		public Page<TestProduct> getTestProducts() {
			return Page.of(Collections.emptyList());
		}

		@GET
		@Path("/test-products/{id}/test-skus")
		@Produces("application/json")
		public Page<TestSku> getTestSkus(@PathParam("id") Long id) {
			return Page.of(Collections.emptyList());
		}

	}

	@Path("/v2.0")
	public static class BaseTestProductResourceV2Impl
		implements TestProductResourceV2 {

		@GET
		@Path("/test-products/{id}/test-product-options")
		@Produces("application/json")
		public List<TestProductOption> getTestProductOptions(
			@PathParam("id") Long id, @QueryParam("name") String name) {

			return Collections.emptyList();
		}

		@GET
		@Path("/test-products")
		@Produces("application/json")
		public Page<TestProduct> getTestProducts() {
			return Page.of(Collections.emptyList());
		}

		@GET
		@Path("/test-products/{id}/test-skus")
		@Produces("application/json")
		public Page<TestSku> getTestSkus(@PathParam("id") Long id) {
			return Page.of(Collections.emptyList());
		}

	}

	public static class TestCategory {

		public Long getId() {
			return _id;
		}

		public String getName() {
			return _name;
		}

		public void setId(Long id) {
			_id = id;
		}

		public void setName(String name) {
			_name = name;
		}

		private Long _id;
		private String _name;

	}

	public static class TestProduct {

		public String getExternalCode() {
			return externalCode;
		}

		public Long getId() {
			return id;
		}

		public TestCategory[] getTestCategories() {
			return testCategories;
		}

		public TestProductOption[] getTestProductOptions() {
			return testProductOptions;
		}

		public TestSku[] getTestSkus() {
			return testSkus;
		}

		public void setExternalCode(String externalCode) {
			this.externalCode = externalCode;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public void setTestCategories(TestCategory[] testCategories) {
			this.testCategories = testCategories;
		}

		public void setTestProductOptions(
			TestProductOption[] testProductOptions) {

			this.testProductOptions = testProductOptions;
		}

		public void setTestSkus(TestSku[] testSkus) {
			this.testSkus = testSkus;
		}

		protected String externalCode;
		protected Long id;
		protected TestCategory[] testCategories;
		protected TestProductOption[] testProductOptions;
		protected TestSku[] testSkus;

	}

	public static class TestProductApplication extends Application {

		@Override
		public Set<Object> getSingletons() {
			return Collections.singleton(this);
		}

	}

	public static class TestProductOption {

		public Long getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		protected Long id;
		protected String name;

	}

	public static class TestProductResourceV1Impl
		extends BaseTestProductResourceV1Impl {

		@NestedField("testProductOptions")
		@Override
		public List<TestProductOption> getTestProductOptions(
			Long id, String name) {

			return Arrays.asList(
				_buildTestProductOption(
					(id * 100) + 11, "testProductOption" + id + "11"),
				_buildTestProductOption(
					(id * 100) + 12, "testProductOption" + id + "12"),
				_buildTestProductOption(
					(id * 100) + 13, "testProductOption" + id + "13"));
		}

		@Override
		public Page<TestProduct> getTestProducts() {
			return Page.of(
				Arrays.asList(
					_buildTestProduct(
						new TestCategory[] {
							_buildTestCategory(111L, "testCategory11"),
							_buildTestCategory(112L, "testCategory12")
						},
						"testProduct_erc_1_v1", 11L),
					_buildTestProduct(
						new TestCategory[] {
							_buildTestCategory(121L, "testCategory13"),
							_buildTestCategory(122L, "testCategory14")
						},
						"testProduct_erc_2_v1", 12L)));
		}

		@NestedField("testSkus")
		@Override
		public Page<TestSku> getTestSkus(Long id) {
			return Page.of(
				Arrays.asList(
					_buildTestSku((id * 1000) + 11),
					_buildTestSku((id * 1000) + 12)));
		}

	}

	public static class TestProductResourceV2Impl
		extends BaseTestProductResourceV2Impl {

		@NestedField("testProductOptions")
		@Override
		public List<TestProductOption> getTestProductOptions(
			Long id, String name) {

			return Arrays.asList(
				_buildTestProductOption(
					(id * 100) + 21, "testProductOption" + id + "21"),
				_buildTestProductOption(
					(id * 100) + 22, "testProductOption" + id + "22"),
				_buildTestProductOption(
					(id * 100) + 23, "testProductOption" + id + "23"));
		}

		@Override
		public Page<TestProduct> getTestProducts() {
			return Page.of(
				Arrays.asList(
					_buildTestProduct(
						new TestCategory[] {
							_buildTestCategory(211L, "testCategory21"),
							_buildTestCategory(212L, "testCategory22")
						},
						"testProduct_erc_1_v2", 21L),
					_buildTestProduct(
						new TestCategory[] {
							_buildTestCategory(221L, "testCategory23"),
							_buildTestCategory(222L, "testCategory24")
						},
						"testProduct_erc_2_v2", 22L)));
		}

		@NestedField("testSkus")
		@Override
		public Page<TestSku> getTestSkus(Long id) {
			return Page.of(
				Arrays.asList(
					_buildTestSku((id * 1000) + 21),
					_buildTestSku((id * 1000) + 22)));
		}

	}

	public static class TestSku {

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		protected Long id;

	}

	public interface TestProductResourceV1 {

		public List<TestProductOption> getTestProductOptions(
			Long id, String name);

		public Page<TestProduct> getTestProducts();

		public Page<TestSku> getTestSkus(Long id);

	}

	public interface TestProductResourceV2 {

		public List<TestProductOption> getTestProductOptions(
			Long id, String name);

		public Page<TestProduct> getTestProducts();

		public Page<TestSku> getTestSkus(Long id);

	}

	private static TestCategory _buildTestCategory(Long id, String name) {
		TestCategory testCategory = new TestCategory();

		testCategory.setId(id);
		testCategory.setName(name);

		return testCategory;
	}

	private static TestProduct _buildTestProduct(
		TestCategory[] testCategories, String externalReferenceCode, Long id) {

		TestProduct testProduct = new TestProduct();

		testProduct.setExternalCode(externalReferenceCode);
		testProduct.setId(id);
		testProduct.setTestCategories(testCategories);

		return testProduct;
	}

	private static TestProductOption _buildTestProductOption(
		Long id, String name) {

		TestProductOption testProductOption = new TestProductOption();

		testProductOption.setId(id);
		testProductOption.setName(name);

		return testProductOption;
	}

	private static TestSku _buildTestSku(long id) {
		TestSku testSku = new TestSku();

		testSku.setId(id);

		return testSku;
	}

	private String _toPageJSONString(JSONArray itemsJSONArray) {
		return JSONUtil.put(
			"actions", JSONFactoryUtil.createJSONObject()
		).put(
			"facets", JSONFactoryUtil.createJSONArray()
		).put(
			"items", itemsJSONArray
		).put(
			"lastPage", 1
		).put(
			"page", 1
		).put(
			"pageSize", itemsJSONArray.length()
		).put(
			"totalCount", itemsJSONArray.length()
		).toString();
	}

	private static List<ServiceRegistration<?>> _serviceRegistrations;

}