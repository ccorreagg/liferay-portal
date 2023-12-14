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

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "Represents a site page. This is modeled internally as a `Layout`.",
	value = "SitePage"
)
@JsonFilter("Liferay.Vulcan")
@Schema(
	description = "Represents a site page. This is modeled internally as a `Layout`.",
	requiredProperties = {"title"}
)
@XmlRootElement(name = "SitePage")
public class SitePage implements Serializable {

	public static SitePage toDTO(String json) {
		return ObjectMapperUtil.readValue(SitePage.class, json);
	}

	public static SitePage unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(SitePage.class, json);
	}

	@Schema(
		description = "Block of actions allowed by the user making the request."
	)
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

	@GraphQLField(
		description = "Block of actions allowed by the user making the request."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Map<String, Map<String, String>> actions;

	private Supplier<Map<String, Map<String, String>>> _actionsSupplier =
		() -> null;

	@Schema(description = "The page's average rating.")
	@Valid
	public AggregateRating getAggregateRating() {
		if (aggregateRating != null) {
			return aggregateRating;
		}

		aggregateRating = _aggregateRatingSupplier.get();

		return aggregateRating;
	}

	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;

		_aggregateRatingSupplier = () -> aggregateRating;
	}

	@JsonIgnore
	public void setAggregateRating(
		UnsafeSupplier<AggregateRating, Exception>
			aggregateRatingUnsafeSupplier) {

		aggregateRating = null;

		_aggregateRatingSupplier = () -> {
			try {
				return aggregateRatingUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The page's average rating.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected AggregateRating aggregateRating;

	private Supplier<AggregateRating> _aggregateRatingSupplier = () -> null;

	@Schema(
		description = "The list of languages the page has a translation for."
	)
	public String[] getAvailableLanguages() {
		if (availableLanguages != null) {
			return availableLanguages;
		}

		availableLanguages = _availableLanguagesSupplier.get();

		return availableLanguages;
	}

	public void setAvailableLanguages(String[] availableLanguages) {
		this.availableLanguages = availableLanguages;

		_availableLanguagesSupplier = () -> availableLanguages;
	}

	@JsonIgnore
	public void setAvailableLanguages(
		UnsafeSupplier<String[], Exception> availableLanguagesUnsafeSupplier) {

		availableLanguages = null;

		_availableLanguagesSupplier = () -> {
			try {
				return availableLanguagesUnsafeSupplier.get();
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
		description = "The list of languages the page has a translation for."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String[] availableLanguages;

	private Supplier<String[]> _availableLanguagesSupplier = () -> null;

	@Schema(description = "The page's creator.")
	@Valid
	public Creator getCreator() {
		if (creator != null) {
			return creator;
		}

		creator = _creatorSupplier.get();

		return creator;
	}

	public void setCreator(Creator creator) {
		this.creator = creator;

		_creatorSupplier = () -> creator;
	}

	@JsonIgnore
	public void setCreator(
		UnsafeSupplier<Creator, Exception> creatorUnsafeSupplier) {

		creator = null;

		_creatorSupplier = () -> {
			try {
				return creatorUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The page's creator.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Creator creator;

	private Supplier<Creator> _creatorSupplier = () -> null;

	@Schema(description = "Custom fields associated with the page.")
	@Valid
	public CustomField[] getCustomFields() {
		if (customFields != null) {
			return customFields;
		}

		customFields = _customFieldsSupplier.get();

		return customFields;
	}

	public void setCustomFields(CustomField[] customFields) {
		this.customFields = customFields;

		_customFieldsSupplier = () -> customFields;
	}

	@JsonIgnore
	public void setCustomFields(
		UnsafeSupplier<CustomField[], Exception> customFieldsUnsafeSupplier) {

		customFields = null;

		_customFieldsSupplier = () -> {
			try {
				return customFieldsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "Custom fields associated with the page.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected CustomField[] customFields;

	private Supplier<CustomField[]> _customFieldsSupplier = () -> null;

	@Schema(description = "The page's creation date.")
	public Date getDateCreated() {
		if (dateCreated != null) {
			return dateCreated;
		}

		dateCreated = _dateCreatedSupplier.get();

		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;

		_dateCreatedSupplier = () -> dateCreated;
	}

	@JsonIgnore
	public void setDateCreated(
		UnsafeSupplier<Date, Exception> dateCreatedUnsafeSupplier) {

		dateCreated = null;

		_dateCreatedSupplier = () -> {
			try {
				return dateCreatedUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The page's creation date.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateCreated;

	private Supplier<Date> _dateCreatedSupplier = () -> null;

	@Schema(description = "The last time any field of the page was changed.")
	public Date getDateModified() {
		if (dateModified != null) {
			return dateModified;
		}

		dateModified = _dateModifiedSupplier.get();

		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;

		_dateModifiedSupplier = () -> dateModified;
	}

	@JsonIgnore
	public void setDateModified(
		UnsafeSupplier<Date, Exception> dateModifiedUnsafeSupplier) {

		dateModified = null;

		_dateModifiedSupplier = () -> {
			try {
				return dateModifiedUnsafeSupplier.get();
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
		description = "The last time any field of the page was changed."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateModified;

	private Supplier<Date> _dateModifiedSupplier = () -> null;

	@Schema(description = "The page's most recent publication date.")
	public Date getDatePublished() {
		if (datePublished != null) {
			return datePublished;
		}

		datePublished = _datePublishedSupplier.get();

		return datePublished;
	}

	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;

		_datePublishedSupplier = () -> datePublished;
	}

	@JsonIgnore
	public void setDatePublished(
		UnsafeSupplier<Date, Exception> datePublishedUnsafeSupplier) {

		datePublished = null;

		_datePublishedSupplier = () -> {
			try {
				return datePublishedUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The page's most recent publication date.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date datePublished;

	private Supplier<Date> _datePublishedSupplier = () -> null;

	@Schema(description = "Experience of the page that it's being retrieved.")
	@Valid
	public Experience getExperience() {
		if (experience != null) {
			return experience;
		}

		experience = _experienceSupplier.get();

		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;

		_experienceSupplier = () -> experience;
	}

	@JsonIgnore
	public void setExperience(
		UnsafeSupplier<Experience, Exception> experienceUnsafeSupplier) {

		experience = null;

		_experienceSupplier = () -> {
			try {
				return experienceUnsafeSupplier.get();
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
		description = "Experience of the page that it's being retrieved."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Experience experience;

	private Supplier<Experience> _experienceSupplier = () -> null;

	@Schema(description = "A relative URL to the page's rendered content.")
	public String getFriendlyUrlPath() {
		if (friendlyUrlPath != null) {
			return friendlyUrlPath;
		}

		friendlyUrlPath = _friendlyUrlPathSupplier.get();

		return friendlyUrlPath;
	}

	public void setFriendlyUrlPath(String friendlyUrlPath) {
		this.friendlyUrlPath = friendlyUrlPath;

		_friendlyUrlPathSupplier = () -> friendlyUrlPath;
	}

	@JsonIgnore
	public void setFriendlyUrlPath(
		UnsafeSupplier<String, Exception> friendlyUrlPathUnsafeSupplier) {

		friendlyUrlPath = null;

		_friendlyUrlPathSupplier = () -> {
			try {
				return friendlyUrlPathUnsafeSupplier.get();
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
		description = "A relative URL to the page's rendered content."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String friendlyUrlPath;

	private Supplier<String> _friendlyUrlPathSupplier = () -> null;

	@Schema(
		description = "The localized relative URLs to the page's rendered content."
	)
	@Valid
	public Map<String, String> getFriendlyUrlPath_i18n() {
		if (friendlyUrlPath_i18n != null) {
			return friendlyUrlPath_i18n;
		}

		friendlyUrlPath_i18n = _friendlyUrlPath_i18nSupplier.get();

		return friendlyUrlPath_i18n;
	}

	public void setFriendlyUrlPath_i18n(
		Map<String, String> friendlyUrlPath_i18n) {

		this.friendlyUrlPath_i18n = friendlyUrlPath_i18n;

		_friendlyUrlPath_i18nSupplier = () -> friendlyUrlPath_i18n;
	}

	@JsonIgnore
	public void setFriendlyUrlPath_i18n(
		UnsafeSupplier<Map<String, String>, Exception>
			friendlyUrlPath_i18nUnsafeSupplier) {

		friendlyUrlPath_i18n = null;

		_friendlyUrlPath_i18nSupplier = () -> {
			try {
				return friendlyUrlPath_i18nUnsafeSupplier.get();
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
		description = "The localized relative URLs to the page's rendered content."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> friendlyUrlPath_i18n;

	private Supplier<Map<String, String>> _friendlyUrlPath_i18nSupplier =
		() -> null;

	@Schema(description = "The page ID.")
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

	@GraphQLField(description = "The page ID.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema(description = "A list of keywords describing the page.")
	public String[] getKeywords() {
		if (keywords != null) {
			return keywords;
		}

		keywords = _keywordsSupplier.get();

		return keywords;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;

		_keywordsSupplier = () -> keywords;
	}

	@JsonIgnore
	public void setKeywords(
		UnsafeSupplier<String[], Exception> keywordsUnsafeSupplier) {

		keywords = null;

		_keywordsSupplier = () -> {
			try {
				return keywordsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "A list of keywords describing the page.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String[] keywords;

	private Supplier<String[]> _keywordsSupplier = () -> null;

	@Schema(
		description = "Optional field with the structure of all the elements of the page. Can be embedded with nestedFields when retrieving the collection of site pages. When retrieving a single site page, it will automatically be included."
	)
	@Valid
	public PageDefinition getPageDefinition() {
		if (pageDefinition != null) {
			return pageDefinition;
		}

		pageDefinition = _pageDefinitionSupplier.get();

		return pageDefinition;
	}

	public void setPageDefinition(PageDefinition pageDefinition) {
		this.pageDefinition = pageDefinition;

		_pageDefinitionSupplier = () -> pageDefinition;
	}

	@JsonIgnore
	public void setPageDefinition(
		UnsafeSupplier<PageDefinition, Exception>
			pageDefinitionUnsafeSupplier) {

		pageDefinition = null;

		_pageDefinitionSupplier = () -> {
			try {
				return pageDefinitionUnsafeSupplier.get();
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
		description = "Optional field with the structure of all the elements of the page. Can be embedded with nestedFields when retrieving the collection of site pages. When retrieving a single site page, it will automatically be included."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected PageDefinition pageDefinition;

	private Supplier<PageDefinition> _pageDefinitionSupplier = () -> null;

	@Schema(description = "The page's permissions.")
	@Valid
	public PagePermission[] getPagePermissions() {
		if (pagePermissions != null) {
			return pagePermissions;
		}

		pagePermissions = _pagePermissionsSupplier.get();

		return pagePermissions;
	}

	public void setPagePermissions(PagePermission[] pagePermissions) {
		this.pagePermissions = pagePermissions;

		_pagePermissionsSupplier = () -> pagePermissions;
	}

	@JsonIgnore
	public void setPagePermissions(
		UnsafeSupplier<PagePermission[], Exception>
			pagePermissionsUnsafeSupplier) {

		pagePermissions = null;

		_pagePermissionsSupplier = () -> {
			try {
				return pagePermissionsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The page's permissions.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected PagePermission[] pagePermissions;

	private Supplier<PagePermission[]> _pagePermissionsSupplier = () -> null;

	@Schema(description = "Settings of the page, such as SEO or OpenGraph.")
	@Valid
	public PageSettings getPageSettings() {
		if (pageSettings != null) {
			return pageSettings;
		}

		pageSettings = _pageSettingsSupplier.get();

		return pageSettings;
	}

	public void setPageSettings(PageSettings pageSettings) {
		this.pageSettings = pageSettings;

		_pageSettingsSupplier = () -> pageSettings;
	}

	@JsonIgnore
	public void setPageSettings(
		UnsafeSupplier<PageSettings, Exception> pageSettingsUnsafeSupplier) {

		pageSettings = null;

		_pageSettingsSupplier = () -> {
			try {
				return pageSettingsUnsafeSupplier.get();
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
		description = "Settings of the page, such as SEO or OpenGraph."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected PageSettings pageSettings;

	private Supplier<PageSettings> _pageSettingsSupplier = () -> null;

	@Schema(description = "The type of the page.")
	public String getPageType() {
		if (pageType != null) {
			return pageType;
		}

		pageType = _pageTypeSupplier.get();

		return pageType;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;

		_pageTypeSupplier = () -> pageType;
	}

	@JsonIgnore
	public void setPageType(
		UnsafeSupplier<String, Exception> pageTypeUnsafeSupplier) {

		pageType = null;

		_pageTypeSupplier = () -> {
			try {
				return pageTypeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The type of the page.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String pageType;

	private Supplier<String> _pageTypeSupplier = () -> null;

	@Schema(description = "The parent page or null if it is a top level page.")
	@Valid
	public ParentSitePage getParentSitePage() {
		if (parentSitePage != null) {
			return parentSitePage;
		}

		parentSitePage = _parentSitePageSupplier.get();

		return parentSitePage;
	}

	public void setParentSitePage(ParentSitePage parentSitePage) {
		this.parentSitePage = parentSitePage;

		_parentSitePageSupplier = () -> parentSitePage;
	}

	@JsonIgnore
	public void setParentSitePage(
		UnsafeSupplier<ParentSitePage, Exception>
			parentSitePageUnsafeSupplier) {

		parentSitePage = null;

		_parentSitePageSupplier = () -> {
			try {
				return parentSitePageUnsafeSupplier.get();
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
		description = "The parent page or null if it is a top level page."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected ParentSitePage parentSitePage;

	private Supplier<ParentSitePage> _parentSitePageSupplier = () -> null;

	@Schema(
		description = "Metadata of the page such as it's master page and template."
	)
	@Valid
	public RenderedPage getRenderedPage() {
		if (renderedPage != null) {
			return renderedPage;
		}

		renderedPage = _renderedPageSupplier.get();

		return renderedPage;
	}

	public void setRenderedPage(RenderedPage renderedPage) {
		this.renderedPage = renderedPage;

		_renderedPageSupplier = () -> renderedPage;
	}

	@JsonIgnore
	public void setRenderedPage(
		UnsafeSupplier<RenderedPage, Exception> renderedPageUnsafeSupplier) {

		renderedPage = null;

		_renderedPageSupplier = () -> {
			try {
				return renderedPageUnsafeSupplier.get();
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
		description = "Metadata of the page such as it's master page and template."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected RenderedPage renderedPage;

	private Supplier<RenderedPage> _renderedPageSupplier = () -> null;

	@Schema(description = "The ID of the site to which this page is scoped.")
	public Long getSiteId() {
		if (siteId != null) {
			return siteId;
		}

		siteId = _siteIdSupplier.get();

		return siteId;
	}

	public void setSiteId(Long siteId) {
		this.siteId = siteId;

		_siteIdSupplier = () -> siteId;
	}

	@JsonIgnore
	public void setSiteId(
		UnsafeSupplier<Long, Exception> siteIdUnsafeSupplier) {

		siteId = null;

		_siteIdSupplier = () -> {
			try {
				return siteIdUnsafeSupplier.get();
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
		description = "The ID of the site to which this page is scoped."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long siteId;

	private Supplier<Long> _siteIdSupplier = () -> null;

	@Schema(description = "The categories associated with this page.")
	@Valid
	public TaxonomyCategoryBrief[] getTaxonomyCategoryBriefs() {
		if (taxonomyCategoryBriefs != null) {
			return taxonomyCategoryBriefs;
		}

		taxonomyCategoryBriefs = _taxonomyCategoryBriefsSupplier.get();

		return taxonomyCategoryBriefs;
	}

	public void setTaxonomyCategoryBriefs(
		TaxonomyCategoryBrief[] taxonomyCategoryBriefs) {

		this.taxonomyCategoryBriefs = taxonomyCategoryBriefs;

		_taxonomyCategoryBriefsSupplier = () -> taxonomyCategoryBriefs;
	}

	@JsonIgnore
	public void setTaxonomyCategoryBriefs(
		UnsafeSupplier<TaxonomyCategoryBrief[], Exception>
			taxonomyCategoryBriefsUnsafeSupplier) {

		taxonomyCategoryBriefs = null;

		_taxonomyCategoryBriefsSupplier = () -> {
			try {
				return taxonomyCategoryBriefsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The categories associated with this page.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected TaxonomyCategoryBrief[] taxonomyCategoryBriefs;

	private Supplier<TaxonomyCategoryBrief[]> _taxonomyCategoryBriefsSupplier =
		() -> null;

	@Schema(
		deprecated = true,
		description = "A write-only field that adds `TaxonomyCategory` instances to the page. Deprecated as of Cavanaugh (7.4.x), replaced by `taxonomyCategoryBriefs.taxonomyCategoryReference`"
	)
	public Long[] getTaxonomyCategoryIds() {
		if (taxonomyCategoryIds != null) {
			return taxonomyCategoryIds;
		}

		taxonomyCategoryIds = _taxonomyCategoryIdsSupplier.get();

		return taxonomyCategoryIds;
	}

	public void setTaxonomyCategoryIds(Long[] taxonomyCategoryIds) {
		this.taxonomyCategoryIds = taxonomyCategoryIds;

		_taxonomyCategoryIdsSupplier = () -> taxonomyCategoryIds;
	}

	@JsonIgnore
	public void setTaxonomyCategoryIds(
		UnsafeSupplier<Long[], Exception> taxonomyCategoryIdsUnsafeSupplier) {

		taxonomyCategoryIds = null;

		_taxonomyCategoryIdsSupplier = () -> {
			try {
				return taxonomyCategoryIdsUnsafeSupplier.get();
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
		description = "A write-only field that adds `TaxonomyCategory` instances to the page. Deprecated as of Cavanaugh (7.4.x), replaced by `taxonomyCategoryBriefs.taxonomyCategoryReference`"
	)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	protected Long[] taxonomyCategoryIds;

	private Supplier<Long[]> _taxonomyCategoryIdsSupplier = () -> null;

	@Schema(description = "The page's title.")
	public String getTitle() {
		if (title != null) {
			return title;
		}

		title = _titleSupplier.get();

		return title;
	}

	public void setTitle(String title) {
		this.title = title;

		_titleSupplier = () -> title;
	}

	@JsonIgnore
	public void setTitle(
		UnsafeSupplier<String, Exception> titleUnsafeSupplier) {

		title = null;

		_titleSupplier = () -> {
			try {
				return titleUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The page's title.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	@NotEmpty
	protected String title;

	private Supplier<String> _titleSupplier = () -> null;

	@Schema(description = "The localized page's titles.")
	@Valid
	public Map<String, String> getTitle_i18n() {
		if (title_i18n != null) {
			return title_i18n;
		}

		title_i18n = _title_i18nSupplier.get();

		return title_i18n;
	}

	public void setTitle_i18n(Map<String, String> title_i18n) {
		this.title_i18n = title_i18n;

		_title_i18nSupplier = () -> title_i18n;
	}

	@JsonIgnore
	public void setTitle_i18n(
		UnsafeSupplier<Map<String, String>, Exception>
			title_i18nUnsafeSupplier) {

		title_i18n = null;

		_title_i18nSupplier = () -> {
			try {
				return title_i18nUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The localized page's titles.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> title_i18n;

	private Supplier<Map<String, String>> _title_i18nSupplier = () -> null;

	@Schema(description = "A valid external identifier to reference this page.")
	public String getUuid() {
		if (uuid != null) {
			return uuid;
		}

		uuid = _uuidSupplier.get();

		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;

		_uuidSupplier = () -> uuid;
	}

	@JsonIgnore
	public void setUuid(UnsafeSupplier<String, Exception> uuidUnsafeSupplier) {
		uuid = null;

		_uuidSupplier = () -> {
			try {
				return uuidUnsafeSupplier.get();
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
		description = "A valid external identifier to reference this page."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String uuid;

	private Supplier<String> _uuidSupplier = () -> null;

	@Schema
	@Valid
	public ViewableBy getViewableBy() {
		if (viewableBy != null) {
			return viewableBy;
		}

		viewableBy = _viewableBySupplier.get();

		return viewableBy;
	}

	@JsonIgnore
	public String getViewableByAsString() {
		if (viewableBy == null) {
			return null;
		}

		return viewableBy.toString();
	}

	public void setViewableBy(ViewableBy viewableBy) {
		this.viewableBy = viewableBy;

		_viewableBySupplier = () -> viewableBy;
	}

	@JsonIgnore
	public void setViewableBy(
		UnsafeSupplier<ViewableBy, Exception> viewableByUnsafeSupplier) {

		viewableBy = null;

		_viewableBySupplier = () -> {
			try {
				return viewableByUnsafeSupplier.get();
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
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	protected ViewableBy viewableBy;

	private Supplier<ViewableBy> _viewableBySupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SitePage)) {
			return false;
		}

		SitePage sitePage = (SitePage)object;

		return Objects.equals(toString(), sitePage.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (actions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"actions\": ");

			sb.append(_toJSON(actions));
		}

		if (aggregateRating != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"aggregateRating\": ");

			sb.append(String.valueOf(aggregateRating));
		}

		if (availableLanguages != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"availableLanguages\": ");

			sb.append("[");

			for (int i = 0; i < availableLanguages.length; i++) {
				sb.append("\"");

				sb.append(_escape(availableLanguages[i]));

				sb.append("\"");

				if ((i + 1) < availableLanguages.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (creator != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"creator\": ");

			sb.append(String.valueOf(creator));
		}

		if (customFields != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"customFields\": ");

			sb.append("[");

			for (int i = 0; i < customFields.length; i++) {
				sb.append(String.valueOf(customFields[i]));

				if ((i + 1) < customFields.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (dateCreated != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateCreated\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dateCreated));

			sb.append("\"");
		}

		if (dateModified != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateModified\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dateModified));

			sb.append("\"");
		}

		if (datePublished != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"datePublished\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(datePublished));

			sb.append("\"");
		}

		if (experience != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"experience\": ");

			sb.append(String.valueOf(experience));
		}

		if (friendlyUrlPath != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"friendlyUrlPath\": ");

			sb.append("\"");

			sb.append(_escape(friendlyUrlPath));

			sb.append("\"");
		}

		if (friendlyUrlPath_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"friendlyUrlPath_i18n\": ");

			sb.append(_toJSON(friendlyUrlPath_i18n));
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (keywords != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"keywords\": ");

			sb.append("[");

			for (int i = 0; i < keywords.length; i++) {
				sb.append("\"");

				sb.append(_escape(keywords[i]));

				sb.append("\"");

				if ((i + 1) < keywords.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (pageDefinition != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"pageDefinition\": ");

			sb.append(String.valueOf(pageDefinition));
		}

		if (pagePermissions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"pagePermissions\": ");

			sb.append("[");

			for (int i = 0; i < pagePermissions.length; i++) {
				sb.append(String.valueOf(pagePermissions[i]));

				if ((i + 1) < pagePermissions.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (pageSettings != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"pageSettings\": ");

			sb.append(String.valueOf(pageSettings));
		}

		if (pageType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"pageType\": ");

			sb.append("\"");

			sb.append(_escape(pageType));

			sb.append("\"");
		}

		if (parentSitePage != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parentSitePage\": ");

			sb.append(String.valueOf(parentSitePage));
		}

		if (renderedPage != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"renderedPage\": ");

			sb.append(String.valueOf(renderedPage));
		}

		if (siteId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siteId\": ");

			sb.append(siteId);
		}

		if (taxonomyCategoryBriefs != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"taxonomyCategoryBriefs\": ");

			sb.append("[");

			for (int i = 0; i < taxonomyCategoryBriefs.length; i++) {
				sb.append(String.valueOf(taxonomyCategoryBriefs[i]));

				if ((i + 1) < taxonomyCategoryBriefs.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (taxonomyCategoryIds != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"taxonomyCategoryIds\": ");

			sb.append("[");

			for (int i = 0; i < taxonomyCategoryIds.length; i++) {
				sb.append(taxonomyCategoryIds[i]);

				if ((i + 1) < taxonomyCategoryIds.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (title != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(title));

			sb.append("\"");
		}

		if (title_i18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title_i18n\": ");

			sb.append(_toJSON(title_i18n));
		}

		if (uuid != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"uuid\": ");

			sb.append("\"");

			sb.append(_escape(uuid));

			sb.append("\"");
		}

		if (viewableBy != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"viewableBy\": ");

			sb.append("\"");

			sb.append(viewableBy);

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.delivery.dto.v1_0.SitePage",
		name = "x-class-name"
	)
	public String xClassName;

	@GraphQLName("ViewableBy")
	public static enum ViewableBy {

		ANYONE("Anyone"), MEMBERS("Members"), OWNER("Owner");

		@JsonCreator
		public static ViewableBy create(String value) {
			if ((value == null) || value.equals("")) {
				return null;
			}

			for (ViewableBy viewableBy : values()) {
				if (Objects.equals(viewableBy.getValue(), value)) {
					return viewableBy;
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

		private ViewableBy(String value) {
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