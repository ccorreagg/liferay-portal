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
@GraphQLName("PriceModifierProductGroup")
@JsonFilter("Liferay.Vulcan")
@Schema(requiredProperties = {"priceModifierId", "productGroupId"})
@XmlRootElement(name = "PriceModifierProductGroup")
public class PriceModifierProductGroup implements Serializable {

	public static PriceModifierProductGroup toDTO(String json) {
		return ObjectMapperUtil.readValue(
			PriceModifierProductGroup.class, json);
	}

	public static PriceModifierProductGroup unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			PriceModifierProductGroup.class, json);
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
	public String getPriceModifierExternalReferenceCode() {
		if (priceModifierExternalReferenceCode != null) {
			return priceModifierExternalReferenceCode;
		}

		priceModifierExternalReferenceCode =
			_priceModifierExternalReferenceCodeSupplier.get();

		return priceModifierExternalReferenceCode;
	}

	public void setPriceModifierExternalReferenceCode(
		String priceModifierExternalReferenceCode) {

		this.priceModifierExternalReferenceCode =
			priceModifierExternalReferenceCode;

		_priceModifierExternalReferenceCodeSupplier =
			() -> priceModifierExternalReferenceCode;
	}

	@JsonIgnore
	public void setPriceModifierExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			priceModifierExternalReferenceCodeUnsafeSupplier) {

		priceModifierExternalReferenceCode = null;

		_priceModifierExternalReferenceCodeSupplier = () -> {
			try {
				return priceModifierExternalReferenceCodeUnsafeSupplier.get();
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
	protected String priceModifierExternalReferenceCode;

	private Supplier<String> _priceModifierExternalReferenceCodeSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "30324")
	public Long getPriceModifierId() {
		if (priceModifierId != null) {
			return priceModifierId;
		}

		priceModifierId = _priceModifierIdSupplier.get();

		return priceModifierId;
	}

	public void setPriceModifierId(Long priceModifierId) {
		this.priceModifierId = priceModifierId;

		_priceModifierIdSupplier = () -> priceModifierId;
	}

	@JsonIgnore
	public void setPriceModifierId(
		UnsafeSupplier<Long, Exception> priceModifierIdUnsafeSupplier) {

		priceModifierId = null;

		_priceModifierIdSupplier = () -> {
			try {
				return priceModifierIdUnsafeSupplier.get();
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
	protected Long priceModifierId;

	private Supplier<Long> _priceModifierIdSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30643")
	public Long getPriceModifierProductGroupId() {
		if (priceModifierProductGroupId != null) {
			return priceModifierProductGroupId;
		}

		priceModifierProductGroupId =
			_priceModifierProductGroupIdSupplier.get();

		return priceModifierProductGroupId;
	}

	public void setPriceModifierProductGroupId(
		Long priceModifierProductGroupId) {

		this.priceModifierProductGroupId = priceModifierProductGroupId;

		_priceModifierProductGroupIdSupplier =
			() -> priceModifierProductGroupId;
	}

	@JsonIgnore
	public void setPriceModifierProductGroupId(
		UnsafeSupplier<Long, Exception>
			priceModifierProductGroupIdUnsafeSupplier) {

		priceModifierProductGroupId = null;

		_priceModifierProductGroupIdSupplier = () -> {
			try {
				return priceModifierProductGroupIdUnsafeSupplier.get();
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
	protected Long priceModifierProductGroupId;

	private Supplier<Long> _priceModifierProductGroupIdSupplier = () -> null;

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

		if (!(object instanceof PriceModifierProductGroup)) {
			return false;
		}

		PriceModifierProductGroup priceModifierProductGroup =
			(PriceModifierProductGroup)object;

		return Objects.equals(toString(), priceModifierProductGroup.toString());
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

		if (priceModifierExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceModifierExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(priceModifierExternalReferenceCode));

			sb.append("\"");
		}

		if (priceModifierId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceModifierId\": ");

			sb.append(priceModifierId);
		}

		if (priceModifierProductGroupId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceModifierProductGroupId\": ");

			sb.append(priceModifierProductGroupId);
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
		defaultValue = "com.liferay.headless.commerce.admin.pricing.dto.v2_0.PriceModifierProductGroup",
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