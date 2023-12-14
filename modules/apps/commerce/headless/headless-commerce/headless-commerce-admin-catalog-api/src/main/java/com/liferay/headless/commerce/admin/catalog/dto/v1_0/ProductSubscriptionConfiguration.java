/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.catalog.dto.v1_0;

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
 * @author Zoltán Takács
 * @generated
 */
@Generated("")
@GraphQLName("ProductSubscriptionConfiguration")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ProductSubscriptionConfiguration")
public class ProductSubscriptionConfiguration implements Serializable {

	public static ProductSubscriptionConfiguration toDTO(String json) {
		return ObjectMapperUtil.readValue(
			ProductSubscriptionConfiguration.class, json);
	}

	public static ProductSubscriptionConfiguration unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			ProductSubscriptionConfiguration.class, json);
	}

	@Schema(example = "true")
	public Boolean getDeliverySubscriptionEnable() {
		if (deliverySubscriptionEnable != null) {
			return deliverySubscriptionEnable;
		}

		deliverySubscriptionEnable = _deliverySubscriptionEnableSupplier.get();

		return deliverySubscriptionEnable;
	}

	public void setDeliverySubscriptionEnable(
		Boolean deliverySubscriptionEnable) {

		this.deliverySubscriptionEnable = deliverySubscriptionEnable;

		_deliverySubscriptionEnableSupplier = () -> deliverySubscriptionEnable;
	}

	@JsonIgnore
	public void setDeliverySubscriptionEnable(
		UnsafeSupplier<Boolean, Exception>
			deliverySubscriptionEnableUnsafeSupplier) {

		deliverySubscriptionEnable = null;

		_deliverySubscriptionEnableSupplier = () -> {
			try {
				return deliverySubscriptionEnableUnsafeSupplier.get();
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
	protected Boolean deliverySubscriptionEnable;

	private Supplier<Boolean> _deliverySubscriptionEnableSupplier = () -> null;

	@Schema(example = "2")
	public Integer getDeliverySubscriptionLength() {
		if (deliverySubscriptionLength != null) {
			return deliverySubscriptionLength;
		}

		deliverySubscriptionLength = _deliverySubscriptionLengthSupplier.get();

		return deliverySubscriptionLength;
	}

	public void setDeliverySubscriptionLength(
		Integer deliverySubscriptionLength) {

		this.deliverySubscriptionLength = deliverySubscriptionLength;

		_deliverySubscriptionLengthSupplier = () -> deliverySubscriptionLength;
	}

	@JsonIgnore
	public void setDeliverySubscriptionLength(
		UnsafeSupplier<Integer, Exception>
			deliverySubscriptionLengthUnsafeSupplier) {

		deliverySubscriptionLength = null;

		_deliverySubscriptionLengthSupplier = () -> {
			try {
				return deliverySubscriptionLengthUnsafeSupplier.get();
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
	protected Integer deliverySubscriptionLength;

	private Supplier<Integer> _deliverySubscriptionLengthSupplier = () -> null;

	@Schema(example = "12")
	public Long getDeliverySubscriptionNumberOfLength() {
		if (deliverySubscriptionNumberOfLength != null) {
			return deliverySubscriptionNumberOfLength;
		}

		deliverySubscriptionNumberOfLength =
			_deliverySubscriptionNumberOfLengthSupplier.get();

		return deliverySubscriptionNumberOfLength;
	}

	public void setDeliverySubscriptionNumberOfLength(
		Long deliverySubscriptionNumberOfLength) {

		this.deliverySubscriptionNumberOfLength =
			deliverySubscriptionNumberOfLength;

		_deliverySubscriptionNumberOfLengthSupplier =
			() -> deliverySubscriptionNumberOfLength;
	}

	@JsonIgnore
	public void setDeliverySubscriptionNumberOfLength(
		UnsafeSupplier<Long, Exception>
			deliverySubscriptionNumberOfLengthUnsafeSupplier) {

		deliverySubscriptionNumberOfLength = null;

		_deliverySubscriptionNumberOfLengthSupplier = () -> {
			try {
				return deliverySubscriptionNumberOfLengthUnsafeSupplier.get();
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
	protected Long deliverySubscriptionNumberOfLength;

	private Supplier<Long> _deliverySubscriptionNumberOfLengthSupplier =
		() -> null;

	@Schema(example = "monthly")
	@Valid
	public DeliverySubscriptionType getDeliverySubscriptionType() {
		if (deliverySubscriptionType != null) {
			return deliverySubscriptionType;
		}

		deliverySubscriptionType = _deliverySubscriptionTypeSupplier.get();

		return deliverySubscriptionType;
	}

	@JsonIgnore
	public String getDeliverySubscriptionTypeAsString() {
		if (deliverySubscriptionType == null) {
			return null;
		}

		return deliverySubscriptionType.toString();
	}

	public void setDeliverySubscriptionType(
		DeliverySubscriptionType deliverySubscriptionType) {

		this.deliverySubscriptionType = deliverySubscriptionType;

		_deliverySubscriptionTypeSupplier = () -> deliverySubscriptionType;
	}

	@JsonIgnore
	public void setDeliverySubscriptionType(
		UnsafeSupplier<DeliverySubscriptionType, Exception>
			deliverySubscriptionTypeUnsafeSupplier) {

		deliverySubscriptionType = null;

		_deliverySubscriptionTypeSupplier = () -> {
			try {
				return deliverySubscriptionTypeUnsafeSupplier.get();
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
	protected DeliverySubscriptionType deliverySubscriptionType;

	private Supplier<DeliverySubscriptionType>
		_deliverySubscriptionTypeSupplier = () -> null;

	@Schema(example = "{deliveryMonthDay=1, deliveryMonthlyMode=0}")
	@Valid
	public Map<String, String> getDeliverySubscriptionTypeSettings() {
		if (deliverySubscriptionTypeSettings != null) {
			return deliverySubscriptionTypeSettings;
		}

		deliverySubscriptionTypeSettings =
			_deliverySubscriptionTypeSettingsSupplier.get();

		return deliverySubscriptionTypeSettings;
	}

	public void setDeliverySubscriptionTypeSettings(
		Map<String, String> deliverySubscriptionTypeSettings) {

		this.deliverySubscriptionTypeSettings =
			deliverySubscriptionTypeSettings;

		_deliverySubscriptionTypeSettingsSupplier =
			() -> deliverySubscriptionTypeSettings;
	}

	@JsonIgnore
	public void setDeliverySubscriptionTypeSettings(
		UnsafeSupplier<Map<String, String>, Exception>
			deliverySubscriptionTypeSettingsUnsafeSupplier) {

		deliverySubscriptionTypeSettings = null;

		_deliverySubscriptionTypeSettingsSupplier = () -> {
			try {
				return deliverySubscriptionTypeSettingsUnsafeSupplier.get();
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
	protected Map<String, String> deliverySubscriptionTypeSettings;

	private Supplier<Map<String, String>>
		_deliverySubscriptionTypeSettingsSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getEnable() {
		if (enable != null) {
			return enable;
		}

		enable = _enableSupplier.get();

		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;

		_enableSupplier = () -> enable;
	}

	@JsonIgnore
	public void setEnable(
		UnsafeSupplier<Boolean, Exception> enableUnsafeSupplier) {

		enable = null;

		_enableSupplier = () -> {
			try {
				return enableUnsafeSupplier.get();
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
	protected Boolean enable;

	private Supplier<Boolean> _enableSupplier = () -> null;

	@Schema(example = "2")
	public Integer getLength() {
		if (length != null) {
			return length;
		}

		length = _lengthSupplier.get();

		return length;
	}

	public void setLength(Integer length) {
		this.length = length;

		_lengthSupplier = () -> length;
	}

	@JsonIgnore
	public void setLength(
		UnsafeSupplier<Integer, Exception> lengthUnsafeSupplier) {

		length = null;

		_lengthSupplier = () -> {
			try {
				return lengthUnsafeSupplier.get();
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
	protected Integer length;

	private Supplier<Integer> _lengthSupplier = () -> null;

	@Schema(example = "12")
	public Long getNumberOfLength() {
		if (numberOfLength != null) {
			return numberOfLength;
		}

		numberOfLength = _numberOfLengthSupplier.get();

		return numberOfLength;
	}

	public void setNumberOfLength(Long numberOfLength) {
		this.numberOfLength = numberOfLength;

		_numberOfLengthSupplier = () -> numberOfLength;
	}

	@JsonIgnore
	public void setNumberOfLength(
		UnsafeSupplier<Long, Exception> numberOfLengthUnsafeSupplier) {

		numberOfLength = null;

		_numberOfLengthSupplier = () -> {
			try {
				return numberOfLengthUnsafeSupplier.get();
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
	protected Long numberOfLength;

	private Supplier<Long> _numberOfLengthSupplier = () -> null;

	@Schema(example = "monthly")
	@Valid
	public SubscriptionType getSubscriptionType() {
		if (subscriptionType != null) {
			return subscriptionType;
		}

		subscriptionType = _subscriptionTypeSupplier.get();

		return subscriptionType;
	}

	@JsonIgnore
	public String getSubscriptionTypeAsString() {
		if (subscriptionType == null) {
			return null;
		}

		return subscriptionType.toString();
	}

	public void setSubscriptionType(SubscriptionType subscriptionType) {
		this.subscriptionType = subscriptionType;

		_subscriptionTypeSupplier = () -> subscriptionType;
	}

	@JsonIgnore
	public void setSubscriptionType(
		UnsafeSupplier<SubscriptionType, Exception>
			subscriptionTypeUnsafeSupplier) {

		subscriptionType = null;

		_subscriptionTypeSupplier = () -> {
			try {
				return subscriptionTypeUnsafeSupplier.get();
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
	protected SubscriptionType subscriptionType;

	private Supplier<SubscriptionType> _subscriptionTypeSupplier = () -> null;

	@Schema(example = "{monthDay=1, monthlyMode=0}")
	@Valid
	public Map<String, String> getSubscriptionTypeSettings() {
		if (subscriptionTypeSettings != null) {
			return subscriptionTypeSettings;
		}

		subscriptionTypeSettings = _subscriptionTypeSettingsSupplier.get();

		return subscriptionTypeSettings;
	}

	public void setSubscriptionTypeSettings(
		Map<String, String> subscriptionTypeSettings) {

		this.subscriptionTypeSettings = subscriptionTypeSettings;

		_subscriptionTypeSettingsSupplier = () -> subscriptionTypeSettings;
	}

	@JsonIgnore
	public void setSubscriptionTypeSettings(
		UnsafeSupplier<Map<String, String>, Exception>
			subscriptionTypeSettingsUnsafeSupplier) {

		subscriptionTypeSettings = null;

		_subscriptionTypeSettingsSupplier = () -> {
			try {
				return subscriptionTypeSettingsUnsafeSupplier.get();
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
	protected Map<String, String> subscriptionTypeSettings;

	private Supplier<Map<String, String>> _subscriptionTypeSettingsSupplier =
		() -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProductSubscriptionConfiguration)) {
			return false;
		}

		ProductSubscriptionConfiguration productSubscriptionConfiguration =
			(ProductSubscriptionConfiguration)object;

		return Objects.equals(
			toString(), productSubscriptionConfiguration.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (deliverySubscriptionEnable != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"deliverySubscriptionEnable\": ");

			sb.append(deliverySubscriptionEnable);
		}

		if (deliverySubscriptionLength != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"deliverySubscriptionLength\": ");

			sb.append(deliverySubscriptionLength);
		}

		if (deliverySubscriptionNumberOfLength != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"deliverySubscriptionNumberOfLength\": ");

			sb.append(deliverySubscriptionNumberOfLength);
		}

		if (deliverySubscriptionType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"deliverySubscriptionType\": ");

			sb.append("\"");

			sb.append(deliverySubscriptionType);

			sb.append("\"");
		}

		if (deliverySubscriptionTypeSettings != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"deliverySubscriptionTypeSettings\": ");

			sb.append(_toJSON(deliverySubscriptionTypeSettings));
		}

		if (enable != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"enable\": ");

			sb.append(enable);
		}

		if (length != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"length\": ");

			sb.append(length);
		}

		if (numberOfLength != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfLength\": ");

			sb.append(numberOfLength);
		}

		if (subscriptionType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subscriptionType\": ");

			sb.append("\"");

			sb.append(subscriptionType);

			sb.append("\"");
		}

		if (subscriptionTypeSettings != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subscriptionTypeSettings\": ");

			sb.append(_toJSON(subscriptionTypeSettings));
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.catalog.dto.v1_0.ProductSubscriptionConfiguration",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("DeliverySubscriptionType")
	public static enum DeliverySubscriptionType {

		DAILY("daily"), MONTHLY("monthly"), WEEKLY("weekly"), YEARLY("yearly");

		@JsonCreator
		public static DeliverySubscriptionType create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (DeliverySubscriptionType deliverySubscriptionType : values()) {
				if (Objects.equals(
						deliverySubscriptionType.getValue(), value)) {

					return deliverySubscriptionType;
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

		private DeliverySubscriptionType(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("SubscriptionType")
	public static enum SubscriptionType {

		DAILY("daily"), MONTHLY("monthly"), WEEKLY("weekly"), YEARLY("yearly");

		@JsonCreator
		public static SubscriptionType create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (SubscriptionType subscriptionType : values()) {
				if (Objects.equals(subscriptionType.getValue(), value)) {
					return subscriptionType;
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

		private SubscriptionType(String value) {
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