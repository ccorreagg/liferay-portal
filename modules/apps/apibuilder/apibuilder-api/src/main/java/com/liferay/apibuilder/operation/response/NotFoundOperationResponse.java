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

import com.liferay.apibuilder.operation.schema.Schema;

/**
 * @author Carlos Correa
 */
public class NotFoundOperationResponse implements OperationResponse {

	public NotFoundOperationResponse(String message, Schema schema) {
		_message = message;
		_schema = schema;
	}

	public String getMessage() {
		return _message;
	}

	@Override
	public ResponseCode getResponseCode() {
		return ResponseCode.NOT_FOUND;
	}

	@Override
	public Schema getSchema() {
		return _schema;
	}

	private final String _message;
	private final Schema _schema;

}