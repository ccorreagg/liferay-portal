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
 * @author Zoltán Takács
 * @generated
 */
@Generated("")
@GraphQLName("SkuVirtualSettings")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "SkuVirtualSettings")
public class SkuVirtualSettings implements Serializable {

	public static SkuVirtualSettings toDTO(String json) {
		return ObjectMapperUtil.readValue(SkuVirtualSettings.class, json);
	}

	public static SkuVirtualSettings unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(SkuVirtualSettings.class, json);
	}

	@DecimalMin("0")
	@Schema(example = "0")
	public Integer getActivationStatus() {
		if (activationStatus != null) {
			return activationStatus;
		}

		activationStatus = _activationStatusSupplier.get();

		return activationStatus;
	}

	public void setActivationStatus(Integer activationStatus) {
		this.activationStatus = activationStatus;

		_activationStatusSupplier = () -> activationStatus;
	}

	@JsonIgnore
	public void setActivationStatus(
		UnsafeSupplier<Integer, Exception> activationStatusUnsafeSupplier) {

		activationStatus = null;

		_activationStatusSupplier = () -> {
			try {
				return activationStatusUnsafeSupplier.get();
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
	protected Integer activationStatus;

	private Supplier<Integer> _activationStatusSupplier = () -> null;

	@Schema
	@Valid
	public Status getActivationStatusInfo() {
		if (activationStatusInfo != null) {
			return activationStatusInfo;
		}

		activationStatusInfo = _activationStatusInfoSupplier.get();

		return activationStatusInfo;
	}

	public void setActivationStatusInfo(Status activationStatusInfo) {
		this.activationStatusInfo = activationStatusInfo;

		_activationStatusInfoSupplier = () -> activationStatusInfo;
	}

	@JsonIgnore
	public void setActivationStatusInfo(
		UnsafeSupplier<Status, Exception> activationStatusInfoUnsafeSupplier) {

		activationStatusInfo = null;

		_activationStatusInfoSupplier = () -> {
			try {
				return activationStatusInfoUnsafeSupplier.get();
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
	protected Status activationStatusInfo;

	private Supplier<Status> _activationStatusInfoSupplier = () -> null;

	@Schema(description = "Base64 encoded file")
	public String getAttachment() {
		if (attachment != null) {
			return attachment;
		}

		attachment = _attachmentSupplier.get();

		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;

		_attachmentSupplier = () -> attachment;
	}

	@JsonIgnore
	public void setAttachment(
		UnsafeSupplier<String, Exception> attachmentUnsafeSupplier) {

		attachment = null;

		_attachmentSupplier = () -> {
			try {
				return attachmentUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "Base64 encoded file")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String attachment;

	private Supplier<String> _attachmentSupplier = () -> null;

	@Schema(description = "Number of days to download the attachment")
	public Long getDuration() {
		if (duration != null) {
			return duration;
		}

		duration = _durationSupplier.get();

		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;

		_durationSupplier = () -> duration;
	}

	@JsonIgnore
	public void setDuration(
		UnsafeSupplier<Long, Exception> durationUnsafeSupplier) {

		duration = null;

		_durationSupplier = () -> {
			try {
				return durationUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "Number of days to download the attachment")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long duration;

	private Supplier<Long> _durationSupplier = () -> null;

	@Schema(description = "Number of downloads available for attachment")
	public Integer getMaxUsages() {
		if (maxUsages != null) {
			return maxUsages;
		}

		maxUsages = _maxUsagesSupplier.get();

		return maxUsages;
	}

	public void setMaxUsages(Integer maxUsages) {
		this.maxUsages = maxUsages;

		_maxUsagesSupplier = () -> maxUsages;
	}

	@JsonIgnore
	public void setMaxUsages(
		UnsafeSupplier<Integer, Exception> maxUsagesUnsafeSupplier) {

		maxUsages = null;

		_maxUsagesSupplier = () -> {
			try {
				return maxUsagesUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "Number of downloads available for attachment")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer maxUsages;

	private Supplier<Integer> _maxUsagesSupplier = () -> null;

	@Schema(description = "Override product virtual settings")
	public Boolean getOverride() {
		if (override != null) {
			return override;
		}

		override = _overrideSupplier.get();

		return override;
	}

	public void setOverride(Boolean override) {
		this.override = override;

		_overrideSupplier = () -> override;
	}

	@JsonIgnore
	public void setOverride(
		UnsafeSupplier<Boolean, Exception> overrideUnsafeSupplier) {

		override = null;

		_overrideSupplier = () -> {
			try {
				return overrideUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "Override product virtual settings")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean override;

	private Supplier<Boolean> _overrideSupplier = () -> null;

	@Schema(description = "Base64 encoded sample file")
	public String getSampleAttachment() {
		if (sampleAttachment != null) {
			return sampleAttachment;
		}

		sampleAttachment = _sampleAttachmentSupplier.get();

		return sampleAttachment;
	}

	public void setSampleAttachment(String sampleAttachment) {
		this.sampleAttachment = sampleAttachment;

		_sampleAttachmentSupplier = () -> sampleAttachment;
	}

	@JsonIgnore
	public void setSampleAttachment(
		UnsafeSupplier<String, Exception> sampleAttachmentUnsafeSupplier) {

		sampleAttachment = null;

		_sampleAttachmentSupplier = () -> {
			try {
				return sampleAttachmentUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "Base64 encoded sample file")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String sampleAttachment;

	private Supplier<String> _sampleAttachmentSupplier = () -> null;

	@Schema(description = "URL to download the sample file")
	public String getSampleSrc() {
		if (sampleSrc != null) {
			return sampleSrc;
		}

		sampleSrc = _sampleSrcSupplier.get();

		return sampleSrc;
	}

	public void setSampleSrc(String sampleSrc) {
		this.sampleSrc = sampleSrc;

		_sampleSrcSupplier = () -> sampleSrc;
	}

	@JsonIgnore
	public void setSampleSrc(
		UnsafeSupplier<String, Exception> sampleSrcUnsafeSupplier) {

		sampleSrc = null;

		_sampleSrcSupplier = () -> {
			try {
				return sampleSrcUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "URL to download the sample file")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String sampleSrc;

	private Supplier<String> _sampleSrcSupplier = () -> null;

	@Schema(description = "URL of the sample file")
	public String getSampleURL() {
		if (sampleURL != null) {
			return sampleURL;
		}

		sampleURL = _sampleURLSupplier.get();

		return sampleURL;
	}

	public void setSampleURL(String sampleURL) {
		this.sampleURL = sampleURL;

		_sampleURLSupplier = () -> sampleURL;
	}

	@JsonIgnore
	public void setSampleURL(
		UnsafeSupplier<String, Exception> sampleURLUnsafeSupplier) {

		sampleURL = null;

		_sampleURLSupplier = () -> {
			try {
				return sampleURLUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "URL of the sample file")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String sampleURL;

	private Supplier<String> _sampleURLSupplier = () -> null;

	@Schema(description = "URL to download the file")
	public String getSrc() {
		if (src != null) {
			return src;
		}

		src = _srcSupplier.get();

		return src;
	}

	public void setSrc(String src) {
		this.src = src;

		_srcSupplier = () -> src;
	}

	@JsonIgnore
	public void setSrc(UnsafeSupplier<String, Exception> srcUnsafeSupplier) {
		src = null;

		_srcSupplier = () -> {
			try {
				return srcUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "URL to download the file")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String src;

	private Supplier<String> _srcSupplier = () -> null;

	@Schema(
		description = "Terms of Use content",
		example = "{en_US=Croatia, hr_HR=Hrvatska, hu_HU=Horvatorszag}"
	)
	@Valid
	public Map<String, String> getTermsOfUseContent() {
		if (termsOfUseContent != null) {
			return termsOfUseContent;
		}

		termsOfUseContent = _termsOfUseContentSupplier.get();

		return termsOfUseContent;
	}

	public void setTermsOfUseContent(Map<String, String> termsOfUseContent) {
		this.termsOfUseContent = termsOfUseContent;

		_termsOfUseContentSupplier = () -> termsOfUseContent;
	}

	@JsonIgnore
	public void setTermsOfUseContent(
		UnsafeSupplier<Map<String, String>, Exception>
			termsOfUseContentUnsafeSupplier) {

		termsOfUseContent = null;

		_termsOfUseContentSupplier = () -> {
			try {
				return termsOfUseContentUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "Terms of Use content")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Map<String, String> termsOfUseContent;

	private Supplier<Map<String, String>> _termsOfUseContentSupplier =
		() -> null;

	@Schema(description = "Terms of Use related Article Id")
	public Long getTermsOfUseJournalArticleId() {
		if (termsOfUseJournalArticleId != null) {
			return termsOfUseJournalArticleId;
		}

		termsOfUseJournalArticleId = _termsOfUseJournalArticleIdSupplier.get();

		return termsOfUseJournalArticleId;
	}

	public void setTermsOfUseJournalArticleId(Long termsOfUseJournalArticleId) {
		this.termsOfUseJournalArticleId = termsOfUseJournalArticleId;

		_termsOfUseJournalArticleIdSupplier = () -> termsOfUseJournalArticleId;
	}

	@JsonIgnore
	public void setTermsOfUseJournalArticleId(
		UnsafeSupplier<Long, Exception>
			termsOfUseJournalArticleIdUnsafeSupplier) {

		termsOfUseJournalArticleId = null;

		_termsOfUseJournalArticleIdSupplier = () -> {
			try {
				return termsOfUseJournalArticleIdUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "Terms of Use related Article Id")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long termsOfUseJournalArticleId;

	private Supplier<Long> _termsOfUseJournalArticleIdSupplier = () -> null;

	@Schema(description = "Terms of Use required")
	public Boolean getTermsOfUseRequired() {
		if (termsOfUseRequired != null) {
			return termsOfUseRequired;
		}

		termsOfUseRequired = _termsOfUseRequiredSupplier.get();

		return termsOfUseRequired;
	}

	public void setTermsOfUseRequired(Boolean termsOfUseRequired) {
		this.termsOfUseRequired = termsOfUseRequired;

		_termsOfUseRequiredSupplier = () -> termsOfUseRequired;
	}

	@JsonIgnore
	public void setTermsOfUseRequired(
		UnsafeSupplier<Boolean, Exception> termsOfUseRequiredUnsafeSupplier) {

		termsOfUseRequired = null;

		_termsOfUseRequiredSupplier = () -> {
			try {
				return termsOfUseRequiredUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "Terms of Use required")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean termsOfUseRequired;

	private Supplier<Boolean> _termsOfUseRequiredSupplier = () -> null;

	@Schema(description = "URL of the file")
	public String getUrl() {
		if (url != null) {
			return url;
		}

		url = _urlSupplier.get();

		return url;
	}

	public void setUrl(String url) {
		this.url = url;

		_urlSupplier = () -> url;
	}

	@JsonIgnore
	public void setUrl(UnsafeSupplier<String, Exception> urlUnsafeSupplier) {
		url = null;

		_urlSupplier = () -> {
			try {
				return urlUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "URL of the file")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String url;

	private Supplier<String> _urlSupplier = () -> null;

	@Schema(description = "Enable sample file")
	public Boolean getUseSample() {
		if (useSample != null) {
			return useSample;
		}

		useSample = _useSampleSupplier.get();

		return useSample;
	}

	public void setUseSample(Boolean useSample) {
		this.useSample = useSample;

		_useSampleSupplier = () -> useSample;
	}

	@JsonIgnore
	public void setUseSample(
		UnsafeSupplier<Boolean, Exception> useSampleUnsafeSupplier) {

		useSample = null;

		_useSampleSupplier = () -> {
			try {
				return useSampleUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "Enable sample file")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean useSample;

	private Supplier<Boolean> _useSampleSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SkuVirtualSettings)) {
			return false;
		}

		SkuVirtualSettings skuVirtualSettings = (SkuVirtualSettings)object;

		return Objects.equals(toString(), skuVirtualSettings.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (activationStatus != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"activationStatus\": ");

			sb.append(activationStatus);
		}

		if (activationStatusInfo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"activationStatusInfo\": ");

			sb.append(String.valueOf(activationStatusInfo));
		}

		if (attachment != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"attachment\": ");

			sb.append("\"");

			sb.append(_escape(attachment));

			sb.append("\"");
		}

		if (duration != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"duration\": ");

			sb.append(duration);
		}

		if (maxUsages != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"maxUsages\": ");

			sb.append(maxUsages);
		}

		if (override != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"override\": ");

			sb.append(override);
		}

		if (sampleAttachment != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sampleAttachment\": ");

			sb.append("\"");

			sb.append(_escape(sampleAttachment));

			sb.append("\"");
		}

		if (sampleSrc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sampleSrc\": ");

			sb.append("\"");

			sb.append(_escape(sampleSrc));

			sb.append("\"");
		}

		if (sampleURL != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sampleURL\": ");

			sb.append("\"");

			sb.append(_escape(sampleURL));

			sb.append("\"");
		}

		if (src != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"src\": ");

			sb.append("\"");

			sb.append(_escape(src));

			sb.append("\"");
		}

		if (termsOfUseContent != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"termsOfUseContent\": ");

			sb.append(_toJSON(termsOfUseContent));
		}

		if (termsOfUseJournalArticleId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"termsOfUseJournalArticleId\": ");

			sb.append(termsOfUseJournalArticleId);
		}

		if (termsOfUseRequired != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"termsOfUseRequired\": ");

			sb.append(termsOfUseRequired);
		}

		if (url != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"url\": ");

			sb.append("\"");

			sb.append(_escape(url));

			sb.append("\"");
		}

		if (useSample != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"useSample\": ");

			sb.append(useSample);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.commerce.admin.catalog.dto.v1_0.SkuVirtualSettings",
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