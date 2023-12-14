/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.batch.engine.dto.v1_0;

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
import javax.validation.constraints.DecimalMin;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ivica Cardic
 * @generated
 */
@Generated("")
@GraphQLName("ImportTask")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ImportTask")
public class ImportTask implements Serializable {

	public static ImportTask toDTO(String json) {
		return ObjectMapperUtil.readValue(ImportTask.class, json);
	}

	public static ImportTask unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(ImportTask.class, json);
	}

	@Schema(
		description = "The item class name for which data will be processed in batch.",
		example = "com.liferay.headless.delivery.dto.v1_0.BlogPosting"
	)
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

	@GraphQLField(
		description = "The item class name for which data will be processed in batch."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String className;

	private Supplier<String> _classNameSupplier = () -> null;

	@Schema(description = "The file content type.", example = "JSON")
	public String getContentType() {
		if (contentType != null) {
			return contentType;
		}

		contentType = _contentTypeSupplier.get();

		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;

		_contentTypeSupplier = () -> contentType;
	}

	@JsonIgnore
	public void setContentType(
		UnsafeSupplier<String, Exception> contentTypeUnsafeSupplier) {

		contentType = null;

		_contentTypeSupplier = () -> {
			try {
				return contentTypeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The file content type.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String contentType;

	private Supplier<String> _contentTypeSupplier = () -> null;

	@Schema(
		description = "The end time of import task operation.",
		example = "2019-27-09'T'08:33:33'Z'"
	)
	public Date getEndTime() {
		if (endTime != null) {
			return endTime;
		}

		endTime = _endTimeSupplier.get();

		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;

		_endTimeSupplier = () -> endTime;
	}

	@JsonIgnore
	public void setEndTime(
		UnsafeSupplier<Date, Exception> endTimeUnsafeSupplier) {

		endTime = null;

		_endTimeSupplier = () -> {
			try {
				return endTimeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The end time of import task operation.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date endTime;

	private Supplier<Date> _endTimeSupplier = () -> null;

	@Schema(
		description = "The error message in case of import task's failed execution.",
		example = "File import failed"
	)
	public String getErrorMessage() {
		if (errorMessage != null) {
			return errorMessage;
		}

		errorMessage = _errorMessageSupplier.get();

		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;

		_errorMessageSupplier = () -> errorMessage;
	}

	@JsonIgnore
	public void setErrorMessage(
		UnsafeSupplier<String, Exception> errorMessageUnsafeSupplier) {

		errorMessage = null;

		_errorMessageSupplier = () -> {
			try {
				return errorMessageUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(
		description = "The error message in case of import task's failed execution."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String errorMessage;

	private Supplier<String> _errorMessageSupplier = () -> null;

	@Schema(
		description = "The status of import task's execution.",
		example = "INITIALIZED"
	)
	@Valid
	public ExecuteStatus getExecuteStatus() {
		if (executeStatus != null) {
			return executeStatus;
		}

		executeStatus = _executeStatusSupplier.get();

		return executeStatus;
	}

	@JsonIgnore
	public String getExecuteStatusAsString() {
		if (executeStatus == null) {
			return null;
		}

		return executeStatus.toString();
	}

	public void setExecuteStatus(ExecuteStatus executeStatus) {
		this.executeStatus = executeStatus;

		_executeStatusSupplier = () -> executeStatus;
	}

	@JsonIgnore
	public void setExecuteStatus(
		UnsafeSupplier<ExecuteStatus, Exception> executeStatusUnsafeSupplier) {

		executeStatus = null;

		_executeStatusSupplier = () -> {
			try {
				return executeStatusUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The status of import task's execution.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected ExecuteStatus executeStatus;

	private Supplier<ExecuteStatus> _executeStatusSupplier = () -> null;

	@Schema(description = "The optional external key of this account.")
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

	@GraphQLField(description = "The optional external key of this account.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String externalReferenceCode;

	private Supplier<String> _externalReferenceCodeSupplier = () -> null;

	@Schema
	@Valid
	public FailedItem[] getFailedItems() {
		if (failedItems != null) {
			return failedItems;
		}

		failedItems = _failedItemsSupplier.get();

		return failedItems;
	}

	public void setFailedItems(FailedItem[] failedItems) {
		this.failedItems = failedItems;

		_failedItemsSupplier = () -> failedItems;
	}

	@JsonIgnore
	public void setFailedItems(
		UnsafeSupplier<FailedItem[], Exception> failedItemsUnsafeSupplier) {

		failedItems = null;

		_failedItemsSupplier = () -> {
			try {
				return failedItemsUnsafeSupplier.get();
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
	protected FailedItem[] failedItems;

	private Supplier<FailedItem[]> _failedItemsSupplier = () -> null;

	@DecimalMin("0")
	@Schema(description = "The task's ID.", example = "30130")
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

	@GraphQLField(description = "The task's ID.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema(
		description = "Defines if import task will fail when error occurs or continue importing rest of the items."
	)
	@Valid
	public ImportStrategy getImportStrategy() {
		if (importStrategy != null) {
			return importStrategy;
		}

		importStrategy = _importStrategySupplier.get();

		return importStrategy;
	}

	@JsonIgnore
	public String getImportStrategyAsString() {
		if (importStrategy == null) {
			return null;
		}

		return importStrategy.toString();
	}

	public void setImportStrategy(ImportStrategy importStrategy) {
		this.importStrategy = importStrategy;

		_importStrategySupplier = () -> importStrategy;
	}

	@JsonIgnore
	public void setImportStrategy(
		UnsafeSupplier<ImportStrategy, Exception>
			importStrategyUnsafeSupplier) {

		importStrategy = null;

		_importStrategySupplier = () -> {
			try {
				return importStrategyUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(
		description = "Defines if import task will fail when error occurs or continue importing rest of the items."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected ImportStrategy importStrategy;

	private Supplier<ImportStrategy> _importStrategySupplier = () -> null;

	@Schema(description = "The operation of import task.", example = "CREATE")
	@Valid
	public Operation getOperation() {
		if (operation != null) {
			return operation;
		}

		operation = _operationSupplier.get();

		return operation;
	}

	@JsonIgnore
	public String getOperationAsString() {
		if (operation == null) {
			return null;
		}

		return operation.toString();
	}

	public void setOperation(Operation operation) {
		this.operation = operation;

		_operationSupplier = () -> operation;
	}

	@JsonIgnore
	public void setOperation(
		UnsafeSupplier<Operation, Exception> operationUnsafeSupplier) {

		operation = null;

		_operationSupplier = () -> {
			try {
				return operationUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The operation of import task.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Operation operation;

	private Supplier<Operation> _operationSupplier = () -> null;

	@DecimalMin("0")
	@Schema(
		description = "Number of items processed by import task opeartion.",
		example = "100"
	)
	public Integer getProcessedItemsCount() {
		if (processedItemsCount != null) {
			return processedItemsCount;
		}

		processedItemsCount = _processedItemsCountSupplier.get();

		return processedItemsCount;
	}

	public void setProcessedItemsCount(Integer processedItemsCount) {
		this.processedItemsCount = processedItemsCount;

		_processedItemsCountSupplier = () -> processedItemsCount;
	}

	@JsonIgnore
	public void setProcessedItemsCount(
		UnsafeSupplier<Integer, Exception> processedItemsCountUnsafeSupplier) {

		processedItemsCount = null;

		_processedItemsCountSupplier = () -> {
			try {
				return processedItemsCountUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(
		description = "Number of items processed by import task opeartion."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer processedItemsCount;

	private Supplier<Integer> _processedItemsCountSupplier = () -> null;

	@Schema(
		description = "The start time of import task operation.",
		example = "2019-27-09'T'08:23:33'Z'"
	)
	public Date getStartTime() {
		if (startTime != null) {
			return startTime;
		}

		startTime = _startTimeSupplier.get();

		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;

		_startTimeSupplier = () -> startTime;
	}

	@JsonIgnore
	public void setStartTime(
		UnsafeSupplier<Date, Exception> startTimeUnsafeSupplier) {

		startTime = null;

		_startTimeSupplier = () -> {
			try {
				return startTimeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The start time of import task operation.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date startTime;

	private Supplier<Date> _startTimeSupplier = () -> null;

	@DecimalMin("0")
	@Schema(
		description = "Total number of items that will be processed by import task operation.",
		example = "1000"
	)
	public Integer getTotalItemsCount() {
		if (totalItemsCount != null) {
			return totalItemsCount;
		}

		totalItemsCount = _totalItemsCountSupplier.get();

		return totalItemsCount;
	}

	public void setTotalItemsCount(Integer totalItemsCount) {
		this.totalItemsCount = totalItemsCount;

		_totalItemsCountSupplier = () -> totalItemsCount;
	}

	@JsonIgnore
	public void setTotalItemsCount(
		UnsafeSupplier<Integer, Exception> totalItemsCountUnsafeSupplier) {

		totalItemsCount = null;

		_totalItemsCountSupplier = () -> {
			try {
				return totalItemsCountUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(
		description = "Total number of items that will be processed by import task operation."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer totalItemsCount;

	private Supplier<Integer> _totalItemsCountSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ImportTask)) {
			return false;
		}

		ImportTask importTask = (ImportTask)object;

		return Objects.equals(toString(), importTask.toString());
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

		if (className != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"className\": ");

			sb.append("\"");

			sb.append(_escape(className));

			sb.append("\"");
		}

		if (contentType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"contentType\": ");

			sb.append("\"");

			sb.append(_escape(contentType));

			sb.append("\"");
		}

		if (endTime != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"endTime\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(endTime));

			sb.append("\"");
		}

		if (errorMessage != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"errorMessage\": ");

			sb.append("\"");

			sb.append(_escape(errorMessage));

			sb.append("\"");
		}

		if (executeStatus != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"executeStatus\": ");

			sb.append("\"");

			sb.append(executeStatus);

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

		if (failedItems != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"failedItems\": ");

			sb.append("[");

			for (int i = 0; i < failedItems.length; i++) {
				sb.append(String.valueOf(failedItems[i]));

				if ((i + 1) < failedItems.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (importStrategy != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"importStrategy\": ");

			sb.append("\"");

			sb.append(importStrategy);

			sb.append("\"");
		}

		if (operation != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"operation\": ");

			sb.append("\"");

			sb.append(operation);

			sb.append("\"");
		}

		if (processedItemsCount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"processedItemsCount\": ");

			sb.append(processedItemsCount);
		}

		if (startTime != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"startTime\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(startTime));

			sb.append("\"");
		}

		if (totalItemsCount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalItemsCount\": ");

			sb.append(totalItemsCount);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.batch.engine.dto.v1_0.ImportTask",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("ExecuteStatus")
	public static enum ExecuteStatus {

		COMPLETED("COMPLETED"), FAILED("FAILED"), INITIAL("INITIAL"),
		STARTED("STARTED");

		@JsonCreator
		public static ExecuteStatus create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (ExecuteStatus executeStatus : values()) {
				if (Objects.equals(executeStatus.getValue(), value)) {
					return executeStatus;
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

		private ExecuteStatus(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("ImportStrategy")
	public static enum ImportStrategy {

		ON_ERROR_CONTINUE("ON_ERROR_CONTINUE"), ON_ERROR_FAIL("ON_ERROR_FAIL");

		@JsonCreator
		public static ImportStrategy create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (ImportStrategy importStrategy : values()) {
				if (Objects.equals(importStrategy.getValue(), value)) {
					return importStrategy;
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

		private ImportStrategy(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("Operation")
	public static enum Operation {

		CREATE("CREATE"), DELETE("DELETE"), UPDATE("UPDATE");

		@JsonCreator
		public static Operation create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (Operation operation : values()) {
				if (Objects.equals(operation.getValue(), value)) {
					return operation;
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

		private Operation(String value) {
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