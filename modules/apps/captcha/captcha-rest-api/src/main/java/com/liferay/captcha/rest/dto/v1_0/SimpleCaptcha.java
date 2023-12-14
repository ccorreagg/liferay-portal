/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.captcha.rest.dto.v1_0;

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

import javax.validation.constraints.NotEmpty;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Loc Pham
 * @generated
 */
@Generated("")
@GraphQLName("SimpleCaptcha")
@JsonFilter("Liferay.Vulcan")
@Schema(requiredProperties = {"token"})
@XmlRootElement(name = "SimpleCaptcha")
public class SimpleCaptcha implements Serializable {

	public static SimpleCaptcha toDTO(String json) {
		return ObjectMapperUtil.readValue(SimpleCaptcha.class, json);
	}

	public static SimpleCaptcha unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(SimpleCaptcha.class, json);
	}

	@Schema
	public String getAnswer() {
		if (answer != null) {
			return answer;
		}

		answer = _answerSupplier.get();

		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;

		_answerSupplier = () -> answer;
	}

	@JsonIgnore
	public void setAnswer(
		UnsafeSupplier<String, Exception> answerUnsafeSupplier) {

		answer = null;

		_answerSupplier = () -> {
			try {
				return answerUnsafeSupplier.get();
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
	protected String answer;

	private Supplier<String> _answerSupplier = () -> null;

	@Schema
	public String getImage() {
		if (image != null) {
			return image;
		}

		image = _imageSupplier.get();

		return image;
	}

	public void setImage(String image) {
		this.image = image;

		_imageSupplier = () -> image;
	}

	@JsonIgnore
	public void setImage(
		UnsafeSupplier<String, Exception> imageUnsafeSupplier) {

		image = null;

		_imageSupplier = () -> {
			try {
				return imageUnsafeSupplier.get();
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
	protected String image;

	private Supplier<String> _imageSupplier = () -> null;

	@Schema
	public String getToken() {
		if (token != null) {
			return token;
		}

		token = _tokenSupplier.get();

		return token;
	}

	public void setToken(String token) {
		this.token = token;

		_tokenSupplier = () -> token;
	}

	@JsonIgnore
	public void setToken(
		UnsafeSupplier<String, Exception> tokenUnsafeSupplier) {

		token = null;

		_tokenSupplier = () -> {
			try {
				return tokenUnsafeSupplier.get();
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
	@NotEmpty
	protected String token;

	private Supplier<String> _tokenSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SimpleCaptcha)) {
			return false;
		}

		SimpleCaptcha simpleCaptcha = (SimpleCaptcha)object;

		return Objects.equals(toString(), simpleCaptcha.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (answer != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"answer\": ");

			sb.append("\"");

			sb.append(_escape(answer));

			sb.append("\"");
		}

		if (image != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"image\": ");

			sb.append("\"");

			sb.append(_escape(image));

			sb.append("\"");
		}

		if (token != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"token\": ");

			sb.append("\"");

			sb.append(_escape(token));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.captcha.rest.dto.v1_0.SimpleCaptcha",
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