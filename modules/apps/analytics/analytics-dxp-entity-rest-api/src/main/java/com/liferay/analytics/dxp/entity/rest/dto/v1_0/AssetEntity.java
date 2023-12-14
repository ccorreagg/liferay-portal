/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.analytics.dxp.entity.rest.dto.v1_0;

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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Marcos Martins, Rachael Koestartyo, Riccardo Ferrari
 * @generated
 */
@Generated("")
@GraphQLName("AssetEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "AssetEntity")
public class AssetEntity implements Serializable {

	public static AssetEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(AssetEntity.class, json);
	}

	public static AssetEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(AssetEntity.class, json);
	}

	@Schema
	public Long[] getAssetCategoryIds() {
		if (assetCategoryIds != null) {
			return assetCategoryIds;
		}

		assetCategoryIds = _assetCategoryIdsSupplier.get();

		return assetCategoryIds;
	}

	public void setAssetCategoryIds(Long[] assetCategoryIds) {
		this.assetCategoryIds = assetCategoryIds;

		_assetCategoryIdsSupplier = () -> assetCategoryIds;
	}

	@JsonIgnore
	public void setAssetCategoryIds(
		UnsafeSupplier<Long[], Exception> assetCategoryIdsUnsafeSupplier) {

		assetCategoryIds = null;

		_assetCategoryIdsSupplier = () -> {
			try {
				return assetCategoryIdsUnsafeSupplier.get();
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
	protected Long[] assetCategoryIds;

	private Supplier<Long[]> _assetCategoryIdsSupplier = () -> null;

	@Schema
	public String[] getAssetTagNames() {
		if (assetTagNames != null) {
			return assetTagNames;
		}

		assetTagNames = _assetTagNamesSupplier.get();

		return assetTagNames;
	}

	public void setAssetTagNames(String[] assetTagNames) {
		this.assetTagNames = assetTagNames;

		_assetTagNamesSupplier = () -> assetTagNames;
	}

	@JsonIgnore
	public void setAssetTagNames(
		UnsafeSupplier<String[], Exception> assetTagNamesUnsafeSupplier) {

		assetTagNames = null;

		_assetTagNamesSupplier = () -> {
			try {
				return assetTagNamesUnsafeSupplier.get();
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
	protected String[] assetTagNames;

	private Supplier<String[]> _assetTagNamesSupplier = () -> null;

	@Schema
	public String getClassName() {
		if (className != null) {
			return className;
		}

		className = _classNameSupplier.get();

		return className;
	}

	public void setClassName(String className) {
		this.className = className;

		_classNameSupplier = () -> className;
	}

	@JsonIgnore
	public void setClassName(
		UnsafeSupplier<String, Exception> classNameUnsafeSupplier) {

		className = null;

		_classNameSupplier = () -> {
			try {
				return classNameUnsafeSupplier.get();
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
	protected String className;

	private Supplier<String> _classNameSupplier = () -> null;

	@Schema
	public Long getClassPK() {
		if (classPK != null) {
			return classPK;
		}

		classPK = _classPKSupplier.get();

		return classPK;
	}

	public void setClassPK(Long classPK) {
		this.classPK = classPK;

		_classPKSupplier = () -> classPK;
	}

	@JsonIgnore
	public void setClassPK(
		UnsafeSupplier<Long, Exception> classPKUnsafeSupplier) {

		classPK = null;

		_classPKSupplier = () -> {
			try {
				return classPKUnsafeSupplier.get();
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
	protected Long classPK;

	private Supplier<Long> _classPKSupplier = () -> null;

	@Schema
	public Long getClassTypeId() {
		if (classTypeId != null) {
			return classTypeId;
		}

		classTypeId = _classTypeIdSupplier.get();

		return classTypeId;
	}

	public void setClassTypeId(Long classTypeId) {
		this.classTypeId = classTypeId;

		_classTypeIdSupplier = () -> classTypeId;
	}

	@JsonIgnore
	public void setClassTypeId(
		UnsafeSupplier<Long, Exception> classTypeIdUnsafeSupplier) {

		classTypeId = null;

		_classTypeIdSupplier = () -> {
			try {
				return classTypeIdUnsafeSupplier.get();
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
	protected Long classTypeId;

	private Supplier<Long> _classTypeIdSupplier = () -> null;

	@Schema
	public String getClassTypeName() {
		if (classTypeName != null) {
			return classTypeName;
		}

		classTypeName = _classTypeNameSupplier.get();

		return classTypeName;
	}

	public void setClassTypeName(String classTypeName) {
		this.classTypeName = classTypeName;

		_classTypeNameSupplier = () -> classTypeName;
	}

	@JsonIgnore
	public void setClassTypeName(
		UnsafeSupplier<String, Exception> classTypeNameUnsafeSupplier) {

		classTypeName = null;

		_classTypeNameSupplier = () -> {
			try {
				return classTypeNameUnsafeSupplier.get();
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
	protected String classTypeName;

	private Supplier<String> _classTypeNameSupplier = () -> null;

	@Schema
	public Date getCreateDate() {
		if (createDate != null) {
			return createDate;
		}

		createDate = _createDateSupplier.get();

		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;

		_createDateSupplier = () -> createDate;
	}

	@JsonIgnore
	public void setCreateDate(
		UnsafeSupplier<Date, Exception> createDateUnsafeSupplier) {

		createDate = null;

		_createDateSupplier = () -> {
			try {
				return createDateUnsafeSupplier.get();
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
	protected Date createDate;

	private Supplier<Date> _createDateSupplier = () -> null;

	@Schema
	public Date getExpirationDate() {
		if (expirationDate != null) {
			return expirationDate;
		}

		expirationDate = _expirationDateSupplier.get();

		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;

		_expirationDateSupplier = () -> expirationDate;
	}

	@JsonIgnore
	public void setExpirationDate(
		UnsafeSupplier<Date, Exception> expirationDateUnsafeSupplier) {

		expirationDate = null;

		_expirationDateSupplier = () -> {
			try {
				return expirationDateUnsafeSupplier.get();
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
	protected Date expirationDate;

	private Supplier<Date> _expirationDateSupplier = () -> null;

	@Schema
	public Long getGroupId() {
		if (groupId != null) {
			return groupId;
		}

		groupId = _groupIdSupplier.get();

		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;

		_groupIdSupplier = () -> groupId;
	}

	@JsonIgnore
	public void setGroupId(
		UnsafeSupplier<Long, Exception> groupIdUnsafeSupplier) {

		groupId = null;

		_groupIdSupplier = () -> {
			try {
				return groupIdUnsafeSupplier.get();
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
	protected Long groupId;

	private Supplier<Long> _groupIdSupplier = () -> null;

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
	public Date getModifiedDate() {
		if (modifiedDate != null) {
			return modifiedDate;
		}

		modifiedDate = _modifiedDateSupplier.get();

		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;

		_modifiedDateSupplier = () -> modifiedDate;
	}

	@JsonIgnore
	public void setModifiedDate(
		UnsafeSupplier<Date, Exception> modifiedDateUnsafeSupplier) {

		modifiedDate = null;

		_modifiedDateSupplier = () -> {
			try {
				return modifiedDateUnsafeSupplier.get();
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
	protected Date modifiedDate;

	private Supplier<Date> _modifiedDateSupplier = () -> null;

	@Schema
	public Date getPublishDate() {
		if (publishDate != null) {
			return publishDate;
		}

		publishDate = _publishDateSupplier.get();

		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;

		_publishDateSupplier = () -> publishDate;
	}

	@JsonIgnore
	public void setPublishDate(
		UnsafeSupplier<Date, Exception> publishDateUnsafeSupplier) {

		publishDate = null;

		_publishDateSupplier = () -> {
			try {
				return publishDateUnsafeSupplier.get();
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
	protected Date publishDate;

	private Supplier<Date> _publishDateSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String title;

	private Supplier<String> _titleSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AssetEntity)) {
			return false;
		}

		AssetEntity assetEntity = (AssetEntity)object;

		return Objects.equals(toString(), assetEntity.toString());
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

		if (assetCategoryIds != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assetCategoryIds\": ");

			sb.append("[");

			for (int i = 0; i < assetCategoryIds.length; i++) {
				sb.append(assetCategoryIds[i]);

				if ((i + 1) < assetCategoryIds.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (assetTagNames != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assetTagNames\": ");

			sb.append("[");

			for (int i = 0; i < assetTagNames.length; i++) {
				sb.append("\"");

				sb.append(_escape(assetTagNames[i]));

				sb.append("\"");

				if ((i + 1) < assetTagNames.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (className != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"className\": ");

			sb.append("\"");

			sb.append(_escape(className));

			sb.append("\"");
		}

		if (classPK != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"classPK\": ");

			sb.append(classPK);
		}

		if (classTypeId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"classTypeId\": ");

			sb.append(classTypeId);
		}

		if (classTypeName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"classTypeName\": ");

			sb.append("\"");

			sb.append(_escape(classTypeName));

			sb.append("\"");
		}

		if (createDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"createDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(createDate));

			sb.append("\"");
		}

		if (expirationDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"expirationDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(expirationDate));

			sb.append("\"");
		}

		if (groupId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"groupId\": ");

			sb.append(groupId);
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (modifiedDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modifiedDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(modifiedDate));

			sb.append("\"");
		}

		if (publishDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"publishDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(publishDate));

			sb.append("\"");
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
		defaultValue = "com.liferay.analytics.dxp.entity.rest.dto.v1_0.AssetEntity",
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