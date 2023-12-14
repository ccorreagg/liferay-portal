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
@GraphQLName(description = "Represents a wiki page.", value = "WikiPage")
@JsonFilter("Liferay.Vulcan")
@Schema(
	description = "Represents a wiki page.",
	requiredProperties = {"encodingFormat", "headline"}
)
@XmlRootElement(name = "WikiPage")
public class WikiPage implements Serializable {

	public static WikiPage toDTO(String json) {
		return ObjectMapperUtil.readValue(WikiPage.class, json);
	}

	public static WikiPage unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(WikiPage.class, json);
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

	@Schema(description = "The blog post's average rating.")
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

	@GraphQLField(description = "The blog post's average rating.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected AggregateRating aggregateRating;

	private Supplier<AggregateRating> _aggregateRatingSupplier = () -> null;

	@Schema(description = "The wiki page's content.")
	public String getContent() {
		if (content != null) {
			return content;
		}

		content = _contentSupplier.get();

		return content;
	}

	public void setContent(String content) {
		this.content = content;

		_contentSupplier = () -> content;
	}

	@JsonIgnore
	public void setContent(
		UnsafeSupplier<String, Exception> contentUnsafeSupplier) {

		content = null;

		_contentSupplier = () -> {
			try {
				return contentUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The wiki page's content.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String content;

	private Supplier<String> _contentSupplier = () -> null;

	@Schema(description = "The wiki page's creator.")
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

	@GraphQLField(description = "The wiki page's creator.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Creator creator;

	private Supplier<Creator> _creatorSupplier = () -> null;

	@Schema(
		description = "A list of the custom fields associated with the wiki page."
	)
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

	@GraphQLField(
		description = "A list of the custom fields associated with the wiki page."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected CustomField[] customFields;

	private Supplier<CustomField[]> _customFieldsSupplier = () -> null;

	@Schema(description = "The date the wiki page was created.")
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

	@GraphQLField(description = "The date the wiki page was created.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateCreated;

	private Supplier<Date> _dateCreatedSupplier = () -> null;

	@Schema(
		description = "The last time any of the wiki page's fields changed."
	)
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
		description = "The last time any of the wiki page's fields changed."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateModified;

	private Supplier<Date> _dateModifiedSupplier = () -> null;

	@Schema(description = "The wiki page's description.")
	public String getDescription() {
		if (description != null) {
			return description;
		}

		description = _descriptionSupplier.get();

		return description;
	}

	public void setDescription(String description) {
		this.description = description;

		_descriptionSupplier = () -> description;
	}

	@JsonIgnore
	public void setDescription(
		UnsafeSupplier<String, Exception> descriptionUnsafeSupplier) {

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

	@GraphQLField(description = "The wiki page's description.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String description;

	private Supplier<String> _descriptionSupplier = () -> null;

	@Schema(
		description = "The wiki page's media format (e.g., HTML, BBCode, etc.)."
	)
	public String getEncodingFormat() {
		if (encodingFormat != null) {
			return encodingFormat;
		}

		encodingFormat = _encodingFormatSupplier.get();

		return encodingFormat;
	}

	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;

		_encodingFormatSupplier = () -> encodingFormat;
	}

	@JsonIgnore
	public void setEncodingFormat(
		UnsafeSupplier<String, Exception> encodingFormatUnsafeSupplier) {

		encodingFormat = null;

		_encodingFormatSupplier = () -> {
			try {
				return encodingFormatUnsafeSupplier.get();
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
		description = "The wiki page's media format (e.g., HTML, BBCode, etc.)."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	@NotEmpty
	protected String encodingFormat;

	private Supplier<String> _encodingFormatSupplier = () -> null;

	@Schema(description = "The wiki page's external reference code.")
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

	@GraphQLField(description = "The wiki page's external reference code.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String externalReferenceCode;

	private Supplier<String> _externalReferenceCodeSupplier = () -> null;

	@Schema(description = "The wiki page's main title.")
	public String getHeadline() {
		if (headline != null) {
			return headline;
		}

		headline = _headlineSupplier.get();

		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;

		_headlineSupplier = () -> headline;
	}

	@JsonIgnore
	public void setHeadline(
		UnsafeSupplier<String, Exception> headlineUnsafeSupplier) {

		headline = null;

		_headlineSupplier = () -> {
			try {
				return headlineUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The wiki page's main title.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	@NotEmpty
	protected String headline;

	private Supplier<String> _headlineSupplier = () -> null;

	@Schema(description = "The wiki page's ID.")
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

	@GraphQLField(description = "The wiki page's ID.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema(description = "A list of keywords describing the blog post.")
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

	@GraphQLField(description = "A list of keywords describing the blog post.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String[] keywords;

	private Supplier<String[]> _keywordsSupplier = () -> null;

	@Schema(description = "The wiki page's number attachments.")
	public Integer getNumberOfAttachments() {
		if (numberOfAttachments != null) {
			return numberOfAttachments;
		}

		numberOfAttachments = _numberOfAttachmentsSupplier.get();

		return numberOfAttachments;
	}

	public void setNumberOfAttachments(Integer numberOfAttachments) {
		this.numberOfAttachments = numberOfAttachments;

		_numberOfAttachmentsSupplier = () -> numberOfAttachments;
	}

	@JsonIgnore
	public void setNumberOfAttachments(
		UnsafeSupplier<Integer, Exception> numberOfAttachmentsUnsafeSupplier) {

		numberOfAttachments = null;

		_numberOfAttachmentsSupplier = () -> {
			try {
				return numberOfAttachmentsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The wiki page's number attachments.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Integer numberOfAttachments;

	private Supplier<Integer> _numberOfAttachmentsSupplier = () -> null;

	@Schema(description = "The number of child wiki page on this wiki page.")
	public Integer getNumberOfWikiPages() {
		if (numberOfWikiPages != null) {
			return numberOfWikiPages;
		}

		numberOfWikiPages = _numberOfWikiPagesSupplier.get();

		return numberOfWikiPages;
	}

	public void setNumberOfWikiPages(Integer numberOfWikiPages) {
		this.numberOfWikiPages = numberOfWikiPages;

		_numberOfWikiPagesSupplier = () -> numberOfWikiPages;
	}

	@JsonIgnore
	public void setNumberOfWikiPages(
		UnsafeSupplier<Integer, Exception> numberOfWikiPagesUnsafeSupplier) {

		numberOfWikiPages = null;

		_numberOfWikiPagesSupplier = () -> {
			try {
				return numberOfWikiPagesUnsafeSupplier.get();
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
		description = "The number of child wiki page on this wiki page."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Integer numberOfWikiPages;

	private Supplier<Integer> _numberOfWikiPagesSupplier = () -> null;

	@Schema(description = "The ID of the wiki page's parent, if it exists.")
	public Long getParentWikiPageId() {
		if (parentWikiPageId != null) {
			return parentWikiPageId;
		}

		parentWikiPageId = _parentWikiPageIdSupplier.get();

		return parentWikiPageId;
	}

	public void setParentWikiPageId(Long parentWikiPageId) {
		this.parentWikiPageId = parentWikiPageId;

		_parentWikiPageIdSupplier = () -> parentWikiPageId;
	}

	@JsonIgnore
	public void setParentWikiPageId(
		UnsafeSupplier<Long, Exception> parentWikiPageIdUnsafeSupplier) {

		parentWikiPageId = null;

		_parentWikiPageIdSupplier = () -> {
			try {
				return parentWikiPageIdUnsafeSupplier.get();
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
		description = "The ID of the wiki page's parent, if it exists."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long parentWikiPageId;

	private Supplier<Long> _parentWikiPageIdSupplier = () -> null;

	@Schema(description = "A list of related contents to this wiki page.")
	@Valid
	public RelatedContent[] getRelatedContents() {
		if (relatedContents != null) {
			return relatedContents;
		}

		relatedContents = _relatedContentsSupplier.get();

		return relatedContents;
	}

	public void setRelatedContents(RelatedContent[] relatedContents) {
		this.relatedContents = relatedContents;

		_relatedContentsSupplier = () -> relatedContents;
	}

	@JsonIgnore
	public void setRelatedContents(
		UnsafeSupplier<RelatedContent[], Exception>
			relatedContentsUnsafeSupplier) {

		relatedContents = null;

		_relatedContentsSupplier = () -> {
			try {
				return relatedContentsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "A list of related contents to this wiki page.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected RelatedContent[] relatedContents;

	private Supplier<RelatedContent[]> _relatedContentsSupplier = () -> null;

	@Schema(
		description = "The ID of the site to which this wiki page is scoped."
	)
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
		description = "The ID of the site to which this wiki page is scoped."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long siteId;

	private Supplier<Long> _siteIdSupplier = () -> null;

	@Schema(
		description = "A flag that indicates whether the user making the requests is subscribed to this wiki page."
	)
	public Boolean getSubscribed() {
		if (subscribed != null) {
			return subscribed;
		}

		subscribed = _subscribedSupplier.get();

		return subscribed;
	}

	public void setSubscribed(Boolean subscribed) {
		this.subscribed = subscribed;

		_subscribedSupplier = () -> subscribed;
	}

	@JsonIgnore
	public void setSubscribed(
		UnsafeSupplier<Boolean, Exception> subscribedUnsafeSupplier) {

		subscribed = null;

		_subscribedSupplier = () -> {
			try {
				return subscribedUnsafeSupplier.get();
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
		description = "A flag that indicates whether the user making the requests is subscribed to this wiki page."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Boolean subscribed;

	private Supplier<Boolean> _subscribedSupplier = () -> null;

	@Schema(description = "The categories associated with this wiki page.")
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

	@GraphQLField(
		description = "The categories associated with this wiki page."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected TaxonomyCategoryBrief[] taxonomyCategoryBriefs;

	private Supplier<TaxonomyCategoryBrief[]> _taxonomyCategoryBriefsSupplier =
		() -> null;

	@Schema(
		description = "A write-only field that adds `TaxonomyCategory` instances to the wiki page."
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

	@GraphQLField(
		description = "A write-only field that adds `TaxonomyCategory` instances to the wiki page."
	)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	protected Long[] taxonomyCategoryIds;

	private Supplier<Long[]> _taxonomyCategoryIdsSupplier = () -> null;

	@Schema(
		description = "A write-only property that specifies the default permissions."
	)
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

	@GraphQLField(
		description = "A write-only property that specifies the default permissions."
	)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	protected ViewableBy viewableBy;

	private Supplier<ViewableBy> _viewableBySupplier = () -> null;

	@Schema(
		description = "The ID of the wiki node to which the wiki page belongs."
	)
	public Long getWikiNodeId() {
		if (wikiNodeId != null) {
			return wikiNodeId;
		}

		wikiNodeId = _wikiNodeIdSupplier.get();

		return wikiNodeId;
	}

	public void setWikiNodeId(Long wikiNodeId) {
		this.wikiNodeId = wikiNodeId;

		_wikiNodeIdSupplier = () -> wikiNodeId;
	}

	@JsonIgnore
	public void setWikiNodeId(
		UnsafeSupplier<Long, Exception> wikiNodeIdUnsafeSupplier) {

		wikiNodeId = null;

		_wikiNodeIdSupplier = () -> {
			try {
				return wikiNodeIdUnsafeSupplier.get();
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
		description = "The ID of the wiki node to which the wiki page belongs."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long wikiNodeId;

	private Supplier<Long> _wikiNodeIdSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WikiPage)) {
			return false;
		}

		WikiPage wikiPage = (WikiPage)object;

		return Objects.equals(toString(), wikiPage.toString());
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

		if (content != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"content\": ");

			sb.append("\"");

			sb.append(_escape(content));

			sb.append("\"");
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

		if (description != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(description));

			sb.append("\"");
		}

		if (encodingFormat != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"encodingFormat\": ");

			sb.append("\"");

			sb.append(_escape(encodingFormat));

			sb.append("\"");
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

		if (headline != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"headline\": ");

			sb.append("\"");

			sb.append(_escape(headline));

			sb.append("\"");
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

		if (numberOfAttachments != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfAttachments\": ");

			sb.append(numberOfAttachments);
		}

		if (numberOfWikiPages != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfWikiPages\": ");

			sb.append(numberOfWikiPages);
		}

		if (parentWikiPageId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parentWikiPageId\": ");

			sb.append(parentWikiPageId);
		}

		if (relatedContents != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"relatedContents\": ");

			sb.append("[");

			for (int i = 0; i < relatedContents.length; i++) {
				sb.append(String.valueOf(relatedContents[i]));

				if ((i + 1) < relatedContents.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (siteId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siteId\": ");

			sb.append(siteId);
		}

		if (subscribed != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subscribed\": ");

			sb.append(subscribed);
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

		if (viewableBy != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"viewableBy\": ");

			sb.append("\"");

			sb.append(viewableBy);

			sb.append("\"");
		}

		if (wikiNodeId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"wikiNodeId\": ");

			sb.append(wikiNodeId);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.delivery.dto.v1_0.WikiPage",
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