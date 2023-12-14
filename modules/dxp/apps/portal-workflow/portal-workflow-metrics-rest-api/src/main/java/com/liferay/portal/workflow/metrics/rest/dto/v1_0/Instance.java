/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.workflow.metrics.rest.dto.v1_0;

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
 * @author Rafael Praxedes
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "https://www.schema.org/Instance", value = "Instance"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Instance")
public class Instance implements Serializable {

	public static Instance toDTO(String json) {
		return ObjectMapperUtil.readValue(Instance.class, json);
	}

	public static Instance unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Instance.class, json);
	}

	@Schema
	public Boolean getActive() {
		if (active != null) {
			return active;
		}

		active = _activeSupplier.get();

		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;

		_activeSupplier = () -> active;
	}

	@JsonIgnore
	public void setActive(
		UnsafeSupplier<Boolean, Exception> activeUnsafeSupplier) {

		active = null;

		_activeSupplier = () -> {
			try {
				return activeUnsafeSupplier.get();
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
	protected Boolean active;

	private Supplier<Boolean> _activeSupplier = () -> null;

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
	public Assignee[] getAssignees() {
		if (assignees != null) {
			return assignees;
		}

		assignees = _assigneesSupplier.get();

		return assignees;
	}

	public void setAssignees(Assignee[] assignees) {
		this.assignees = assignees;

		_assigneesSupplier = () -> assignees;
	}

	@JsonIgnore
	public void setAssignees(
		UnsafeSupplier<Assignee[], Exception> assigneesUnsafeSupplier) {

		assignees = null;

		_assigneesSupplier = () -> {
			try {
				return assigneesUnsafeSupplier.get();
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
	protected Assignee[] assignees;

	private Supplier<Assignee[]> _assigneesSupplier = () -> null;

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

	@Schema
	@Valid
	public SLAResult[] getSlaResults() {
		if (slaResults != null) {
			return slaResults;
		}

		slaResults = _slaResultsSupplier.get();

		return slaResults;
	}

	public void setSlaResults(SLAResult[] slaResults) {
		this.slaResults = slaResults;

		_slaResultsSupplier = () -> slaResults;
	}

	@JsonIgnore
	public void setSlaResults(
		UnsafeSupplier<SLAResult[], Exception> slaResultsUnsafeSupplier) {

		slaResults = null;

		_slaResultsSupplier = () -> {
			try {
				return slaResultsUnsafeSupplier.get();
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
	protected SLAResult[] slaResults;

	private Supplier<SLAResult[]> _slaResultsSupplier = () -> null;

	@Schema
	@Valid
	public SLAStatus getSLAStatus() {
		if (slaStatus != null) {
			return slaStatus;
		}

		slaStatus = _slaStatusSupplier.get();

		return slaStatus;
	}

	@JsonIgnore
	public String getSLAStatusAsString() {
		if (slaStatus == null) {
			return null;
		}

		return slaStatus.toString();
	}

	public void setSLAStatus(SLAStatus slaStatus) {
		this.slaStatus = slaStatus;

		_slaStatusSupplier = () -> slaStatus;
	}

	@JsonIgnore
	public void setSLAStatus(
		UnsafeSupplier<SLAStatus, Exception> slaStatusUnsafeSupplier) {

		slaStatus = null;

		_slaStatusSupplier = () -> {
			try {
				return slaStatusUnsafeSupplier.get();
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
	protected SLAStatus slaStatus;

	private Supplier<SLAStatus> _slaStatusSupplier = () -> null;

	@Schema
	public String[] getTaskNames() {
		if (taskNames != null) {
			return taskNames;
		}

		taskNames = _taskNamesSupplier.get();

		return taskNames;
	}

	public void setTaskNames(String[] taskNames) {
		this.taskNames = taskNames;

		_taskNamesSupplier = () -> taskNames;
	}

	@JsonIgnore
	public void setTaskNames(
		UnsafeSupplier<String[], Exception> taskNamesUnsafeSupplier) {

		taskNames = null;

		_taskNamesSupplier = () -> {
			try {
				return taskNamesUnsafeSupplier.get();
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
	protected String[] taskNames;

	private Supplier<String[]> _taskNamesSupplier = () -> null;

	@Schema
	@Valid
	public Transition[] getTransitions() {
		if (transitions != null) {
			return transitions;
		}

		transitions = _transitionsSupplier.get();

		return transitions;
	}

	public void setTransitions(Transition[] transitions) {
		this.transitions = transitions;

		_transitionsSupplier = () -> transitions;
	}

	@JsonIgnore
	public void setTransitions(
		UnsafeSupplier<Transition[], Exception> transitionsUnsafeSupplier) {

		transitions = null;

		_transitionsSupplier = () -> {
			try {
				return transitionsUnsafeSupplier.get();
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
	protected Transition[] transitions;

	private Supplier<Transition[]> _transitionsSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Instance)) {
			return false;
		}

		Instance instance = (Instance)object;

		return Objects.equals(toString(), instance.toString());
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

		if (active != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"active\": ");

			sb.append(active);
		}

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

		if (assignees != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assignees\": ");

			sb.append("[");

			for (int i = 0; i < assignees.length; i++) {
				sb.append(String.valueOf(assignees[i]));

				if ((i + 1) < assignees.length) {
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

		if (completed != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"completed\": ");

			sb.append(completed);
		}

		if (creator != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"creator\": ");

			sb.append(String.valueOf(creator));
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

		if (slaResults != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"slaResults\": ");

			sb.append("[");

			for (int i = 0; i < slaResults.length; i++) {
				sb.append(String.valueOf(slaResults[i]));

				if ((i + 1) < slaResults.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (slaStatus != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"slaStatus\": ");

			sb.append("\"");

			sb.append(slaStatus);

			sb.append("\"");
		}

		if (taskNames != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"taskNames\": ");

			sb.append("[");

			for (int i = 0; i < taskNames.length; i++) {
				sb.append("\"");

				sb.append(_escape(taskNames[i]));

				sb.append("\"");

				if ((i + 1) < taskNames.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (transitions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"transitions\": ");

			sb.append("[");

			for (int i = 0; i < transitions.length; i++) {
				sb.append(String.valueOf(transitions[i]));

				if ((i + 1) < transitions.length) {
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
		defaultValue = "com.liferay.portal.workflow.metrics.rest.dto.v1_0.Instance",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("SLAStatus")
	public static enum SLAStatus {

		ON_TIME("OnTime"), OVERDUE("Overdue"), UNTRACKED("Untracked");

		@JsonCreator
		public static SLAStatus create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (SLAStatus slaStatus : values()) {
				if (Objects.equals(slaStatus.getValue(), value)) {
					return slaStatus;
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

		private SLAStatus(String value) {
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