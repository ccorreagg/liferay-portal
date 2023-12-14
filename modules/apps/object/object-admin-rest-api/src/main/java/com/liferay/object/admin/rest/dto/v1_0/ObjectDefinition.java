/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.admin.rest.dto.v1_0;

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
@GraphQLName("ObjectDefinition")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ObjectDefinition")
public class ObjectDefinition implements Serializable {

	public static ObjectDefinition toDTO(String json) {
		return ObjectMapperUtil.readValue(ObjectDefinition.class, json);
	}

	public static ObjectDefinition unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(ObjectDefinition.class, json);
	}

	@Schema
	public Boolean getAccountEntryRestricted() {
		if (accountEntryRestricted != null) {
			return accountEntryRestricted;
		}

		accountEntryRestricted = _accountEntryRestrictedSupplier.get();

		return accountEntryRestricted;
	}

	public void setAccountEntryRestricted(Boolean accountEntryRestricted) {
		this.accountEntryRestricted = accountEntryRestricted;

		_accountEntryRestrictedSupplier = () -> accountEntryRestricted;
	}

	@JsonIgnore
	public void setAccountEntryRestricted(
		UnsafeSupplier<Boolean, Exception>
			accountEntryRestrictedUnsafeSupplier) {

		accountEntryRestricted = null;

		_accountEntryRestrictedSupplier = () -> {
			try {
				return accountEntryRestrictedUnsafeSupplier.get();
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
	protected Boolean accountEntryRestricted;

	private Supplier<Boolean> _accountEntryRestrictedSupplier = () -> null;

	@Schema
	public String getAccountEntryRestrictedObjectFieldName() {
		if (accountEntryRestrictedObjectFieldName != null) {
			return accountEntryRestrictedObjectFieldName;
		}

		accountEntryRestrictedObjectFieldName =
			_accountEntryRestrictedObjectFieldNameSupplier.get();

		return accountEntryRestrictedObjectFieldName;
	}

	public void setAccountEntryRestrictedObjectFieldName(
		String accountEntryRestrictedObjectFieldName) {

		this.accountEntryRestrictedObjectFieldName =
			accountEntryRestrictedObjectFieldName;

		_accountEntryRestrictedObjectFieldNameSupplier =
			() -> accountEntryRestrictedObjectFieldName;
	}

	@JsonIgnore
	public void setAccountEntryRestrictedObjectFieldName(
		UnsafeSupplier<String, Exception>
			accountEntryRestrictedObjectFieldNameUnsafeSupplier) {

		accountEntryRestrictedObjectFieldName = null;

		_accountEntryRestrictedObjectFieldNameSupplier = () -> {
			try {
				return accountEntryRestrictedObjectFieldNameUnsafeSupplier.
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
	protected String accountEntryRestrictedObjectFieldName;

	private Supplier<String> _accountEntryRestrictedObjectFieldNameSupplier =
		() -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateModified;

	private Supplier<Date> _dateModifiedSupplier = () -> null;

	@Schema
	public String getDefaultLanguageId() {
		if (defaultLanguageId != null) {
			return defaultLanguageId;
		}

		defaultLanguageId = _defaultLanguageIdSupplier.get();

		return defaultLanguageId;
	}

	public void setDefaultLanguageId(String defaultLanguageId) {
		this.defaultLanguageId = defaultLanguageId;

		_defaultLanguageIdSupplier = () -> defaultLanguageId;
	}

	@JsonIgnore
	public void setDefaultLanguageId(
		UnsafeSupplier<String, Exception> defaultLanguageIdUnsafeSupplier) {

		defaultLanguageId = null;

		_defaultLanguageIdSupplier = () -> {
			try {
				return defaultLanguageIdUnsafeSupplier.get();
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
	protected String defaultLanguageId;

	private Supplier<String> _defaultLanguageIdSupplier = () -> null;

	@Schema
	public Boolean getEnableCategorization() {
		if (enableCategorization != null) {
			return enableCategorization;
		}

		enableCategorization = _enableCategorizationSupplier.get();

		return enableCategorization;
	}

	public void setEnableCategorization(Boolean enableCategorization) {
		this.enableCategorization = enableCategorization;

		_enableCategorizationSupplier = () -> enableCategorization;
	}

	@JsonIgnore
	public void setEnableCategorization(
		UnsafeSupplier<Boolean, Exception> enableCategorizationUnsafeSupplier) {

		enableCategorization = null;

		_enableCategorizationSupplier = () -> {
			try {
				return enableCategorizationUnsafeSupplier.get();
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
	protected Boolean enableCategorization;

	private Supplier<Boolean> _enableCategorizationSupplier = () -> null;

	@Schema
	public Boolean getEnableComments() {
		if (enableComments != null) {
			return enableComments;
		}

		enableComments = _enableCommentsSupplier.get();

		return enableComments;
	}

	public void setEnableComments(Boolean enableComments) {
		this.enableComments = enableComments;

		_enableCommentsSupplier = () -> enableComments;
	}

	@JsonIgnore
	public void setEnableComments(
		UnsafeSupplier<Boolean, Exception> enableCommentsUnsafeSupplier) {

		enableComments = null;

		_enableCommentsSupplier = () -> {
			try {
				return enableCommentsUnsafeSupplier.get();
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
	protected Boolean enableComments;

	private Supplier<Boolean> _enableCommentsSupplier = () -> null;

	@Schema
	public Boolean getEnableLocalization() {
		if (enableLocalization != null) {
			return enableLocalization;
		}

		enableLocalization = _enableLocalizationSupplier.get();

		return enableLocalization;
	}

	public void setEnableLocalization(Boolean enableLocalization) {
		this.enableLocalization = enableLocalization;

		_enableLocalizationSupplier = () -> enableLocalization;
	}

	@JsonIgnore
	public void setEnableLocalization(
		UnsafeSupplier<Boolean, Exception> enableLocalizationUnsafeSupplier) {

		enableLocalization = null;

		_enableLocalizationSupplier = () -> {
			try {
				return enableLocalizationUnsafeSupplier.get();
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
	protected Boolean enableLocalization;

	private Supplier<Boolean> _enableLocalizationSupplier = () -> null;

	@Schema
	public Boolean getEnableObjectEntryDraft() {
		if (enableObjectEntryDraft != null) {
			return enableObjectEntryDraft;
		}

		enableObjectEntryDraft = _enableObjectEntryDraftSupplier.get();

		return enableObjectEntryDraft;
	}

	public void setEnableObjectEntryDraft(Boolean enableObjectEntryDraft) {
		this.enableObjectEntryDraft = enableObjectEntryDraft;

		_enableObjectEntryDraftSupplier = () -> enableObjectEntryDraft;
	}

	@JsonIgnore
	public void setEnableObjectEntryDraft(
		UnsafeSupplier<Boolean, Exception>
			enableObjectEntryDraftUnsafeSupplier) {

		enableObjectEntryDraft = null;

		_enableObjectEntryDraftSupplier = () -> {
			try {
				return enableObjectEntryDraftUnsafeSupplier.get();
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
	protected Boolean enableObjectEntryDraft;

	private Supplier<Boolean> _enableObjectEntryDraftSupplier = () -> null;

	@Schema
	public Boolean getEnableObjectEntryHistory() {
		if (enableObjectEntryHistory != null) {
			return enableObjectEntryHistory;
		}

		enableObjectEntryHistory = _enableObjectEntryHistorySupplier.get();

		return enableObjectEntryHistory;
	}

	public void setEnableObjectEntryHistory(Boolean enableObjectEntryHistory) {
		this.enableObjectEntryHistory = enableObjectEntryHistory;

		_enableObjectEntryHistorySupplier = () -> enableObjectEntryHistory;
	}

	@JsonIgnore
	public void setEnableObjectEntryHistory(
		UnsafeSupplier<Boolean, Exception>
			enableObjectEntryHistoryUnsafeSupplier) {

		enableObjectEntryHistory = null;

		_enableObjectEntryHistorySupplier = () -> {
			try {
				return enableObjectEntryHistoryUnsafeSupplier.get();
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
	protected Boolean enableObjectEntryHistory;

	private Supplier<Boolean> _enableObjectEntryHistorySupplier = () -> null;

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
	public Boolean getModifiable() {
		if (modifiable != null) {
			return modifiable;
		}

		modifiable = _modifiableSupplier.get();

		return modifiable;
	}

	public void setModifiable(Boolean modifiable) {
		this.modifiable = modifiable;

		_modifiableSupplier = () -> modifiable;
	}

	@JsonIgnore
	public void setModifiable(
		UnsafeSupplier<Boolean, Exception> modifiableUnsafeSupplier) {

		modifiable = null;

		_modifiableSupplier = () -> {
			try {
				return modifiableUnsafeSupplier.get();
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
	protected Boolean modifiable;

	private Supplier<Boolean> _modifiableSupplier = () -> null;

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
	public ObjectAction[] getObjectActions() {
		if (objectActions != null) {
			return objectActions;
		}

		objectActions = _objectActionsSupplier.get();

		return objectActions;
	}

	public void setObjectActions(ObjectAction[] objectActions) {
		this.objectActions = objectActions;

		_objectActionsSupplier = () -> objectActions;
	}

	@JsonIgnore
	public void setObjectActions(
		UnsafeSupplier<ObjectAction[], Exception> objectActionsUnsafeSupplier) {

		objectActions = null;

		_objectActionsSupplier = () -> {
			try {
				return objectActionsUnsafeSupplier.get();
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
	protected ObjectAction[] objectActions;

	private Supplier<ObjectAction[]> _objectActionsSupplier = () -> null;

	@Schema
	@Valid
	public ObjectField[] getObjectFields() {
		if (objectFields != null) {
			return objectFields;
		}

		objectFields = _objectFieldsSupplier.get();

		return objectFields;
	}

	public void setObjectFields(ObjectField[] objectFields) {
		this.objectFields = objectFields;

		_objectFieldsSupplier = () -> objectFields;
	}

	@JsonIgnore
	public void setObjectFields(
		UnsafeSupplier<ObjectField[], Exception> objectFieldsUnsafeSupplier) {

		objectFields = null;

		_objectFieldsSupplier = () -> {
			try {
				return objectFieldsUnsafeSupplier.get();
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
	protected ObjectField[] objectFields;

	private Supplier<ObjectField[]> _objectFieldsSupplier = () -> null;

	@Schema
	public String getObjectFolderExternalReferenceCode() {
		if (objectFolderExternalReferenceCode != null) {
			return objectFolderExternalReferenceCode;
		}

		objectFolderExternalReferenceCode =
			_objectFolderExternalReferenceCodeSupplier.get();

		return objectFolderExternalReferenceCode;
	}

	public void setObjectFolderExternalReferenceCode(
		String objectFolderExternalReferenceCode) {

		this.objectFolderExternalReferenceCode =
			objectFolderExternalReferenceCode;

		_objectFolderExternalReferenceCodeSupplier =
			() -> objectFolderExternalReferenceCode;
	}

	@JsonIgnore
	public void setObjectFolderExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			objectFolderExternalReferenceCodeUnsafeSupplier) {

		objectFolderExternalReferenceCode = null;

		_objectFolderExternalReferenceCodeSupplier = () -> {
			try {
				return objectFolderExternalReferenceCodeUnsafeSupplier.get();
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
	protected String objectFolderExternalReferenceCode;

	private Supplier<String> _objectFolderExternalReferenceCodeSupplier =
		() -> null;

	@Schema
	@Valid
	public ObjectLayout[] getObjectLayouts() {
		if (objectLayouts != null) {
			return objectLayouts;
		}

		objectLayouts = _objectLayoutsSupplier.get();

		return objectLayouts;
	}

	public void setObjectLayouts(ObjectLayout[] objectLayouts) {
		this.objectLayouts = objectLayouts;

		_objectLayoutsSupplier = () -> objectLayouts;
	}

	@JsonIgnore
	public void setObjectLayouts(
		UnsafeSupplier<ObjectLayout[], Exception> objectLayoutsUnsafeSupplier) {

		objectLayouts = null;

		_objectLayoutsSupplier = () -> {
			try {
				return objectLayoutsUnsafeSupplier.get();
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
	protected ObjectLayout[] objectLayouts;

	private Supplier<ObjectLayout[]> _objectLayoutsSupplier = () -> null;

	@Schema
	@Valid
	public ObjectRelationship[] getObjectRelationships() {
		if (objectRelationships != null) {
			return objectRelationships;
		}

		objectRelationships = _objectRelationshipsSupplier.get();

		return objectRelationships;
	}

	public void setObjectRelationships(
		ObjectRelationship[] objectRelationships) {

		this.objectRelationships = objectRelationships;

		_objectRelationshipsSupplier = () -> objectRelationships;
	}

	@JsonIgnore
	public void setObjectRelationships(
		UnsafeSupplier<ObjectRelationship[], Exception>
			objectRelationshipsUnsafeSupplier) {

		objectRelationships = null;

		_objectRelationshipsSupplier = () -> {
			try {
				return objectRelationshipsUnsafeSupplier.get();
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
	protected ObjectRelationship[] objectRelationships;

	private Supplier<ObjectRelationship[]> _objectRelationshipsSupplier =
		() -> null;

	@Schema
	@Valid
	public ObjectValidationRule[] getObjectValidationRules() {
		if (objectValidationRules != null) {
			return objectValidationRules;
		}

		objectValidationRules = _objectValidationRulesSupplier.get();

		return objectValidationRules;
	}

	public void setObjectValidationRules(
		ObjectValidationRule[] objectValidationRules) {

		this.objectValidationRules = objectValidationRules;

		_objectValidationRulesSupplier = () -> objectValidationRules;
	}

	@JsonIgnore
	public void setObjectValidationRules(
		UnsafeSupplier<ObjectValidationRule[], Exception>
			objectValidationRulesUnsafeSupplier) {

		objectValidationRules = null;

		_objectValidationRulesSupplier = () -> {
			try {
				return objectValidationRulesUnsafeSupplier.get();
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
	protected ObjectValidationRule[] objectValidationRules;

	private Supplier<ObjectValidationRule[]> _objectValidationRulesSupplier =
		() -> null;

	@Schema
	@Valid
	public ObjectView[] getObjectViews() {
		if (objectViews != null) {
			return objectViews;
		}

		objectViews = _objectViewsSupplier.get();

		return objectViews;
	}

	public void setObjectViews(ObjectView[] objectViews) {
		this.objectViews = objectViews;

		_objectViewsSupplier = () -> objectViews;
	}

	@JsonIgnore
	public void setObjectViews(
		UnsafeSupplier<ObjectView[], Exception> objectViewsUnsafeSupplier) {

		objectViews = null;

		_objectViewsSupplier = () -> {
			try {
				return objectViewsUnsafeSupplier.get();
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
	protected ObjectView[] objectViews;

	private Supplier<ObjectView[]> _objectViewsSupplier = () -> null;

	@Schema
	public String getPanelAppOrder() {
		if (panelAppOrder != null) {
			return panelAppOrder;
		}

		panelAppOrder = _panelAppOrderSupplier.get();

		return panelAppOrder;
	}

	public void setPanelAppOrder(String panelAppOrder) {
		this.panelAppOrder = panelAppOrder;

		_panelAppOrderSupplier = () -> panelAppOrder;
	}

	@JsonIgnore
	public void setPanelAppOrder(
		UnsafeSupplier<String, Exception> panelAppOrderUnsafeSupplier) {

		panelAppOrder = null;

		_panelAppOrderSupplier = () -> {
			try {
				return panelAppOrderUnsafeSupplier.get();
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
	protected String panelAppOrder;

	private Supplier<String> _panelAppOrderSupplier = () -> null;

	@Schema
	public String getPanelCategoryKey() {
		if (panelCategoryKey != null) {
			return panelCategoryKey;
		}

		panelCategoryKey = _panelCategoryKeySupplier.get();

		return panelCategoryKey;
	}

	public void setPanelCategoryKey(String panelCategoryKey) {
		this.panelCategoryKey = panelCategoryKey;

		_panelCategoryKeySupplier = () -> panelCategoryKey;
	}

	@JsonIgnore
	public void setPanelCategoryKey(
		UnsafeSupplier<String, Exception> panelCategoryKeyUnsafeSupplier) {

		panelCategoryKey = null;

		_panelCategoryKeySupplier = () -> {
			try {
				return panelCategoryKeyUnsafeSupplier.get();
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
	protected String panelCategoryKey;

	private Supplier<String> _panelCategoryKeySupplier = () -> null;

	@Schema
	public Boolean getParameterRequired() {
		if (parameterRequired != null) {
			return parameterRequired;
		}

		parameterRequired = _parameterRequiredSupplier.get();

		return parameterRequired;
	}

	public void setParameterRequired(Boolean parameterRequired) {
		this.parameterRequired = parameterRequired;

		_parameterRequiredSupplier = () -> parameterRequired;
	}

	@JsonIgnore
	public void setParameterRequired(
		UnsafeSupplier<Boolean, Exception> parameterRequiredUnsafeSupplier) {

		parameterRequired = null;

		_parameterRequiredSupplier = () -> {
			try {
				return parameterRequiredUnsafeSupplier.get();
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
	protected Boolean parameterRequired;

	private Supplier<Boolean> _parameterRequiredSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, String> getPluralLabel() {
		if (pluralLabel != null) {
			return pluralLabel;
		}

		pluralLabel = _pluralLabelSupplier.get();

		return pluralLabel;
	}

	public void setPluralLabel(Map<String, String> pluralLabel) {
		this.pluralLabel = pluralLabel;

		_pluralLabelSupplier = () -> pluralLabel;
	}

	@JsonIgnore
	public void setPluralLabel(
		UnsafeSupplier<Map<String, String>, Exception>
			pluralLabelUnsafeSupplier) {

		pluralLabel = null;

		_pluralLabelSupplier = () -> {
			try {
				return pluralLabelUnsafeSupplier.get();
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
	protected Map<String, String> pluralLabel;

	private Supplier<Map<String, String>> _pluralLabelSupplier = () -> null;

	@Schema
	public Boolean getPortlet() {
		if (portlet != null) {
			return portlet;
		}

		portlet = _portletSupplier.get();

		return portlet;
	}

	public void setPortlet(Boolean portlet) {
		this.portlet = portlet;

		_portletSupplier = () -> portlet;
	}

	@JsonIgnore
	public void setPortlet(
		UnsafeSupplier<Boolean, Exception> portletUnsafeSupplier) {

		portlet = null;

		_portletSupplier = () -> {
			try {
				return portletUnsafeSupplier.get();
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
	protected Boolean portlet;

	private Supplier<Boolean> _portletSupplier = () -> null;

	@Schema
	public String getRestContextPath() {
		if (restContextPath != null) {
			return restContextPath;
		}

		restContextPath = _restContextPathSupplier.get();

		return restContextPath;
	}

	public void setRestContextPath(String restContextPath) {
		this.restContextPath = restContextPath;

		_restContextPathSupplier = () -> restContextPath;
	}

	@JsonIgnore
	public void setRestContextPath(
		UnsafeSupplier<String, Exception> restContextPathUnsafeSupplier) {

		restContextPath = null;

		_restContextPathSupplier = () -> {
			try {
				return restContextPathUnsafeSupplier.get();
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
	protected String restContextPath;

	private Supplier<String> _restContextPathSupplier = () -> null;

	@Schema
	public String getRootObjectDefinitionExternalReferenceCode() {
		if (rootObjectDefinitionExternalReferenceCode != null) {
			return rootObjectDefinitionExternalReferenceCode;
		}

		rootObjectDefinitionExternalReferenceCode =
			_rootObjectDefinitionExternalReferenceCodeSupplier.get();

		return rootObjectDefinitionExternalReferenceCode;
	}

	public void setRootObjectDefinitionExternalReferenceCode(
		String rootObjectDefinitionExternalReferenceCode) {

		this.rootObjectDefinitionExternalReferenceCode =
			rootObjectDefinitionExternalReferenceCode;

		_rootObjectDefinitionExternalReferenceCodeSupplier =
			() -> rootObjectDefinitionExternalReferenceCode;
	}

	@JsonIgnore
	public void setRootObjectDefinitionExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			rootObjectDefinitionExternalReferenceCodeUnsafeSupplier) {

		rootObjectDefinitionExternalReferenceCode = null;

		_rootObjectDefinitionExternalReferenceCodeSupplier = () -> {
			try {
				return rootObjectDefinitionExternalReferenceCodeUnsafeSupplier.
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
	protected String rootObjectDefinitionExternalReferenceCode;

	private Supplier<String>
		_rootObjectDefinitionExternalReferenceCodeSupplier = () -> null;

	@Schema
	public String getScope() {
		if (scope != null) {
			return scope;
		}

		scope = _scopeSupplier.get();

		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;

		_scopeSupplier = () -> scope;
	}

	@JsonIgnore
	public void setScope(
		UnsafeSupplier<String, Exception> scopeUnsafeSupplier) {

		scope = null;

		_scopeSupplier = () -> {
			try {
				return scopeUnsafeSupplier.get();
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
	protected String scope;

	private Supplier<String> _scopeSupplier = () -> null;

	@Schema
	@Valid
	public Status getStatus() {
		if (status != null) {
			return status;
		}

		status = _statusSupplier.get();

		return status;
	}

	public void setStatus(Status status) {
		this.status = status;

		_statusSupplier = () -> status;
	}

	@JsonIgnore
	public void setStatus(
		UnsafeSupplier<Status, Exception> statusUnsafeSupplier) {

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
	protected Status status;

	private Supplier<Status> _statusSupplier = () -> null;

	@Schema
	public String getStorageType() {
		if (storageType != null) {
			return storageType;
		}

		storageType = _storageTypeSupplier.get();

		return storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;

		_storageTypeSupplier = () -> storageType;
	}

	@JsonIgnore
	public void setStorageType(
		UnsafeSupplier<String, Exception> storageTypeUnsafeSupplier) {

		storageType = null;

		_storageTypeSupplier = () -> {
			try {
				return storageTypeUnsafeSupplier.get();
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
	protected String storageType;

	private Supplier<String> _storageTypeSupplier = () -> null;

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
	public String getTitleObjectFieldName() {
		if (titleObjectFieldName != null) {
			return titleObjectFieldName;
		}

		titleObjectFieldName = _titleObjectFieldNameSupplier.get();

		return titleObjectFieldName;
	}

	public void setTitleObjectFieldName(String titleObjectFieldName) {
		this.titleObjectFieldName = titleObjectFieldName;

		_titleObjectFieldNameSupplier = () -> titleObjectFieldName;
	}

	@JsonIgnore
	public void setTitleObjectFieldName(
		UnsafeSupplier<String, Exception> titleObjectFieldNameUnsafeSupplier) {

		titleObjectFieldName = null;

		_titleObjectFieldNameSupplier = () -> {
			try {
				return titleObjectFieldNameUnsafeSupplier.get();
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
	protected String titleObjectFieldName;

	private Supplier<String> _titleObjectFieldNameSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ObjectDefinition)) {
			return false;
		}

		ObjectDefinition objectDefinition = (ObjectDefinition)object;

		return Objects.equals(toString(), objectDefinition.toString());
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

		if (accountEntryRestricted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountEntryRestricted\": ");

			sb.append(accountEntryRestricted);
		}

		if (accountEntryRestrictedObjectFieldName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"accountEntryRestrictedObjectFieldName\": ");

			sb.append("\"");

			sb.append(_escape(accountEntryRestrictedObjectFieldName));

			sb.append("\"");
		}

		if (actions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actions\": ");

			sb.append(_toJSON(actions));
		}

		if (active != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"active\": ");

			sb.append(active);
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

		if (defaultLanguageId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"defaultLanguageId\": ");

			sb.append("\"");

			sb.append(_escape(defaultLanguageId));

			sb.append("\"");
		}

		if (enableCategorization != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"enableCategorization\": ");

			sb.append(enableCategorization);
		}

		if (enableComments != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"enableComments\": ");

			sb.append(enableComments);
		}

		if (enableLocalization != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"enableLocalization\": ");

			sb.append(enableLocalization);
		}

		if (enableObjectEntryDraft != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"enableObjectEntryDraft\": ");

			sb.append(enableObjectEntryDraft);
		}

		if (enableObjectEntryHistory != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"enableObjectEntryHistory\": ");

			sb.append(enableObjectEntryHistory);
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

		if (modifiable != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modifiable\": ");

			sb.append(modifiable);
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

		if (objectActions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectActions\": ");

			sb.append("[");

			for (int i = 0; i < objectActions.length; i++) {
				sb.append(String.valueOf(objectActions[i]));

				if ((i + 1) < objectActions.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (objectFields != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectFields\": ");

			sb.append("[");

			for (int i = 0; i < objectFields.length; i++) {
				sb.append(String.valueOf(objectFields[i]));

				if ((i + 1) < objectFields.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (objectFolderExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectFolderExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(objectFolderExternalReferenceCode));

			sb.append("\"");
		}

		if (objectLayouts != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectLayouts\": ");

			sb.append("[");

			for (int i = 0; i < objectLayouts.length; i++) {
				sb.append(String.valueOf(objectLayouts[i]));

				if ((i + 1) < objectLayouts.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (objectRelationships != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectRelationships\": ");

			sb.append("[");

			for (int i = 0; i < objectRelationships.length; i++) {
				sb.append(String.valueOf(objectRelationships[i]));

				if ((i + 1) < objectRelationships.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (objectValidationRules != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectValidationRules\": ");

			sb.append("[");

			for (int i = 0; i < objectValidationRules.length; i++) {
				sb.append(String.valueOf(objectValidationRules[i]));

				if ((i + 1) < objectValidationRules.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (objectViews != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"objectViews\": ");

			sb.append("[");

			for (int i = 0; i < objectViews.length; i++) {
				sb.append(String.valueOf(objectViews[i]));

				if ((i + 1) < objectViews.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (panelAppOrder != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"panelAppOrder\": ");

			sb.append("\"");

			sb.append(_escape(panelAppOrder));

			sb.append("\"");
		}

		if (panelCategoryKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"panelCategoryKey\": ");

			sb.append("\"");

			sb.append(_escape(panelCategoryKey));

			sb.append("\"");
		}

		if (parameterRequired != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parameterRequired\": ");

			sb.append(parameterRequired);
		}

		if (pluralLabel != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"pluralLabel\": ");

			sb.append(_toJSON(pluralLabel));
		}

		if (portlet != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"portlet\": ");

			sb.append(portlet);
		}

		if (restContextPath != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"restContextPath\": ");

			sb.append("\"");

			sb.append(_escape(restContextPath));

			sb.append("\"");
		}

		if (rootObjectDefinitionExternalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"rootObjectDefinitionExternalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(rootObjectDefinitionExternalReferenceCode));

			sb.append("\"");
		}

		if (scope != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"scope\": ");

			sb.append("\"");

			sb.append(_escape(scope));

			sb.append("\"");
		}

		if (status != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append(String.valueOf(status));
		}

		if (storageType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"storageType\": ");

			sb.append("\"");

			sb.append(_escape(storageType));

			sb.append("\"");
		}

		if (system != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"system\": ");

			sb.append(system);
		}

		if (titleObjectFieldName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"titleObjectFieldName\": ");

			sb.append("\"");

			sb.append(_escape(titleObjectFieldName));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.object.admin.rest.dto.v1_0.ObjectDefinition",
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