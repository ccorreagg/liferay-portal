/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.workflow.dto.v1_0;

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
	description = "Represents a task to be executed in a workflow.",
	value = "WorkflowTask"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "WorkflowTask")
public class WorkflowTask implements Serializable {

	public static WorkflowTask toDTO(String json) {
		return ObjectMapperUtil.readValue(WorkflowTask.class, json);
	}

	public static WorkflowTask unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(WorkflowTask.class, json);
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
	@Valid
	public Creator getAssigneePerson() {
		if (assigneePerson != null) {
			return assigneePerson;
		}

		assigneePerson = _assigneePersonSupplier.get();

		return assigneePerson;
	}

	public void setAssigneePerson(Creator assigneePerson) {
		this.assigneePerson = assigneePerson;

		_assigneePersonSupplier = () -> assigneePerson;
	}

	@JsonIgnore
	public void setAssigneePerson(
		UnsafeSupplier<Creator, Exception> assigneePersonUnsafeSupplier) {

		assigneePerson = null;

		_assigneePersonSupplier = () -> {
			try {
				return assigneePersonUnsafeSupplier.get();
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
	protected Creator assigneePerson;

	private Supplier<Creator> _assigneePersonSupplier = () -> null;

	@Schema
	@Valid
	public Role[] getAssigneeRoles() {
		if (assigneeRoles != null) {
			return assigneeRoles;
		}

		assigneeRoles = _assigneeRolesSupplier.get();

		return assigneeRoles;
	}

	public void setAssigneeRoles(Role[] assigneeRoles) {
		this.assigneeRoles = assigneeRoles;

		_assigneeRolesSupplier = () -> assigneeRoles;
	}

	@JsonIgnore
	public void setAssigneeRoles(
		UnsafeSupplier<Role[], Exception> assigneeRolesUnsafeSupplier) {

		assigneeRoles = null;

		_assigneeRolesSupplier = () -> {
			try {
				return assigneeRolesUnsafeSupplier.get();
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
	protected Role[] assigneeRoles;

	private Supplier<Role[]> _assigneeRolesSupplier = () -> null;

	@Schema(description = "A flag that indicates whether the task is complete.")
	public Boolean getCompleted() {
		if (completed != null) {
			return completed;
		}

		completed = _completedSupplier.get();

		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;

		_completedSupplier = () -> completed;
	}

	@JsonIgnore
	public void setCompleted(
		UnsafeSupplier<Boolean, Exception> completedUnsafeSupplier) {

		completed = null;

		_completedSupplier = () -> {
			try {
				return completedUnsafeSupplier.get();
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
		description = "A flag that indicates whether the task is complete."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Boolean completed;

	private Supplier<Boolean> _completedSupplier = () -> null;

	@Schema(description = "The task's completion date.")
	public Date getDateCompletion() {
		if (dateCompletion != null) {
			return dateCompletion;
		}

		dateCompletion = _dateCompletionSupplier.get();

		return dateCompletion;
	}

	public void setDateCompletion(Date dateCompletion) {
		this.dateCompletion = dateCompletion;

		_dateCompletionSupplier = () -> dateCompletion;
	}

	@JsonIgnore
	public void setDateCompletion(
		UnsafeSupplier<Date, Exception> dateCompletionUnsafeSupplier) {

		dateCompletion = null;

		_dateCompletionSupplier = () -> {
			try {
				return dateCompletionUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The task's completion date.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateCompletion;

	private Supplier<Date> _dateCompletionSupplier = () -> null;

	@Schema(description = "The task's creation date.")
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

	@GraphQLField(description = "The task's creation date.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateCreated;

	private Supplier<Date> _dateCreatedSupplier = () -> null;

	@Schema(description = "The date the task should be completed by.")
	public Date getDateDue() {
		if (dateDue != null) {
			return dateDue;
		}

		dateDue = _dateDueSupplier.get();

		return dateDue;
	}

	public void setDateDue(Date dateDue) {
		this.dateDue = dateDue;

		_dateDueSupplier = () -> dateDue;
	}

	@JsonIgnore
	public void setDateDue(
		UnsafeSupplier<Date, Exception> dateDueUnsafeSupplier) {

		dateDue = null;

		_dateDueSupplier = () -> {
			try {
				return dateDueUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The date the task should be completed by.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateDue;

	private Supplier<Date> _dateDueSupplier = () -> null;

	@Schema(description = "The task's description.")
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

	@GraphQLField(description = "The task's description.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String description;

	private Supplier<String> _descriptionSupplier = () -> null;

	@Schema(description = "The task's ID.")
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

	@GraphQLField(description = "The task's ID.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema
	public String getLabel() {
		if (label != null) {
			return label;
		}

		label = _labelSupplier.get();

		return label;
	}

	public void setLabel(String label) {
		this.label = label;

		_labelSupplier = () -> label;
	}

	@JsonIgnore
	public void setLabel(
		UnsafeSupplier<String, Exception> labelUnsafeSupplier) {

		label = null;

		_labelSupplier = () -> {
			try {
				return labelUnsafeSupplier.get();
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
	protected String label;

	private Supplier<String> _labelSupplier = () -> null;

	@Schema(description = "The task's name.")
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

	@GraphQLField(description = "The task's name.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String name;

	private Supplier<String> _nameSupplier = () -> null;

	@Schema(
		description = "The object/asset that the task's workflow is managing."
	)
	@Valid
	public ObjectReviewed getObjectReviewed() {
		if (objectReviewed != null) {
			return objectReviewed;
		}

		objectReviewed = _objectReviewedSupplier.get();

		return objectReviewed;
	}

	public void setObjectReviewed(ObjectReviewed objectReviewed) {
		this.objectReviewed = objectReviewed;

		_objectReviewedSupplier = () -> objectReviewed;
	}

	@JsonIgnore
	public void setObjectReviewed(
		UnsafeSupplier<ObjectReviewed, Exception>
			objectReviewedUnsafeSupplier) {

		objectReviewed = null;

		_objectReviewedSupplier = () -> {
			try {
				return objectReviewedUnsafeSupplier.get();
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
		description = "The object/asset that the task's workflow is managing."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected ObjectReviewed objectReviewed;

	private Supplier<ObjectReviewed> _objectReviewedSupplier = () -> null;

	@Schema
	public Long getWorkflowDefinitionId() {
		if (workflowDefinitionId != null) {
			return workflowDefinitionId;
		}

		workflowDefinitionId = _workflowDefinitionIdSupplier.get();

		return workflowDefinitionId;
	}

	public void setWorkflowDefinitionId(Long workflowDefinitionId) {
		this.workflowDefinitionId = workflowDefinitionId;

		_workflowDefinitionIdSupplier = () -> workflowDefinitionId;
	}

	@JsonIgnore
	public void setWorkflowDefinitionId(
		UnsafeSupplier<Long, Exception> workflowDefinitionIdUnsafeSupplier) {

		workflowDefinitionId = null;

		_workflowDefinitionIdSupplier = () -> {
			try {
				return workflowDefinitionIdUnsafeSupplier.get();
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
	protected Long workflowDefinitionId;

	private Supplier<Long> _workflowDefinitionIdSupplier = () -> null;

	@Schema(description = "The name of the task's workflow definition.")
	public String getWorkflowDefinitionName() {
		if (workflowDefinitionName != null) {
			return workflowDefinitionName;
		}

		workflowDefinitionName = _workflowDefinitionNameSupplier.get();

		return workflowDefinitionName;
	}

	public void setWorkflowDefinitionName(String workflowDefinitionName) {
		this.workflowDefinitionName = workflowDefinitionName;

		_workflowDefinitionNameSupplier = () -> workflowDefinitionName;
	}

	@JsonIgnore
	public void setWorkflowDefinitionName(
		UnsafeSupplier<String, Exception>
			workflowDefinitionNameUnsafeSupplier) {

		workflowDefinitionName = null;

		_workflowDefinitionNameSupplier = () -> {
			try {
				return workflowDefinitionNameUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The name of the task's workflow definition.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String workflowDefinitionName;

	private Supplier<String> _workflowDefinitionNameSupplier = () -> null;

	@Schema
	public String getWorkflowDefinitionVersion() {
		if (workflowDefinitionVersion != null) {
			return workflowDefinitionVersion;
		}

		workflowDefinitionVersion = _workflowDefinitionVersionSupplier.get();

		return workflowDefinitionVersion;
	}

	public void setWorkflowDefinitionVersion(String workflowDefinitionVersion) {
		this.workflowDefinitionVersion = workflowDefinitionVersion;

		_workflowDefinitionVersionSupplier = () -> workflowDefinitionVersion;
	}

	@JsonIgnore
	public void setWorkflowDefinitionVersion(
		UnsafeSupplier<String, Exception>
			workflowDefinitionVersionUnsafeSupplier) {

		workflowDefinitionVersion = null;

		_workflowDefinitionVersionSupplier = () -> {
			try {
				return workflowDefinitionVersionUnsafeSupplier.get();
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
	protected String workflowDefinitionVersion;

	private Supplier<String> _workflowDefinitionVersionSupplier = () -> null;

	@Schema
	public Long getWorkflowInstanceId() {
		if (workflowInstanceId != null) {
			return workflowInstanceId;
		}

		workflowInstanceId = _workflowInstanceIdSupplier.get();

		return workflowInstanceId;
	}

	public void setWorkflowInstanceId(Long workflowInstanceId) {
		this.workflowInstanceId = workflowInstanceId;

		_workflowInstanceIdSupplier = () -> workflowInstanceId;
	}

	@JsonIgnore
	public void setWorkflowInstanceId(
		UnsafeSupplier<Long, Exception> workflowInstanceIdUnsafeSupplier) {

		workflowInstanceId = null;

		_workflowInstanceIdSupplier = () -> {
			try {
				return workflowInstanceIdUnsafeSupplier.get();
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
	protected Long workflowInstanceId;

	private Supplier<Long> _workflowInstanceIdSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WorkflowTask)) {
			return false;
		}

		WorkflowTask workflowTask = (WorkflowTask)object;

		return Objects.equals(toString(), workflowTask.toString());
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

		if (assigneePerson != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assigneePerson\": ");

			sb.append(String.valueOf(assigneePerson));
		}

		if (assigneeRoles != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assigneeRoles\": ");

			sb.append("[");

			for (int i = 0; i < assigneeRoles.length; i++) {
				sb.append(String.valueOf(assigneeRoles[i]));

				if ((i + 1) < assigneeRoles.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (completed != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"completed\": ");

			sb.append(completed);
		}

		if (dateCompletion != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateCompletion\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dateCompletion));

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

		if (dateDue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateDue\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dateDue));

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

		if (label != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"label\": ");

			sb.append("\"");

			sb.append(_escape(label));

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

		if (objectReviewed != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectReviewed\": ");

			sb.append(String.valueOf(objectReviewed));
		}

		if (workflowDefinitionId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"workflowDefinitionId\": ");

			sb.append(workflowDefinitionId);
		}

		if (workflowDefinitionName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"workflowDefinitionName\": ");

			sb.append("\"");

			sb.append(_escape(workflowDefinitionName));

			sb.append("\"");
		}

		if (workflowDefinitionVersion != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"workflowDefinitionVersion\": ");

			sb.append("\"");

			sb.append(_escape(workflowDefinitionVersion));

			sb.append("\"");
		}

		if (workflowInstanceId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"workflowInstanceId\": ");

			sb.append(workflowInstanceId);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.admin.workflow.dto.v1_0.WorkflowTask",
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