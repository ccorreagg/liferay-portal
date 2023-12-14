/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.digital.signature.rest.dto.v1_0;

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
 * @author José Abelenda
 * @generated
 */
@Generated("")
@GraphQLName("DSEnvelope")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "DSEnvelope")
public class DSEnvelope implements Serializable {

	public static DSEnvelope toDTO(String json) {
		return ObjectMapperUtil.readValue(DSEnvelope.class, json);
	}

	public static DSEnvelope unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(DSEnvelope.class, json);
	}

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
	@Valid
	public DSDocument[] getDsDocument() {
		if (dsDocument != null) {
			return dsDocument;
		}

		dsDocument = _dsDocumentSupplier.get();

		return dsDocument;
	}

	public void setDsDocument(DSDocument[] dsDocument) {
		this.dsDocument = dsDocument;

		_dsDocumentSupplier = () -> dsDocument;
	}

	@JsonIgnore
	public void setDsDocument(
		UnsafeSupplier<DSDocument[], Exception> dsDocumentUnsafeSupplier) {

		dsDocument = null;

		_dsDocumentSupplier = () -> {
			try {
				return dsDocumentUnsafeSupplier.get();
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
	protected DSDocument[] dsDocument;

	private Supplier<DSDocument[]> _dsDocumentSupplier = () -> null;

	@Schema
	@Valid
	public DSRecipient[] getDsRecipient() {
		if (dsRecipient != null) {
			return dsRecipient;
		}

		dsRecipient = _dsRecipientSupplier.get();

		return dsRecipient;
	}

	public void setDsRecipient(DSRecipient[] dsRecipient) {
		this.dsRecipient = dsRecipient;

		_dsRecipientSupplier = () -> dsRecipient;
	}

	@JsonIgnore
	public void setDsRecipient(
		UnsafeSupplier<DSRecipient[], Exception> dsRecipientUnsafeSupplier) {

		dsRecipient = null;

		_dsRecipientSupplier = () -> {
			try {
				return dsRecipientUnsafeSupplier.get();
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
	protected DSRecipient[] dsRecipient;

	private Supplier<DSRecipient[]> _dsRecipientSupplier = () -> null;

	@Schema
	public String getEmailBlurb() {
		if (emailBlurb != null) {
			return emailBlurb;
		}

		emailBlurb = _emailBlurbSupplier.get();

		return emailBlurb;
	}

	public void setEmailBlurb(String emailBlurb) {
		this.emailBlurb = emailBlurb;

		_emailBlurbSupplier = () -> emailBlurb;
	}

	@JsonIgnore
	public void setEmailBlurb(
		UnsafeSupplier<String, Exception> emailBlurbUnsafeSupplier) {

		emailBlurb = null;

		_emailBlurbSupplier = () -> {
			try {
				return emailBlurbUnsafeSupplier.get();
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
	protected String emailBlurb;

	private Supplier<String> _emailBlurbSupplier = () -> null;

	@Schema
	public String getEmailSubject() {
		if (emailSubject != null) {
			return emailSubject;
		}

		emailSubject = _emailSubjectSupplier.get();

		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;

		_emailSubjectSupplier = () -> emailSubject;
	}

	@JsonIgnore
	public void setEmailSubject(
		UnsafeSupplier<String, Exception> emailSubjectUnsafeSupplier) {

		emailSubject = null;

		_emailSubjectSupplier = () -> {
			try {
				return emailSubjectUnsafeSupplier.get();
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
	protected String emailSubject;

	private Supplier<String> _emailSubjectSupplier = () -> null;

	@Schema
	public String getId() {
		if (id != null) {
			return id;
		}

		id = _idSupplier.get();

		return id;
	}

	public void setId(String id) {
		this.id = id;

		_idSupplier = () -> id;
	}

	@JsonIgnore
	public void setId(UnsafeSupplier<String, Exception> idUnsafeSupplier) {
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
	protected String id;

	private Supplier<String> _idSupplier = () -> null;

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
	public String getSenderEmailAddress() {
		if (senderEmailAddress != null) {
			return senderEmailAddress;
		}

		senderEmailAddress = _senderEmailAddressSupplier.get();

		return senderEmailAddress;
	}

	public void setSenderEmailAddress(String senderEmailAddress) {
		this.senderEmailAddress = senderEmailAddress;

		_senderEmailAddressSupplier = () -> senderEmailAddress;
	}

	@JsonIgnore
	public void setSenderEmailAddress(
		UnsafeSupplier<String, Exception> senderEmailAddressUnsafeSupplier) {

		senderEmailAddress = null;

		_senderEmailAddressSupplier = () -> {
			try {
				return senderEmailAddressUnsafeSupplier.get();
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
	protected String senderEmailAddress;

	private Supplier<String> _senderEmailAddressSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long siteId;

	private Supplier<Long> _siteIdSupplier = () -> null;

	@Schema
	public String getStatus() {
		if (status != null) {
			return status;
		}

		status = _statusSupplier.get();

		return status;
	}

	public void setStatus(String status) {
		this.status = status;

		_statusSupplier = () -> status;
	}

	@JsonIgnore
	public void setStatus(
		UnsafeSupplier<String, Exception> statusUnsafeSupplier) {

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String status;

	private Supplier<String> _statusSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DSEnvelope)) {
			return false;
		}

		DSEnvelope dsEnvelope = (DSEnvelope)object;

		return Objects.equals(toString(), dsEnvelope.toString());
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

		if (dsDocument != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dsDocument\": ");

			sb.append("[");

			for (int i = 0; i < dsDocument.length; i++) {
				sb.append(String.valueOf(dsDocument[i]));

				if ((i + 1) < dsDocument.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (dsRecipient != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dsRecipient\": ");

			sb.append("[");

			for (int i = 0; i < dsRecipient.length; i++) {
				sb.append(String.valueOf(dsRecipient[i]));

				if ((i + 1) < dsRecipient.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (emailBlurb != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"emailBlurb\": ");

			sb.append("\"");

			sb.append(_escape(emailBlurb));

			sb.append("\"");
		}

		if (emailSubject != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"emailSubject\": ");

			sb.append("\"");

			sb.append(_escape(emailSubject));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append("\"");

			sb.append(_escape(id));

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

		if (senderEmailAddress != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"senderEmailAddress\": ");

			sb.append("\"");

			sb.append(_escape(senderEmailAddress));

			sb.append("\"");
		}

		if (siteId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siteId\": ");

			sb.append(siteId);
		}

		if (status != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append("\"");

			sb.append(_escape(status));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.digital.signature.rest.dto.v1_0.DSEnvelope",
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