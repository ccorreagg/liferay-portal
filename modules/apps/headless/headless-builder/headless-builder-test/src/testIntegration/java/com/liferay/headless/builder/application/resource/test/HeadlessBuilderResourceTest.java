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

package com.liferay.headless.builder.application.resource.test;

import com.liferay.headless.builder.test.BaseTestCase;
import com.liferay.list.type.entry.util.ListTypeEntryUtil;
import com.liferay.list.type.model.ListTypeDefinition;
import com.liferay.list.type.model.ListTypeEntry;
import com.liferay.list.type.service.ListTypeDefinitionLocalService;
import com.liferay.object.constants.ObjectDefinitionConstants;
import com.liferay.object.constants.ObjectFieldSettingConstants;
import com.liferay.object.constants.ObjectFieldValidationConstants;
import com.liferay.object.constants.ObjectRelationshipConstants;
import com.liferay.object.field.builder.AggregationObjectFieldBuilder;
import com.liferay.object.field.builder.AttachmentObjectFieldBuilder;
import com.liferay.object.field.builder.BooleanObjectFieldBuilder;
import com.liferay.object.field.builder.DateObjectFieldBuilder;
import com.liferay.object.field.builder.DateTimeObjectFieldBuilder;
import com.liferay.object.field.builder.DecimalObjectFieldBuilder;
import com.liferay.object.field.builder.IntegerObjectFieldBuilder;
import com.liferay.object.field.builder.LongIntegerObjectFieldBuilder;
import com.liferay.object.field.builder.LongTextObjectFieldBuilder;
import com.liferay.object.field.builder.MultiselectPicklistObjectFieldBuilder;
import com.liferay.object.field.builder.PicklistObjectFieldBuilder;
import com.liferay.object.field.builder.PrecisionDecimalObjectFieldBuilder;
import com.liferay.object.field.builder.RichTextObjectFieldBuilder;
import com.liferay.object.field.builder.TextObjectFieldBuilder;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectField;
import com.liferay.object.model.ObjectFieldSetting;
import com.liferay.object.model.ObjectRelationship;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.service.ObjectFieldLocalService;
import com.liferay.object.service.ObjectFieldSettingLocalService;
import com.liferay.object.service.ObjectRelationshipLocalService;
import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.DataGuard;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.kernel.test.util.HTTPTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.URLCodec;
import com.liferay.portal.test.rule.FeatureFlags;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.util.LocalizedMapUtil;

import java.text.DateFormat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

/**
 * @author Luis Miguel Barcos
 */
@DataGuard(scope = DataGuard.Scope.METHOD)
@FeatureFlags({"LPS-167253", "LPS-184413", "LPS-186757"})
public class HeadlessBuilderResourceTest extends BaseTestCase {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() {
		_dateFormat = DateFormatFactoryUtil.getSimpleDateFormat("yyyy-MM-dd");
		_dateTimeFormat = DateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	}

