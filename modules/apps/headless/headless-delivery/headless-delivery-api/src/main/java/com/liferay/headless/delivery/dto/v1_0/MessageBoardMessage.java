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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "Represents a message on a message board. Properties follow the [Discussion Forum Posting](https://schema.org/DiscussionForumPosting) specification.",
	value = "MessageBoardMessage"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "MessageBoardMessage")
public class MessageBoardMessage implements Serializable {

	public static MessageBoardMessage toDTO(String json) {
		return ObjectMapperUtil.readValue(MessageBoardMessage.class, json);
	}

	public static MessageBoardMessage unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			MessageBoardMessage.class, json);
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

	@Schema(description = "The message's average rating.")
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

	@GraphQLField(description = "The message's average rating.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected AggregateRating aggregateRating;

	private Supplier<AggregateRating> _aggregateRatingSupplier = () -> null;

	@Schema(
		description = "A flag that indicates whether the message's author is anonymous."
	)
	public Boolean getAnonymous() {
		if (anonymous != null) {
			return anonymous;
		}

		anonymous = _anonymousSupplier.get();

		return anonymous;
	}

	public void setAnonymous(Boolean anonymous) {
		this.anonymous = anonymous;

		_anonymousSupplier = () -> anonymous;
	}

	@JsonIgnore
	public void setAnonymous(
		UnsafeSupplier<Boolean, Exception> anonymousUnsafeSupplier) {

		anonymous = null;

		_anonymousSupplier = () -> {
			try {
				return anonymousUnsafeSupplier.get();
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
		description = "A flag that indicates whether the message's author is anonymous."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean anonymous;

	private Supplier<Boolean> _anonymousSupplier = () -> null;

	@Schema(description = "The message's main content.")
	public String getArticleBody() {
		if (articleBody != null) {
			return articleBody;
		}

		articleBody = _articleBodySupplier.get();

		return articleBody;
	}

	public void setArticleBody(String articleBody) {
		this.articleBody = articleBody;

		_articleBodySupplier = () -> articleBody;
	}

	@JsonIgnore
	public void setArticleBody(
		UnsafeSupplier<String, Exception> articleBodyUnsafeSupplier) {

		articleBody = null;

		_articleBodySupplier = () -> {
			try {
				return articleBodyUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The message's main content.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String articleBody;

	private Supplier<String> _articleBodySupplier = () -> null;

	@Schema(description = "The message's author.")
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

	@GraphQLField(description = "The message's author.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Creator creator;

	private Supplier<Creator> _creatorSupplier = () -> null;

	@Schema(
		description = "The message's creator statistics (rank, join date, number of posts, ...)"
	)
	@Valid
	public CreatorStatistics getCreatorStatistics() {
		if (creatorStatistics != null) {
			return creatorStatistics;
		}

		creatorStatistics = _creatorStatisticsSupplier.get();

		return creatorStatistics;
	}

	public void setCreatorStatistics(CreatorStatistics creatorStatistics) {
		this.creatorStatistics = creatorStatistics;

		_creatorStatisticsSupplier = () -> creatorStatistics;
	}

	@JsonIgnore
	public void setCreatorStatistics(
		UnsafeSupplier<CreatorStatistics, Exception>
			creatorStatisticsUnsafeSupplier) {

		creatorStatistics = null;

		_creatorStatisticsSupplier = () -> {
			try {
				return creatorStatisticsUnsafeSupplier.get();
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
		description = "The message's creator statistics (rank, join date, number of posts, ...)"
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected CreatorStatistics creatorStatistics;

	private Supplier<CreatorStatistics> _creatorStatisticsSupplier = () -> null;

	@Schema(
		description = "A list of the custom fields associated with the blog post."
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
		description = "A list of the custom fields associated with the blog post."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected CustomField[] customFields;

	private Supplier<CustomField[]> _customFieldsSupplier = () -> null;

	@Schema(description = "The date the message was created.")
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

	@GraphQLField(description = "The date the message was created.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateCreated;

	private Supplier<Date> _dateCreatedSupplier = () -> null;

	@Schema(
		description = "The last time the content or metadata of the message was changed."
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
		description = "The last time the content or metadata of the message was changed."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateModified;

	private Supplier<Date> _dateModifiedSupplier = () -> null;

	@Schema(
		description = "The message's media format (e.g., HTML, BBCode, etc.)."
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
		description = "The message's media format (e.g., HTML, BBCode, etc.)."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String encodingFormat;

	private Supplier<String> _encodingFormatSupplier = () -> null;

	@Schema(description = "The message's external reference code.")
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

	@GraphQLField(description = "The message's external reference code.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String externalReferenceCode;

	private Supplier<String> _externalReferenceCodeSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String friendlyUrlPath;

	private Supplier<String> _friendlyUrlPathSupplier = () -> null;

	@Schema
	public Boolean getHasCompanyMx() {
		if (hasCompanyMx != null) {
			return hasCompanyMx;
		}

		hasCompanyMx = _hasCompanyMxSupplier.get();

		return hasCompanyMx;
	}

	public void setHasCompanyMx(Boolean hasCompanyMx) {
		this.hasCompanyMx = hasCompanyMx;

		_hasCompanyMxSupplier = () -> hasCompanyMx;
	}

	@JsonIgnore
	public void setHasCompanyMx(
		UnsafeSupplier<Boolean, Exception> hasCompanyMxUnsafeSupplier) {

		hasCompanyMx = null;

		_hasCompanyMxSupplier = () -> {
			try {
				return hasCompanyMxUnsafeSupplier.get();
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
	protected Boolean hasCompanyMx;

	private Supplier<Boolean> _hasCompanyMxSupplier = () -> null;

	@Schema(description = "The message's main title.")
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

	@GraphQLField(description = "The message's main title.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String headline;

	private Supplier<String> _headlineSupplier = () -> null;

	@Schema(description = "The message's ID.")
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

	@GraphQLField(description = "The message's ID.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema(description = "A list of keywords describing the message.")
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

	@GraphQLField(description = "A list of keywords describing the message.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String[] keywords;

	private Supplier<String[]> _keywordsSupplier = () -> null;

	@Schema(
		description = "The ID of the Message Board Section to which this message is scoped."
	)
	public Long getMessageBoardSectionId() {
		if (messageBoardSectionId != null) {
			return messageBoardSectionId;
		}

		messageBoardSectionId = _messageBoardSectionIdSupplier.get();

		return messageBoardSectionId;
	}

	public void setMessageBoardSectionId(Long messageBoardSectionId) {
		this.messageBoardSectionId = messageBoardSectionId;

		_messageBoardSectionIdSupplier = () -> messageBoardSectionId;
	}

	@JsonIgnore
	public void setMessageBoardSectionId(
		UnsafeSupplier<Long, Exception> messageBoardSectionIdUnsafeSupplier) {

		messageBoardSectionId = null;

		_messageBoardSectionIdSupplier = () -> {
			try {
				return messageBoardSectionIdUnsafeSupplier.get();
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
		description = "The ID of the Message Board Section to which this message is scoped."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long messageBoardSectionId;

	private Supplier<Long> _messageBoardSectionIdSupplier = () -> null;

	@Schema(
		description = "The ID of the Message Board Thread to which this message is scoped."
	)
	public Long getMessageBoardThreadId() {
		if (messageBoardThreadId != null) {
			return messageBoardThreadId;
		}

		messageBoardThreadId = _messageBoardThreadIdSupplier.get();

		return messageBoardThreadId;
	}

	public void setMessageBoardThreadId(Long messageBoardThreadId) {
		this.messageBoardThreadId = messageBoardThreadId;

		_messageBoardThreadIdSupplier = () -> messageBoardThreadId;
	}

	@JsonIgnore
	public void setMessageBoardThreadId(
		UnsafeSupplier<Long, Exception> messageBoardThreadIdUnsafeSupplier) {

		messageBoardThreadId = null;

		_messageBoardThreadIdSupplier = () -> {
			try {
				return messageBoardThreadIdUnsafeSupplier.get();
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
		description = "The ID of the Message Board Thread to which this message is scoped."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long messageBoardThreadId;

	private Supplier<Long> _messageBoardThreadIdSupplier = () -> null;

	@Schema
	public Boolean getModified() {
		if (modified != null) {
			return modified;
		}

		modified = _modifiedSupplier.get();

		return modified;
	}

	public void setModified(Boolean modified) {
		this.modified = modified;

		_modifiedSupplier = () -> modified;
	}

	@JsonIgnore
	public void setModified(
		UnsafeSupplier<Boolean, Exception> modifiedUnsafeSupplier) {

		modified = null;

		_modifiedSupplier = () -> {
			try {
				return modifiedUnsafeSupplier.get();
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
	protected Boolean modified;

	private Supplier<Boolean> _modifiedSupplier = () -> null;

	@Schema(description = "The number of the message's attachments.")
	public Integer getNumberOfMessageBoardAttachments() {
		if (numberOfMessageBoardAttachments != null) {
			return numberOfMessageBoardAttachments;
		}

		numberOfMessageBoardAttachments =
			_numberOfMessageBoardAttachmentsSupplier.get();

		return numberOfMessageBoardAttachments;
	}

	public void setNumberOfMessageBoardAttachments(
		Integer numberOfMessageBoardAttachments) {

		this.numberOfMessageBoardAttachments = numberOfMessageBoardAttachments;

		_numberOfMessageBoardAttachmentsSupplier =
			() -> numberOfMessageBoardAttachments;
	}

	@JsonIgnore
	public void setNumberOfMessageBoardAttachments(
		UnsafeSupplier<Integer, Exception>
			numberOfMessageBoardAttachmentsUnsafeSupplier) {

		numberOfMessageBoardAttachments = null;

		_numberOfMessageBoardAttachmentsSupplier = () -> {
			try {
				return numberOfMessageBoardAttachmentsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The number of the message's attachments.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Integer numberOfMessageBoardAttachments;

	private Supplier<Integer> _numberOfMessageBoardAttachmentsSupplier =
		() -> null;

	@Schema(description = "The number of the message's child messages.")
	public Integer getNumberOfMessageBoardMessages() {
		if (numberOfMessageBoardMessages != null) {
			return numberOfMessageBoardMessages;
		}

		numberOfMessageBoardMessages =
			_numberOfMessageBoardMessagesSupplier.get();

		return numberOfMessageBoardMessages;
	}

	public void setNumberOfMessageBoardMessages(
		Integer numberOfMessageBoardMessages) {

		this.numberOfMessageBoardMessages = numberOfMessageBoardMessages;

		_numberOfMessageBoardMessagesSupplier =
			() -> numberOfMessageBoardMessages;
	}

	@JsonIgnore
	public void setNumberOfMessageBoardMessages(
		UnsafeSupplier<Integer, Exception>
			numberOfMessageBoardMessagesUnsafeSupplier) {

		numberOfMessageBoardMessages = null;

		_numberOfMessageBoardMessagesSupplier = () -> {
			try {
				return numberOfMessageBoardMessagesUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The number of the message's child messages.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Integer numberOfMessageBoardMessages;

	private Supplier<Integer> _numberOfMessageBoardMessagesSupplier =
		() -> null;

	@Schema(description = "The ID of the message's parent, if it exists.")
	public Long getParentMessageBoardMessageId() {
		if (parentMessageBoardMessageId != null) {
			return parentMessageBoardMessageId;
		}

		parentMessageBoardMessageId =
			_parentMessageBoardMessageIdSupplier.get();

		return parentMessageBoardMessageId;
	}

	public void setParentMessageBoardMessageId(
		Long parentMessageBoardMessageId) {

		this.parentMessageBoardMessageId = parentMessageBoardMessageId;

		_parentMessageBoardMessageIdSupplier =
			() -> parentMessageBoardMessageId;
	}

	@JsonIgnore
	public void setParentMessageBoardMessageId(
		UnsafeSupplier<Long, Exception>
			parentMessageBoardMessageIdUnsafeSupplier) {

		parentMessageBoardMessageId = null;

		_parentMessageBoardMessageIdSupplier = () -> {
			try {
				return parentMessageBoardMessageIdUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The ID of the message's parent, if it exists.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long parentMessageBoardMessageId;

	private Supplier<Long> _parentMessageBoardMessageIdSupplier = () -> null;

	@Schema(description = "A list of related contents to this message.")
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

	@GraphQLField(description = "A list of related contents to this message.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected RelatedContent[] relatedContents;

	private Supplier<RelatedContent[]> _relatedContentsSupplier = () -> null;

	@Schema(
		description = "A flag that indicates whether the message is answering a question."
	)
	public Boolean getShowAsAnswer() {
		if (showAsAnswer != null) {
			return showAsAnswer;
		}

		showAsAnswer = _showAsAnswerSupplier.get();

		return showAsAnswer;
	}

	public void setShowAsAnswer(Boolean showAsAnswer) {
		this.showAsAnswer = showAsAnswer;

		_showAsAnswerSupplier = () -> showAsAnswer;
	}

	@JsonIgnore
	public void setShowAsAnswer(
		UnsafeSupplier<Boolean, Exception> showAsAnswerUnsafeSupplier) {

		showAsAnswer = null;

		_showAsAnswerSupplier = () -> {
			try {
				return showAsAnswerUnsafeSupplier.get();
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
		description = "A flag that indicates whether the message is answering a question."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean showAsAnswer;

	private Supplier<Boolean> _showAsAnswerSupplier = () -> null;

	@Schema(description = "The ID of the site to which this message is scoped.")
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
		description = "The ID of the site to which this message is scoped."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long siteId;

	private Supplier<Long> _siteIdSupplier = () -> null;

	@Schema(description = "The message's status.")
	public String getStatus() {
		if (status != null) {
			return status;
		}

		status = _statusSupplier.get();

		return status;
	}

	public void setStatus(String status) {
		this.status = status;

		_statusSupplier = () -> status;
	}

	@JsonIgnore
	public void setStatus(
		UnsafeSupplier<String, Exception> statusUnsafeSupplier) {

		status = null;

		_statusSupplier = () -> {
			try {
				return statusUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The message's status.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String status;

	private Supplier<String> _statusSupplier = () -> null;

	@Schema(
		description = "A flag that indicates whether the user making the requests is subscribed to this message."
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
		description = "A flag that indicates whether the user making the requests is subscribed to this message."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Boolean subscribed;

	private Supplier<Boolean> _subscribedSupplier = () -> null;

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

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MessageBoardMessage)) {
			return false;
		}

		MessageBoardMessage messageBoardMessage = (MessageBoardMessage)object;

		return Objects.equals(toString(), messageBoardMessage.toString());
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

		if (anonymous != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"anonymous\": ");

			sb.append(anonymous);
		}

		if (articleBody != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"articleBody\": ");

			sb.append("\"");

			sb.append(_escape(articleBody));

			sb.append("\"");
		}

		if (creator != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"creator\": ");

			sb.append(String.valueOf(creator));
		}

		if (creatorStatistics != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"creatorStatistics\": ");

			sb.append(String.valueOf(creatorStatistics));
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

		if (friendlyUrlPath != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"friendlyUrlPath\": ");

			sb.append("\"");

			sb.append(_escape(friendlyUrlPath));

			sb.append("\"");
		}

		if (hasCompanyMx != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"hasCompanyMx\": ");

			sb.append(hasCompanyMx);
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

		if (messageBoardSectionId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"messageBoardSectionId\": ");

			sb.append(messageBoardSectionId);
		}

		if (messageBoardThreadId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"messageBoardThreadId\": ");

			sb.append(messageBoardThreadId);
		}

		if (modified != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modified\": ");

			sb.append(modified);
		}

		if (numberOfMessageBoardAttachments != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfMessageBoardAttachments\": ");

			sb.append(numberOfMessageBoardAttachments);
		}

		if (numberOfMessageBoardMessages != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfMessageBoardMessages\": ");

			sb.append(numberOfMessageBoardMessages);
		}

		if (parentMessageBoardMessageId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parentMessageBoardMessageId\": ");

			sb.append(parentMessageBoardMessageId);
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

		if (showAsAnswer != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"showAsAnswer\": ");

			sb.append(showAsAnswer);
		}

		if (siteId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siteId\": ");

			sb.append(siteId);
		}

		if (status != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append("\"");

			sb.append(_escape(status));

			sb.append("\"");
		}

		if (subscribed != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subscribed\": ");

			sb.append(subscribed);
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
		defaultValue = "com.liferay.headless.delivery.dto.v1_0.MessageBoardMessage",
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