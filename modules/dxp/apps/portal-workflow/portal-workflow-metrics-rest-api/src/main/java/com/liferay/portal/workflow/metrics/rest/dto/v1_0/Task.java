/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.workflow.metrics.rest.dto.v1_0;

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
 * @author Rafael Praxedes
 * @generated
 */
@Generated("")
@GraphQLName(description = "https://www.schema.org/Task", value = "Task")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Task")
public class Task implements Serializable {

	public static Task toDTO(String json) {
		return ObjectMapperUtil.readValue(Task.class, json);
	}

	public static Task unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Task.class, json);
	}

	@Schema
	public String getAssetTitle() {
		if (assetTitle != null) {
			return assetTitle;
		}

		assetTitle = _assetTitleSupplier.get();

		return assetTitle;
	}

	public void setAssetTitle(String assetTitle) {
		this.assetTitle = assetTitle;

		_assetTitleSupplier = () -> assetTitle;
	}

	@JsonIgnore
	public void setAssetTitle(
		UnsafeSupplier<String, Exception> assetTitleUnsafeSupplier) {

		assetTitle = null;

		_assetTitleSupplier = () -> {
			try {
				return assetTitleUnsafeSupplier.get();
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
	protected String assetTitle;

	private Supplier<String> _assetTitleSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, String> getAssetTitle_i18n() {
		if (assetTitle_i18n != null) {
			return assetTitle_i18n;
		}

		assetTitle_i18n = _assetTitle_i18nSupplier.get();

		return assetTitle_i18n;
	}

	public void setAssetTitle_i18n(Map<String, String> assetTitle_i18n) {
		this.assetTitle_i18n = assetTitle_i18n;

		_assetTitle_i18nSupplier = () -> assetTitle_i18n;
	}

	@JsonIgnore
	public void setAssetTitle_i18n(
		UnsafeSupplier<Map<String, String>, Exception>
			assetTitle_i18nUnsafeSupplier) {

		assetTitle_i18n = null;

		_assetTitle_i18nSupplier = () -> {
			try {
				return assetTitle_i18nUnsafeSupplier.get();
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
	protected Map<String, String> assetTitle_i18n;

	private Supplier<Map<String, String>> _assetTitle_i18nSupplier = () -> null;

	@Schema
	public String getAssetType() {
		if (assetType != null) {
			return assetType;
		}

		assetType = _assetTypeSupplier.get();

		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;

		_assetTypeSupplier = () -> assetType;
	}

	@JsonIgnore
	public void setAssetType(
		UnsafeSupplier<String, Exception> assetTypeUnsafeSupplier) {

		assetType = null;

		_assetTypeSupplier = () -> {
			try {
				return assetTypeUnsafeSupplier.get();
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
	protected String assetType;

	private Supplier<String> _assetTypeSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, String> getAssetType_i18n() {
		if (assetType_i18n != null) {
			return assetType_i18n;
		}

		assetType_i18n = _assetType_i18nSupplier.get();

		return assetType_i18n;
	}

	public void setAssetType_i18n(Map<String, String> assetType_i18n) {
		this.assetType_i18n = assetType_i18n;

		_assetType_i18nSupplier = () -> assetType_i18n;
	}

	@JsonIgnore
	public void setAssetType_i18n(
		UnsafeSupplier<Map<String, String>, Exception>
			assetType_i18nUnsafeSupplier) {

		assetType_i18n = null;

		_assetType_i18nSupplier = () -> {
			try {
				return assetType_i18nUnsafeSupplier.get();
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
	protected Map<String, String> assetType_i18n;

	private Supplier<Map<String, String>> _assetType_i18nSupplier = () -> null;

	@Schema
	@Valid
	public Assignee getAssignee() {
		if (assignee != null) {
			return assignee;
		}

		assignee = _assigneeSupplier.get();

		return assignee;
	}

	public void setAssignee(Assignee assignee) {
		this.assignee = assignee;

		_assigneeSupplier = () -> assignee;
	}

	@JsonIgnore
	public void setAssignee(
		UnsafeSupplier<Assignee, Exception> assigneeUnsafeSupplier) {

		assignee = null;

		_assigneeSupplier = () -> {
			try {
				return assigneeUnsafeSupplier.get();
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
	protected Assignee assignee;

	private Supplier<Assignee> _assigneeSupplier = () -> null;

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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean completed;

	private Supplier<Boolean> _completedSupplier = () -> null;

	@Schema
	public Long getCompletionUserId() {
		if (completionUserId != null) {
			return completionUserId;
		}

		completionUserId = _completionUserIdSupplier.get();

		return completionUserId;
	}

	public void setCompletionUserId(Long completionUserId) {
		this.completionUserId = completionUserId;

		_completionUserIdSupplier = () -> completionUserId;
	}

	@JsonIgnore
	public void setCompletionUserId(
		UnsafeSupplier<Long, Exception> completionUserIdUnsafeSupplier) {

		completionUserId = null;

		_completionUserIdSupplier = () -> {
			try {
				return completionUserIdUnsafeSupplier.get();
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
	protected Long completionUserId;

	private Supplier<Long> _completionUserIdSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date dateCompletion;

	private Supplier<Date> _dateCompletionSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date dateModified;

	private Supplier<Date> _dateModifiedSupplier = () -> null;

	@Schema
	public Long getDuration() {
		if (duration != null) {
			return duration;
		}

		duration = _durationSupplier.get();

		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;

		_durationSupplier = () -> duration;
	}

	@JsonIgnore
	public void setDuration(
		UnsafeSupplier<Long, Exception> durationUnsafeSupplier) {

		duration = null;

		_durationSupplier = () -> {
			try {
				return durationUnsafeSupplier.get();
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
	protected Long duration;

	private Supplier<Long> _durationSupplier = () -> null;

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
	public Long getInstanceId() {
		if (instanceId != null) {
			return instanceId;
		}

		instanceId = _instanceIdSupplier.get();

		return instanceId;
	}

	public void setInstanceId(Long instanceId) {
		this.instanceId = instanceId;

		_instanceIdSupplier = () -> instanceId;
	}

	@JsonIgnore
	public void setInstanceId(
		UnsafeSupplier<Long, Exception> instanceIdUnsafeSupplier) {

		instanceId = null;

		_instanceIdSupplier = () -> {
			try {
				return instanceIdUnsafeSupplier.get();
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
	protected Long instanceId;

	private Supplier<Long> _instanceIdSupplier = () -> null;

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
	public Long getNodeId() {
		if (nodeId != null) {
			return nodeId;
		}

		nodeId = _nodeIdSupplier.get();

		return nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;

		_nodeIdSupplier = () -> nodeId;
	}

	@JsonIgnore
	public void setNodeId(
		UnsafeSupplier<Long, Exception> nodeIdUnsafeSupplier) {

		nodeId = null;

		_nodeIdSupplier = () -> {
			try {
				return nodeIdUnsafeSupplier.get();
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
	protected Long nodeId;

	private Supplier<Long> _nodeIdSupplier = () -> null;

	@Schema
	public Long getProcessId() {
		if (processId != null) {
			return processId;
		}

		processId = _processIdSupplier.get();

		return processId;
	}

	public void setProcessId(Long processId) {
		this.processId = processId;

		_processIdSupplier = () -> processId;
	}

	@JsonIgnore
	public void setProcessId(
		UnsafeSupplier<Long, Exception> processIdUnsafeSupplier) {

		processId = null;

		_processIdSupplier = () -> {
			try {
				return processIdUnsafeSupplier.get();
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
	protected Long processId;

	private Supplier<Long> _processIdSupplier = () -> null;

	@Schema
	public String getProcessVersion() {
		if (processVersion != null) {
			return processVersion;
		}

		processVersion = _processVersionSupplier.get();

		return processVersion;
	}

	public void setProcessVersion(String processVersion) {
		this.processVersion = processVersion;

		_processVersionSupplier = () -> processVersion;
	}

	@JsonIgnore
	public void setProcessVersion(
		UnsafeSupplier<String, Exception> processVersionUnsafeSupplier) {

		processVersion = null;

		_processVersionSupplier = () -> {
			try {
				return processVersionUnsafeSupplier.get();
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
	protected String processVersion;

	private Supplier<String> _processVersionSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Task)) {
			return false;
		}

		Task task = (Task)object;

		return Objects.equals(toString(), task.toString());
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

		if (assetTitle != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assetTitle\": ");

			sb.append("\"");

			sb.append(_escape(assetTitle));

			sb.append("\"");
		}

		if (assetTitle_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assetTitle_i18n\": ");

			sb.append(_toJSON(assetTitle_i18n));
		}

		if (assetType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assetType\": ");

			sb.append("\"");

			sb.append(_escape(assetType));

			sb.append("\"");
		}

		if (assetType_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assetType_i18n\": ");

			sb.append(_toJSON(assetType_i18n));
		}

		if (assignee != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assignee\": ");

			sb.append(String.valueOf(assignee));
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

		if (completed != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"completed\": ");

			sb.append(completed);
		}

		if (completionUserId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"completionUserId\": ");

			sb.append(completionUserId);
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

		if (dateModified != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateModified\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dateModified));

			sb.append("\"");
		}

		if (duration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"duration\": ");

			sb.append(duration);
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (instanceId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"instanceId\": ");

			sb.append(instanceId);
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

		if (nodeId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"nodeId\": ");

			sb.append(nodeId);
		}

		if (processId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"processId\": ");

			sb.append(processId);
		}

		if (processVersion != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"processVersion\": ");

			sb.append("\"");

			sb.append(_escape(processVersion));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.portal.workflow.metrics.rest.dto.v1_0.Task",
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