/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.internal.jaxrs.exception.mapper;

import com.liferay.portal.kernel.exception.NoSuchModelException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ExternalReferenceCodeModel;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.servlet.HttpMethods;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.BaseExceptionMapper;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.Problem;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Providers;

import java.util.Arrays;
import java.util.List;

/**
 * Converts any {@code PrincipalException} to a {@code 404} error in case it is
 * a GET request or the failed check was {@code VIEW}, so that an entity the
 * caller may not view is indistinguishable from a missing one. When the
 * exception names an entity the request addresses by external reference code,
 * that error is the same a {@code NoSuchModelException} with that code
 * produces. Converts any other {@code PrincipalException} to a {@code 403}
 * error.
 *
 * @author Brian Wing Shun Chan
 * @review
 */
public class PrincipalExceptionMapper
	extends BaseExceptionMapper<PrincipalException> {

	@Override
	public Response toResponse(PrincipalException principalException) {
		String method = _httpServletRequest.getMethod();

		if (!(principalException instanceof
				PrincipalException.MustHavePermission)) {

			if (method.equals(HttpMethods.GET)) {
				return _toNotFoundResponse(principalException);
			}

			return super.toResponse(principalException);
		}

		PrincipalException.MustHavePermission mustHavePermission =
			(PrincipalException.MustHavePermission)principalException;

		if (!method.equals(HttpMethods.GET) &&
			!Arrays.equals(
				mustHavePermission.actionId, new String[] {ActionKeys.VIEW})) {

			return super.toResponse(principalException);
		}

		String externalReferenceCode = _getExternalReferenceCode(
			mustHavePermission);

		if (externalReferenceCode == null) {
			return _toNotFoundResponse(principalException);
		}

		NoSuchModelException noSuchModelException = new NoSuchModelException(
			principalException);

		noSuchModelException.setExternalReferenceCode(externalReferenceCode);

		ExceptionMapper<NoSuchModelException> exceptionMapper =
			_providers.getExceptionMapper(NoSuchModelException.class);

		return exceptionMapper.toResponse(noSuchModelException);
	}

	@Override
	protected Problem getProblem(PrincipalException principalException) {
		if (_log.isWarnEnabled()) {
			_log.warn(principalException);
		}

		return new Problem(
			Response.Status.FORBIDDEN,
			LanguageUtil.get(_httpServletRequest.getLocale(), "forbidden"));
	}

	private String _getExternalReferenceCode(
		PrincipalException.MustHavePermission mustHavePermission) {

		if ((mustHavePermission.resourceId == 0) ||
			Validator.isNull(mustHavePermission.resourceName)) {

			return null;
		}

		PersistedModelLocalService persistedModelLocalService =
			PersistedModelLocalServiceRegistryUtil.
				getPersistedModelLocalService(mustHavePermission.resourceName);

		if (persistedModelLocalService == null) {
			return null;
		}

		PersistedModel persistedModel =
			persistedModelLocalService.fetchPersistedModel(
				mustHavePermission.resourceId);

		if (!(persistedModel instanceof ExternalReferenceCodeModel)) {
			return null;
		}

		ExternalReferenceCodeModel externalReferenceCodeModel =
			(ExternalReferenceCodeModel)persistedModel;

		String externalReferenceCode =
			externalReferenceCodeModel.getExternalReferenceCode();

		if (Validator.isNull(externalReferenceCode)) {
			return null;
		}

		MultivaluedMap<String, String> pathParameters =
			_uriInfo.getPathParameters();

		for (List<String> values : pathParameters.values()) {
			if (values.contains(externalReferenceCode)) {
				return externalReferenceCode;
			}
		}

		return null;
	}

	private Response _toNotFoundResponse(
		PrincipalException principalException) {

		ExceptionMapper<NotFoundException> exceptionMapper =
			_providers.getExceptionMapper(NotFoundException.class);

		return exceptionMapper.toResponse(
			new NotFoundException(principalException));
	}

	private static final Log _log = LogFactoryUtil.getLog(
		PrincipalExceptionMapper.class);

	@Context
	private HttpServletRequest _httpServletRequest;

	@Context
	private Providers _providers;

	@Context
	private UriInfo _uriInfo;

}