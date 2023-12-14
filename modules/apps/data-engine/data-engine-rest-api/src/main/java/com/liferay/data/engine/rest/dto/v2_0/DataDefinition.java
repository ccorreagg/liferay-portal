/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.data.engine.rest.dto.v2_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Jeyvison Nascimento
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "https://www.schema.org/DataDefinition",
	value = "DataDefinition"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "DataDefinition")
public class DataDefinition implements Serializable {

	public static DataDefinition toDTO(String json) {
		return ObjectMapperUtil.readValue(DataDefinition.class, json);
	}

	public static DataDefinition unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(DataDefinition.class, json);
	}

	@Schema
	public String[] getAvailableLanguageIds() {
		if (availableLanguageIds != null) {
			return availableLanguageIds;
		}

		availableLanguageIds = _availableLanguageIdsSupplier.get();

		return availableLanguageIds;
	}

	public void setAvailableLanguageIds(String[] availableLanguageIds) {
		this.availableLanguageIds = availableLanguageIds;

		_availableLanguageIdsSupplier = () -> availableLanguageIds;
	}

	@JsonIgnore
	public void setAvailableLanguageIds(
		UnsafeSupplier<String[], Exception>
			availableLanguageIdsUnsafeSupplier) {

		availableLanguageIds = null;

		_availableLanguageIdsSupplier = () -> {
			try {
				return availableLanguageIdsUnsafeSupplier.get();
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
	protected String[] availableLanguageIds;

	private Supplier<String[]> _availableLanguageIdsSupplier = () -> null;

	@Schema
	public String getContentType() {
		if (contentType != null) {
			return contentType;
		}

		contentType = _contentTypeSupplier.get();

		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;

		_contentTypeSupplier = () -> contentType;
	}

	@JsonIgnore
	public void setContentType(
		UnsafeSupplier<String, Exception> contentTypeUnsafeSupplier) {

		contentType = null;

		_contentTypeSupplier = () -> {
			try {
				return contentTypeUnsafeSupplier.get();
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
	protected String contentType;

	private Supplier<String> _contentTypeSupplier = () -> null;

	@Schema
	@Valid
	public DataDefinitionField[] getDataDefinitionFields() {
		if (dataDefinitionFields != null) {
			return dataDefinitionFields;
		}

		dataDefinitionFields = _dataDefinitionFieldsSupplier.get();

		return dataDefinitionFields;
	}

	public void setDataDefinitionFields(
		DataDefinitionField[] dataDefinitionFields) {

		this.dataDefinitionFields = dataDefinitionFields;

		_dataDefinitionFieldsSupplier = () -> dataDefinitionFields;
	}

	@JsonIgnore
	public void setDataDefinitionFields(
		UnsafeSupplier<DataDefinitionField[], Exception>
			dataDefinitionFieldsUnsafeSupplier) {

		dataDefinitionFields = null;

		_dataDefinitionFieldsSupplier = () -> {
			try {
				return dataDefinitionFieldsUnsafeSupplier.get();
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
	protected DataDefinitionField[] dataDefinitionFields;

	private Supplier<DataDefinitionField[]> _dataDefinitionFieldsSupplier =
		() -> null;

	@Schema
	public String getDataDefinitionKey() {
		if (dataDefinitionKey != null) {
			return dataDefinitionKey;
		}

		dataDefinitionKey = _dataDefinitionKeySupplier.get();

		return dataDefinitionKey;
	}

	public void setDataDefinitionKey(String dataDefinitionKey) {
		this.dataDefinitionKey = dataDefinitionKey;

		_dataDefinitionKeySupplier = () -> dataDefinitionKey;
	}

	@JsonIgnore
	public void setDataDefinitionKey(
		UnsafeSupplier<String, Exception> dataDefinitionKeyUnsafeSupplier) {

		dataDefinitionKey = null;

		_dataDefinitionKeySupplier = () -> {
			try {
				return dataDefinitionKeyUnsafeSupplier.get();
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
	protected String dataDefinitionKey;

	private Supplier<String> _dataDefinitionKeySupplier = () -> null;

	@Schema
	@Valid
	public DataRule[] getDataRules() {
		if (dataRules != null) {
			return dataRules;
		}

		dataRules = _dataRulesSupplier.get();

		return dataRules;
	}

	public void setDataRules(DataRule[] dataRules) {
		this.dataRules = dataRules;

		_dataRulesSupplier = () -> dataRules;
	}

	@JsonIgnore
	public void setDataRules(
		UnsafeSupplier<DataRule[], Exception> dataRulesUnsafeSupplier) {

		dataRules = null;

		_dataRulesSupplier = () -> {
			try {
				return dataRulesUnsafeSupplier.get();
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
	protected DataRule[] dataRules;

	private Supplier<DataRule[]> _dataRulesSupplier = () -> null;

	@Schema
	public Date getDateCreated() {
		if (dateCreated != null) {
			return dateCreated;
		}

		dateCreated = _dateCreatedSupplier.get();

		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;

		_dateCreatedSupplier = () -> dateCreated;
	}

	@JsonIgnore
	public void setDateCreated(
		UnsafeSupplier<Date, Exception> dateCreatedUnsafeSupplier) {

		dateCreated = null;

		_dateCreatedSupplier = () -> {
			try {
				return dateCreatedUnsafeSupplier.get();
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
	protected Date dateCreated;

	private Supplier<Date> _dateCreatedSupplier = () -> null;

	@Schema
	public Date getDateModified() {
		if (dateModified != null) {
			return dateModified;
		}

		dateModified = _dateModifiedSupplier.get();

		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;

		_dateModifiedSupplier = () -> dateModified;
	}

	@JsonIgnore
	public void setDateModified(
		UnsafeSupplier<Date, Exception> dateModifiedUnsafeSupplier) {

		dateModified = null;

		_dateModifiedSupplier = () -> {
			try {
				return dateModifiedUnsafeSupplier.get();
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
	protected Date dateModified;

	private Supplier<Date> _dateModifiedSupplier = () -> null;

	@Schema
	@Valid
	public DataLayout getDefaultDataLayout() {
		if (defaultDataLayout != null) {
			return defaultDataLayout;
		}

		defaultDataLayout = _defaultDataLayoutSupplier.get();

		return defaultDataLayout;
	}

	public void setDefaultDataLayout(DataLayout defaultDataLayout) {
		this.defaultDataLayout = defaultDataLayout;

		_defaultDataLayoutSupplier = () -> defaultDataLayout;
	}

	@JsonIgnore
	public void setDefaultDataLayout(
		UnsafeSupplier<DataLayout, Exception> defaultDataLayoutUnsafeSupplier) {

		defaultDataLayout = null;

		_defaultDataLayoutSupplier = () -> {
			try {
				return defaultDataLayoutUnsafeSupplier.get();
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
	protected DataLayout defaultDataLayout;

	private Supplier<DataLayout> _defaultDataLayoutSupplier = () -> null;

	@Schema
	public String getDefaultLanguageId() {
		if (defaultLanguageId != null) {
			return defaultLanguageId;
		}

		defaultLanguageId = _defaultLanguageIdSupplier.get();

		return defaultLanguageId;
	}

	public void setDefaultLanguageId(String defaultLanguageId) {
		this.defaultLanguageId = defaultLanguageId;

		_defaultLanguageIdSupplier = () -> defaultLanguageId;
	}

	@JsonIgnore
	public void setDefaultLanguageId(
		UnsafeSupplier<String, Exception> defaultLanguageIdUnsafeSupplier) {

		defaultLanguageId = null;

		_defaultLanguageIdSupplier = () -> {
			try {
				return defaultLanguageIdUnsafeSupplier.get();
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
	protected String defaultLanguageId;

	private Supplier<String> _defaultLanguageIdSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, Object> getDescription() {
		if (description != null) {
			return description;
		}

		description = _descriptionSupplier.get();

		return description;
	}

	public void setDescription(Map<String, Object> description) {
		this.description = description;

		_descriptionSupplier = () -> description;
	}

	@JsonIgnore
	public void setDescription(
		UnsafeSupplier<Map<String, Object>, Exception>
			descriptionUnsafeSupplier) {

		description = null;

		_descriptionSupplier = () -> {
			try {
				return descriptionUnsafeSupplier.get();
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
	protected Map<String, Object> description;

	private Supplier<Map<String, Object>> _descriptionSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, Object> getName() {
		if (name != null) {
			return name;
		}

		name = _nameSupplier.get();

		return name;
	}

	public void setName(Map<String, Object> name) {
		this.name = name;

		_nameSupplier = () -> name;
	}

	@JsonIgnore
	public void setName(
		UnsafeSupplier<Map<String, Object>, Exception> nameUnsafeSupplier) {

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
	protected Map<String, Object> name;

	private Supplier<Map<String, Object>> _nameSupplier = () -> null;

	@Schema
	public Long getSiteId() {
		if (siteId != null) {
			return siteId;
		}

		siteId = _siteIdSupplier.get();

		return siteId;
	}

	public void setSiteId(Long siteId) {
		this.siteId = siteId;

		_siteIdSupplier = () -> siteId;
	}

	@JsonIgnore
	public void setSiteId(
		UnsafeSupplier<Long, Exception> siteIdUnsafeSupplier) {

		siteId = null;

		_siteIdSupplier = () -> {
			try {
				return siteIdUnsafeSupplier.get();
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
	protected Long siteId;

	private Supplier<Long> _siteIdSupplier = () -> null;

	@Schema
	public String getStorageType() {
		if (storageType != null) {
			return storageType;
		}

		storageType = _storageTypeSupplier.get();

		return storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;

		_storageTypeSupplier = () -> storageType;
	}

	@JsonIgnore
	public void setStorageType(
		UnsafeSupplier<String, Exception> storageTypeUnsafeSupplier) {

		storageType = null;

		_storageTypeSupplier = () -> {
			try {
				return storageTypeUnsafeSupplier.get();
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
	protected String storageType;

	private Supplier<String> _storageTypeSupplier = () -> null;

	@Schema
	public Long getUserId() {
		if (userId != null) {
			return userId;
		}

		userId = _userIdSupplier.get();

		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;

		_userIdSupplier = () -> userId;
	}

	@JsonIgnore
	public void setUserId(
		UnsafeSupplier<Long, Exception> userIdUnsafeSupplier) {

		userId = null;

		_userIdSupplier = () -> {
			try {
				return userIdUnsafeSupplier.get();
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
	protected Long userId;

	private Supplier<Long> _userIdSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DataDefinition)) {
			return false;
		}

		DataDefinition dataDefinition = (DataDefinition)object;

		return Objects.equals(toString(), dataDefinition.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (availableLanguageIds != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"availableLanguageIds\": ");

			sb.append("[");

			for (int i = 0; i < availableLanguageIds.length; i++) {
				sb.append("\"");

				sb.append(_escape(availableLanguageIds[i]));

				sb.append("\"");

				if ((i + 1) < availableLanguageIds.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (contentType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"contentType\": ");

			sb.append("\"");

			sb.append(_escape(contentType));

			sb.append("\"");
		}

		if (dataDefinitionFields != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dataDefinitionFields\": ");

			sb.append("[");

			for (int i = 0; i < dataDefinitionFields.length; i++) {
				sb.append(String.valueOf(dataDefinitionFields[i]));

				if ((i + 1) < dataDefinitionFields.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (dataDefinitionKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dataDefinitionKey\": ");

			sb.append("\"");

			sb.append(_escape(dataDefinitionKey));

			sb.append("\"");
		}

		if (dataRules != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dataRules\": ");

			sb.append("[");

			for (int i = 0; i < dataRules.length; i++) {
				sb.append(String.valueOf(dataRules[i]));

				if ((i + 1) < dataRules.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (dateCreated != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateCreated\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dateCreated));

			sb.append("\"");
		}

		if (dateModified != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateModified\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dateModified));

			sb.append("\"");
		}

		if (defaultDataLayout != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"defaultDataLayout\": ");

			sb.append(String.valueOf(defaultDataLayout));
		}

		if (defaultLanguageId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"defaultLanguageId\": ");

			sb.append("\"");

			sb.append(_escape(defaultLanguageId));

			sb.append("\"");
		}

		if (description != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append(_toJSON(description));
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append(_toJSON(name));
		}

		if (siteId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siteId\": ");

			sb.append(siteId);
		}

		if (storageType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"storageType\": ");

			sb.append("\"");

			sb.append(_escape(storageType));

			sb.append("\"");
		}

		if (userId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userId\": ");

			sb.append(userId);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.data.engine.rest.dto.v2_0.DataDefinition",
		name = "x-class-name"
	)
	public String xClassName;

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