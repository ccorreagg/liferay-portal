/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.apibuilder.operation;

import com.liferay.apibuilder.operation.response.ResponseCode;
import com.liferay.apibuilder.operation.schema.Schema;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.ListUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Carlos Correa
 */
public interface Operation {

	public long getCompanyId();

	public String getKey();

	public Method getMethod();

	public String getOperationType();

	public Map<String, Schema> getParameterSchemas();

	public PathConfiguration getPathConfiguration();

	public Schema getResponseSchema(
		MediaType mediaType, ResponseCode responseCode);

	public boolean isCompanyIdScoped();

	public static class Builder {

		public Operation build() {
			return new OperationImpl(this);
		}

		public Builder withCompanyId(long companyId) {
			_companyId = companyId;
			_companyIdScoped = true;

			return this;
		}

		public Builder withMethod(Method method) {
			_method = method;

			return this;
		}

		public Builder withOperationType(String operationType) {
			_operationType = operationType;

			return this;
		}

		public Builder withParameterSchema(Schema schema) {
			_parameterSchemas.put(schema.getName(), schema);

			return this;
		}

		public Builder withPathConfiguration(
			PathConfiguration pathConfiguration) {

			_pathConfiguration = pathConfiguration;

			return this;
		}

		public Builder withResponseSchema(
			MediaType mediaType, ResponseCode responseCode, Schema schema) {

			_responseSchemas.compute(
				mediaType,
				(key, value) -> {
					if (value == null) {
						value = new HashMap<>();
					}

					value.put(responseCode, schema);

					return value;
				});

			return this;
		}

		private long _companyId;
		private boolean _companyIdScoped;
		private Method _method;
		private String _operationType;
		private Map<String, Schema> _parameterSchemas = new HashMap<>();
		private PathConfiguration _pathConfiguration;
		private Map<MediaType, Map<ResponseCode, Schema>> _responseSchemas =
			new HashMap<>();

	}

	public class OperationImpl implements Operation {

		public OperationImpl(Builder builder) {
			_builder = builder;
		}

		@Override
		public long getCompanyId() {
			return _builder._companyId;
		}

		@Override
		public String getKey() {
			return getMethod().name() + StringPool.POUND +
				getPathConfiguration().getPath();
		}

		@Override
		public Method getMethod() {
			return _builder._method;
		}

		@Override
		public String getOperationType() {
			return _builder._operationType;
		}

		@Override
		public Map<String, Schema> getParameterSchemas() {
			return _builder._parameterSchemas;
		}

		@Override
		public PathConfiguration getPathConfiguration() {
			return _builder._pathConfiguration;
		}

		@Override
		public Schema getResponseSchema(
			MediaType mediaType, ResponseCode responseCode) {

			Map<ResponseCode, Schema> schemas;

			if (Objects.equals(MediaType.ALL, mediaType)) {
				if (_builder._responseSchemas.containsKey(mediaType)) {
					schemas = _builder._responseSchemas.get(mediaType);
				}
				else {
					List<MediaType> mediaTypes = ListUtil.sort(
						new ArrayList<>(_builder._responseSchemas.keySet()),
						new MediaType.MediaTypeComparator());

					schemas = _builder._responseSchemas.get(mediaTypes.get(0));
				}
			}
			else {
				schemas = _builder._responseSchemas.get(mediaType);
			}

			return schemas.get(responseCode);
		}

		@Override
		public boolean isCompanyIdScoped() {
			return _builder._companyIdScoped;
		}

		private final Builder _builder;

	}

}