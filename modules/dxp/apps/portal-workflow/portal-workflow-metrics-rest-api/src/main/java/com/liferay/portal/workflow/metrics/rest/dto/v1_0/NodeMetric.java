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
	description = "https://www.schema.org/NodeMetric", value = "NodeMetric"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "NodeMetric")
public class NodeMetric implements Serializable {

	public static NodeMetric toDTO(String json) {
		return ObjectMapperUtil.readValue(NodeMetric.class, json);
	}

	public static NodeMetric unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(NodeMetric.class, json);
	}

	@Schema
	public Long getBreachedInstanceCount() {
		if (breachedInstanceCount != null) {
			return breachedInstanceCount;
		}

		breachedInstanceCount = _breachedInstanceCountSupplier.get();

		return breachedInstanceCount;
	}

	public void setBreachedInstanceCount(Long breachedInstanceCount) {
		this.breachedInstanceCount = breachedInstanceCount;

		_breachedInstanceCountSupplier = () -> breachedInstanceCount;
	}

	@JsonIgnore
	public void setBreachedInstanceCount(
		UnsafeSupplier<Long, Exception> breachedInstanceCountUnsafeSupplier) {

		breachedInstanceCount = null;

		_breachedInstanceCountSupplier = () -> {
			try {
				return breachedInstanceCountUnsafeSupplier.get();
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
	protected Long breachedInstanceCount;

	private Supplier<Long> _breachedInstanceCountSupplier = () -> null;

	@Schema
	public Double getBreachedInstancePercentage() {
		if (breachedInstancePercentage != null) {
			return breachedInstancePercentage;
		}

		breachedInstancePercentage = _breachedInstancePercentageSupplier.get();

		return breachedInstancePercentage;
	}

	public void setBreachedInstancePercentage(
		Double breachedInstancePercentage) {

		this.breachedInstancePercentage = breachedInstancePercentage;

		_breachedInstancePercentageSupplier = () -> breachedInstancePercentage;
	}

	@JsonIgnore
	public void setBreachedInstancePercentage(
		UnsafeSupplier<Double, Exception>
			breachedInstancePercentageUnsafeSupplier) {

		breachedInstancePercentage = null;

		_breachedInstancePercentageSupplier = () -> {
			try {
				return breachedInstancePercentageUnsafeSupplier.get();
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
	protected Double breachedInstancePercentage;

	private Supplier<Double> _breachedInstancePercentageSupplier = () -> null;

	@Schema
	public Long getDurationAvg() {
		if (durationAvg != null) {
			return durationAvg;
		}

		durationAvg = _durationAvgSupplier.get();

		return durationAvg;
	}

	public void setDurationAvg(Long durationAvg) {
		this.durationAvg = durationAvg;

		_durationAvgSupplier = () -> durationAvg;
	}

	@JsonIgnore
	public void setDurationAvg(
		UnsafeSupplier<Long, Exception> durationAvgUnsafeSupplier) {

		durationAvg = null;

		_durationAvgSupplier = () -> {
			try {
				return durationAvgUnsafeSupplier.get();
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
	protected Long durationAvg;

	private Supplier<Long> _durationAvgSupplier = () -> null;

	@Schema
	public Long getInstanceCount() {
		if (instanceCount != null) {
			return instanceCount;
		}

		instanceCount = _instanceCountSupplier.get();

		return instanceCount;
	}

	public void setInstanceCount(Long instanceCount) {
		this.instanceCount = instanceCount;

		_instanceCountSupplier = () -> instanceCount;
	}

	@JsonIgnore
	public void setInstanceCount(
		UnsafeSupplier<Long, Exception> instanceCountUnsafeSupplier) {

		instanceCount = null;

		_instanceCountSupplier = () -> {
			try {
				return instanceCountUnsafeSupplier.get();
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
	protected Long instanceCount;

	private Supplier<Long> _instanceCountSupplier = () -> null;

	@Schema
	@Valid
	public Node getNode() {
		if (node != null) {
			return node;
		}

		node = _nodeSupplier.get();

		return node;
	}

	public void setNode(Node node) {
		this.node = node;

		_nodeSupplier = () -> node;
	}

	@JsonIgnore
	public void setNode(UnsafeSupplier<Node, Exception> nodeUnsafeSupplier) {
		node = null;

		_nodeSupplier = () -> {
			try {
				return nodeUnsafeSupplier.get();
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
	protected Node node;

	private Supplier<Node> _nodeSupplier = () -> null;

	@Schema
	public Long getOnTimeInstanceCount() {
		if (onTimeInstanceCount != null) {
			return onTimeInstanceCount;
		}

		onTimeInstanceCount = _onTimeInstanceCountSupplier.get();

		return onTimeInstanceCount;
	}

	public void setOnTimeInstanceCount(Long onTimeInstanceCount) {
		this.onTimeInstanceCount = onTimeInstanceCount;

		_onTimeInstanceCountSupplier = () -> onTimeInstanceCount;
	}

	@JsonIgnore
	public void setOnTimeInstanceCount(
		UnsafeSupplier<Long, Exception> onTimeInstanceCountUnsafeSupplier) {

		onTimeInstanceCount = null;

		_onTimeInstanceCountSupplier = () -> {
			try {
				return onTimeInstanceCountUnsafeSupplier.get();
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
	protected Long onTimeInstanceCount;

	private Supplier<Long> _onTimeInstanceCountSupplier = () -> null;

	@Schema
	public Long getOverdueInstanceCount() {
		if (overdueInstanceCount != null) {
			return overdueInstanceCount;
		}

		overdueInstanceCount = _overdueInstanceCountSupplier.get();

		return overdueInstanceCount;
	}

	public void setOverdueInstanceCount(Long overdueInstanceCount) {
		this.overdueInstanceCount = overdueInstanceCount;

		_overdueInstanceCountSupplier = () -> overdueInstanceCount;
	}

	@JsonIgnore
	public void setOverdueInstanceCount(
		UnsafeSupplier<Long, Exception> overdueInstanceCountUnsafeSupplier) {

		overdueInstanceCount = null;

		_overdueInstanceCountSupplier = () -> {
			try {
				return overdueInstanceCountUnsafeSupplier.get();
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
	protected Long overdueInstanceCount;

	private Supplier<Long> _overdueInstanceCountSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NodeMetric)) {
			return false;
		}

		NodeMetric nodeMetric = (NodeMetric)object;

		return Objects.equals(toString(), nodeMetric.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (breachedInstanceCount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"breachedInstanceCount\": ");

			sb.append(breachedInstanceCount);
		}

		if (breachedInstancePercentage != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"breachedInstancePercentage\": ");

			sb.append(breachedInstancePercentage);
		}

		if (durationAvg != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"durationAvg\": ");

			sb.append(durationAvg);
		}

		if (instanceCount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"instanceCount\": ");

			sb.append(instanceCount);
		}

		if (node != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"node\": ");

			sb.append(String.valueOf(node));
		}

		if (onTimeInstanceCount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"onTimeInstanceCount\": ");

			sb.append(onTimeInstanceCount);
		}

		if (overdueInstanceCount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"overdueInstanceCount\": ");

			sb.append(overdueInstanceCount);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.portal.workflow.metrics.rest.dto.v1_0.NodeMetric",
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