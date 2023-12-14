/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
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
@GraphQLName("AccountAddressChannel")
@JsonFilter("Liferay.Vulcan")
@Schema(requiredProperties = {"addressChannelId", "addressId"})
@XmlRootElement(name = "AccountAddressChannel")
public class AccountAddressChannel implements Serializable {

	public static AccountAddressChannel toDTO(String json) {
		return ObjectMapperUtil.readValue(AccountAddressChannel.class, json);
	}

	public static AccountAddressChannel unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			AccountAddressChannel.class, json);
	}

	@DecimalMin("0")
	@Schema(example = "30643")
	public Long getAccountAddressChannelId() {
		if (accountAddressChannelId != null) {
			return accountAddressChannelId;
		}

		accountAddressChannelId = _accountAddressChannelIdSupplier.get();

		return accountAddressChannelId;
	}

	public void setAccountAddressChannelId(Long accountAddressChannelId) {
		this.accountAddressChannelId = accountAddressChannelId;

		_accountAddressChannelIdSupplier = () -> accountAddressChannelId;
	}

	@JsonIgnore
	public void setAccountAddressChannelId(
		UnsafeSupplier<Long, Exception> accountAddressChannelIdUnsafeSupplier) {

		accountAddressChannelId = null;

		_accountAddressChannelIdSupplier = () -> {
			try {
				return accountAddressChannelIdUnsafeSupplier.get();
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
	protected Long accountAddressChannelId;

	private Supplier<Long> _accountAddressChannelIdSupplier = () -> null;

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

	@Schema(example = "PAB-34098-789-N")
	public String getAddressChannelExternalReferenceCode() {
		if (addressChannelExternalReferenceCode != null) {
			return addressChannelExternalReferenceCode;
		}

		addressChannelExternalReferenceCode =
			_addressChannelExternalReferenceCodeSupplier.get();

		return addressChannelExternalReferenceCode;
	}

	public void setAddressChannelExternalReferenceCode(
		String addressChannelExternalReferenceCode) {

		this.addressChannelExternalReferenceCode =
			addressChannelExternalReferenceCode;

		_addressChannelExternalReferenceCodeSupplier =
			() -> addressChannelExternalReferenceCode;
	}

	@JsonIgnore
	public void setAddressChannelExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			addressChannelExternalReferenceCodeUnsafeSupplier) {

		addressChannelExternalReferenceCode = null;

		_addressChannelExternalReferenceCodeSupplier = () -> {
			try {
				return addressChannelExternalReferenceCodeUnsafeSupplier.get();
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
	protected String addressChannelExternalReferenceCode;

	private Supplier<String> _addressChannelExternalReferenceCodeSupplier =
		() -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
	public Long getAddressChannelId() {
		if (addressChannelId != null) {
			return addressChannelId;
		}

		addressChannelId = _addressChannelIdSupplier.get();

		return addressChannelId;
	}

	public void setAddressChannelId(Long addressChannelId) {
		this.addressChannelId = addressChannelId;

		_addressChannelIdSupplier = () -> addressChannelId;
	}

	@JsonIgnore
	public void setAddressChannelId(
		UnsafeSupplier<Long, Exception> addressChannelIdUnsafeSupplier) {

		addressChannelId = null;

		_addressChannelIdSupplier = () -> {
			try {
				return addressChannelIdUnsafeSupplier.get();
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
	protected Long addressChannelId;

	private Supplier<Long> _addressChannelIdSupplier = () -> null;

	@Schema(example = "DAB-34098-789-N")
	public String getAddressExternalReferenceCode() {
		if (addressExternalReferenceCode != null) {
			return addressExternalReferenceCode;
		}

		addressExternalReferenceCode =
			_addressExternalReferenceCodeSupplier.get();

		return addressExternalReferenceCode;
	}

	public void setAddressExternalReferenceCode(
		String addressExternalReferenceCode) {

		this.addressExternalReferenceCode = addressExternalReferenceCode;

		_addressExternalReferenceCodeSupplier =
			() -> addressExternalReferenceCode;
	}

	@JsonIgnore
	public void setAddressExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			addressExternalReferenceCodeUnsafeSupplier) {

		addressExternalReferenceCode = null;

		_addressExternalReferenceCodeSupplier = () -> {
			try {
				return addressExternalReferenceCodeUnsafeSupplier.get();
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
	protected String addressExternalReferenceCode;

	private Supplier<String> _addressExternalReferenceCodeSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30324")
	public Long getAddressId() {
		if (addressId != null) {
			return addressId;
		}

		addressId = _addressIdSupplier.get();

		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;

		_addressIdSupplier = () -> addressId;
	}

	@JsonIgnore
	public void setAddressId(
		UnsafeSupplier<Long, Exception> addressIdUnsafeSupplier) {

		addressId = null;

		_addressIdSupplier = () -> {
			try {
				return addressIdUnsafeSupplier.get();
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
	protected Long addressId;

	private Supplier<Long> _addressIdSupplier = () -> null;

	@Schema
	@Valid
	public Channel getChannel() {
		if (channel != null) {
			return channel;
		}

		channel = _channelSupplier.get();

		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;

		_channelSupplier = () -> channel;
	}

	@JsonIgnore
	public void setChannel(
		UnsafeSupplier<Channel, Exception> channelUnsafeSupplier) {

		channel = null;

		_channelSupplier = () -> {
			try {
				return channelUnsafeSupplier.get();
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
	protected Channel channel;

	private Supplier<Channel> _channelSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccountAddressChannel)) {
			return false;
		}

		AccountAddressChannel accountAddressChannel =
			(AccountAddressChannel)object;

		return Objects.equals(toString(), accountAddressChannel.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (accountAddressChannelId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountAddressChannelId\": ");

			sb.append(accountAddressChannelId);
		}

		if (actions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actions\": ");

			sb.append(_toJSON(actions));
		}

		if (addressChannelExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"addressChannelExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(addressChannelExternalReferenceCode));

			sb.append("\"");
		}

		if (addressChannelId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"addressChannelId\": ");

			sb.append(addressChannelId);
		}

		if (addressExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"addressExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(addressExternalReferenceCode));

			sb.append("\"");
		}

		if (addressId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"addressId\": ");

			sb.append(addressId);
		}

		if (channel != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"channel\": ");

			sb.append(String.valueOf(channel));
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.channel.dto.v1_0.AccountAddressChannel",
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