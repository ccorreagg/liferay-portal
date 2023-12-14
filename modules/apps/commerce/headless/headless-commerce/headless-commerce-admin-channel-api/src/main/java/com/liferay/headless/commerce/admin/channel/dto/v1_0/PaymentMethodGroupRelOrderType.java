/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.channel.dto.v1_0;

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
 * @author Andrea Sbarra
 * @generated
 */
@Generated("")
@GraphQLName("PaymentMethodGroupRelOrderType")
@JsonFilter("Liferay.Vulcan")
@Schema(requiredProperties = {"paymentMethodGroupRelId", "orderTypeId"})
@XmlRootElement(name = "PaymentMethodGroupRelOrderType")
public class PaymentMethodGroupRelOrderType implements Serializable {

	public static PaymentMethodGroupRelOrderType toDTO(String json) {
		return ObjectMapperUtil.readValue(
			PaymentMethodGroupRelOrderType.class, json);
	}

	public static PaymentMethodGroupRelOrderType unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			PaymentMethodGroupRelOrderType.class, json);
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

	@Schema
	@Valid
	public OrderType getOrderType() {
		if (orderType != null) {
			return orderType;
		}

		orderType = _orderTypeSupplier.get();

		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;

		_orderTypeSupplier = () -> orderType;
	}

	@JsonIgnore
	public void setOrderType(
		UnsafeSupplier<OrderType, Exception> orderTypeUnsafeSupplier) {

		orderType = null;

		_orderTypeSupplier = () -> {
			try {
				return orderTypeUnsafeSupplier.get();
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
	protected OrderType orderType;

	private Supplier<OrderType> _orderTypeSupplier = () -> null;

	@Schema(example = "DAB-34098-789-N")
	public String getOrderTypeExternalReferenceCode() {
		if (orderTypeExternalReferenceCode != null) {
			return orderTypeExternalReferenceCode;
		}

		orderTypeExternalReferenceCode =
			_orderTypeExternalReferenceCodeSupplier.get();

		return orderTypeExternalReferenceCode;
	}

	public void setOrderTypeExternalReferenceCode(
		String orderTypeExternalReferenceCode) {

		this.orderTypeExternalReferenceCode = orderTypeExternalReferenceCode;

		_orderTypeExternalReferenceCodeSupplier =
			() -> orderTypeExternalReferenceCode;
	}

	@JsonIgnore
	public void setOrderTypeExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			orderTypeExternalReferenceCodeUnsafeSupplier) {

		orderTypeExternalReferenceCode = null;

		_orderTypeExternalReferenceCodeSupplier = () -> {
			try {
				return orderTypeExternalReferenceCodeUnsafeSupplier.get();
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
	protected String orderTypeExternalReferenceCode;

	private Supplier<String> _orderTypeExternalReferenceCodeSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "30324")
	public Long getOrderTypeId() {
		if (orderTypeId != null) {
			return orderTypeId;
		}

		orderTypeId = _orderTypeIdSupplier.get();

		return orderTypeId;
	}

	public void setOrderTypeId(Long orderTypeId) {
		this.orderTypeId = orderTypeId;

		_orderTypeIdSupplier = () -> orderTypeId;
	}

	@JsonIgnore
	public void setOrderTypeId(
		UnsafeSupplier<Long, Exception> orderTypeIdUnsafeSupplier) {

		orderTypeId = null;

		_orderTypeIdSupplier = () -> {
			try {
				return orderTypeIdUnsafeSupplier.get();
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
	protected Long orderTypeId;

	private Supplier<Long> _orderTypeIdSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
	public Long getPaymentMethodGroupRelId() {
		if (paymentMethodGroupRelId != null) {
			return paymentMethodGroupRelId;
		}

		paymentMethodGroupRelId = _paymentMethodGroupRelIdSupplier.get();

		return paymentMethodGroupRelId;
	}

	public void setPaymentMethodGroupRelId(Long paymentMethodGroupRelId) {
		this.paymentMethodGroupRelId = paymentMethodGroupRelId;

		_paymentMethodGroupRelIdSupplier = () -> paymentMethodGroupRelId;
	}

	@JsonIgnore
	public void setPaymentMethodGroupRelId(
		UnsafeSupplier<Long, Exception> paymentMethodGroupRelIdUnsafeSupplier) {

		paymentMethodGroupRelId = null;

		_paymentMethodGroupRelIdSupplier = () -> {
			try {
				return paymentMethodGroupRelIdUnsafeSupplier.get();
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
	protected Long paymentMethodGroupRelId;

	private Supplier<Long> _paymentMethodGroupRelIdSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30643")
	public Long getPaymentMethodGroupRelOrderTypeId() {
		if (paymentMethodGroupRelOrderTypeId != null) {
			return paymentMethodGroupRelOrderTypeId;
		}

		paymentMethodGroupRelOrderTypeId =
			_paymentMethodGroupRelOrderTypeIdSupplier.get();

		return paymentMethodGroupRelOrderTypeId;
	}

	public void setPaymentMethodGroupRelOrderTypeId(
		Long paymentMethodGroupRelOrderTypeId) {

		this.paymentMethodGroupRelOrderTypeId =
			paymentMethodGroupRelOrderTypeId;

		_paymentMethodGroupRelOrderTypeIdSupplier =
			() -> paymentMethodGroupRelOrderTypeId;
	}

	@JsonIgnore
	public void setPaymentMethodGroupRelOrderTypeId(
		UnsafeSupplier<Long, Exception>
			paymentMethodGroupRelOrderTypeIdUnsafeSupplier) {

		paymentMethodGroupRelOrderTypeId = null;

		_paymentMethodGroupRelOrderTypeIdSupplier = () -> {
			try {
				return paymentMethodGroupRelOrderTypeIdUnsafeSupplier.get();
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
	protected Long paymentMethodGroupRelOrderTypeId;

	private Supplier<Long> _paymentMethodGroupRelOrderTypeIdSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "1")
	public Integer getPriority() {
		if (priority != null) {
			return priority;
		}

		priority = _prioritySupplier.get();

		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;

		_prioritySupplier = () -> priority;
	}

	@JsonIgnore
	public void setPriority(
		UnsafeSupplier<Integer, Exception> priorityUnsafeSupplier) {

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
	protected Integer priority;

	private Supplier<Integer> _prioritySupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PaymentMethodGroupRelOrderType)) {
			return false;
		}

		PaymentMethodGroupRelOrderType paymentMethodGroupRelOrderType =
			(PaymentMethodGroupRelOrderType)object;

		return Objects.equals(
			toString(), paymentMethodGroupRelOrderType.toString());
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

		if (orderType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderType\": ");

			sb.append(String.valueOf(orderType));
		}

		if (orderTypeExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderTypeExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(orderTypeExternalReferenceCode));

			sb.append("\"");
		}

		if (orderTypeId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderTypeId\": ");

			sb.append(orderTypeId);
		}

		if (paymentMethodGroupRelId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paymentMethodGroupRelId\": ");

			sb.append(paymentMethodGroupRelId);
		}

		if (paymentMethodGroupRelOrderTypeId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paymentMethodGroupRelOrderTypeId\": ");

			sb.append(paymentMethodGroupRelOrderTypeId);
		}

		if (priority != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priority\": ");

			sb.append(priority);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.channel.dto.v1_0.PaymentMethodGroupRelOrderType",
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