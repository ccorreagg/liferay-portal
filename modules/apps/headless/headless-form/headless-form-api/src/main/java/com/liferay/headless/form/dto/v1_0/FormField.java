/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.form.dto.v1_0;

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
	description = "https://www.schema.org/FormField", value = "FormField"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "FormField")
public class FormField implements Serializable {

	public static FormField toDTO(String json) {
		return ObjectMapperUtil.readValue(FormField.class, json);
	}

	public static FormField unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(FormField.class, json);
	}

	@Schema
	public Boolean getAutocomplete() {
		if (autocomplete != null) {
			return autocomplete;
		}

		autocomplete = _autocompleteSupplier.get();

		return autocomplete;
	}

	public void setAutocomplete(Boolean autocomplete) {
		this.autocomplete = autocomplete;

		_autocompleteSupplier = () -> autocomplete;
	}

	@JsonIgnore
	public void setAutocomplete(
		UnsafeSupplier<Boolean, Exception> autocompleteUnsafeSupplier) {

		autocomplete = null;

		_autocompleteSupplier = () -> {
			try {
				return autocompleteUnsafeSupplier.get();
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
	protected Boolean autocomplete;

	private Supplier<Boolean> _autocompleteSupplier = () -> null;

	@Schema
	public String getDataSourceType() {
		if (dataSourceType != null) {
			return dataSourceType;
		}

		dataSourceType = _dataSourceTypeSupplier.get();

		return dataSourceType;
	}

	public void setDataSourceType(String dataSourceType) {
		this.dataSourceType = dataSourceType;

		_dataSourceTypeSupplier = () -> dataSourceType;
	}

	@JsonIgnore
	public void setDataSourceType(
		UnsafeSupplier<String, Exception> dataSourceTypeUnsafeSupplier) {

		dataSourceType = null;

		_dataSourceTypeSupplier = () -> {
			try {
				return dataSourceTypeUnsafeSupplier.get();
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
	protected String dataSourceType;

	private Supplier<String> _dataSourceTypeSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String dataType;

	private Supplier<String> _dataTypeSupplier = () -> null;

	@Schema
	public String getDisplayStyle() {
		if (displayStyle != null) {
			return displayStyle;
		}

		displayStyle = _displayStyleSupplier.get();

		return displayStyle;
	}

	public void setDisplayStyle(String displayStyle) {
		this.displayStyle = displayStyle;

		_displayStyleSupplier = () -> displayStyle;
	}

	@JsonIgnore
	public void setDisplayStyle(
		UnsafeSupplier<String, Exception> displayStyleUnsafeSupplier) {

		displayStyle = null;

		_displayStyleSupplier = () -> {
			try {
				return displayStyleUnsafeSupplier.get();
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
	protected String displayStyle;

	private Supplier<String> _displayStyleSupplier = () -> null;

	@Schema
	@Valid
	public FormFieldOption[] getFormFieldOptions() {
		if (formFieldOptions != null) {
			return formFieldOptions;
		}

		formFieldOptions = _formFieldOptionsSupplier.get();

		return formFieldOptions;
	}

	public void setFormFieldOptions(FormFieldOption[] formFieldOptions) {
		this.formFieldOptions = formFieldOptions;

		_formFieldOptionsSupplier = () -> formFieldOptions;
	}

	@JsonIgnore
	public void setFormFieldOptions(
		UnsafeSupplier<FormFieldOption[], Exception>
			formFieldOptionsUnsafeSupplier) {

		formFieldOptions = null;

		_formFieldOptionsSupplier = () -> {
			try {
				return formFieldOptionsUnsafeSupplier.get();
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
	protected FormFieldOption[] formFieldOptions;

	private Supplier<FormFieldOption[]> _formFieldOptionsSupplier = () -> null;

	@Schema
	@Valid
	public Grid getGrid() {
		if (grid != null) {
			return grid;
		}

		grid = _gridSupplier.get();

		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;

		_gridSupplier = () -> grid;
	}

	@JsonIgnore
	public void setGrid(UnsafeSupplier<Grid, Exception> gridUnsafeSupplier) {
		grid = null;

		_gridSupplier = () -> {
			try {
				return gridUnsafeSupplier.get();
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
	protected Grid grid;

	private Supplier<Grid> _gridSupplier = () -> null;

	@Schema
	public Boolean getHasFormRules() {
		if (hasFormRules != null) {
			return hasFormRules;
		}

		hasFormRules = _hasFormRulesSupplier.get();

		return hasFormRules;
	}

	public void setHasFormRules(Boolean hasFormRules) {
		this.hasFormRules = hasFormRules;

		_hasFormRulesSupplier = () -> hasFormRules;
	}

	@JsonIgnore
	public void setHasFormRules(
		UnsafeSupplier<Boolean, Exception> hasFormRulesUnsafeSupplier) {

		hasFormRules = null;

		_hasFormRulesSupplier = () -> {
			try {
				return hasFormRulesUnsafeSupplier.get();
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
	protected Boolean hasFormRules;

	private Supplier<Boolean> _hasFormRulesSupplier = () -> null;

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
	public Boolean getImmutable() {
		if (immutable != null) {
			return immutable;
		}

		immutable = _immutableSupplier.get();

		return immutable;
	}

	public void setImmutable(Boolean immutable) {
		this.immutable = immutable;

		_immutableSupplier = () -> immutable;
	}

	@JsonIgnore
	public void setImmutable(
		UnsafeSupplier<Boolean, Exception> immutableUnsafeSupplier) {

		immutable = null;

		_immutableSupplier = () -> {
			try {
				return immutableUnsafeSupplier.get();
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
	protected Boolean immutable;

	private Supplier<Boolean> _immutableSupplier = () -> null;

	@Schema
	public Boolean getInline() {
		if (inline != null) {
			return inline;
		}

		inline = _inlineSupplier.get();

		return inline;
	}

	public void setInline(Boolean inline) {
		this.inline = inline;

		_inlineSupplier = () -> inline;
	}

	@JsonIgnore
	public void setInline(
		UnsafeSupplier<Boolean, Exception> inlineUnsafeSupplier) {

		inline = null;

		_inlineSupplier = () -> {
			try {
				return inlineUnsafeSupplier.get();
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
	protected Boolean inline;

	private Supplier<Boolean> _inlineSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String inputControl;

	private Supplier<String> _inputControlSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String label;

	private Supplier<String> _labelSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> label_i18n;

	private Supplier<Map<String, String>> _label_i18nSupplier = () -> null;

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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean multiple;

	private Supplier<Boolean> _multipleSupplier = () -> null;

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
	public String getPlaceholder() {
		if (placeholder != null) {
			return placeholder;
		}

		placeholder = _placeholderSupplier.get();

		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;

		_placeholderSupplier = () -> placeholder;
	}

	@JsonIgnore
	public void setPlaceholder(
		UnsafeSupplier<String, Exception> placeholderUnsafeSupplier) {

		placeholder = null;

		_placeholderSupplier = () -> {
			try {
				return placeholderUnsafeSupplier.get();
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
	protected String placeholder;

	private Supplier<String> _placeholderSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String predefinedValue;

	private Supplier<String> _predefinedValueSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> predefinedValue_i18n;

	private Supplier<Map<String, String>> _predefinedValue_i18nSupplier =
		() -> null;

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
	public Boolean getShowAsSwitcher() {
		if (showAsSwitcher != null) {
			return showAsSwitcher;
		}

		showAsSwitcher = _showAsSwitcherSupplier.get();

		return showAsSwitcher;
	}

	public void setShowAsSwitcher(Boolean showAsSwitcher) {
		this.showAsSwitcher = showAsSwitcher;

		_showAsSwitcherSupplier = () -> showAsSwitcher;
	}

	@JsonIgnore
	public void setShowAsSwitcher(
		UnsafeSupplier<Boolean, Exception> showAsSwitcherUnsafeSupplier) {

		showAsSwitcher = null;

		_showAsSwitcherSupplier = () -> {
			try {
				return showAsSwitcherUnsafeSupplier.get();
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
	protected Boolean showAsSwitcher;

	private Supplier<Boolean> _showAsSwitcherSupplier = () -> null;

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
	public String getStyle() {
		if (style != null) {
			return style;
		}

		style = _styleSupplier.get();

		return style;
	}

	public void setStyle(String style) {
		this.style = style;

		_styleSupplier = () -> style;
	}

	@JsonIgnore
	public void setStyle(
		UnsafeSupplier<String, Exception> styleUnsafeSupplier) {

		style = null;

		_styleSupplier = () -> {
			try {
				return styleUnsafeSupplier.get();
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
	protected String style;

	private Supplier<String> _styleSupplier = () -> null;

	@Schema
	public String getText() {
		if (text != null) {
			return text;
		}

		text = _textSupplier.get();

		return text;
	}

	public void setText(String text) {
		this.text = text;

		_textSupplier = () -> text;
	}

	@JsonIgnore
	public void setText(UnsafeSupplier<String, Exception> textUnsafeSupplier) {
		text = null;

		_textSupplier = () -> {
			try {
				return textUnsafeSupplier.get();
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
	protected String text;

	private Supplier<String> _textSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, String> getText_i18n() {
		if (text_i18n != null) {
			return text_i18n;
		}

		text_i18n = _text_i18nSupplier.get();

		return text_i18n;
	}

	public void setText_i18n(Map<String, String> text_i18n) {
		this.text_i18n = text_i18n;

		_text_i18nSupplier = () -> text_i18n;
	}

	@JsonIgnore
	public void setText_i18n(
		UnsafeSupplier<Map<String, String>, Exception>
			text_i18nUnsafeSupplier) {

		text_i18n = null;

		_text_i18nSupplier = () -> {
			try {
				return text_i18nUnsafeSupplier.get();
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
	protected Map<String, String> text_i18n;

	private Supplier<Map<String, String>> _text_i18nSupplier = () -> null;

	@Schema
	public String getTooltip() {
		if (tooltip != null) {
			return tooltip;
		}

		tooltip = _tooltipSupplier.get();

		return tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;

		_tooltipSupplier = () -> tooltip;
	}

	@JsonIgnore
	public void setTooltip(
		UnsafeSupplier<String, Exception> tooltipUnsafeSupplier) {

		tooltip = null;

		_tooltipSupplier = () -> {
			try {
				return tooltipUnsafeSupplier.get();
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
	protected String tooltip;

	private Supplier<String> _tooltipSupplier = () -> null;

	@Schema(description = "https://www.schema.org/FormFieldValidation")
	@Valid
	public Validation getValidation() {
		if (validation != null) {
			return validation;
		}

		validation = _validationSupplier.get();

		return validation;
	}

	public void setValidation(Validation validation) {
		this.validation = validation;

		_validationSupplier = () -> validation;
	}

	@JsonIgnore
	public void setValidation(
		UnsafeSupplier<Validation, Exception> validationUnsafeSupplier) {

		validation = null;

		_validationSupplier = () -> {
			try {
				return validationUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "https://www.schema.org/FormFieldValidation")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Validation validation;

	private Supplier<Validation> _validationSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FormField)) {
			return false;
		}

		FormField formField = (FormField)object;

		return Objects.equals(toString(), formField.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (autocomplete != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"autocomplete\": ");

			sb.append(autocomplete);
		}

		if (dataSourceType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dataSourceType\": ");

			sb.append("\"");

			sb.append(_escape(dataSourceType));

			sb.append("\"");
		}

		if (dataType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dataType\": ");

			sb.append("\"");

			sb.append(_escape(dataType));

			sb.append("\"");
		}

		if (displayStyle != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"displayStyle\": ");

			sb.append("\"");

			sb.append(_escape(displayStyle));

			sb.append("\"");
		}

		if (formFieldOptions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"formFieldOptions\": ");

			sb.append("[");

			for (int i = 0; i < formFieldOptions.length; i++) {
				sb.append(String.valueOf(formFieldOptions[i]));

				if ((i + 1) < formFieldOptions.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (grid != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"grid\": ");

			sb.append(String.valueOf(grid));
		}

		if (hasFormRules != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"hasFormRules\": ");

			sb.append(hasFormRules);
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (immutable != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"immutable\": ");

			sb.append(immutable);
		}

		if (inline != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"inline\": ");

			sb.append(inline);
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

		if (placeholder != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"placeholder\": ");

			sb.append("\"");

			sb.append(_escape(placeholder));

			sb.append("\"");
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

		if (showAsSwitcher != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"showAsSwitcher\": ");

			sb.append(showAsSwitcher);
		}

		if (showLabel != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"showLabel\": ");

			sb.append(showLabel);
		}

		if (style != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"style\": ");

			sb.append("\"");

			sb.append(_escape(style));

			sb.append("\"");
		}

		if (text != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"text\": ");

			sb.append("\"");

			sb.append(_escape(text));

			sb.append("\"");
		}

		if (text_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"text_i18n\": ");

			sb.append(_toJSON(text_i18n));
		}

		if (tooltip != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tooltip\": ");

			sb.append("\"");

			sb.append(_escape(tooltip));

			sb.append("\"");
		}

		if (validation != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"validation\": ");

			sb.append(String.valueOf(validation));
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.form.dto.v1_0.FormField",
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