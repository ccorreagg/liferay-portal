/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.user.dto.v1_0;

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
	description = "Represents the site where the content is created. Properties follow the [WebSite](https://schema.org/WebSite) specification.",
	value = "Site"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Site")
public class Site implements Serializable {

	public static Site toDTO(String json) {
		return ObjectMapperUtil.readValue(Site.class, json);
	}

	public static Site unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Site.class, json);
	}

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String[] availableLanguages;

	private Supplier<String[]> _availableLanguagesSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Creator creator;

	private Supplier<Creator> _creatorSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String description;

	private Supplier<String> _descriptionSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> description_i18n;

	private Supplier<Map<String, String>> _description_i18nSupplier =
		() -> null;

	@Schema
	public String getDescriptiveName() {
		if (descriptiveName != null) {
			return descriptiveName;
		}

		descriptiveName = _descriptiveNameSupplier.get();

		return descriptiveName;
	}

	public void setDescriptiveName(String descriptiveName) {
		this.descriptiveName = descriptiveName;

		_descriptiveNameSupplier = () -> descriptiveName;
	}

	@JsonIgnore
	public void setDescriptiveName(
		UnsafeSupplier<String, Exception> descriptiveNameUnsafeSupplier) {

		descriptiveName = null;

		_descriptiveNameSupplier = () -> {
			try {
				return descriptiveNameUnsafeSupplier.get();
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
	protected String descriptiveName;

	private Supplier<String> _descriptiveNameSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, String> getDescriptiveName_i18n() {
		if (descriptiveName_i18n != null) {
			return descriptiveName_i18n;
		}

		descriptiveName_i18n = _descriptiveName_i18nSupplier.get();

		return descriptiveName_i18n;
	}

	public void setDescriptiveName_i18n(
		Map<String, String> descriptiveName_i18n) {

		this.descriptiveName_i18n = descriptiveName_i18n;

		_descriptiveName_i18nSupplier = () -> descriptiveName_i18n;
	}

	@JsonIgnore
	public void setDescriptiveName_i18n(
		UnsafeSupplier<Map<String, String>, Exception>
			descriptiveName_i18nUnsafeSupplier) {

		descriptiveName_i18n = null;

		_descriptiveName_i18nSupplier = () -> {
			try {
				return descriptiveName_i18nUnsafeSupplier.get();
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
	protected Map<String, String> descriptiveName_i18n;

	private Supplier<Map<String, String>> _descriptiveName_i18nSupplier =
		() -> null;

	@Schema
	public String getFriendlyUrlPath() {
		if (friendlyUrlPath != null) {
			return friendlyUrlPath;
		}

		friendlyUrlPath = _friendlyUrlPathSupplier.get();

		return friendlyUrlPath;
	}

	public void setFriendlyUrlPath(String friendlyUrlPath) {
		this.friendlyUrlPath = friendlyUrlPath;

		_friendlyUrlPathSupplier = () -> friendlyUrlPath;
	}

	@JsonIgnore
	public void setFriendlyUrlPath(
		UnsafeSupplier<String, Exception> friendlyUrlPathUnsafeSupplier) {

		friendlyUrlPath = null;

		_friendlyUrlPathSupplier = () -> {
			try {
				return friendlyUrlPathUnsafeSupplier.get();
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
	protected String friendlyUrlPath;

	private Supplier<String> _friendlyUrlPathSupplier = () -> null;

	@Schema
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

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String key;

	private Supplier<String> _keySupplier = () -> null;

	@Schema
	public String getMembershipType() {
		if (membershipType != null) {
			return membershipType;
		}

		membershipType = _membershipTypeSupplier.get();

		return membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;

		_membershipTypeSupplier = () -> membershipType;
	}

	@JsonIgnore
	public void setMembershipType(
		UnsafeSupplier<String, Exception> membershipTypeUnsafeSupplier) {

		membershipType = null;

		_membershipTypeSupplier = () -> {
			try {
				return membershipTypeUnsafeSupplier.get();
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
	protected String membershipType;

	private Supplier<String> _membershipTypeSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String name;

	private Supplier<String> _nameSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> name_i18n;

	private Supplier<Map<String, String>> _name_i18nSupplier = () -> null;

	@Schema
	public Long getParentSiteId() {
		if (parentSiteId != null) {
			return parentSiteId;
		}

		parentSiteId = _parentSiteIdSupplier.get();

		return parentSiteId;
	}

	public void setParentSiteId(Long parentSiteId) {
		this.parentSiteId = parentSiteId;

		_parentSiteIdSupplier = () -> parentSiteId;
	}

	@JsonIgnore
	public void setParentSiteId(
		UnsafeSupplier<Long, Exception> parentSiteIdUnsafeSupplier) {

		parentSiteId = null;

		_parentSiteIdSupplier = () -> {
			try {
				return parentSiteIdUnsafeSupplier.get();
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
	protected Long parentSiteId;

	private Supplier<Long> _parentSiteIdSupplier = () -> null;

	@Schema
	@Valid
	public Site[] getSites() {
		if (sites != null) {
			return sites;
		}

		sites = _sitesSupplier.get();

		return sites;
	}

	public void setSites(Site[] sites) {
		this.sites = sites;

		_sitesSupplier = () -> sites;
	}

	@JsonIgnore
	public void setSites(
		UnsafeSupplier<Site[], Exception> sitesUnsafeSupplier) {

		sites = null;

		_sitesSupplier = () -> {
			try {
				return sitesUnsafeSupplier.get();
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
	protected Site[] sites;

	private Supplier<Site[]> _sitesSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Site)) {
			return false;
		}

		Site site = (Site)object;

		return Objects.equals(toString(), site.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

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

		if (creator != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"creator\": ");

			sb.append(String.valueOf(creator));
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

		if (descriptiveName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descriptiveName\": ");

			sb.append("\"");

			sb.append(_escape(descriptiveName));

			sb.append("\"");
		}

		if (descriptiveName_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descriptiveName_i18n\": ");

			sb.append(_toJSON(descriptiveName_i18n));
		}

		if (friendlyUrlPath != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"friendlyUrlPath\": ");

			sb.append("\"");

			sb.append(_escape(friendlyUrlPath));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
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

		if (membershipType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"membershipType\": ");

			sb.append("\"");

			sb.append(_escape(membershipType));

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

		if (name_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name_i18n\": ");

			sb.append(_toJSON(name_i18n));
		}

		if (parentSiteId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parentSiteId\": ");

			sb.append(parentSiteId);
		}

		if (sites != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sites\": ");

			sb.append("[");

			for (int i = 0; i < sites.length; i++) {
				sb.append(String.valueOf(sites[i]));

				if ((i + 1) < sites.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.admin.user.dto.v1_0.Site",
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