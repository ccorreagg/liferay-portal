/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.workflow.dto.v1_0;

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
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "Represents the log containing the workflow's activity history (e.g., transitions, assignees, etc.).",
	value = "WorkflowLog"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "WorkflowLog")
public class WorkflowLog implements Serializable {

	public static WorkflowLog toDTO(String json) {
		return ObjectMapperUtil.readValue(WorkflowLog.class, json);
	}

	public static WorkflowLog unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(WorkflowLog.class, json);
	}

	@Schema(
		description = "The user account of the person auditing the workflow."
	)
	@Valid
	public Creator getAuditPerson() {
		if (auditPerson != null) {
			return auditPerson;
		}

		auditPerson = _auditPersonSupplier.get();

		return auditPerson;
	}

	public void setAuditPerson(Creator auditPerson) {
		this.auditPerson = auditPerson;

		_auditPersonSupplier = () -> auditPerson;
	}

	@JsonIgnore
	public void setAuditPerson(
		UnsafeSupplier<Creator, Exception> auditPersonUnsafeSupplier) {

		auditPerson = null;

		_auditPersonSupplier = () -> {
			try {
				return auditPersonUnsafeSupplier.get();
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
		description = "The user account of the person auditing the workflow."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Creator auditPerson;

	private Supplier<Creator> _auditPersonSupplier = () -> null;

	@Schema(description = "The log's comments.")
	public String getCommentLog() {
		if (commentLog != null) {
			return commentLog;
		}

		commentLog = _commentLogSupplier.get();

		return commentLog;
	}

	public void setCommentLog(String commentLog) {
		this.commentLog = commentLog;

		_commentLogSupplier = () -> commentLog;
	}

	@JsonIgnore
	public void setCommentLog(
		UnsafeSupplier<String, Exception> commentLogUnsafeSupplier) {

		commentLog = null;

		_commentLogSupplier = () -> {
			try {
				return commentLogUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The log's comments.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String commentLog;

	private Supplier<String> _commentLogSupplier = () -> null;

	@Schema(description = "The log's creation date.")
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

	@GraphQLField(description = "The log's creation date.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateCreated;

	private Supplier<Date> _dateCreatedSupplier = () -> null;

	@Schema(description = "The log's description.")
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

	@GraphQLField(description = "The log's description.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String description;

	private Supplier<String> _descriptionSupplier = () -> null;

	@Schema(description = "The log's ID.")
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

	@GraphQLField(description = "The log's ID.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema(description = "The person assigned to the workflow.")
	@Valid
	public Creator getPerson() {
		if (person != null) {
			return person;
		}

		person = _personSupplier.get();

		return person;
	}

	public void setPerson(Creator person) {
		this.person = person;

		_personSupplier = () -> person;
	}

	@JsonIgnore
	public void setPerson(
		UnsafeSupplier<Creator, Exception> personUnsafeSupplier) {

		person = null;

		_personSupplier = () -> {
			try {
				return personUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The person assigned to the workflow.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Creator person;

	private Supplier<Creator> _personSupplier = () -> null;

	@Schema(description = "The previous person assigned to the workflow.")
	@Valid
	public Creator getPreviousPerson() {
		if (previousPerson != null) {
			return previousPerson;
		}

		previousPerson = _previousPersonSupplier.get();

		return previousPerson;
	}

	public void setPreviousPerson(Creator previousPerson) {
		this.previousPerson = previousPerson;

		_previousPersonSupplier = () -> previousPerson;
	}

	@JsonIgnore
	public void setPreviousPerson(
		UnsafeSupplier<Creator, Exception> previousPersonUnsafeSupplier) {

		previousPerson = null;

		_previousPersonSupplier = () -> {
			try {
				return previousPersonUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The previous person assigned to the workflow.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Creator previousPerson;

	private Supplier<Creator> _previousPersonSupplier = () -> null;

	@Schema
	@Valid
	public Role getPreviousRole() {
		if (previousRole != null) {
			return previousRole;
		}

		previousRole = _previousRoleSupplier.get();

		return previousRole;
	}

	public void setPreviousRole(Role previousRole) {
		this.previousRole = previousRole;

		_previousRoleSupplier = () -> previousRole;
	}

	@JsonIgnore
	public void setPreviousRole(
		UnsafeSupplier<Role, Exception> previousRoleUnsafeSupplier) {

		previousRole = null;

		_previousRoleSupplier = () -> {
			try {
				return previousRoleUnsafeSupplier.get();
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
	protected Role previousRole;

	private Supplier<Role> _previousRoleSupplier = () -> null;

	@Schema(description = "The workflow's previous state.")
	public String getPreviousState() {
		if (previousState != null) {
			return previousState;
		}

		previousState = _previousStateSupplier.get();

		return previousState;
	}

	public void setPreviousState(String previousState) {
		this.previousState = previousState;

		_previousStateSupplier = () -> previousState;
	}

	@JsonIgnore
	public void setPreviousState(
		UnsafeSupplier<String, Exception> previousStateUnsafeSupplier) {

		previousState = null;

		_previousStateSupplier = () -> {
			try {
				return previousStateUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The workflow's previous state.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String previousState;

	private Supplier<String> _previousStateSupplier = () -> null;

	@Schema(description = "The workflow's previous state Label.")
	public String getPreviousStateLabel() {
		if (previousStateLabel != null) {
			return previousStateLabel;
		}

		previousStateLabel = _previousStateLabelSupplier.get();

		return previousStateLabel;
	}

	public void setPreviousStateLabel(String previousStateLabel) {
		this.previousStateLabel = previousStateLabel;

		_previousStateLabelSupplier = () -> previousStateLabel;
	}

	@JsonIgnore
	public void setPreviousStateLabel(
		UnsafeSupplier<String, Exception> previousStateLabelUnsafeSupplier) {

		previousStateLabel = null;

		_previousStateLabelSupplier = () -> {
			try {
				return previousStateLabelUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The workflow's previous state Label.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String previousStateLabel;

	private Supplier<String> _previousStateLabelSupplier = () -> null;

	@Schema
	@Valid
	public Role getRole() {
		if (role != null) {
			return role;
		}

		role = _roleSupplier.get();

		return role;
	}

	public void setRole(Role role) {
		this.role = role;

		_roleSupplier = () -> role;
	}

	@JsonIgnore
	public void setRole(UnsafeSupplier<Role, Exception> roleUnsafeSupplier) {
		role = null;

		_roleSupplier = () -> {
			try {
				return roleUnsafeSupplier.get();
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
	protected Role role;

	private Supplier<Role> _roleSupplier = () -> null;

	@Schema(description = "The workflow's current state.")
	public String getState() {
		if (state != null) {
			return state;
		}

		state = _stateSupplier.get();

		return state;
	}

	public void setState(String state) {
		this.state = state;

		_stateSupplier = () -> state;
	}

	@JsonIgnore
	public void setState(
		UnsafeSupplier<String, Exception> stateUnsafeSupplier) {

		state = null;

		_stateSupplier = () -> {
			try {
				return stateUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The workflow's current state.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String state;

	private Supplier<String> _stateSupplier = () -> null;

	@Schema(description = "The workflow's current state Label.")
	public String getStateLabel() {
		if (stateLabel != null) {
			return stateLabel;
		}

		stateLabel = _stateLabelSupplier.get();

		return stateLabel;
	}

	public void setStateLabel(String stateLabel) {
		this.stateLabel = stateLabel;

		_stateLabelSupplier = () -> stateLabel;
	}

	@JsonIgnore
	public void setStateLabel(
		UnsafeSupplier<String, Exception> stateLabelUnsafeSupplier) {

		stateLabel = null;

		_stateLabelSupplier = () -> {
			try {
				return stateLabelUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The workflow's current state Label.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String stateLabel;

	private Supplier<String> _stateLabelSupplier = () -> null;

	@Schema(description = "The workflow log's type.")
	@Valid
	public Type getType() {
		if (type != null) {
			return type;
		}

		type = _typeSupplier.get();

		return type;
	}

	@JsonIgnore
	public String getTypeAsString() {
		if (type == null) {
			return null;
		}

		return type.toString();
	}

	public void setType(Type type) {
		this.type = type;

		_typeSupplier = () -> type;
	}

	@JsonIgnore
	public void setType(UnsafeSupplier<Type, Exception> typeUnsafeSupplier) {
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

	@GraphQLField(description = "The workflow log's type.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Type type;

	private Supplier<Type> _typeSupplier = () -> null;

	@Schema(description = "The task associated with this workflow log.")
	public Long getWorkflowTaskId() {
		if (workflowTaskId != null) {
			return workflowTaskId;
		}

		workflowTaskId = _workflowTaskIdSupplier.get();

		return workflowTaskId;
	}

	public void setWorkflowTaskId(Long workflowTaskId) {
		this.workflowTaskId = workflowTaskId;

		_workflowTaskIdSupplier = () -> workflowTaskId;
	}

	@JsonIgnore
	public void setWorkflowTaskId(
		UnsafeSupplier<Long, Exception> workflowTaskIdUnsafeSupplier) {

		workflowTaskId = null;

		_workflowTaskIdSupplier = () -> {
			try {
				return workflowTaskIdUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The task associated with this workflow log.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long workflowTaskId;

	private Supplier<Long> _workflowTaskIdSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WorkflowLog)) {
			return false;
		}

		WorkflowLog workflowLog = (WorkflowLog)object;

		return Objects.equals(toString(), workflowLog.toString());
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

		if (auditPerson != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"auditPerson\": ");

			sb.append(String.valueOf(auditPerson));
		}

		if (commentLog != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"commentLog\": ");

			sb.append("\"");

			sb.append(_escape(commentLog));

			sb.append("\"");
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

		if (description != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(description));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (person != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"person\": ");

			sb.append(String.valueOf(person));
		}

		if (previousPerson != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"previousPerson\": ");

			sb.append(String.valueOf(previousPerson));
		}

		if (previousRole != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"previousRole\": ");

			sb.append(String.valueOf(previousRole));
		}

		if (previousState != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"previousState\": ");

			sb.append("\"");

			sb.append(_escape(previousState));

			sb.append("\"");
		}

		if (previousStateLabel != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"previousStateLabel\": ");

			sb.append("\"");

			sb.append(_escape(previousStateLabel));

			sb.append("\"");
		}

		if (role != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"role\": ");

			sb.append(String.valueOf(role));
		}

		if (state != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"state\": ");

			sb.append("\"");

			sb.append(_escape(state));

			sb.append("\"");
		}

		if (stateLabel != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"stateLabel\": ");

			sb.append("\"");

			sb.append(_escape(stateLabel));

			sb.append("\"");
		}

		if (type != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"type\": ");

			sb.append("\"");

			sb.append(type);

			sb.append("\"");
		}

		if (workflowTaskId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"workflowTaskId\": ");

			sb.append(workflowTaskId);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.admin.workflow.dto.v1_0.WorkflowLog",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("Type")
	public static enum Type {

		NODE_ENTRY("NodeEntry"), TASK_ASSIGN("TaskAssign"),
		TASK_COMPLETION("TaskCompletion"), TASK_UPDATE("TaskUpdate"),
		TRANSITION("Transition");

		@JsonCreator
		public static Type create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (Type type : values()) {
				if (Objects.equals(type.getValue(), value)) {
					return type;
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

		private Type(String value) {
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