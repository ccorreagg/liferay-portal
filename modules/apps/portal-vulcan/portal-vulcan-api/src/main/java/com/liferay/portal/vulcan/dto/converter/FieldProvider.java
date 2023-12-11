/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.dto.converter;

/**
 * @author Carlos Correa
 */
public interface FieldProvider<T, U> {

	public void setFieldValue(
			U dto, DTOConverterContext dtoConverterContext, String fieldName,
			T item)
		throws Exception;

}