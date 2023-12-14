/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.notification.rest.dto.v1_0;

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
 * @author Gabriel Albuquerque
 * @generated
 */
@Generated("")
@GraphQLName("NotificationQueueEntry")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "NotificationQueueEntry")
public class NotificationQueueEntry implements Serializable {

	public static NotificationQueueEntry toDTO(String json) {
		return ObjectMapperUtil.readValue(NotificationQueueEntry.class, json);
	}

	public static NotificationQueueEntry unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			NotificationQueueEntry.class, json);
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
	public String getBody() {
		if (body != null) {
			return body;
		}

		body = _bodySupplier.get();

		return body;
	}

	public void setBody(String body) {
		this.body = body;

		_bodySupplier = () -> body;
	}

	@JsonIgnore
	public void setBody(UnsafeSupplier<String, Exception> bodyUnsafeSupplier) {
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
	protected String body;

	private Supplier<String> _bodySupplier = () -> null;

	@Schema
	public String getFromName() {
		if (fromName != null) {
			return fromName;
		}

		fromName = _fromNameSupplier.get();

		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;

		_fromNameSupplier = () -> fromName;
	}

	@JsonIgnore
	public void setFromName(
		UnsafeSupplier<String, Exception> fromNameUnsafeSupplier) {

		fromName = null;

		_fromNameSupplier = () -> {
			try {
				return fromNameUnsafeSupplier.get();
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
	protected String fromName;

	private Supplier<String> _fromNameSupplier = () -> null;

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
	public String getRecipientsSummary() {
		if (recipientsSummary != null) {
			return recipientsSummary;
		}

		recipientsSummary = _recipientsSummarySupplier.get();

		return recipientsSummary;
	}

	public void setRecipientsSummary(String recipientsSummary) {
		this.recipientsSummary = recipientsSummary;

		_recipientsSummarySupplier = () -> recipientsSummary;
	}

	@JsonIgnore
	public void setRecipientsSummary(
		UnsafeSupplier<String, Exception> recipientsSummaryUnsafeSupplier) {

		recipientsSummary = null;

		_recipientsSummarySupplier = () -> {
			try {
				return recipientsSummaryUnsafeSupplier.get();
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
	protected String recipientsSummary;

	private Supplier<String> _recipientsSummarySupplier = () -> null;

	@Schema
	public Date getSentDate() {
		if (sentDate != null) {
			return sentDate;
		}

		sentDate = _sentDateSupplier.get();

		return sentDate;
	}

	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;

		_sentDateSupplier = () -> sentDate;
	}

	@JsonIgnore
	public void setSentDate(
		UnsafeSupplier<Date, Exception> sentDateUnsafeSupplier) {

		sentDate = null;

		_sentDateSupplier = () -> {
			try {
				return sentDateUnsafeSupplier.get();
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
	protected Date sentDate;

	private Supplier<Date> _sentDateSupplier = () -> null;

	@Schema
	public Integer getStatus() {
		if (status != null) {
			return status;
		}

		status = _statusSupplier.get();

		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;

		_statusSupplier = () -> status;
	}

	@JsonIgnore
	public void setStatus(
		UnsafeSupplier<Integer, Exception> statusUnsafeSupplier) {

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
	protected Integer status;

	private Supplier<Integer> _statusSupplier = () -> null;

	@Schema
	public String getSubject() {
		if (subject != null) {
			return subject;
		}

		subject = _subjectSupplier.get();

		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;

		_subjectSupplier = () -> subject;
	}

	@JsonIgnore
	public void setSubject(
		UnsafeSupplier<String, Exception> subjectUnsafeSupplier) {

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
	protected String subject;

	private Supplier<String> _subjectSupplier = () -> null;

	@Schema
	public String getTriggerBy() {
		if (triggerBy != null) {
			return triggerBy;
		}

		triggerBy = _triggerBySupplier.get();

		return triggerBy;
	}

	public void setTriggerBy(String triggerBy) {
		this.triggerBy = triggerBy;

		_triggerBySupplier = () -> triggerBy;
	}

	@JsonIgnore
	public void setTriggerBy(
		UnsafeSupplier<String, Exception> triggerByUnsafeSupplier) {

		triggerBy = null;

		_triggerBySupplier = () -> {
			try {
				return triggerByUnsafeSupplier.get();
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
	protected String triggerBy;

	private Supplier<String> _triggerBySupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String typeLabel;

	private Supplier<String> _typeLabelSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NotificationQueueEntry)) {
			return false;
		}

		NotificationQueueEntry notificationQueueEntry =
			(NotificationQueueEntry)object;

		return Objects.equals(toString(), notificationQueueEntry.toString());
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

		if (body != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"body\": ");

			sb.append("\"");

			sb.append(_escape(body));

			sb.append("\"");
		}

		if (fromName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fromName\": ");

			sb.append("\"");

			sb.append(_escape(fromName));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
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

		if (recipientsSummary != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"recipientsSummary\": ");

			sb.append("\"");

			sb.append(_escape(recipientsSummary));

			sb.append("\"");
		}

		if (sentDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sentDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(sentDate));

			sb.append("\"");
		}

		if (status != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append(status);
		}

		if (subject != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subject\": ");

			sb.append("\"");

			sb.append(_escape(subject));

			sb.append("\"");
		}

		if (triggerBy != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"triggerBy\": ");

			sb.append("\"");

			sb.append(_escape(triggerBy));

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
		defaultValue = "com.liferay.notification.rest.dto.v1_0.NotificationQueueEntry",
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