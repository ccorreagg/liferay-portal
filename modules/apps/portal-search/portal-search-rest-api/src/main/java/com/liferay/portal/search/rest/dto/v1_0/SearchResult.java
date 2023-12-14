/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.rest.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Petteri Karttunen
 * @generated
 */
@Generated("")
@GraphQLName("SearchResult")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "SearchResult")
public class SearchResult implements Serializable {

	public static SearchResult toDTO(String json) {
		return ObjectMapperUtil.readValue(SearchResult.class, json);
	}

	public static SearchResult unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(SearchResult.class, json);
	}

	@Schema(description = "The last time the item was changed.")
	public Date getDateModified() {
		if (dateModified != null) {
			return dateModified;
		}

		dateModified = _dateModifiedSupplier.get();

		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;

		_dateModifiedSupplier = () -> dateModified;
	}

	@JsonIgnore
	public void setDateModified(
		UnsafeSupplier<Date, Exception> dateModifiedUnsafeSupplier) {

		dateModified = null;

		_dateModifiedSupplier = () -> {
			try {
				return dateModifiedUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The last time the item was changed.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date dateModified;

	private Supplier<Date> _dateModifiedSupplier = () -> null;

	@Schema(description = "The item's description.")
	public String getDescription() {
		if (description != null) {
			return description;
		}

		description = _descriptionSupplier.get();

		return description;
	}

	public void setDescription(String description) {
		this.description = description;

		_descriptionSupplier = () -> description;
	}

	@JsonIgnore
	public void setDescription(
		UnsafeSupplier<String, Exception> descriptionUnsafeSupplier) {

		description = null;

		_descriptionSupplier = () -> {
			try {
				return descriptionUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The item's description.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String description;

	private Supplier<String> _descriptionSupplier = () -> null;

	@Schema
	@Valid
	public Object getEmbedded() {
		if (embedded != null) {
			return embedded;
		}

		embedded = _embeddedSupplier.get();

		return embedded;
	}

	public void setEmbedded(Object embedded) {
		this.embedded = embedded;

		_embeddedSupplier = () -> embedded;
	}

	@JsonIgnore
	public void setEmbedded(
		UnsafeSupplier<Object, Exception> embeddedUnsafeSupplier) {

		embedded = null;

		_embeddedSupplier = () -> {
			try {
				return embeddedUnsafeSupplier.get();
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
	protected Object embedded;

	private Supplier<Object> _embeddedSupplier = () -> null;

	@Schema(description = "The link to the embedded item.")
	public String getItemURL() {
		if (itemURL != null) {
			return itemURL;
		}

		itemURL = _itemURLSupplier.get();

		return itemURL;
	}

	public void setItemURL(String itemURL) {
		this.itemURL = itemURL;

		_itemURLSupplier = () -> itemURL;
	}

	@JsonIgnore
	public void setItemURL(
		UnsafeSupplier<String, Exception> itemURLUnsafeSupplier) {

		itemURL = null;

		_itemURLSupplier = () -> {
			try {
				return itemURLUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The link to the embedded item.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String itemURL;

	private Supplier<String> _itemURLSupplier = () -> null;

	@Schema(description = "The item's score.")
	@Valid
	public Float getScore() {
		if (score != null) {
			return score;
		}

		score = _scoreSupplier.get();

		return score;
	}

	public void setScore(Float score) {
		this.score = score;

		_scoreSupplier = () -> score;
	}

	@JsonIgnore
	public void setScore(UnsafeSupplier<Float, Exception> scoreUnsafeSupplier) {
		score = null;

		_scoreSupplier = () -> {
			try {
				return scoreUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The item's score.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Float score;

	private Supplier<Float> _scoreSupplier = () -> null;

	@Schema(description = "The item's title.")
	public String getTitle() {
		if (title != null) {
			return title;
		}

		title = _titleSupplier.get();

		return title;
	}

	public void setTitle(String title) {
		this.title = title;

		_titleSupplier = () -> title;
	}

	@JsonIgnore
	public void setTitle(
		UnsafeSupplier<String, Exception> titleUnsafeSupplier) {

		title = null;

		_titleSupplier = () -> {
			try {
				return titleUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The item's title.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String title;

	private Supplier<String> _titleSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SearchResult)) {
			return false;
		}

		SearchResult searchResult = (SearchResult)object;

		return Objects.equals(toString(), searchResult.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (dateModified != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateModified\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dateModified));

			sb.append("\"");
		}

		if (description != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(description));

			sb.append("\"");
		}

		if (embedded != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"embedded\": ");

			if (embedded instanceof Map) {
				sb.append(
					JSONFactoryUtil.createJSONObject((Map<?, ?>)embedded));
			}
			else if (embedded instanceof String) {
				sb.append("\"");
				sb.append(_escape((String)embedded));
				sb.append("\"");
			}
			else {
				sb.append(embedded);
			}
		}

		if (itemURL != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"itemURL\": ");

			sb.append("\"");

			sb.append(_escape(itemURL));

			sb.append("\"");
		}

		if (score != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"score\": ");

			sb.append(score);
		}

		if (title != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(title));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.portal.search.rest.dto.v1_0.SearchResult",
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