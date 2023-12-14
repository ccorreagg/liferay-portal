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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("WorkflowTasksBulkSelection")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "WorkflowTasksBulkSelection")
public class WorkflowTasksBulkSelection implements Serializable {

	public static WorkflowTasksBulkSelection toDTO(String json) {
		return ObjectMapperUtil.readValue(
			WorkflowTasksBulkSelection.class, json);
	}

	public static WorkflowTasksBulkSelection unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			WorkflowTasksBulkSelection.class, json);
	}

	@Schema
	public Boolean getAndOperator() {
		if (andOperator != null) {
			return andOperator;
		}

		andOperator = _andOperatorSupplier.get();

		return andOperator;
	}

	public void setAndOperator(Boolean andOperator) {
		this.andOperator = andOperator;

		_andOperatorSupplier = () -> andOperator;
	}

	@JsonIgnore
	public void setAndOperator(
		UnsafeSupplier<Boolean, Exception> andOperatorUnsafeSupplier) {

		andOperator = null;

		_andOperatorSupplier = () -> {
			try {
				return andOperatorUnsafeSupplier.get();
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
	protected Boolean andOperator;

	private Supplier<Boolean> _andOperatorSupplier = () -> null;

	@Schema
	public Long[] getAssetPrimaryKeys() {
		if (assetPrimaryKeys != null) {
			return assetPrimaryKeys;
		}

		assetPrimaryKeys = _assetPrimaryKeysSupplier.get();

		return assetPrimaryKeys;
	}

	public void setAssetPrimaryKeys(Long[] assetPrimaryKeys) {
		this.assetPrimaryKeys = assetPrimaryKeys;

		_assetPrimaryKeysSupplier = () -> assetPrimaryKeys;
	}

	@JsonIgnore
	public void setAssetPrimaryKeys(
		UnsafeSupplier<Long[], Exception> assetPrimaryKeysUnsafeSupplier) {

		assetPrimaryKeys = null;

		_assetPrimaryKeysSupplier = () -> {
			try {
				return assetPrimaryKeysUnsafeSupplier.get();
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
	protected Long[] assetPrimaryKeys;

	private Supplier<Long[]> _assetPrimaryKeysSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String assetTitle;

	private Supplier<String> _assetTitleSupplier = () -> null;

	@Schema
	public String[] getAssetTypes() {
		if (assetTypes != null) {
			return assetTypes;
		}

		assetTypes = _assetTypesSupplier.get();

		return assetTypes;
	}

	public void setAssetTypes(String[] assetTypes) {
		this.assetTypes = assetTypes;

		_assetTypesSupplier = () -> assetTypes;
	}

	@JsonIgnore
	public void setAssetTypes(
		UnsafeSupplier<String[], Exception> assetTypesUnsafeSupplier) {

		assetTypes = null;

		_assetTypesSupplier = () -> {
			try {
				return assetTypesUnsafeSupplier.get();
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
	protected String[] assetTypes;

	private Supplier<String[]> _assetTypesSupplier = () -> null;

	@Schema
	public Long[] getAssigneeIds() {
		if (assigneeIds != null) {
			return assigneeIds;
		}

		assigneeIds = _assigneeIdsSupplier.get();

		return assigneeIds;
	}

	public void setAssigneeIds(Long[] assigneeIds) {
		this.assigneeIds = assigneeIds;

		_assigneeIdsSupplier = () -> assigneeIds;
	}

	@JsonIgnore
	public void setAssigneeIds(
		UnsafeSupplier<Long[], Exception> assigneeIdsUnsafeSupplier) {

		assigneeIds = null;

		_assigneeIdsSupplier = () -> {
			try {
				return assigneeIdsUnsafeSupplier.get();
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
	protected Long[] assigneeIds;

	private Supplier<Long[]> _assigneeIdsSupplier = () -> null;

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
	public Date getDateDueEnd() {
		if (dateDueEnd != null) {
			return dateDueEnd;
		}

		dateDueEnd = _dateDueEndSupplier.get();

		return dateDueEnd;
	}

	public void setDateDueEnd(Date dateDueEnd) {
		this.dateDueEnd = dateDueEnd;

		_dateDueEndSupplier = () -> dateDueEnd;
	}

	@JsonIgnore
	public void setDateDueEnd(
		UnsafeSupplier<Date, Exception> dateDueEndUnsafeSupplier) {

		dateDueEnd = null;

		_dateDueEndSupplier = () -> {
			try {
				return dateDueEndUnsafeSupplier.get();
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
	protected Date dateDueEnd;

	private Supplier<Date> _dateDueEndSupplier = () -> null;

	@Schema
	public Date getDateDueStart() {
		if (dateDueStart != null) {
			return dateDueStart;
		}

		dateDueStart = _dateDueStartSupplier.get();

		return dateDueStart;
	}

	public void setDateDueStart(Date dateDueStart) {
		this.dateDueStart = dateDueStart;

		_dateDueStartSupplier = () -> dateDueStart;
	}

	@JsonIgnore
	public void setDateDueStart(
		UnsafeSupplier<Date, Exception> dateDueStartUnsafeSupplier) {

		dateDueStart = null;

		_dateDueStartSupplier = () -> {
			try {
				return dateDueStartUnsafeSupplier.get();
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
	protected Date dateDueStart;

	private Supplier<Date> _dateDueStartSupplier = () -> null;

	@Schema
	public Boolean getSearchByRoles() {
		if (searchByRoles != null) {
			return searchByRoles;
		}

		searchByRoles = _searchByRolesSupplier.get();

		return searchByRoles;
	}

	public void setSearchByRoles(Boolean searchByRoles) {
		this.searchByRoles = searchByRoles;

		_searchByRolesSupplier = () -> searchByRoles;
	}

	@JsonIgnore
	public void setSearchByRoles(
		UnsafeSupplier<Boolean, Exception> searchByRolesUnsafeSupplier) {

		searchByRoles = null;

		_searchByRolesSupplier = () -> {
			try {
				return searchByRolesUnsafeSupplier.get();
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
	protected Boolean searchByRoles;

	private Supplier<Boolean> _searchByRolesSupplier = () -> null;

	@Schema
	public Boolean getSearchByUserRoles() {
		if (searchByUserRoles != null) {
			return searchByUserRoles;
		}

		searchByUserRoles = _searchByUserRolesSupplier.get();

		return searchByUserRoles;
	}

	public void setSearchByUserRoles(Boolean searchByUserRoles) {
		this.searchByUserRoles = searchByUserRoles;

		_searchByUserRolesSupplier = () -> searchByUserRoles;
	}

	@JsonIgnore
	public void setSearchByUserRoles(
		UnsafeSupplier<Boolean, Exception> searchByUserRolesUnsafeSupplier) {

		searchByUserRoles = null;

		_searchByUserRolesSupplier = () -> {
			try {
				return searchByUserRolesUnsafeSupplier.get();
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
	protected Boolean searchByUserRoles;

	private Supplier<Boolean> _searchByUserRolesSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long workflowDefinitionId;

	private Supplier<Long> _workflowDefinitionIdSupplier = () -> null;

	@Schema
	public Long[] getWorkflowInstanceIds() {
		if (workflowInstanceIds != null) {
			return workflowInstanceIds;
		}

		workflowInstanceIds = _workflowInstanceIdsSupplier.get();

		return workflowInstanceIds;
	}

	public void setWorkflowInstanceIds(Long[] workflowInstanceIds) {
		this.workflowInstanceIds = workflowInstanceIds;

		_workflowInstanceIdsSupplier = () -> workflowInstanceIds;
	}

	@JsonIgnore
	public void setWorkflowInstanceIds(
		UnsafeSupplier<Long[], Exception> workflowInstanceIdsUnsafeSupplier) {

		workflowInstanceIds = null;

		_workflowInstanceIdsSupplier = () -> {
			try {
				return workflowInstanceIdsUnsafeSupplier.get();
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
	protected Long[] workflowInstanceIds;

	private Supplier<Long[]> _workflowInstanceIdsSupplier = () -> null;

	@Schema
	public String[] getWorkflowTaskNames() {
		if (workflowTaskNames != null) {
			return workflowTaskNames;
		}

		workflowTaskNames = _workflowTaskNamesSupplier.get();

		return workflowTaskNames;
	}

	public void setWorkflowTaskNames(String[] workflowTaskNames) {
		this.workflowTaskNames = workflowTaskNames;

		_workflowTaskNamesSupplier = () -> workflowTaskNames;
	}

	@JsonIgnore
	public void setWorkflowTaskNames(
		UnsafeSupplier<String[], Exception> workflowTaskNamesUnsafeSupplier) {

		workflowTaskNames = null;

		_workflowTaskNamesSupplier = () -> {
			try {
				return workflowTaskNamesUnsafeSupplier.get();
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
	protected String[] workflowTaskNames;

	private Supplier<String[]> _workflowTaskNamesSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WorkflowTasksBulkSelection)) {
			return false;
		}

		WorkflowTasksBulkSelection workflowTasksBulkSelection =
			(WorkflowTasksBulkSelection)object;

		return Objects.equals(
			toString(), workflowTasksBulkSelection.toString());
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

		if (andOperator != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"andOperator\": ");

			sb.append(andOperator);
		}

		if (assetPrimaryKeys != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assetPrimaryKeys\": ");

			sb.append("[");

			for (int i = 0; i < assetPrimaryKeys.length; i++) {
				sb.append(assetPrimaryKeys[i]);

				if ((i + 1) < assetPrimaryKeys.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
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

		if (assetTypes != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assetTypes\": ");

			sb.append("[");

			for (int i = 0; i < assetTypes.length; i++) {
				sb.append("\"");

				sb.append(_escape(assetTypes[i]));

				sb.append("\"");

				if ((i + 1) < assetTypes.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (assigneeIds != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assigneeIds\": ");

			sb.append("[");

			for (int i = 0; i < assigneeIds.length; i++) {
				sb.append(assigneeIds[i]);

				if ((i + 1) < assigneeIds.length) {
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

		if (dateDueEnd != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateDueEnd\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dateDueEnd));

			sb.append("\"");
		}

		if (dateDueStart != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateDueStart\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dateDueStart));

			sb.append("\"");
		}

		if (searchByRoles != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"searchByRoles\": ");

			sb.append(searchByRoles);
		}

		if (searchByUserRoles != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"searchByUserRoles\": ");

			sb.append(searchByUserRoles);
		}

		if (workflowDefinitionId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"workflowDefinitionId\": ");

			sb.append(workflowDefinitionId);
		}

		if (workflowInstanceIds != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"workflowInstanceIds\": ");

			sb.append("[");

			for (int i = 0; i < workflowInstanceIds.length; i++) {
				sb.append(workflowInstanceIds[i]);

				if ((i + 1) < workflowInstanceIds.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (workflowTaskNames != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"workflowTaskNames\": ");

			sb.append("[");

			for (int i = 0; i < workflowTaskNames.length; i++) {
				sb.append("\"");

				sb.append(_escape(workflowTaskNames[i]));

				sb.append("\"");

				if ((i + 1) < workflowTaskNames.length) {
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
		defaultValue = "com.liferay.headless.admin.workflow.dto.v1_0.WorkflowTasksBulkSelection",
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