	@Before
	public void setUp() throws Exception {
		super.setUp();

		List<ListTypeEntry> listTypeEntries = TransformUtil.transformToList(
			ListTypeValue.values(),
			listTypeValue -> ListTypeEntryUtil.createListTypeEntry(
				listTypeValue.name(),
				Collections.singletonMap(LocaleUtil.US, listTypeValue.name())));

		_listTypeDefinition =
			_listTypeDefinitionLocalService.addListTypeDefinition(
				null, TestPropsValues.getUserId(),
				Collections.singletonMap(
					LocaleUtil.US, RandomTestUtil.randomString()),
				listTypeEntries);

		_objectDefinition1 = _publishObjectDefinition(
			Arrays.asList(
				new AttachmentObjectFieldBuilder(
				).externalReferenceCode(
					_API_SCHEMA_ATTACHMENT_FIELD_ERC
				).labelMap(
					LocalizedMapUtil.getLocalizedMap(
						RandomTestUtil.randomString())
				).name(
					"attachmentField"
				).objectFieldSettings(
					Arrays.asList(
						_createObjectFieldSetting(
							"acceptedFileExtensions", "txt"),
						_createObjectFieldSetting(
							"fileSource", "documentsAndMedia"),
						_createObjectFieldSetting("maximumFileSize", "100"))
				).build(),
				new BooleanObjectFieldBuilder(
				).externalReferenceCode(
					_API_SCHEMA_BOOLEAN_FIELD_ERC
				).labelMap(
					LocalizedMapUtil.getLocalizedMap(
						RandomTestUtil.randomString())
				).name(
					"booleanField"
				).build(),
				new DateObjectFieldBuilder(
				).externalReferenceCode(
					_API_SCHEMA_DATE_FIELD_ERC
				).labelMap(
					LocalizedMapUtil.getLocalizedMap(
						RandomTestUtil.randomString())
				).name(
					"dateField"
				).build(),
				new DateTimeObjectFieldBuilder(
				).externalReferenceCode(
					_API_SCHEMA_DATE_TIME_FIELD_ERC
				).labelMap(
					LocalizedMapUtil.getLocalizedMap(
						RandomTestUtil.randomString())
				).name(
					"dateTimeField"
				).objectFieldSettings(
					Collections.singletonList(
						_createObjectFieldSetting(
							ObjectFieldSettingConstants.NAME_TIME_STORAGE,
							ObjectFieldSettingConstants.
								VALUE_USE_INPUT_AS_ENTERED))
				).build(),
				new DecimalObjectFieldBuilder(
				).externalReferenceCode(
					_API_SCHEMA_DECIMAL_FIELD_ERC
				).labelMap(
					LocalizedMapUtil.getLocalizedMap(
						RandomTestUtil.randomString())
				).name(
					"decimalField"
				).build(),
				new IntegerObjectFieldBuilder(
				).externalReferenceCode(
					_API_SCHEMA_INTEGER_FIELD_ERC
				).labelMap(
					LocalizedMapUtil.getLocalizedMap(
						RandomTestUtil.randomString())
				).name(
					"integerField"
				).build(),
				new LongIntegerObjectFieldBuilder(
				).externalReferenceCode(
					_API_SCHEMA_LONG_INTEGER_FIELD_ERC
				).labelMap(
					LocalizedMapUtil.getLocalizedMap(
						RandomTestUtil.randomString())
				).name(
					"longIntegerField"
				).build(),
				new LongTextObjectFieldBuilder(
				).externalReferenceCode(
					_API_SCHEMA_LONG_TEXT_FIELD_ERC
				).labelMap(
					LocalizedMapUtil.getLocalizedMap(
						RandomTestUtil.randomString())
				).name(
					"longTextField"
				).build(),
				new MultiselectPicklistObjectFieldBuilder(
				).externalReferenceCode(
					_API_SCHEMA_MULTISELECT_PICKLIST_FIELD_ERC
				).labelMap(
					LocalizedMapUtil.getLocalizedMap(
						RandomTestUtil.randomString())
				).listTypeDefinitionId(
					_listTypeDefinition.getListTypeDefinitionId()
				).name(
					"multiselectPicklistField"
				).build(),
				new PicklistObjectFieldBuilder(
				).externalReferenceCode(
					_API_SCHEMA_PICKLIST_FIELD_ERC
				).labelMap(
					LocalizedMapUtil.getLocalizedMap(
						RandomTestUtil.randomString())
				).name(
					"picklistField"
				).listTypeDefinitionId(
					_listTypeDefinition.getListTypeDefinitionId()
				).build(),
				new PrecisionDecimalObjectFieldBuilder(
				).externalReferenceCode(
					_API_SCHEMA_PRECISION_DECIMAL_FIELD_ERC
				).labelMap(
					LocalizedMapUtil.getLocalizedMap(
						RandomTestUtil.randomString())
				).name(
					"precisionDecimalField"
				).build(),
				new RichTextObjectFieldBuilder(
				).externalReferenceCode(
					_API_SCHEMA_RICH_TEXT_FIELD_ERC
				).labelMap(
					LocalizedMapUtil.getLocalizedMap(
						RandomTestUtil.randomString())
				).name(
					"richTextField"
				).build(),
				new TextObjectFieldBuilder(
				).externalReferenceCode(
					_API_SCHEMA_TEXT_FIELD_ERC
				).labelMap(
					LocalizedMapUtil.getLocalizedMap(
						RandomTestUtil.randomString())
				).name(
					"textField"
				).build()));

		_objectDefinition2 = _publishObjectDefinition(
			Arrays.asList(
				new TextObjectFieldBuilder(
				).labelMap(
					LocalizedMapUtil.getLocalizedMap(
						RandomTestUtil.randomString())
				).name(
					"textField"
				).build()));

		String relationshipName = "a" + RandomTestUtil.randomString();

		_objectRelationship = _objectRelationshipLocalService.addObjectRelationship(
			TestPropsValues.getUserId(),
			_objectDefinition1.getObjectDefinitionId(),
			_objectDefinition2.getObjectDefinitionId(), 0,
			ObjectRelationshipConstants.DELETION_TYPE_CASCADE,
			LocalizedMapUtil.getLocalizedMap(RandomTestUtil.randomString()),
			relationshipName, ObjectRelationshipConstants.TYPE_ONE_TO_MANY);

		ObjectField aggregationObjectField = new AggregationObjectFieldBuilder(
		).externalReferenceCode(
			_API_SCHEMA_AGGREGATION_FIELD_ERC
		).labelMap(
			LocalizedMapUtil.getLocalizedMap(RandomTestUtil.randomString())
		).name(
			"aggregationField"
		).objectDefinitionId(
			_objectDefinition1.getObjectDefinitionId()
		).objectFieldSettings(
			Arrays.asList(
				_createObjectFieldSetting("function", "COUNT"),
				_createObjectFieldSetting(
					"objectRelationshipName", relationshipName))
		).build();

		_objectFieldLocalService.addCustomObjectField(
			aggregationObjectField.getExternalReferenceCode(),
			TestPropsValues.getUserId(),
			aggregationObjectField.getListTypeDefinitionId(),
			aggregationObjectField.getObjectDefinitionId(),
			aggregationObjectField.getBusinessType(),
			aggregationObjectField.getDBType(),
			aggregationObjectField.isIndexed(),
			aggregationObjectField.isIndexedAsKeyword(),
			aggregationObjectField.getIndexedLanguageId(),
			aggregationObjectField.getLabelMap(),
			aggregationObjectField.isLocalized(),
			aggregationObjectField.getName(),
			aggregationObjectField.getReadOnly(),
			aggregationObjectField.getReadOnlyConditionExpression(),
			aggregationObjectField.isRequired(),
			aggregationObjectField.isState(),
			aggregationObjectField.getObjectFieldSettings());
	}

