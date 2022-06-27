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

package com.liferay.portal.vulcan.internal.jaxrs.message.body;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.internal.extension.ExtensionContext;
import com.liferay.portal.vulcan.internal.extension.ExtensionProviders;
import com.liferay.portal.vulcan.internal.jaxrs.validation.ValidationUtil;

import java.io.IOException;
import java.io.InputStream;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Providers;

/**
 * @author Javier Gamarra
 * @author Ivica Cardic
 */
public abstract class BaseMessageBodyReader
	implements MessageBodyReader<Object> {

	public BaseMessageBodyReader(
		Class<? extends ObjectMapper> contextType, MediaType mediaType) {

		_contextType = contextType;
		_mediaType = mediaType;
	}

	@Override
	public boolean isReadable(
		Class clazz, Type type, Annotation[] annotations, MediaType mediaType) {

		return true;
	}

	@Override
	public Object readFrom(
			Class clazz, Type type, Annotation[] annotations,
			MediaType mediaType, MultivaluedMap multivaluedMap,
			InputStream inputStream)
		throws IOException {

		ObjectMapper objectMapper = _getObjectMapper(clazz);

		ObjectReader objectReader = objectMapper.readerFor(clazz);

		ExtensionProviders extensionProviders = _getExtensionProviders(
			clazz, mediaType);

		if (extensionProviders == null || !extensionProviders.exists()) {
			return objectReader.readValue(inputStream);
		}

		JsonNode jsonNode = objectReader.readTree(inputStream);

		objectReader = objectReader.without(
			DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

		Object object = objectReader.readValue(jsonNode);

		Map<String, Object> extendedProperties = _getExtendedProperties(
			clazz, jsonNode, objectMapper);

		extensionProviders.validate(
			extendedProperties,
			Objects.equals(
				_contextHttpServletRequest.getMethod(), HttpMethod.PATCH));

		// Guardar las extendedProperties de alguna manera. Thread Local?

		ExtensionContext extensionContext = _createExtendedContext(
			extendedProperties, extensionProviders);

		// Iniciar la transacción

		if (!StringUtil.equals(
				_contextHttpServletRequest.getMethod(), HttpMethod.PATCH)) {

			ValidationUtil.validate(object);
		}

		return object;
	}

	private ExtensionContext _createExtendedContext(
		Map<String, Object> extendedProperties,
		ExtensionProviders extensionProviders) {

		ExtensionContext.Builder builder = new ExtensionContext.Builder();

		builder.setAcceptLanguage(_contextAcceptLanguage);
		builder.setCompany(_contextCompany);
		builder.setExtendedProperties(extendedProperties);
		builder.setExtensionProviders(extensionProviders);
		builder.setHttpServletRequest(_contextHttpServletRequest);
		builder.setUriInfo(_contextUriInfo);
		builder.setUser(_contextUser);

		return builder.build();
	}

	private Map<String, Object> _getExtendedProperties(
			Class<?> clazz, JsonNode jsonNode, ObjectMapper objectMapper)
		throws IOException {

		List<String> clazzFieldNames = new ArrayList<>();

		for (Field field : clazz.getDeclaredFields()) {
			clazzFieldNames.add(field.getName());
		}

		Iterator<String> fieldNamesIterator = jsonNode.fieldNames();
		Map<String, Object> extendedProperties = new HashMap<>();

		while (fieldNamesIterator.hasNext()) {
			String jsonFieldName = fieldNamesIterator.next();

			if (!clazzFieldNames.contains(jsonFieldName)) {
				JsonNode fieldNameJsonNode = jsonNode.get(jsonFieldName);

				extendedProperties.put(
					jsonFieldName,
					_getJsonNodeValue(fieldNameJsonNode, objectMapper));
			}
		}

		return extendedProperties;
	}

	private ExtensionProviders _getExtensionProviders(
		Class<?> clazz, MediaType mediaType) {

		ContextResolver<ExtensionProviders> extensionProvidersContextResolver =
			_providers.getContextResolver(ExtensionProviders.class, mediaType);

		return extensionProvidersContextResolver.getContext(clazz);
	}

	private Object _getJsonNodeValue(
			JsonNode jsonNode, ObjectMapper objectMapper)
		throws IOException {

		if (jsonNode.isBoolean()) {
			return jsonNode.asBoolean();
		}
		else if (jsonNode.isDouble()) {
			return jsonNode.asDouble();
		}
		else if (jsonNode.isInt()) {
			return jsonNode.asInt();
		}
		else if (jsonNode.isLong()) {
			return jsonNode.asLong();
		}
		else if (jsonNode.isTextual()) {
			return jsonNode.asText();
		}
		else if (jsonNode.isObject()) {
			return objectMapper.readValue(jsonNode.traverse(), Object.class);
		}

		return null;
	}

	private ObjectMapper _getObjectMapper(Class<?> clazz) {
		return Optional.ofNullable(
			_providers.getContextResolver(_contextType, _mediaType)
		).map(
			contextResolver -> contextResolver.getContext(clazz)
		).orElseThrow(
			() -> new InternalServerErrorException(
				"Unable to generate object mapper for class " + clazz)
		);
	}

	@Context
	private AcceptLanguage _contextAcceptLanguage;

	@Context
	private Company _contextCompany;

	@Context
	private HttpServletRequest _contextHttpServletRequest;

	private final Class<? extends ObjectMapper> _contextType;

	@Context
	private UriInfo _contextUriInfo;

	@Context
	private User _contextUser;

	private final MediaType _mediaType;

	@Context
	private Providers _providers;

}