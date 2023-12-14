/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.search.experiences.rest.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@Generated("")
@GraphQLName("SearchResponse")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "SearchResponse")
public class SearchResponse implements Serializable {

	public static SearchResponse toDTO(String json) {
		return ObjectMapperUtil.readValue(SearchResponse.class, json);
	}

	public static SearchResponse unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(SearchResponse.class, json);
	}

	@Schema
	@Valid
	public Map[] getErrors() {
		if (errors != null) {
			return errors;
		}

		errors = _errorsSupplier.get();

		return errors;
	}

	public void setErrors(Map[] errors) {
		this.errors = errors;

		_errorsSupplier = () -> errors;
	}

	@JsonIgnore
	public void setErrors(
		UnsafeSupplier<Map[], Exception> errorsUnsafeSupplier) {

		errors = null;

		_errorsSupplier = () -> {
			try {
				return errorsUnsafeSupplier.get();
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
	protected Map[] errors;

	private Supplier<Map[]> _errorsSupplier = () -> null;

	@Schema
	public Integer getPage() {
		if (page != null) {
			return page;
		}

		page = _pageSupplier.get();

		return page;
	}

	public void setPage(Integer page) {
		this.page = page;

		_pageSupplier = () -> page;
	}

	@JsonIgnore
	public void setPage(UnsafeSupplier<Integer, Exception> pageUnsafeSupplier) {
		page = null;

		_pageSupplier = () -> {
			try {
				return pageUnsafeSupplier.get();
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
	protected Integer page;

	private Supplier<Integer> _pageSupplier = () -> null;

	@Schema
	public Integer getPageSize() {
		if (pageSize != null) {
			return pageSize;
		}

		pageSize = _pageSizeSupplier.get();

		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;

		_pageSizeSupplier = () -> pageSize;
	}

	@JsonIgnore
	public void setPageSize(
		UnsafeSupplier<Integer, Exception> pageSizeUnsafeSupplier) {

		pageSize = null;

		_pageSizeSupplier = () -> {
			try {
				return pageSizeUnsafeSupplier.get();
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
	protected Integer pageSize;

	private Supplier<Integer> _pageSizeSupplier = () -> null;

	@Schema
	@Valid
	public Object getRequest() {
		if (request != null) {
			return request;
		}

		request = _requestSupplier.get();

		return request;
	}

	public void setRequest(Object request) {
		this.request = request;

		_requestSupplier = () -> request;
	}

	@JsonIgnore
	public void setRequest(
		UnsafeSupplier<Object, Exception> requestUnsafeSupplier) {

		request = null;

		_requestSupplier = () -> {
			try {
				return requestUnsafeSupplier.get();
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
	protected Object request;

	private Supplier<Object> _requestSupplier = () -> null;

	@Schema
	public String getRequestString() {
		if (requestString != null) {
			return requestString;
		}

		requestString = _requestStringSupplier.get();

		return requestString;
	}

	public void setRequestString(String requestString) {
		this.requestString = requestString;

		_requestStringSupplier = () -> requestString;
	}

	@JsonIgnore
	public void setRequestString(
		UnsafeSupplier<String, Exception> requestStringUnsafeSupplier) {

		requestString = null;

		_requestStringSupplier = () -> {
			try {
				return requestStringUnsafeSupplier.get();
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
	protected String requestString;

	private Supplier<String> _requestStringSupplier = () -> null;

	@Schema
	@Valid
	public Object getResponse() {
		if (response != null) {
			return response;
		}

		response = _responseSupplier.get();

		return response;
	}

	public void setResponse(Object response) {
		this.response = response;

		_responseSupplier = () -> response;
	}

	@JsonIgnore
	public void setResponse(
		UnsafeSupplier<Object, Exception> responseUnsafeSupplier) {

		response = null;

		_responseSupplier = () -> {
			try {
				return responseUnsafeSupplier.get();
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
	protected Object response;

	private Supplier<Object> _responseSupplier = () -> null;

	@Schema
	public String getResponseString() {
		if (responseString != null) {
			return responseString;
		}

		responseString = _responseStringSupplier.get();

		return responseString;
	}

	public void setResponseString(String responseString) {
		this.responseString = responseString;

		_responseStringSupplier = () -> responseString;
	}

	@JsonIgnore
	public void setResponseString(
		UnsafeSupplier<String, Exception> responseStringUnsafeSupplier) {

		responseString = null;

		_responseStringSupplier = () -> {
			try {
				return responseStringUnsafeSupplier.get();
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
	protected String responseString;

	private Supplier<String> _responseStringSupplier = () -> null;

	@Schema
	@Valid
	public SearchHits getSearchHits() {
		if (searchHits != null) {
			return searchHits;
		}

		searchHits = _searchHitsSupplier.get();

		return searchHits;
	}

	public void setSearchHits(SearchHits searchHits) {
		this.searchHits = searchHits;

		_searchHitsSupplier = () -> searchHits;
	}

	@JsonIgnore
	public void setSearchHits(
		UnsafeSupplier<SearchHits, Exception> searchHitsUnsafeSupplier) {

		searchHits = null;

		_searchHitsSupplier = () -> {
			try {
				return searchHitsUnsafeSupplier.get();
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
	protected SearchHits searchHits;

	private Supplier<SearchHits> _searchHitsSupplier = () -> null;

	@Schema
	@Valid
	public SearchRequest getSearchRequest() {
		if (searchRequest != null) {
			return searchRequest;
		}

		searchRequest = _searchRequestSupplier.get();

		return searchRequest;
	}

	public void setSearchRequest(SearchRequest searchRequest) {
		this.searchRequest = searchRequest;

		_searchRequestSupplier = () -> searchRequest;
	}

	@JsonIgnore
	public void setSearchRequest(
		UnsafeSupplier<SearchRequest, Exception> searchRequestUnsafeSupplier) {

		searchRequest = null;

		_searchRequestSupplier = () -> {
			try {
				return searchRequestUnsafeSupplier.get();
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
	protected SearchRequest searchRequest;

	private Supplier<SearchRequest> _searchRequestSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SearchResponse)) {
			return false;
		}

		SearchResponse searchResponse = (SearchResponse)object;

		return Objects.equals(toString(), searchResponse.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (errors != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"errors\": ");

			sb.append("[");

			for (int i = 0; i < errors.length; i++) {
				sb.append(errors[i]);

				if ((i + 1) < errors.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (page != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"page\": ");

			sb.append(page);
		}

		if (pageSize != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"pageSize\": ");

			sb.append(pageSize);
		}

		if (request != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"request\": ");

			if (request instanceof Map) {
				sb.append(JSONFactoryUtil.createJSONObject((Map<?, ?>)request));
			}
			else if (request instanceof String) {
				sb.append("\"");
				sb.append(_escape((String)request));
				sb.append("\"");
			}
			else {
				sb.append(request);
			}
		}

		if (requestString != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"requestString\": ");

			sb.append("\"");

			sb.append(_escape(requestString));

			sb.append("\"");
		}

		if (response != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"response\": ");

			if (response instanceof Map) {
				sb.append(
					JSONFactoryUtil.createJSONObject((Map<?, ?>)response));
			}
			else if (response instanceof String) {
				sb.append("\"");
				sb.append(_escape((String)response));
				sb.append("\"");
			}
			else {
				sb.append(response);
			}
		}

		if (responseString != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"responseString\": ");

			sb.append("\"");

			sb.append(_escape(responseString));

			sb.append("\"");
		}

		if (searchHits != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"searchHits\": ");

			sb.append(String.valueOf(searchHits));
		}

		if (searchRequest != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"searchRequest\": ");

			sb.append(String.valueOf(searchRequest));
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.search.experiences.rest.dto.v1_0.SearchResponse",
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