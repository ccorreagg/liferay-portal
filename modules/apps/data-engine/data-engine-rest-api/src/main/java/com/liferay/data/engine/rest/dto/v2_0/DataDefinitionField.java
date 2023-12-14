/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.data.engine.rest.dto.v2_0;

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
 * @author Jeyvison Nascimento
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "Represents the value of each field in data definition.",
	value = "DataDefinitionField"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "DataDefinitionField")
public class DataDefinitionField implements Serializable {

	public static DataDefinitionField toDTO(String json) {
		return ObjectMapperUtil.readValue(DataDefinitionField.class, json);
	}

	public static DataDefinitionField unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			DataDefinitionField.class, json);
	}

	@Schema
	@Valid
	public Map<String, Object> getCustomProperties() {
		if (customProperties != null) {
			return customProperties;
		}

		customProperties = _customPropertiesSupplier.get();

		return customProperties;
	}

	public void setCustomProperties(Map<String, Object> customProperties) {
		this.customProperties = customProperties;

		_customPropertiesSupplier = () -> customProperties;
	}

	@JsonIgnore
	public void setCustomProperties(
		UnsafeSupplier<Map<String, Object>, Exception>
			customPropertiesUnsafeSupplier) {

		customProperties = null;

		_customPropertiesSupplier = () -> {
			try {
				return customPropertiesUnsafeSupplier.get();
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
	protected Map<String, Object> customProperties;

	private Supplier<Map<String, Object>> _customPropertiesSupplier =
		() -> null;

	@Schema
	@Valid
	public Map<String, Object> getDefaultValue() {
		if (defaultValue != null) {
			return defaultValue;
		}

		defaultValue = _defaultValueSupplier.get();

		return defaultValue;
	}

	public void setDefaultValue(Map<String, Object> defaultValue) {
		this.defaultValue = defaultValue;

		_defaultValueSupplier = () -> defaultValue;
	}

	@JsonIgnore
	public void setDefaultValue(
		UnsafeSupplier<Map<String, Object>, Exception>
			defaultValueUnsafeSupplier) {

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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, Object> defaultValue;

	private Supplier<Map<String, Object>> _defaultValueSupplier = () -> null;

	@Schema
	public String getFieldType() {
		if (fieldType != null) {
			return fieldType;
		}

		fieldType = _fieldTypeSupplier.get();

		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;

		_fieldTypeSupplier = () -> fieldType;
	}

	@JsonIgnore
	public void setFieldType(
		UnsafeSupplier<String, Exception> fieldTypeUnsafeSupplier) {

		fieldType = null;

		_fieldTypeSupplier = () -> {
			try {
				return fieldTypeUnsafeSupplier.get();
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
	protected String fieldType;

	private Supplier<String> _fieldTypeSupplier = () -> null;

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
	public IndexType getIndexType() {
		if (indexType != null) {
			return indexType;
		}

		indexType = _indexTypeSupplier.get();

		return indexType;
	}

	@JsonIgnore
	public String getIndexTypeAsString() {
		if (indexType == null) {
			return null;
		}

		return indexType.toString();
	}

	public void setIndexType(IndexType indexType) {
		this.indexType = indexType;

		_indexTypeSupplier = () -> indexType;
	}

	@JsonIgnore
	public void setIndexType(
		UnsafeSupplier<IndexType, Exception> indexTypeUnsafeSupplier) {

		indexType = null;

		_indexTypeSupplier = () -> {
			try {
				return indexTypeUnsafeSupplier.get();
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
	protected IndexType indexType;

	private Supplier<IndexType> _indexTypeSupplier = () -> null;

	@Schema
	public Boolean getIndexable() {
		if (indexable != null) {
			return indexable;
		}

		indexable = _indexableSupplier.get();

		return indexable;
	}

	public void setIndexable(Boolean indexable) {
		this.indexable = indexable;

		_indexableSupplier = () -> indexable;
	}

	@JsonIgnore
	public void setIndexable(
		UnsafeSupplier<Boolean, Exception> indexableUnsafeSupplier) {

		indexable = null;

		_indexableSupplier = () -> {
			try {
				return indexableUnsafeSupplier.get();
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
	protected Boolean indexable;

	private Supplier<Boolean> _indexableSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, Object> getLabel() {
		if (label != null) {
			return label;
		}

		label = _labelSupplier.get();

		return label;
	}

	public void setLabel(Map<String, Object> label) {
		this.label = label;

		_labelSupplier = () -> label;
	}

	@JsonIgnore
	public void setLabel(
		UnsafeSupplier<Map<String, Object>, Exception> labelUnsafeSupplier) {

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
	protected Map<String, Object> label;

	private Supplier<Map<String, Object>> _labelSupplier = () -> null;

	@Schema
	public Boolean getLocalizable() {
		if (localizable != null) {
			return localizable;
		}

		localizable = _localizableSupplier.get();

		return localizable;
	}

	public void setLocalizable(Boolean localizable) {
		this.localizable = localizable;

		_localizableSupplier = () -> localizable;
	}

	@JsonIgnore
	public void setLocalizable(
		UnsafeSupplier<Boolean, Exception> localizableUnsafeSupplier) {

		localizable = null;

		_localizableSupplier = () -> {
			try {
				return localizableUnsafeSupplier.get();
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
	protected Boolean localizable;

	private Supplier<Boolean> _localizableSupplier = () -> null;

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

	@Schema(
		description = "A list of child data definition fields that depend on this resource."
	)
	@Valid
	public DataDefinitionField[] getNestedDataDefinitionFields() {
		if (nestedDataDefinitionFields != null) {
			return nestedDataDefinitionFields;
		}

		nestedDataDefinitionFields = _nestedDataDefinitionFieldsSupplier.get();

		return nestedDataDefinitionFields;
	}

	public void setNestedDataDefinitionFields(
		DataDefinitionField[] nestedDataDefinitionFields) {

		this.nestedDataDefinitionFields = nestedDataDefinitionFields;

		_nestedDataDefinitionFieldsSupplier = () -> nestedDataDefinitionFields;
	}

	@JsonIgnore
	public void setNestedDataDefinitionFields(
		UnsafeSupplier<DataDefinitionField[], Exception>
			nestedDataDefinitionFieldsUnsafeSupplier) {

		nestedDataDefinitionFields = null;

		_nestedDataDefinitionFieldsSupplier = () -> {
			try {
				return nestedDataDefinitionFieldsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(
		description = "A list of child data definition fields that depend on this resource."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected DataDefinitionField[] nestedDataDefinitionFields;

	private Supplier<DataDefinitionField[]>
		_nestedDataDefinitionFieldsSupplier = () -> null;

	@Schema
	public Boolean getReadOnly() {
		if (readOnly != null) {
			return readOnly;
		}

		readOnly = _readOnlySupplier.get();

		return readOnly;
	}

	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;

		_readOnlySupplier = () -> readOnly;
	}

	@JsonIgnore
	public void setReadOnly(
		UnsafeSupplier<Boolean, Exception> readOnlyUnsafeSupplier) {

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
	protected Boolean readOnly;

	private Supplier<Boolean> _readOnlySupplier = () -> null;

	@Schema
	public Boolean getRepeatable() {
		if (repeatable != null) {
			return repeatable;
		}

		repeatable = _repeatableSupplier.get();

		return repeatable;
	}

	public void setRepeatable(Boolean repeatable) {
		this.repeatable = repeatable;

		_repeatableSupplier = () -> repeatable;
	}

	@JsonIgnore
	public void setRepeatable(
		UnsafeSupplier<Boolean, Exception> repeatableUnsafeSupplier) {

		repeatable = null;

		_repeatableSupplier = () -> {
			try {
				return repeatableUnsafeSupplier.get();
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
	protected Boolean repeatable;

	private Supplier<Boolean> _repeatableSupplier = () -> null;

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
	public Boolean getShowLabel() {
		if (showLabel != null) {
			return showLabel;
		}

		showLabel = _showLabelSupplier.get();

		return showLabel;
	}

	public void setShowLabel(Boolean showLabel) {
		this.showLabel = showLabel;

		_showLabelSupplier = () -> showLabel;
	}

	@JsonIgnore
	public void setShowLabel(
		UnsafeSupplier<Boolean, Exception> showLabelUnsafeSupplier) {

		showLabel = null;

		_showLabelSupplier = () -> {
			try {
				return showLabelUnsafeSupplier.get();
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
	protected Boolean showLabel;

	private Supplier<Boolean> _showLabelSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, Object> getTip() {
		if (tip != null) {
			return tip;
		}

		tip = _tipSupplier.get();

		return tip;
	}

	public void setTip(Map<String, Object> tip) {
		this.tip = tip;

		_tipSupplier = () -> tip;
	}

	@JsonIgnore
	public void setTip(
		UnsafeSupplier<Map<String, Object>, Exception> tipUnsafeSupplier) {

		tip = null;

		_tipSupplier = () -> {
			try {
				return tipUnsafeSupplier.get();
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
	protected Map<String, Object> tip;

	private Supplier<Map<String, Object>> _tipSupplier = () -> null;

	@Schema
	public Boolean getVisible() {
		if (visible != null) {
			return visible;
		}

		visible = _visibleSupplier.get();

		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;

		_visibleSupplier = () -> visible;
	}

	@JsonIgnore
	public void setVisible(
		UnsafeSupplier<Boolean, Exception> visibleUnsafeSupplier) {

		visible = null;

		_visibleSupplier = () -> {
			try {
				return visibleUnsafeSupplier.get();
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
	protected Boolean visible;

	private Supplier<Boolean> _visibleSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DataDefinitionField)) {
			return false;
		}

		DataDefinitionField dataDefinitionField = (DataDefinitionField)object;

		return Objects.equals(toString(), dataDefinitionField.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (customProperties != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"customProperties\": ");

			sb.append(_toJSON(customProperties));
		}

		if (defaultValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"defaultValue\": ");

			sb.append(_toJSON(defaultValue));
		}

		if (fieldType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fieldType\": ");

			sb.append("\"");

			sb.append(_escape(fieldType));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (indexType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"indexType\": ");

			sb.append("\"");

			sb.append(indexType);

			sb.append("\"");
		}

		if (indexable != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"indexable\": ");

			sb.append(indexable);
		}

		if (label != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"label\": ");

			sb.append(_toJSON(label));
		}

		if (localizable != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"localizable\": ");

			sb.append(localizable);
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

		if (nestedDataDefinitionFields != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"nestedDataDefinitionFields\": ");

			sb.append("[");

			for (int i = 0; i < nestedDataDefinitionFields.length; i++) {
				sb.append(String.valueOf(nestedDataDefinitionFields[i]));

				if ((i + 1) < nestedDataDefinitionFields.length) {
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

			sb.append(readOnly);
		}

		if (repeatable != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"repeatable\": ");

			sb.append(repeatable);
		}

		if (required != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"required\": ");

			sb.append(required);
		}

		if (showLabel != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"showLabel\": ");

			sb.append(showLabel);
		}

		if (tip != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tip\": ");

			sb.append(_toJSON(tip));
		}

		if (visible != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"visible\": ");

			sb.append(visible);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.data.engine.rest.dto.v2_0.DataDefinitionField",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("IndexType")
	public static enum IndexType {

		ALL("all"), KEYWORD("keyword"), NONE("none"), TEXT("text");

		@JsonCreator
		public static IndexType create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (IndexType indexType : values()) {
				if (Objects.equals(indexType.getValue(), value)) {
					return indexType;
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

		private IndexType(String value) {
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