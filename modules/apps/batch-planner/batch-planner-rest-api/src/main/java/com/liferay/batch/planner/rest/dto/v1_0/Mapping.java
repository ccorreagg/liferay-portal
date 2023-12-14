/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.planner.rest.dto.v1_0;

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

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Matija Petanjek
 * @generated
 */
@Generated("")
@GraphQLName("Mapping")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Mapping")
public class Mapping implements Serializable {

	public static Mapping toDTO(String json) {
		return ObjectMapperUtil.readValue(Mapping.class, json);
	}

	public static Mapping unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Mapping.class, json);
	}

	@Schema
	public String getExternalFieldName() {
		if (externalFieldName != null) {
			return externalFieldName;
		}

		externalFieldName = _externalFieldNameSupplier.get();

		return externalFieldName;
	}

	public void setExternalFieldName(String externalFieldName) {
		this.externalFieldName = externalFieldName;

		_externalFieldNameSupplier = () -> externalFieldName;
	}

	@JsonIgnore
	public void setExternalFieldName(
		UnsafeSupplier<String, Exception> externalFieldNameUnsafeSupplier) {

		externalFieldName = null;

		_externalFieldNameSupplier = () -> {
			try {
				return externalFieldNameUnsafeSupplier.get();
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
	protected String externalFieldName;

	private Supplier<String> _externalFieldNameSupplier = () -> null;

	@Schema
	public String getExternalFieldType() {
		if (externalFieldType != null) {
			return externalFieldType;
		}

		externalFieldType = _externalFieldTypeSupplier.get();

		return externalFieldType;
	}

	public void setExternalFieldType(String externalFieldType) {
		this.externalFieldType = externalFieldType;

		_externalFieldTypeSupplier = () -> externalFieldType;
	}

	@JsonIgnore
	public void setExternalFieldType(
		UnsafeSupplier<String, Exception> externalFieldTypeUnsafeSupplier) {

		externalFieldType = null;

		_externalFieldTypeSupplier = () -> {
			try {
				return externalFieldTypeUnsafeSupplier.get();
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
	protected String externalFieldType;

	private Supplier<String> _externalFieldTypeSupplier = () -> null;

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
	public String getInternalFieldName() {
		if (internalFieldName != null) {
			return internalFieldName;
		}

		internalFieldName = _internalFieldNameSupplier.get();

		return internalFieldName;
	}

	public void setInternalFieldName(String internalFieldName) {
		this.internalFieldName = internalFieldName;

		_internalFieldNameSupplier = () -> internalFieldName;
	}

	@JsonIgnore
	public void setInternalFieldName(
		UnsafeSupplier<String, Exception> internalFieldNameUnsafeSupplier) {

		internalFieldName = null;

		_internalFieldNameSupplier = () -> {
			try {
				return internalFieldNameUnsafeSupplier.get();
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
	protected String internalFieldName;

	private Supplier<String> _internalFieldNameSupplier = () -> null;

	@Schema
	public String getInternalFieldType() {
		if (internalFieldType != null) {
			return internalFieldType;
		}

		internalFieldType = _internalFieldTypeSupplier.get();

		return internalFieldType;
	}

	public void setInternalFieldType(String internalFieldType) {
		this.internalFieldType = internalFieldType;

		_internalFieldTypeSupplier = () -> internalFieldType;
	}

	@JsonIgnore
	public void setInternalFieldType(
		UnsafeSupplier<String, Exception> internalFieldTypeUnsafeSupplier) {

		internalFieldType = null;

		_internalFieldTypeSupplier = () -> {
			try {
				return internalFieldTypeUnsafeSupplier.get();
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
	protected String internalFieldType;

	private Supplier<String> _internalFieldTypeSupplier = () -> null;

	@Schema
	public Long getPlanId() {
		if (planId != null) {
			return planId;
		}

		planId = _planIdSupplier.get();

		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;

		_planIdSupplier = () -> planId;
	}

	@JsonIgnore
	public void setPlanId(
		UnsafeSupplier<Long, Exception> planIdUnsafeSupplier) {

		planId = null;

		_planIdSupplier = () -> {
			try {
				return planIdUnsafeSupplier.get();
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
	protected Long planId;

	private Supplier<Long> _planIdSupplier = () -> null;

	@Schema
	public String getScript() {
		if (script != null) {
			return script;
		}

		script = _scriptSupplier.get();

		return script;
	}

	public void setScript(String script) {
		this.script = script;

		_scriptSupplier = () -> script;
	}

	@JsonIgnore
	public void setScript(
		UnsafeSupplier<String, Exception> scriptUnsafeSupplier) {

		script = null;

		_scriptSupplier = () -> {
			try {
				return scriptUnsafeSupplier.get();
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
	protected String script;

	private Supplier<String> _scriptSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Mapping)) {
			return false;
		}

		Mapping mapping = (Mapping)object;

		return Objects.equals(toString(), mapping.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (externalFieldName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"externalFieldName\": ");

			sb.append("\"");

			sb.append(_escape(externalFieldName));

			sb.append("\"");
		}

		if (externalFieldType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"externalFieldType\": ");

			sb.append("\"");

			sb.append(_escape(externalFieldType));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (internalFieldName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"internalFieldName\": ");

			sb.append("\"");

			sb.append(_escape(internalFieldName));

			sb.append("\"");
		}

		if (internalFieldType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"internalFieldType\": ");

			sb.append("\"");

			sb.append(_escape(internalFieldType));

			sb.append("\"");
		}

		if (planId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"planId\": ");

			sb.append(planId);
		}

		if (script != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"script\": ");

			sb.append("\"");

			sb.append(_escape(script));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.batch.planner.rest.dto.v1_0.Mapping",
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