	@Test
	public void testGet() throws Exception {
		_addAPIApplication(
			_API_APPLICATION_ERC_1, _API_ENDPOINT_ERC_1, _BASE_URL_1,
			_API_APPLICATION_PATH_1);
		_addAPIApplication(
			_API_APPLICATION_ERC_2, _API_ENDPOINT_ERC_2, _BASE_URL_2,
			_API_APPLICATION_PATH_2);

		String endpointPath1 = _BASE_URL_1 + _API_APPLICATION_PATH_1;

		Assert.assertEquals(
			404,
			HTTPTestUtil.invokeToHttpCode(
				null, endpointPath1, Http.Method.GET));

		String endpointPath2 = _BASE_URL_2 + _API_APPLICATION_PATH_2;

		Assert.assertEquals(
			404,
			HTTPTestUtil.invokeToHttpCode(
				null, endpointPath2, Http.Method.GET));

		_publishAPIApplication(_API_APPLICATION_ERC_1);
		_publishAPIApplication(_API_APPLICATION_ERC_2);

		Assert.assertEquals(
			200,
			HTTPTestUtil.invokeToHttpCode(
				null, endpointPath1, Http.Method.GET));
		Assert.assertEquals(
			200,
			HTTPTestUtil.invokeToHttpCode(
				null, endpointPath2, Http.Method.GET));

		int integerFieldValue = RandomTestUtil.randomInt();
		String textFieldValue = RandomTestUtil.randomString();

		_addCustomObjectEntry(integerFieldValue, textFieldValue);

		JSONAssert.assertEquals(
			JSONUtil.put(
				"items",
				JSONUtil.put(
					JSONUtil.put(
						"integerProperty", integerFieldValue
					).put(
						"textProperty", textFieldValue
					))
			).toString(),
			HTTPTestUtil.invokeToJSONObject(
				null, endpointPath1, Http.Method.GET
			).toString(),
			JSONCompareMode.LENIENT);
		JSONAssert.assertEquals(
			JSONUtil.put(
				"items",
				JSONUtil.put(
					JSONUtil.put(
						"integerProperty", integerFieldValue
					).put(
						"textProperty", textFieldValue
					))
			).toString(),
			HTTPTestUtil.invokeToJSONObject(
				null, endpointPath2, Http.Method.GET
			).toString(),
			JSONCompareMode.LENIENT);

		Assert.assertEquals(
			404,
			HTTPTestUtil.invokeToHttpCode(
				null,
				_BASE_URL_1 + StringPool.SLASH + RandomTestUtil.randomString(),
				Http.Method.GET));
		Assert.assertEquals(
			404,
			HTTPTestUtil.invokeToHttpCode(
				null,
				_BASE_URL_2 + StringPool.SLASH + RandomTestUtil.randomString(),
				Http.Method.GET));

		HTTPTestUtil.invokeToJSONObject(
			JSONUtil.put(
				"applicationStatus", "unpublished"
			).toString(),
			"headless-builder/applications/by-external-reference-code/" +
				_API_APPLICATION_ERC_1,
			Http.Method.PATCH);

		Assert.assertEquals(
			404,
			HTTPTestUtil.invokeToHttpCode(
				null, endpointPath1, Http.Method.GET));
		Assert.assertEquals(
			200,
			HTTPTestUtil.invokeToHttpCode(
				null, endpointPath2, Http.Method.GET));
	}

