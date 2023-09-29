/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.admin.rest.internal.lifecycle;

import com.liferay.list.type.service.ListTypeDefinitionLocalService;
import com.liferay.list.type.service.ListTypeEntryLocalService;
import com.liferay.notification.service.NotificationTemplateLocalService;
import com.liferay.object.admin.rest.dto.v1_0.ObjectField;
import com.liferay.object.admin.rest.dto.v1_0.ObjectRelationship;
import com.liferay.object.admin.rest.dto.v1_0.ObjectValidationRule;
import com.liferay.object.admin.rest.dto.v1_0.ObjectView;
import com.liferay.object.admin.rest.internal.dto.v1_0.converter.constants.DTOConverterConstants;
import com.liferay.object.admin.rest.internal.resource.v1_0.ObjectDefinitionResourceImpl;
import com.liferay.object.admin.rest.resource.v1_0.ObjectActionResource;
import com.liferay.object.admin.rest.resource.v1_0.ObjectDefinitionResource;
import com.liferay.object.admin.rest.resource.v1_0.ObjectLayoutResource;
import com.liferay.object.admin.rest.resource.v1_0.ObjectRelationshipResource;
import com.liferay.object.admin.rest.resource.v1_0.ObjectValidationRuleResource;
import com.liferay.object.admin.rest.resource.v1_0.ObjectViewResource;
import com.liferay.object.lifecycle.ObjectFrameworkLifecycleListener;
import com.liferay.object.service.ObjectActionLocalService;
import com.liferay.object.service.ObjectActionService;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.service.ObjectDefinitionService;
import com.liferay.object.service.ObjectFieldLocalService;
import com.liferay.object.service.ObjectFieldSettingLocalService;
import com.liferay.object.service.ObjectFilterLocalService;
import com.liferay.object.service.ObjectFolderLocalService;
import com.liferay.object.service.ObjectLayoutLocalService;
import com.liferay.object.service.ObjectRelationshipLocalService;
import com.liferay.object.service.ObjectValidationRuleLocalService;
import com.liferay.object.service.ObjectViewLocalService;
import com.liferay.object.service.ObjectViewService;
import com.liferay.object.system.SystemObjectDefinitionManagerRegistry;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.service.CompanyLocalService;
import com.liferay.portal.kernel.util.HashMapDictionary;
import com.liferay.portal.kernel.util.Localization;
import com.liferay.portal.kernel.util.PropertiesUtil;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;

import java.io.InputStream;

import java.net.URL;

