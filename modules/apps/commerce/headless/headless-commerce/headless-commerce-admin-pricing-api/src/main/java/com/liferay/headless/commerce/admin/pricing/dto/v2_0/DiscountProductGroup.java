/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.pricing.dto.v2_0;

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
import javax.validation.constraints.NotNull;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Zoltán Takács
 * @generated
 */
@Generated("")
@GraphQLName("DiscountProductGroup")
@JsonFilter("Liferay.Vulcan")
@Schema(requiredProperties = {"productGroupId"})
@XmlRootElement(name = "DiscountProductGroup")
public class DiscountProductGroup implements Serializable {

	public static DiscountProductGroup toDTO(String json) {
		return ObjectMapperUtil.readValue(DiscountProductGroup.class, json);
	}

	public static DiscountProductGroup unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			DiscountProductGroup.class, json);
	}

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

	@Schema(example = "DAB-34098-789-N")
	public String getDiscountExternalReferenceCode() {
		if (discountExternalReferenceCode != null) {
			return discountExternalReferenceCode;
		}

		discountExternalReferenceCode =
			_discountExternalReferenceCodeSupplier.get();

		return discountExternalReferenceCode;
	}

	public void setDiscountExternalReferenceCode(
		String discountExternalReferenceCode) {

		this.discountExternalReferenceCode = discountExternalReferenceCode;

		_discountExternalReferenceCodeSupplier =
			() -> discountExternalReferenceCode;
	}

	@JsonIgnore
	public void setDiscountExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			discountExternalReferenceCodeUnsafeSupplier) {

		discountExternalReferenceCode = null;

		_discountExternalReferenceCodeSupplier = () -> {
			try {
				return discountExternalReferenceCodeUnsafeSupplier.get();
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
	protected String discountExternalReferenceCode;

	private Supplier<String> _discountExternalReferenceCodeSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "30324")
	public Long getDiscountId() {
		if (discountId != null) {
			return discountId;
		}

		discountId = _discountIdSupplier.get();

		return discountId;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;

		_discountIdSupplier = () -> discountId;
	}

	@JsonIgnore
	public void setDiscountId(
		UnsafeSupplier<Long, Exception> discountIdUnsafeSupplier) {

		discountId = null;

		_discountIdSupplier = () -> {
			try {
				return discountIdUnsafeSupplier.get();
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
	protected Long discountId;

	private Supplier<Long> _discountIdSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30643")
	public Long getDiscountProductGroupId() {
		if (discountProductGroupId != null) {
			return discountProductGroupId;
		}

		discountProductGroupId = _discountProductGroupIdSupplier.get();

		return discountProductGroupId;
	}

	public void setDiscountProductGroupId(Long discountProductGroupId) {
		this.discountProductGroupId = discountProductGroupId;

		_discountProductGroupIdSupplier = () -> discountProductGroupId;
	}

	@JsonIgnore
	public void setDiscountProductGroupId(
		UnsafeSupplier<Long, Exception> discountProductGroupIdUnsafeSupplier) {

		discountProductGroupId = null;

		_discountProductGroupIdSupplier = () -> {
			try {
				return discountProductGroupIdUnsafeSupplier.get();
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
	protected Long discountProductGroupId;

	private Supplier<Long> _discountProductGroupIdSupplier = () -> null;

	@Schema
	@Valid
	public ProductGroup getProductGroup() {
		if (productGroup != null) {
			return productGroup;
		}

		productGroup = _productGroupSupplier.get();

		return productGroup;
	}

	public void setProductGroup(ProductGroup productGroup) {
		this.productGroup = productGroup;

		_productGroupSupplier = () -> productGroup;
	}

	@JsonIgnore
	public void setProductGroup(
		UnsafeSupplier<ProductGroup, Exception> productGroupUnsafeSupplier) {

		productGroup = null;

		_productGroupSupplier = () -> {
			try {
				return productGroupUnsafeSupplier.get();
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
	protected ProductGroup productGroup;

	private Supplier<ProductGroup> _productGroupSupplier = () -> null;

	@Schema(example = "PAB-34098-789-N")
	public String getProductGroupExternalReferenceCode() {
		if (productGroupExternalReferenceCode != null) {
			return productGroupExternalReferenceCode;
		}

		productGroupExternalReferenceCode =
			_productGroupExternalReferenceCodeSupplier.get();

		return productGroupExternalReferenceCode;
	}

	public void setProductGroupExternalReferenceCode(
		String productGroupExternalReferenceCode) {

		this.productGroupExternalReferenceCode =
			productGroupExternalReferenceCode;

		_productGroupExternalReferenceCodeSupplier =
			() -> productGroupExternalReferenceCode;
	}

	@JsonIgnore
	public void setProductGroupExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			productGroupExternalReferenceCodeUnsafeSupplier) {

		productGroupExternalReferenceCode = null;

		_productGroupExternalReferenceCodeSupplier = () -> {
			try {
				return productGroupExternalReferenceCodeUnsafeSupplier.get();
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
	protected String productGroupExternalReferenceCode;

	private Supplier<String> _productGroupExternalReferenceCodeSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
	public Long getProductGroupId() {
		if (productGroupId != null) {
			return productGroupId;
		}

		productGroupId = _productGroupIdSupplier.get();

		return productGroupId;
	}

	public void setProductGroupId(Long productGroupId) {
		this.productGroupId = productGroupId;

		_productGroupIdSupplier = () -> productGroupId;
	}

	@JsonIgnore
	public void setProductGroupId(
		UnsafeSupplier<Long, Exception> productGroupIdUnsafeSupplier) {

		productGroupId = null;

		_productGroupIdSupplier = () -> {
			try {
				return productGroupIdUnsafeSupplier.get();
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
	protected Long productGroupId;

	private Supplier<Long> _productGroupIdSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DiscountProductGroup)) {
			return false;
		}

		DiscountProductGroup discountProductGroup =
			(DiscountProductGroup)object;

		return Objects.equals(toString(), discountProductGroup.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (actions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actions\": ");

			sb.append(_toJSON(actions));
		}

		if (discountExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(discountExternalReferenceCode));

			sb.append("\"");
		}

		if (discountId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountId\": ");

			sb.append(discountId);
		}

		if (discountProductGroupId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountProductGroupId\": ");

			sb.append(discountProductGroupId);
		}

		if (productGroup != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productGroup\": ");

			sb.append(String.valueOf(productGroup));
		}

		if (productGroupExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productGroupExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(productGroupExternalReferenceCode));

			sb.append("\"");
		}

		if (productGroupId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productGroupId\": ");

			sb.append(productGroupId);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.pricing.dto.v2_0.DiscountProductGroup",
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