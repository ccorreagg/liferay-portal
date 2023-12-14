/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.notification.rest.dto.v1_0;

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
 * @author Gabriel Albuquerque
 * @generated
 */
@Generated("")
@GraphQLName("NotificationTemplate")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "NotificationTemplate")
public class NotificationTemplate implements Serializable {

	public static NotificationTemplate toDTO(String json) {
		return ObjectMapperUtil.readValue(NotificationTemplate.class, json);
	}

	public static NotificationTemplate unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			NotificationTemplate.class, json);
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
	public String[] getAttachmentObjectFieldExternalReferenceCodes() {
		if (attachmentObjectFieldExternalReferenceCodes != null) {
			return attachmentObjectFieldExternalReferenceCodes;
		}

		attachmentObjectFieldExternalReferenceCodes =
			_attachmentObjectFieldExternalReferenceCodesSupplier.get();

		return attachmentObjectFieldExternalReferenceCodes;
	}

	public void setAttachmentObjectFieldExternalReferenceCodes(
		String[] attachmentObjectFieldExternalReferenceCodes) {

		this.attachmentObjectFieldExternalReferenceCodes =
			attachmentObjectFieldExternalReferenceCodes;

		_attachmentObjectFieldExternalReferenceCodesSupplier =
			() -> attachmentObjectFieldExternalReferenceCodes;
	}

	@JsonIgnore
	public void setAttachmentObjectFieldExternalReferenceCodes(
		UnsafeSupplier<String[], Exception>
			attachmentObjectFieldExternalReferenceCodesUnsafeSupplier) {

		attachmentObjectFieldExternalReferenceCodes = null;

		_attachmentObjectFieldExternalReferenceCodesSupplier = () -> {
			try {
				return attachmentObjectFieldExternalReferenceCodesUnsafeSupplier.
					get();
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
	protected String[] attachmentObjectFieldExternalReferenceCodes;

	private Supplier<String[]>
		_attachmentObjectFieldExternalReferenceCodesSupplier = () -> null;

	@Schema
	public Long[] getAttachmentObjectFieldIds() {
		if (attachmentObjectFieldIds != null) {
			return attachmentObjectFieldIds;
		}

		attachmentObjectFieldIds = _attachmentObjectFieldIdsSupplier.get();

		return attachmentObjectFieldIds;
	}

	public void setAttachmentObjectFieldIds(Long[] attachmentObjectFieldIds) {
		this.attachmentObjectFieldIds = attachmentObjectFieldIds;

		_attachmentObjectFieldIdsSupplier = () -> attachmentObjectFieldIds;
	}

	@JsonIgnore
	public void setAttachmentObjectFieldIds(
		UnsafeSupplier<Long[], Exception>
			attachmentObjectFieldIdsUnsafeSupplier) {

		attachmentObjectFieldIds = null;

		_attachmentObjectFieldIdsSupplier = () -> {
			try {
				return attachmentObjectFieldIdsUnsafeSupplier.get();
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
	protected Long[] attachmentObjectFieldIds;

	private Supplier<Long[]> _attachmentObjectFieldIdsSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, String> getBody() {
		if (body != null) {
			return body;
		}

		body = _bodySupplier.get();

		return body;
	}

	public void setBody(Map<String, String> body) {
		this.body = body;

		_bodySupplier = () -> body;
	}

	@JsonIgnore
	public void setBody(
		UnsafeSupplier<Map<String, String>, Exception> bodyUnsafeSupplier) {

		body = null;

		_bodySupplier = () -> {
			try {
				return bodyUnsafeSupplier.get();
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
	protected Map<String, String> body;

	private Supplier<Map<String, String>> _bodySupplier = () -> null;

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
	public EditorType getEditorType() {
		if (editorType != null) {
			return editorType;
		}

		editorType = _editorTypeSupplier.get();

		return editorType;
	}

	@JsonIgnore
	public String getEditorTypeAsString() {
		if (editorType == null) {
			return null;
		}

		return editorType.toString();
	}

	public void setEditorType(EditorType editorType) {
		this.editorType = editorType;

		_editorTypeSupplier = () -> editorType;
	}

	@JsonIgnore
	public void setEditorType(
		UnsafeSupplier<EditorType, Exception> editorTypeUnsafeSupplier) {

		editorType = null;

		_editorTypeSupplier = () -> {
			try {
				return editorTypeUnsafeSupplier.get();
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
	protected EditorType editorType;

	private Supplier<EditorType> _editorTypeSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String externalReferenceCode;

	private Supplier<String> _externalReferenceCodeSupplier = () -> null;

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
	public String getObjectDefinitionExternalReferenceCode() {
		if (objectDefinitionExternalReferenceCode != null) {
			return objectDefinitionExternalReferenceCode;
		}

		objectDefinitionExternalReferenceCode =
			_objectDefinitionExternalReferenceCodeSupplier.get();

		return objectDefinitionExternalReferenceCode;
	}

	public void setObjectDefinitionExternalReferenceCode(
		String objectDefinitionExternalReferenceCode) {

		this.objectDefinitionExternalReferenceCode =
			objectDefinitionExternalReferenceCode;

		_objectDefinitionExternalReferenceCodeSupplier =
			() -> objectDefinitionExternalReferenceCode;
	}

	@JsonIgnore
	public void setObjectDefinitionExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			objectDefinitionExternalReferenceCodeUnsafeSupplier) {

		objectDefinitionExternalReferenceCode = null;

		_objectDefinitionExternalReferenceCodeSupplier = () -> {
			try {
				return objectDefinitionExternalReferenceCodeUnsafeSupplier.
					get();
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
	protected String objectDefinitionExternalReferenceCode;

	private Supplier<String> _objectDefinitionExternalReferenceCodeSupplier =
		() -> null;

	@Schema
	public Long getObjectDefinitionId() {
		if (objectDefinitionId != null) {
			return objectDefinitionId;
		}

		objectDefinitionId = _objectDefinitionIdSupplier.get();

		return objectDefinitionId;
	}

	public void setObjectDefinitionId(Long objectDefinitionId) {
		this.objectDefinitionId = objectDefinitionId;

		_objectDefinitionIdSupplier = () -> objectDefinitionId;
	}

	@JsonIgnore
	public void setObjectDefinitionId(
		UnsafeSupplier<Long, Exception> objectDefinitionIdUnsafeSupplier) {

		objectDefinitionId = null;

		_objectDefinitionIdSupplier = () -> {
			try {
				return objectDefinitionIdUnsafeSupplier.get();
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
	protected Long objectDefinitionId;

	private Supplier<Long> _objectDefinitionIdSupplier = () -> null;

	@Schema
	public String getRecipientType() {
		if (recipientType != null) {
			return recipientType;
		}

		recipientType = _recipientTypeSupplier.get();

		return recipientType;
	}

	public void setRecipientType(String recipientType) {
		this.recipientType = recipientType;

		_recipientTypeSupplier = () -> recipientType;
	}

	@JsonIgnore
	public void setRecipientType(
		UnsafeSupplier<String, Exception> recipientTypeUnsafeSupplier) {

		recipientType = null;

		_recipientTypeSupplier = () -> {
			try {
				return recipientTypeUnsafeSupplier.get();
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
	protected String recipientType;

	private Supplier<String> _recipientTypeSupplier = () -> null;

	@Schema
	@Valid
	public Object[] getRecipients() {
		if (recipients != null) {
			return recipients;
		}

		recipients = _recipientsSupplier.get();

		return recipients;
	}

	public void setRecipients(Object[] recipients) {
		this.recipients = recipients;

		_recipientsSupplier = () -> recipients;
	}

	@JsonIgnore
	public void setRecipients(
		UnsafeSupplier<Object[], Exception> recipientsUnsafeSupplier) {

		recipients = null;

		_recipientsSupplier = () -> {
			try {
				return recipientsUnsafeSupplier.get();
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
	protected Object[] recipients;

	private Supplier<Object[]> _recipientsSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, String> getSubject() {
		if (subject != null) {
			return subject;
		}

		subject = _subjectSupplier.get();

		return subject;
	}

	public void setSubject(Map<String, String> subject) {
		this.subject = subject;

		_subjectSupplier = () -> subject;
	}

	@JsonIgnore
	public void setSubject(
		UnsafeSupplier<Map<String, String>, Exception> subjectUnsafeSupplier) {

		subject = null;

		_subjectSupplier = () -> {
			try {
				return subjectUnsafeSupplier.get();
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
	protected Map<String, String> subject;

	private Supplier<Map<String, String>> _subjectSupplier = () -> null;

	@Schema
	public Boolean getSystem() {
		if (system != null) {
			return system;
		}

		system = _systemSupplier.get();

		return system;
	}

	public void setSystem(Boolean system) {
		this.system = system;

		_systemSupplier = () -> system;
	}

	@JsonIgnore
	public void setSystem(
		UnsafeSupplier<Boolean, Exception> systemUnsafeSupplier) {

		system = null;

		_systemSupplier = () -> {
			try {
				return systemUnsafeSupplier.get();
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
	protected Boolean system;

	private Supplier<Boolean> _systemSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String type;

	private Supplier<String> _typeSupplier = () -> null;

	@Schema
	public String getTypeLabel() {
		if (typeLabel != null) {
			return typeLabel;
		}

		typeLabel = _typeLabelSupplier.get();

		return typeLabel;
	}

	public void setTypeLabel(String typeLabel) {
		this.typeLabel = typeLabel;

		_typeLabelSupplier = () -> typeLabel;
	}

	@JsonIgnore
	public void setTypeLabel(
		UnsafeSupplier<String, Exception> typeLabelUnsafeSupplier) {

		typeLabel = null;

		_typeLabelSupplier = () -> {
			try {
				return typeLabelUnsafeSupplier.get();
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
	protected String typeLabel;

	private Supplier<String> _typeLabelSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NotificationTemplate)) {
			return false;
		}

		NotificationTemplate notificationTemplate =
			(NotificationTemplate)object;

		return Objects.equals(toString(), notificationTemplate.toString());
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

		if (attachmentObjectFieldExternalReferenceCodes != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"attachmentObjectFieldExternalReferenceCodes\": ");

			sb.append("[");

			for (int i = 0;
				 i < attachmentObjectFieldExternalReferenceCodes.length; i++) {

				sb.append("\"");

				sb.append(
					_escape(attachmentObjectFieldExternalReferenceCodes[i]));

				sb.append("\"");

				if ((i + 1) <
						attachmentObjectFieldExternalReferenceCodes.length) {

					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (attachmentObjectFieldIds != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"attachmentObjectFieldIds\": ");

			sb.append("[");

			for (int i = 0; i < attachmentObjectFieldIds.length; i++) {
				sb.append(attachmentObjectFieldIds[i]);

				if ((i + 1) < attachmentObjectFieldIds.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (body != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"body\": ");

			sb.append(_toJSON(body));
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

		if (description != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(description));

			sb.append("\"");
		}

		if (editorType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"editorType\": ");

			sb.append("\"");

			sb.append(editorType);

			sb.append("\"");
		}

		if (externalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"externalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(externalReferenceCode));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
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

		if (objectDefinitionExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectDefinitionExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(objectDefinitionExternalReferenceCode));

			sb.append("\"");
		}

		if (objectDefinitionId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectDefinitionId\": ");

			sb.append(objectDefinitionId);
		}

		if (recipientType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"recipientType\": ");

			sb.append("\"");

			sb.append(_escape(recipientType));

			sb.append("\"");
		}

		if (recipients != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"recipients\": ");

			sb.append("[");

			for (int i = 0; i < recipients.length; i++) {
				sb.append("\"");

				sb.append(_escape(recipients[i]));

				sb.append("\"");

				if ((i + 1) < recipients.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (subject != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subject\": ");

			sb.append(_toJSON(subject));
		}

		if (system != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"system\": ");

			sb.append(system);
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

		if (typeLabel != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"typeLabel\": ");

			sb.append("\"");

			sb.append(_escape(typeLabel));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.notification.rest.dto.v1_0.NotificationTemplate",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("EditorType")
	public static enum EditorType {

		FREE_MARKER("freeMarker"), RICH_TEXT("richText");

		@JsonCreator
		public static EditorType create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (EditorType editorType : values()) {
				if (Objects.equals(editorType.getValue(), value)) {
					return editorType;
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

		private EditorType(String value) {
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