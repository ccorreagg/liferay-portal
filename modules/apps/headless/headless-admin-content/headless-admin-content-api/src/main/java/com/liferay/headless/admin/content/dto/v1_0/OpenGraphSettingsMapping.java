/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.content.dto.v1_0;

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
	description = "Specific settings related to Open Graph",
	value = "OpenGraphSettingsMapping"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "OpenGraphSettingsMapping")
public class OpenGraphSettingsMapping implements Serializable {

	public static OpenGraphSettingsMapping toDTO(String json) {
		return ObjectMapperUtil.readValue(OpenGraphSettingsMapping.class, json);
	}

	public static OpenGraphSettingsMapping unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			OpenGraphSettingsMapping.class, json);
	}

	@Schema(
		description = "Field of the content type that will be used as the description"
	)
	public String getDescriptionMappingFieldKey() {
		if (descriptionMappingFieldKey != null) {
			return descriptionMappingFieldKey;
		}

		descriptionMappingFieldKey = _descriptionMappingFieldKeySupplier.get();

		return descriptionMappingFieldKey;
	}

	public void setDescriptionMappingFieldKey(
		String descriptionMappingFieldKey) {

		this.descriptionMappingFieldKey = descriptionMappingFieldKey;

		_descriptionMappingFieldKeySupplier = () -> descriptionMappingFieldKey;
	}

	@JsonIgnore
	public void setDescriptionMappingFieldKey(
		UnsafeSupplier<String, Exception>
			descriptionMappingFieldKeyUnsafeSupplier) {

		descriptionMappingFieldKey = null;

		_descriptionMappingFieldKeySupplier = () -> {
			try {
				return descriptionMappingFieldKeyUnsafeSupplier.get();
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
		description = "Field of the content type that will be used as the description"
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String descriptionMappingFieldKey;

	private Supplier<String> _descriptionMappingFieldKeySupplier = () -> null;

	@Schema(
		description = "Field of the content type that will be used as the alt property of the image"
	)
	public String getImageAltMappingFieldKey() {
		if (imageAltMappingFieldKey != null) {
			return imageAltMappingFieldKey;
		}

		imageAltMappingFieldKey = _imageAltMappingFieldKeySupplier.get();

		return imageAltMappingFieldKey;
	}

	public void setImageAltMappingFieldKey(String imageAltMappingFieldKey) {
		this.imageAltMappingFieldKey = imageAltMappingFieldKey;

		_imageAltMappingFieldKeySupplier = () -> imageAltMappingFieldKey;
	}

	@JsonIgnore
	public void setImageAltMappingFieldKey(
		UnsafeSupplier<String, Exception>
			imageAltMappingFieldKeyUnsafeSupplier) {

		imageAltMappingFieldKey = null;

		_imageAltMappingFieldKeySupplier = () -> {
			try {
				return imageAltMappingFieldKeyUnsafeSupplier.get();
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
		description = "Field of the content type that will be used as the alt property of the image"
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String imageAltMappingFieldKey;

	private Supplier<String> _imageAltMappingFieldKeySupplier = () -> null;

	@Schema(
		description = "Field of the content type that will be used as the image"
	)
	public String getImageMappingFieldKey() {
		if (imageMappingFieldKey != null) {
			return imageMappingFieldKey;
		}

		imageMappingFieldKey = _imageMappingFieldKeySupplier.get();

		return imageMappingFieldKey;
	}

	public void setImageMappingFieldKey(String imageMappingFieldKey) {
		this.imageMappingFieldKey = imageMappingFieldKey;

		_imageMappingFieldKeySupplier = () -> imageMappingFieldKey;
	}

	@JsonIgnore
	public void setImageMappingFieldKey(
		UnsafeSupplier<String, Exception> imageMappingFieldKeyUnsafeSupplier) {

		imageMappingFieldKey = null;

		_imageMappingFieldKeySupplier = () -> {
			try {
				return imageMappingFieldKeyUnsafeSupplier.get();
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
		description = "Field of the content type that will be used as the image"
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String imageMappingFieldKey;

	private Supplier<String> _imageMappingFieldKeySupplier = () -> null;

	@Schema(
		description = "Field of the content type that will be used as the title"
	)
	public String getTitleMappingFieldKey() {
		if (titleMappingFieldKey != null) {
			return titleMappingFieldKey;
		}

		titleMappingFieldKey = _titleMappingFieldKeySupplier.get();

		return titleMappingFieldKey;
	}

	public void setTitleMappingFieldKey(String titleMappingFieldKey) {
		this.titleMappingFieldKey = titleMappingFieldKey;

		_titleMappingFieldKeySupplier = () -> titleMappingFieldKey;
	}

	@JsonIgnore
	public void setTitleMappingFieldKey(
		UnsafeSupplier<String, Exception> titleMappingFieldKeyUnsafeSupplier) {

		titleMappingFieldKey = null;

		_titleMappingFieldKeySupplier = () -> {
			try {
				return titleMappingFieldKeyUnsafeSupplier.get();
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
		description = "Field of the content type that will be used as the title"
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String titleMappingFieldKey;

	private Supplier<String> _titleMappingFieldKeySupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OpenGraphSettingsMapping)) {
			return false;
		}

		OpenGraphSettingsMapping openGraphSettingsMapping =
			(OpenGraphSettingsMapping)object;

		return Objects.equals(toString(), openGraphSettingsMapping.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (descriptionMappingFieldKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descriptionMappingFieldKey\": ");

			sb.append("\"");

			sb.append(_escape(descriptionMappingFieldKey));

			sb.append("\"");
		}

		if (imageAltMappingFieldKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"imageAltMappingFieldKey\": ");

			sb.append("\"");

			sb.append(_escape(imageAltMappingFieldKey));

			sb.append("\"");
		}

		if (imageMappingFieldKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"imageMappingFieldKey\": ");

			sb.append("\"");

			sb.append(_escape(imageMappingFieldKey));

			sb.append("\"");
		}

		if (titleMappingFieldKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"titleMappingFieldKey\": ");

			sb.append("\"");

			sb.append(_escape(titleMappingFieldKey));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.admin.content.dto.v1_0.OpenGraphSettingsMapping",
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