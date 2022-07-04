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

package com.liferay.portal.vulcan.extension.validation;

import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.test.rule.LiferayUnitTestRule;
import com.liferay.portal.vulcan.extension.ExtendedPropertyDefinition;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.validation.ValidationException;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Carlos Correa
 */
public class DefaultExtendedPropertyValidatorTest {

	@ClassRule
	@Rule
	public static final LiferayUnitTestRule liferayUnitTestRule =
		LiferayUnitTestRule.INSTANCE;

	@Test
	public void testValidateBigDecimal() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				"field", false,
				ExtendedPropertyDefinition.FieldType.BIG_DECIMAL,
				defaultExtendedPropertyValidator);

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition, new BigDecimal(Long.MAX_VALUE));
	}

	@Test
	public void testValidateBoolean() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				"field", false, ExtendedPropertyDefinition.FieldType.BOOLEAN,
				defaultExtendedPropertyValidator);

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition, true);
	}

	@Test
	public void testValidateDate() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				String.class, "field", false,
				ExtendedPropertyDefinition.FieldType.DATE,
				defaultExtendedPropertyValidator);

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition, "2021-07-04T12:12:02Z");
	}

	@Test
	public void testValidateDecimal() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				"field", false, ExtendedPropertyDefinition.FieldType.DECIMAL,
				defaultExtendedPropertyValidator);

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition, Float.MAX_VALUE);
	}

	@Test
	public void testValidateDouble() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				"field", false, ExtendedPropertyDefinition.FieldType.DOUBLE,
				defaultExtendedPropertyValidator);

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition, Double.MAX_VALUE);
	}

	@Test
	public void testValidateInteger() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				"field", false, ExtendedPropertyDefinition.FieldType.INTEGER,
				defaultExtendedPropertyValidator);

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition, Integer.MAX_VALUE);
	}

	@Test(expected = ValidationException.class)
	public void testValidateInvalidBigDecimal() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				"field", false,
				ExtendedPropertyDefinition.FieldType.BIG_DECIMAL,
				defaultExtendedPropertyValidator);

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition, "This is a invalid value");
	}

	@Test(expected = ValidationException.class)
	public void testValidateInvalidDate() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				String.class, "field", false,
				ExtendedPropertyDefinition.FieldType.DATE,
				defaultExtendedPropertyValidator);

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition, "2021-07-04T12:12:02");
	}

	@Test(expected = ValidationException.class)
	public void testValidateInvalidMultipleElements() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				InvalidClass.class, "field", false,
				ExtendedPropertyDefinition.FieldType.MULTIPLE_ELEMENT,
				defaultExtendedPropertyValidator);

		List<Map<String, Object>> multipleElements = Arrays.asList(
			new HashMapBuilder<>().<String, Object>put(
				"field1", "field1Text1"
			).<String, Object>put(
				"field2", "field1Text2"
			).<String, Object>put(
				"field3", 1L
			).build(),
			new HashMapBuilder<>().<String, Object>put(
				"field1", "field2Text1"
			).<String, Object>put(
				"field2", "field2Text2"
			).<String, Object>put(
				"field3", 2L
			).build());

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition, multipleElements);
	}

	@Test(expected = ValidationException.class)
	public void testValidateInvalidSingleElement() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				InvalidClass.class, "field", false,
				ExtendedPropertyDefinition.FieldType.SINGLE_ELEMENT,
				defaultExtendedPropertyValidator);

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition,
			new HashMapBuilder<>().<String, Object>put(
				"field1", "field1Text1"
			).<String, Object>put(
				"field2", "field1Text2"
			).<String, Object>put(
				"field3", 1L
			).build());
	}

	@Test(expected = ValidationException.class)
	public void testValidateInvalidValue() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				"field", false, ExtendedPropertyDefinition.FieldType.BOOLEAN,
				defaultExtendedPropertyValidator);

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition, "This is a invalid value");
	}

	@Test
	public void testValidateLong() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				"field", false, ExtendedPropertyDefinition.FieldType.LONG,
				defaultExtendedPropertyValidator);

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition, Long.MAX_VALUE);
	}

	@Test
	public void testValidateMultipleElements() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				TestClass.class, "field", false,
				ExtendedPropertyDefinition.FieldType.MULTIPLE_ELEMENT,
				defaultExtendedPropertyValidator);

		Map<String, Object>[] multipleElements = new Map[] {
			new HashMapBuilder<>().<String, Object>put(
				"field1", "field1Text1"
			).<String, Object>put(
				"field2", "field1Text2"
			).<String, Object>put(
				"field3", 1L
			).build(),
			new HashMapBuilder<>().<String, Object>put(
				"field1", "field2Text1"
			).<String, Object>put(
				"field2", "field2Text2"
			).<String, Object>put(
				"field3", 2L
			).build()
		};

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition, multipleElements);
	}

	@Test(expected = ValidationException.class)
	public void testValidateNullClass() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				null, "field", false,
				ExtendedPropertyDefinition.FieldType.BOOLEAN,
				defaultExtendedPropertyValidator);

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition, true);
	}

	@Test
	public void testValidateSingleElement() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				TestClass.class, "field", false,
				ExtendedPropertyDefinition.FieldType.SINGLE_ELEMENT,
				defaultExtendedPropertyValidator);

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition,
			new HashMapBuilder<>().<String, Object>put(
				"field1", "field1Text1"
			).<String, Object>put(
				"field2", "field1Text2"
			).<String, Object>put(
				"field3", 1L
			).build());
	}

	@Test
	public void testValidateText() {
		DefaultExtendedPropertyValidator defaultExtendedPropertyValidator =
			new DefaultExtendedPropertyValidator();

		ExtendedPropertyDefinition extendedPropertyDefinition =
			new ExtendedPropertyDefinition(
				"field", false, ExtendedPropertyDefinition.FieldType.TEXT,
				defaultExtendedPropertyValidator);

		defaultExtendedPropertyValidator.validate(
			extendedPropertyDefinition, "This is a valid text");
	}

	public static class InvalidClass implements Serializable {
	}

	public static class TestClass implements Serializable {

		public String getField1() {
			return _field1;
		}

		public String getField2() {
			return _field2;
		}

		public Long getField3() {
			return _field3;
		}

		public void setField1(String field1) {
			_field1 = field1;
		}

		public void setField2(String field2) {
			_field2 = field2;
		}

		public void setField3(Long field3) {
			_field3 = field3;
		}

		private String _field1;
		private String _field2;
		private Long _field3;

	}

}