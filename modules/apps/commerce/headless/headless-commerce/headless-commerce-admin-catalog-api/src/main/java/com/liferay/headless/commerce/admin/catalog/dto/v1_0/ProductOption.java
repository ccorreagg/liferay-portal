/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.catalog.dto.v1_0;

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
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Zoltán Takács
 * @generated
 */
@Generated("")
@GraphQLName("ProductOption")
@JsonFilter("Liferay.Vulcan")
@Schema(requiredProperties = {"fieldType", "key", "name", "optionId"})
@XmlRootElement(name = "ProductOption")
public class ProductOption implements Serializable {

	public static ProductOption toDTO(String json) {
		return ObjectMapperUtil.readValue(ProductOption.class, json);
	}

	public static ProductOption unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(ProductOption.class, json);
	}

	@Schema
	public Long getCatalogId() {
		if (catalogId != null) {
			return catalogId;
		}

		catalogId = _catalogIdSupplier.get();

		return catalogId;
	}

	public void setCatalogId(Long catalogId) {
		this.catalogId = catalogId;

		_catalogIdSupplier = () -> catalogId;
	}

	@JsonIgnore
	public void setCatalogId(
		UnsafeSupplier<Long, Exception> catalogIdUnsafeSupplier) {

		catalogId = null;

		_catalogIdSupplier = () -> {
			try {
				return catalogIdUnsafeSupplier.get();
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
	protected Long catalogId;

	private Supplier<Long> _catalogIdSupplier = () -> null;

	@Schema
	@Valid
	public CustomField[] getCustomFields() {
		if (customFields != null) {
			return customFields;
		}

		customFields = _customFieldsSupplier.get();

		return customFields;
	}

	public void setCustomFields(CustomField[] customFields) {
		this.customFields = customFields;

		_customFieldsSupplier = () -> customFields;
	}

	@JsonIgnore
	public void setCustomFields(
		UnsafeSupplier<CustomField[], Exception> customFieldsUnsafeSupplier) {

		customFields = null;

		_customFieldsSupplier = () -> {
			try {
				return customFieldsUnsafeSupplier.get();
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
	protected CustomField[] customFields;

	private Supplier<CustomField[]> _customFieldsSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getDefinedExternally() {
		if (definedExternally != null) {
			return definedExternally;
		}

		definedExternally = _definedExternallySupplier.get();

		return definedExternally;
	}

	public void setDefinedExternally(Boolean definedExternally) {
		this.definedExternally = definedExternally;

		_definedExternallySupplier = () -> definedExternally;
	}

	@JsonIgnore
	public void setDefinedExternally(
		UnsafeSupplier<Boolean, Exception> definedExternallyUnsafeSupplier) {

		definedExternally = null;

		_definedExternallySupplier = () -> {
			try {
				return definedExternallyUnsafeSupplier.get();
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
	protected Boolean definedExternally;

	private Supplier<Boolean> _definedExternallySupplier = () -> null;

	@Schema(
		example = "{hu_HU=Description HU, hr_HR=Description HR, en_US=Description}"
	)
	@Valid
	public Map<String, String> getDescription() {
		if (description != null) {
			return description;
		}

		description = _descriptionSupplier.get();

		return description;
	}

	public void setDescription(Map<String, String> description) {
		this.description = description;

		_descriptionSupplier = () -> description;
	}

	@JsonIgnore
	public void setDescription(
		UnsafeSupplier<Map<String, String>, Exception>
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
	protected Map<String, String> description;

	private Supplier<Map<String, String>> _descriptionSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getFacetable() {
		if (facetable != null) {
			return facetable;
		}

		facetable = _facetableSupplier.get();

		return facetable;
	}

	public void setFacetable(Boolean facetable) {
		this.facetable = facetable;

		_facetableSupplier = () -> facetable;
	}

	@JsonIgnore
	public void setFacetable(
		UnsafeSupplier<Boolean, Exception> facetableUnsafeSupplier) {

		facetable = null;

		_facetableSupplier = () -> {
			try {
				return facetableUnsafeSupplier.get();
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
	protected Boolean facetable;

	private Supplier<Boolean> _facetableSupplier = () -> null;

	@Schema(
		example = "checkbox, checkbox_multiple, date, numeric, radio, select"
	)
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
	@NotEmpty
	protected String fieldType;

	private Supplier<String> _fieldTypeSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
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
	public String getInfoItemServiceKey() {
		if (infoItemServiceKey != null) {
			return infoItemServiceKey;
		}

		infoItemServiceKey = _infoItemServiceKeySupplier.get();

		return infoItemServiceKey;
	}

	public void setInfoItemServiceKey(String infoItemServiceKey) {
		this.infoItemServiceKey = infoItemServiceKey;

		_infoItemServiceKeySupplier = () -> infoItemServiceKey;
	}

	@JsonIgnore
	public void setInfoItemServiceKey(
		UnsafeSupplier<String, Exception> infoItemServiceKeyUnsafeSupplier) {

		infoItemServiceKey = null;

		_infoItemServiceKeySupplier = () -> {
			try {
				return infoItemServiceKeyUnsafeSupplier.get();
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
	protected String infoItemServiceKey;

	private Supplier<String> _infoItemServiceKeySupplier = () -> null;

	@Schema(example = "color")
	public String getKey() {
		if (key != null) {
			return key;
		}

		key = _keySupplier.get();

		return key;
	}

	public void setKey(String key) {
		this.key = key;

		_keySupplier = () -> key;
	}

	@JsonIgnore
	public void setKey(UnsafeSupplier<String, Exception> keyUnsafeSupplier) {
		key = null;

		_keySupplier = () -> {
			try {
				return keyUnsafeSupplier.get();
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
	@NotEmpty
	protected String key;

	private Supplier<String> _keySupplier = () -> null;

	@Schema(example = "{en_US=Color, hr_HR=Color HR, hu_HU=Color HU}")
	@Valid
	public Map<String, String> getName() {
		if (name != null) {
			return name;
		}

		name = _nameSupplier.get();

		return name;
	}

	public void setName(Map<String, String> name) {
		this.name = name;

		_nameSupplier = () -> name;
	}

	@JsonIgnore
	public void setName(
		UnsafeSupplier<Map<String, String>, Exception> nameUnsafeSupplier) {

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
	@NotNull
	protected Map<String, String> name;

	private Supplier<Map<String, String>> _nameSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30080")
	public Long getOptionId() {
		if (optionId != null) {
			return optionId;
		}

		optionId = _optionIdSupplier.get();

		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;

		_optionIdSupplier = () -> optionId;
	}

	@JsonIgnore
	public void setOptionId(
		UnsafeSupplier<Long, Exception> optionIdUnsafeSupplier) {

		optionId = null;

		_optionIdSupplier = () -> {
			try {
				return optionIdUnsafeSupplier.get();
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
	@NotNull
	protected Long optionId;

	private Supplier<Long> _optionIdSupplier = () -> null;

	@Schema(example = "dynamic, static")
	public String getPriceType() {
		if (priceType != null) {
			return priceType;
		}

		priceType = _priceTypeSupplier.get();

		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;

		_priceTypeSupplier = () -> priceType;
	}

	@JsonIgnore
	public void setPriceType(
		UnsafeSupplier<String, Exception> priceTypeUnsafeSupplier) {

		priceType = null;

		_priceTypeSupplier = () -> {
			try {
				return priceTypeUnsafeSupplier.get();
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
	protected String priceType;

	private Supplier<String> _priceTypeSupplier = () -> null;

	@Schema(example = "1.2")
	public Double getPriority() {
		if (priority != null) {
			return priority;
		}

		priority = _prioritySupplier.get();

		return priority;
	}

	public void setPriority(Double priority) {
		this.priority = priority;

		_prioritySupplier = () -> priority;
	}

	@JsonIgnore
	public void setPriority(
		UnsafeSupplier<Double, Exception> priorityUnsafeSupplier) {

		priority = null;

		_prioritySupplier = () -> {
			try {
				return priorityUnsafeSupplier.get();
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
	protected Double priority;

	private Supplier<Double> _prioritySupplier = () -> null;

	@Schema
	@Valid
	public ProductOptionValue[] getProductOptionValues() {
		if (productOptionValues != null) {
			return productOptionValues;
		}

		productOptionValues = _productOptionValuesSupplier.get();

		return productOptionValues;
	}

	public void setProductOptionValues(
		ProductOptionValue[] productOptionValues) {

		this.productOptionValues = productOptionValues;

		_productOptionValuesSupplier = () -> productOptionValues;
	}

	@JsonIgnore
	public void setProductOptionValues(
		UnsafeSupplier<ProductOptionValue[], Exception>
			productOptionValuesUnsafeSupplier) {

		productOptionValues = null;

		_productOptionValuesSupplier = () -> {
			try {
				return productOptionValuesUnsafeSupplier.get();
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
	protected ProductOptionValue[] productOptionValues;

	private Supplier<ProductOptionValue[]> _productOptionValuesSupplier =
		() -> null;

	@Schema(example = "true")
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

	@Schema(example = "true")
	public Boolean getSkuContributor() {
		if (skuContributor != null) {
			return skuContributor;
		}

		skuContributor = _skuContributorSupplier.get();

		return skuContributor;
	}

	public void setSkuContributor(Boolean skuContributor) {
		this.skuContributor = skuContributor;

		_skuContributorSupplier = () -> skuContributor;
	}

	@JsonIgnore
	public void setSkuContributor(
		UnsafeSupplier<Boolean, Exception> skuContributorUnsafeSupplier) {

		skuContributor = null;

		_skuContributorSupplier = () -> {
			try {
				return skuContributorUnsafeSupplier.get();
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
	protected Boolean skuContributor;

	private Supplier<Boolean> _skuContributorSupplier = () -> null;

	@Schema(example = "22.50")
	public String getTypeSettings() {
		if (typeSettings != null) {
			return typeSettings;
		}

		typeSettings = _typeSettingsSupplier.get();

		return typeSettings;
	}

	public void setTypeSettings(String typeSettings) {
		this.typeSettings = typeSettings;

		_typeSettingsSupplier = () -> typeSettings;
	}

	@JsonIgnore
	public void setTypeSettings(
		UnsafeSupplier<String, Exception> typeSettingsUnsafeSupplier) {

		typeSettings = null;

		_typeSettingsSupplier = () -> {
			try {
				return typeSettingsUnsafeSupplier.get();
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
	protected String typeSettings;

	private Supplier<String> _typeSettingsSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProductOption)) {
			return false;
		}

		ProductOption productOption = (ProductOption)object;

		return Objects.equals(toString(), productOption.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (catalogId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"catalogId\": ");

			sb.append(catalogId);
		}

		if (customFields != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"customFields\": ");

			sb.append("[");

			for (int i = 0; i < customFields.length; i++) {
				sb.append(String.valueOf(customFields[i]));

				if ((i + 1) < customFields.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (definedExternally != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"definedExternally\": ");

			sb.append(definedExternally);
		}

		if (description != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append(_toJSON(description));
		}

		if (facetable != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"facetable\": ");

			sb.append(facetable);
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

		if (infoItemServiceKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"infoItemServiceKey\": ");

			sb.append("\"");

			sb.append(_escape(infoItemServiceKey));

			sb.append("\"");
		}

		if (key != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"key\": ");

			sb.append("\"");

			sb.append(_escape(key));

			sb.append("\"");
		}

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append(_toJSON(name));
		}

		if (optionId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"optionId\": ");

			sb.append(optionId);
		}

		if (priceType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceType\": ");

			sb.append("\"");

			sb.append(_escape(priceType));

			sb.append("\"");
		}

		if (priority != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priority\": ");

			sb.append(priority);
		}

		if (productOptionValues != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productOptionValues\": ");

			sb.append("[");

			for (int i = 0; i < productOptionValues.length; i++) {
				sb.append(String.valueOf(productOptionValues[i]));

				if ((i + 1) < productOptionValues.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (required != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"required\": ");

			sb.append(required);
		}

		if (skuContributor != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuContributor\": ");

			sb.append(skuContributor);
		}

		if (typeSettings != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"typeSettings\": ");

			sb.append("\"");

			sb.append(_escape(typeSettings));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.catalog.dto.v1_0.ProductOption",
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