/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.delivery.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName(description = "the page section's layout.", value = "Layout")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Layout")
public class Layout implements Serializable {

	public static Layout toDTO(String json) {
		return ObjectMapperUtil.readValue(Layout.class, json);
	}

	public static Layout unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Layout.class, json);
	}

	@Schema(deprecated = true)
	@Valid
	public Align getAlign() {
		if (align != null) {
			return align;
		}

		align = _alignSupplier.get();

		return align;
	}

	@JsonIgnore
	public String getAlignAsString() {
		if (align == null) {
			return null;
		}

		return align.toString();
	}

	public void setAlign(Align align) {
		this.align = align;

		_alignSupplier = () -> align;
	}

	@JsonIgnore
	public void setAlign(UnsafeSupplier<Align, Exception> alignUnsafeSupplier) {
		align = null;

		_alignSupplier = () -> {
			try {
				return alignUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Align align;

	private Supplier<Align> _alignSupplier = () -> null;

	@Schema(deprecated = true)
	public String getBorderColor() {
		if (borderColor != null) {
			return borderColor;
		}

		borderColor = _borderColorSupplier.get();

		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;

		_borderColorSupplier = () -> borderColor;
	}

	@JsonIgnore
	public void setBorderColor(
		UnsafeSupplier<String, Exception> borderColorUnsafeSupplier) {

		borderColor = null;

		_borderColorSupplier = () -> {
			try {
				return borderColorUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String borderColor;

	private Supplier<String> _borderColorSupplier = () -> null;

	@Schema(deprecated = true)
	@Valid
	public BorderRadius getBorderRadius() {
		if (borderRadius != null) {
			return borderRadius;
		}

		borderRadius = _borderRadiusSupplier.get();

		return borderRadius;
	}

	@JsonIgnore
	public String getBorderRadiusAsString() {
		if (borderRadius == null) {
			return null;
		}

		return borderRadius.toString();
	}

	public void setBorderRadius(BorderRadius borderRadius) {
		this.borderRadius = borderRadius;

		_borderRadiusSupplier = () -> borderRadius;
	}

	@JsonIgnore
	public void setBorderRadius(
		UnsafeSupplier<BorderRadius, Exception> borderRadiusUnsafeSupplier) {

		borderRadius = null;

		_borderRadiusSupplier = () -> {
			try {
				return borderRadiusUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected BorderRadius borderRadius;

	private Supplier<BorderRadius> _borderRadiusSupplier = () -> null;

	@Schema(deprecated = true)
	public Integer getBorderWidth() {
		if (borderWidth != null) {
			return borderWidth;
		}

		borderWidth = _borderWidthSupplier.get();

		return borderWidth;
	}

	public void setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;

		_borderWidthSupplier = () -> borderWidth;
	}

	@JsonIgnore
	public void setBorderWidth(
		UnsafeSupplier<Integer, Exception> borderWidthUnsafeSupplier) {

		borderWidth = null;

		_borderWidthSupplier = () -> {
			try {
				return borderWidthUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer borderWidth;

	private Supplier<Integer> _borderWidthSupplier = () -> null;

	@Schema(description = "The container's type (fixed or fluid).")
	@Valid
	public ContainerType getContainerType() {
		if (containerType != null) {
			return containerType;
		}

		containerType = _containerTypeSupplier.get();

		return containerType;
	}

	@JsonIgnore
	public String getContainerTypeAsString() {
		if (containerType == null) {
			return null;
		}

		return containerType.toString();
	}

	public void setContainerType(ContainerType containerType) {
		this.containerType = containerType;

		_containerTypeSupplier = () -> containerType;
	}

	@JsonIgnore
	public void setContainerType(
		UnsafeSupplier<ContainerType, Exception> containerTypeUnsafeSupplier) {

		containerType = null;

		_containerTypeSupplier = () -> {
			try {
				return containerTypeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The container's type (fixed or fluid).")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected ContainerType containerType;

	private Supplier<ContainerType> _containerTypeSupplier = () -> null;

	@Schema(deprecated = true)
	@Valid
	public ContentDisplay getContentDisplay() {
		if (contentDisplay != null) {
			return contentDisplay;
		}

		contentDisplay = _contentDisplaySupplier.get();

		return contentDisplay;
	}

	@JsonIgnore
	public String getContentDisplayAsString() {
		if (contentDisplay == null) {
			return null;
		}

		return contentDisplay.toString();
	}

	public void setContentDisplay(ContentDisplay contentDisplay) {
		this.contentDisplay = contentDisplay;

		_contentDisplaySupplier = () -> contentDisplay;
	}

	@JsonIgnore
	public void setContentDisplay(
		UnsafeSupplier<ContentDisplay, Exception>
			contentDisplayUnsafeSupplier) {

		contentDisplay = null;

		_contentDisplaySupplier = () -> {
			try {
				return contentDisplayUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected ContentDisplay contentDisplay;

	private Supplier<ContentDisplay> _contentDisplaySupplier = () -> null;

	@Schema
	@Valid
	public FlexWrap getFlexWrap() {
		if (flexWrap != null) {
			return flexWrap;
		}

		flexWrap = _flexWrapSupplier.get();

		return flexWrap;
	}

	@JsonIgnore
	public String getFlexWrapAsString() {
		if (flexWrap == null) {
			return null;
		}

		return flexWrap.toString();
	}

	public void setFlexWrap(FlexWrap flexWrap) {
		this.flexWrap = flexWrap;

		_flexWrapSupplier = () -> flexWrap;
	}

	@JsonIgnore
	public void setFlexWrap(
		UnsafeSupplier<FlexWrap, Exception> flexWrapUnsafeSupplier) {

		flexWrap = null;

		_flexWrapSupplier = () -> {
			try {
				return flexWrapUnsafeSupplier.get();
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
	protected FlexWrap flexWrap;

	private Supplier<FlexWrap> _flexWrapSupplier = () -> null;

	@Schema(deprecated = true)
	@Valid
	public Justify getJustify() {
		if (justify != null) {
			return justify;
		}

		justify = _justifySupplier.get();

		return justify;
	}

	@JsonIgnore
	public String getJustifyAsString() {
		if (justify == null) {
			return null;
		}

		return justify.toString();
	}

	public void setJustify(Justify justify) {
		this.justify = justify;

		_justifySupplier = () -> justify;
	}

	@JsonIgnore
	public void setJustify(
		UnsafeSupplier<Justify, Exception> justifyUnsafeSupplier) {

		justify = null;

		_justifySupplier = () -> {
			try {
				return justifyUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Justify justify;

	private Supplier<Justify> _justifySupplier = () -> null;

	@Schema(deprecated = true)
	public Integer getMarginBottom() {
		if (marginBottom != null) {
			return marginBottom;
		}

		marginBottom = _marginBottomSupplier.get();

		return marginBottom;
	}

	public void setMarginBottom(Integer marginBottom) {
		this.marginBottom = marginBottom;

		_marginBottomSupplier = () -> marginBottom;
	}

	@JsonIgnore
	public void setMarginBottom(
		UnsafeSupplier<Integer, Exception> marginBottomUnsafeSupplier) {

		marginBottom = null;

		_marginBottomSupplier = () -> {
			try {
				return marginBottomUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer marginBottom;

	private Supplier<Integer> _marginBottomSupplier = () -> null;

	@Schema(deprecated = true)
	public Integer getMarginLeft() {
		if (marginLeft != null) {
			return marginLeft;
		}

		marginLeft = _marginLeftSupplier.get();

		return marginLeft;
	}

	public void setMarginLeft(Integer marginLeft) {
		this.marginLeft = marginLeft;

		_marginLeftSupplier = () -> marginLeft;
	}

	@JsonIgnore
	public void setMarginLeft(
		UnsafeSupplier<Integer, Exception> marginLeftUnsafeSupplier) {

		marginLeft = null;

		_marginLeftSupplier = () -> {
			try {
				return marginLeftUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer marginLeft;

	private Supplier<Integer> _marginLeftSupplier = () -> null;

	@Schema(deprecated = true)
	public Integer getMarginRight() {
		if (marginRight != null) {
			return marginRight;
		}

		marginRight = _marginRightSupplier.get();

		return marginRight;
	}

	public void setMarginRight(Integer marginRight) {
		this.marginRight = marginRight;

		_marginRightSupplier = () -> marginRight;
	}

	@JsonIgnore
	public void setMarginRight(
		UnsafeSupplier<Integer, Exception> marginRightUnsafeSupplier) {

		marginRight = null;

		_marginRightSupplier = () -> {
			try {
				return marginRightUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer marginRight;

	private Supplier<Integer> _marginRightSupplier = () -> null;

	@Schema(deprecated = true)
	public Integer getMarginTop() {
		if (marginTop != null) {
			return marginTop;
		}

		marginTop = _marginTopSupplier.get();

		return marginTop;
	}

	public void setMarginTop(Integer marginTop) {
		this.marginTop = marginTop;

		_marginTopSupplier = () -> marginTop;
	}

	@JsonIgnore
	public void setMarginTop(
		UnsafeSupplier<Integer, Exception> marginTopUnsafeSupplier) {

		marginTop = null;

		_marginTopSupplier = () -> {
			try {
				return marginTopUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer marginTop;

	private Supplier<Integer> _marginTopSupplier = () -> null;

	@Schema(deprecated = true)
	public Integer getOpacity() {
		if (opacity != null) {
			return opacity;
		}

		opacity = _opacitySupplier.get();

		return opacity;
	}

	public void setOpacity(Integer opacity) {
		this.opacity = opacity;

		_opacitySupplier = () -> opacity;
	}

	@JsonIgnore
	public void setOpacity(
		UnsafeSupplier<Integer, Exception> opacityUnsafeSupplier) {

		opacity = null;

		_opacitySupplier = () -> {
			try {
				return opacityUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer opacity;

	private Supplier<Integer> _opacitySupplier = () -> null;

	@Schema(deprecated = true)
	public Integer getPaddingBottom() {
		if (paddingBottom != null) {
			return paddingBottom;
		}

		paddingBottom = _paddingBottomSupplier.get();

		return paddingBottom;
	}

	public void setPaddingBottom(Integer paddingBottom) {
		this.paddingBottom = paddingBottom;

		_paddingBottomSupplier = () -> paddingBottom;
	}

	@JsonIgnore
	public void setPaddingBottom(
		UnsafeSupplier<Integer, Exception> paddingBottomUnsafeSupplier) {

		paddingBottom = null;

		_paddingBottomSupplier = () -> {
			try {
				return paddingBottomUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer paddingBottom;

	private Supplier<Integer> _paddingBottomSupplier = () -> null;

	@Schema(deprecated = true)
	public Integer getPaddingHorizontal() {
		if (paddingHorizontal != null) {
			return paddingHorizontal;
		}

		paddingHorizontal = _paddingHorizontalSupplier.get();

		return paddingHorizontal;
	}

	public void setPaddingHorizontal(Integer paddingHorizontal) {
		this.paddingHorizontal = paddingHorizontal;

		_paddingHorizontalSupplier = () -> paddingHorizontal;
	}

	@JsonIgnore
	public void setPaddingHorizontal(
		UnsafeSupplier<Integer, Exception> paddingHorizontalUnsafeSupplier) {

		paddingHorizontal = null;

		_paddingHorizontalSupplier = () -> {
			try {
				return paddingHorizontalUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer paddingHorizontal;

	private Supplier<Integer> _paddingHorizontalSupplier = () -> null;

	@Schema(deprecated = true)
	public Integer getPaddingLeft() {
		if (paddingLeft != null) {
			return paddingLeft;
		}

		paddingLeft = _paddingLeftSupplier.get();

		return paddingLeft;
	}

	public void setPaddingLeft(Integer paddingLeft) {
		this.paddingLeft = paddingLeft;

		_paddingLeftSupplier = () -> paddingLeft;
	}

	@JsonIgnore
	public void setPaddingLeft(
		UnsafeSupplier<Integer, Exception> paddingLeftUnsafeSupplier) {

		paddingLeft = null;

		_paddingLeftSupplier = () -> {
			try {
				return paddingLeftUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer paddingLeft;

	private Supplier<Integer> _paddingLeftSupplier = () -> null;

	@Schema(deprecated = true)
	public Integer getPaddingRight() {
		if (paddingRight != null) {
			return paddingRight;
		}

		paddingRight = _paddingRightSupplier.get();

		return paddingRight;
	}

	public void setPaddingRight(Integer paddingRight) {
		this.paddingRight = paddingRight;

		_paddingRightSupplier = () -> paddingRight;
	}

	@JsonIgnore
	public void setPaddingRight(
		UnsafeSupplier<Integer, Exception> paddingRightUnsafeSupplier) {

		paddingRight = null;

		_paddingRightSupplier = () -> {
			try {
				return paddingRightUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer paddingRight;

	private Supplier<Integer> _paddingRightSupplier = () -> null;

	@Schema(deprecated = true)
	public Integer getPaddingTop() {
		if (paddingTop != null) {
			return paddingTop;
		}

		paddingTop = _paddingTopSupplier.get();

		return paddingTop;
	}

	public void setPaddingTop(Integer paddingTop) {
		this.paddingTop = paddingTop;

		_paddingTopSupplier = () -> paddingTop;
	}

	@JsonIgnore
	public void setPaddingTop(
		UnsafeSupplier<Integer, Exception> paddingTopUnsafeSupplier) {

		paddingTop = null;

		_paddingTopSupplier = () -> {
			try {
				return paddingTopUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer paddingTop;

	private Supplier<Integer> _paddingTopSupplier = () -> null;

	@Schema(deprecated = true)
	@Valid
	public Shadow getShadow() {
		if (shadow != null) {
			return shadow;
		}

		shadow = _shadowSupplier.get();

		return shadow;
	}

	@JsonIgnore
	public String getShadowAsString() {
		if (shadow == null) {
			return null;
		}

		return shadow.toString();
	}

	public void setShadow(Shadow shadow) {
		this.shadow = shadow;

		_shadowSupplier = () -> shadow;
	}

	@JsonIgnore
	public void setShadow(
		UnsafeSupplier<Shadow, Exception> shadowUnsafeSupplier) {

		shadow = null;

		_shadowSupplier = () -> {
			try {
				return shadowUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@Deprecated
	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Shadow shadow;

	private Supplier<Shadow> _shadowSupplier = () -> null;

	@Schema(description = "The width's type (fixed or fluid).")
	@Valid
	public WidthType getWidthType() {
		if (widthType != null) {
			return widthType;
		}

		widthType = _widthTypeSupplier.get();

		return widthType;
	}

	@JsonIgnore
	public String getWidthTypeAsString() {
		if (widthType == null) {
			return null;
		}

		return widthType.toString();
	}

	public void setWidthType(WidthType widthType) {
		this.widthType = widthType;

		_widthTypeSupplier = () -> widthType;
	}

	@JsonIgnore
	public void setWidthType(
		UnsafeSupplier<WidthType, Exception> widthTypeUnsafeSupplier) {

		widthType = null;

		_widthTypeSupplier = () -> {
			try {
				return widthTypeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The width's type (fixed or fluid).")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected WidthType widthType;

	private Supplier<WidthType> _widthTypeSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Layout)) {
			return false;
		}

		Layout layout = (Layout)object;

		return Objects.equals(toString(), layout.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (align != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"align\": ");

			sb.append("\"");

			sb.append(align);

			sb.append("\"");
		}

		if (borderColor != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"borderColor\": ");

			sb.append("\"");

			sb.append(_escape(borderColor));

			sb.append("\"");
		}

		if (borderRadius != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"borderRadius\": ");

			sb.append("\"");

			sb.append(borderRadius);

			sb.append("\"");
		}

		if (borderWidth != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"borderWidth\": ");

			sb.append(borderWidth);
		}

		if (containerType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"containerType\": ");

			sb.append("\"");

			sb.append(containerType);

			sb.append("\"");
		}

		if (contentDisplay != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"contentDisplay\": ");

			sb.append("\"");

			sb.append(contentDisplay);

			sb.append("\"");
		}

		if (flexWrap != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"flexWrap\": ");

			sb.append("\"");

			sb.append(flexWrap);

			sb.append("\"");
		}

		if (justify != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"justify\": ");

			sb.append("\"");

			sb.append(justify);

			sb.append("\"");
		}

		if (marginBottom != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"marginBottom\": ");

			sb.append(marginBottom);
		}

		if (marginLeft != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"marginLeft\": ");

			sb.append(marginLeft);
		}

		if (marginRight != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"marginRight\": ");

			sb.append(marginRight);
		}

		if (marginTop != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"marginTop\": ");

			sb.append(marginTop);
		}

		if (opacity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"opacity\": ");

			sb.append(opacity);
		}

		if (paddingBottom != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paddingBottom\": ");

			sb.append(paddingBottom);
		}

		if (paddingHorizontal != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paddingHorizontal\": ");

			sb.append(paddingHorizontal);
		}

		if (paddingLeft != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paddingLeft\": ");

			sb.append(paddingLeft);
		}

		if (paddingRight != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paddingRight\": ");

			sb.append(paddingRight);
		}

		if (paddingTop != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paddingTop\": ");

			sb.append(paddingTop);
		}

		if (shadow != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shadow\": ");

			sb.append("\"");

			sb.append(shadow);

			sb.append("\"");
		}

		if (widthType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"widthType\": ");

			sb.append("\"");

			sb.append(widthType);

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.delivery.dto.v1_0.Layout",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("Align")
	public static enum Align {

		BASELINE("Baseline"), CENTER("Center"), END("End"), NONE("None"),
		START("Start"), STRETCH("Stretch");

		@JsonCreator
		public static Align create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (Align align : values()) {
				if (Objects.equals(align.getValue(), value)) {
					return align;
				}
			}

			throw new IllegalArgumentException("Invalid enum value: " + value);
		}

		@JsonValue
		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private Align(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("BorderRadius")
	public static enum BorderRadius {

		CIRCLE("Circle"), LARGE("Large"), NONE("None"), PILL("Pill"),
		REGULAR("Regular");

		@JsonCreator
		public static BorderRadius create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (BorderRadius borderRadius : values()) {
				if (Objects.equals(borderRadius.getValue(), value)) {
					return borderRadius;
				}
			}

			throw new IllegalArgumentException("Invalid enum value: " + value);
		}

		@JsonValue
		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private BorderRadius(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("ContainerType")
	public static enum ContainerType {

		FIXED("Fixed"), FLUID("Fluid");

		@JsonCreator
		public static ContainerType create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (ContainerType containerType : values()) {
				if (Objects.equals(containerType.getValue(), value)) {
					return containerType;
				}
			}

			throw new IllegalArgumentException("Invalid enum value: " + value);
		}

		@JsonValue
		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private ContainerType(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("ContentDisplay")
	public static enum ContentDisplay {

		BLOCK("Block"), FLEX_COLUMN("FlexColumn"), FLEX_ROW("FlexRow");

		@JsonCreator
		public static ContentDisplay create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (ContentDisplay contentDisplay : values()) {
				if (Objects.equals(contentDisplay.getValue(), value)) {
					return contentDisplay;
				}
			}

			throw new IllegalArgumentException("Invalid enum value: " + value);
		}

		@JsonValue
		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private ContentDisplay(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("FlexWrap")
	public static enum FlexWrap {

		NO_WRAP("NoWrap"), WRAP("Wrap"), WRAP_REVERSE("WrapReverse");

		@JsonCreator
		public static FlexWrap create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (FlexWrap flexWrap : values()) {
				if (Objects.equals(flexWrap.getValue(), value)) {
					return flexWrap;
				}
			}

			throw new IllegalArgumentException("Invalid enum value: " + value);
		}

		@JsonValue
		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private FlexWrap(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("Justify")
	public static enum Justify {

		CENTER("Center"), END("End"), NONE("None"), SPACE_AROUND("SpaceAround"),
		SPACE_BETWEEN("SpaceBetween"), START("Start");

		@JsonCreator
		public static Justify create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (Justify justify : values()) {
				if (Objects.equals(justify.getValue(), value)) {
					return justify;
				}
			}

			throw new IllegalArgumentException("Invalid enum value: " + value);
		}

		@JsonValue
		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private Justify(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("Shadow")
	public static enum Shadow {

		DEFAULT("Default"), LARGE("Large"), NONE("None"), REGULAR("Regular"),
		SMALL("Small");

		@JsonCreator
		public static Shadow create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (Shadow shadow : values()) {
				if (Objects.equals(shadow.getValue(), value)) {
					return shadow;
				}
			}

			throw new IllegalArgumentException("Invalid enum value: " + value);
		}

		@JsonValue
		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private Shadow(String value) {
			_value = value;
		}

		private final String _value;

	}

	@GraphQLName("WidthType")
	public static enum WidthType {

		FIXED("Fixed"), FLUID("Fluid");

		@JsonCreator
		public static WidthType create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (WidthType widthType : values()) {
				if (Objects.equals(widthType.getValue(), value)) {
					return widthType;
				}
			}

			throw new IllegalArgumentException("Invalid enum value: " + value);
		}

		@JsonValue
		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private WidthType(String value) {
			_value = value;
		}

		private final String _value;

	}

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