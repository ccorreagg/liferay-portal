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
@GraphQLName(description = "https://www.schema.org/SLA", value = "SLA")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "SLA")
public class SLA implements Serializable {

	public static SLA toDTO(String json) {
		return ObjectMapperUtil.readValue(SLA.class, json);
	}

	public static SLA unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(SLA.class, json);
	}

	@Schema
	public String getCalendarKey() {
		if (calendarKey != null) {
			return calendarKey;
		}

		calendarKey = _calendarKeySupplier.get();

		return calendarKey;
	}

	public void setCalendarKey(String calendarKey) {
		this.calendarKey = calendarKey;

		_calendarKeySupplier = () -> calendarKey;
	}

	@JsonIgnore
	public void setCalendarKey(
		UnsafeSupplier<String, Exception> calendarKeyUnsafeSupplier) {

		calendarKey = null;

		_calendarKeySupplier = () -> {
			try {
				return calendarKeyUnsafeSupplier.get();
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
	protected String calendarKey;

	private Supplier<String> _calendarKeySupplier = () -> null;

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
	public PauseNodeKeys getPauseNodeKeys() {
		if (pauseNodeKeys != null) {
			return pauseNodeKeys;
		}

		pauseNodeKeys = _pauseNodeKeysSupplier.get();

		return pauseNodeKeys;
	}

	public void setPauseNodeKeys(PauseNodeKeys pauseNodeKeys) {
		this.pauseNodeKeys = pauseNodeKeys;

		_pauseNodeKeysSupplier = () -> pauseNodeKeys;
	}

	@JsonIgnore
	public void setPauseNodeKeys(
		UnsafeSupplier<PauseNodeKeys, Exception> pauseNodeKeysUnsafeSupplier) {

		pauseNodeKeys = null;

		_pauseNodeKeysSupplier = () -> {
			try {
				return pauseNodeKeysUnsafeSupplier.get();
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
	protected PauseNodeKeys pauseNodeKeys;

	private Supplier<PauseNodeKeys> _pauseNodeKeysSupplier = () -> null;

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
	@Valid
	public StartNodeKeys getStartNodeKeys() {
		if (startNodeKeys != null) {
			return startNodeKeys;
		}

		startNodeKeys = _startNodeKeysSupplier.get();

		return startNodeKeys;
	}

	public void setStartNodeKeys(StartNodeKeys startNodeKeys) {
		this.startNodeKeys = startNodeKeys;

		_startNodeKeysSupplier = () -> startNodeKeys;
	}

	@JsonIgnore
	public void setStartNodeKeys(
		UnsafeSupplier<StartNodeKeys, Exception> startNodeKeysUnsafeSupplier) {

		startNodeKeys = null;

		_startNodeKeysSupplier = () -> {
			try {
				return startNodeKeysUnsafeSupplier.get();
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
	protected StartNodeKeys startNodeKeys;

	private Supplier<StartNodeKeys> _startNodeKeysSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer status;

	private Supplier<Integer> _statusSupplier = () -> null;

	@Schema
	@Valid
	public StopNodeKeys getStopNodeKeys() {
		if (stopNodeKeys != null) {
			return stopNodeKeys;
		}

		stopNodeKeys = _stopNodeKeysSupplier.get();

		return stopNodeKeys;
	}

	public void setStopNodeKeys(StopNodeKeys stopNodeKeys) {
		this.stopNodeKeys = stopNodeKeys;

		_stopNodeKeysSupplier = () -> stopNodeKeys;
	}

	@JsonIgnore
	public void setStopNodeKeys(
		UnsafeSupplier<StopNodeKeys, Exception> stopNodeKeysUnsafeSupplier) {

		stopNodeKeys = null;

		_stopNodeKeysSupplier = () -> {
			try {
				return stopNodeKeysUnsafeSupplier.get();
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
	protected StopNodeKeys stopNodeKeys;

	private Supplier<StopNodeKeys> _stopNodeKeysSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SLA)) {
			return false;
		}

		SLA sla = (SLA)object;

		return Objects.equals(toString(), sla.toString());
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

		if (calendarKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"calendarKey\": ");

			sb.append("\"");

			sb.append(_escape(calendarKey));

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

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(name));

			sb.append("\"");
		}

		if (pauseNodeKeys != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"pauseNodeKeys\": ");

			sb.append(String.valueOf(pauseNodeKeys));
		}

		if (processId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"processId\": ");

			sb.append(processId);
		}

		if (startNodeKeys != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"startNodeKeys\": ");

			sb.append(String.valueOf(startNodeKeys));
		}

		if (status != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append(status);
		}

		if (stopNodeKeys != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"stopNodeKeys\": ");

			sb.append(String.valueOf(stopNodeKeys));
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.portal.workflow.metrics.rest.dto.v1_0.SLA",
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