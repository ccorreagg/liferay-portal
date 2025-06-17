/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.internal.dto.converter;

import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMap;
import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMapFactory;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterRegistry;

import java.util.Set;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

/**
 * @author Rubén Pulido
 * @author Víctor Galán
 */
@Component(service = DTOConverterRegistry.class)
public class DTOConverterRegistryImpl implements DTOConverterRegistry {

	@Override
	public Set<String> getDTOClassNames() {
		return _serviceTrackerMap.keySet();
	}

	@Override
	public DTOConverter<?, ?> getDTOConverter(String dtoClassName) {
		DTOConverter<?, ?> dtoConverter = _serviceTrackerMap.getService(
			_getKey(true, dtoClassName));

		if (dtoConverter != null) {
			return dtoConverter;
		}

		return _serviceTrackerMap.getService(_getKey(false, dtoClassName));
	}

	@Override
	public DTOConverter<?, ?> getDTOConverter(
		String applicationName, String dtoClassName, String version) {

		DTOConverter<?, ?> dtoConverter = _serviceTrackerMap.getService(
			_getKey(applicationName, true, dtoClassName, version));

		if (dtoConverter != null) {
			return dtoConverter;
		}

		return _serviceTrackerMap.getService(
			_getKey(applicationName, false, dtoClassName, version));
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_serviceTrackerMap = ServiceTrackerMapFactory.openSingleValueMap(
			bundleContext,
			(Class<DTOConverter<?, ?>>)(Class<?>)DTOConverter.class,
			"(dto.class.name=*)",
			(serviceReference, emitter) -> {
				boolean defaultDTOConverter = GetterUtil.getBoolean(
					(String)serviceReference.getProperty("default"));

				String dtoClassName = (String)serviceReference.getProperty(
					"dto.class.name");

				emitter.emit(_getKey(defaultDTOConverter, dtoClassName));

				String applicationName = (String)serviceReference.getProperty(
					"application.name");
				String version = (String)serviceReference.getProperty(
					"version");

				if (!Validator.isBlank(applicationName) &&
					!Validator.isBlank(version)) {

					emitter.emit(
						_getKey(
							applicationName, defaultDTOConverter, dtoClassName,
							version));
				}
			});
	}

	@Deactivate
	protected void deactivate() {
		_serviceTrackerMap.close();
	}

	private String _getKey(boolean defaultDTOConverter, String dtoClassName) {
		if (!defaultDTOConverter) {
			return dtoClassName;
		}

		return dtoClassName + _DEFAULT;
	}

	private String _getKey(
		String applicationName, boolean defaultDTOConverter,
		String dtoClassName, String version) {

		String key = StringBundler.concat(
			applicationName, StringPool.POUND, dtoClassName, StringPool.POUND,
			version);

		if (!defaultDTOConverter) {
			return key;
		}

		return key + _DEFAULT;
	}

	private static final String _DEFAULT = "#default";

	private ServiceTrackerMap<String, DTOConverter<?, ?>> _serviceTrackerMap;

}