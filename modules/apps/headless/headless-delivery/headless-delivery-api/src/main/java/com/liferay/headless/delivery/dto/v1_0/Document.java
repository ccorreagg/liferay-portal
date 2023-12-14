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
	description = "Represents a Document Library file, storing binary and metadata information. Properties follow the [MediaObject](https://schema.org/MediaObject) specification.",
	value = "Document"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Document")
public class Document implements Serializable {

	public static Document toDTO(String json) {
		return ObjectMapperUtil.readValue(Document.class, json);
	}

	public static Document unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Document.class, json);
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

	@Schema(
		description = "An array of images in several resolutions and sizes, created by the Adaptive Media framework."
	)
	@Valid
	public AdaptedImage[] getAdaptedImages() {
		if (adaptedImages != null) {
			return adaptedImages;
		}

		adaptedImages = _adaptedImagesSupplier.get();

		return adaptedImages;
	}

	public void setAdaptedImages(AdaptedImage[] adaptedImages) {
		this.adaptedImages = adaptedImages;

		_adaptedImagesSupplier = () -> adaptedImages;
	}

	@JsonIgnore
	public void setAdaptedImages(
		UnsafeSupplier<AdaptedImage[], Exception> adaptedImagesUnsafeSupplier) {

		adaptedImages = null;

		_adaptedImagesSupplier = () -> {
			try {
				return adaptedImagesUnsafeSupplier.get();
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
		description = "An array of images in several resolutions and sizes, created by the Adaptive Media framework."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected AdaptedImage[] adaptedImages;

	private Supplier<AdaptedImage[]> _adaptedImagesSupplier = () -> null;

	@Schema(description = "The document's average rating.")
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

	@GraphQLField(description = "The document's average rating.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected AggregateRating aggregateRating;

	private Supplier<AggregateRating> _aggregateRatingSupplier = () -> null;

	@Schema(
		description = "The key of the asset library to which the document is scoped."
	)
	public String getAssetLibraryKey() {
		if (assetLibraryKey != null) {
			return assetLibraryKey;
		}

		assetLibraryKey = _assetLibraryKeySupplier.get();

		return assetLibraryKey;
	}

	public void setAssetLibraryKey(String assetLibraryKey) {
		this.assetLibraryKey = assetLibraryKey;

		_assetLibraryKeySupplier = () -> assetLibraryKey;
	}

	@JsonIgnore
	public void setAssetLibraryKey(
		UnsafeSupplier<String, Exception> assetLibraryKeyUnsafeSupplier) {

		assetLibraryKey = null;

		_assetLibraryKeySupplier = () -> {
			try {
				return assetLibraryKeyUnsafeSupplier.get();
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
		description = "The key of the asset library to which the document is scoped."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String assetLibraryKey;

	private Supplier<String> _assetLibraryKeySupplier = () -> null;

	@Schema(description = "The document's relative URL.")
	public String getContentUrl() {
		if (contentUrl != null) {
			return contentUrl;
		}

		contentUrl = _contentUrlSupplier.get();

		return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;

		_contentUrlSupplier = () -> contentUrl;
	}

	@JsonIgnore
	public void setContentUrl(
		UnsafeSupplier<String, Exception> contentUrlUnsafeSupplier) {

		contentUrl = null;

		_contentUrlSupplier = () -> {
			try {
				return contentUrlUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The document's relative URL.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String contentUrl;

	private Supplier<String> _contentUrlSupplier = () -> null;

	@Schema(
		description = "The optional field with the content of the document in Base64, can be embedded with nestedFields."
	)
	public String getContentValue() {
		if (contentValue != null) {
			return contentValue;
		}

		contentValue = _contentValueSupplier.get();

		return contentValue;
	}

	public void setContentValue(String contentValue) {
		this.contentValue = contentValue;

		_contentValueSupplier = () -> contentValue;
	}

	@JsonIgnore
	public void setContentValue(
		UnsafeSupplier<String, Exception> contentValueUnsafeSupplier) {

		contentValue = null;

		_contentValueSupplier = () -> {
			try {
				return contentValueUnsafeSupplier.get();
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
		description = "The optional field with the content of the document in Base64, can be embedded with nestedFields."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String contentValue;

	private Supplier<String> _contentValueSupplier = () -> null;

	@Schema(description = "The document's creator.")
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

	@GraphQLField(description = "The document's creator.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Creator creator;

	private Supplier<Creator> _creatorSupplier = () -> null;

	@Schema(
		description = "A list of the custom fields associated with the document."
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
		description = "A list of the custom fields associated with the document."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected CustomField[] customFields;

	private Supplier<CustomField[]> _customFieldsSupplier = () -> null;

	@Schema(description = "The document's creation date.")
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

	@GraphQLField(description = "The document's creation date.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateCreated;

	private Supplier<Date> _dateCreatedSupplier = () -> null;

	@Schema(description = "The last time a field of the document changed.")
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
		description = "The last time a field of the document changed."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dateModified;

	private Supplier<Date> _dateModifiedSupplier = () -> null;

	@Schema(description = "The document's description.")
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

	@GraphQLField(description = "The document's description.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String description;

	private Supplier<String> _descriptionSupplier = () -> null;

	@Schema(
		description = "The ID of the `DocumentFolder` where this document is stored."
	)
	public Long getDocumentFolderId() {
		if (documentFolderId != null) {
			return documentFolderId;
		}

		documentFolderId = _documentFolderIdSupplier.get();

		return documentFolderId;
	}

	public void setDocumentFolderId(Long documentFolderId) {
		this.documentFolderId = documentFolderId;

		_documentFolderIdSupplier = () -> documentFolderId;
	}

	@JsonIgnore
	public void setDocumentFolderId(
		UnsafeSupplier<Long, Exception> documentFolderIdUnsafeSupplier) {

		documentFolderId = null;

		_documentFolderIdSupplier = () -> {
			try {
				return documentFolderIdUnsafeSupplier.get();
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
		description = "The ID of the `DocumentFolder` where this document is stored."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long documentFolderId;

	private Supplier<Long> _documentFolderIdSupplier = () -> null;

	@Schema
	@Valid
	public DocumentType getDocumentType() {
		if (documentType != null) {
			return documentType;
		}

		documentType = _documentTypeSupplier.get();

		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;

		_documentTypeSupplier = () -> documentType;
	}

	@JsonIgnore
	public void setDocumentType(
		UnsafeSupplier<DocumentType, Exception> documentTypeUnsafeSupplier) {

		documentType = null;

		_documentTypeSupplier = () -> {
			try {
				return documentTypeUnsafeSupplier.get();
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
	protected DocumentType documentType;

	private Supplier<DocumentType> _documentTypeSupplier = () -> null;

	@Schema(
		description = "The document's content type (e.g., `application/pdf`, etc.)."
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
		description = "The document's content type (e.g., `application/pdf`, etc.)."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String encodingFormat;

	private Supplier<String> _encodingFormatSupplier = () -> null;

	@Schema(description = "The document's external reference code.")
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

	@GraphQLField(description = "The document's external reference code.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String externalReferenceCode;

	private Supplier<String> _externalReferenceCodeSupplier = () -> null;

	@Schema(description = "The document's file extension.")
	public String getFileExtension() {
		if (fileExtension != null) {
			return fileExtension;
		}

		fileExtension = _fileExtensionSupplier.get();

		return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;

		_fileExtensionSupplier = () -> fileExtension;
	}

	@JsonIgnore
	public void setFileExtension(
		UnsafeSupplier<String, Exception> fileExtensionUnsafeSupplier) {

		fileExtension = null;

		_fileExtensionSupplier = () -> {
			try {
				return fileExtensionUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The document's file extension.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String fileExtension;

	private Supplier<String> _fileExtensionSupplier = () -> null;

	@Schema(description = "The document's file name.")
	public String getFileName() {
		if (fileName != null) {
			return fileName;
		}

		fileName = _fileNameSupplier.get();

		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;

		_fileNameSupplier = () -> fileName;
	}

	@JsonIgnore
	public void setFileName(
		UnsafeSupplier<String, Exception> fileNameUnsafeSupplier) {

		fileName = null;

		_fileNameSupplier = () -> {
			try {
				return fileNameUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The document's file name.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String fileName;

	private Supplier<String> _fileNameSupplier = () -> null;

	@Schema(description = "The document's ID.")
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

	@GraphQLField(description = "The document's ID.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema(description = "A list of keywords describing the document.")
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

	@GraphQLField(description = "A list of keywords describing the document.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String[] keywords;

	private Supplier<String[]> _keywordsSupplier = () -> null;

	@Schema(description = "The number of comments on the document.")
	public Integer getNumberOfComments() {
		if (numberOfComments != null) {
			return numberOfComments;
		}

		numberOfComments = _numberOfCommentsSupplier.get();

		return numberOfComments;
	}

	public void setNumberOfComments(Integer numberOfComments) {
		this.numberOfComments = numberOfComments;

		_numberOfCommentsSupplier = () -> numberOfComments;
	}

	@JsonIgnore
	public void setNumberOfComments(
		UnsafeSupplier<Integer, Exception> numberOfCommentsUnsafeSupplier) {

		numberOfComments = null;

		_numberOfCommentsSupplier = () -> {
			try {
				return numberOfCommentsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The number of comments on the document.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Integer numberOfComments;

	private Supplier<Integer> _numberOfCommentsSupplier = () -> null;

	@Schema(description = "A list of related contents to this document.")
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

	@GraphQLField(description = "A list of related contents to this document.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected RelatedContent[] relatedContents;

	private Supplier<RelatedContent[]> _relatedContentsSupplier = () -> null;

	@Schema(
		description = "A list of rendered documents, which results from using a display page to process the document and return HTML."
	)
	@Valid
	public RenderedContent[] getRenderedContents() {
		if (renderedContents != null) {
			return renderedContents;
		}

		renderedContents = _renderedContentsSupplier.get();

		return renderedContents;
	}

	public void setRenderedContents(RenderedContent[] renderedContents) {
		this.renderedContents = renderedContents;

		_renderedContentsSupplier = () -> renderedContents;
	}

	@JsonIgnore
	public void setRenderedContents(
		UnsafeSupplier<RenderedContent[], Exception>
			renderedContentsUnsafeSupplier) {

		renderedContents = null;

		_renderedContentsSupplier = () -> {
			try {
				return renderedContentsUnsafeSupplier.get();
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
		description = "A list of rendered documents, which results from using a display page to process the document and return HTML."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected RenderedContent[] renderedContents;

	private Supplier<RenderedContent[]> _renderedContentsSupplier = () -> null;

	@Schema(
		description = "The ID of the site to which this document is scoped."
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
		description = "The ID of the site to which this document is scoped."
	)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long siteId;

	private Supplier<Long> _siteIdSupplier = () -> null;

	@Schema(description = "The document's size in bytes.")
	public Long getSizeInBytes() {
		if (sizeInBytes != null) {
			return sizeInBytes;
		}

		sizeInBytes = _sizeInBytesSupplier.get();

		return sizeInBytes;
	}

	public void setSizeInBytes(Long sizeInBytes) {
		this.sizeInBytes = sizeInBytes;

		_sizeInBytesSupplier = () -> sizeInBytes;
	}

	@JsonIgnore
	public void setSizeInBytes(
		UnsafeSupplier<Long, Exception> sizeInBytesUnsafeSupplier) {

		sizeInBytes = null;

		_sizeInBytesSupplier = () -> {
			try {
				return sizeInBytesUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The document's size in bytes.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long sizeInBytes;

	private Supplier<Long> _sizeInBytesSupplier = () -> null;

	@Schema(description = "The categories associated with this document.")
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

	@GraphQLField(description = "The categories associated with this document.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected TaxonomyCategoryBrief[] taxonomyCategoryBriefs;

	private Supplier<TaxonomyCategoryBrief[]> _taxonomyCategoryBriefsSupplier =
		() -> null;

	@Schema(
		description = "A write-only field that adds `TaxonomyCategory` instances to the document."
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
		description = "A write-only field that adds `TaxonomyCategory` instances to the document."
	)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	protected Long[] taxonomyCategoryIds;

	private Supplier<Long[]> _taxonomyCategoryIdsSupplier = () -> null;

	@Schema(description = "The document's main title/name.")
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

	@GraphQLField(description = "The document's main title/name.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String title;

	private Supplier<String> _titleSupplier = () -> null;

	@Schema(
		description = "A write-only property that specifies the document's default permissions."
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
		description = "A write-only property that specifies the document's default permissions."
	)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	protected ViewableBy viewableBy;

	private Supplier<ViewableBy> _viewableBySupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Document)) {
			return false;
		}

		Document document = (Document)object;

		return Objects.equals(toString(), document.toString());
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

		if (adaptedImages != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"adaptedImages\": ");

			sb.append("[");

			for (int i = 0; i < adaptedImages.length; i++) {
				sb.append(String.valueOf(adaptedImages[i]));

				if ((i + 1) < adaptedImages.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (aggregateRating != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"aggregateRating\": ");

			sb.append(String.valueOf(aggregateRating));
		}

		if (assetLibraryKey != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assetLibraryKey\": ");

			sb.append("\"");

			sb.append(_escape(assetLibraryKey));

			sb.append("\"");
		}

		if (contentUrl != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"contentUrl\": ");

			sb.append("\"");

			sb.append(_escape(contentUrl));

			sb.append("\"");
		}

		if (contentValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"contentValue\": ");

			sb.append("\"");

			sb.append(_escape(contentValue));

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

		if (documentFolderId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"documentFolderId\": ");

			sb.append(documentFolderId);
		}

		if (documentType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"documentType\": ");

			sb.append(String.valueOf(documentType));
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

		if (fileExtension != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileExtension\": ");

			sb.append("\"");

			sb.append(_escape(fileExtension));

			sb.append("\"");
		}

		if (fileName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileName\": ");

			sb.append("\"");

			sb.append(_escape(fileName));

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

		if (numberOfComments != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfComments\": ");

			sb.append(numberOfComments);
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

		if (renderedContents != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"renderedContents\": ");

			sb.append("[");

			for (int i = 0; i < renderedContents.length; i++) {
				sb.append(String.valueOf(renderedContents[i]));

				if ((i + 1) < renderedContents.length) {
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

		if (sizeInBytes != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sizeInBytes\": ");

			sb.append(sizeInBytes);
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
		defaultValue = "com.liferay.headless.delivery.dto.v1_0.Document",
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