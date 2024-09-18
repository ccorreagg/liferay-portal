/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.internal.tracker;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.fields.NestedField;
import com.liferay.portal.vulcan.fields.NestedFieldId;
import com.liferay.portal.vulcan.fields.NestedFieldsContext;
import com.liferay.portal.vulcan.internal.fields.servlet.NestedFieldsHttpServletRequestWrapper;
import com.liferay.portal.vulcan.internal.jaxrs.message.exchange.ExchangeWrapper;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import org.apache.cxf.jaxrs.ext.ContextProvider;
import org.apache.cxf.jaxrs.impl.UriInfoImpl;
import org.apache.cxf.jaxrs.provider.ProviderFactory;
import org.apache.cxf.message.Exchange;
import org.apache.cxf.message.Message;

import org.osgi.framework.BundleContext;
import org.osgi.framework.Filter;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceObjects;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

/**
 * @author Luis Ortiz
 */
@Component(service = {})
public class NestedFieldsTracker {

	@Activate
	protected void activate(BundleContext bundleContext) {
		_nestedFieldServiceTrackerCustomizer =
			new NestedFieldsTracker.NestedFieldServiceTrackerCustomizer(
				bundleContext);

		Filter filter = null;

		try {
			filter = bundleContext.createFilter("(nested.field.support=true)");
		}
		catch (InvalidSyntaxException invalidSyntaxException) {
			ReflectionUtil.throwException(invalidSyntaxException);
		}

		_serviceTracker = new ServiceTracker<>(
			bundleContext, filter, _nestedFieldServiceTrackerCustomizer);

		_serviceTracker.open();
	}

	@Deactivate
	protected void deactivate() {
		_serviceTracker.close();
	}

