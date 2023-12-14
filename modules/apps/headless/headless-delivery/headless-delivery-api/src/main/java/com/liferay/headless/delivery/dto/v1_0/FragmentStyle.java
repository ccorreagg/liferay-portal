/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.delivery.dto.v1_0;

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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "Represents a fragment style.", value = "FragmentStyle"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "FragmentStyle")
public class FragmentStyle implements Serializable {

	public static FragmentStyle toDTO(String json) {
		return ObjectMapperUtil.readValue(FragmentStyle.class, json);
	}

	public static FragmentStyle unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(FragmentStyle.class, json);
	}

	@Schema(description = "The fragment's background color.")
	public String getBackgroundColor() {
		if (backgroundColor != null) {
			return backgroundColor;
		}

		backgroundColor = _backgroundColorSupplier.get();

		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;

		_backgroundColorSupplier = () -> backgroundColor;
	}

	@JsonIgnore
	public void setBackgroundColor(
		UnsafeSupplier<String, Exception> backgroundColorUnsafeSupplier) {

		backgroundColor = null;

		_backgroundColorSupplier = () -> {
			try {
				return backgroundColorUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's background color.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String backgroundColor;

	private Supplier<String> _backgroundColorSupplier = () -> null;

	@Schema(description = "The fragment's background image.")
	@Valid
	public FragmentImage getBackgroundFragmentImage() {
		if (backgroundFragmentImage != null) {
			return backgroundFragmentImage;
		}

		backgroundFragmentImage = _backgroundFragmentImageSupplier.get();

		return backgroundFragmentImage;
	}

	public void setBackgroundFragmentImage(
		FragmentImage backgroundFragmentImage) {

		this.backgroundFragmentImage = backgroundFragmentImage;

		_backgroundFragmentImageSupplier = () -> backgroundFragmentImage;
	}

	@JsonIgnore
	public void setBackgroundFragmentImage(
		UnsafeSupplier<FragmentImage, Exception>
			backgroundFragmentImageUnsafeSupplier) {

		backgroundFragmentImage = null;

		_backgroundFragmentImageSupplier = () -> {
			try {
				return backgroundFragmentImageUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's background image.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected FragmentImage backgroundFragmentImage;

	private Supplier<FragmentImage> _backgroundFragmentImageSupplier =
		() -> null;

	@Schema(description = "The fragment's border color.")
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

	@GraphQLField(description = "The fragment's border color.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String borderColor;

	private Supplier<String> _borderColorSupplier = () -> null;

	@Schema(description = "The fragment's background radius.")
	public String getBorderRadius() {
		if (borderRadius != null) {
			return borderRadius;
		}

		borderRadius = _borderRadiusSupplier.get();

		return borderRadius;
	}

	public void setBorderRadius(String borderRadius) {
		this.borderRadius = borderRadius;

		_borderRadiusSupplier = () -> borderRadius;
	}

	@JsonIgnore
	public void setBorderRadius(
		UnsafeSupplier<String, Exception> borderRadiusUnsafeSupplier) {

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

	@GraphQLField(description = "The fragment's background radius.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String borderRadius;

	private Supplier<String> _borderRadiusSupplier = () -> null;

	@Schema(description = "The fragment's border width.")
	public String getBorderWidth() {
		if (borderWidth != null) {
			return borderWidth;
		}

		borderWidth = _borderWidthSupplier.get();

		return borderWidth;
	}

	public void setBorderWidth(String borderWidth) {
		this.borderWidth = borderWidth;

		_borderWidthSupplier = () -> borderWidth;
	}

	@JsonIgnore
	public void setBorderWidth(
		UnsafeSupplier<String, Exception> borderWidthUnsafeSupplier) {

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

	@GraphQLField(description = "The fragment's border width.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String borderWidth;

	private Supplier<String> _borderWidthSupplier = () -> null;

	@Schema(description = "The fragment's font family.")
	public String getFontFamily() {
		if (fontFamily != null) {
			return fontFamily;
		}

		fontFamily = _fontFamilySupplier.get();

		return fontFamily;
	}

	public void setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;

		_fontFamilySupplier = () -> fontFamily;
	}

	@JsonIgnore
	public void setFontFamily(
		UnsafeSupplier<String, Exception> fontFamilyUnsafeSupplier) {

		fontFamily = null;

		_fontFamilySupplier = () -> {
			try {
				return fontFamilyUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's font family.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String fontFamily;

	private Supplier<String> _fontFamilySupplier = () -> null;

	@Schema(description = "The fragment's font size.")
	public String getFontSize() {
		if (fontSize != null) {
			return fontSize;
		}

		fontSize = _fontSizeSupplier.get();

		return fontSize;
	}

	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;

		_fontSizeSupplier = () -> fontSize;
	}

	@JsonIgnore
	public void setFontSize(
		UnsafeSupplier<String, Exception> fontSizeUnsafeSupplier) {

		fontSize = null;

		_fontSizeSupplier = () -> {
			try {
				return fontSizeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's font size.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String fontSize;

	private Supplier<String> _fontSizeSupplier = () -> null;

	@Schema(description = "The fragment's font weight.")
	public String getFontWeight() {
		if (fontWeight != null) {
			return fontWeight;
		}

		fontWeight = _fontWeightSupplier.get();

		return fontWeight;
	}

	public void setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;

		_fontWeightSupplier = () -> fontWeight;
	}

	@JsonIgnore
	public void setFontWeight(
		UnsafeSupplier<String, Exception> fontWeightUnsafeSupplier) {

		fontWeight = null;

		_fontWeightSupplier = () -> {
			try {
				return fontWeightUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's font weight.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String fontWeight;

	private Supplier<String> _fontWeightSupplier = () -> null;

	@Schema(description = "The fragment's height.")
	public String getHeight() {
		if (height != null) {
			return height;
		}

		height = _heightSupplier.get();

		return height;
	}

	public void setHeight(String height) {
		this.height = height;

		_heightSupplier = () -> height;
	}

	@JsonIgnore
	public void setHeight(
		UnsafeSupplier<String, Exception> heightUnsafeSupplier) {

		height = null;

		_heightSupplier = () -> {
			try {
				return heightUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's height.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String height;

	private Supplier<String> _heightSupplier = () -> null;

	@Schema(description = "Specifies if the fragment is hidden to the user.")
	public Boolean getHidden() {
		if (hidden != null) {
			return hidden;
		}

		hidden = _hiddenSupplier.get();

		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;

		_hiddenSupplier = () -> hidden;
	}

	@JsonIgnore
	public void setHidden(
		UnsafeSupplier<Boolean, Exception> hiddenUnsafeSupplier) {

		hidden = null;

		_hiddenSupplier = () -> {
			try {
				return hiddenUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(
		description = "Specifies if the fragment is hidden to the user."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean hidden;

	private Supplier<Boolean> _hiddenSupplier = () -> null;

	@Schema(description = "The fragment's margin bottom.")
	public String getMarginBottom() {
		if (marginBottom != null) {
			return marginBottom;
		}

		marginBottom = _marginBottomSupplier.get();

		return marginBottom;
	}

	public void setMarginBottom(String marginBottom) {
		this.marginBottom = marginBottom;

		_marginBottomSupplier = () -> marginBottom;
	}

	@JsonIgnore
	public void setMarginBottom(
		UnsafeSupplier<String, Exception> marginBottomUnsafeSupplier) {

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

	@GraphQLField(description = "The fragment's margin bottom.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String marginBottom;

	private Supplier<String> _marginBottomSupplier = () -> null;

	@Schema(description = "The fragment's margin left.")
	public String getMarginLeft() {
		if (marginLeft != null) {
			return marginLeft;
		}

		marginLeft = _marginLeftSupplier.get();

		return marginLeft;
	}

	public void setMarginLeft(String marginLeft) {
		this.marginLeft = marginLeft;

		_marginLeftSupplier = () -> marginLeft;
	}

	@JsonIgnore
	public void setMarginLeft(
		UnsafeSupplier<String, Exception> marginLeftUnsafeSupplier) {

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

	@GraphQLField(description = "The fragment's margin left.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String marginLeft;

	private Supplier<String> _marginLeftSupplier = () -> null;

	@Schema(description = "The fragment's margin right.")
	public String getMarginRight() {
		if (marginRight != null) {
			return marginRight;
		}

		marginRight = _marginRightSupplier.get();

		return marginRight;
	}

	public void setMarginRight(String marginRight) {
		this.marginRight = marginRight;

		_marginRightSupplier = () -> marginRight;
	}

	@JsonIgnore
	public void setMarginRight(
		UnsafeSupplier<String, Exception> marginRightUnsafeSupplier) {

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

	@GraphQLField(description = "The fragment's margin right.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String marginRight;

	private Supplier<String> _marginRightSupplier = () -> null;

	@Schema(description = "The fragment's margin top.")
	public String getMarginTop() {
		if (marginTop != null) {
			return marginTop;
		}

		marginTop = _marginTopSupplier.get();

		return marginTop;
	}

	public void setMarginTop(String marginTop) {
		this.marginTop = marginTop;

		_marginTopSupplier = () -> marginTop;
	}

	@JsonIgnore
	public void setMarginTop(
		UnsafeSupplier<String, Exception> marginTopUnsafeSupplier) {

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

	@GraphQLField(description = "The fragment's margin top.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String marginTop;

	private Supplier<String> _marginTopSupplier = () -> null;

	@Schema(description = "The fragment's max height.")
	public String getMaxHeight() {
		if (maxHeight != null) {
			return maxHeight;
		}

		maxHeight = _maxHeightSupplier.get();

		return maxHeight;
	}

	public void setMaxHeight(String maxHeight) {
		this.maxHeight = maxHeight;

		_maxHeightSupplier = () -> maxHeight;
	}

	@JsonIgnore
	public void setMaxHeight(
		UnsafeSupplier<String, Exception> maxHeightUnsafeSupplier) {

		maxHeight = null;

		_maxHeightSupplier = () -> {
			try {
				return maxHeightUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's max height.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String maxHeight;

	private Supplier<String> _maxHeightSupplier = () -> null;

	@Schema(description = "The fragment's max width.")
	public String getMaxWidth() {
		if (maxWidth != null) {
			return maxWidth;
		}

		maxWidth = _maxWidthSupplier.get();

		return maxWidth;
	}

	public void setMaxWidth(String maxWidth) {
		this.maxWidth = maxWidth;

		_maxWidthSupplier = () -> maxWidth;
	}

	@JsonIgnore
	public void setMaxWidth(
		UnsafeSupplier<String, Exception> maxWidthUnsafeSupplier) {

		maxWidth = null;

		_maxWidthSupplier = () -> {
			try {
				return maxWidthUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's max width.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String maxWidth;

	private Supplier<String> _maxWidthSupplier = () -> null;

	@Schema(description = "The fragment's min height.")
	public String getMinHeight() {
		if (minHeight != null) {
			return minHeight;
		}

		minHeight = _minHeightSupplier.get();

		return minHeight;
	}

	public void setMinHeight(String minHeight) {
		this.minHeight = minHeight;

		_minHeightSupplier = () -> minHeight;
	}

	@JsonIgnore
	public void setMinHeight(
		UnsafeSupplier<String, Exception> minHeightUnsafeSupplier) {

		minHeight = null;

		_minHeightSupplier = () -> {
			try {
				return minHeightUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's min height.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String minHeight;

	private Supplier<String> _minHeightSupplier = () -> null;

	@Schema(description = "The fragment's min width.")
	public String getMinWidth() {
		if (minWidth != null) {
			return minWidth;
		}

		minWidth = _minWidthSupplier.get();

		return minWidth;
	}

	public void setMinWidth(String minWidth) {
		this.minWidth = minWidth;

		_minWidthSupplier = () -> minWidth;
	}

	@JsonIgnore
	public void setMinWidth(
		UnsafeSupplier<String, Exception> minWidthUnsafeSupplier) {

		minWidth = null;

		_minWidthSupplier = () -> {
			try {
				return minWidthUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's min width.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String minWidth;

	private Supplier<String> _minWidthSupplier = () -> null;

	@Schema(description = "The fragment's opacity.")
	public String getOpacity() {
		if (opacity != null) {
			return opacity;
		}

		opacity = _opacitySupplier.get();

		return opacity;
	}

	public void setOpacity(String opacity) {
		this.opacity = opacity;

		_opacitySupplier = () -> opacity;
	}

	@JsonIgnore
	public void setOpacity(
		UnsafeSupplier<String, Exception> opacityUnsafeSupplier) {

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

	@GraphQLField(description = "The fragment's opacity.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String opacity;

	private Supplier<String> _opacitySupplier = () -> null;

	@Schema(description = "The fragment's overflow behavior.")
	public String getOverflow() {
		if (overflow != null) {
			return overflow;
		}

		overflow = _overflowSupplier.get();

		return overflow;
	}

	public void setOverflow(String overflow) {
		this.overflow = overflow;

		_overflowSupplier = () -> overflow;
	}

	@JsonIgnore
	public void setOverflow(
		UnsafeSupplier<String, Exception> overflowUnsafeSupplier) {

		overflow = null;

		_overflowSupplier = () -> {
			try {
				return overflowUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's overflow behavior.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String overflow;

	private Supplier<String> _overflowSupplier = () -> null;

	@Schema(description = "The fragment's padding bottom.")
	public String getPaddingBottom() {
		if (paddingBottom != null) {
			return paddingBottom;
		}

		paddingBottom = _paddingBottomSupplier.get();

		return paddingBottom;
	}

	public void setPaddingBottom(String paddingBottom) {
		this.paddingBottom = paddingBottom;

		_paddingBottomSupplier = () -> paddingBottom;
	}

	@JsonIgnore
	public void setPaddingBottom(
		UnsafeSupplier<String, Exception> paddingBottomUnsafeSupplier) {

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

	@GraphQLField(description = "The fragment's padding bottom.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String paddingBottom;

	private Supplier<String> _paddingBottomSupplier = () -> null;

	@Schema(description = "The fragment's padding left.")
	public String getPaddingLeft() {
		if (paddingLeft != null) {
			return paddingLeft;
		}

		paddingLeft = _paddingLeftSupplier.get();

		return paddingLeft;
	}

	public void setPaddingLeft(String paddingLeft) {
		this.paddingLeft = paddingLeft;

		_paddingLeftSupplier = () -> paddingLeft;
	}

	@JsonIgnore
	public void setPaddingLeft(
		UnsafeSupplier<String, Exception> paddingLeftUnsafeSupplier) {

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

	@GraphQLField(description = "The fragment's padding left.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String paddingLeft;

	private Supplier<String> _paddingLeftSupplier = () -> null;

	@Schema(description = "The fragment's padding right.")
	public String getPaddingRight() {
		if (paddingRight != null) {
			return paddingRight;
		}

		paddingRight = _paddingRightSupplier.get();

		return paddingRight;
	}

	public void setPaddingRight(String paddingRight) {
		this.paddingRight = paddingRight;

		_paddingRightSupplier = () -> paddingRight;
	}

	@JsonIgnore
	public void setPaddingRight(
		UnsafeSupplier<String, Exception> paddingRightUnsafeSupplier) {

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

	@GraphQLField(description = "The fragment's padding right.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String paddingRight;

	private Supplier<String> _paddingRightSupplier = () -> null;

	@Schema(description = "The fragment's padding top.")
	public String getPaddingTop() {
		if (paddingTop != null) {
			return paddingTop;
		}

		paddingTop = _paddingTopSupplier.get();

		return paddingTop;
	}

	public void setPaddingTop(String paddingTop) {
		this.paddingTop = paddingTop;

		_paddingTopSupplier = () -> paddingTop;
	}

	@JsonIgnore
	public void setPaddingTop(
		UnsafeSupplier<String, Exception> paddingTopUnsafeSupplier) {

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

	@GraphQLField(description = "The fragment's padding top.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String paddingTop;

	private Supplier<String> _paddingTopSupplier = () -> null;

	@Schema(description = "The fragment's shadow effect.")
	public String getShadow() {
		if (shadow != null) {
			return shadow;
		}

		shadow = _shadowSupplier.get();

		return shadow;
	}

	public void setShadow(String shadow) {
		this.shadow = shadow;

		_shadowSupplier = () -> shadow;
	}

	@JsonIgnore
	public void setShadow(
		UnsafeSupplier<String, Exception> shadowUnsafeSupplier) {

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

	@GraphQLField(description = "The fragment's shadow effect.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String shadow;

	private Supplier<String> _shadowSupplier = () -> null;

	@Schema(description = "The fragment's text align.")
	public String getTextAlign() {
		if (textAlign != null) {
			return textAlign;
		}

		textAlign = _textAlignSupplier.get();

		return textAlign;
	}

	public void setTextAlign(String textAlign) {
		this.textAlign = textAlign;

		_textAlignSupplier = () -> textAlign;
	}

	@JsonIgnore
	public void setTextAlign(
		UnsafeSupplier<String, Exception> textAlignUnsafeSupplier) {

		textAlign = null;

		_textAlignSupplier = () -> {
			try {
				return textAlignUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's text align.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String textAlign;

	private Supplier<String> _textAlignSupplier = () -> null;

	@Schema(description = "The fragment's text color.")
	public String getTextColor() {
		if (textColor != null) {
			return textColor;
		}

		textColor = _textColorSupplier.get();

		return textColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;

		_textColorSupplier = () -> textColor;
	}

	@JsonIgnore
	public void setTextColor(
		UnsafeSupplier<String, Exception> textColorUnsafeSupplier) {

		textColor = null;

		_textColorSupplier = () -> {
			try {
				return textColorUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's text color.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String textColor;

	private Supplier<String> _textColorSupplier = () -> null;

	@Schema(description = "The fragment's width.")
	public String getWidth() {
		if (width != null) {
			return width;
		}

		width = _widthSupplier.get();

		return width;
	}

	public void setWidth(String width) {
		this.width = width;

		_widthSupplier = () -> width;
	}

	@JsonIgnore
	public void setWidth(
		UnsafeSupplier<String, Exception> widthUnsafeSupplier) {

		width = null;

		_widthSupplier = () -> {
			try {
				return widthUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment's width.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String width;

	private Supplier<String> _widthSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FragmentStyle)) {
			return false;
		}

		FragmentStyle fragmentStyle = (FragmentStyle)object;

		return Objects.equals(toString(), fragmentStyle.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (backgroundColor != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"backgroundColor\": ");

			sb.append("\"");

			sb.append(_escape(backgroundColor));

			sb.append("\"");
		}

		if (backgroundFragmentImage != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"backgroundFragmentImage\": ");

			sb.append(String.valueOf(backgroundFragmentImage));
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

			sb.append(_escape(borderRadius));

			sb.append("\"");
		}

		if (borderWidth != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"borderWidth\": ");

			sb.append("\"");

			sb.append(_escape(borderWidth));

			sb.append("\"");
		}

		if (fontFamily != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fontFamily\": ");

			sb.append("\"");

			sb.append(_escape(fontFamily));

			sb.append("\"");
		}

		if (fontSize != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fontSize\": ");

			sb.append("\"");

			sb.append(_escape(fontSize));

			sb.append("\"");
		}

		if (fontWeight != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fontWeight\": ");

			sb.append("\"");

			sb.append(_escape(fontWeight));

			sb.append("\"");
		}

		if (height != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"height\": ");

			sb.append("\"");

			sb.append(_escape(height));

			sb.append("\"");
		}

		if (hidden != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"hidden\": ");

			sb.append(hidden);
		}

		if (marginBottom != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"marginBottom\": ");

			sb.append("\"");

			sb.append(_escape(marginBottom));

			sb.append("\"");
		}

		if (marginLeft != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"marginLeft\": ");

			sb.append("\"");

			sb.append(_escape(marginLeft));

			sb.append("\"");
		}

		if (marginRight != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"marginRight\": ");

			sb.append("\"");

			sb.append(_escape(marginRight));

			sb.append("\"");
		}

		if (marginTop != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"marginTop\": ");

			sb.append("\"");

			sb.append(_escape(marginTop));

			sb.append("\"");
		}

		if (maxHeight != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"maxHeight\": ");

			sb.append("\"");

			sb.append(_escape(maxHeight));

			sb.append("\"");
		}

		if (maxWidth != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"maxWidth\": ");

			sb.append("\"");

			sb.append(_escape(maxWidth));

			sb.append("\"");
		}

		if (minHeight != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"minHeight\": ");

			sb.append("\"");

			sb.append(_escape(minHeight));

			sb.append("\"");
		}

		if (minWidth != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"minWidth\": ");

			sb.append("\"");

			sb.append(_escape(minWidth));

			sb.append("\"");
		}

		if (opacity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"opacity\": ");

			sb.append("\"");

			sb.append(_escape(opacity));

			sb.append("\"");
		}

		if (overflow != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"overflow\": ");

			sb.append("\"");

			sb.append(_escape(overflow));

			sb.append("\"");
		}

		if (paddingBottom != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paddingBottom\": ");

			sb.append("\"");

			sb.append(_escape(paddingBottom));

			sb.append("\"");
		}

		if (paddingLeft != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paddingLeft\": ");

			sb.append("\"");

			sb.append(_escape(paddingLeft));

			sb.append("\"");
		}

		if (paddingRight != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paddingRight\": ");

			sb.append("\"");

			sb.append(_escape(paddingRight));

			sb.append("\"");
		}

		if (paddingTop != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paddingTop\": ");

			sb.append("\"");

			sb.append(_escape(paddingTop));

			sb.append("\"");
		}

		if (shadow != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shadow\": ");

			sb.append("\"");

			sb.append(_escape(shadow));

			sb.append("\"");
		}

		if (textAlign != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"textAlign\": ");

			sb.append("\"");

			sb.append(_escape(textAlign));

			sb.append("\"");
		}

		if (textColor != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"textColor\": ");

			sb.append("\"");

			sb.append(_escape(textColor));

			sb.append("\"");
		}

		if (width != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"width\": ");

			sb.append("\"");

			sb.append(_escape(width));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.delivery.dto.v1_0.FragmentStyle",
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