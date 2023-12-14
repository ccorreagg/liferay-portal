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

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "Represents settings related with SEO.", value = "SEOSettings"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "SEOSettings")
public class SEOSettings implements Serializable {

	public static SEOSettings toDTO(String json) {
		return ObjectMapperUtil.readValue(SEOSettings.class, json);
	}

	public static SEOSettings unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(SEOSettings.class, json);
	}

	@Schema(description = "The canonical URL of the page, if it exists.")
	public String getCustomCanonicalURL() {
		if (customCanonicalURL != null) {
			return customCanonicalURL;
		}

		customCanonicalURL = _customCanonicalURLSupplier.get();

		return customCanonicalURL;
	}

	public void setCustomCanonicalURL(String customCanonicalURL) {
		this.customCanonicalURL = customCanonicalURL;

		_customCanonicalURLSupplier = () -> customCanonicalURL;
	}

	@JsonIgnore
	public void setCustomCanonicalURL(
		UnsafeSupplier<String, Exception> customCanonicalURLUnsafeSupplier) {

		customCanonicalURL = null;

		_customCanonicalURLSupplier = () -> {
			try {
				return customCanonicalURLUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The canonical URL of the page, if it exists.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String customCanonicalURL;

	private Supplier<String> _customCanonicalURLSupplier = () -> null;

	@Schema(
		description = "The localized canonical URL of the page, if it exists."
	)
	@Valid
	public Map<String, String> getCustomCanonicalURL_i18n() {
		if (customCanonicalURL_i18n != null) {
			return customCanonicalURL_i18n;
		}

		customCanonicalURL_i18n = _customCanonicalURL_i18nSupplier.get();

		return customCanonicalURL_i18n;
	}

	public void setCustomCanonicalURL_i18n(
		Map<String, String> customCanonicalURL_i18n) {

		this.customCanonicalURL_i18n = customCanonicalURL_i18n;

		_customCanonicalURL_i18nSupplier = () -> customCanonicalURL_i18n;
	}

	@JsonIgnore
	public void setCustomCanonicalURL_i18n(
		UnsafeSupplier<Map<String, String>, Exception>
			customCanonicalURL_i18nUnsafeSupplier) {

		customCanonicalURL_i18n = null;

		_customCanonicalURL_i18nSupplier = () -> {
			try {
				return customCanonicalURL_i18nUnsafeSupplier.get();
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
		description = "The localized canonical URL of the page, if it exists."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> customCanonicalURL_i18n;

	private Supplier<Map<String, String>> _customCanonicalURL_i18nSupplier =
		() -> null;

	@Schema(
		description = "The page's description to be used as summary for search engines."
	)
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

	@GraphQLField(
		description = "The page's description to be used as summary for search engines."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String description;

	private Supplier<String> _descriptionSupplier = () -> null;

	@Schema(
		description = "The localized descriptions of the page to be used as summary for search engines."
	)
	@Valid
	public Map<String, String> getDescription_i18n() {
		if (description_i18n != null) {
			return description_i18n;
		}

		description_i18n = _description_i18nSupplier.get();

		return description_i18n;
	}

	public void setDescription_i18n(Map<String, String> description_i18n) {
		this.description_i18n = description_i18n;

		_description_i18nSupplier = () -> description_i18n;
	}

	@JsonIgnore
	public void setDescription_i18n(
		UnsafeSupplier<Map<String, String>, Exception>
			description_i18nUnsafeSupplier) {

		description_i18n = null;

		_description_i18nSupplier = () -> {
			try {
				return description_i18nUnsafeSupplier.get();
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
		description = "The localized descriptions of the page to be used as summary for search engines."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> description_i18n;

	private Supplier<Map<String, String>> _description_i18nSupplier =
		() -> null;

	@Schema(description = "The page's main title to be used by search engines.")
	public String getHtmlTitle() {
		if (htmlTitle != null) {
			return htmlTitle;
		}

		htmlTitle = _htmlTitleSupplier.get();

		return htmlTitle;
	}

	public void setHtmlTitle(String htmlTitle) {
		this.htmlTitle = htmlTitle;

		_htmlTitleSupplier = () -> htmlTitle;
	}

	@JsonIgnore
	public void setHtmlTitle(
		UnsafeSupplier<String, Exception> htmlTitleUnsafeSupplier) {

		htmlTitle = null;

		_htmlTitleSupplier = () -> {
			try {
				return htmlTitleUnsafeSupplier.get();
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
		description = "The page's main title to be used by search engines."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String htmlTitle;

	private Supplier<String> _htmlTitleSupplier = () -> null;

	@Schema(
		description = "The localized main titles of the page to be used by search engines."
	)
	@Valid
	public Map<String, String> getHtmlTitle_i18n() {
		if (htmlTitle_i18n != null) {
			return htmlTitle_i18n;
		}

		htmlTitle_i18n = _htmlTitle_i18nSupplier.get();

		return htmlTitle_i18n;
	}

	public void setHtmlTitle_i18n(Map<String, String> htmlTitle_i18n) {
		this.htmlTitle_i18n = htmlTitle_i18n;

		_htmlTitle_i18nSupplier = () -> htmlTitle_i18n;
	}

	@JsonIgnore
	public void setHtmlTitle_i18n(
		UnsafeSupplier<Map<String, String>, Exception>
			htmlTitle_i18nUnsafeSupplier) {

		htmlTitle_i18n = null;

		_htmlTitle_i18nSupplier = () -> {
			try {
				return htmlTitle_i18nUnsafeSupplier.get();
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
		description = "The localized main titles of the page to be used by search engines."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> htmlTitle_i18n;

	private Supplier<Map<String, String>> _htmlTitle_i18nSupplier = () -> null;

	@Schema(
		description = "A tag telling search engines if and how they should crawl the page."
	)
	public String getRobots() {
		if (robots != null) {
			return robots;
		}

		robots = _robotsSupplier.get();

		return robots;
	}

	public void setRobots(String robots) {
		this.robots = robots;

		_robotsSupplier = () -> robots;
	}

	@JsonIgnore
	public void setRobots(
		UnsafeSupplier<String, Exception> robotsUnsafeSupplier) {

		robots = null;

		_robotsSupplier = () -> {
			try {
				return robotsUnsafeSupplier.get();
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
		description = "A tag telling search engines if and how they should crawl the page."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String robots;

	private Supplier<String> _robotsSupplier = () -> null;

	@Schema(
		description = "A localized tag telling search engines if and how they should crawl the page."
	)
	@Valid
	public Map<String, String> getRobots_i18n() {
		if (robots_i18n != null) {
			return robots_i18n;
		}

		robots_i18n = _robots_i18nSupplier.get();

		return robots_i18n;
	}

	public void setRobots_i18n(Map<String, String> robots_i18n) {
		this.robots_i18n = robots_i18n;

		_robots_i18nSupplier = () -> robots_i18n;
	}

	@JsonIgnore
	public void setRobots_i18n(
		UnsafeSupplier<Map<String, String>, Exception>
			robots_i18nUnsafeSupplier) {

		robots_i18n = null;

		_robots_i18nSupplier = () -> {
			try {
				return robots_i18nUnsafeSupplier.get();
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
		description = "A localized tag telling search engines if and how they should crawl the page."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> robots_i18n;

	private Supplier<Map<String, String>> _robots_i18nSupplier = () -> null;

	@Schema(
		description = "A list of target keywords of the page to be used by search engines."
	)
	public String getSeoKeywords() {
		if (seoKeywords != null) {
			return seoKeywords;
		}

		seoKeywords = _seoKeywordsSupplier.get();

		return seoKeywords;
	}

	public void setSeoKeywords(String seoKeywords) {
		this.seoKeywords = seoKeywords;

		_seoKeywordsSupplier = () -> seoKeywords;
	}

	@JsonIgnore
	public void setSeoKeywords(
		UnsafeSupplier<String, Exception> seoKeywordsUnsafeSupplier) {

		seoKeywords = null;

		_seoKeywordsSupplier = () -> {
			try {
				return seoKeywordsUnsafeSupplier.get();
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
		description = "A list of target keywords of the page to be used by search engines."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String seoKeywords;

	private Supplier<String> _seoKeywordsSupplier = () -> null;

	@Schema(
		description = "A list of localized target keywords of the page to be used by search engines."
	)
	@Valid
	public Map<String, String> getSeoKeywords_i18n() {
		if (seoKeywords_i18n != null) {
			return seoKeywords_i18n;
		}

		seoKeywords_i18n = _seoKeywords_i18nSupplier.get();

		return seoKeywords_i18n;
	}

	public void setSeoKeywords_i18n(Map<String, String> seoKeywords_i18n) {
		this.seoKeywords_i18n = seoKeywords_i18n;

		_seoKeywords_i18nSupplier = () -> seoKeywords_i18n;
	}

	@JsonIgnore
	public void setSeoKeywords_i18n(
		UnsafeSupplier<Map<String, String>, Exception>
			seoKeywords_i18nUnsafeSupplier) {

		seoKeywords_i18n = null;

		_seoKeywords_i18nSupplier = () -> {
			try {
				return seoKeywords_i18nUnsafeSupplier.get();
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
		description = "A list of localized target keywords of the page to be used by search engines."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> seoKeywords_i18n;

	private Supplier<Map<String, String>> _seoKeywords_i18nSupplier =
		() -> null;

	@Schema(description = "Represents settings related with the site map.")
	@Valid
	public SiteMapSettings getSiteMapSettings() {
		if (siteMapSettings != null) {
			return siteMapSettings;
		}

		siteMapSettings = _siteMapSettingsSupplier.get();

		return siteMapSettings;
	}

	public void setSiteMapSettings(SiteMapSettings siteMapSettings) {
		this.siteMapSettings = siteMapSettings;

		_siteMapSettingsSupplier = () -> siteMapSettings;
	}

	@JsonIgnore
	public void setSiteMapSettings(
		UnsafeSupplier<SiteMapSettings, Exception>
			siteMapSettingsUnsafeSupplier) {

		siteMapSettings = null;

		_siteMapSettingsSupplier = () -> {
			try {
				return siteMapSettingsUnsafeSupplier.get();
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
		description = "Represents settings related with the site map."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected SiteMapSettings siteMapSettings;

	private Supplier<SiteMapSettings> _siteMapSettingsSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SEOSettings)) {
			return false;
		}

		SEOSettings seoSettings = (SEOSettings)object;

		return Objects.equals(toString(), seoSettings.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (customCanonicalURL != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"customCanonicalURL\": ");

			sb.append("\"");

			sb.append(_escape(customCanonicalURL));

			sb.append("\"");
		}

		if (customCanonicalURL_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"customCanonicalURL_i18n\": ");

			sb.append(_toJSON(customCanonicalURL_i18n));
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

		if (description_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description_i18n\": ");

			sb.append(_toJSON(description_i18n));
		}

		if (htmlTitle != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"htmlTitle\": ");

			sb.append("\"");

			sb.append(_escape(htmlTitle));

			sb.append("\"");
		}

		if (htmlTitle_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"htmlTitle_i18n\": ");

			sb.append(_toJSON(htmlTitle_i18n));
		}

		if (robots != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"robots\": ");

			sb.append("\"");

			sb.append(_escape(robots));

			sb.append("\"");
		}

		if (robots_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"robots_i18n\": ");

			sb.append(_toJSON(robots_i18n));
		}

		if (seoKeywords != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"seoKeywords\": ");

			sb.append("\"");

			sb.append(_escape(seoKeywords));

			sb.append("\"");
		}

		if (seoKeywords_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"seoKeywords_i18n\": ");

			sb.append(_toJSON(seoKeywords_i18n));
		}

		if (siteMapSettings != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siteMapSettings\": ");

			sb.append(String.valueOf(siteMapSettings));
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.delivery.dto.v1_0.SEOSettings",
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