	protected static class NestedFieldServiceTrackerCustomizer
		implements ServiceTrackerCustomizer
			<Object, List<NestedFieldsTracker.FactoryKey>> {

		@Override
		public List<NestedFieldsTracker.FactoryKey> addingService(
			ServiceReference<Object> serviceReference) {

			Object resource = _bundleContext.getService(serviceReference);

			Class<?> resourceClass = resource.getClass();

			List<NestedFieldsTracker.FactoryKey> factoryKeys = null;

			for (Method resourceMethod : resourceClass.getDeclaredMethods()) {
				NestedField nestedField = resourceMethod.getAnnotation(
					NestedField.class);

				if (nestedField == null) {
					continue;
				}

				Class<?> parentClass = nestedField.parentClass();

				NestedFieldsTracker.FactoryKey factoryKey =
					new NestedFieldsTracker.FactoryKey(
						nestedField.value(), parentClass,
						_getAPIVersion(resourceClass.getSuperclass()));

				ServiceObjects<Object> serviceObjects =
					_bundleContext.getServiceObjects(serviceReference);

				_unsafeTriFunctions.put(
					factoryKey,
					(fieldName, item, nestedFieldsContext) ->
						_getNestedFieldValue(
							fieldName, item, nestedFieldsContext,
							resourceMethod,
							_getResourceMethodArgNameTypeEntries(
								resourceClass, resourceMethod),
							serviceObjects));

				if (factoryKeys == null) {
					factoryKeys = new ArrayList<>();
				}

				factoryKeys.add(factoryKey);
			}

			return factoryKeys;
		}

		@Override
		public void modifiedService(
			ServiceReference<Object> serviceReference,
			List<NestedFieldsTracker.FactoryKey> factoryKeys) {
		}

		@Override
		public void removedService(
			ServiceReference<Object> serviceReference,
			List<NestedFieldsTracker.FactoryKey> factoryKeys) {

			factoryKeys.forEach(_unsafeTriFunctions::remove);

			_bundleContext.ungetService(serviceReference);
		}

		protected NestedFieldServiceTrackerCustomizer(
			BundleContext bundleContext) {

			_bundleContext = bundleContext;
		}

		protected HttpServletRequest getHttpServletRequest(Message message) {
			return (HttpServletRequest)message.getContextualProperty(
				"HTTP.REQUEST");
		}

		protected ProviderFactory getProviderFactory(Message message) {
			return ProviderFactory.getInstance(message);
		}

		private Object _convert(String value, Class<?> type) {
			if (value == null) {
				return null;
			}

			return _objectMapper.convertValue(value, type);
		}

		private String _getAPIVersion(Class<?> resourceBaseClass) {
			Annotation[] annotations = resourceBaseClass.getAnnotations();

			for (Annotation annotation : annotations) {
				if (annotation instanceof Path) {
					Path path = (Path)annotation;

					String resourceVersion = path.value();

					return resourceVersion.substring(1);
				}
			}

			return null;
		}

		private <T> Object _getContext(Class<T> contextClass, Message message) {
			if (contextClass.equals(UriInfo.class)) {
				return new UriInfoImpl(message);
			}

			ContextProvider<?> contextProvider = _getContextProvider(
				contextClass, message);

			if (contextProvider != null) {
				return contextProvider.createContext(message);
			}

			return null;
		}

		private <T> ContextProvider<T> _getContextProvider(
			Class<T> contextClass, Message message) {

			ProviderFactory providerFactory = getProviderFactory(message);

			return providerFactory.createContextProvider(contextClass, message);
		}

		private Object[] _getMethodArgs(
				String fieldName, Object item,
				NestedFieldsContext nestedFieldsContext, Object resource,
				Method resourceMethod,
				Map.Entry<String, Class<?>>[] resourceMethodArgNameTypeEntries)
			throws Exception {

			Object[] args = new Object[resourceMethod.getParameterCount()];

			Message message = _handleNestedFieldMessage(
				fieldName, nestedFieldsContext.getMessage(), resource);
			MultivaluedMap<String, String> pathParameters =
				nestedFieldsContext.getPathParameters();
			MultivaluedMap<String, String> queryParameters =
				nestedFieldsContext.getQueryParameters();

			for (int i = 0; i < resourceMethod.getParameterCount(); i++) {
				if (resourceMethodArgNameTypeEntries[i] == null) {
					continue;
				}

				args[i] = _getMethodArgValueFromItem(
					item, resourceMethodArgNameTypeEntries[i]);

				if (args[i] == null) {
					args[i] = _getMethodArgValueFromRequest(
						fieldName, message, pathParameters, queryParameters,
						resourceMethodArgNameTypeEntries[i]);
				}
			}

			_resetNestedFieldMessage(message);

			return args;
		}

		private Object _getMethodArgValueFromItem(
				Object item,
				Map.Entry<String, Class<?>> resourceMethodArgNameTypeEntry)
			throws Exception {

			String argName = resourceMethodArgNameTypeEntry.getKey();

			String methodName =
				"get" + StringUtil.upperCaseFirstLetter(argName);

			List<Class<?>> itemClasses = new ArrayList<>();

			Class<?> itemClass = item.getClass();

			itemClasses.add(itemClass);

			itemClasses.add(itemClass.getSuperclass());

			for (Class<?> curItemClass : itemClasses) {
				for (Method method : curItemClass.getMethods()) {
					if (StringUtil.equals(method.getName(), methodName) &&
						Objects.equals(
							method.getReturnType(),
							resourceMethodArgNameTypeEntry.getValue()) &&
						(method.getParameterCount() == 0)) {

						return method.invoke(item);
					}
				}
			}

			return null;
		}

		private Object _getMethodArgValueFromRequest(
			String fieldName, Message message,
			MultivaluedMap<String, String> pathParameters,
			MultivaluedMap<String, String> queryParameters,
			Map.Entry<String, Class<?>> resourceMethodArgNameTypeEntry) {

			Object argValue = null;

			Class<?> resourceMethodArgType =
				resourceMethodArgNameTypeEntry.getValue();

			Object context = _getContext(resourceMethodArgType, message);

			if (context != null) {
				argValue = context;
			}
			else {
				argValue = _convert(
					pathParameters.getFirst(
						resourceMethodArgNameTypeEntry.getKey()),
					resourceMethodArgType);

				if (argValue == null) {
					argValue = _convert(
						queryParameters.getFirst(
							fieldName + StringPool.PERIOD +
								resourceMethodArgNameTypeEntry.getKey()),
						resourceMethodArgType);
				}
			}

			return argValue;
		}

		private Object _getNestedFieldValue(
				String fieldName, Object item,
				NestedFieldsContext nestedFieldsContext, Method resourceMethod,
				Map.Entry<String, Class<?>>[] resourceMethodArgNameTypeEntries,
				ServiceObjects<Object> serviceObjects)
			throws Exception {

			Object resource = serviceObjects.getService();

			try {
				_setResourceContexts(
					nestedFieldsContext.getMessage(), resource);

				Object[] args = _getMethodArgs(
					fieldName, item, nestedFieldsContext, resource,
					resourceMethod, resourceMethodArgNameTypeEntries);

				return resourceMethod.invoke(resource, args);
			}
			finally {
				serviceObjects.ungetService(resource);
			}
		}

		private Map.Entry<String, Class<?>>[]
			_getResourceMethodArgNameTypeEntries(
				Class<?> resourceClass, Method resourceMethod) {

			Parameter[] resourceMethodParameters =
				resourceMethod.getParameters();

			Map.Entry<String, Class<?>>[] resourceMethodArgNameTypeEntries =
				new Map.Entry[resourceMethodParameters.length];

			Parameter[] parentParameters = null;

			try {
				Class<?> parentResourceClass = resourceClass.getSuperclass();

				Method parentResourceMethod = parentResourceClass.getMethod(
					resourceMethod.getName(),
					resourceMethod.getParameterTypes());

				parentParameters = parentResourceMethod.getParameters();
			}
			catch (NoSuchMethodException noSuchMethodException) {
				if (_log.isDebugEnabled()) {
					_log.debug(noSuchMethodException);
				}
			}

			for (int i = 0; i < resourceMethodParameters.length; i++) {
				Parameter parameter = resourceMethodParameters[i];

				NestedFieldId nestedFieldId = _getAnnotation(
					NestedFieldId.class, parameter, parentParameters, i);

				Class<?> parameterType = parameter.getType();

				if (nestedFieldId == null) {
					Context context = _getAnnotation(
						Context.class, parameter, parentParameters, i);

					if (context != null) {
						resourceMethodArgNameTypeEntries[i] =
							new AbstractMap.SimpleImmutableEntry<>(
								parameter.getName(), parameterType);
					}

					PathParam pathParam = _getAnnotation(
						PathParam.class, parameter, parentParameters, i);

					if (pathParam != null) {
						resourceMethodArgNameTypeEntries[i] =
							new AbstractMap.SimpleImmutableEntry<>(
								pathParam.value(), parameterType);
					}

					QueryParam queryParam = _getAnnotation(
						QueryParam.class, parameter, parentParameters, i);

					if (queryParam != null) {
						resourceMethodArgNameTypeEntries[i] =
							new AbstractMap.SimpleImmutableEntry<>(
								queryParam.value(), parameterType);
					}
				}
				else {
					resourceMethodArgNameTypeEntries[i] =
						new AbstractMap.SimpleImmutableEntry<>(
							nestedFieldId.value(), parameterType);
				}
			}

			return resourceMethodArgNameTypeEntries;
		}

		private Message _handleNestedFieldMessage(
			String fieldName, Message message, Object resource) {

			message.put(
				"HTTP.REQUEST",
				new NestedFieldsHttpServletRequestWrapper(
					fieldName, getHttpServletRequest(message)));
			message.setExchange(
				new ExchangeWrapper(message.getExchange(), resource));

			return message;
		}

		private void _resetNestedFieldMessage(Message message) {
			NestedFieldsHttpServletRequestWrapper
				nestedFieldsHttpServletRequestWrapper =
					(NestedFieldsHttpServletRequestWrapper)
						message.getContextualProperty("HTTP.REQUEST");

			message.put(
				"HTTP.REQUEST",
				nestedFieldsHttpServletRequestWrapper.getRequest());

			Exchange exchange = message.getExchange();

			if (exchange instanceof ExchangeWrapper) {
				ExchangeWrapper exchangeWrapper = (ExchangeWrapper)exchange;

				message.setExchange(exchangeWrapper.getExchange());
			}
		}

		private void _setContextFields(
				Field[] fields, Message message, Object resource)
			throws Exception {

			for (Field field : fields) {
				String name = field.getName();

				if (name.startsWith("context") ||
					(field.getAnnotation(Context.class) != null)) {

					field.setAccessible(true);

					field.set(resource, _getContext(field.getType(), message));
				}
			}
		}

		private void _setResourceContexts(Message message, Object resource)
			throws Exception {

			Class<?> resourceClass = resource.getClass();

			_setContextFields(
				resourceClass.getDeclaredFields(), message, resource);

			Class<?> superClass = resourceClass.getSuperclass();

			_setContextFields(
				superClass.getDeclaredFields(), message, resource);
		}

		private static final ObjectMapper _objectMapper = new ObjectMapper();

		private final BundleContext _bundleContext;
		private final Map
			<NestedFieldsTracker.FactoryKey,
			 NestedFieldsTracker.UnsafeTriFunction
				 <String, Object, NestedFieldsContext, Object>>
					_unsafeTriFunctions = new ConcurrentHashMap<>();

	}

