/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.dispatch.rest.dto.v1_0;

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
 * @author Nilton Vieira
 * @generated
 */
@Generated("")
@GraphQLName("DispatchTrigger")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "DispatchTrigger")
public class DispatchTrigger implements Serializable {

	public static DispatchTrigger toDTO(String json) {
		return ObjectMapperUtil.readValue(DispatchTrigger.class, json);
	}

	public static DispatchTrigger unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(DispatchTrigger.class, json);
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
	public Long getCompanyId() {
		if (companyId != null) {
			return companyId;
		}

		companyId = _companyIdSupplier.get();

		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;

		_companyIdSupplier = () -> companyId;
	}

	@JsonIgnore
	public void setCompanyId(
		UnsafeSupplier<Long, Exception> companyIdUnsafeSupplier) {

		companyId = null;

		_companyIdSupplier = () -> {
			try {
				return companyIdUnsafeSupplier.get();
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
	protected Long companyId;

	private Supplier<Long> _companyIdSupplier = () -> null;

	@Schema
	public String getCronExpression() {
		if (cronExpression != null) {
			return cronExpression;
		}

		cronExpression = _cronExpressionSupplier.get();

		return cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;

		_cronExpressionSupplier = () -> cronExpression;
	}

	@JsonIgnore
	public void setCronExpression(
		UnsafeSupplier<String, Exception> cronExpressionUnsafeSupplier) {

		cronExpression = null;

		_cronExpressionSupplier = () -> {
			try {
				return cronExpressionUnsafeSupplier.get();
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
	protected String cronExpression;

	private Supplier<String> _cronExpressionSupplier = () -> null;

	@Schema
	public Integer getDispatchTaskClusterMode() {
		if (dispatchTaskClusterMode != null) {
			return dispatchTaskClusterMode;
		}

		dispatchTaskClusterMode = _dispatchTaskClusterModeSupplier.get();

		return dispatchTaskClusterMode;
	}

	public void setDispatchTaskClusterMode(Integer dispatchTaskClusterMode) {
		this.dispatchTaskClusterMode = dispatchTaskClusterMode;

		_dispatchTaskClusterModeSupplier = () -> dispatchTaskClusterMode;
	}

	@JsonIgnore
	public void setDispatchTaskClusterMode(
		UnsafeSupplier<Integer, Exception>
			dispatchTaskClusterModeUnsafeSupplier) {

		dispatchTaskClusterMode = null;

		_dispatchTaskClusterModeSupplier = () -> {
			try {
				return dispatchTaskClusterModeUnsafeSupplier.get();
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
	protected Integer dispatchTaskClusterMode;

	private Supplier<Integer> _dispatchTaskClusterModeSupplier = () -> null;

	@Schema
	public String getDispatchTaskExecutorType() {
		if (dispatchTaskExecutorType != null) {
			return dispatchTaskExecutorType;
		}

		dispatchTaskExecutorType = _dispatchTaskExecutorTypeSupplier.get();

		return dispatchTaskExecutorType;
	}

	public void setDispatchTaskExecutorType(String dispatchTaskExecutorType) {
		this.dispatchTaskExecutorType = dispatchTaskExecutorType;

		_dispatchTaskExecutorTypeSupplier = () -> dispatchTaskExecutorType;
	}

	@JsonIgnore
	public void setDispatchTaskExecutorType(
		UnsafeSupplier<String, Exception>
			dispatchTaskExecutorTypeUnsafeSupplier) {

		dispatchTaskExecutorType = null;

		_dispatchTaskExecutorTypeSupplier = () -> {
			try {
				return dispatchTaskExecutorTypeUnsafeSupplier.get();
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
	protected String dispatchTaskExecutorType;

	private Supplier<String> _dispatchTaskExecutorTypeSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, ?> getDispatchTaskSettings() {
		if (dispatchTaskSettings != null) {
			return dispatchTaskSettings;
		}

		dispatchTaskSettings = _dispatchTaskSettingsSupplier.get();

		return dispatchTaskSettings;
	}

	public void setDispatchTaskSettings(Map<String, ?> dispatchTaskSettings) {
		this.dispatchTaskSettings = dispatchTaskSettings;

		_dispatchTaskSettingsSupplier = () -> dispatchTaskSettings;
	}

	@JsonIgnore
	public void setDispatchTaskSettings(
		UnsafeSupplier<Map<String, ?>, Exception>
			dispatchTaskSettingsUnsafeSupplier) {

		dispatchTaskSettings = null;

		_dispatchTaskSettingsSupplier = () -> {
			try {
				return dispatchTaskSettingsUnsafeSupplier.get();
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
	protected Map<String, ?> dispatchTaskSettings;

	private Supplier<Map<String, ?>> _dispatchTaskSettingsSupplier = () -> null;

	@Schema
	public Date getEndDate() {
		if (endDate != null) {
			return endDate;
		}

		endDate = _endDateSupplier.get();

		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;

		_endDateSupplier = () -> endDate;
	}

	@JsonIgnore
	public void setEndDate(
		UnsafeSupplier<Date, Exception> endDateUnsafeSupplier) {

		endDate = null;

		_endDateSupplier = () -> {
			try {
				return endDateUnsafeSupplier.get();
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
	protected Date endDate;

	private Supplier<Date> _endDateSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
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
	public Boolean getOverlapAllowed() {
		if (overlapAllowed != null) {
			return overlapAllowed;
		}

		overlapAllowed = _overlapAllowedSupplier.get();

		return overlapAllowed;
	}

	public void setOverlapAllowed(Boolean overlapAllowed) {
		this.overlapAllowed = overlapAllowed;

		_overlapAllowedSupplier = () -> overlapAllowed;
	}

	@JsonIgnore
	public void setOverlapAllowed(
		UnsafeSupplier<Boolean, Exception> overlapAllowedUnsafeSupplier) {

		overlapAllowed = null;

		_overlapAllowedSupplier = () -> {
			try {
				return overlapAllowedUnsafeSupplier.get();
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
	protected Boolean overlapAllowed;

	private Supplier<Boolean> _overlapAllowedSupplier = () -> null;

	@Schema
	public Date getStartDate() {
		if (startDate != null) {
			return startDate;
		}

		startDate = _startDateSupplier.get();

		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;

		_startDateSupplier = () -> startDate;
	}

	@JsonIgnore
	public void setStartDate(
		UnsafeSupplier<Date, Exception> startDateUnsafeSupplier) {

		startDate = null;

		_startDateSupplier = () -> {
			try {
				return startDateUnsafeSupplier.get();
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
	protected Date startDate;

	private Supplier<Date> _startDateSupplier = () -> null;

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
	public String getTimeZoneId() {
		if (timeZoneId != null) {
			return timeZoneId;
		}

		timeZoneId = _timeZoneIdSupplier.get();

		return timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;

		_timeZoneIdSupplier = () -> timeZoneId;
	}

	@JsonIgnore
	public void setTimeZoneId(
		UnsafeSupplier<String, Exception> timeZoneIdUnsafeSupplier) {

		timeZoneId = null;

		_timeZoneIdSupplier = () -> {
			try {
				return timeZoneIdUnsafeSupplier.get();
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
	protected String timeZoneId;

	private Supplier<String> _timeZoneIdSupplier = () -> null;

	@Schema
	public Long getUserId() {
		if (userId != null) {
			return userId;
		}

		userId = _userIdSupplier.get();

		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;

		_userIdSupplier = () -> userId;
	}

	@JsonIgnore
	public void setUserId(
		UnsafeSupplier<Long, Exception> userIdUnsafeSupplier) {

		userId = null;

		_userIdSupplier = () -> {
			try {
				return userIdUnsafeSupplier.get();
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
	protected Long userId;

	private Supplier<Long> _userIdSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DispatchTrigger)) {
			return false;
		}

		DispatchTrigger dispatchTrigger = (DispatchTrigger)object;

		return Objects.equals(toString(), dispatchTrigger.toString());
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

		if (companyId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"companyId\": ");

			sb.append(companyId);
		}

		if (cronExpression != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cronExpression\": ");

			sb.append("\"");

			sb.append(_escape(cronExpression));

			sb.append("\"");
		}

		if (dispatchTaskClusterMode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dispatchTaskClusterMode\": ");

			sb.append(dispatchTaskClusterMode);
		}

		if (dispatchTaskExecutorType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dispatchTaskExecutorType\": ");

			sb.append("\"");

			sb.append(_escape(dispatchTaskExecutorType));

			sb.append("\"");
		}

		if (dispatchTaskSettings != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dispatchTaskSettings\": ");

			sb.append(_toJSON(dispatchTaskSettings));
		}

		if (endDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"endDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(endDate));

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

		if (overlapAllowed != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"overlapAllowed\": ");

			sb.append(overlapAllowed);
		}

		if (startDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"startDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(startDate));

			sb.append("\"");
		}

		if (system != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"system\": ");

			sb.append(system);
		}

		if (timeZoneId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"timeZoneId\": ");

			sb.append("\"");

			sb.append(_escape(timeZoneId));

			sb.append("\"");
		}

		if (userId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userId\": ");

			sb.append(userId);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.dispatch.rest.dto.v1_0.DispatchTrigger",
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