	@Test
	public void testGetWithAPIFilter() throws Exception {
		_addAPIApplication(
			_API_APPLICATION_ERC_1, _API_ENDPOINT_ERC_1, _BASE_URL_1,
			_API_APPLICATION_PATH_1);

		_addAPIFilter(
			_API_ENDPOINT_ERC_1,
			"textField eq 'value5' or textField eq 'value7'");

		_publishAPIApplication(_API_APPLICATION_ERC_1);

		for (int i = 0; i <= 25; i++) {
			_addCustomObjectEntry(i, "value" + i);
		}

		JSONAssert.assertEquals(
			JSONUtil.put(
				"items",
				JSONUtil.putAll(
					JSONUtil.put(
						"integerProperty", 5
					).put(
						"textProperty", "value5"
					),
					JSONUtil.put(
						"integerProperty", 7
					).put(
						"textProperty", "value7"
					))
			).put(
				"lastPage", 1
			).put(
				"page", 1
			).put(
				"pageSize", 20
			).put(
				"totalCount", 2
			).toString(),
			HTTPTestUtil.invokeToJSONObject(
				null, _BASE_URL_1 + _API_APPLICATION_PATH_1, Http.Method.GET
			).toString(),
			JSONCompareMode.LENIENT);

		JSONAssert.assertEquals(
			JSONUtil.put(
				"items",
				JSONUtil.putAll(
					JSONUtil.put(
						"integerProperty", 5
					).put(
						"textProperty", "value5"
					))
			).put(
				"lastPage", 1
			).put(
				"page", 1
			).put(
				"pageSize", 20
			).put(
				"totalCount", 1
			).toString(),
			HTTPTestUtil.invokeToJSONObject(
				null,
				StringBundler.concat(
					_BASE_URL_1, _API_APPLICATION_PATH_1, "?filter=",
					URLCodec.encodeURL(
						"textProperty eq 'value5' or textProperty eq " +
							"'value8'")),
				Http.Method.GET
			).toString(),
			JSONCompareMode.LENIENT);
	}

