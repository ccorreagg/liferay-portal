/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.delivery.dto.v1_0;

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
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "Represents a template made up of CSS, HTML, and JavaScript used to build Content Pages.",
	value = "Fragment"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Fragment")
public class Fragment implements Serializable {

	public static Fragment toDTO(String json) {
		return ObjectMapperUtil.readValue(Fragment.class, json);
	}

	public static Fragment unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Fragment.class, json);
	}

	@Schema(description = "The collection name this fragment belongs to.")
	public String getCollectionName() {
		if (collectionName != null) {
			return collectionName;
		}

		collectionName = _collectionNameSupplier.get();

		return collectionName;
	}

	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;

		_collectionNameSupplier = () -> collectionName;
	}

	@JsonIgnore
	public void setCollectionName(
		UnsafeSupplier<String, Exception> collectionNameUnsafeSupplier) {

		collectionName = null;

		_collectionNameSupplier = () -> {
			try {
				return collectionNameUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The collection name this fragment belongs to.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String collectionName;

	private Supplier<String> _collectionNameSupplier = () -> null;

	@Schema(description = "The fragment's key.")
	public String getKey() {
		if (key != null) {
			return key;
		}

		key = _keySupplier.get();

		return key;
	}

	public void setKey(String key) {
		this.key = key;

		_keySupplier = () -> key;
	}

	@JsonIgnore
	public void setKey(UnsafeSupplier<String, Exception> keyUnsafeSupplier) {
		key = null;

		_keySupplier = () -> {
			try {
				return keyUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's key.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String key;

	private Supplier<String> _keySupplier = () -> null;

	@Schema(description = "The fragment's name.")
	public String getName() {
		if (name != null) {
			return name;
		}

		name = _nameSupplier.get();

		return name;
	}

	public void setName(String name) {
		this.name = name;

		_nameSupplier = () -> name;
	}

	@JsonIgnore
	public void setName(UnsafeSupplier<String, Exception> nameUnsafeSupplier) {
		name = null;

		_nameSupplier = () -> {
			try {
				return nameUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's name.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String name;

	private Supplier<String> _nameSupplier = () -> null;

	@Schema(
		description = "The key of the site to which this fragment is scoped."
	)
	public String getSiteKey() {
		if (siteKey != null) {
			return siteKey;
		}

		siteKey = _siteKeySupplier.get();

		return siteKey;
	}

	public void setSiteKey(String siteKey) {
		this.siteKey = siteKey;

		_siteKeySupplier = () -> siteKey;
	}

	@JsonIgnore
	public void setSiteKey(
		UnsafeSupplier<String, Exception> siteKeyUnsafeSupplier) {

		siteKey = null;

		_siteKeySupplier = () -> {
			try {
				return siteKeyUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(
		description = "The key of the site to which this fragment is scoped."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String siteKey;

	private Supplier<String> _siteKeySupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Fragment)) {
			return false;
		}

		Fragment fragment = (Fragment)object;

		return Objects.equals(toString(), fragment.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (collectionName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"collectionName\": ");

			sb.append("\"");

			sb.append(_escape(collectionName));

			sb.append("\"");
		}

		if (key != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"key\": ");

			sb.append("\"");

			sb.append(_escape(key));

			sb.append("\"");
		}

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(name));

			sb.append("\"");
		}

		if (siteKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siteKey\": ");

			sb.append("\"");

			sb.append(_escape(siteKey));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.delivery.dto.v1_0.Fragment",
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