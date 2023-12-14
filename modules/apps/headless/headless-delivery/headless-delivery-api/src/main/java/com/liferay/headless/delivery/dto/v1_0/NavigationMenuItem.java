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
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "Represents a navigation menu item.",
	value = "NavigationMenuItem"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "NavigationMenuItem")
public class NavigationMenuItem implements Serializable {

	public static NavigationMenuItem toDTO(String json) {
		return ObjectMapperUtil.readValue(NavigationMenuItem.class, json);
	}

	public static NavigationMenuItem unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(NavigationMenuItem.class, json);
	}

	@Schema(
		description = "The list of languages the navigation menu item has a translation for."
	)
	public String[] getAvailableLanguages() {
		if (availableLanguages != null) {
			return availableLanguages;
		}

		availableLanguages = _availableLanguagesSupplier.get();

		return availableLanguages;
	}

	public void setAvailableLanguages(String[] availableLanguages) {
		this.availableLanguages = availableLanguages;

		_availableLanguagesSupplier = () -> availableLanguages;
	}

	@JsonIgnore
	public void setAvailableLanguages(
		UnsafeSupplier<String[], Exception> availableLanguagesUnsafeSupplier) {

		availableLanguages = null;

		_availableLanguagesSupplier = () -> {
			try {
				return availableLanguagesUnsafeSupplier.get();
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
		description = "The list of languages the navigation menu item has a translation for."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String[] availableLanguages;

	private Supplier<String[]> _availableLanguagesSupplier = () -> null;

	@Schema(description = "The navigation menu item's content API REST URL.")
	public String getContentURL() {
		if (contentURL != null) {
			return contentURL;
		}

		contentURL = _contentURLSupplier.get();

		return contentURL;
	}

	public void setContentURL(String contentURL) {
		this.contentURL = contentURL;

		_contentURLSupplier = () -> contentURL;
	}

	@JsonIgnore
	public void setContentURL(
		UnsafeSupplier<String, Exception> contentURLUnsafeSupplier) {

		contentURL = null;

		_contentURLSupplier = () -> {
			try {
				return contentURLUnsafeSupplier.get();
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
		description = "The navigation menu item's content API REST URL."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String contentURL;

	private Supplier<String> _contentURLSupplier = () -> null;

	@Schema(description = "The navigation menu item's creator.")
	@Valid
	public Creator getCreator() {
		if (creator != null) {
			return creator;
		}

		creator = _creatorSupplier.get();

		return creator;
	}

	public void setCreator(Creator creator) {
		this.creator = creator;

		_creatorSupplier = () -> creator;
	}

	@JsonIgnore
	public void setCreator(
		UnsafeSupplier<Creator, Exception> creatorUnsafeSupplier) {

		creator = null;

		_creatorSupplier = () -> {
			try {
				return creatorUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The navigation menu item's creator.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Creator creator;

	private Supplier<Creator> _creatorSupplier = () -> null;

	@Schema(description = "The navigation menu item's creation date.")
	public Date getDateCreated() {
		if (dateCreated != null) {
			return dateCreated;
		}

		dateCreated = _dateCreatedSupplier.get();

		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;

		_dateCreatedSupplier = () -> dateCreated;
	}

	@JsonIgnore
	public void setDateCreated(
		UnsafeSupplier<Date, Exception> dateCreatedUnsafeSupplier) {

		dateCreated = null;

		_dateCreatedSupplier = () -> {
			try {
				return dateCreatedUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The navigation menu item's creation date.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateCreated;

	private Supplier<Date> _dateCreatedSupplier = () -> null;

	@Schema(description = "The last time the navigation menu item changed.")
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

	@GraphQLField(
		description = "The last time the navigation menu item changed."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateModified;

	private Supplier<Date> _dateModifiedSupplier = () -> null;

	@Schema(description = "The navigation menu item's ID.")
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

	@GraphQLField(description = "The navigation menu item's ID.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema(description = "The link to a page on the server.")
	public String getLink() {
		if (link != null) {
			return link;
		}

		link = _linkSupplier.get();

		return link;
	}

	public void setLink(String link) {
		this.link = link;

		_linkSupplier = () -> link;
	}

	@JsonIgnore
	public void setLink(UnsafeSupplier<String, Exception> linkUnsafeSupplier) {
		link = null;

		_linkSupplier = () -> {
			try {
				return linkUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The link to a page on the server.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String link;

	private Supplier<String> _linkSupplier = () -> null;

	@Schema(description = "The localized links to a page on the server.")
	@Valid
	public Map<String, String> getLink_i18n() {
		if (link_i18n != null) {
			return link_i18n;
		}

		link_i18n = _link_i18nSupplier.get();

		return link_i18n;
	}

	public void setLink_i18n(Map<String, String> link_i18n) {
		this.link_i18n = link_i18n;

		_link_i18nSupplier = () -> link_i18n;
	}

	@JsonIgnore
	public void setLink_i18n(
		UnsafeSupplier<Map<String, String>, Exception>
			link_i18nUnsafeSupplier) {

		link_i18n = null;

		_link_i18nSupplier = () -> {
			try {
				return link_i18nUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The localized links to a page on the server.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> link_i18n;

	private Supplier<Map<String, String>> _link_i18nSupplier = () -> null;

	@Schema(description = "The navigation menu item's name.")
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

	@GraphQLField(description = "The navigation menu item's name.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String name;

	private Supplier<String> _nameSupplier = () -> null;

	@Schema(description = "The localized navigation menu item's names.")
	@Valid
	public Map<String, String> getName_i18n() {
		if (name_i18n != null) {
			return name_i18n;
		}

		name_i18n = _name_i18nSupplier.get();

		return name_i18n;
	}

	public void setName_i18n(Map<String, String> name_i18n) {
		this.name_i18n = name_i18n;

		_name_i18nSupplier = () -> name_i18n;
	}

	@JsonIgnore
	public void setName_i18n(
		UnsafeSupplier<Map<String, String>, Exception>
			name_i18nUnsafeSupplier) {

		name_i18n = null;

		_name_i18nSupplier = () -> {
			try {
				return name_i18nUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The localized navigation menu item's names.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> name_i18n;

	private Supplier<Map<String, String>> _name_i18nSupplier = () -> null;

	@Schema(
		description = "The navigation menu items this navigation menu item has."
	)
	@Valid
	public NavigationMenuItem[] getNavigationMenuItems() {
		if (navigationMenuItems != null) {
			return navigationMenuItems;
		}

		navigationMenuItems = _navigationMenuItemsSupplier.get();

		return navigationMenuItems;
	}

	public void setNavigationMenuItems(
		NavigationMenuItem[] navigationMenuItems) {

		this.navigationMenuItems = navigationMenuItems;

		_navigationMenuItemsSupplier = () -> navigationMenuItems;
	}

	@JsonIgnore
	public void setNavigationMenuItems(
		UnsafeSupplier<NavigationMenuItem[], Exception>
			navigationMenuItemsUnsafeSupplier) {

		navigationMenuItems = null;

		_navigationMenuItemsSupplier = () -> {
			try {
				return navigationMenuItemsUnsafeSupplier.get();
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
		description = "The navigation menu items this navigation menu item has."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected NavigationMenuItem[] navigationMenuItems;

	private Supplier<NavigationMenuItem[]> _navigationMenuItemsSupplier =
		() -> null;

	@Schema(description = "The ID of the navigation menu item's parent.")
	public Long getParentNavigationMenuId() {
		if (parentNavigationMenuId != null) {
			return parentNavigationMenuId;
		}

		parentNavigationMenuId = _parentNavigationMenuIdSupplier.get();

		return parentNavigationMenuId;
	}

	public void setParentNavigationMenuId(Long parentNavigationMenuId) {
		this.parentNavigationMenuId = parentNavigationMenuId;

		_parentNavigationMenuIdSupplier = () -> parentNavigationMenuId;
	}

	@JsonIgnore
	public void setParentNavigationMenuId(
		UnsafeSupplier<Long, Exception> parentNavigationMenuIdUnsafeSupplier) {

		parentNavigationMenuId = null;

		_parentNavigationMenuIdSupplier = () -> {
			try {
				return parentNavigationMenuIdUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The ID of the navigation menu item's parent.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long parentNavigationMenuId;

	private Supplier<Long> _parentNavigationMenuIdSupplier = () -> null;

	@Schema(description = "The navigation menu item's linked site page URL.")
	public String getSitePageURL() {
		if (sitePageURL != null) {
			return sitePageURL;
		}

		sitePageURL = _sitePageURLSupplier.get();

		return sitePageURL;
	}

	public void setSitePageURL(String sitePageURL) {
		this.sitePageURL = sitePageURL;

		_sitePageURLSupplier = () -> sitePageURL;
	}

	@JsonIgnore
	public void setSitePageURL(
		UnsafeSupplier<String, Exception> sitePageURLUnsafeSupplier) {

		sitePageURL = null;

		_sitePageURLSupplier = () -> {
			try {
				return sitePageURLUnsafeSupplier.get();
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
		description = "The navigation menu item's linked site page URL."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String sitePageURL;

	private Supplier<String> _sitePageURLSupplier = () -> null;

	@Schema(description = "The navigation menu item's type.")
	public String getType() {
		if (type != null) {
			return type;
		}

		type = _typeSupplier.get();

		return type;
	}

	public void setType(String type) {
		this.type = type;

		_typeSupplier = () -> type;
	}

	@JsonIgnore
	public void setType(UnsafeSupplier<String, Exception> typeUnsafeSupplier) {
		type = null;

		_typeSupplier = () -> {
			try {
				return typeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The navigation menu item's type.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String type;

	private Supplier<String> _typeSupplier = () -> null;

	@Schema(description = "The navigation menu item's linked URL.")
	public String getUrl() {
		if (url != null) {
			return url;
		}

		url = _urlSupplier.get();

		return url;
	}

	public void setUrl(String url) {
		this.url = url;

		_urlSupplier = () -> url;
	}

	@JsonIgnore
	public void setUrl(UnsafeSupplier<String, Exception> urlUnsafeSupplier) {
		url = null;

		_urlSupplier = () -> {
			try {
				return urlUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The navigation menu item's linked URL.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String url;

	private Supplier<String> _urlSupplier = () -> null;

	@Schema
	public Boolean getUseCustomName() {
		if (useCustomName != null) {
			return useCustomName;
		}

		useCustomName = _useCustomNameSupplier.get();

		return useCustomName;
	}

	public void setUseCustomName(Boolean useCustomName) {
		this.useCustomName = useCustomName;

		_useCustomNameSupplier = () -> useCustomName;
	}

	@JsonIgnore
	public void setUseCustomName(
		UnsafeSupplier<Boolean, Exception> useCustomNameUnsafeSupplier) {

		useCustomName = null;

		_useCustomNameSupplier = () -> {
			try {
				return useCustomNameUnsafeSupplier.get();
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
	protected Boolean useCustomName;

	private Supplier<Boolean> _useCustomNameSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NavigationMenuItem)) {
			return false;
		}

		NavigationMenuItem navigationMenuItem = (NavigationMenuItem)object;

		return Objects.equals(toString(), navigationMenuItem.toString());
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

		if (availableLanguages != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"availableLanguages\": ");

			sb.append("[");

			for (int i = 0; i < availableLanguages.length; i++) {
				sb.append("\"");

				sb.append(_escape(availableLanguages[i]));

				sb.append("\"");

				if ((i + 1) < availableLanguages.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (contentURL != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"contentURL\": ");

			sb.append("\"");

			sb.append(_escape(contentURL));

			sb.append("\"");
		}

		if (creator != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"creator\": ");

			sb.append(String.valueOf(creator));
		}

		if (dateCreated != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateCreated\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dateCreated));

			sb.append("\"");
		}

		if (dateModified != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateModified\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dateModified));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (link != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"link\": ");

			sb.append("\"");

			sb.append(_escape(link));

			sb.append("\"");
		}

		if (link_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"link_i18n\": ");

			sb.append(_toJSON(link_i18n));
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

		if (name_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name_i18n\": ");

			sb.append(_toJSON(name_i18n));
		}

		if (navigationMenuItems != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"navigationMenuItems\": ");

			sb.append("[");

			for (int i = 0; i < navigationMenuItems.length; i++) {
				sb.append(String.valueOf(navigationMenuItems[i]));

				if ((i + 1) < navigationMenuItems.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (parentNavigationMenuId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parentNavigationMenuId\": ");

			sb.append(parentNavigationMenuId);
		}

		if (sitePageURL != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sitePageURL\": ");

			sb.append("\"");

			sb.append(_escape(sitePageURL));

			sb.append("\"");
		}

		if (type != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"type\": ");

			sb.append("\"");

			sb.append(_escape(type));

			sb.append("\"");
		}

		if (url != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"url\": ");

			sb.append("\"");

			sb.append(_escape(url));

			sb.append("\"");
		}

		if (useCustomName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"useCustomName\": ");

			sb.append(useCustomName);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.delivery.dto.v1_0.NavigationMenuItem",
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