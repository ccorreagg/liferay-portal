/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.delivery.dto.v1_0;

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
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "Represents a definition of a Page Rule Action.",
	value = "PageRuleAction"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "PageRuleAction")
public class PageRuleAction implements Serializable {

	public static PageRuleAction toDTO(String json) {
		return ObjectMapperUtil.readValue(PageRuleAction.class, json);
	}

	public static PageRuleAction unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(PageRuleAction.class, json);
	}

	@Schema(description = "The page rule action's action.")
	public String getAction() {
		if (action != null) {
			return action;
		}

		action = _actionSupplier.get();

		return action;
	}

	public void setAction(String action) {
		this.action = action;

		_actionSupplier = () -> action;
	}

	@JsonIgnore
	public void setAction(
		UnsafeSupplier<String, Exception> actionUnsafeSupplier) {

		action = null;

		_actionSupplier = () -> {
			try {
				return actionUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The page rule action's action.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String action;

	private Supplier<String> _actionSupplier = () -> null;

	@Schema(description = "The page rule action's ID.")
	public String getId() {
		if (id != null) {
			return id;
		}

		id = _idSupplier.get();

		return id;
	}

	public void setId(String id) {
		this.id = id;

		_idSupplier = () -> id;
	}

	@JsonIgnore
	public void setId(UnsafeSupplier<String, Exception> idUnsafeSupplier) {
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

	@GraphQLField(description = "The page rule action's ID.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String id;

	private Supplier<String> _idSupplier = () -> null;

	@Schema(description = "The page rule condition's item ID.")
	public String getItemId() {
		if (itemId != null) {
			return itemId;
		}

		itemId = _itemIdSupplier.get();

		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;

		_itemIdSupplier = () -> itemId;
	}

	@JsonIgnore
	public void setItemId(
		UnsafeSupplier<String, Exception> itemIdUnsafeSupplier) {

		itemId = null;

		_itemIdSupplier = () -> {
			try {
				return itemIdUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The page rule condition's item ID.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String itemId;

	private Supplier<String> _itemIdSupplier = () -> null;

	@Schema(description = "The page rule action's type.")
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

	@GraphQLField(description = "The page rule action's type.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String type;

	private Supplier<String> _typeSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PageRuleAction)) {
			return false;
		}

		PageRuleAction pageRuleAction = (PageRuleAction)object;

		return Objects.equals(toString(), pageRuleAction.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (action != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"action\": ");

			sb.append("\"");

			sb.append(_escape(action));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append("\"");

			sb.append(_escape(id));

			sb.append("\"");
		}

		if (itemId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"itemId\": ");

			sb.append("\"");

			sb.append(_escape(itemId));

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

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.delivery.dto.v1_0.PageRuleAction",
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