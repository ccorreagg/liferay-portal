/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.admin.rest.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("ObjectField")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ObjectField")
public class ObjectField implements Serializable {

	public static ObjectField toDTO(String json) {
		return ObjectMapperUtil.readValue(ObjectField.class, json);
	}

	public static ObjectField unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(ObjectField.class, json);
	}

	@Schema
	@Valid
	public DBType getDBType() {
		if (DBType != null) {
			return DBType;
		}

		DBType = _DBTypeSupplier.get();

		return DBType;
	}

	@JsonIgnore
	public String getDBTypeAsString() {
		if (DBType == null) {
			return null;
		}

		return DBType.toString();
	}

	public void setDBType(DBType DBType) {
		this.DBType = DBType;

		_DBTypeSupplier = () -> DBType;
	}

	@JsonIgnore
	public void setDBType(
		UnsafeSupplier<DBType, Exception> DBTypeUnsafeSupplier) {

		DBType = null;

		_DBTypeSupplier = () -> {
			try {
				return DBTypeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected DBType DBType;

	private Supplier<DBType> _DBTypeSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, Map<String, String>> getActions() {
		if (actions != null) {
			return actions;
		}

		actions = _actionsSupplier.get();

		return actions;
	}

	public void setActions(Map<String, Map<String, String>> actions) {
		this.actions = actions;

		_actionsSupplier = () -> actions;
	}

	@JsonIgnore
	public void setActions(
		UnsafeSupplier<Map<String, Map<String, String>>, Exception>
			actionsUnsafeSupplier) {

		actions = null;

		_actionsSupplier = () -> {
			try {
				return actionsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Map<String, Map<String, String>> actions;

	private Supplier<Map<String, Map<String, String>>> _actionsSupplier =
		() -> null;

	@Schema
	@Valid
	public BusinessType getBusinessType() {
		if (businessType != null) {
			return businessType;
		}

		businessType = _businessTypeSupplier.get();

		return businessType;
	}

	@JsonIgnore
	public String getBusinessTypeAsString() {
		if (businessType == null) {
			return null;
		}

		return businessType.toString();
	}

	public void setBusinessType(BusinessType businessType) {
		this.businessType = businessType;

		_businessTypeSupplier = () -> businessType;
	}

	@JsonIgnore
	public void setBusinessType(
		UnsafeSupplier<BusinessType, Exception> businessTypeUnsafeSupplier) {

		businessType = null;

		_businessTypeSupplier = () -> {
			try {
				return businessTypeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected BusinessType businessType;

	private Supplier<BusinessType> _businessTypeSupplier = () -> null;

	@Schema(deprecated = true)
	public String getDefaultValue() {
		if (defaultValue != null) {
			return defaultValue;
		}

		defaultValue = _defaultValueSupplier.get();

		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;

		_defaultValueSupplier = () -> defaultValue;
	}

	@JsonIgnore
	public void setDefaultValue(
		UnsafeSupplier<String, Exception> defaultValueUnsafeSupplier) {

		defaultValue = null;

		_defaultValueSupplier = () -> {
			try {
				return defaultValueUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String defaultValue;

	private Supplier<String> _defaultValueSupplier = () -> null;

	@Schema
	public String getExternalReferenceCode() {
		if (externalReferenceCode != null) {
			return externalReferenceCode;
		}

		externalReferenceCode = _externalReferenceCodeSupplier.get();

		return externalReferenceCode;
	}

	public void setExternalReferenceCode(String externalReferenceCode) {
		this.externalReferenceCode = externalReferenceCode;

		_externalReferenceCodeSupplier = () -> externalReferenceCode;
	}

	@JsonIgnore
	public void setExternalReferenceCode(
		UnsafeSupplier<String, Exception> externalReferenceCodeUnsafeSupplier) {

		externalReferenceCode = null;

		_externalReferenceCodeSupplier = () -> {
			try {
				return externalReferenceCodeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String externalReferenceCode;

	private Supplier<String> _externalReferenceCodeSupplier = () -> null;

	@Schema
	public Long getId() {
		if (id != null) {
			return id;
		}

		id = _idSupplier.get();

		return id;
	}

	public void setId(Long id) {
		this.id = id;

		_idSupplier = () -> id;
	}

	@JsonIgnore
	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		id = null;

		_idSupplier = () -> {
			try {
				return idUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema
	public Boolean getIndexed() {
		if (indexed != null) {
			return indexed;
		}

		indexed = _indexedSupplier.get();

		return indexed;
	}

	public void setIndexed(Boolean indexed) {
		this.indexed = indexed;

		_indexedSupplier = () -> indexed;
	}

	@JsonIgnore
	public void setIndexed(
		UnsafeSupplier<Boolean, Exception> indexedUnsafeSupplier) {

		indexed = null;

		_indexedSupplier = () -> {
			try {
				return indexedUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean indexed;

	private Supplier<Boolean> _indexedSupplier = () -> null;

	@Schema
	public Boolean getIndexedAsKeyword() {
		if (indexedAsKeyword != null) {
			return indexedAsKeyword;
		}

		indexedAsKeyword = _indexedAsKeywordSupplier.get();

		return indexedAsKeyword;
	}

	public void setIndexedAsKeyword(Boolean indexedAsKeyword) {
		this.indexedAsKeyword = indexedAsKeyword;

		_indexedAsKeywordSupplier = () -> indexedAsKeyword;
	}

	@JsonIgnore
	public void setIndexedAsKeyword(
		UnsafeSupplier<Boolean, Exception> indexedAsKeywordUnsafeSupplier) {

		indexedAsKeyword = null;

		_indexedAsKeywordSupplier = () -> {
			try {
				return indexedAsKeywordUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean indexedAsKeyword;

	private Supplier<Boolean> _indexedAsKeywordSupplier = () -> null;

	@Schema
	public String getIndexedLanguageId() {
		if (indexedLanguageId != null) {
			return indexedLanguageId;
		}

		indexedLanguageId = _indexedLanguageIdSupplier.get();

		return indexedLanguageId;
	}

	public void setIndexedLanguageId(String indexedLanguageId) {
		this.indexedLanguageId = indexedLanguageId;

		_indexedLanguageIdSupplier = () -> indexedLanguageId;
	}

	@JsonIgnore
	public void setIndexedLanguageId(
		UnsafeSupplier<String, Exception> indexedLanguageIdUnsafeSupplier) {

		indexedLanguageId = null;

		_indexedLanguageIdSupplier = () -> {
			try {
				return indexedLanguageIdUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String indexedLanguageId;

	private Supplier<String> _indexedLanguageIdSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, String> getLabel() {
		if (label != null) {
			return label;
		}

		label = _labelSupplier.get();

		return label;
	}

	public void setLabel(Map<String, String> label) {
		this.label = label;

		_labelSupplier = () -> label;
	}

	@JsonIgnore
	public void setLabel(
		UnsafeSupplier<Map<String, String>, Exception> labelUnsafeSupplier) {

		label = null;

		_labelSupplier = () -> {
			try {
				return labelUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> label;

	private Supplier<Map<String, String>> _labelSupplier = () -> null;

	@Schema
	public String getListTypeDefinitionExternalReferenceCode() {
		if (listTypeDefinitionExternalReferenceCode != null) {
			return listTypeDefinitionExternalReferenceCode;
		}

		listTypeDefinitionExternalReferenceCode =
			_listTypeDefinitionExternalReferenceCodeSupplier.get();

		return listTypeDefinitionExternalReferenceCode;
	}

	public void setListTypeDefinitionExternalReferenceCode(
		String listTypeDefinitionExternalReferenceCode) {

		this.listTypeDefinitionExternalReferenceCode =
			listTypeDefinitionExternalReferenceCode;

		_listTypeDefinitionExternalReferenceCodeSupplier =
			() -> listTypeDefinitionExternalReferenceCode;
	}

	@JsonIgnore
	public void setListTypeDefinitionExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			listTypeDefinitionExternalReferenceCodeUnsafeSupplier) {

		listTypeDefinitionExternalReferenceCode = null;

		_listTypeDefinitionExternalReferenceCodeSupplier = () -> {
			try {
				return listTypeDefinitionExternalReferenceCodeUnsafeSupplier.
					get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String listTypeDefinitionExternalReferenceCode;

	private Supplier<String> _listTypeDefinitionExternalReferenceCodeSupplier =
		() -> null;

	@Schema
	public Long getListTypeDefinitionId() {
		if (listTypeDefinitionId != null) {
			return listTypeDefinitionId;
		}

		listTypeDefinitionId = _listTypeDefinitionIdSupplier.get();

		return listTypeDefinitionId;
	}

	public void setListTypeDefinitionId(Long listTypeDefinitionId) {
		this.listTypeDefinitionId = listTypeDefinitionId;

		_listTypeDefinitionIdSupplier = () -> listTypeDefinitionId;
	}

	@JsonIgnore
	public void setListTypeDefinitionId(
		UnsafeSupplier<Long, Exception> listTypeDefinitionIdUnsafeSupplier) {

		listTypeDefinitionId = null;

		_listTypeDefinitionIdSupplier = () -> {
			try {
				return listTypeDefinitionIdUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long listTypeDefinitionId;

	private Supplier<Long> _listTypeDefinitionIdSupplier = () -> null;

	@Schema
	public Boolean getLocalized() {
		if (localized != null) {
			return localized;
		}

		localized = _localizedSupplier.get();

		return localized;
	}

	public void setLocalized(Boolean localized) {
		this.localized = localized;

		_localizedSupplier = () -> localized;
	}

	@JsonIgnore
	public void setLocalized(
		UnsafeSupplier<Boolean, Exception> localizedUnsafeSupplier) {

		localized = null;

		_localizedSupplier = () -> {
			try {
				return localizedUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean localized;

	private Supplier<Boolean> _localizedSupplier = () -> null;

	@Schema
	public String getName() {
		if (name != null) {
			return name;
		}

		name = _nameSupplier.get();

		return name;
	}

	public void setName(String name) {
		this.name = name;

		_nameSupplier = () -> name;
	}

	@JsonIgnore
	public void setName(UnsafeSupplier<String, Exception> nameUnsafeSupplier) {
		name = null;

		_nameSupplier = () -> {
			try {
				return nameUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String name;

	private Supplier<String> _nameSupplier = () -> null;

	@Schema
	@Valid
	public ObjectFieldSetting[] getObjectFieldSettings() {
		if (objectFieldSettings != null) {
			return objectFieldSettings;
		}

		objectFieldSettings = _objectFieldSettingsSupplier.get();

		return objectFieldSettings;
	}

	public void setObjectFieldSettings(
		ObjectFieldSetting[] objectFieldSettings) {

		this.objectFieldSettings = objectFieldSettings;

		_objectFieldSettingsSupplier = () -> objectFieldSettings;
	}

	@JsonIgnore
	public void setObjectFieldSettings(
		UnsafeSupplier<ObjectFieldSetting[], Exception>
			objectFieldSettingsUnsafeSupplier) {

		objectFieldSettings = null;

		_objectFieldSettingsSupplier = () -> {
			try {
				return objectFieldSettingsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected ObjectFieldSetting[] objectFieldSettings;

	private Supplier<ObjectFieldSetting[]> _objectFieldSettingsSupplier =
		() -> null;

	@Schema
	@Valid
	public ReadOnly getReadOnly() {
		if (readOnly != null) {
			return readOnly;
		}

		readOnly = _readOnlySupplier.get();

		return readOnly;
	}

	@JsonIgnore
	public String getReadOnlyAsString() {
		if (readOnly == null) {
			return null;
		}

		return readOnly.toString();
	}

	public void setReadOnly(ReadOnly readOnly) {
		this.readOnly = readOnly;

		_readOnlySupplier = () -> readOnly;
	}

	@JsonIgnore
	public void setReadOnly(
		UnsafeSupplier<ReadOnly, Exception> readOnlyUnsafeSupplier) {

		readOnly = null;

		_readOnlySupplier = () -> {
			try {
				return readOnlyUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected ReadOnly readOnly;

	private Supplier<ReadOnly> _readOnlySupplier = () -> null;

	@Schema
	public String getReadOnlyConditionExpression() {
		if (readOnlyConditionExpression != null) {
			return readOnlyConditionExpression;
		}

		readOnlyConditionExpression =
			_readOnlyConditionExpressionSupplier.get();

		return readOnlyConditionExpression;
	}

	public void setReadOnlyConditionExpression(
		String readOnlyConditionExpression) {

		this.readOnlyConditionExpression = readOnlyConditionExpression;

		_readOnlyConditionExpressionSupplier =
			() -> readOnlyConditionExpression;
	}

	@JsonIgnore
	public void setReadOnlyConditionExpression(
		UnsafeSupplier<String, Exception>
			readOnlyConditionExpressionUnsafeSupplier) {

		readOnlyConditionExpression = null;

		_readOnlyConditionExpressionSupplier = () -> {
			try {
				return readOnlyConditionExpressionUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String readOnlyConditionExpression;

	private Supplier<String> _readOnlyConditionExpressionSupplier = () -> null;

	@Schema
	@Valid
	public RelationshipType getRelationshipType() {
		if (relationshipType != null) {
			return relationshipType;
		}

		relationshipType = _relationshipTypeSupplier.get();

		return relationshipType;
	}

	@JsonIgnore
	public String getRelationshipTypeAsString() {
		if (relationshipType == null) {
			return null;
		}

		return relationshipType.toString();
	}

	public void setRelationshipType(RelationshipType relationshipType) {
		this.relationshipType = relationshipType;

		_relationshipTypeSupplier = () -> relationshipType;
	}

	@JsonIgnore
	public void setRelationshipType(
		UnsafeSupplier<RelationshipType, Exception>
			relationshipTypeUnsafeSupplier) {

		relationshipType = null;

		_relationshipTypeSupplier = () -> {
			try {
				return relationshipTypeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected RelationshipType relationshipType;

	private Supplier<RelationshipType> _relationshipTypeSupplier = () -> null;

	@Schema
	public Boolean getRequired() {
		if (required != null) {
			return required;
		}

		required = _requiredSupplier.get();

		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;

		_requiredSupplier = () -> required;
	}

	@JsonIgnore
	public void setRequired(
		UnsafeSupplier<Boolean, Exception> requiredUnsafeSupplier) {

		required = null;

		_requiredSupplier = () -> {
			try {
				return requiredUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean required;

	private Supplier<Boolean> _requiredSupplier = () -> null;

	@Schema
	public Boolean getState() {
		if (state != null) {
			return state;
		}

		state = _stateSupplier.get();

		return state;
	}

	public void setState(Boolean state) {
		this.state = state;

		_stateSupplier = () -> state;
	}

	@JsonIgnore
	public void setState(
		UnsafeSupplier<Boolean, Exception> stateUnsafeSupplier) {

		state = null;

		_stateSupplier = () -> {
			try {
				return stateUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean state;

	private Supplier<Boolean> _stateSupplier = () -> null;

	@Schema
	public Boolean getSystem() {
		if (system != null) {
			return system;
		}

		system = _systemSupplier.get();

		return system;
	}

	public void setSystem(Boolean system) {
		this.system = system;

		_systemSupplier = () -> system;
	}

	@JsonIgnore
	public void setSystem(
		UnsafeSupplier<Boolean, Exception> systemUnsafeSupplier) {

		system = null;

		_systemSupplier = () -> {
			try {
				return systemUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean system;

	private Supplier<Boolean> _systemSupplier = () -> null;

	@Schema(deprecated = true)
	@Valid
	public Type getType() {
		if (type != null) {
			return type;
		}

		type = _typeSupplier.get();

		return type;
	}

	@JsonIgnore
	public String getTypeAsString() {
		if (type == null) {
			return null;
		}

		return type.toString();
	}

	public void setType(Type type) {
		this.type = type;

		_typeSupplier = () -> type;
	}

	@JsonIgnore
	public void setType(UnsafeSupplier<Type, Exception> typeUnsafeSupplier) {
		type = null;

		_typeSupplier = () -> {
			try {
				return typeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Type type;

	private Supplier<Type> _typeSupplier = () -> null;

	@Schema
	public Boolean getUnique() {
		if (unique != null) {
			return unique;
		}

		unique = _uniqueSupplier.get();

		return unique;
	}

	public void setUnique(Boolean unique) {
		this.unique = unique;

		_uniqueSupplier = () -> unique;
	}

	@JsonIgnore
	public void setUnique(
		UnsafeSupplier<Boolean, Exception> uniqueUnsafeSupplier) {

		unique = null;

		_uniqueSupplier = () -> {
			try {
				return uniqueUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Boolean unique;

	private Supplier<Boolean> _uniqueSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ObjectField)) {
			return false;
		}

		ObjectField objectField = (ObjectField)object;

		return Objects.equals(toString(), objectField.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (DBType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"DBType\": ");

			sb.append("\"");

			sb.append(DBType);

			sb.append("\"");
		}

		if (actions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actions\": ");

			sb.append(_toJSON(actions));
		}

		if (businessType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"businessType\": ");

			sb.append("\"");

			sb.append(businessType);

			sb.append("\"");
		}

		if (defaultValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"defaultValue\": ");

			sb.append("\"");

			sb.append(_escape(defaultValue));

			sb.append("\"");
		}

		if (externalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"externalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(externalReferenceCode));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (indexed != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"indexed\": ");

			sb.append(indexed);
		}

		if (indexedAsKeyword != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"indexedAsKeyword\": ");

			sb.append(indexedAsKeyword);
		}

		if (indexedLanguageId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"indexedLanguageId\": ");

			sb.append("\"");

			sb.append(_escape(indexedLanguageId));

			sb.append("\"");
		}

		if (label != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"label\": ");

			sb.append(_toJSON(label));
		}

		if (listTypeDefinitionExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"listTypeDefinitionExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(listTypeDefinitionExternalReferenceCode));

			sb.append("\"");
		}

		if (listTypeDefinitionId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"listTypeDefinitionId\": ");

			sb.append(listTypeDefinitionId);
		}

		if (localized != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"localized\": ");

			sb.append(localized);
		}

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(name));

			sb.append("\"");
		}

		if (objectFieldSettings != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectFieldSettings\": ");

			sb.append("[");

			for (int i = 0; i < objectFieldSettings.length; i++) {
				sb.append(String.valueOf(objectFieldSettings[i]));

				if ((i + 1) < objectFieldSettings.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (readOnly != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"readOnly\": ");

			sb.append("\"");

			sb.append(readOnly);

			sb.append("\"");
		}

		if (readOnlyConditionExpression != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"readOnlyConditionExpression\": ");

			sb.append("\"");

			sb.append(_escape(readOnlyConditionExpression));

			sb.append("\"");
		}

		if (relationshipType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"relationshipType\": ");

			sb.append("\"");

			sb.append(relationshipType);

			sb.append("\"");
		}

		if (required != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"required\": ");

			sb.append(required);
		}

		if (state != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"state\": ");

			sb.append(state);
		}

		if (system != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"system\": ");

			sb.append(system);
		}

		if (type != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"type\": ");

			sb.append("\"");

			sb.append(type);

			sb.append("\"");
		}

		if (unique != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"unique\": ");

			sb.append(unique);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.object.admin.rest.dto.v1_0.ObjectField",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("BusinessType")
	public static enum BusinessType {

		AGGREGATION("Aggregation"), ATTACHMENT("Attachment"),
		AUTO_INCREMENT("AutoIncrement"), BOOLEAN("Boolean"), DATE("Date"),
		DATE_TIME("DateTime"), DECIMAL("Decimal"), ENCRYPTED("Encrypted"),
		FORMULA("Formula"), INTEGER("Integer"), LONG_INTEGER("LongInteger"),
		LONG_TEXT("LongText"), MULTISELECT_PICKLIST("MultiselectPicklist"),
		PICKLIST("Picklist"), PRECISION_DECIMAL("PrecisionDecimal"),
		RELATIONSHIP("Relationship"), RICH_TEXT("RichText"), TEXT("Text");

		@JsonCreator
		public static BusinessType create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (BusinessType businessType : values()) {
				if (Objects.equals(businessType.getValue(), value)) {
					return businessType;
				}
			}

			throw new IllegalArgumentException("Invalid enum value: " + value);
		}

		@JsonValue
		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private BusinessType(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("DBType")
	public static enum DBType {

		BIG_DECIMAL("BigDecimal"), BOOLEAN("Boolean"), CLOB("Clob"),
		DATE("Date"), DATE_TIME("DateTime"), DOUBLE("Double"),
		INTEGER("Integer"), LONG("Long"), STRING("String");

		@JsonCreator
		public static DBType create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (DBType dbType : values()) {
				if (Objects.equals(dbType.getValue(), value)) {
					return dbType;
				}
			}

			throw new IllegalArgumentException("Invalid enum value: " + value);
		}

		@JsonValue
		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private DBType(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("ReadOnly")
	public static enum ReadOnly {

		CONDITIONAL("conditional"), FALSE("false"), TRUE("true");

		@JsonCreator
		public static ReadOnly create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (ReadOnly readOnly : values()) {
				if (Objects.equals(readOnly.getValue(), value)) {
					return readOnly;
				}
			}

			throw new IllegalArgumentException("Invalid enum value: " + value);
		}

		@JsonValue
		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private ReadOnly(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("RelationshipType")
	public static enum RelationshipType {

		ONE_TO_MANY("oneToMany"), ONE_TO_ONE("oneToOne");

		@JsonCreator
		public static RelationshipType create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (RelationshipType relationshipType : values()) {
				if (Objects.equals(relationshipType.getValue(), value)) {
					return relationshipType;
				}
			}

			throw new IllegalArgumentException("Invalid enum value: " + value);
		}

		@JsonValue
		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private RelationshipType(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("Type")
	public static enum Type {

		BIG_DECIMAL("BigDecimal"), BOOLEAN("Boolean"), CLOB("Clob"),
		DATE("Date"), DATE_TIME("DateTime"), DOUBLE("Double"),
		INTEGER("Integer"), LONG("Long"), STRING("String");

		@JsonCreator
		public static Type create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (Type type : values()) {
				if (Objects.equals(type.getValue(), value)) {
					return type;
				}
			}

			throw new IllegalArgumentException("Invalid enum value: " + value);
		}

		@JsonValue
		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private Type(String value) {
			_value = value;
		}

		private final String _value;

	}

	private static String _escape(Object object) {
		return StringUtil.replace(
			String.valueOf(object), _JSON_ESCAPE_STRINGS[0],
			_JSON_ESCAPE_STRINGS[1]);
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(_escape(entry.getKey()));
			sb.append("\": ");

			Object value = entry.getValue();

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(value));
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static final String[][] _JSON_ESCAPE_STRINGS = {
		{"\\", "\"", "\b", "\f", "\n", "\r", "\t"},
		{"\\\\", "\\\"", "\\b", "\\f", "\\n", "\\r", "\\t"}
	};

	private Map<String, Serializable> _extendedProperties;

}