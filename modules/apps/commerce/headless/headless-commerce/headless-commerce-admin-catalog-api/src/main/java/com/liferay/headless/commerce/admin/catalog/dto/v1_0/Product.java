/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.catalog.dto.v1_0;

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
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Zoltán Takács
 * @generated
 */
@Generated("")
@GraphQLName("Product")
@JsonFilter("Liferay.Vulcan")
@Schema(requiredProperties = {"active", "catalogId", "name", "productType"})
@XmlRootElement(name = "Product")
public class Product implements Serializable {

	public static Product toDTO(String json) {
		return ObjectMapperUtil.readValue(Product.class, json);
	}

	public static Product unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Product.class, json);
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
	@NotNull
	protected Boolean active;

	private Supplier<Boolean> _activeSupplier = () -> null;

	@Schema
	@Valid
	public Attachment[] getAttachments() {
		if (attachments != null) {
			return attachments;
		}

		attachments = _attachmentsSupplier.get();

		return attachments;
	}

	public void setAttachments(Attachment[] attachments) {
		this.attachments = attachments;

		_attachmentsSupplier = () -> attachments;
	}

	@JsonIgnore
	public void setAttachments(
		UnsafeSupplier<Attachment[], Exception> attachmentsUnsafeSupplier) {

		attachments = null;

		_attachmentsSupplier = () -> {
			try {
				return attachmentsUnsafeSupplier.get();
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
	protected Attachment[] attachments;

	private Supplier<Attachment[]> _attachmentsSupplier = () -> null;

	@Schema
	@Valid
	public Catalog getCatalog() {
		if (catalog != null) {
			return catalog;
		}

		catalog = _catalogSupplier.get();

		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;

		_catalogSupplier = () -> catalog;
	}

	@JsonIgnore
	public void setCatalog(
		UnsafeSupplier<Catalog, Exception> catalogUnsafeSupplier) {

		catalog = null;

		_catalogSupplier = () -> {
			try {
				return catalogUnsafeSupplier.get();
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
	protected Catalog catalog;

	private Supplier<Catalog> _catalogSupplier = () -> null;

	@DecimalMin("0")
	@Schema(example = "30054")
	public Long getCatalogId() {
		if (catalogId != null) {
			return catalogId;
		}

		catalogId = _catalogIdSupplier.get();

		return catalogId;
	}

	public void setCatalogId(Long catalogId) {
		this.catalogId = catalogId;

		_catalogIdSupplier = () -> catalogId;
	}

	@JsonIgnore
	public void setCatalogId(
		UnsafeSupplier<Long, Exception> catalogIdUnsafeSupplier) {

		catalogId = null;

		_catalogIdSupplier = () -> {
			try {
				return catalogIdUnsafeSupplier.get();
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
	@NotNull
	protected Long catalogId;

	private Supplier<Long> _catalogIdSupplier = () -> null;

	@Schema
	@Valid
	public Category[] getCategories() {
		if (categories != null) {
			return categories;
		}

		categories = _categoriesSupplier.get();

		return categories;
	}

	public void setCategories(Category[] categories) {
		this.categories = categories;

		_categoriesSupplier = () -> categories;
	}

	@JsonIgnore
	public void setCategories(
		UnsafeSupplier<Category[], Exception> categoriesUnsafeSupplier) {

		categories = null;

		_categoriesSupplier = () -> {
			try {
				return categoriesUnsafeSupplier.get();
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
	protected Category[] categories;

	private Supplier<Category[]> _categoriesSupplier = () -> null;

	@Schema(example = "2017-07-21")
	public Date getCreateDate() {
		if (createDate != null) {
			return createDate;
		}

		createDate = _createDateSupplier.get();

		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;

		_createDateSupplier = () -> createDate;
	}

	@JsonIgnore
	public void setCreateDate(
		UnsafeSupplier<Date, Exception> createDateUnsafeSupplier) {

		createDate = null;

		_createDateSupplier = () -> {
			try {
				return createDateUnsafeSupplier.get();
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
	protected Date createDate;

	private Supplier<Date> _createDateSupplier = () -> null;

	@Schema
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

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected CustomField[] customFields;

	private Supplier<CustomField[]> _customFieldsSupplier = () -> null;

	@Schema(example = "Blue handle, 00001l, 70cm, lifetime warranty")
	public String getDefaultSku() {
		if (defaultSku != null) {
			return defaultSku;
		}

		defaultSku = _defaultSkuSupplier.get();

		return defaultSku;
	}

	public void setDefaultSku(String defaultSku) {
		this.defaultSku = defaultSku;

		_defaultSkuSupplier = () -> defaultSku;
	}

	@JsonIgnore
	public void setDefaultSku(
		UnsafeSupplier<String, Exception> defaultSkuUnsafeSupplier) {

		defaultSku = null;

		_defaultSkuSupplier = () -> {
			try {
				return defaultSkuUnsafeSupplier.get();
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
	protected String defaultSku;

	private Supplier<String> _defaultSkuSupplier = () -> null;

	@Schema(
		example = "{hu_HU=Product Description HU, hr_HR=Product Description HR, en_US=Professional hand stainless steel saw for wood. Made to last and saw forever. Made of best steel}"
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

	@Schema
	@Valid
	public Diagram getDiagram() {
		if (diagram != null) {
			return diagram;
		}

		diagram = _diagramSupplier.get();

		return diagram;
	}

	public void setDiagram(Diagram diagram) {
		this.diagram = diagram;

		_diagramSupplier = () -> diagram;
	}

	@JsonIgnore
	public void setDiagram(
		UnsafeSupplier<Diagram, Exception> diagramUnsafeSupplier) {

		diagram = null;

		_diagramSupplier = () -> {
			try {
				return diagramUnsafeSupplier.get();
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
	protected Diagram diagram;

	private Supplier<Diagram> _diagramSupplier = () -> null;

	@Schema(example = "2017-07-21")
	public Date getDisplayDate() {
		if (displayDate != null) {
			return displayDate;
		}

		displayDate = _displayDateSupplier.get();

		return displayDate;
	}

	public void setDisplayDate(Date displayDate) {
		this.displayDate = displayDate;

		_displayDateSupplier = () -> displayDate;
	}

	@JsonIgnore
	public void setDisplayDate(
		UnsafeSupplier<Date, Exception> displayDateUnsafeSupplier) {

		displayDate = null;

		_displayDateSupplier = () -> {
			try {
				return displayDateUnsafeSupplier.get();
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
	protected Date displayDate;

	private Supplier<Date> _displayDateSupplier = () -> null;

	@Schema
	@Valid
	public Map<String, ?> getExpando() {
		if (expando != null) {
			return expando;
		}

		expando = _expandoSupplier.get();

		return expando;
	}

	public void setExpando(Map<String, ?> expando) {
		this.expando = expando;

		_expandoSupplier = () -> expando;
	}

	@JsonIgnore
	public void setExpando(
		UnsafeSupplier<Map<String, ?>, Exception> expandoUnsafeSupplier) {

		expando = null;

		_expandoSupplier = () -> {
			try {
				return expandoUnsafeSupplier.get();
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
	protected Map<String, ?> expando;

	private Supplier<Map<String, ?>> _expandoSupplier = () -> null;

	@Schema(example = "2017-08-21")
	public Date getExpirationDate() {
		if (expirationDate != null) {
			return expirationDate;
		}

		expirationDate = _expirationDateSupplier.get();

		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;

		_expirationDateSupplier = () -> expirationDate;
	}

	@JsonIgnore
	public void setExpirationDate(
		UnsafeSupplier<Date, Exception> expirationDateUnsafeSupplier) {

		expirationDate = null;

		_expirationDateSupplier = () -> {
			try {
				return expirationDateUnsafeSupplier.get();
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
	protected Date expirationDate;

	private Supplier<Date> _expirationDateSupplier = () -> null;

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
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema
	@Valid
	public Attachment[] getImages() {
		if (images != null) {
			return images;
		}

		images = _imagesSupplier.get();

		return images;
	}

	public void setImages(Attachment[] images) {
		this.images = images;

		_imagesSupplier = () -> images;
	}

	@JsonIgnore
	public void setImages(
		UnsafeSupplier<Attachment[], Exception> imagesUnsafeSupplier) {

		images = null;

		_imagesSupplier = () -> {
			try {
				return imagesUnsafeSupplier.get();
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
	protected Attachment[] images;

	private Supplier<Attachment[]> _imagesSupplier = () -> null;

	@Schema
	@Valid
	public LinkedProduct[] getLinkedProducts() {
		if (linkedProducts != null) {
			return linkedProducts;
		}

		linkedProducts = _linkedProductsSupplier.get();

		return linkedProducts;
	}

	public void setLinkedProducts(LinkedProduct[] linkedProducts) {
		this.linkedProducts = linkedProducts;

		_linkedProductsSupplier = () -> linkedProducts;
	}

	@JsonIgnore
	public void setLinkedProducts(
		UnsafeSupplier<LinkedProduct[], Exception>
			linkedProductsUnsafeSupplier) {

		linkedProducts = null;

		_linkedProductsSupplier = () -> {
			try {
				return linkedProductsUnsafeSupplier.get();
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
	protected LinkedProduct[] linkedProducts;

	private Supplier<LinkedProduct[]> _linkedProductsSupplier = () -> null;

	@Schema
	@Valid
	public MappedProduct[] getMappedProducts() {
		if (mappedProducts != null) {
			return mappedProducts;
		}

		mappedProducts = _mappedProductsSupplier.get();

		return mappedProducts;
	}

	public void setMappedProducts(MappedProduct[] mappedProducts) {
		this.mappedProducts = mappedProducts;

		_mappedProductsSupplier = () -> mappedProducts;
	}

	@JsonIgnore
	public void setMappedProducts(
		UnsafeSupplier<MappedProduct[], Exception>
			mappedProductsUnsafeSupplier) {

		mappedProducts = null;

		_mappedProductsSupplier = () -> {
			try {
				return mappedProductsUnsafeSupplier.get();
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
	protected MappedProduct[] mappedProducts;

	private Supplier<MappedProduct[]> _mappedProductsSupplier = () -> null;

	@Schema(
		example = "{en_US=Meta description HU, hr_HR=Meta description HU, hu_HU=Meta description HU}"
	)
	@Valid
	public Map<String, String> getMetaDescription() {
		if (metaDescription != null) {
			return metaDescription;
		}

		metaDescription = _metaDescriptionSupplier.get();

		return metaDescription;
	}

	public void setMetaDescription(Map<String, String> metaDescription) {
		this.metaDescription = metaDescription;

		_metaDescriptionSupplier = () -> metaDescription;
	}

	@JsonIgnore
	public void setMetaDescription(
		UnsafeSupplier<Map<String, String>, Exception>
			metaDescriptionUnsafeSupplier) {

		metaDescription = null;

		_metaDescriptionSupplier = () -> {
			try {
				return metaDescriptionUnsafeSupplier.get();
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
	protected Map<String, String> metaDescription;

	private Supplier<Map<String, String>> _metaDescriptionSupplier = () -> null;

	@Schema(
		example = "{en_US=Meta keyword HU, hr_HR=Meta keyword HU, hu_HU=Meta keyword HU}"
	)
	@Valid
	public Map<String, String> getMetaKeyword() {
		if (metaKeyword != null) {
			return metaKeyword;
		}

		metaKeyword = _metaKeywordSupplier.get();

		return metaKeyword;
	}

	public void setMetaKeyword(Map<String, String> metaKeyword) {
		this.metaKeyword = metaKeyword;

		_metaKeywordSupplier = () -> metaKeyword;
	}

	@JsonIgnore
	public void setMetaKeyword(
		UnsafeSupplier<Map<String, String>, Exception>
			metaKeywordUnsafeSupplier) {

		metaKeyword = null;

		_metaKeywordSupplier = () -> {
			try {
				return metaKeywordUnsafeSupplier.get();
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
	protected Map<String, String> metaKeyword;

	private Supplier<Map<String, String>> _metaKeywordSupplier = () -> null;

	@Schema(
		example = "{en_US=Meta title HU, hr_HR=Meta title HU, hu_HU=Meta title HU}"
	)
	@Valid
	public Map<String, String> getMetaTitle() {
		if (metaTitle != null) {
			return metaTitle;
		}

		metaTitle = _metaTitleSupplier.get();

		return metaTitle;
	}

	public void setMetaTitle(Map<String, String> metaTitle) {
		this.metaTitle = metaTitle;

		_metaTitleSupplier = () -> metaTitle;
	}

	@JsonIgnore
	public void setMetaTitle(
		UnsafeSupplier<Map<String, String>, Exception>
			metaTitleUnsafeSupplier) {

		metaTitle = null;

		_metaTitleSupplier = () -> {
			try {
				return metaTitleUnsafeSupplier.get();
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
	protected Map<String, String> metaTitle;

	private Supplier<Map<String, String>> _metaTitleSupplier = () -> null;

	@Schema(example = "2017-08-21")
	public Date getModifiedDate() {
		if (modifiedDate != null) {
			return modifiedDate;
		}

		modifiedDate = _modifiedDateSupplier.get();

		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;

		_modifiedDateSupplier = () -> modifiedDate;
	}

	@JsonIgnore
	public void setModifiedDate(
		UnsafeSupplier<Date, Exception> modifiedDateUnsafeSupplier) {

		modifiedDate = null;

		_modifiedDateSupplier = () -> {
			try {
				return modifiedDateUnsafeSupplier.get();
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
	protected Date modifiedDate;

	private Supplier<Date> _modifiedDateSupplier = () -> null;

	@Schema(
		example = "{en_US=Hand Saw, hr_HR=Product Name HR, hu_HU=Product Name HU}"
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
	@NotNull
	protected Map<String, String> name;

	private Supplier<Map<String, String>> _nameSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getNeverExpire() {
		if (neverExpire != null) {
			return neverExpire;
		}

		neverExpire = _neverExpireSupplier.get();

		return neverExpire;
	}

	public void setNeverExpire(Boolean neverExpire) {
		this.neverExpire = neverExpire;

		_neverExpireSupplier = () -> neverExpire;
	}

	@JsonIgnore
	public void setNeverExpire(
		UnsafeSupplier<Boolean, Exception> neverExpireUnsafeSupplier) {

		neverExpire = null;

		_neverExpireSupplier = () -> {
			try {
				return neverExpireUnsafeSupplier.get();
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
	protected Boolean neverExpire;

	private Supplier<Boolean> _neverExpireSupplier = () -> null;

	@Schema
	@Valid
	public Pin[] getPins() {
		if (pins != null) {
			return pins;
		}

		pins = _pinsSupplier.get();

		return pins;
	}

	public void setPins(Pin[] pins) {
		this.pins = pins;

		_pinsSupplier = () -> pins;
	}

	@JsonIgnore
	public void setPins(UnsafeSupplier<Pin[], Exception> pinsUnsafeSupplier) {
		pins = null;

		_pinsSupplier = () -> {
			try {
				return pinsUnsafeSupplier.get();
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
	protected Pin[] pins;

	private Supplier<Pin[]> _pinsSupplier = () -> null;

	@Schema(example = "true")
	public Boolean getProductAccountGroupFilter() {
		if (productAccountGroupFilter != null) {
			return productAccountGroupFilter;
		}

		productAccountGroupFilter = _productAccountGroupFilterSupplier.get();

		return productAccountGroupFilter;
	}

	public void setProductAccountGroupFilter(
		Boolean productAccountGroupFilter) {

		this.productAccountGroupFilter = productAccountGroupFilter;

		_productAccountGroupFilterSupplier = () -> productAccountGroupFilter;
	}

	@JsonIgnore
	public void setProductAccountGroupFilter(
		UnsafeSupplier<Boolean, Exception>
			productAccountGroupFilterUnsafeSupplier) {

		productAccountGroupFilter = null;

		_productAccountGroupFilterSupplier = () -> {
			try {
				return productAccountGroupFilterUnsafeSupplier.get();
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
	protected Boolean productAccountGroupFilter;

	private Supplier<Boolean> _productAccountGroupFilterSupplier = () -> null;

	@Schema
	@Valid
	public ProductAccountGroup[] getProductAccountGroups() {
		if (productAccountGroups != null) {
			return productAccountGroups;
		}

		productAccountGroups = _productAccountGroupsSupplier.get();

		return productAccountGroups;
	}

	public void setProductAccountGroups(
		ProductAccountGroup[] productAccountGroups) {

		this.productAccountGroups = productAccountGroups;

		_productAccountGroupsSupplier = () -> productAccountGroups;
	}

	@JsonIgnore
	public void setProductAccountGroups(
		UnsafeSupplier<ProductAccountGroup[], Exception>
			productAccountGroupsUnsafeSupplier) {

		productAccountGroups = null;

		_productAccountGroupsSupplier = () -> {
			try {
				return productAccountGroupsUnsafeSupplier.get();
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
	protected ProductAccountGroup[] productAccountGroups;

	private Supplier<ProductAccountGroup[]> _productAccountGroupsSupplier =
		() -> null;

	@Schema(example = "true")
	public Boolean getProductChannelFilter() {
		if (productChannelFilter != null) {
			return productChannelFilter;
		}

		productChannelFilter = _productChannelFilterSupplier.get();

		return productChannelFilter;
	}

	public void setProductChannelFilter(Boolean productChannelFilter) {
		this.productChannelFilter = productChannelFilter;

		_productChannelFilterSupplier = () -> productChannelFilter;
	}

	@JsonIgnore
	public void setProductChannelFilter(
		UnsafeSupplier<Boolean, Exception> productChannelFilterUnsafeSupplier) {

		productChannelFilter = null;

		_productChannelFilterSupplier = () -> {
			try {
				return productChannelFilterUnsafeSupplier.get();
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
	protected Boolean productChannelFilter;

	private Supplier<Boolean> _productChannelFilterSupplier = () -> null;

	@Schema
	@Valid
	public ProductChannel[] getProductChannels() {
		if (productChannels != null) {
			return productChannels;
		}

		productChannels = _productChannelsSupplier.get();

		return productChannels;
	}

	public void setProductChannels(ProductChannel[] productChannels) {
		this.productChannels = productChannels;

		_productChannelsSupplier = () -> productChannels;
	}

	@JsonIgnore
	public void setProductChannels(
		UnsafeSupplier<ProductChannel[], Exception>
			productChannelsUnsafeSupplier) {

		productChannels = null;

		_productChannelsSupplier = () -> {
			try {
				return productChannelsUnsafeSupplier.get();
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
	protected ProductChannel[] productChannels;

	private Supplier<ProductChannel[]> _productChannelsSupplier = () -> null;

	@Schema
	@Valid
	public ProductConfiguration getProductConfiguration() {
		if (productConfiguration != null) {
			return productConfiguration;
		}

		productConfiguration = _productConfigurationSupplier.get();

		return productConfiguration;
	}

	public void setProductConfiguration(
		ProductConfiguration productConfiguration) {

		this.productConfiguration = productConfiguration;

		_productConfigurationSupplier = () -> productConfiguration;
	}

	@JsonIgnore
	public void setProductConfiguration(
		UnsafeSupplier<ProductConfiguration, Exception>
			productConfigurationUnsafeSupplier) {

		productConfiguration = null;

		_productConfigurationSupplier = () -> {
			try {
				return productConfigurationUnsafeSupplier.get();
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
	protected ProductConfiguration productConfiguration;

	private Supplier<ProductConfiguration> _productConfigurationSupplier =
		() -> null;

	@Schema
	public Long getProductId() {
		if (productId != null) {
			return productId;
		}

		productId = _productIdSupplier.get();

		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;

		_productIdSupplier = () -> productId;
	}

	@JsonIgnore
	public void setProductId(
		UnsafeSupplier<Long, Exception> productIdUnsafeSupplier) {

		productId = null;

		_productIdSupplier = () -> {
			try {
				return productIdUnsafeSupplier.get();
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
	protected Long productId;

	private Supplier<Long> _productIdSupplier = () -> null;

	@Schema
	@Valid
	public ProductOption[] getProductOptions() {
		if (productOptions != null) {
			return productOptions;
		}

		productOptions = _productOptionsSupplier.get();

		return productOptions;
	}

	public void setProductOptions(ProductOption[] productOptions) {
		this.productOptions = productOptions;

		_productOptionsSupplier = () -> productOptions;
	}

	@JsonIgnore
	public void setProductOptions(
		UnsafeSupplier<ProductOption[], Exception>
			productOptionsUnsafeSupplier) {

		productOptions = null;

		_productOptionsSupplier = () -> {
			try {
				return productOptionsUnsafeSupplier.get();
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
	protected ProductOption[] productOptions;

	private Supplier<ProductOption[]> _productOptionsSupplier = () -> null;

	@Schema
	@Valid
	public ProductSpecification[] getProductSpecifications() {
		if (productSpecifications != null) {
			return productSpecifications;
		}

		productSpecifications = _productSpecificationsSupplier.get();

		return productSpecifications;
	}

	public void setProductSpecifications(
		ProductSpecification[] productSpecifications) {

		this.productSpecifications = productSpecifications;

		_productSpecificationsSupplier = () -> productSpecifications;
	}

	@JsonIgnore
	public void setProductSpecifications(
		UnsafeSupplier<ProductSpecification[], Exception>
			productSpecificationsUnsafeSupplier) {

		productSpecifications = null;

		_productSpecificationsSupplier = () -> {
			try {
				return productSpecificationsUnsafeSupplier.get();
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
	protected ProductSpecification[] productSpecifications;

	private Supplier<ProductSpecification[]> _productSpecificationsSupplier =
		() -> null;

	@Schema
	public Integer getProductStatus() {
		if (productStatus != null) {
			return productStatus;
		}

		productStatus = _productStatusSupplier.get();

		return productStatus;
	}

	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;

		_productStatusSupplier = () -> productStatus;
	}

	@JsonIgnore
	public void setProductStatus(
		UnsafeSupplier<Integer, Exception> productStatusUnsafeSupplier) {

		productStatus = null;

		_productStatusSupplier = () -> {
			try {
				return productStatusUnsafeSupplier.get();
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
	protected Integer productStatus;

	private Supplier<Integer> _productStatusSupplier = () -> null;

	@Schema(example = "simple")
	public String getProductType() {
		if (productType != null) {
			return productType;
		}

		productType = _productTypeSupplier.get();

		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;

		_productTypeSupplier = () -> productType;
	}

	@JsonIgnore
	public void setProductType(
		UnsafeSupplier<String, Exception> productTypeUnsafeSupplier) {

		productType = null;

		_productTypeSupplier = () -> {
			try {
				return productTypeUnsafeSupplier.get();
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
	@NotEmpty
	protected String productType;

	private Supplier<String> _productTypeSupplier = () -> null;

	@Schema(example = "simple")
	public String getProductTypeI18n() {
		if (productTypeI18n != null) {
			return productTypeI18n;
		}

		productTypeI18n = _productTypeI18nSupplier.get();

		return productTypeI18n;
	}

	public void setProductTypeI18n(String productTypeI18n) {
		this.productTypeI18n = productTypeI18n;

		_productTypeI18nSupplier = () -> productTypeI18n;
	}

	@JsonIgnore
	public void setProductTypeI18n(
		UnsafeSupplier<String, Exception> productTypeI18nUnsafeSupplier) {

		productTypeI18n = null;

		_productTypeI18nSupplier = () -> {
			try {
				return productTypeI18nUnsafeSupplier.get();
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
	protected String productTypeI18n;

	private Supplier<String> _productTypeI18nSupplier = () -> null;

	@Schema
	@Valid
	public ProductVirtualSettings getProductVirtualSettings() {
		if (productVirtualSettings != null) {
			return productVirtualSettings;
		}

		productVirtualSettings = _productVirtualSettingsSupplier.get();

		return productVirtualSettings;
	}

	public void setProductVirtualSettings(
		ProductVirtualSettings productVirtualSettings) {

		this.productVirtualSettings = productVirtualSettings;

		_productVirtualSettingsSupplier = () -> productVirtualSettings;
	}

	@JsonIgnore
	public void setProductVirtualSettings(
		UnsafeSupplier<ProductVirtualSettings, Exception>
			productVirtualSettingsUnsafeSupplier) {

		productVirtualSettings = null;

		_productVirtualSettingsSupplier = () -> {
			try {
				return productVirtualSettingsUnsafeSupplier.get();
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
	protected ProductVirtualSettings productVirtualSettings;

	private Supplier<ProductVirtualSettings> _productVirtualSettingsSupplier =
		() -> null;

	@Schema
	@Valid
	public RelatedProduct[] getRelatedProducts() {
		if (relatedProducts != null) {
			return relatedProducts;
		}

		relatedProducts = _relatedProductsSupplier.get();

		return relatedProducts;
	}

	public void setRelatedProducts(RelatedProduct[] relatedProducts) {
		this.relatedProducts = relatedProducts;

		_relatedProductsSupplier = () -> relatedProducts;
	}

	@JsonIgnore
	public void setRelatedProducts(
		UnsafeSupplier<RelatedProduct[], Exception>
			relatedProductsUnsafeSupplier) {

		relatedProducts = null;

		_relatedProductsSupplier = () -> {
			try {
				return relatedProductsUnsafeSupplier.get();
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
	protected RelatedProduct[] relatedProducts;

	private Supplier<RelatedProduct[]> _relatedProductsSupplier = () -> null;

	@Schema
	@Valid
	public ProductShippingConfiguration getShippingConfiguration() {
		if (shippingConfiguration != null) {
			return shippingConfiguration;
		}

		shippingConfiguration = _shippingConfigurationSupplier.get();

		return shippingConfiguration;
	}

	public void setShippingConfiguration(
		ProductShippingConfiguration shippingConfiguration) {

		this.shippingConfiguration = shippingConfiguration;

		_shippingConfigurationSupplier = () -> shippingConfiguration;
	}

	@JsonIgnore
	public void setShippingConfiguration(
		UnsafeSupplier<ProductShippingConfiguration, Exception>
			shippingConfigurationUnsafeSupplier) {

		shippingConfiguration = null;

		_shippingConfigurationSupplier = () -> {
			try {
				return shippingConfigurationUnsafeSupplier.get();
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
	protected ProductShippingConfiguration shippingConfiguration;

	private Supplier<ProductShippingConfiguration>
		_shippingConfigurationSupplier = () -> null;

	@Schema(
		example = "{en_US=Hand stainless steel saw for wood, hr_HR=Product Short Description HR, hu_HU=Product Short Description HU}"
	)
	@Valid
	public Map<String, String> getShortDescription() {
		if (shortDescription != null) {
			return shortDescription;
		}

		shortDescription = _shortDescriptionSupplier.get();

		return shortDescription;
	}

	public void setShortDescription(Map<String, String> shortDescription) {
		this.shortDescription = shortDescription;

		_shortDescriptionSupplier = () -> shortDescription;
	}

	@JsonIgnore
	public void setShortDescription(
		UnsafeSupplier<Map<String, String>, Exception>
			shortDescriptionUnsafeSupplier) {

		shortDescription = null;

		_shortDescriptionSupplier = () -> {
			try {
				return shortDescriptionUnsafeSupplier.get();
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
	protected Map<String, String> shortDescription;

	private Supplier<Map<String, String>> _shortDescriptionSupplier =
		() -> null;

	@Schema(example = "default")
	public String getSkuFormatted() {
		if (skuFormatted != null) {
			return skuFormatted;
		}

		skuFormatted = _skuFormattedSupplier.get();

		return skuFormatted;
	}

	public void setSkuFormatted(String skuFormatted) {
		this.skuFormatted = skuFormatted;

		_skuFormattedSupplier = () -> skuFormatted;
	}

	@JsonIgnore
	public void setSkuFormatted(
		UnsafeSupplier<String, Exception> skuFormattedUnsafeSupplier) {

		skuFormatted = null;

		_skuFormattedSupplier = () -> {
			try {
				return skuFormattedUnsafeSupplier.get();
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
	protected String skuFormatted;

	private Supplier<String> _skuFormattedSupplier = () -> null;

	@Schema
	@Valid
	public Sku[] getSkus() {
		if (skus != null) {
			return skus;
		}

		skus = _skusSupplier.get();

		return skus;
	}

	public void setSkus(Sku[] skus) {
		this.skus = skus;

		_skusSupplier = () -> skus;
	}

	@JsonIgnore
	public void setSkus(UnsafeSupplier<Sku[], Exception> skusUnsafeSupplier) {
		skus = null;

		_skusSupplier = () -> {
			try {
				return skusUnsafeSupplier.get();
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
	protected Sku[] skus;

	private Supplier<Sku[]> _skusSupplier = () -> null;

	@Schema
	@Valid
	public ProductSubscriptionConfiguration getSubscriptionConfiguration() {
		if (subscriptionConfiguration != null) {
			return subscriptionConfiguration;
		}

		subscriptionConfiguration = _subscriptionConfigurationSupplier.get();

		return subscriptionConfiguration;
	}

	public void setSubscriptionConfiguration(
		ProductSubscriptionConfiguration subscriptionConfiguration) {

		this.subscriptionConfiguration = subscriptionConfiguration;

		_subscriptionConfigurationSupplier = () -> subscriptionConfiguration;
	}

	@JsonIgnore
	public void setSubscriptionConfiguration(
		UnsafeSupplier<ProductSubscriptionConfiguration, Exception>
			subscriptionConfigurationUnsafeSupplier) {

		subscriptionConfiguration = null;

		_subscriptionConfigurationSupplier = () -> {
			try {
				return subscriptionConfigurationUnsafeSupplier.get();
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
	protected ProductSubscriptionConfiguration subscriptionConfiguration;

	private Supplier<ProductSubscriptionConfiguration>
		_subscriptionConfigurationSupplier = () -> null;

	@Schema(example = "[tag1, tag2, tag3]")
	public String[] getTags() {
		if (tags != null) {
			return tags;
		}

		tags = _tagsSupplier.get();

		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;

		_tagsSupplier = () -> tags;
	}

	@JsonIgnore
	public void setTags(
		UnsafeSupplier<String[], Exception> tagsUnsafeSupplier) {

		tags = null;

		_tagsSupplier = () -> {
			try {
				return tagsUnsafeSupplier.get();
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
	protected String[] tags;

	private Supplier<String[]> _tagsSupplier = () -> null;

	@Schema
	@Valid
	public ProductTaxConfiguration getTaxConfiguration() {
		if (taxConfiguration != null) {
			return taxConfiguration;
		}

		taxConfiguration = _taxConfigurationSupplier.get();

		return taxConfiguration;
	}

	public void setTaxConfiguration(ProductTaxConfiguration taxConfiguration) {
		this.taxConfiguration = taxConfiguration;

		_taxConfigurationSupplier = () -> taxConfiguration;
	}

	@JsonIgnore
	public void setTaxConfiguration(
		UnsafeSupplier<ProductTaxConfiguration, Exception>
			taxConfigurationUnsafeSupplier) {

		taxConfiguration = null;

		_taxConfigurationSupplier = () -> {
			try {
				return taxConfigurationUnsafeSupplier.get();
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
	protected ProductTaxConfiguration taxConfiguration;

	private Supplier<ProductTaxConfiguration> _taxConfigurationSupplier =
		() -> null;

	@Schema(example = "simple")
	public String getThumbnail() {
		if (thumbnail != null) {
			return thumbnail;
		}

		thumbnail = _thumbnailSupplier.get();

		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;

		_thumbnailSupplier = () -> thumbnail;
	}

	@JsonIgnore
	public void setThumbnail(
		UnsafeSupplier<String, Exception> thumbnailUnsafeSupplier) {

		thumbnail = null;

		_thumbnailSupplier = () -> {
			try {
				return thumbnailUnsafeSupplier.get();
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
	protected String thumbnail;

	private Supplier<String> _thumbnailSupplier = () -> null;

	@Schema(
		example = "{en_US=product-url-us, hr_HR=product-url-hr, hu_HU=product-url-hu}"
	)
	@Valid
	public Map<String, String> getUrls() {
		if (urls != null) {
			return urls;
		}

		urls = _urlsSupplier.get();

		return urls;
	}

	public void setUrls(Map<String, String> urls) {
		this.urls = urls;

		_urlsSupplier = () -> urls;
	}

	@JsonIgnore
	public void setUrls(
		UnsafeSupplier<Map<String, String>, Exception> urlsUnsafeSupplier) {

		urls = null;

		_urlsSupplier = () -> {
			try {
				return urlsUnsafeSupplier.get();
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
	protected Map<String, String> urls;

	private Supplier<Map<String, String>> _urlsSupplier = () -> null;

	@Schema
	public Integer getVersion() {
		if (version != null) {
			return version;
		}

		version = _versionSupplier.get();

		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;

		_versionSupplier = () -> version;
	}

	@JsonIgnore
	public void setVersion(
		UnsafeSupplier<Integer, Exception> versionUnsafeSupplier) {

		version = null;

		_versionSupplier = () -> {
			try {
				return versionUnsafeSupplier.get();
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
	protected Integer version;

	private Supplier<Integer> _versionSupplier = () -> null;

	@Schema
	@Valid
	public Status getWorkflowStatusInfo() {
		if (workflowStatusInfo != null) {
			return workflowStatusInfo;
		}

		workflowStatusInfo = _workflowStatusInfoSupplier.get();

		return workflowStatusInfo;
	}

	public void setWorkflowStatusInfo(Status workflowStatusInfo) {
		this.workflowStatusInfo = workflowStatusInfo;

		_workflowStatusInfoSupplier = () -> workflowStatusInfo;
	}

	@JsonIgnore
	public void setWorkflowStatusInfo(
		UnsafeSupplier<Status, Exception> workflowStatusInfoUnsafeSupplier) {

		workflowStatusInfo = null;

		_workflowStatusInfoSupplier = () -> {
			try {
				return workflowStatusInfoUnsafeSupplier.get();
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
	protected Status workflowStatusInfo;

	private Supplier<Status> _workflowStatusInfoSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Product)) {
			return false;
		}

		Product product = (Product)object;

		return Objects.equals(toString(), product.toString());
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

		if (active != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"active\": ");

			sb.append(active);
		}

		if (attachments != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"attachments\": ");

			sb.append("[");

			for (int i = 0; i < attachments.length; i++) {
				sb.append(String.valueOf(attachments[i]));

				if ((i + 1) < attachments.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (catalog != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"catalog\": ");

			sb.append(String.valueOf(catalog));
		}

		if (catalogId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"catalogId\": ");

			sb.append(catalogId);
		}

		if (categories != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"categories\": ");

			sb.append("[");

			for (int i = 0; i < categories.length; i++) {
				sb.append(String.valueOf(categories[i]));

				if ((i + 1) < categories.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (createDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"createDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(createDate));

			sb.append("\"");
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

		if (defaultSku != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"defaultSku\": ");

			sb.append("\"");

			sb.append(_escape(defaultSku));

			sb.append("\"");
		}

		if (description != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append(_toJSON(description));
		}

		if (diagram != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"diagram\": ");

			sb.append(String.valueOf(diagram));
		}

		if (displayDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"displayDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(displayDate));

			sb.append("\"");
		}

		if (expando != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"expando\": ");

			sb.append(_toJSON(expando));
		}

		if (expirationDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"expirationDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(expirationDate));

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

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (images != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"images\": ");

			sb.append("[");

			for (int i = 0; i < images.length; i++) {
				sb.append(String.valueOf(images[i]));

				if ((i + 1) < images.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (linkedProducts != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"linkedProducts\": ");

			sb.append("[");

			for (int i = 0; i < linkedProducts.length; i++) {
				sb.append(String.valueOf(linkedProducts[i]));

				if ((i + 1) < linkedProducts.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (mappedProducts != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"mappedProducts\": ");

			sb.append("[");

			for (int i = 0; i < mappedProducts.length; i++) {
				sb.append(String.valueOf(mappedProducts[i]));

				if ((i + 1) < mappedProducts.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (metaDescription != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"metaDescription\": ");

			sb.append(_toJSON(metaDescription));
		}

		if (metaKeyword != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"metaKeyword\": ");

			sb.append(_toJSON(metaKeyword));
		}

		if (metaTitle != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"metaTitle\": ");

			sb.append(_toJSON(metaTitle));
		}

		if (modifiedDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modifiedDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(modifiedDate));

			sb.append("\"");
		}

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append(_toJSON(name));
		}

		if (neverExpire != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"neverExpire\": ");

			sb.append(neverExpire);
		}

		if (pins != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"pins\": ");

			sb.append("[");

			for (int i = 0; i < pins.length; i++) {
				sb.append(String.valueOf(pins[i]));

				if ((i + 1) < pins.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (productAccountGroupFilter != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productAccountGroupFilter\": ");

			sb.append(productAccountGroupFilter);
		}

		if (productAccountGroups != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productAccountGroups\": ");

			sb.append("[");

			for (int i = 0; i < productAccountGroups.length; i++) {
				sb.append(String.valueOf(productAccountGroups[i]));

				if ((i + 1) < productAccountGroups.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (productChannelFilter != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productChannelFilter\": ");

			sb.append(productChannelFilter);
		}

		if (productChannels != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productChannels\": ");

			sb.append("[");

			for (int i = 0; i < productChannels.length; i++) {
				sb.append(String.valueOf(productChannels[i]));

				if ((i + 1) < productChannels.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (productConfiguration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productConfiguration\": ");

			sb.append(String.valueOf(productConfiguration));
		}

		if (productId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productId\": ");

			sb.append(productId);
		}

		if (productOptions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productOptions\": ");

			sb.append("[");

			for (int i = 0; i < productOptions.length; i++) {
				sb.append(String.valueOf(productOptions[i]));

				if ((i + 1) < productOptions.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (productSpecifications != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productSpecifications\": ");

			sb.append("[");

			for (int i = 0; i < productSpecifications.length; i++) {
				sb.append(String.valueOf(productSpecifications[i]));

				if ((i + 1) < productSpecifications.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (productStatus != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productStatus\": ");

			sb.append(productStatus);
		}

		if (productType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productType\": ");

			sb.append("\"");

			sb.append(_escape(productType));

			sb.append("\"");
		}

		if (productTypeI18n != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productTypeI18n\": ");

			sb.append("\"");

			sb.append(_escape(productTypeI18n));

			sb.append("\"");
		}

		if (productVirtualSettings != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productVirtualSettings\": ");

			sb.append(String.valueOf(productVirtualSettings));
		}

		if (relatedProducts != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"relatedProducts\": ");

			sb.append("[");

			for (int i = 0; i < relatedProducts.length; i++) {
				sb.append(String.valueOf(relatedProducts[i]));

				if ((i + 1) < relatedProducts.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (shippingConfiguration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingConfiguration\": ");

			sb.append(String.valueOf(shippingConfiguration));
		}

		if (shortDescription != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shortDescription\": ");

			sb.append(_toJSON(shortDescription));
		}

		if (skuFormatted != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skuFormatted\": ");

			sb.append("\"");

			sb.append(_escape(skuFormatted));

			sb.append("\"");
		}

		if (skus != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skus\": ");

			sb.append("[");

			for (int i = 0; i < skus.length; i++) {
				sb.append(String.valueOf(skus[i]));

				if ((i + 1) < skus.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (subscriptionConfiguration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subscriptionConfiguration\": ");

			sb.append(String.valueOf(subscriptionConfiguration));
		}

		if (tags != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tags\": ");

			sb.append("[");

			for (int i = 0; i < tags.length; i++) {
				sb.append("\"");

				sb.append(_escape(tags[i]));

				sb.append("\"");

				if ((i + 1) < tags.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (taxConfiguration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"taxConfiguration\": ");

			sb.append(String.valueOf(taxConfiguration));
		}

		if (thumbnail != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"thumbnail\": ");

			sb.append("\"");

			sb.append(_escape(thumbnail));

			sb.append("\"");
		}

		if (urls != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"urls\": ");

			sb.append(_toJSON(urls));
		}

		if (version != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"version\": ");

			sb.append(version);
		}

		if (workflowStatusInfo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"workflowStatusInfo\": ");

			sb.append(String.valueOf(workflowStatusInfo));
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.catalog.dto.v1_0.Product",
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