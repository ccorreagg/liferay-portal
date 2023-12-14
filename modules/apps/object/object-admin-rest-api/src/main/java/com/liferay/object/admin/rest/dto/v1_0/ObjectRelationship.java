/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.admin.rest.dto.v1_0;

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
@GraphQLName("ObjectRelationship")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ObjectRelationship")
public class ObjectRelationship implements Serializable {

	public static ObjectRelationship toDTO(String json) {
		return ObjectMapperUtil.readValue(ObjectRelationship.class, json);
	}

	public static ObjectRelationship unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(ObjectRelationship.class, json);
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
	public DeletionType getDeletionType() {
		if (deletionType != null) {
			return deletionType;
		}

		deletionType = _deletionTypeSupplier.get();

		return deletionType;
	}

	@JsonIgnore
	public String getDeletionTypeAsString() {
		if (deletionType == null) {
			return null;
		}

		return deletionType.toString();
	}

	public void setDeletionType(DeletionType deletionType) {
		this.deletionType = deletionType;

		_deletionTypeSupplier = () -> deletionType;
	}

	@JsonIgnore
	public void setDeletionType(
		UnsafeSupplier<DeletionType, Exception> deletionTypeUnsafeSupplier) {

		deletionType = null;

		_deletionTypeSupplier = () -> {
			try {
				return deletionTypeUnsafeSupplier.get();
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
	protected DeletionType deletionType;

	private Supplier<DeletionType> _deletionTypeSupplier = () -> null;

	@Schema
	public Boolean getEdge() {
		if (edge != null) {
			return edge;
		}

		edge = _edgeSupplier.get();

		return edge;
	}

	public void setEdge(Boolean edge) {
		this.edge = edge;

		_edgeSupplier = () -> edge;
	}

	@JsonIgnore
	public void setEdge(UnsafeSupplier<Boolean, Exception> edgeUnsafeSupplier) {
		edge = null;

		_edgeSupplier = () -> {
			try {
				return edgeUnsafeSupplier.get();
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
	protected Boolean edge;

	private Supplier<Boolean> _edgeSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, String> getLabel() {
		if (label != null) {
			return label;
		}

		label = _labelSupplier.get();

		return label;
	}

	public void setLabel(Map<String, String> label) {
		this.label = label;

		_labelSupplier = () -> label;
	}

	@JsonIgnore
	public void setLabel(
		UnsafeSupplier<Map<String, String>, Exception> labelUnsafeSupplier) {

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
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> label;

	private Supplier<Map<String, String>> _labelSupplier = () -> null;

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
	public String getObjectDefinitionExternalReferenceCode1() {
		if (objectDefinitionExternalReferenceCode1 != null) {
			return objectDefinitionExternalReferenceCode1;
		}

		objectDefinitionExternalReferenceCode1 =
			_objectDefinitionExternalReferenceCode1Supplier.get();

		return objectDefinitionExternalReferenceCode1;
	}

	public void setObjectDefinitionExternalReferenceCode1(
		String objectDefinitionExternalReferenceCode1) {

		this.objectDefinitionExternalReferenceCode1 =
			objectDefinitionExternalReferenceCode1;

		_objectDefinitionExternalReferenceCode1Supplier =
			() -> objectDefinitionExternalReferenceCode1;
	}

	@JsonIgnore
	public void setObjectDefinitionExternalReferenceCode1(
		UnsafeSupplier<String, Exception>
			objectDefinitionExternalReferenceCode1UnsafeSupplier) {

		objectDefinitionExternalReferenceCode1 = null;

		_objectDefinitionExternalReferenceCode1Supplier = () -> {
			try {
				return objectDefinitionExternalReferenceCode1UnsafeSupplier.
					get();
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
	protected String objectDefinitionExternalReferenceCode1;

	private Supplier<String> _objectDefinitionExternalReferenceCode1Supplier =
		() -> null;

	@Schema
	public String getObjectDefinitionExternalReferenceCode2() {
		if (objectDefinitionExternalReferenceCode2 != null) {
			return objectDefinitionExternalReferenceCode2;
		}

		objectDefinitionExternalReferenceCode2 =
			_objectDefinitionExternalReferenceCode2Supplier.get();

		return objectDefinitionExternalReferenceCode2;
	}

	public void setObjectDefinitionExternalReferenceCode2(
		String objectDefinitionExternalReferenceCode2) {

		this.objectDefinitionExternalReferenceCode2 =
			objectDefinitionExternalReferenceCode2;

		_objectDefinitionExternalReferenceCode2Supplier =
			() -> objectDefinitionExternalReferenceCode2;
	}

	@JsonIgnore
	public void setObjectDefinitionExternalReferenceCode2(
		UnsafeSupplier<String, Exception>
			objectDefinitionExternalReferenceCode2UnsafeSupplier) {

		objectDefinitionExternalReferenceCode2 = null;

		_objectDefinitionExternalReferenceCode2Supplier = () -> {
			try {
				return objectDefinitionExternalReferenceCode2UnsafeSupplier.
					get();
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
	protected String objectDefinitionExternalReferenceCode2;

	private Supplier<String> _objectDefinitionExternalReferenceCode2Supplier =
		() -> null;

	@Schema
	public Long getObjectDefinitionId1() {
		if (objectDefinitionId1 != null) {
			return objectDefinitionId1;
		}

		objectDefinitionId1 = _objectDefinitionId1Supplier.get();

		return objectDefinitionId1;
	}

	public void setObjectDefinitionId1(Long objectDefinitionId1) {
		this.objectDefinitionId1 = objectDefinitionId1;

		_objectDefinitionId1Supplier = () -> objectDefinitionId1;
	}

	@JsonIgnore
	public void setObjectDefinitionId1(
		UnsafeSupplier<Long, Exception> objectDefinitionId1UnsafeSupplier) {

		objectDefinitionId1 = null;

		_objectDefinitionId1Supplier = () -> {
			try {
				return objectDefinitionId1UnsafeSupplier.get();
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
	protected Long objectDefinitionId1;

	private Supplier<Long> _objectDefinitionId1Supplier = () -> null;

	@Schema
	public Long getObjectDefinitionId2() {
		if (objectDefinitionId2 != null) {
			return objectDefinitionId2;
		}

		objectDefinitionId2 = _objectDefinitionId2Supplier.get();

		return objectDefinitionId2;
	}

	public void setObjectDefinitionId2(Long objectDefinitionId2) {
		this.objectDefinitionId2 = objectDefinitionId2;

		_objectDefinitionId2Supplier = () -> objectDefinitionId2;
	}

	@JsonIgnore
	public void setObjectDefinitionId2(
		UnsafeSupplier<Long, Exception> objectDefinitionId2UnsafeSupplier) {

		objectDefinitionId2 = null;

		_objectDefinitionId2Supplier = () -> {
			try {
				return objectDefinitionId2UnsafeSupplier.get();
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
	protected Long objectDefinitionId2;

	private Supplier<Long> _objectDefinitionId2Supplier = () -> null;

	@Schema
	public Boolean getObjectDefinitionModifiable2() {
		if (objectDefinitionModifiable2 != null) {
			return objectDefinitionModifiable2;
		}

		objectDefinitionModifiable2 =
			_objectDefinitionModifiable2Supplier.get();

		return objectDefinitionModifiable2;
	}

	public void setObjectDefinitionModifiable2(
		Boolean objectDefinitionModifiable2) {

		this.objectDefinitionModifiable2 = objectDefinitionModifiable2;

		_objectDefinitionModifiable2Supplier =
			() -> objectDefinitionModifiable2;
	}

	@JsonIgnore
	public void setObjectDefinitionModifiable2(
		UnsafeSupplier<Boolean, Exception>
			objectDefinitionModifiable2UnsafeSupplier) {

		objectDefinitionModifiable2 = null;

		_objectDefinitionModifiable2Supplier = () -> {
			try {
				return objectDefinitionModifiable2UnsafeSupplier.get();
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
	protected Boolean objectDefinitionModifiable2;

	private Supplier<Boolean> _objectDefinitionModifiable2Supplier = () -> null;

	@Schema
	public String getObjectDefinitionName2() {
		if (objectDefinitionName2 != null) {
			return objectDefinitionName2;
		}

		objectDefinitionName2 = _objectDefinitionName2Supplier.get();

		return objectDefinitionName2;
	}

	public void setObjectDefinitionName2(String objectDefinitionName2) {
		this.objectDefinitionName2 = objectDefinitionName2;

		_objectDefinitionName2Supplier = () -> objectDefinitionName2;
	}

	@JsonIgnore
	public void setObjectDefinitionName2(
		UnsafeSupplier<String, Exception> objectDefinitionName2UnsafeSupplier) {

		objectDefinitionName2 = null;

		_objectDefinitionName2Supplier = () -> {
			try {
				return objectDefinitionName2UnsafeSupplier.get();
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
	protected String objectDefinitionName2;

	private Supplier<String> _objectDefinitionName2Supplier = () -> null;

	@Schema
	public Boolean getObjectDefinitionSystem2() {
		if (objectDefinitionSystem2 != null) {
			return objectDefinitionSystem2;
		}

		objectDefinitionSystem2 = _objectDefinitionSystem2Supplier.get();

		return objectDefinitionSystem2;
	}

	public void setObjectDefinitionSystem2(Boolean objectDefinitionSystem2) {
		this.objectDefinitionSystem2 = objectDefinitionSystem2;

		_objectDefinitionSystem2Supplier = () -> objectDefinitionSystem2;
	}

	@JsonIgnore
	public void setObjectDefinitionSystem2(
		UnsafeSupplier<Boolean, Exception>
			objectDefinitionSystem2UnsafeSupplier) {

		objectDefinitionSystem2 = null;

		_objectDefinitionSystem2Supplier = () -> {
			try {
				return objectDefinitionSystem2UnsafeSupplier.get();
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
	protected Boolean objectDefinitionSystem2;

	private Supplier<Boolean> _objectDefinitionSystem2Supplier = () -> null;

	@Schema
	@Valid
	public ObjectField getObjectField() {
		if (objectField != null) {
			return objectField;
		}

		objectField = _objectFieldSupplier.get();

		return objectField;
	}

	public void setObjectField(ObjectField objectField) {
		this.objectField = objectField;

		_objectFieldSupplier = () -> objectField;
	}

	@JsonIgnore
	public void setObjectField(
		UnsafeSupplier<ObjectField, Exception> objectFieldUnsafeSupplier) {

		objectField = null;

		_objectFieldSupplier = () -> {
			try {
				return objectFieldUnsafeSupplier.get();
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
	protected ObjectField objectField;

	private Supplier<ObjectField> _objectFieldSupplier = () -> null;

	@Schema
	public Long getParameterObjectFieldId() {
		if (parameterObjectFieldId != null) {
			return parameterObjectFieldId;
		}

		parameterObjectFieldId = _parameterObjectFieldIdSupplier.get();

		return parameterObjectFieldId;
	}

	public void setParameterObjectFieldId(Long parameterObjectFieldId) {
		this.parameterObjectFieldId = parameterObjectFieldId;

		_parameterObjectFieldIdSupplier = () -> parameterObjectFieldId;
	}

	@JsonIgnore
	public void setParameterObjectFieldId(
		UnsafeSupplier<Long, Exception> parameterObjectFieldIdUnsafeSupplier) {

		parameterObjectFieldId = null;

		_parameterObjectFieldIdSupplier = () -> {
			try {
				return parameterObjectFieldIdUnsafeSupplier.get();
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
	protected Long parameterObjectFieldId;

	private Supplier<Long> _parameterObjectFieldIdSupplier = () -> null;

	@Schema
	public String getParameterObjectFieldName() {
		if (parameterObjectFieldName != null) {
			return parameterObjectFieldName;
		}

		parameterObjectFieldName = _parameterObjectFieldNameSupplier.get();

		return parameterObjectFieldName;
	}

	public void setParameterObjectFieldName(String parameterObjectFieldName) {
		this.parameterObjectFieldName = parameterObjectFieldName;

		_parameterObjectFieldNameSupplier = () -> parameterObjectFieldName;
	}

	@JsonIgnore
	public void setParameterObjectFieldName(
		UnsafeSupplier<String, Exception>
			parameterObjectFieldNameUnsafeSupplier) {

		parameterObjectFieldName = null;

		_parameterObjectFieldNameSupplier = () -> {
			try {
				return parameterObjectFieldNameUnsafeSupplier.get();
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
	protected String parameterObjectFieldName;

	private Supplier<String> _parameterObjectFieldNameSupplier = () -> null;

	@Schema
	public Boolean getReverse() {
		if (reverse != null) {
			return reverse;
		}

		reverse = _reverseSupplier.get();

		return reverse;
	}

	public void setReverse(Boolean reverse) {
		this.reverse = reverse;

		_reverseSupplier = () -> reverse;
	}

	@JsonIgnore
	public void setReverse(
		UnsafeSupplier<Boolean, Exception> reverseUnsafeSupplier) {

		reverse = null;

		_reverseSupplier = () -> {
			try {
				return reverseUnsafeSupplier.get();
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
	protected Boolean reverse;

	private Supplier<Boolean> _reverseSupplier = () -> null;

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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Type type;

	private Supplier<Type> _typeSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ObjectRelationship)) {
			return false;
		}

		ObjectRelationship objectRelationship = (ObjectRelationship)object;

		return Objects.equals(toString(), objectRelationship.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (actions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actions\": ");

			sb.append(_toJSON(actions));
		}

		if (deletionType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"deletionType\": ");

			sb.append("\"");

			sb.append(deletionType);

			sb.append("\"");
		}

		if (edge != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"edge\": ");

			sb.append(edge);
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

		if (label != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"label\": ");

			sb.append(_toJSON(label));
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

		if (objectDefinitionExternalReferenceCode1 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectDefinitionExternalReferenceCode1\": ");

			sb.append("\"");

			sb.append(_escape(objectDefinitionExternalReferenceCode1));

			sb.append("\"");
		}

		if (objectDefinitionExternalReferenceCode2 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectDefinitionExternalReferenceCode2\": ");

			sb.append("\"");

			sb.append(_escape(objectDefinitionExternalReferenceCode2));

			sb.append("\"");
		}

		if (objectDefinitionId1 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectDefinitionId1\": ");

			sb.append(objectDefinitionId1);
		}

		if (objectDefinitionId2 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectDefinitionId2\": ");

			sb.append(objectDefinitionId2);
		}

		if (objectDefinitionModifiable2 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectDefinitionModifiable2\": ");

			sb.append(objectDefinitionModifiable2);
		}

		if (objectDefinitionName2 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectDefinitionName2\": ");

			sb.append("\"");

			sb.append(_escape(objectDefinitionName2));

			sb.append("\"");
		}

		if (objectDefinitionSystem2 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectDefinitionSystem2\": ");

			sb.append(objectDefinitionSystem2);
		}

		if (objectField != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectField\": ");

			sb.append(String.valueOf(objectField));
		}

		if (parameterObjectFieldId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parameterObjectFieldId\": ");

			sb.append(parameterObjectFieldId);
		}

		if (parameterObjectFieldName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parameterObjectFieldName\": ");

			sb.append("\"");

			sb.append(_escape(parameterObjectFieldName));

			sb.append("\"");
		}

		if (reverse != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"reverse\": ");

			sb.append(reverse);
		}

		if (system != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"system\": ");

			sb.append(system);
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

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.object.admin.rest.dto.v1_0.ObjectRelationship",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("DeletionType")
	public static enum DeletionType {

		CASCADE("cascade"), DISASSOCIATE("disassociate"), PREVENT("prevent");

		@JsonCreator
		public static DeletionType create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (DeletionType deletionType : values()) {
				if (Objects.equals(deletionType.getValue(), value)) {
					return deletionType;
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

		private DeletionType(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("Type")
	public static enum Type {

		ONE_TO_MANY("oneToMany"), ONE_TO_ONE("oneToOne"),
		MANY_TO_MANY("manyToMany");

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