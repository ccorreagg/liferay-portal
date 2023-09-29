/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.admin.rest.lifecycle.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.object.admin.rest.dto.v1_0.ObjectDefinition;
import com.liferay.object.admin.rest.resource.v1_0.ObjectDefinitionResource;
import com.liferay.osgi.service.tracker.collections.EagerServiceTrackerCustomizer;
import com.liferay.osgi.service.tracker.collections.list.ServiceTrackerList;
import com.liferay.osgi.service.tracker.collections.list.ServiceTrackerListFactory;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.service.CompanyLocalService;
import com.liferay.portal.kernel.test.util.CompanyTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

/**
 * @author Carlos Correa
 */
@RunWith(Arquillian.class)
public class ObjectDefinitionResourceObjectFrameworkLifecycleListenerTest {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@Before
	public void setUp() throws Exception {
		_bundle = FrameworkUtil.getBundle(
			ObjectDefinitionResourceObjectFrameworkLifecycleListenerTest.class);
	}

	@After
	public void tearDown() {
		if (_serviceTrackerList != null) {
			_serviceTrackerList.close();
		}
	}

	@Test
	public void testDeployBatchResource() throws Exception {
		_serviceTrackerList = _openServiceTrackerList(
			Object.class,
			"(&(batch.engine.task.item.delegate=true)(companyId=" +
				TestPropsValues.getCompanyId() + "))");

		_assertServiceReferences(
			HashMapBuilder.put(
				"batch.engine.entity.class.name",
				ObjectDefinition.class.getName()
			).put(
				"batch.engine.task.item.delegate", Boolean.TRUE.toString()
			).put(
				"batch.planner.export.enabled", Boolean.TRUE.toString()
			).put(
				"batch.planner.import.enabled", Boolean.TRUE.toString()
			).put(
				"companyId", String.valueOf(TestPropsValues.getCompanyId())
			).build(),
			_serviceTrackerList.toList());
	}

	@Test
	public void testDeployBatchResourceWhenCompanyIsCreated() throws Exception {
		Company company = CompanyTestUtil.addCompany();

		_serviceTrackerList = _openServiceTrackerList(
			Object.class,
			"(&(batch.engine.task.item.delegate=true)(companyId=" +
				company.getCompanyId() + "))");

		_assertServiceReferences(
			HashMapBuilder.put(
				"batch.engine.entity.class.name",
				ObjectDefinition.class.getName()
			).put(
				"batch.engine.task.item.delegate", Boolean.TRUE.toString()
			).put(
				"batch.planner.export.enabled", Boolean.TRUE.toString()
			).put(
				"batch.planner.import.enabled", Boolean.TRUE.toString()
			).put(
				"companyId", String.valueOf(company.getCompanyId())
			).build(),
			_serviceTrackerList.toList());

		_companyLocalService.deleteCompany(company);

		Assert.assertTrue(_serviceTrackerList.size() == 0);
	}

	@Test
	public void testDeployObjectDefinitionResource() throws Exception {
		_serviceTrackerList = _openServiceTrackerList(
			ObjectDefinitionResource.class, null);

		_assertServiceReferences(
			HashMapBuilder.put(
				"api.version", "v1.0"
			).put(
				"entity.class.name", ObjectDefinition.class.getName()
			).put(
				"osgi.jaxrs.application.select",
				"(osgi.jaxrs.name=Liferay.Object.Admin.REST)"
			).put(
				"osgi.jaxrs.resource", Boolean.TRUE.toString()
			).build(),
			_serviceTrackerList.toList());
	}

	private void _assertServiceReferences(
		Map<String, String> expectedProperties,
		List<ServiceReference<?>> serviceReferences) {

		Assert.assertEquals(
			serviceReferences.toString(), 1, serviceReferences.size());

		ServiceReference<?> serviceReference = serviceReferences.get(0);

		String[] propertyKeys = serviceReference.getPropertyKeys();

		Assert.assertEquals(
			Arrays.toString(propertyKeys), expectedProperties.size() + 4,
			propertyKeys.length);

		for (Map.Entry<String, String> entry : expectedProperties.entrySet()) {
			String propertyName = entry.getKey();

			Assert.assertEquals(
				entry.getValue(), serviceReference.getProperty(propertyName));
		}
	}

	private ServiceTrackerList<ServiceReference<?>> _openServiceTrackerList(
		Class<?> clazz, String filterString) {

		return ServiceTrackerListFactory.open(
			_bundle.getBundleContext(), clazz, filterString,
			(ServiceTrackerCustomizer)
				new EagerServiceTrackerCustomizer
					<Object, ServiceReference<Object>>() {

					@Override
					public ServiceReference<Object> addingService(
						ServiceReference<Object> serviceReference) {

						return serviceReference;
					}

					@Override
					public void modifiedService(
						ServiceReference<Object> serviceReference1,
						ServiceReference<Object> serviceReference2) {
					}

					@Override
					public void removedService(
						ServiceReference<Object> serviceReference1,
						ServiceReference<Object> serviceReference2) {
					}

				});
	}

	private Bundle _bundle;

	@Inject
	private CompanyLocalService _companyLocalService;

	private ServiceTrackerList<ServiceReference<?>> _serviceTrackerList;

}