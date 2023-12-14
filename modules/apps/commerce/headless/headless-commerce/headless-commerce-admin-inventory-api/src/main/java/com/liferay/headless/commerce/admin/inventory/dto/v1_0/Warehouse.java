/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.inventory.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
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
import javax.validation.constraints.DecimalMin;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Alessio Antonio Rendina
 * @generated
 */
@Generated("")
@GraphQLName("Warehouse")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Warehouse")
public class Warehouse implements Serializable {

	public static Warehouse toDTO(String json) {
		return ObjectMapperUtil.readValue(Warehouse.class, json);
	}

	public static Warehouse unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Warehouse.class, json);
	}

	@Schema
	@Valid
	public Map<String, Map<String, String>> getActions() {
		if (actions != null) {
			return actions;
		}

		actions = _actionsSupplier.get();

		return actions;
	}

	public void setActions(Map<String, Map<String, String>> actions) {
		this.actions = actions;

		_actionsSupplier = () -> actions;
	}

	@JsonIgnore
	public void setActions(
		UnsafeSupplier<Map<String, Map<String, String>>, Exception>
			actionsUnsafeSupplier) {

		actions = null;

		_actionsSupplier = () -> {
			try {
				return actionsUnsafeSupplier.get();
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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Map<String, Map<String, String>> actions;

	private Supplier<Map<String, Map<String, String>>> _actionsSupplier =
		() -> null;

	@Schema(example = "true")
	public Boolean getActive() {
		if (active != null) {
			return active;
		}

		active = _activeSupplier.get();

		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;

		_activeSupplier = () -> active;
	}

	@JsonIgnore
	public void setActive(
		UnsafeSupplier<Boolean, Exception> activeUnsafeSupplier) {

		active = null;

		_activeSupplier = () -> {
			try {
				return activeUnsafeSupplier.get();
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
	protected Boolean active;

	private Supplier<Boolean> _activeSupplier = () -> null;

	@Schema(example = "Diamond Bar")
	public String getCity() {
		if (city != null) {
			return city;
		}

		city = _citySupplier.get();

		return city;
	}

	public void setCity(String city) {
		this.city = city;

		_citySupplier = () -> city;
	}

	@JsonIgnore
	public void setCity(UnsafeSupplier<String, Exception> cityUnsafeSupplier) {
		city = null;

		_citySupplier = () -> {
			try {
				return cityUnsafeSupplier.get();
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
	protected String city;

	private Supplier<String> _citySupplier = () -> null;

	@Schema(example = "US")
	public String getCountryISOCode() {
		if (countryISOCode != null) {
			return countryISOCode;
		}

		countryISOCode = _countryISOCodeSupplier.get();

		return countryISOCode;
	}

	public void setCountryISOCode(String countryISOCode) {
		this.countryISOCode = countryISOCode;

		_countryISOCodeSupplier = () -> countryISOCode;
	}

	@JsonIgnore
	public void setCountryISOCode(
		UnsafeSupplier<String, Exception> countryISOCodeUnsafeSupplier) {

		countryISOCode = null;

		_countryISOCodeSupplier = () -> {
			try {
				return countryISOCodeUnsafeSupplier.get();
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
	protected String countryISOCode;

	private Supplier<String> _countryISOCodeSupplier = () -> null;

	@Schema(
		example = "{en_US=Warehouse Description US, hr_HR=Warehouse Description HR, hu_HU=Warehouse Description HU}"
	)
	@Valid
	public Map<String, String> getDescription() {
		if (description != null) {
			return description;
		}

		description = _descriptionSupplier.get();

		return description;
	}

	public void setDescription(Map<String, String> description) {
		this.description = description;

		_descriptionSupplier = () -> description;
	}

	@JsonIgnore
	public void setDescription(
		UnsafeSupplier<Map<String, String>, Exception>
			descriptionUnsafeSupplier) {

		description = null;

		_descriptionSupplier = () -> {
			try {
				return descriptionUnsafeSupplier.get();
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
	protected Map<String, String> description;

	private Supplier<Map<String, String>> _descriptionSupplier = () -> null;

	@Schema(example = "AB-34098-789-N")
	public String getExternalReferenceCode() {
		if (externalReferenceCode != null) {
			return externalReferenceCode;
		}

		externalReferenceCode = _externalReferenceCodeSupplier.get();

		return externalReferenceCode;
	}

	public void setExternalReferenceCode(String externalReferenceCode) {
		this.externalReferenceCode = externalReferenceCode;

		_externalReferenceCodeSupplier = () -> externalReferenceCode;
	}

	@JsonIgnore
	public void setExternalReferenceCode(
		UnsafeSupplier<String, Exception> externalReferenceCodeUnsafeSupplier) {

		externalReferenceCode = null;

		_externalReferenceCodeSupplier = () -> {
			try {
				return externalReferenceCodeUnsafeSupplier.get();
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
	protected String externalReferenceCode;

	private Supplier<String> _externalReferenceCodeSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30130")
	public Long getId() {
		if (id != null) {
			return id;
		}

		id = _idSupplier.get();

		return id;
	}

	public void setId(Long id) {
		this.id = id;

		_idSupplier = () -> id;
	}

	@JsonIgnore
	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		id = null;

		_idSupplier = () -> {
			try {
				return idUnsafeSupplier.get();
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
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema(example = "33.9976884")
	public Double getLatitude() {
		if (latitude != null) {
			return latitude;
		}

		latitude = _latitudeSupplier.get();

		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;

		_latitudeSupplier = () -> latitude;
	}

	@JsonIgnore
	public void setLatitude(
		UnsafeSupplier<Double, Exception> latitudeUnsafeSupplier) {

		latitude = null;

		_latitudeSupplier = () -> {
			try {
				return latitudeUnsafeSupplier.get();
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
	protected Double latitude;

	private Supplier<Double> _latitudeSupplier = () -> null;

	@Schema(example = "-117.8144595")
	public Double getLongitude() {
		if (longitude != null) {
			return longitude;
		}

		longitude = _longitudeSupplier.get();

		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;

		_longitudeSupplier = () -> longitude;
	}

	@JsonIgnore
	public void setLongitude(
		UnsafeSupplier<Double, Exception> longitudeUnsafeSupplier) {

		longitude = null;

		_longitudeSupplier = () -> {
			try {
				return longitudeUnsafeSupplier.get();
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
	protected Double longitude;

	private Supplier<Double> _longitudeSupplier = () -> null;

	@Schema(
		example = "{en_US=Warehouse Name US, hr_HR=Warehouse Name HR, hu_HU=Warehouse Name HU}"
	)
	@Valid
	public Map<String, String> getName() {
		if (name != null) {
			return name;
		}

		name = _nameSupplier.get();

		return name;
	}

	public void setName(Map<String, String> name) {
		this.name = name;

		_nameSupplier = () -> name;
	}

	@JsonIgnore
	public void setName(
		UnsafeSupplier<Map<String, String>, Exception> nameUnsafeSupplier) {

		name = null;

		_nameSupplier = () -> {
			try {
				return nameUnsafeSupplier.get();
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
	protected Map<String, String> name;

	private Supplier<Map<String, String>> _nameSupplier = () -> null;

	@Schema(example = "CA")
	public String getRegionISOCode() {
		if (regionISOCode != null) {
			return regionISOCode;
		}

		regionISOCode = _regionISOCodeSupplier.get();

		return regionISOCode;
	}

	public void setRegionISOCode(String regionISOCode) {
		this.regionISOCode = regionISOCode;

		_regionISOCodeSupplier = () -> regionISOCode;
	}

	@JsonIgnore
	public void setRegionISOCode(
		UnsafeSupplier<String, Exception> regionISOCodeUnsafeSupplier) {

		regionISOCode = null;

		_regionISOCodeSupplier = () -> {
			try {
				return regionISOCodeUnsafeSupplier.get();
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
	protected String regionISOCode;

	private Supplier<String> _regionISOCodeSupplier = () -> null;

	@Schema(example = "1400 Montefino Ave")
	public String getStreet1() {
		if (street1 != null) {
			return street1;
		}

		street1 = _street1Supplier.get();

		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;

		_street1Supplier = () -> street1;
	}

	@JsonIgnore
	public void setStreet1(
		UnsafeSupplier<String, Exception> street1UnsafeSupplier) {

		street1 = null;

		_street1Supplier = () -> {
			try {
				return street1UnsafeSupplier.get();
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
	protected String street1;

	private Supplier<String> _street1Supplier = () -> null;

	@Schema(example = "1st floor")
	public String getStreet2() {
		if (street2 != null) {
			return street2;
		}

		street2 = _street2Supplier.get();

		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;

		_street2Supplier = () -> street2;
	}

	@JsonIgnore
	public void setStreet2(
		UnsafeSupplier<String, Exception> street2UnsafeSupplier) {

		street2 = null;

		_street2Supplier = () -> {
			try {
				return street2UnsafeSupplier.get();
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
	protected String street2;

	private Supplier<String> _street2Supplier = () -> null;

	@Schema(example = "suite 200")
	public String getStreet3() {
		if (street3 != null) {
			return street3;
		}

		street3 = _street3Supplier.get();

		return street3;
	}

	public void setStreet3(String street3) {
		this.street3 = street3;

		_street3Supplier = () -> street3;
	}

	@JsonIgnore
	public void setStreet3(
		UnsafeSupplier<String, Exception> street3UnsafeSupplier) {

		street3 = null;

		_street3Supplier = () -> {
			try {
				return street3UnsafeSupplier.get();
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
	protected String street3;

	private Supplier<String> _street3Supplier = () -> null;

	@Schema
	public String getType() {
		if (type != null) {
			return type;
		}

		type = _typeSupplier.get();

		return type;
	}

	public void setType(String type) {
		this.type = type;

		_typeSupplier = () -> type;
	}

	@JsonIgnore
	public void setType(UnsafeSupplier<String, Exception> typeUnsafeSupplier) {
		type = null;

		_typeSupplier = () -> {
			try {
				return typeUnsafeSupplier.get();
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
	protected String type;

	private Supplier<String> _typeSupplier = () -> null;

	@Schema
	@Valid
	public WarehouseItem[] getWarehouseItems() {
		if (warehouseItems != null) {
			return warehouseItems;
		}

		warehouseItems = _warehouseItemsSupplier.get();

		return warehouseItems;
	}

	public void setWarehouseItems(WarehouseItem[] warehouseItems) {
		this.warehouseItems = warehouseItems;

		_warehouseItemsSupplier = () -> warehouseItems;
	}

	@JsonIgnore
	public void setWarehouseItems(
		UnsafeSupplier<WarehouseItem[], Exception>
			warehouseItemsUnsafeSupplier) {

		warehouseItems = null;

		_warehouseItemsSupplier = () -> {
			try {
				return warehouseItemsUnsafeSupplier.get();
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
	protected WarehouseItem[] warehouseItems;

	private Supplier<WarehouseItem[]> _warehouseItemsSupplier = () -> null;

	@Schema(example = "91765")
	public String getZip() {
		if (zip != null) {
			return zip;
		}

		zip = _zipSupplier.get();

		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;

		_zipSupplier = () -> zip;
	}

	@JsonIgnore
	public void setZip(UnsafeSupplier<String, Exception> zipUnsafeSupplier) {
		zip = null;

		_zipSupplier = () -> {
			try {
				return zipUnsafeSupplier.get();
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
	protected String zip;

	private Supplier<String> _zipSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Warehouse)) {
			return false;
		}

		Warehouse warehouse = (Warehouse)object;

		return Objects.equals(toString(), warehouse.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (actions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actions\": ");

			sb.append(_toJSON(actions));
		}

		if (active != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"active\": ");

			sb.append(active);
		}

		if (city != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"city\": ");

			sb.append("\"");

			sb.append(_escape(city));

			sb.append("\"");
		}

		if (countryISOCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"countryISOCode\": ");

			sb.append("\"");

			sb.append(_escape(countryISOCode));

			sb.append("\"");
		}

		if (description != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append(_toJSON(description));
		}

		if (externalReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"externalReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(externalReferenceCode));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (latitude != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"latitude\": ");

			sb.append(latitude);
		}

		if (longitude != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"longitude\": ");

			sb.append(longitude);
		}

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append(_toJSON(name));
		}

		if (regionISOCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"regionISOCode\": ");

			sb.append("\"");

			sb.append(_escape(regionISOCode));

			sb.append("\"");
		}

		if (street1 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"street1\": ");

			sb.append("\"");

			sb.append(_escape(street1));

			sb.append("\"");
		}

		if (street2 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"street2\": ");

			sb.append("\"");

			sb.append(_escape(street2));

			sb.append("\"");
		}

		if (street3 != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"street3\": ");

			sb.append("\"");

			sb.append(_escape(street3));

			sb.append("\"");
		}

		if (type != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"type\": ");

			sb.append("\"");

			sb.append(_escape(type));

			sb.append("\"");
		}

		if (warehouseItems != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"warehouseItems\": ");

			sb.append("[");

			for (int i = 0; i < warehouseItems.length; i++) {
				sb.append(String.valueOf(warehouseItems[i]));

				if ((i + 1) < warehouseItems.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (zip != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"zip\": ");

			sb.append("\"");

			sb.append(_escape(zip));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.inventory.dto.v1_0.Warehouse",
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