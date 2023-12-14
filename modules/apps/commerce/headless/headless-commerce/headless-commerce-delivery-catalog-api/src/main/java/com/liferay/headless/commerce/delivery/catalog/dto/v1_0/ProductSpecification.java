/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.delivery.catalog.dto.v1_0;

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

import javax.validation.constraints.DecimalMin;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Andrea Sbarra
 * @generated
 */
@Generated("")
@GraphQLName("ProductSpecification")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ProductSpecification")
public class ProductSpecification implements Serializable {

	public static ProductSpecification toDTO(String json) {
		return ObjectMapperUtil.readValue(ProductSpecification.class, json);
	}

	public static ProductSpecification unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			ProductSpecification.class, json);
	}

	@DecimalMin("0")
	@Schema(example = "31130")
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

	@DecimalMin("0")
	@Schema(example = "30129")
	public Long getOptionCategoryId() {
		if (optionCategoryId != null) {
			return optionCategoryId;
		}

		optionCategoryId = _optionCategoryIdSupplier.get();

		return optionCategoryId;
	}

	public void setOptionCategoryId(Long optionCategoryId) {
		this.optionCategoryId = optionCategoryId;

		_optionCategoryIdSupplier = () -> optionCategoryId;
	}

	@JsonIgnore
	public void setOptionCategoryId(
		UnsafeSupplier<Long, Exception> optionCategoryIdUnsafeSupplier) {

		optionCategoryId = null;

		_optionCategoryIdSupplier = () -> {
			try {
				return optionCategoryIdUnsafeSupplier.get();
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
	protected Long optionCategoryId;

	private Supplier<Long> _optionCategoryIdSupplier = () -> null;

	@DecimalMin("0")
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

	@DecimalMin("0")
	@Schema(example = "30129")
	public Long getProductId() {
		if (productId != null) {
			return productId;
		}

		productId = _productIdSupplier.get();

		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;

		_productIdSupplier = () -> productId;
	}

	@JsonIgnore
	public void setProductId(
		UnsafeSupplier<Long, Exception> productIdUnsafeSupplier) {

		productId = null;

		_productIdSupplier = () -> {
			try {
				return productIdUnsafeSupplier.get();
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
	protected Long productId;

	private Supplier<Long> _productIdSupplier = () -> null;

	@Schema
	public String getSpecificationGroupKey() {
		if (specificationGroupKey != null) {
			return specificationGroupKey;
		}

		specificationGroupKey = _specificationGroupKeySupplier.get();

		return specificationGroupKey;
	}

	public void setSpecificationGroupKey(String specificationGroupKey) {
		this.specificationGroupKey = specificationGroupKey;

		_specificationGroupKeySupplier = () -> specificationGroupKey;
	}

	@JsonIgnore
	public void setSpecificationGroupKey(
		UnsafeSupplier<String, Exception> specificationGroupKeyUnsafeSupplier) {

		specificationGroupKey = null;

		_specificationGroupKeySupplier = () -> {
			try {
				return specificationGroupKeyUnsafeSupplier.get();
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
	protected String specificationGroupKey;

	private Supplier<String> _specificationGroupKeySupplier = () -> null;

	@Schema
	public String getSpecificationGroupTitle() {
		if (specificationGroupTitle != null) {
			return specificationGroupTitle;
		}

		specificationGroupTitle = _specificationGroupTitleSupplier.get();

		return specificationGroupTitle;
	}

	public void setSpecificationGroupTitle(String specificationGroupTitle) {
		this.specificationGroupTitle = specificationGroupTitle;

		_specificationGroupTitleSupplier = () -> specificationGroupTitle;
	}

	@JsonIgnore
	public void setSpecificationGroupTitle(
		UnsafeSupplier<String, Exception>
			specificationGroupTitleUnsafeSupplier) {

		specificationGroupTitle = null;

		_specificationGroupTitleSupplier = () -> {
			try {
				return specificationGroupTitleUnsafeSupplier.get();
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
	protected String specificationGroupTitle;

	private Supplier<String> _specificationGroupTitleSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30129")
	public Long getSpecificationId() {
		if (specificationId != null) {
			return specificationId;
		}

		specificationId = _specificationIdSupplier.get();

		return specificationId;
	}

	public void setSpecificationId(Long specificationId) {
		this.specificationId = specificationId;

		_specificationIdSupplier = () -> specificationId;
	}

	@JsonIgnore
	public void setSpecificationId(
		UnsafeSupplier<Long, Exception> specificationIdUnsafeSupplier) {

		specificationId = null;

		_specificationIdSupplier = () -> {
			try {
				return specificationIdUnsafeSupplier.get();
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
	protected Long specificationId;

	private Supplier<Long> _specificationIdSupplier = () -> null;

	@Schema(example = "specification-key")
	public String getSpecificationKey() {
		if (specificationKey != null) {
			return specificationKey;
		}

		specificationKey = _specificationKeySupplier.get();

		return specificationKey;
	}

	public void setSpecificationKey(String specificationKey) {
		this.specificationKey = specificationKey;

		_specificationKeySupplier = () -> specificationKey;
	}

	@JsonIgnore
	public void setSpecificationKey(
		UnsafeSupplier<String, Exception> specificationKeyUnsafeSupplier) {

		specificationKey = null;

		_specificationKeySupplier = () -> {
			try {
				return specificationKeyUnsafeSupplier.get();
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
	protected String specificationKey;

	private Supplier<String> _specificationKeySupplier = () -> null;

	@Schema
	public String getSpecificationTitle() {
		if (specificationTitle != null) {
			return specificationTitle;
		}

		specificationTitle = _specificationTitleSupplier.get();

		return specificationTitle;
	}

	public void setSpecificationTitle(String specificationTitle) {
		this.specificationTitle = specificationTitle;

		_specificationTitleSupplier = () -> specificationTitle;
	}

	@JsonIgnore
	public void setSpecificationTitle(
		UnsafeSupplier<String, Exception> specificationTitleUnsafeSupplier) {

		specificationTitle = null;

		_specificationTitleSupplier = () -> {
			try {
				return specificationTitleUnsafeSupplier.get();
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
	protected String specificationTitle;

	private Supplier<String> _specificationTitleSupplier = () -> null;

	@Schema
	public String getValue() {
		if (value != null) {
			return value;
		}

		value = _valueSupplier.get();

		return value;
	}

	public void setValue(String value) {
		this.value = value;

		_valueSupplier = () -> value;
	}

	@JsonIgnore
	public void setValue(
		UnsafeSupplier<String, Exception> valueUnsafeSupplier) {

		value = null;

		_valueSupplier = () -> {
			try {
				return valueUnsafeSupplier.get();
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
	protected String value;

	private Supplier<String> _valueSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProductSpecification)) {
			return false;
		}

		ProductSpecification productSpecification =
			(ProductSpecification)object;

		return Objects.equals(toString(), productSpecification.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (optionCategoryId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"optionCategoryId\": ");

			sb.append(optionCategoryId);
		}

		if (priority != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priority\": ");

			sb.append(priority);
		}

		if (productId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productId\": ");

			sb.append(productId);
		}

		if (specificationGroupKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"specificationGroupKey\": ");

			sb.append("\"");

			sb.append(_escape(specificationGroupKey));

			sb.append("\"");
		}

		if (specificationGroupTitle != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"specificationGroupTitle\": ");

			sb.append("\"");

			sb.append(_escape(specificationGroupTitle));

			sb.append("\"");
		}

		if (specificationId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"specificationId\": ");

			sb.append(specificationId);
		}

		if (specificationKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"specificationKey\": ");

			sb.append("\"");

			sb.append(_escape(specificationKey));

			sb.append("\"");
		}

		if (specificationTitle != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"specificationTitle\": ");

			sb.append("\"");

			sb.append(_escape(specificationTitle));

			sb.append("\"");
		}

		if (value != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"value\": ");

			sb.append("\"");

			sb.append(_escape(value));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.delivery.catalog.dto.v1_0.ProductSpecification",
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