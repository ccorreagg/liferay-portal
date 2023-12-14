/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.account.dto.v1_0;

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
 * @author Alessio Antonio Rendina
 * @generated
 */
@Generated("")
@GraphQLName("AccountChannelShippingOption")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "AccountChannelShippingOption")
public class AccountChannelShippingOption implements Serializable {

	public static AccountChannelShippingOption toDTO(String json) {
		return ObjectMapperUtil.readValue(
			AccountChannelShippingOption.class, json);
	}

	public static AccountChannelShippingOption unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			AccountChannelShippingOption.class, json);
	}

	@Schema(example = "UAB-34098-789-N")
	public String getAccountExternalReferenceCode() {
		if (accountExternalReferenceCode != null) {
			return accountExternalReferenceCode;
		}

		accountExternalReferenceCode =
			_accountExternalReferenceCodeSupplier.get();

		return accountExternalReferenceCode;
	}

	public void setAccountExternalReferenceCode(
		String accountExternalReferenceCode) {

		this.accountExternalReferenceCode = accountExternalReferenceCode;

		_accountExternalReferenceCodeSupplier =
			() -> accountExternalReferenceCode;
	}

	@JsonIgnore
	public void setAccountExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			accountExternalReferenceCodeUnsafeSupplier) {

		accountExternalReferenceCode = null;

		_accountExternalReferenceCodeSupplier = () -> {
			try {
				return accountExternalReferenceCodeUnsafeSupplier.get();
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
	protected String accountExternalReferenceCode;

	private Supplier<String> _accountExternalReferenceCodeSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
	public Long getAccountId() {
		if (accountId != null) {
			return accountId;
		}

		accountId = _accountIdSupplier.get();

		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;

		_accountIdSupplier = () -> accountId;
	}

	@JsonIgnore
	public void setAccountId(
		UnsafeSupplier<Long, Exception> accountIdUnsafeSupplier) {

		accountId = null;

		_accountIdSupplier = () -> {
			try {
				return accountIdUnsafeSupplier.get();
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
	protected Long accountId;

	private Supplier<Long> _accountIdSupplier = () -> null;

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
	public String getChannelExternalReferenceCode() {
		if (channelExternalReferenceCode != null) {
			return channelExternalReferenceCode;
		}

		channelExternalReferenceCode =
			_channelExternalReferenceCodeSupplier.get();

		return channelExternalReferenceCode;
	}

	public void setChannelExternalReferenceCode(
		String channelExternalReferenceCode) {

		this.channelExternalReferenceCode = channelExternalReferenceCode;

		_channelExternalReferenceCodeSupplier =
			() -> channelExternalReferenceCode;
	}

	@JsonIgnore
	public void setChannelExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			channelExternalReferenceCodeUnsafeSupplier) {

		channelExternalReferenceCode = null;

		_channelExternalReferenceCodeSupplier = () -> {
			try {
				return channelExternalReferenceCodeUnsafeSupplier.get();
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
	protected String channelExternalReferenceCode;

	private Supplier<String> _channelExternalReferenceCodeSupplier = () -> null;

	@Schema
	public Long getChannelId() {
		if (channelId != null) {
			return channelId;
		}

		channelId = _channelIdSupplier.get();

		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;

		_channelIdSupplier = () -> channelId;
	}

	@JsonIgnore
	public void setChannelId(
		UnsafeSupplier<Long, Exception> channelIdUnsafeSupplier) {

		channelId = null;

		_channelIdSupplier = () -> {
			try {
				return channelIdUnsafeSupplier.get();
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
	protected Long channelId;

	private Supplier<Long> _channelIdSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30324")
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
	@Schema(example = "30324")
	public Long getShippingMethodId() {
		if (shippingMethodId != null) {
			return shippingMethodId;
		}

		shippingMethodId = _shippingMethodIdSupplier.get();

		return shippingMethodId;
	}

	public void setShippingMethodId(Long shippingMethodId) {
		this.shippingMethodId = shippingMethodId;

		_shippingMethodIdSupplier = () -> shippingMethodId;
	}

	@JsonIgnore
	public void setShippingMethodId(
		UnsafeSupplier<Long, Exception> shippingMethodIdUnsafeSupplier) {

		shippingMethodId = null;

		_shippingMethodIdSupplier = () -> {
			try {
				return shippingMethodIdUnsafeSupplier.get();
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
	protected Long shippingMethodId;

	private Supplier<Long> _shippingMethodIdSupplier = () -> null;

	@Schema
	public String getShippingMethodKey() {
		if (shippingMethodKey != null) {
			return shippingMethodKey;
		}

		shippingMethodKey = _shippingMethodKeySupplier.get();

		return shippingMethodKey;
	}

	public void setShippingMethodKey(String shippingMethodKey) {
		this.shippingMethodKey = shippingMethodKey;

		_shippingMethodKeySupplier = () -> shippingMethodKey;
	}

	@JsonIgnore
	public void setShippingMethodKey(
		UnsafeSupplier<String, Exception> shippingMethodKeyUnsafeSupplier) {

		shippingMethodKey = null;

		_shippingMethodKeySupplier = () -> {
			try {
				return shippingMethodKeyUnsafeSupplier.get();
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
	protected String shippingMethodKey;

	private Supplier<String> _shippingMethodKeySupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30324")
	public Long getShippingOptionId() {
		if (shippingOptionId != null) {
			return shippingOptionId;
		}

		shippingOptionId = _shippingOptionIdSupplier.get();

		return shippingOptionId;
	}

	public void setShippingOptionId(Long shippingOptionId) {
		this.shippingOptionId = shippingOptionId;

		_shippingOptionIdSupplier = () -> shippingOptionId;
	}

	@JsonIgnore
	public void setShippingOptionId(
		UnsafeSupplier<Long, Exception> shippingOptionIdUnsafeSupplier) {

		shippingOptionId = null;

		_shippingOptionIdSupplier = () -> {
			try {
				return shippingOptionIdUnsafeSupplier.get();
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
	protected Long shippingOptionId;

	private Supplier<Long> _shippingOptionIdSupplier = () -> null;

	@Schema
	public String getShippingOptionKey() {
		if (shippingOptionKey != null) {
			return shippingOptionKey;
		}

		shippingOptionKey = _shippingOptionKeySupplier.get();

		return shippingOptionKey;
	}

	public void setShippingOptionKey(String shippingOptionKey) {
		this.shippingOptionKey = shippingOptionKey;

		_shippingOptionKeySupplier = () -> shippingOptionKey;
	}

	@JsonIgnore
	public void setShippingOptionKey(
		UnsafeSupplier<String, Exception> shippingOptionKeyUnsafeSupplier) {

		shippingOptionKey = null;

		_shippingOptionKeySupplier = () -> {
			try {
				return shippingOptionKeyUnsafeSupplier.get();
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
	protected String shippingOptionKey;

	private Supplier<String> _shippingOptionKeySupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccountChannelShippingOption)) {
			return false;
		}

		AccountChannelShippingOption accountChannelShippingOption =
			(AccountChannelShippingOption)object;

		return Objects.equals(
			toString(), accountChannelShippingOption.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (accountExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(accountExternalReferenceCode));

			sb.append("\"");
		}

		if (accountId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountId\": ");

			sb.append(accountId);
		}

		if (actions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actions\": ");

			sb.append(_toJSON(actions));
		}

		if (channelExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"channelExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(channelExternalReferenceCode));

			sb.append("\"");
		}

		if (channelId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"channelId\": ");

			sb.append(channelId);
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (shippingMethodId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingMethodId\": ");

			sb.append(shippingMethodId);
		}

		if (shippingMethodKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingMethodKey\": ");

			sb.append("\"");

			sb.append(_escape(shippingMethodKey));

			sb.append("\"");
		}

		if (shippingOptionId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingOptionId\": ");

			sb.append(shippingOptionId);
		}

		if (shippingOptionKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingOptionKey\": ");

			sb.append("\"");

			sb.append(_escape(shippingOptionKey));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.account.dto.v1_0.AccountChannelShippingOption",
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