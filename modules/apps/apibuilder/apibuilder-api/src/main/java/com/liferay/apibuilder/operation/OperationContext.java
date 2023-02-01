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

import com.liferay.apibuilder.operation.schema.AttributeSchema;
import com.liferay.apibuilder.operation.schema.AttributeValue;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Carlos Correa
 */
public interface OperationContext {

	public Map<String, AttributeValue> getAttributeValues();

	public MediaType getMediaType();

	public AttributeValue getPrimaryKeyAttributeValue();

	public static class Builder {

		public OperationContext build() {
			return new OperationContextImpl(this);
		}

		public Builder withAttributeValue(AttributeValue attributeValue) {
			AttributeSchema attributeSchema =
				attributeValue.getAttributeSchema();

			_attributeValues.put(attributeSchema.getName(), attributeValue);

			return this;
		}

		public Builder withMediaType(MediaType mediaType) {
			_mediaType = mediaType;

			return this;
		}

		public Builder withPrimaryKeyAttributeValue(
			AttributeValue attributeValue) {

			_primaryKeyAttributeValue = attributeValue;

			return this;
		}

		private Map<String, AttributeValue> _attributeValues = new HashMap<>();
		private MediaType _mediaType;
		private AttributeValue _primaryKeyAttributeValue;

	}

	public class OperationContextImpl implements OperationContext {

		public OperationContextImpl(Builder builder) {
			_builder = builder;
		}

		@Override
		public Map<String, AttributeValue> getAttributeValues() {
			return _builder._attributeValues;
		}

		@Override
		public MediaType getMediaType() {
			return _builder._mediaType;
		}

		@Override
		public AttributeValue getPrimaryKeyAttributeValue() {
			return _builder._primaryKeyAttributeValue;
		}

		private final Builder _builder;

	}

}