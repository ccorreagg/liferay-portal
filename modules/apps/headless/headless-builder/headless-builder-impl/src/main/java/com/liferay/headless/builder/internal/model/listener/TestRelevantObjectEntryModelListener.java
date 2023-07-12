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

package com.liferay.headless.builder.internal.model.listener;

import com.liferay.headless.builder.application.APIApplication;
import com.liferay.headless.builder.application.provider.APIApplicationProvider;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectEntry;
import com.liferay.object.model.listener.RelevantObjectEntryModelListener;
import com.liferay.object.rest.odata.entity.v1_0.EntityModelProvider;
import com.liferay.object.rest.odata.entity.v1_0.EntityModelProviderRegistry;
import com.liferay.object.rest.petra.sql.dsl.expression.FilterPredicateFactory;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.service.ObjectEntryLocalService;
import com.liferay.petra.sql.dsl.expression.Predicate;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.odata.filter.FilterParserProvider;
import com.liferay.segments.criteria.contributor.SegmentsCriteriaContributor;
import com.liferay.segments.criteria.mapper.SegmentsCriteriaJSONObjectMapper;

import java.io.Serializable;

import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(service = RelevantObjectEntryModelListener.class)
public class TestRelevantObjectEntryModelListener
	extends BaseModelListener<ObjectEntry>
	implements RelevantObjectEntryModelListener {

	@Override
	public String getObjectDefinitionExternalReferenceCode() {
		return "L_API_FILTER";
	}

	@Override
	public void onBeforeCreate(ObjectEntry objectEntry)
		throws ModelListenerException {

		try {
			Map<String, Serializable> apiFilterObjectEntryValues =
				objectEntry.getValues();

			ObjectEntry apiEndpointObjectEntry =
				_objectEntryLocalService.fetchObjectEntry(
					GetterUtil.getLong(
						apiFilterObjectEntryValues.get(
							"r_apiEndpointToAPIFilters_c_apiEndpointId")));

			Map<String, Serializable> apiEndpointObjectEntryValues =
				apiEndpointObjectEntry.getValues();

			ObjectEntry apiApplicationObjectEntry =
				_objectEntryLocalService.fetchObjectEntry(
					GetterUtil.getLong(
						apiEndpointObjectEntryValues.get(
							"r_apiApplicationToAPIEndpoints_c_apiApplicationId")));

			Map<String, Serializable> apiApplicationObjectEntryValues =
				apiApplicationObjectEntry.getValues();

			APIApplication apiApplication =
				_apiApplicationProvider.fetchAPIApplication(
					(String)apiApplicationObjectEntryValues.get("baseURL"),
					apiApplicationObjectEntry.getCompanyId());

			APIApplication.Endpoint endpoint = apiApplication.getEndpoints(
			).get(
				0
			);

			String oDataFilter = (String)apiFilterObjectEntryValues.get(
				"oDataFilter");

			// 			SegmentsCriteriaContributor segmentsCriteriaContributor =

			//				new APISchemaSegmentsCriteriaContributor(
			//					_entityModelProviderRegistry, objectDefinition,
			//					_segmentsCriteriaJSONObjectMapper, schema);

			//
			//			segmentsCriteriaContributor.contribute(
			//				criteria, oDataFilter, Criteria.Conjunction.AND);
			//
			//			System.out.println(criteria.toString());
			//

			// 			JSONObject criteriaJSONObject =

			//				segmentsCriteriaContributor.getCriteriaJSONObject(criteria);

			//
			//			System.out.println(criteriaJSONObject.toString());


//			ObjectEntry apiSchemaObjectEntry =
//				_objectEntryLocalService.fetchObjectEntry(
//					GetterUtil.getLong(
//						apiEndpointObjectEntryValues.get(
//							"r_responseAPISchemaToAPIEndpoints_c_apiSchemaId")));

			APIApplication.Schema schema = endpoint.getResponseSchema();

			ObjectDefinition schemaObjectDefinition =
				_objectDefinitionLocalService.getObjectDefinitionByExternalReferenceCode(
					schema.getMainObjectDefinitionExternalReferenceCode(), objectEntry.getCompanyId());

			EntityModelProvider entityModelProvider =
				_entityModelProviderRegistry.getEntityModelProvider(
					schemaObjectDefinition);

			Predicate predicate = _filterPredicateFactory.create(
				new APISchemaEntityModelWrapper(
					entityModelProvider.getEntityModel(), schema),
				oDataFilter, schemaObjectDefinition);
		}
		catch (Exception exception) {
			throw new ModelListenerException(exception);
		}
	}

	@Reference
	private APIApplicationProvider _apiApplicationProvider;

	@Reference
	private EntityModelProviderRegistry _entityModelProviderRegistry;

	@Reference
	private FilterParserProvider _filterParserProvider;

	@Reference
	private FilterPredicateFactory _filterPredicateFactory;

	@Reference
	private ObjectDefinitionLocalService _objectDefinitionLocalService;

	@Reference
	private ObjectEntryLocalService _objectEntryLocalService;

	private SegmentsCriteriaContributor _segmentsCriteriaContributor;

	@Reference(target = "(segments.criteria.mapper.key=odata)")
	private SegmentsCriteriaJSONObjectMapper _segmentsCriteriaJSONObjectMapper;

}