import java.util.Map;
import java.util.Properties;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.PrototypeServiceFactory;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(service = ObjectFrameworkLifecycleListener.class)
public class ObjectDefinitionResourceObjectFrameworkLifecycleListener
	implements ObjectFrameworkLifecycleListener {

	@Override
	public void objectFrameworkRegistered(Company company) {
	}

	@Override
	public void objectFrameworkUnregistered(Company company) {
	}

	@Activate
	protected void activate(BundleContext bundleContext) throws Exception {
		Bundle bundle = bundleContext.getBundle();

		URL url = bundle.getResource(
			"OSGI-INF/liferay/rest/v1_0/object-definition.properties");

		try (InputStream inputStream = url.openStream()) {
			Properties properties = PropertiesUtil.load(
				inputStream, StringPool.UTF8);

			_objectDefinitionResourceProperties = PropertiesUtil.toMap(
				properties);
		}

		_serviceRegistration = bundleContext.registerService(
			ObjectDefinitionResource.class,
			new PrototypeServiceFactory<ObjectDefinitionResource>() {

				@Override
				public ObjectDefinitionResource getService(
					Bundle bundle,
					ServiceRegistration<ObjectDefinitionResource>
						serviceRegistration) {

					return _createObjectDefinitionResourceImpl();
				}

				@Override
				public void ungetService(
					Bundle bundle,
					ServiceRegistration<ObjectDefinitionResource>
						serviceRegistration,
					ObjectDefinitionResource objectEntryResource) {
				}

			},
			new HashMapDictionary<>(_objectDefinitionResourceProperties));
	}

	@Deactivate
	protected void deactivate() {
		_serviceRegistration.unregister();
	}

	private ObjectDefinitionResource _createObjectDefinitionResourceImpl() {
		return new ObjectDefinitionResourceImpl(
			_language, _listTypeDefinitionLocalService,
			_listTypeEntryLocalService, _localization,
			_notificationTemplateLocalService, _objectActionLocalService,
			_objectActionResourceFactory, _objectActionService,
			_objectDefinitionLocalService, _objectDefinitionService,
			_objectFieldDTOConverter, _objectFieldLocalService,
			_objectFieldSettingLocalService, _objectFilterLocalService,
			_objectFolderLocalService, _objectLayoutLocalService,
			_objectLayoutResourceFactory, _objectRelationshipDTOConverter,
			_objectRelationshipLocalService, _objectRelationshipResourceFactory,
			_objectValidationRuleDTOConverter,
			_objectValidationRuleLocalService,
			_objectValidationRuleResourceFactory, _objectViewDTOConverter,
			_objectViewLocalService, _objectViewResourceFactory,
			_objectViewService, _systemObjectDefinitionManagerRegistry);
	}

	@Reference
	private CompanyLocalService _companyLocalService;

	@Reference
	private Language _language;

	@Reference
	private ListTypeDefinitionLocalService _listTypeDefinitionLocalService;

	@Reference
	private ListTypeEntryLocalService _listTypeEntryLocalService;

	@Reference
	private Localization _localization;

	@Reference
	private NotificationTemplateLocalService _notificationTemplateLocalService;

	@Reference
	private ObjectActionLocalService _objectActionLocalService;

	@Reference
	private ObjectActionResource.Factory _objectActionResourceFactory;

	@Reference
	private ObjectActionService _objectActionService;

	@Reference
	private ObjectDefinitionLocalService _objectDefinitionLocalService;

	private Map<String, Object> _objectDefinitionResourceProperties;

	@Reference
	private ObjectDefinitionService _objectDefinitionService;

	@Reference(target = DTOConverterConstants.OBJECT_FIELD_DTO_CONVERTER)
	private DTOConverter<com.liferay.object.model.ObjectField, ObjectField>
		_objectFieldDTOConverter;

	@Reference
	private ObjectFieldLocalService _objectFieldLocalService;

	@Reference
	private ObjectFieldSettingLocalService _objectFieldSettingLocalService;

	@Reference
	private ObjectFilterLocalService _objectFilterLocalService;

	@Reference
	private ObjectFolderLocalService _objectFolderLocalService;

	@Reference
	private ObjectLayoutLocalService _objectLayoutLocalService;

	@Reference
	private ObjectLayoutResource.Factory _objectLayoutResourceFactory;

	@Reference(target = DTOConverterConstants.OBJECT_RELATIONSHIP_DTO_CONVERTER)
	private DTOConverter
		<com.liferay.object.model.ObjectRelationship, ObjectRelationship>
			_objectRelationshipDTOConverter;

	@Reference
	private ObjectRelationshipLocalService _objectRelationshipLocalService;

	@Reference
	private ObjectRelationshipResource.Factory
		_objectRelationshipResourceFactory;

	@Reference(
		target = DTOConverterConstants.OBJECT_VALIDATION_RULE_DTO_CONVERTER
	)
	private DTOConverter
		<com.liferay.object.model.ObjectValidationRule, ObjectValidationRule>
			_objectValidationRuleDTOConverter;

	@Reference
	private ObjectValidationRuleLocalService _objectValidationRuleLocalService;

	@Reference
	private ObjectValidationRuleResource.Factory
		_objectValidationRuleResourceFactory;

	@Reference(target = DTOConverterConstants.OBJECT_VIEW_DTO_CONVERTER)
	private DTOConverter<com.liferay.object.model.ObjectView, ObjectView>
		_objectViewDTOConverter;

	@Reference
	private ObjectViewLocalService _objectViewLocalService;

	@Reference
	private ObjectViewResource.Factory _objectViewResourceFactory;

	@Reference
	private ObjectViewService _objectViewService;

	private ServiceRegistration<ObjectDefinitionResource> _serviceRegistration;

	@Reference
	private SystemObjectDefinitionManagerRegistry
		_systemObjectDefinitionManagerRegistry;

}