	@Test
	public void testGetWithPagination() throws Exception {
		_addAPIApplication(
			_API_APPLICATION_ERC_1, _API_ENDPOINT_ERC_1, _BASE_URL_1,
			_API_APPLICATION_PATH_1);

		_publishAPIApplication(_API_APPLICATION_ERC_1);

		for (int i = 0; i <= 25; i++) {
			_addCustomObjectEntry(i, "value" + i);
		}

		JSONAssert.assertEquals(
			JSONUtil.put(
				"items",
				JSONUtil.putAll(
					JSONUtil.put(
						"integerProperty", 5
					).put(
						"textProperty", "value5"
					),
					JSONUtil.put(
						"integerProperty", 6
					).put(
						"textProperty", "value6"
					),
					JSONUtil.put(
						"integerProperty", 7
					).put(
						"textProperty", "value7"
					),
					JSONUtil.put(
						"integerProperty", 8
					).put(
						"textProperty", "value8"
					),
					JSONUtil.put(
						"integerProperty", 9
					).put(
						"textProperty", "value9"
					))
			).put(
				"lastPage", 6
			).put(
				"page", 2
			).put(
				"pageSize", 5
			).put(
				"totalCount", 26
			).toString(),
			HTTPTestUtil.invokeToJSONObject(
				null,
				String.format(
					"%s?page=2&pageSize=5",
					_BASE_URL_1 + _API_APPLICATION_PATH_1),
				Http.Method.GET
			).toString(),
			JSONCompareMode.LENIENT);
	}

	@Test
	public void testGetWithRequestFilter() throws Exception {
		_addAPIApplication(
			_API_APPLICATION_ERC_1, _API_ENDPOINT_ERC_1, _BASE_URL_1,
			_API_APPLICATION_PATH_1);

		_publishAPIApplication(_API_APPLICATION_ERC_1);

		for (int i = 0; i <= 25; i++) {
			_addCustomObjectEntry(i, "value" + i);
		}

		JSONAssert.assertEquals(
			JSONUtil.put(
				"items",
				JSONUtil.putAll(
					JSONUtil.put(
						"integerProperty", 5
					).put(
						"textProperty", "value5"
					),
					JSONUtil.put(
						"integerProperty", 7
					).put(
						"textProperty", "value7"
					))
			).put(
				"lastPage", 1
			).put(
				"page", 1
			).put(
				"pageSize", 20
			).put(
				"totalCount", 2
			).toString(),
			HTTPTestUtil.invokeToJSONObject(
				null,
				StringBundler.concat(
					_BASE_URL_1, _API_APPLICATION_PATH_1, "?filter=",
					URLCodec.encodeURL(
						"textProperty eq 'value5' or textProperty eq " +
							"'value7'")),
				Http.Method.GET
			).toString(),
			JSONCompareMode.LENIENT);
	}

