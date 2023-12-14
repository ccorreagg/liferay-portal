/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.saml.admin.rest.dto.v1_0;

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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Stian Sigvartsen
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "Configuration of the SAML provider's SP capability.",
	value = "Sp"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Sp")
public class Sp implements Serializable {

	public static Sp toDTO(String json) {
		return ObjectMapperUtil.readValue(Sp.class, json);
	}

	public static Sp unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Sp.class, json);
	}

	@Schema
	public Boolean getAllowShowingTheLoginPortlet() {
		if (allowShowingTheLoginPortlet != null) {
			return allowShowingTheLoginPortlet;
		}

		allowShowingTheLoginPortlet =
			_allowShowingTheLoginPortletSupplier.get();

		return allowShowingTheLoginPortlet;
	}

	public void setAllowShowingTheLoginPortlet(
		Boolean allowShowingTheLoginPortlet) {

		this.allowShowingTheLoginPortlet = allowShowingTheLoginPortlet;

		_allowShowingTheLoginPortletSupplier =
			() -> allowShowingTheLoginPortlet;
	}

	@JsonIgnore
	public void setAllowShowingTheLoginPortlet(
		UnsafeSupplier<Boolean, Exception>
			allowShowingTheLoginPortletUnsafeSupplier) {

		allowShowingTheLoginPortlet = null;

		_allowShowingTheLoginPortletSupplier = () -> {
			try {
				return allowShowingTheLoginPortletUnsafeSupplier.get();
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
	protected Boolean allowShowingTheLoginPortlet;

	private Supplier<Boolean> _allowShowingTheLoginPortletSupplier = () -> null;

	@Schema
	public Boolean getAssertionSignatureRequired() {
		if (assertionSignatureRequired != null) {
			return assertionSignatureRequired;
		}

		assertionSignatureRequired = _assertionSignatureRequiredSupplier.get();

		return assertionSignatureRequired;
	}

	public void setAssertionSignatureRequired(
		Boolean assertionSignatureRequired) {

		this.assertionSignatureRequired = assertionSignatureRequired;

		_assertionSignatureRequiredSupplier = () -> assertionSignatureRequired;
	}

	@JsonIgnore
	public void setAssertionSignatureRequired(
		UnsafeSupplier<Boolean, Exception>
			assertionSignatureRequiredUnsafeSupplier) {

		assertionSignatureRequired = null;

		_assertionSignatureRequiredSupplier = () -> {
			try {
				return assertionSignatureRequiredUnsafeSupplier.get();
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
	protected Boolean assertionSignatureRequired;

	private Supplier<Boolean> _assertionSignatureRequiredSupplier = () -> null;

	@Schema
	public Long getClockSkew() {
		if (clockSkew != null) {
			return clockSkew;
		}

		clockSkew = _clockSkewSupplier.get();

		return clockSkew;
	}

	public void setClockSkew(Long clockSkew) {
		this.clockSkew = clockSkew;

		_clockSkewSupplier = () -> clockSkew;
	}

	@JsonIgnore
	public void setClockSkew(
		UnsafeSupplier<Long, Exception> clockSkewUnsafeSupplier) {

		clockSkew = null;

		_clockSkewSupplier = () -> {
			try {
				return clockSkewUnsafeSupplier.get();
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
	protected Long clockSkew;

	private Supplier<Long> _clockSkewSupplier = () -> null;

	@Schema
	public String getKeyStoreEncryptionCredentialPassword() {
		if (keyStoreEncryptionCredentialPassword != null) {
			return keyStoreEncryptionCredentialPassword;
		}

		keyStoreEncryptionCredentialPassword =
			_keyStoreEncryptionCredentialPasswordSupplier.get();

		return keyStoreEncryptionCredentialPassword;
	}

	public void setKeyStoreEncryptionCredentialPassword(
		String keyStoreEncryptionCredentialPassword) {

		this.keyStoreEncryptionCredentialPassword =
			keyStoreEncryptionCredentialPassword;

		_keyStoreEncryptionCredentialPasswordSupplier =
			() -> keyStoreEncryptionCredentialPassword;
	}

	@JsonIgnore
	public void setKeyStoreEncryptionCredentialPassword(
		UnsafeSupplier<String, Exception>
			keyStoreEncryptionCredentialPasswordUnsafeSupplier) {

		keyStoreEncryptionCredentialPassword = null;

		_keyStoreEncryptionCredentialPasswordSupplier = () -> {
			try {
				return keyStoreEncryptionCredentialPasswordUnsafeSupplier.get();
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
	protected String keyStoreEncryptionCredentialPassword;

	private Supplier<String> _keyStoreEncryptionCredentialPasswordSupplier =
		() -> null;

	@Schema
	public Boolean getLdapImportEnabled() {
		if (ldapImportEnabled != null) {
			return ldapImportEnabled;
		}

		ldapImportEnabled = _ldapImportEnabledSupplier.get();

		return ldapImportEnabled;
	}

	public void setLdapImportEnabled(Boolean ldapImportEnabled) {
		this.ldapImportEnabled = ldapImportEnabled;

		_ldapImportEnabledSupplier = () -> ldapImportEnabled;
	}

	@JsonIgnore
	public void setLdapImportEnabled(
		UnsafeSupplier<Boolean, Exception> ldapImportEnabledUnsafeSupplier) {

		ldapImportEnabled = null;

		_ldapImportEnabledSupplier = () -> {
			try {
				return ldapImportEnabledUnsafeSupplier.get();
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
	protected Boolean ldapImportEnabled;

	private Supplier<Boolean> _ldapImportEnabledSupplier = () -> null;

	@Schema
	public Boolean getSignAuthnRequest() {
		if (signAuthnRequest != null) {
			return signAuthnRequest;
		}

		signAuthnRequest = _signAuthnRequestSupplier.get();

		return signAuthnRequest;
	}

	public void setSignAuthnRequest(Boolean signAuthnRequest) {
		this.signAuthnRequest = signAuthnRequest;

		_signAuthnRequestSupplier = () -> signAuthnRequest;
	}

	@JsonIgnore
	public void setSignAuthnRequest(
		UnsafeSupplier<Boolean, Exception> signAuthnRequestUnsafeSupplier) {

		signAuthnRequest = null;

		_signAuthnRequestSupplier = () -> {
			try {
				return signAuthnRequestUnsafeSupplier.get();
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
	protected Boolean signAuthnRequest;

	private Supplier<Boolean> _signAuthnRequestSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Sp)) {
			return false;
		}

		Sp sp = (Sp)object;

		return Objects.equals(toString(), sp.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (allowShowingTheLoginPortlet != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"allowShowingTheLoginPortlet\": ");

			sb.append(allowShowingTheLoginPortlet);
		}

		if (assertionSignatureRequired != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assertionSignatureRequired\": ");

			sb.append(assertionSignatureRequired);
		}

		if (clockSkew != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"clockSkew\": ");

			sb.append(clockSkew);
		}

		if (keyStoreEncryptionCredentialPassword != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"keyStoreEncryptionCredentialPassword\": ");

			sb.append("\"");

			sb.append(_escape(keyStoreEncryptionCredentialPassword));

			sb.append("\"");
		}

		if (ldapImportEnabled != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ldapImportEnabled\": ");

			sb.append(ldapImportEnabled);
		}

		if (signAuthnRequest != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"signAuthnRequest\": ");

			sb.append(signAuthnRequest);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.saml.admin.rest.dto.v1_0.Sp",
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