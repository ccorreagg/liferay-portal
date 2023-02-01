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

package com.liferay.apibuilder.operation.response;

import com.liferay.apibuilder.model.APIBuilderDTO;
import com.liferay.apibuilder.operation.schema.Schema;

/**
 * @author Carlos Correa
 */
public class SuccessfulOperationResponse implements OperationResponse {

	public SuccessfulOperationResponse(
		APIBuilderDTO apiBuilderDTO, Schema schema) {

		_apiBuilderDTO = apiBuilderDTO;
		_schema = schema;
	}

	public APIBuilderDTO getApiBuilderDTO() {
		return _apiBuilderDTO;
	}

	@Override
	public ResponseCode getResponseCode() {
		return ResponseCode.SUCCESSFUL;
	}

	@Override
	public Schema getSchema() {
		return _schema;
	}

	private final APIBuilderDTO _apiBuilderDTO;
	private final Schema _schema;

}