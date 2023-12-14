/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.delivery.dto.v1_0;

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
@GraphQLName(
	description = "Represents each field in a content structure, backed by a content field.",
	value = "ContentStructureField"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ContentStructureField")
public class ContentStructureField implements Serializable {

	public static ContentStructureField toDTO(String json) {
		return ObjectMapperUtil.readValue(ContentStructureField.class, json);
	}

	public static ContentStructureField unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			ContentStructureField.class, json);
	}

	@Schema(
		description = "The form field's type (e.g., date, geolocation, text, etc.)."
	)
	public String getDataType() {
		if (dataType != null) {
			return dataType;
		}

		dataType = _dataTypeSupplier.get();

		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;

		_dataTypeSupplier = () -> dataType;
	}

	@JsonIgnore
	public void setDataType(
		UnsafeSupplier<String, Exception> dataTypeUnsafeSupplier) {

		dataType = null;

		_dataTypeSupplier = () -> {
			try {
				return dataTypeUnsafeSupplier.get();
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
		description = "The form field's type (e.g., date, geolocation, text, etc.)."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String dataType;

	private Supplier<String> _dataTypeSupplier = () -> null;

	@Schema(
		description = "The form field's input control type (e.g., text, textarea, select field, etc.)."
	)
	public String getInputControl() {
		if (inputControl != null) {
			return inputControl;
		}

		inputControl = _inputControlSupplier.get();

		return inputControl;
	}

	public void setInputControl(String inputControl) {
		this.inputControl = inputControl;

		_inputControlSupplier = () -> inputControl;
	}

	@JsonIgnore
	public void setInputControl(
		UnsafeSupplier<String, Exception> inputControlUnsafeSupplier) {

		inputControl = null;

		_inputControlSupplier = () -> {
			try {
				return inputControlUnsafeSupplier.get();
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
		description = "The form field's input control type (e.g., text, textarea, select field, etc.)."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String inputControl;

	private Supplier<String> _inputControlSupplier = () -> null;

	@Schema(description = "The form field's label.")
	public String getLabel() {
		if (label != null) {
			return label;
		}

		label = _labelSupplier.get();

		return label;
	}

	public void setLabel(String label) {
		this.label = label;

		_labelSupplier = () -> label;
	}

	@JsonIgnore
	public void setLabel(
		UnsafeSupplier<String, Exception> labelUnsafeSupplier) {

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

	@GraphQLField(description = "The form field's label.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String label;

	private Supplier<String> _labelSupplier = () -> null;

	@Schema(description = "The form field's labels.")
	@Valid
	public Map<String, String> getLabel_i18n() {
		if (label_i18n != null) {
			return label_i18n;
		}

		label_i18n = _label_i18nSupplier.get();

		return label_i18n;
	}

	public void setLabel_i18n(Map<String, String> label_i18n) {
		this.label_i18n = label_i18n;

		_label_i18nSupplier = () -> label_i18n;
	}

	@JsonIgnore
	public void setLabel_i18n(
		UnsafeSupplier<Map<String, String>, Exception>
			label_i18nUnsafeSupplier) {

		label_i18n = null;

		_label_i18nSupplier = () -> {
			try {
				return label_i18nUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The form field's labels.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Map<String, String> label_i18n;

	private Supplier<Map<String, String>> _label_i18nSupplier = () -> null;

	@Schema(
		description = "A flag that indicates whether the content is accessible in different languages."
	)
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

	@GraphQLField(
		description = "A flag that indicates whether the content is accessible in different languages."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Boolean localizable;

	private Supplier<Boolean> _localizableSupplier = () -> null;

	@Schema(
		description = "A flag that indicates whether the form field can have several values."
	)
	public Boolean getMultiple() {
		if (multiple != null) {
			return multiple;
		}

		multiple = _multipleSupplier.get();

		return multiple;
	}

	public void setMultiple(Boolean multiple) {
		this.multiple = multiple;

		_multipleSupplier = () -> multiple;
	}

	@JsonIgnore
	public void setMultiple(
		UnsafeSupplier<Boolean, Exception> multipleUnsafeSupplier) {

		multiple = null;

		_multipleSupplier = () -> {
			try {
				return multipleUnsafeSupplier.get();
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
		description = "A flag that indicates whether the form field can have several values."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Boolean multiple;

	private Supplier<Boolean> _multipleSupplier = () -> null;

	@Schema(description = "The form field's name.")
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

	@GraphQLField(description = "The form field's name.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String name;

	private Supplier<String> _nameSupplier = () -> null;

	@Schema(
		description = "The child content structure fields that depend on this form field."
	)
	@Valid
	public ContentStructureField[] getNestedContentStructureFields() {
		if (nestedContentStructureFields != null) {
			return nestedContentStructureFields;
		}

		nestedContentStructureFields =
			_nestedContentStructureFieldsSupplier.get();

		return nestedContentStructureFields;
	}

	public void setNestedContentStructureFields(
		ContentStructureField[] nestedContentStructureFields) {

		this.nestedContentStructureFields = nestedContentStructureFields;

		_nestedContentStructureFieldsSupplier =
			() -> nestedContentStructureFields;
	}

	@JsonIgnore
	public void setNestedContentStructureFields(
		UnsafeSupplier<ContentStructureField[], Exception>
			nestedContentStructureFieldsUnsafeSupplier) {

		nestedContentStructureFields = null;

		_nestedContentStructureFieldsSupplier = () -> {
			try {
				return nestedContentStructureFieldsUnsafeSupplier.get();
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
		description = "The child content structure fields that depend on this form field."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected ContentStructureField[] nestedContentStructureFields;

	private Supplier<ContentStructureField[]>
		_nestedContentStructureFieldsSupplier = () -> null;

	@Schema(description = "The list of different possible values.")
	@Valid
	public Option[] getOptions() {
		if (options != null) {
			return options;
		}

		options = _optionsSupplier.get();

		return options;
	}

	public void setOptions(Option[] options) {
		this.options = options;

		_optionsSupplier = () -> options;
	}

	@JsonIgnore
	public void setOptions(
		UnsafeSupplier<Option[], Exception> optionsUnsafeSupplier) {

		options = null;

		_optionsSupplier = () -> {
			try {
				return optionsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The list of different possible values.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Option[] options;

	private Supplier<Option[]> _optionsSupplier = () -> null;

	@Schema(description = "The form field's default value.")
	public String getPredefinedValue() {
		if (predefinedValue != null) {
			return predefinedValue;
		}

		predefinedValue = _predefinedValueSupplier.get();

		return predefinedValue;
	}

	public void setPredefinedValue(String predefinedValue) {
		this.predefinedValue = predefinedValue;

		_predefinedValueSupplier = () -> predefinedValue;
	}

	@JsonIgnore
	public void setPredefinedValue(
		UnsafeSupplier<String, Exception> predefinedValueUnsafeSupplier) {

		predefinedValue = null;

		_predefinedValueSupplier = () -> {
			try {
				return predefinedValueUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The form field's default value.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String predefinedValue;

	private Supplier<String> _predefinedValueSupplier = () -> null;

	@Schema(description = "The localized form field's default values.")
	@Valid
	public Map<String, String> getPredefinedValue_i18n() {
		if (predefinedValue_i18n != null) {
			return predefinedValue_i18n;
		}

		predefinedValue_i18n = _predefinedValue_i18nSupplier.get();

		return predefinedValue_i18n;
	}

	public void setPredefinedValue_i18n(
		Map<String, String> predefinedValue_i18n) {

		this.predefinedValue_i18n = predefinedValue_i18n;

		_predefinedValue_i18nSupplier = () -> predefinedValue_i18n;
	}

	@JsonIgnore
	public void setPredefinedValue_i18n(
		UnsafeSupplier<Map<String, String>, Exception>
			predefinedValue_i18nUnsafeSupplier) {

		predefinedValue_i18n = null;

		_predefinedValue_i18nSupplier = () -> {
			try {
				return predefinedValue_i18nUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The localized form field's default values.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Map<String, String> predefinedValue_i18n;

	private Supplier<Map<String, String>> _predefinedValue_i18nSupplier =
		() -> null;

	@Schema(
		description = "A flag that indicates whether this content can be rendered (and answered) several times."
	)
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

	@GraphQLField(
		description = "A flag that indicates whether this content can be rendered (and answered) several times."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Boolean repeatable;

	private Supplier<Boolean> _repeatableSupplier = () -> null;

	@Schema(
		description = "A flag that indicates whether this form field is required."
	)
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

	@GraphQLField(
		description = "A flag that indicates whether this form field is required."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Boolean required;

	private Supplier<Boolean> _requiredSupplier = () -> null;

	@Schema(
		description = "A flag that indicates whether the structure's end target should render the field label."
	)
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

	@GraphQLField(
		description = "A flag that indicates whether the structure's end target should render the field label."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Boolean showLabel;

	private Supplier<Boolean> _showLabelSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ContentStructureField)) {
			return false;
		}

		ContentStructureField contentStructureField =
			(ContentStructureField)object;

		return Objects.equals(toString(), contentStructureField.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (dataType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dataType\": ");

			sb.append("\"");

			sb.append(_escape(dataType));

			sb.append("\"");
		}

		if (inputControl != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"inputControl\": ");

			sb.append("\"");

			sb.append(_escape(inputControl));

			sb.append("\"");
		}

		if (label != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"label\": ");

			sb.append("\"");

			sb.append(_escape(label));

			sb.append("\"");
		}

		if (label_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"label_i18n\": ");

			sb.append(_toJSON(label_i18n));
		}

		if (localizable != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"localizable\": ");

			sb.append(localizable);
		}

		if (multiple != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"multiple\": ");

			sb.append(multiple);
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

		if (nestedContentStructureFields != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"nestedContentStructureFields\": ");

			sb.append("[");

			for (int i = 0; i < nestedContentStructureFields.length; i++) {
				sb.append(String.valueOf(nestedContentStructureFields[i]));

				if ((i + 1) < nestedContentStructureFields.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (options != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"options\": ");

			sb.append("[");

			for (int i = 0; i < options.length; i++) {
				sb.append(String.valueOf(options[i]));

				if ((i + 1) < options.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (predefinedValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"predefinedValue\": ");

			sb.append("\"");

			sb.append(_escape(predefinedValue));

			sb.append("\"");
		}

		if (predefinedValue_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"predefinedValue_i18n\": ");

			sb.append(_toJSON(predefinedValue_i18n));
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

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.delivery.dto.v1_0.ContentStructureField",
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