	@FunctionalInterface
	protected interface UnsafeTriFunction<A, B, C, R> {

		public R apply(A a, B b, C c) throws Exception;

	}

	private static <A extends Annotation> A _getAnnotation(
		Class<A> annotationClass, Parameter parameter,
		Parameter[] parentParameters, int i) {

		A annotation = parameter.getAnnotation(annotationClass);

		if ((annotation == null) && (parentParameters != null)) {
			return parentParameters[i].getAnnotation(annotationClass);
		}

		return annotation;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		NestedFieldsTracker.class);

	private NestedFieldsTracker.NestedFieldServiceTrackerCustomizer
		_nestedFieldServiceTrackerCustomizer;
	private ServiceTracker<Object, List<NestedFieldsTracker.FactoryKey>>
		_serviceTracker;

	private static class FactoryKey {

		@Override
		public boolean equals(Object object) {
			FactoryKey factoryKey = (FactoryKey)object;

			if (Objects.equals(factoryKey._nestedFieldName, _nestedFieldName) &&
				Objects.equals(factoryKey._parentClass, _parentClass) &&
				Objects.equals(factoryKey._resourceVersion, _resourceVersion)) {

				return true;
			}

			return false;
		}

		@Override
		public int hashCode() {
			int hashCode = HashUtil.hash(0, _nestedFieldName);

			hashCode = HashUtil.hash(hashCode, _parentClass);
			hashCode = HashUtil.hash(hashCode, _resourceVersion);

			return hashCode;
		}

		private FactoryKey(
			String nestedFieldName, Class<?> parentClass,
			String resourceVersion) {

			_nestedFieldName = nestedFieldName;
			_parentClass = parentClass;
			_resourceVersion = resourceVersion;
		}

		private final String _nestedFieldName;
		private final Class<?> _parentClass;
		private final String _resourceVersion;

	}

}