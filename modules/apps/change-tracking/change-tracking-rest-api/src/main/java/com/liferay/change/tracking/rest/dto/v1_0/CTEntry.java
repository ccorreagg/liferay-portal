/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.change.tracking.rest.dto.v1_0;

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
 * @author David Truong
 * @generated
 */
@Generated("")
@GraphQLName("CTEntry")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "CTEntry")
public class CTEntry implements Serializable {

	public static CTEntry toDTO(String json) {
		return ObjectMapperUtil.readValue(CTEntry.class, json);
	}

	public static CTEntry unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(CTEntry.class, json);
	}

	@Schema
	@Valid
	public Map<String, Map<String, String>> getActions() {
		if (actions != null) {
			return actions;
		}

		actions = _actionsSupplier.get();

		return actions;
	}

	public void setActions(Map<String, Map<String, String>> actions) {
		this.actions = actions;

		_actionsSupplier = () -> actions;
	}

	@JsonIgnore
	public void setActions(
		UnsafeSupplier<Map<String, Map<String, String>>, Exception>
			actionsUnsafeSupplier) {

		actions = null;

		_actionsSupplier = () -> {
			try {
				return actionsUnsafeSupplier.get();
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
	protected Map<String, Map<String, String>> actions;

	private Supplier<Map<String, Map<String, String>>> _actionsSupplier =
		() -> null;

	@Schema
	public String getChangeType() {
		if (changeType != null) {
			return changeType;
		}

		changeType = _changeTypeSupplier.get();

		return changeType;
	}

	public void setChangeType(String changeType) {
		this.changeType = changeType;

		_changeTypeSupplier = () -> changeType;
	}

	@JsonIgnore
	public void setChangeType(
		UnsafeSupplier<String, Exception> changeTypeUnsafeSupplier) {

		changeType = null;

		_changeTypeSupplier = () -> {
			try {
				return changeTypeUnsafeSupplier.get();
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
	protected String changeType;

	private Supplier<String> _changeTypeSupplier = () -> null;

	@Schema
	public Long getCtCollectionId() {
		if (ctCollectionId != null) {
			return ctCollectionId;
		}

		ctCollectionId = _ctCollectionIdSupplier.get();

		return ctCollectionId;
	}

	public void setCtCollectionId(Long ctCollectionId) {
		this.ctCollectionId = ctCollectionId;

		_ctCollectionIdSupplier = () -> ctCollectionId;
	}

	@JsonIgnore
	public void setCtCollectionId(
		UnsafeSupplier<Long, Exception> ctCollectionIdUnsafeSupplier) {

		ctCollectionId = null;

		_ctCollectionIdSupplier = () -> {
			try {
				return ctCollectionIdUnsafeSupplier.get();
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
	protected Long ctCollectionId;

	private Supplier<Long> _ctCollectionIdSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateCreated;

	private Supplier<Date> _dateCreatedSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateModified;

	private Supplier<Date> _dateModifiedSupplier = () -> null;

	@Schema
	public Boolean getHideable() {
		if (hideable != null) {
			return hideable;
		}

		hideable = _hideableSupplier.get();

		return hideable;
	}

	public void setHideable(Boolean hideable) {
		this.hideable = hideable;

		_hideableSupplier = () -> hideable;
	}

	@JsonIgnore
	public void setHideable(
		UnsafeSupplier<Boolean, Exception> hideableUnsafeSupplier) {

		hideable = null;

		_hideableSupplier = () -> {
			try {
				return hideableUnsafeSupplier.get();
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
	protected Boolean hideable;

	private Supplier<Boolean> _hideableSupplier = () -> null;

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
	public Long getModelClassNameId() {
		if (modelClassNameId != null) {
			return modelClassNameId;
		}

		modelClassNameId = _modelClassNameIdSupplier.get();

		return modelClassNameId;
	}

	public void setModelClassNameId(Long modelClassNameId) {
		this.modelClassNameId = modelClassNameId;

		_modelClassNameIdSupplier = () -> modelClassNameId;
	}

	@JsonIgnore
	public void setModelClassNameId(
		UnsafeSupplier<Long, Exception> modelClassNameIdUnsafeSupplier) {

		modelClassNameId = null;

		_modelClassNameIdSupplier = () -> {
			try {
				return modelClassNameIdUnsafeSupplier.get();
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
	protected Long modelClassNameId;

	private Supplier<Long> _modelClassNameIdSupplier = () -> null;

	@Schema
	public Long getModelClassPK() {
		if (modelClassPK != null) {
			return modelClassPK;
		}

		modelClassPK = _modelClassPKSupplier.get();

		return modelClassPK;
	}

	public void setModelClassPK(Long modelClassPK) {
		this.modelClassPK = modelClassPK;

		_modelClassPKSupplier = () -> modelClassPK;
	}

	@JsonIgnore
	public void setModelClassPK(
		UnsafeSupplier<Long, Exception> modelClassPKUnsafeSupplier) {

		modelClassPK = null;

		_modelClassPKSupplier = () -> {
			try {
				return modelClassPKUnsafeSupplier.get();
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
	protected Long modelClassPK;

	private Supplier<Long> _modelClassPKSupplier = () -> null;

	@Schema
	public Long getOwnerId() {
		if (ownerId != null) {
			return ownerId;
		}

		ownerId = _ownerIdSupplier.get();

		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;

		_ownerIdSupplier = () -> ownerId;
	}

	@JsonIgnore
	public void setOwnerId(
		UnsafeSupplier<Long, Exception> ownerIdUnsafeSupplier) {

		ownerId = null;

		_ownerIdSupplier = () -> {
			try {
				return ownerIdUnsafeSupplier.get();
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
	protected Long ownerId;

	private Supplier<Long> _ownerIdSupplier = () -> null;

	@Schema
	public String getOwnerName() {
		if (ownerName != null) {
			return ownerName;
		}

		ownerName = _ownerNameSupplier.get();

		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;

		_ownerNameSupplier = () -> ownerName;
	}

	@JsonIgnore
	public void setOwnerName(
		UnsafeSupplier<String, Exception> ownerNameUnsafeSupplier) {

		ownerName = null;

		_ownerNameSupplier = () -> {
			try {
				return ownerNameUnsafeSupplier.get();
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
	protected String ownerName;

	private Supplier<String> _ownerNameSupplier = () -> null;

	@Schema
	public Long getSiteId() {
		if (siteId != null) {
			return siteId;
		}

		siteId = _siteIdSupplier.get();

		return siteId;
	}

	public void setSiteId(Long siteId) {
		this.siteId = siteId;

		_siteIdSupplier = () -> siteId;
	}

	@JsonIgnore
	public void setSiteId(
		UnsafeSupplier<Long, Exception> siteIdUnsafeSupplier) {

		siteId = null;

		_siteIdSupplier = () -> {
			try {
				return siteIdUnsafeSupplier.get();
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
	protected Long siteId;

	private Supplier<Long> _siteIdSupplier = () -> null;

	@Schema
	public String getSiteName() {
		if (siteName != null) {
			return siteName;
		}

		siteName = _siteNameSupplier.get();

		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;

		_siteNameSupplier = () -> siteName;
	}

	@JsonIgnore
	public void setSiteName(
		UnsafeSupplier<String, Exception> siteNameUnsafeSupplier) {

		siteName = null;

		_siteNameSupplier = () -> {
			try {
				return siteNameUnsafeSupplier.get();
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
	protected String siteName;

	private Supplier<String> _siteNameSupplier = () -> null;

	@Schema
	@Valid
	public Status getStatus() {
		if (status != null) {
			return status;
		}

		status = _statusSupplier.get();

		return status;
	}

	public void setStatus(Status status) {
		this.status = status;

		_statusSupplier = () -> status;
	}

	@JsonIgnore
	public void setStatus(
		UnsafeSupplier<Status, Exception> statusUnsafeSupplier) {

		status = null;

		_statusSupplier = () -> {
			try {
				return statusUnsafeSupplier.get();
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
	protected Status status;

	private Supplier<Status> _statusSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String title;

	private Supplier<String> _titleSupplier = () -> null;

	@Schema
	public String getTypeName() {
		if (typeName != null) {
			return typeName;
		}

		typeName = _typeNameSupplier.get();

		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;

		_typeNameSupplier = () -> typeName;
	}

	@JsonIgnore
	public void setTypeName(
		UnsafeSupplier<String, Exception> typeNameUnsafeSupplier) {

		typeName = null;

		_typeNameSupplier = () -> {
			try {
				return typeNameUnsafeSupplier.get();
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
	protected String typeName;

	private Supplier<String> _typeNameSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CTEntry)) {
			return false;
		}

		CTEntry ctEntry = (CTEntry)object;

		return Objects.equals(toString(), ctEntry.toString());
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

		if (actions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actions\": ");

			sb.append(_toJSON(actions));
		}

		if (changeType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"changeType\": ");

			sb.append("\"");

			sb.append(_escape(changeType));

			sb.append("\"");
		}

		if (ctCollectionId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ctCollectionId\": ");

			sb.append(ctCollectionId);
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

		if (hideable != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"hideable\": ");

			sb.append(hideable);
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (modelClassNameId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modelClassNameId\": ");

			sb.append(modelClassNameId);
		}

		if (modelClassPK != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modelClassPK\": ");

			sb.append(modelClassPK);
		}

		if (ownerId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ownerId\": ");

			sb.append(ownerId);
		}

		if (ownerName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ownerName\": ");

			sb.append("\"");

			sb.append(_escape(ownerName));

			sb.append("\"");
		}

		if (siteId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siteId\": ");

			sb.append(siteId);
		}

		if (siteName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siteName\": ");

			sb.append("\"");

			sb.append(_escape(siteName));

			sb.append("\"");
		}

		if (status != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append(String.valueOf(status));
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

		if (typeName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"typeName\": ");

			sb.append("\"");

			sb.append(_escape(typeName));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.change.tracking.rest.dto.v1_0.CTEntry",
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