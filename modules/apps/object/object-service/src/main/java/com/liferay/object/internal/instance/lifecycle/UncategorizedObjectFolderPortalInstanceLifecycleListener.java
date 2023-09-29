/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.internal.instance.lifecycle;

import com.liferay.object.lifecycle.ObjectFrameworkLifecycleListener;
import com.liferay.object.service.ObjectFolderLocalService;
import com.liferay.osgi.service.tracker.collections.EagerServiceTrackerCustomizer;
import com.liferay.osgi.service.tracker.collections.list.ServiceTrackerList;
import com.liferay.osgi.service.tracker.collections.list.ServiceTrackerListFactory;
import com.liferay.portal.instance.lifecycle.BasePortalInstanceLifecycleListener;
import com.liferay.portal.instance.lifecycle.PortalInstanceLifecycleListener;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.service.CompanyLocalService;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(service = PortalInstanceLifecycleListener.class)
public class UncategorizedObjectFolderPortalInstanceLifecycleListener
	extends BasePortalInstanceLifecycleListener {

	@Override
	public void portalInstanceRegistered(Company company) throws Exception {
		_objectFolderLocalService.addOrGetUncategorizedObjectFolder(
			company.getCompanyId());

		for (ObjectFrameworkLifecycleListener objectFrameworkLifecycleListener :
				_serviceTrackerList.toList()) {

			objectFrameworkLifecycleListener.objectFrameworkRegistered(company);
		}
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_serviceTrackerList = ServiceTrackerListFactory.open(
			bundleContext, ObjectFrameworkLifecycleListener.class, null,
			new EagerServiceTrackerCustomizer
				<ObjectFrameworkLifecycleListener,
				 ObjectFrameworkLifecycleListener>() {

				@Override
				public ObjectFrameworkLifecycleListener addingService(
					ServiceReference<ObjectFrameworkLifecycleListener>
						serviceReference) {

					ObjectFrameworkLifecycleListener
						objectFrameworkLifecycleListener =
							bundleContext.getService(serviceReference);

					_companyLocalService.forEachCompany(
						objectFrameworkLifecycleListener::
							objectFrameworkRegistered);

					return objectFrameworkLifecycleListener;
				}

				@Override
				public void modifiedService(
					ServiceReference<ObjectFrameworkLifecycleListener>
						serviceReference,
					ObjectFrameworkLifecycleListener
						objectFrameworkLifecycleListener) {
				}

				@Override
				public void removedService(
					ServiceReference<ObjectFrameworkLifecycleListener>
						serviceReference,
					ObjectFrameworkLifecycleListener
						objectFrameworkLifecycleListener) {

					_companyLocalService.forEachCompany(
						objectFrameworkLifecycleListener::
							objectFrameworkUnregistered);

					bundleContext.ungetService(serviceReference);
				}

			});
	}

	@Deactivate
	protected void deactivate() {
		_serviceTrackerList.close();
	}

	@Reference
	private CompanyLocalService _companyLocalService;

	@Reference
	private ObjectFolderLocalService _objectFolderLocalService;

	private ServiceTrackerList<ObjectFrameworkLifecycleListener>
		_serviceTrackerList;

}