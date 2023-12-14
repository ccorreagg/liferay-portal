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
@GraphQLName(
	description = "Represents a definition of a Page Collection.",
	value = "PageCollectionDefinition"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "PageCollectionDefinition")
public class PageCollectionDefinition implements Serializable {

	public static PageCollectionDefinition toDTO(String json) {
		return ObjectMapperUtil.readValue(PageCollectionDefinition.class, json);
	}

	public static PageCollectionDefinition unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			PageCollectionDefinition.class, json);
	}

	@Schema
	@Valid
	public CollectionConfig getCollectionConfig() {
		if (collectionConfig != null) {
			return collectionConfig;
		}

		collectionConfig = _collectionConfigSupplier.get();

		return collectionConfig;
	}

	public void setCollectionConfig(CollectionConfig collectionConfig) {
		this.collectionConfig = collectionConfig;

		_collectionConfigSupplier = () -> collectionConfig;
	}

	@JsonIgnore
	public void setCollectionConfig(
		UnsafeSupplier<CollectionConfig, Exception>
			collectionConfigUnsafeSupplier) {

		collectionConfig = null;

		_collectionConfigSupplier = () -> {
			try {
				return collectionConfigUnsafeSupplier.get();
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
	protected CollectionConfig collectionConfig;

	private Supplier<CollectionConfig> _collectionConfigSupplier = () -> null;

	@Schema(description = "A list of viewports of the page collection.")
	@Valid
	public CollectionViewport[] getCollectionViewports() {
		if (collectionViewports != null) {
			return collectionViewports;
		}

		collectionViewports = _collectionViewportsSupplier.get();

		return collectionViewports;
	}

	public void setCollectionViewports(
		CollectionViewport[] collectionViewports) {

		this.collectionViewports = collectionViewports;

		_collectionViewportsSupplier = () -> collectionViewports;
	}

	@JsonIgnore
	public void setCollectionViewports(
		UnsafeSupplier<CollectionViewport[], Exception>
			collectionViewportsUnsafeSupplier) {

		collectionViewports = null;

		_collectionViewportsSupplier = () -> {
			try {
				return collectionViewportsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "A list of viewports of the page collection.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected CollectionViewport[] collectionViewports;

	private Supplier<CollectionViewport[]> _collectionViewportsSupplier =
		() -> null;

	@Schema(
		description = "Whether to show all items when pagination is disabled."
	)
	public Boolean getDisplayAllItems() {
		if (displayAllItems != null) {
			return displayAllItems;
		}

		displayAllItems = _displayAllItemsSupplier.get();

		return displayAllItems;
	}

	public void setDisplayAllItems(Boolean displayAllItems) {
		this.displayAllItems = displayAllItems;

		_displayAllItemsSupplier = () -> displayAllItems;
	}

	@JsonIgnore
	public void setDisplayAllItems(
		UnsafeSupplier<Boolean, Exception> displayAllItemsUnsafeSupplier) {

		displayAllItems = null;

		_displayAllItemsSupplier = () -> {
			try {
				return displayAllItemsUnsafeSupplier.get();
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
		description = "Whether to show all items when pagination is disabled."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean displayAllItems;

	private Supplier<Boolean> _displayAllItemsSupplier = () -> null;

	@Schema(
		description = "Whether to show all pages when pagination is enabled."
	)
	public Boolean getDisplayAllPages() {
		if (displayAllPages != null) {
			return displayAllPages;
		}

		displayAllPages = _displayAllPagesSupplier.get();

		return displayAllPages;
	}

	public void setDisplayAllPages(Boolean displayAllPages) {
		this.displayAllPages = displayAllPages;

		_displayAllPagesSupplier = () -> displayAllPages;
	}

	@JsonIgnore
	public void setDisplayAllPages(
		UnsafeSupplier<Boolean, Exception> displayAllPagesUnsafeSupplier) {

		displayAllPages = null;

		_displayAllPagesSupplier = () -> {
			try {
				return displayAllPagesUnsafeSupplier.get();
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
		description = "Whether to show all pages when pagination is enabled."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean displayAllPages;

	private Supplier<Boolean> _displayAllPagesSupplier = () -> null;

	@Schema
	@Valid
	public EmptyCollectionConfig getEmptyCollectionConfig() {
		if (emptyCollectionConfig != null) {
			return emptyCollectionConfig;
		}

		emptyCollectionConfig = _emptyCollectionConfigSupplier.get();

		return emptyCollectionConfig;
	}

	public void setEmptyCollectionConfig(
		EmptyCollectionConfig emptyCollectionConfig) {

		this.emptyCollectionConfig = emptyCollectionConfig;

		_emptyCollectionConfigSupplier = () -> emptyCollectionConfig;
	}

	@JsonIgnore
	public void setEmptyCollectionConfig(
		UnsafeSupplier<EmptyCollectionConfig, Exception>
			emptyCollectionConfigUnsafeSupplier) {

		emptyCollectionConfig = null;

		_emptyCollectionConfigSupplier = () -> {
			try {
				return emptyCollectionConfigUnsafeSupplier.get();
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
	protected EmptyCollectionConfig emptyCollectionConfig;

	private Supplier<EmptyCollectionConfig> _emptyCollectionConfigSupplier =
		() -> null;

	@Schema(description = "The fragment style of the page collection.")
	@Valid
	public FragmentStyle getFragmentStyle() {
		if (fragmentStyle != null) {
			return fragmentStyle;
		}

		fragmentStyle = _fragmentStyleSupplier.get();

		return fragmentStyle;
	}

	public void setFragmentStyle(FragmentStyle fragmentStyle) {
		this.fragmentStyle = fragmentStyle;

		_fragmentStyleSupplier = () -> fragmentStyle;
	}

	@JsonIgnore
	public void setFragmentStyle(
		UnsafeSupplier<FragmentStyle, Exception> fragmentStyleUnsafeSupplier) {

		fragmentStyle = null;

		_fragmentStyleSupplier = () -> {
			try {
				return fragmentStyleUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The fragment style of the page collection.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected FragmentStyle fragmentStyle;

	private Supplier<FragmentStyle> _fragmentStyleSupplier = () -> null;

	@Schema(description = "The fragment viewports of the page collection.")
	@Valid
	public FragmentViewport[] getFragmentViewports() {
		if (fragmentViewports != null) {
			return fragmentViewports;
		}

		fragmentViewports = _fragmentViewportsSupplier.get();

		return fragmentViewports;
	}

	public void setFragmentViewports(FragmentViewport[] fragmentViewports) {
		this.fragmentViewports = fragmentViewports;

		_fragmentViewportsSupplier = () -> fragmentViewports;
	}

	@JsonIgnore
	public void setFragmentViewports(
		UnsafeSupplier<FragmentViewport[], Exception>
			fragmentViewportsUnsafeSupplier) {

		fragmentViewports = null;

		_fragmentViewportsSupplier = () -> {
			try {
				return fragmentViewportsUnsafeSupplier.get();
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
		description = "The fragment viewports of the page collection."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected FragmentViewport[] fragmentViewports;

	private Supplier<FragmentViewport[]> _fragmentViewportsSupplier =
		() -> null;

	@Schema(description = "the page section's layout.")
	@Valid
	public Layout getLayout() {
		if (layout != null) {
			return layout;
		}

		layout = _layoutSupplier.get();

		return layout;
	}

	public void setLayout(Layout layout) {
		this.layout = layout;

		_layoutSupplier = () -> layout;
	}

	@JsonIgnore
	public void setLayout(
		UnsafeSupplier<Layout, Exception> layoutUnsafeSupplier) {

		layout = null;

		_layoutSupplier = () -> {
			try {
				return layoutUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "the page section's layout.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Layout layout;

	private Supplier<Layout> _layoutSupplier = () -> null;

	@Schema(
		description = "The style of a list of items in the page collection."
	)
	public String getListItemStyle() {
		if (listItemStyle != null) {
			return listItemStyle;
		}

		listItemStyle = _listItemStyleSupplier.get();

		return listItemStyle;
	}

	public void setListItemStyle(String listItemStyle) {
		this.listItemStyle = listItemStyle;

		_listItemStyleSupplier = () -> listItemStyle;
	}

	@JsonIgnore
	public void setListItemStyle(
		UnsafeSupplier<String, Exception> listItemStyleUnsafeSupplier) {

		listItemStyle = null;

		_listItemStyleSupplier = () -> {
			try {
				return listItemStyleUnsafeSupplier.get();
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
		description = "The style of a list of items in the page collection."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String listItemStyle;

	private Supplier<String> _listItemStyleSupplier = () -> null;

	@Schema(description = "The style of a list in the page collection.")
	public String getListStyle() {
		if (listStyle != null) {
			return listStyle;
		}

		listStyle = _listStyleSupplier.get();

		return listStyle;
	}

	public void setListStyle(String listStyle) {
		this.listStyle = listStyle;

		_listStyleSupplier = () -> listStyle;
	}

	@JsonIgnore
	public void setListStyle(
		UnsafeSupplier<String, Exception> listStyleUnsafeSupplier) {

		listStyle = null;

		_listStyleSupplier = () -> {
			try {
				return listStyleUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The style of a list in the page collection.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String listStyle;

	private Supplier<String> _listStyleSupplier = () -> null;

	@Schema(description = "The custom name of a Page Collection.")
	public String getName() {
		if (name != null) {
			return name;
		}

		name = _nameSupplier.get();

		return name;
	}

	public void setName(String name) {
		this.name = name;

		_nameSupplier = () -> name;
	}

	@JsonIgnore
	public void setName(UnsafeSupplier<String, Exception> nameUnsafeSupplier) {
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

	@GraphQLField(description = "The custom name of a Page Collection.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String name;

	private Supplier<String> _nameSupplier = () -> null;

	@Schema(description = "The number of columns in the page collection.")
	public Integer getNumberOfColumns() {
		if (numberOfColumns != null) {
			return numberOfColumns;
		}

		numberOfColumns = _numberOfColumnsSupplier.get();

		return numberOfColumns;
	}

	public void setNumberOfColumns(Integer numberOfColumns) {
		this.numberOfColumns = numberOfColumns;

		_numberOfColumnsSupplier = () -> numberOfColumns;
	}

	@JsonIgnore
	public void setNumberOfColumns(
		UnsafeSupplier<Integer, Exception> numberOfColumnsUnsafeSupplier) {

		numberOfColumns = null;

		_numberOfColumnsSupplier = () -> {
			try {
				return numberOfColumnsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The number of columns in the page collection.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer numberOfColumns;

	private Supplier<Integer> _numberOfColumnsSupplier = () -> null;

	@Schema(
		description = "The maximum number of items to display in the page collection when pagination is disabled."
	)
	public Integer getNumberOfItems() {
		if (numberOfItems != null) {
			return numberOfItems;
		}

		numberOfItems = _numberOfItemsSupplier.get();

		return numberOfItems;
	}

	public void setNumberOfItems(Integer numberOfItems) {
		this.numberOfItems = numberOfItems;

		_numberOfItemsSupplier = () -> numberOfItems;
	}

	@JsonIgnore
	public void setNumberOfItems(
		UnsafeSupplier<Integer, Exception> numberOfItemsUnsafeSupplier) {

		numberOfItems = null;

		_numberOfItemsSupplier = () -> {
			try {
				return numberOfItemsUnsafeSupplier.get();
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
		description = "The maximum number of items to display in the page collection when pagination is disabled."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer numberOfItems;

	private Supplier<Integer> _numberOfItemsSupplier = () -> null;

	@Schema(
		description = "The number of items per page in the page collection."
	)
	public Integer getNumberOfItemsPerPage() {
		if (numberOfItemsPerPage != null) {
			return numberOfItemsPerPage;
		}

		numberOfItemsPerPage = _numberOfItemsPerPageSupplier.get();

		return numberOfItemsPerPage;
	}

	public void setNumberOfItemsPerPage(Integer numberOfItemsPerPage) {
		this.numberOfItemsPerPage = numberOfItemsPerPage;

		_numberOfItemsPerPageSupplier = () -> numberOfItemsPerPage;
	}

	@JsonIgnore
	public void setNumberOfItemsPerPage(
		UnsafeSupplier<Integer, Exception> numberOfItemsPerPageUnsafeSupplier) {

		numberOfItemsPerPage = null;

		_numberOfItemsPerPageSupplier = () -> {
			try {
				return numberOfItemsPerPageUnsafeSupplier.get();
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
		description = "The number of items per page in the page collection."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer numberOfItemsPerPage;

	private Supplier<Integer> _numberOfItemsPerPageSupplier = () -> null;

	@Schema(
		description = "The maximum number of pages to show when pagination is enabled."
	)
	public Integer getNumberOfPages() {
		if (numberOfPages != null) {
			return numberOfPages;
		}

		numberOfPages = _numberOfPagesSupplier.get();

		return numberOfPages;
	}

	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;

		_numberOfPagesSupplier = () -> numberOfPages;
	}

	@JsonIgnore
	public void setNumberOfPages(
		UnsafeSupplier<Integer, Exception> numberOfPagesUnsafeSupplier) {

		numberOfPages = null;

		_numberOfPagesSupplier = () -> {
			try {
				return numberOfPagesUnsafeSupplier.get();
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
		description = "The maximum number of pages to show when pagination is enabled."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer numberOfPages;

	private Supplier<Integer> _numberOfPagesSupplier = () -> null;

	@Schema(description = "The type of pagination.")
	@Valid
	public PaginationType getPaginationType() {
		if (paginationType != null) {
			return paginationType;
		}

		paginationType = _paginationTypeSupplier.get();

		return paginationType;
	}

	@JsonIgnore
	public String getPaginationTypeAsString() {
		if (paginationType == null) {
			return null;
		}

		return paginationType.toString();
	}

	public void setPaginationType(PaginationType paginationType) {
		this.paginationType = paginationType;

		_paginationTypeSupplier = () -> paginationType;
	}

	@JsonIgnore
	public void setPaginationType(
		UnsafeSupplier<PaginationType, Exception>
			paginationTypeUnsafeSupplier) {

		paginationType = null;

		_paginationTypeSupplier = () -> {
			try {
				return paginationTypeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The type of pagination.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected PaginationType paginationType;

	private Supplier<PaginationType> _paginationTypeSupplier = () -> null;

	@Schema(
		deprecated = true,
		description = "Whether to show all items when pagination is enabled. Deprecated as of Cavanaugh (7.4.x), replaced by displayAllPages"
	)
	public Boolean getShowAllItems() {
		if (showAllItems != null) {
			return showAllItems;
		}

		showAllItems = _showAllItemsSupplier.get();

		return showAllItems;
	}

	public void setShowAllItems(Boolean showAllItems) {
		this.showAllItems = showAllItems;

		_showAllItemsSupplier = () -> showAllItems;
	}

	@JsonIgnore
	public void setShowAllItems(
		UnsafeSupplier<Boolean, Exception> showAllItemsUnsafeSupplier) {

		showAllItems = null;

		_showAllItemsSupplier = () -> {
			try {
				return showAllItemsUnsafeSupplier.get();
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
	@GraphQLField(
		description = "Whether to show all items when pagination is enabled. Deprecated as of Cavanaugh (7.4.x), replaced by displayAllPages"
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean showAllItems;

	private Supplier<Boolean> _showAllItemsSupplier = () -> null;

	@Schema(description = "The page collection's template key.")
	public String getTemplateKey() {
		if (templateKey != null) {
			return templateKey;
		}

		templateKey = _templateKeySupplier.get();

		return templateKey;
	}

	public void setTemplateKey(String templateKey) {
		this.templateKey = templateKey;

		_templateKeySupplier = () -> templateKey;
	}

	@JsonIgnore
	public void setTemplateKey(
		UnsafeSupplier<String, Exception> templateKeyUnsafeSupplier) {

		templateKey = null;

		_templateKeySupplier = () -> {
			try {
				return templateKeyUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The page collection's template key.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String templateKey;

	private Supplier<String> _templateKeySupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PageCollectionDefinition)) {
			return false;
		}

		PageCollectionDefinition pageCollectionDefinition =
			(PageCollectionDefinition)object;

		return Objects.equals(toString(), pageCollectionDefinition.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (collectionConfig != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"collectionConfig\": ");

			sb.append(String.valueOf(collectionConfig));
		}

		if (collectionViewports != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"collectionViewports\": ");

			sb.append("[");

			for (int i = 0; i < collectionViewports.length; i++) {
				sb.append(String.valueOf(collectionViewports[i]));

				if ((i + 1) < collectionViewports.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (displayAllItems != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"displayAllItems\": ");

			sb.append(displayAllItems);
		}

		if (displayAllPages != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"displayAllPages\": ");

			sb.append(displayAllPages);
		}

		if (emptyCollectionConfig != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"emptyCollectionConfig\": ");

			sb.append(String.valueOf(emptyCollectionConfig));
		}

		if (fragmentStyle != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fragmentStyle\": ");

			sb.append(String.valueOf(fragmentStyle));
		}

		if (fragmentViewports != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fragmentViewports\": ");

			sb.append("[");

			for (int i = 0; i < fragmentViewports.length; i++) {
				sb.append(String.valueOf(fragmentViewports[i]));

				if ((i + 1) < fragmentViewports.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (layout != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"layout\": ");

			sb.append(String.valueOf(layout));
		}

		if (listItemStyle != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"listItemStyle\": ");

			sb.append("\"");

			sb.append(_escape(listItemStyle));

			sb.append("\"");
		}

		if (listStyle != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"listStyle\": ");

			sb.append("\"");

			sb.append(_escape(listStyle));

			sb.append("\"");
		}

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(name));

			sb.append("\"");
		}

		if (numberOfColumns != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfColumns\": ");

			sb.append(numberOfColumns);
		}

		if (numberOfItems != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfItems\": ");

			sb.append(numberOfItems);
		}

		if (numberOfItemsPerPage != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfItemsPerPage\": ");

			sb.append(numberOfItemsPerPage);
		}

		if (numberOfPages != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfPages\": ");

			sb.append(numberOfPages);
		}

		if (paginationType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"paginationType\": ");

			sb.append("\"");

			sb.append(paginationType);

			sb.append("\"");
		}

		if (showAllItems != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"showAllItems\": ");

			sb.append(showAllItems);
		}

		if (templateKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"templateKey\": ");

			sb.append("\"");

			sb.append(_escape(templateKey));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.delivery.dto.v1_0.PageCollectionDefinition",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("PaginationType")
	public static enum PaginationType {

		NONE("None"), NUMERIC("Numeric"), REGULAR("Regular"), SIMPLE("Simple");

		@JsonCreator
		public static PaginationType create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (PaginationType paginationType : values()) {
				if (Objects.equals(paginationType.getValue(), value)) {
					return paginationType;
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

		private PaginationType(String value) {
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