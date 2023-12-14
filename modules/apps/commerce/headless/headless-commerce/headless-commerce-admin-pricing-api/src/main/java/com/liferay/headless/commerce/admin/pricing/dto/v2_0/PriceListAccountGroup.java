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
@GraphQLName("PriceListAccountGroup")
@JsonFilter("Liferay.Vulcan")
@Schema(requiredProperties = {"accountGroupId", "priceListId"})
@XmlRootElement(name = "PriceListAccountGroup")
public class PriceListAccountGroup implements Serializable {

	public static PriceListAccountGroup toDTO(String json) {
		return ObjectMapperUtil.readValue(PriceListAccountGroup.class, json);
	}

	public static PriceListAccountGroup unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			PriceListAccountGroup.class, json);
	}

	@Schema
	@Valid
	public PricingAccountGroup getAccountGroup() {
		if (accountGroup != null) {
			return accountGroup;
		}

		accountGroup = _accountGroupSupplier.get();

		return accountGroup;
	}

	public void setAccountGroup(PricingAccountGroup accountGroup) {
		this.accountGroup = accountGroup;

		_accountGroupSupplier = () -> accountGroup;
	}

	@JsonIgnore
	public void setAccountGroup(
		UnsafeSupplier<PricingAccountGroup, Exception>
			accountGroupUnsafeSupplier) {

		accountGroup = null;

		_accountGroupSupplier = () -> {
			try {
				return accountGroupUnsafeSupplier.get();
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
	protected PricingAccountGroup accountGroup;

	private Supplier<PricingAccountGroup> _accountGroupSupplier = () -> null;

	@Schema(example = "DAB-34098-789-N")
	public String getAccountGroupExternalReferenceCode() {
		if (accountGroupExternalReferenceCode != null) {
			return accountGroupExternalReferenceCode;
		}

		accountGroupExternalReferenceCode =
			_accountGroupExternalReferenceCodeSupplier.get();

		return accountGroupExternalReferenceCode;
	}

	public void setAccountGroupExternalReferenceCode(
		String accountGroupExternalReferenceCode) {

		this.accountGroupExternalReferenceCode =
			accountGroupExternalReferenceCode;

		_accountGroupExternalReferenceCodeSupplier =
			() -> accountGroupExternalReferenceCode;
	}

	@JsonIgnore
	public void setAccountGroupExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			accountGroupExternalReferenceCodeUnsafeSupplier) {

		accountGroupExternalReferenceCode = null;

		_accountGroupExternalReferenceCodeSupplier = () -> {
			try {
				return accountGroupExternalReferenceCodeUnsafeSupplier.get();
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
	protected String accountGroupExternalReferenceCode;

	private Supplier<String> _accountGroupExternalReferenceCodeSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "30324")
	public Long getAccountGroupId() {
		if (accountGroupId != null) {
			return accountGroupId;
		}

		accountGroupId = _accountGroupIdSupplier.get();

		return accountGroupId;
	}

	public void setAccountGroupId(Long accountGroupId) {
		this.accountGroupId = accountGroupId;

		_accountGroupIdSupplier = () -> accountGroupId;
	}

	@JsonIgnore
	public void setAccountGroupId(
		UnsafeSupplier<Long, Exception> accountGroupIdUnsafeSupplier) {

		accountGroupId = null;

		_accountGroupIdSupplier = () -> {
			try {
				return accountGroupIdUnsafeSupplier.get();
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
	protected Long accountGroupId;

	private Supplier<Long> _accountGroupIdSupplier = () -> null;

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

	@DecimalMin("0")
	@Schema(example = "1")
	public Integer getOrder() {
		if (order != null) {
			return order;
		}

		order = _orderSupplier.get();

		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;

		_orderSupplier = () -> order;
	}

	@JsonIgnore
	public void setOrder(
		UnsafeSupplier<Integer, Exception> orderUnsafeSupplier) {

		order = null;

		_orderSupplier = () -> {
			try {
				return orderUnsafeSupplier.get();
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
	protected Integer order;

	private Supplier<Integer> _orderSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30643")
	public Long getPriceListAccountGroupId() {
		if (priceListAccountGroupId != null) {
			return priceListAccountGroupId;
		}

		priceListAccountGroupId = _priceListAccountGroupIdSupplier.get();

		return priceListAccountGroupId;
	}

	public void setPriceListAccountGroupId(Long priceListAccountGroupId) {
		this.priceListAccountGroupId = priceListAccountGroupId;

		_priceListAccountGroupIdSupplier = () -> priceListAccountGroupId;
	}

	@JsonIgnore
	public void setPriceListAccountGroupId(
		UnsafeSupplier<Long, Exception> priceListAccountGroupIdUnsafeSupplier) {

		priceListAccountGroupId = null;

		_priceListAccountGroupIdSupplier = () -> {
			try {
				return priceListAccountGroupIdUnsafeSupplier.get();
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
	protected Long priceListAccountGroupId;

	private Supplier<Long> _priceListAccountGroupIdSupplier = () -> null;

	@Schema(example = "PAB-34098-789-N")
	public String getPriceListExternalReferenceCode() {
		if (priceListExternalReferenceCode != null) {
			return priceListExternalReferenceCode;
		}

		priceListExternalReferenceCode =
			_priceListExternalReferenceCodeSupplier.get();

		return priceListExternalReferenceCode;
	}

	public void setPriceListExternalReferenceCode(
		String priceListExternalReferenceCode) {

		this.priceListExternalReferenceCode = priceListExternalReferenceCode;

		_priceListExternalReferenceCodeSupplier =
			() -> priceListExternalReferenceCode;
	}

	@JsonIgnore
	public void setPriceListExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			priceListExternalReferenceCodeUnsafeSupplier) {

		priceListExternalReferenceCode = null;

		_priceListExternalReferenceCodeSupplier = () -> {
			try {
				return priceListExternalReferenceCodeUnsafeSupplier.get();
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
	protected String priceListExternalReferenceCode;

	private Supplier<String> _priceListExternalReferenceCodeSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
	public Long getPriceListId() {
		if (priceListId != null) {
			return priceListId;
		}

		priceListId = _priceListIdSupplier.get();

		return priceListId;
	}

	public void setPriceListId(Long priceListId) {
		this.priceListId = priceListId;

		_priceListIdSupplier = () -> priceListId;
	}

	@JsonIgnore
	public void setPriceListId(
		UnsafeSupplier<Long, Exception> priceListIdUnsafeSupplier) {

		priceListId = null;

		_priceListIdSupplier = () -> {
			try {
				return priceListIdUnsafeSupplier.get();
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
	protected Long priceListId;

	private Supplier<Long> _priceListIdSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PriceListAccountGroup)) {
			return false;
		}

		PriceListAccountGroup priceListAccountGroup =
			(PriceListAccountGroup)object;

		return Objects.equals(toString(), priceListAccountGroup.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (accountGroup != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountGroup\": ");

			sb.append(String.valueOf(accountGroup));
		}

		if (accountGroupExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountGroupExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(accountGroupExternalReferenceCode));

			sb.append("\"");
		}

		if (accountGroupId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountGroupId\": ");

			sb.append(accountGroupId);
		}

		if (actions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actions\": ");

			sb.append(_toJSON(actions));
		}

		if (order != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"order\": ");

			sb.append(order);
		}

		if (priceListAccountGroupId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceListAccountGroupId\": ");

			sb.append(priceListAccountGroupId);
		}

		if (priceListExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceListExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(priceListExternalReferenceCode));

			sb.append("\"");
		}

		if (priceListId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priceListId\": ");

			sb.append(priceListId);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.pricing.dto.v2_0.PriceListAccountGroup",
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