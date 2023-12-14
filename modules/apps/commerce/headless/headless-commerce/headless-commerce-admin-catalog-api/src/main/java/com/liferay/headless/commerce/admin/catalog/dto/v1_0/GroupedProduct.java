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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Zoltán Takács
 * @generated
 */
@Generated("")
@GraphQLName("GroupedProduct")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "GroupedProduct")
public class GroupedProduct implements Serializable {

	public static GroupedProduct toDTO(String json) {
		return ObjectMapperUtil.readValue(GroupedProduct.class, json);
	}

	public static GroupedProduct unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(GroupedProduct.class, json);
	}

	@Schema(example = "exampleERC")
	public String getEntryProductExternalReferenceCode() {
		if (entryProductExternalReferenceCode != null) {
			return entryProductExternalReferenceCode;
		}

		entryProductExternalReferenceCode =
			_entryProductExternalReferenceCodeSupplier.get();

		return entryProductExternalReferenceCode;
	}

	public void setEntryProductExternalReferenceCode(
		String entryProductExternalReferenceCode) {

		this.entryProductExternalReferenceCode =
			entryProductExternalReferenceCode;

		_entryProductExternalReferenceCodeSupplier =
			() -> entryProductExternalReferenceCode;
	}

	@JsonIgnore
	public void setEntryProductExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			entryProductExternalReferenceCodeUnsafeSupplier) {

		entryProductExternalReferenceCode = null;

		_entryProductExternalReferenceCodeSupplier = () -> {
			try {
				return entryProductExternalReferenceCodeUnsafeSupplier.get();
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
	protected String entryProductExternalReferenceCode;

	private Supplier<String> _entryProductExternalReferenceCodeSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "33131")
	public Long getEntryProductId() {
		if (entryProductId != null) {
			return entryProductId;
		}

		entryProductId = _entryProductIdSupplier.get();

		return entryProductId;
	}

	public void setEntryProductId(Long entryProductId) {
		this.entryProductId = entryProductId;

		_entryProductIdSupplier = () -> entryProductId;
	}

	@JsonIgnore
	public void setEntryProductId(
		UnsafeSupplier<Long, Exception> entryProductIdUnsafeSupplier) {

		entryProductId = null;

		_entryProductIdSupplier = () -> {
			try {
				return entryProductIdUnsafeSupplier.get();
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
	protected Long entryProductId;

	private Supplier<Long> _entryProductIdSupplier = () -> null;

	@Schema(
		example = "{en_US=Hand Saw, hr_HR=Product Name HR, hu_HU=Product Name HU}"
	)
	@Valid
	public Map<String, String> getEntryProductName() {
		if (entryProductName != null) {
			return entryProductName;
		}

		entryProductName = _entryProductNameSupplier.get();

		return entryProductName;
	}

	public void setEntryProductName(Map<String, String> entryProductName) {
		this.entryProductName = entryProductName;

		_entryProductNameSupplier = () -> entryProductName;
	}

	@JsonIgnore
	public void setEntryProductName(
		UnsafeSupplier<Map<String, String>, Exception>
			entryProductNameUnsafeSupplier) {

		entryProductName = null;

		_entryProductNameSupplier = () -> {
			try {
				return entryProductNameUnsafeSupplier.get();
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
	protected Map<String, String> entryProductName;

	private Supplier<Map<String, String>> _entryProductNameSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "33130")
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

	@Schema(example = "exampleERC")
	public String getProductExternalReferenceCode() {
		if (productExternalReferenceCode != null) {
			return productExternalReferenceCode;
		}

		productExternalReferenceCode =
			_productExternalReferenceCodeSupplier.get();

		return productExternalReferenceCode;
	}

	public void setProductExternalReferenceCode(
		String productExternalReferenceCode) {

		this.productExternalReferenceCode = productExternalReferenceCode;

		_productExternalReferenceCodeSupplier =
			() -> productExternalReferenceCode;
	}

	@JsonIgnore
	public void setProductExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			productExternalReferenceCodeUnsafeSupplier) {

		productExternalReferenceCode = null;

		_productExternalReferenceCodeSupplier = () -> {
			try {
				return productExternalReferenceCodeUnsafeSupplier.get();
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
	protected String productExternalReferenceCode;

	private Supplier<String> _productExternalReferenceCodeSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "33131")
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long productId;

	private Supplier<Long> _productIdSupplier = () -> null;

	@Schema(
		example = "{en_US=Hand Saw, hr_HR=Product Name HR, hu_HU=Product Name HU}"
	)
	@Valid
	public Map<String, String> getProductName() {
		if (productName != null) {
			return productName;
		}

		productName = _productNameSupplier.get();

		return productName;
	}

	public void setProductName(Map<String, String> productName) {
		this.productName = productName;

		_productNameSupplier = () -> productName;
	}

	@JsonIgnore
	public void setProductName(
		UnsafeSupplier<Map<String, String>, Exception>
			productNameUnsafeSupplier) {

		productName = null;

		_productNameSupplier = () -> {
			try {
				return productNameUnsafeSupplier.get();
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
	protected Map<String, String> productName;

	private Supplier<Map<String, String>> _productNameSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "1")
	public Integer getQuantity() {
		if (quantity != null) {
			return quantity;
		}

		quantity = _quantitySupplier.get();

		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;

		_quantitySupplier = () -> quantity;
	}

	@JsonIgnore
	public void setQuantity(
		UnsafeSupplier<Integer, Exception> quantityUnsafeSupplier) {

		quantity = null;

		_quantitySupplier = () -> {
			try {
				return quantityUnsafeSupplier.get();
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
	protected Integer quantity;

	private Supplier<Integer> _quantitySupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GroupedProduct)) {
			return false;
		}

		GroupedProduct groupedProduct = (GroupedProduct)object;

		return Objects.equals(toString(), groupedProduct.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (entryProductExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"entryProductExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(entryProductExternalReferenceCode));

			sb.append("\"");
		}

		if (entryProductId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"entryProductId\": ");

			sb.append(entryProductId);
		}

		if (entryProductName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"entryProductName\": ");

			sb.append(_toJSON(entryProductName));
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (priority != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priority\": ");

			sb.append(priority);
		}

		if (productExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(productExternalReferenceCode));

			sb.append("\"");
		}

		if (productId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productId\": ");

			sb.append(productId);
		}

		if (productName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productName\": ");

			sb.append(_toJSON(productName));
		}

		if (quantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"quantity\": ");

			sb.append(quantity);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.catalog.dto.v1_0.GroupedProduct",
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