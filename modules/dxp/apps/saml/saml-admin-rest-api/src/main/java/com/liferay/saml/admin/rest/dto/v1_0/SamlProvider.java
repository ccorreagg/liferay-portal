/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.saml.admin.rest.dto.v1_0;

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
 * @author Stian Sigvartsen
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "The complete configuration of this SAML Provider.",
	value = "SamlProvider"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "SamlProvider")
public class SamlProvider implements Serializable {

	public static SamlProvider toDTO(String json) {
		return ObjectMapperUtil.readValue(SamlProvider.class, json);
	}

	public static SamlProvider unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(SamlProvider.class, json);
	}

	@Schema
	public Boolean getEnabled() {
		if (enabled != null) {
			return enabled;
		}

		enabled = _enabledSupplier.get();

		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;

		_enabledSupplier = () -> enabled;
	}

	@JsonIgnore
	public void setEnabled(
		UnsafeSupplier<Boolean, Exception> enabledUnsafeSupplier) {

		enabled = null;

		_enabledSupplier = () -> {
			try {
				return enabledUnsafeSupplier.get();
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
	protected Boolean enabled;

	private Supplier<Boolean> _enabledSupplier = () -> null;

	@Schema
	public String getEntityId() {
		if (entityId != null) {
			return entityId;
		}

		entityId = _entityIdSupplier.get();

		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;

		_entityIdSupplier = () -> entityId;
	}

	@JsonIgnore
	public void setEntityId(
		UnsafeSupplier<String, Exception> entityIdUnsafeSupplier) {

		entityId = null;

		_entityIdSupplier = () -> {
			try {
				return entityIdUnsafeSupplier.get();
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
	protected String entityId;

	private Supplier<String> _entityIdSupplier = () -> null;

	@Schema
	@Valid
	public Idp getIdp() {
		if (idp != null) {
			return idp;
		}

		idp = _idpSupplier.get();

		return idp;
	}

	public void setIdp(Idp idp) {
		this.idp = idp;

		_idpSupplier = () -> idp;
	}

	@JsonIgnore
	public void setIdp(UnsafeSupplier<Idp, Exception> idpUnsafeSupplier) {
		idp = null;

		_idpSupplier = () -> {
			try {
				return idpUnsafeSupplier.get();
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
	protected Idp idp;

	private Supplier<Idp> _idpSupplier = () -> null;

	@Schema
	public String getKeyStoreCredentialPassword() {
		if (keyStoreCredentialPassword != null) {
			return keyStoreCredentialPassword;
		}

		keyStoreCredentialPassword = _keyStoreCredentialPasswordSupplier.get();

		return keyStoreCredentialPassword;
	}

	public void setKeyStoreCredentialPassword(
		String keyStoreCredentialPassword) {

		this.keyStoreCredentialPassword = keyStoreCredentialPassword;

		_keyStoreCredentialPasswordSupplier = () -> keyStoreCredentialPassword;
	}

	@JsonIgnore
	public void setKeyStoreCredentialPassword(
		UnsafeSupplier<String, Exception>
			keyStoreCredentialPasswordUnsafeSupplier) {

		keyStoreCredentialPassword = null;

		_keyStoreCredentialPasswordSupplier = () -> {
			try {
				return keyStoreCredentialPasswordUnsafeSupplier.get();
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
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	protected String keyStoreCredentialPassword;

	private Supplier<String> _keyStoreCredentialPasswordSupplier = () -> null;

	@Schema
	@Valid
	public Role getRole() {
		if (role != null) {
			return role;
		}

		role = _roleSupplier.get();

		return role;
	}

	@JsonIgnore
	public String getRoleAsString() {
		if (role == null) {
			return null;
		}

		return role.toString();
	}

	public void setRole(Role role) {
		this.role = role;

		_roleSupplier = () -> role;
	}

	@JsonIgnore
	public void setRole(UnsafeSupplier<Role, Exception> roleUnsafeSupplier) {
		role = null;

		_roleSupplier = () -> {
			try {
				return roleUnsafeSupplier.get();
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
	protected Role role;

	private Supplier<Role> _roleSupplier = () -> null;

	@Schema
	public Boolean getSignMetadata() {
		if (signMetadata != null) {
			return signMetadata;
		}

		signMetadata = _signMetadataSupplier.get();

		return signMetadata;
	}

	public void setSignMetadata(Boolean signMetadata) {
		this.signMetadata = signMetadata;

		_signMetadataSupplier = () -> signMetadata;
	}

	@JsonIgnore
	public void setSignMetadata(
		UnsafeSupplier<Boolean, Exception> signMetadataUnsafeSupplier) {

		signMetadata = null;

		_signMetadataSupplier = () -> {
			try {
				return signMetadataUnsafeSupplier.get();
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
	protected Boolean signMetadata;

	private Supplier<Boolean> _signMetadataSupplier = () -> null;

	@Schema
	@Valid
	public Sp getSp() {
		if (sp != null) {
			return sp;
		}

		sp = _spSupplier.get();

		return sp;
	}

	public void setSp(Sp sp) {
		this.sp = sp;

		_spSupplier = () -> sp;
	}

	@JsonIgnore
	public void setSp(UnsafeSupplier<Sp, Exception> spUnsafeSupplier) {
		sp = null;

		_spSupplier = () -> {
			try {
				return spUnsafeSupplier.get();
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
	protected Sp sp;

	private Supplier<Sp> _spSupplier = () -> null;

	@Schema
	public Boolean getSslRequired() {
		if (sslRequired != null) {
			return sslRequired;
		}

		sslRequired = _sslRequiredSupplier.get();

		return sslRequired;
	}

	public void setSslRequired(Boolean sslRequired) {
		this.sslRequired = sslRequired;

		_sslRequiredSupplier = () -> sslRequired;
	}

	@JsonIgnore
	public void setSslRequired(
		UnsafeSupplier<Boolean, Exception> sslRequiredUnsafeSupplier) {

		sslRequired = null;

		_sslRequiredSupplier = () -> {
			try {
				return sslRequiredUnsafeSupplier.get();
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
	protected Boolean sslRequired;

	private Supplier<Boolean> _sslRequiredSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SamlProvider)) {
			return false;
		}

		SamlProvider samlProvider = (SamlProvider)object;

		return Objects.equals(toString(), samlProvider.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (enabled != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"enabled\": ");

			sb.append(enabled);
		}

		if (entityId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"entityId\": ");

			sb.append("\"");

			sb.append(_escape(entityId));

			sb.append("\"");
		}

		if (idp != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"idp\": ");

			sb.append(String.valueOf(idp));
		}

		if (keyStoreCredentialPassword != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"keyStoreCredentialPassword\": ");

			sb.append("\"");

			sb.append(_escape(keyStoreCredentialPassword));

			sb.append("\"");
		}

		if (role != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"role\": ");

			sb.append("\"");

			sb.append(role);

			sb.append("\"");
		}

		if (signMetadata != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"signMetadata\": ");

			sb.append(signMetadata);
		}

		if (sp != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sp\": ");

			sb.append(String.valueOf(sp));
		}

		if (sslRequired != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sslRequired\": ");

			sb.append(sslRequired);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.saml.admin.rest.dto.v1_0.SamlProvider",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("Role")
	public static enum Role {

		IDP("idp"), SP("sp");

		@JsonCreator
		public static Role create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (Role role : values()) {
				if (Objects.equals(role.getValue(), value)) {
					return role;
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

		private Role(String value) {
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