	private void _addAPIApplication(
			String apiApplicationExternalReferenceCode,
			String apiEndpointExternalReferenceCode, String baseURL,
			String path)
		throws Exception {

		String apiSchemaExternalReferenceCode = RandomTestUtil.randomString();

		_assertSuccessfulHttpCode(
			HTTPTestUtil.invokeToHttpCode(
				JSONUtil.put(
					"apiApplicationToAPIEndpoints",
					JSONUtil.put(
						JSONUtil.put(
							"description", "description"
						).put(
							"externalReferenceCode",
							apiEndpointExternalReferenceCode
						).put(
							"httpMethod", "get"
						).put(
							"name", "name"
						).put(
							"path", path
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
									"description",
									"aggregationProperty description"
								).put(
									"name", "aggregationProperty"
								).put(
									"objectFieldERC",
									_API_SCHEMA_AGGREGATION_FIELD_ERC
								),
								JSONUtil.put(
									"description",
									"attachmentProperty description"
								).put(
									"name", "attachmentProperty"
								).put(
									"objectFieldERC",
									_API_SCHEMA_ATTACHMENT_FIELD_ERC
								),
								JSONUtil.put(
									"description", "booleanProperty description"
								).put(
									"name", "booleanProperty"
								).put(
									"objectFieldERC",
									_API_SCHEMA_BOOLEAN_FIELD_ERC
								),
								JSONUtil.put(
									"description", "dateProperty description"
								).put(
									"name", "dateProperty"
								).put(
									"objectFieldERC", _API_SCHEMA_DATE_FIELD_ERC
								),
								JSONUtil.put(
									"description",
									"dateTimeProperty description"
								).put(
									"name", "dateTimeProperty"
								).put(
									"objectFieldERC",
									_API_SCHEMA_DATE_TIME_FIELD_ERC
								),
								JSONUtil.put(
									"description", "decimalProperty description"
								).put(
									"name", "decimalProperty"
								).put(
									"objectFieldERC",
									_API_SCHEMA_DECIMAL_FIELD_ERC
								),
								JSONUtil.put(
									"description", "integerProperty description"
								).put(
									"name", "integerProperty"
								).put(
									"objectFieldERC",
									_API_SCHEMA_INTEGER_FIELD_ERC
								),
								JSONUtil.put(
									"description",
									"longIntegerProperty description"
								).put(
									"name", "longIntegerProperty"
								).put(
									"objectFieldERC",
									_API_SCHEMA_LONG_INTEGER_FIELD_ERC
								),
								JSONUtil.put(
									"description",
									"longTextProperty description"
								).put(
									"name", "longTextProperty"
								).put(
									"objectFieldERC",
									_API_SCHEMA_LONG_TEXT_FIELD_ERC
								),
								JSONUtil.put(
									"description",
									"multiselectPicklistProperty description"
								).put(
									"name", "multiselectPicklistProperty"
								).put(
									"objectFieldERC",
									_API_SCHEMA_MULTISELECT_PICKLIST_FIELD_ERC
								),
								JSONUtil.put(
									"description",
									"picklistProperty description"
								).put(
									"name", "picklistProperty"
								).put(
									"objectFieldERC",
									_API_SCHEMA_PICKLIST_FIELD_ERC
								),
								JSONUtil.put(
									"description",
									"precisionDecimalProperty description"
								).put(
									"name", "precisionDecimalProperty"
								).put(
									"objectFieldERC",
									_API_SCHEMA_PRECISION_DECIMAL_FIELD_ERC
								),
								JSONUtil.put(
									"description",
									"richTextProperty description"
								).put(
									"name", "richTextProperty"
								).put(
									"objectFieldERC",
									_API_SCHEMA_RICH_TEXT_FIELD_ERC
								),
								JSONUtil.put(
									"description", "textProperty description"
								).put(
									"name", "textProperty"
								).put(
									"objectFieldERC", _API_SCHEMA_TEXT_FIELD_ERC
								))
						).put(
							"description", "description"
						).put(
							"externalReferenceCode",
							apiSchemaExternalReferenceCode
						).put(
							"mainObjectDefinitionERC",
							_objectDefinition1.getExternalReferenceCode()
						).put(
							"name", "name"
						))
				).put(
					"applicationStatus", "unpublished"
				).put(
					"baseURL", baseURL
				).put(
					"externalReferenceCode", apiApplicationExternalReferenceCode
				).put(
					"title", RandomTestUtil.randomString()
				).toString(),
				"headless-builder/applications", Http.Method.POST));

		_assertSuccessfulHttpCode(
			HTTPTestUtil.invokeToHttpCode(
				null,
				StringBundler.concat(
					"headless-builder/schemas/by-external-reference-code/",
					apiSchemaExternalReferenceCode,
					"/requestAPISchemaToAPIEndpoints/",
					apiEndpointExternalReferenceCode),
				Http.Method.PUT));
		_assertSuccessfulHttpCode(
			HTTPTestUtil.invokeToHttpCode(
				null,
				StringBundler.concat(
					"headless-builder/schemas/by-external-reference-code/",
					apiSchemaExternalReferenceCode,
					"/responseAPISchemaToAPIEndpoints/",
					apiEndpointExternalReferenceCode),
				Http.Method.PUT));
	}

	private void _addAPIFilter(
			String apiEndpointExternalReferenceCode, String filterString)
		throws Exception {

		_assertSuccessfulHttpCode(
			HTTPTestUtil.invokeToHttpCode(
				JSONUtil.put(
					"oDataFilter", filterString
				).put(
					"r_apiEndpointToAPIFilters_c_apiEndpointERC",
					apiEndpointExternalReferenceCode
				).toString(),
				"headless-builder/filters", Http.Method.POST));
	}

	private void _addCustomObjectEntry(
			int integerFieldValue, String textFieldValue)
		throws Exception {

		String endpoint = StringUtil.removeSubstring(
			_objectDefinition1.getRESTContextPath(), "/o/");

		ListTypeValue listTypeValue = RandomTestUtil.randomEnum(
			ListTypeValue.class);

		List<ListTypeValue> listTypeValues = Arrays.asList(
			RandomTestUtil.randomEnum(ListTypeValue.class),
			RandomTestUtil.randomEnum(ListTypeValue.class));

		_assertSuccessfulHttpCode(
			HTTPTestUtil.invokeToHttpCode(
				JSONUtil.put(
					"booleanField", RandomTestUtil.randomBoolean()
				).put(
					"dateField", _dateFormat.format(RandomTestUtil.nextDate())
				).put(
					"dateTimeField",
					_dateTimeFormat.format(RandomTestUtil.nextDate())
				).put(
					"decimalField", RandomTestUtil.randomDouble()
				).put(
					"integerField", integerFieldValue
				).put(
					"longIntegerField",
					RandomTestUtil.randomLong(
						ObjectFieldValidationConstants.
							BUSINESS_TYPE_LONG_VALUE_MIN,
						ObjectFieldValidationConstants.
							BUSINESS_TYPE_LONG_VALUE_MAX)
				).put(
					"longTextField", RandomTestUtil.randomString()
				).put(
					"multiselectPicklistField",
					TransformUtil.transform(listTypeValues, ListTypeValue::name)
				).put(
					"picklistField", listTypeValue.name()
				).put(
					"precisionDecimalField", RandomTestUtil.randomDouble()
				).put(
					"richTextField", RandomTestUtil.randomString()
				).put(
					"textField", textFieldValue
				).toString(),
				endpoint, Http.Method.POST));
	}

	private void _assertSuccessfulHttpCode(int httpCode) {
		Assert.assertEquals(
			Response.Status.Family.SUCCESSFUL,
			Response.Status.Family.familyOf(httpCode));
	}

	private ObjectFieldSetting _createObjectFieldSetting(
		String name, String value) {

		ObjectFieldSetting objectFieldSetting =
			_objectFieldSettingLocalService.createObjectFieldSetting(0L);

		objectFieldSetting.setName(name);
		objectFieldSetting.setValue(value);

		return objectFieldSetting;
	}

	private void _publishAPIApplication(
			String apiApplicationExternalReferenceCode)
		throws Exception {

		_assertSuccessfulHttpCode(
			HTTPTestUtil.invokeToHttpCode(
				JSONUtil.put(
					"applicationStatus", "published"
				).toString(),
				"headless-builder/applications/by-external-reference-code/" +
					apiApplicationExternalReferenceCode,
				Http.Method.PATCH));
	}

	private ObjectDefinition _publishObjectDefinition(
			List<ObjectField> objectFields)
		throws Exception {

		ObjectDefinition objectDefinition =
			_objectDefinitionLocalService.addCustomObjectDefinition(
				TestPropsValues.getUserId(), false, false,
				LocalizedMapUtil.getLocalizedMap(RandomTestUtil.randomString()),
				"A" + RandomTestUtil.randomString(), null, null,
				LocalizedMapUtil.getLocalizedMap(RandomTestUtil.randomString()),
				true, ObjectDefinitionConstants.SCOPE_COMPANY,
				ObjectDefinitionConstants.STORAGE_TYPE_DEFAULT, objectFields);

		return _objectDefinitionLocalService.publishCustomObjectDefinition(
			TestPropsValues.getUserId(),
			objectDefinition.getObjectDefinitionId());
	}

	private static final String _API_APPLICATION_ERC_1 =
		RandomTestUtil.randomString();

	private static final String _API_APPLICATION_ERC_2 =
		RandomTestUtil.randomString();

	private static final String _API_APPLICATION_PATH_1 =
		StringPool.SLASH + RandomTestUtil.randomString();

	private static final String _API_APPLICATION_PATH_2 =
		StringPool.SLASH + RandomTestUtil.randomString();

	private static final String _API_ENDPOINT_ERC_1 =
		RandomTestUtil.randomString();

	private static final String _API_ENDPOINT_ERC_2 =
		RandomTestUtil.randomString();

	private static final String _API_SCHEMA_AGGREGATION_FIELD_ERC =
		RandomTestUtil.randomString();

	private static final String _API_SCHEMA_ATTACHMENT_FIELD_ERC =
		RandomTestUtil.randomString();

	private static final String _API_SCHEMA_BOOLEAN_FIELD_ERC =
		RandomTestUtil.randomString();

	private static final String _API_SCHEMA_DATE_FIELD_ERC =
		RandomTestUtil.randomString();

	private static final String _API_SCHEMA_DATE_TIME_FIELD_ERC =
		RandomTestUtil.randomString();

	private static final String _API_SCHEMA_DECIMAL_FIELD_ERC =
		RandomTestUtil.randomString();

	private static final String _API_SCHEMA_INTEGER_FIELD_ERC =
		RandomTestUtil.randomString();

	private static final String _API_SCHEMA_LONG_INTEGER_FIELD_ERC =
		RandomTestUtil.randomString();

	private static final String _API_SCHEMA_LONG_TEXT_FIELD_ERC =
		RandomTestUtil.randomString();

	private static final String _API_SCHEMA_MULTISELECT_PICKLIST_FIELD_ERC =
		RandomTestUtil.randomString();

	private static final String _API_SCHEMA_PICKLIST_FIELD_ERC =
		RandomTestUtil.randomString();

	private static final String _API_SCHEMA_PRECISION_DECIMAL_FIELD_ERC =
		RandomTestUtil.randomString();

	private static final String _API_SCHEMA_RICH_TEXT_FIELD_ERC =
		RandomTestUtil.randomString();

	private static final String _API_SCHEMA_TEXT_FIELD_ERC =
		RandomTestUtil.randomString();

	private static final String _BASE_URL_1 = RandomTestUtil.randomString();

	private static final String _BASE_URL_2 = RandomTestUtil.randomString();

	private static DateFormat _dateFormat;
	private static DateFormat _dateTimeFormat;
	private ListTypeDefinition _listTypeDefinition;

	@Inject
	private ListTypeDefinitionLocalService _listTypeDefinitionLocalService;

	@DeleteAfterTestRun
	private ObjectDefinition _objectDefinition1;

	@DeleteAfterTestRun
	private ObjectDefinition _objectDefinition2;

	@Inject
	private ObjectDefinitionLocalService _objectDefinitionLocalService;

	@Inject
	private ObjectFieldLocalService _objectFieldLocalService;

	@Inject
	private ObjectFieldSettingLocalService _objectFieldSettingLocalService;

	private ObjectRelationship _objectRelationship;

	@Inject
	private ObjectRelationshipLocalService _objectRelationshipLocalService;

	private enum ListTypeValue {

		VALUE1, VALUE2, VALUE3

	}

}