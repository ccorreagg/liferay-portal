/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.site.dto.v1_0;

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
import javax.validation.constraints.NotEmpty;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Rubén Pulido
 * @generated
 */
@Generated("")
@GraphQLName(description = "Represents the site being created.", value = "Site")
@JsonFilter("Liferay.Vulcan")
@Schema(
	description = "Represents the site being created.",
	requiredProperties = {"name"}
)
@XmlRootElement(name = "Site")
public class Site implements Serializable {

	public static Site toDTO(String json) {
		return ObjectMapperUtil.readValue(Site.class, json);
	}

	public static Site unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Site.class, json);
	}

	@Schema(description = "The site's external reference code.")
	public String getExternalReferenceCode() {
		if (externalReferenceCode != null) {
			return externalReferenceCode;
		}

		externalReferenceCode = _externalReferenceCodeSupplier.get();

		return externalReferenceCode;
	}

	public void setExternalReferenceCode(String externalReferenceCode) {
		this.externalReferenceCode = externalReferenceCode;

		_externalReferenceCodeSupplier = () -> externalReferenceCode;
	}

	@JsonIgnore
	public void setExternalReferenceCode(
		UnsafeSupplier<String, Exception> externalReferenceCodeUnsafeSupplier) {

		externalReferenceCode = null;

		_externalReferenceCodeSupplier = () -> {
			try {
				return externalReferenceCodeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The site's external reference code.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String externalReferenceCode;

	private Supplier<String> _externalReferenceCodeSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String key;

	private Supplier<String> _keySupplier = () -> null;

	@Schema(description = "The default value is open.")
	@Valid
	public MembershipType getMembershipType() {
		if (membershipType != null) {
			return membershipType;
		}

		membershipType = _membershipTypeSupplier.get();

		return membershipType;
	}

	@JsonIgnore
	public String getMembershipTypeAsString() {
		if (membershipType == null) {
			return null;
		}

		return membershipType.toString();
	}

	public void setMembershipType(MembershipType membershipType) {
		this.membershipType = membershipType;

		_membershipTypeSupplier = () -> membershipType;
	}

	@JsonIgnore
	public void setMembershipType(
		UnsafeSupplier<MembershipType, Exception>
			membershipTypeUnsafeSupplier) {

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

	@GraphQLField(description = "The default value is open.")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	protected MembershipType membershipType;

	private Supplier<MembershipType> _membershipTypeSupplier = () -> null;

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
	@NotEmpty
	protected String name;

	private Supplier<String> _nameSupplier = () -> null;

	@Schema
	public String getParentSiteKey() {
		if (parentSiteKey != null) {
			return parentSiteKey;
		}

		parentSiteKey = _parentSiteKeySupplier.get();

		return parentSiteKey;
	}

	public void setParentSiteKey(String parentSiteKey) {
		this.parentSiteKey = parentSiteKey;

		_parentSiteKeySupplier = () -> parentSiteKey;
	}

	@JsonIgnore
	public void setParentSiteKey(
		UnsafeSupplier<String, Exception> parentSiteKeyUnsafeSupplier) {

		parentSiteKey = null;

		_parentSiteKeySupplier = () -> {
			try {
				return parentSiteKeyUnsafeSupplier.get();
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
	protected String parentSiteKey;

	private Supplier<String> _parentSiteKeySupplier = () -> null;

	@Schema
	public String getTemplateKey() {
		if (templateKey != null) {
			return templateKey;
		}

		templateKey = _templateKeySupplier.get();

		return templateKey;
	}

	public void setTemplateKey(String templateKey) {
		this.templateKey = templateKey;

		_templateKeySupplier = () -> templateKey;
	}

	@JsonIgnore
	public void setTemplateKey(
		UnsafeSupplier<String, Exception> templateKeyUnsafeSupplier) {

		templateKey = null;

		_templateKeySupplier = () -> {
			try {
				return templateKeyUnsafeSupplier.get();
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
	protected String templateKey;

	private Supplier<String> _templateKeySupplier = () -> null;

	@Schema
	@Valid
	public TemplateType getTemplateType() {
		if (templateType != null) {
			return templateType;
		}

		templateType = _templateTypeSupplier.get();

		return templateType;
	}

	@JsonIgnore
	public String getTemplateTypeAsString() {
		if (templateType == null) {
			return null;
		}

		return templateType.toString();
	}

	public void setTemplateType(TemplateType templateType) {
		this.templateType = templateType;

		_templateTypeSupplier = () -> templateType;
	}

	@JsonIgnore
	public void setTemplateType(
		UnsafeSupplier<TemplateType, Exception> templateTypeUnsafeSupplier) {

		templateType = null;

		_templateTypeSupplier = () -> {
			try {
				return templateTypeUnsafeSupplier.get();
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
	protected TemplateType templateType;

	private Supplier<TemplateType> _templateTypeSupplier = () -> null;

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

		if (externalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"externalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(externalReferenceCode));

			sb.append("\"");
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

			sb.append(membershipType);

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

		if (parentSiteKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parentSiteKey\": ");

			sb.append("\"");

			sb.append(_escape(parentSiteKey));

			sb.append("\"");
		}

		if (templateKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"templateKey\": ");

			sb.append("\"");

			sb.append(_escape(templateKey));

			sb.append("\"");
		}

		if (templateType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"templateType\": ");

			sb.append("\"");

			sb.append(templateType);

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.site.dto.v1_0.Site",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("MembershipType")
	public static enum MembershipType {

		OPEN("open"), PRIVATE("private"), RESTRICTED("restricted");

		@JsonCreator
		public static MembershipType create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (MembershipType membershipType : values()) {
				if (Objects.equals(membershipType.getValue(), value)) {
					return membershipType;
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

		private MembershipType(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("TemplateType")
	public static enum TemplateType {

		SITE_INITIALIZER("site-initializer"), SITE_TEMPLATE("site-template");

		@JsonCreator
		public static TemplateType create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (TemplateType templateType : values()) {
				if (Objects.equals(templateType.getValue(), value)) {
					return templateType;
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

		private TemplateType(String value) {
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