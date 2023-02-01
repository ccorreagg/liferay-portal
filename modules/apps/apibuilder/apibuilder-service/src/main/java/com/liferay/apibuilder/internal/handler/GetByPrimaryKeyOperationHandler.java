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

package com.liferay.apibuilder.internal.handler;

import com.liferay.apibuilder.constants.APIBuilderConstants;
import com.liferay.apibuilder.handler.OperationHandler;
import com.liferay.apibuilder.internal.util.APIBuilderUtil;
import com.liferay.apibuilder.operation.MediaType;
import com.liferay.apibuilder.operation.Operation;
import com.liferay.apibuilder.operation.OperationContext;
import com.liferay.apibuilder.operation.response.NotFoundOperationResponse;
import com.liferay.apibuilder.operation.response.OperationResponse;
import com.liferay.apibuilder.operation.response.ResponseCode;
import com.liferay.apibuilder.operation.response.SuccessfulOperationResponse;
import com.liferay.apibuilder.operation.schema.AttributeValue;
import com.liferay.apibuilder.operation.schema.ObjectSchema;
import com.liferay.apibuilder.operation.schema.Schema;
import com.liferay.info.exception.NoSuchInfoItemException;
import com.liferay.info.item.InfoItemFieldValues;
import com.liferay.info.item.provider.InfoItemFieldValuesProvider;
import com.liferay.info.item.provider.InfoItemObjectProvider;
import com.liferay.portal.kernel.util.GetterUtil;

import org.osgi.service.component.annotations.Component;

/**
 * @author Carlos Correa
 */
@Component(
	property = APIBuilderConstants.OPERATION_NAME + "=getByPrimaryKey",
	service = OperationHandler.class
)
public class GetByPrimaryKeyOperationHandler implements OperationHandler {

	@Override
	public OperationResponse handle(
			Operation operation, OperationContext operationContext)
		throws Exception {

		MediaType mediaType = operationContext.getMediaType();

		Schema schema = operation.getResponseSchema(
			mediaType, ResponseCode.SUCCESSFUL);

		if (!(schema instanceof ObjectSchema)) {
			throw new UnsupportedOperationException(
				"The getByPrimaryKey operation needs an ObjectSchema return " +
					"type");
		}

		AttributeValue attributeValue =
			operationContext.getPrimaryKeyAttributeValue();

		if (attributeValue == null) {
			throw new UnsupportedOperationException(
				"The operation context does not contain the primary key");
		}

		ObjectSchema objectSchema = (ObjectSchema)schema;

		InfoItemObjectProvider<?> infoItemObjectProvider =
			APIBuilderUtil.getInfoItemService(
				objectSchema.getClassName(), InfoItemObjectProvider.class);

		long primaryKey = GetterUtil.getLong(attributeValue.getValue());

		try {
			Object object = infoItemObjectProvider.getInfoItem(primaryKey);

			InfoItemFieldValuesProvider infoItemFieldValuesProvider =
				APIBuilderUtil.getInfoItemService(
					objectSchema.getClassName(),
					InfoItemFieldValuesProvider.class);

			InfoItemFieldValues infoItemFieldValues =
				infoItemFieldValuesProvider.getInfoItemFieldValues(object);

			return new SuccessfulOperationResponse(
				APIBuilderUtil.toAPIBuilderDTO(
					infoItemFieldValues.getInfoFieldValues(), primaryKey,
					objectSchema.getName()),
				schema);
		}
		catch (NoSuchInfoItemException noSuchInfoItemException) {
			String message = noSuchInfoItemException.getMessage();

			Throwable throwable = noSuchInfoItemException.getCause();

			if (throwable != null) {
				message = throwable.getMessage();
			}

			return new NotFoundOperationResponse(
				message,
				operation.getResponseSchema(mediaType, ResponseCode.NOT_FOUND));
		}
	}

}