/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.user.dto.v1_0;

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
	description = "The user's contact information.",
	value = "UserAccountContactInformation"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "UserAccountContactInformation")
public class UserAccountContactInformation implements Serializable {

	public static UserAccountContactInformation toDTO(String json) {
		return ObjectMapperUtil.readValue(
			UserAccountContactInformation.class, json);
	}

	public static UserAccountContactInformation unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			UserAccountContactInformation.class, json);
	}

	@Schema(
		description = "A list of the user's email addresses, with one optionally marked as primary."
	)
	@Valid
	public EmailAddress[] getEmailAddresses() {
		if (emailAddresses != null) {
			return emailAddresses;
		}

		emailAddresses = _emailAddressesSupplier.get();

		return emailAddresses;
	}

	public void setEmailAddresses(EmailAddress[] emailAddresses) {
		this.emailAddresses = emailAddresses;

		_emailAddressesSupplier = () -> emailAddresses;
	}

	@JsonIgnore
	public void setEmailAddresses(
		UnsafeSupplier<EmailAddress[], Exception>
			emailAddressesUnsafeSupplier) {

		emailAddresses = null;

		_emailAddressesSupplier = () -> {
			try {
				return emailAddressesUnsafeSupplier.get();
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
		description = "A list of the user's email addresses, with one optionally marked as primary."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected EmailAddress[] emailAddresses;

	private Supplier<EmailAddress[]> _emailAddressesSupplier = () -> null;

	@Schema(description = "The user's Facebook account.")
	public String getFacebook() {
		if (facebook != null) {
			return facebook;
		}

		facebook = _facebookSupplier.get();

		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;

		_facebookSupplier = () -> facebook;
	}

	@JsonIgnore
	public void setFacebook(
		UnsafeSupplier<String, Exception> facebookUnsafeSupplier) {

		facebook = null;

		_facebookSupplier = () -> {
			try {
				return facebookUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's Facebook account.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String facebook;

	private Supplier<String> _facebookSupplier = () -> null;

	@Schema(description = "The ID of the `contactInformation`.")
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

	@GraphQLField(description = "The ID of the `contactInformation`.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long id;

	private Supplier<Long> _idSupplier = () -> null;

	@Schema(description = "The user's Jabber handle.")
	public String getJabber() {
		if (jabber != null) {
			return jabber;
		}

		jabber = _jabberSupplier.get();

		return jabber;
	}

	public void setJabber(String jabber) {
		this.jabber = jabber;

		_jabberSupplier = () -> jabber;
	}

	@JsonIgnore
	public void setJabber(
		UnsafeSupplier<String, Exception> jabberUnsafeSupplier) {

		jabber = null;

		_jabberSupplier = () -> {
			try {
				return jabberUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's Jabber handle.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String jabber;

	private Supplier<String> _jabberSupplier = () -> null;

	@Schema(
		description = "A list of user's postal addresses, with one optionally marked as primary."
	)
	@Valid
	public PostalAddress[] getPostalAddresses() {
		if (postalAddresses != null) {
			return postalAddresses;
		}

		postalAddresses = _postalAddressesSupplier.get();

		return postalAddresses;
	}

	public void setPostalAddresses(PostalAddress[] postalAddresses) {
		this.postalAddresses = postalAddresses;

		_postalAddressesSupplier = () -> postalAddresses;
	}

	@JsonIgnore
	public void setPostalAddresses(
		UnsafeSupplier<PostalAddress[], Exception>
			postalAddressesUnsafeSupplier) {

		postalAddresses = null;

		_postalAddressesSupplier = () -> {
			try {
				return postalAddressesUnsafeSupplier.get();
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
		description = "A list of user's postal addresses, with one optionally marked as primary."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected PostalAddress[] postalAddresses;

	private Supplier<PostalAddress[]> _postalAddressesSupplier = () -> null;

	@Schema(description = "The user's Skype handle.")
	public String getSkype() {
		if (skype != null) {
			return skype;
		}

		skype = _skypeSupplier.get();

		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;

		_skypeSupplier = () -> skype;
	}

	@JsonIgnore
	public void setSkype(
		UnsafeSupplier<String, Exception> skypeUnsafeSupplier) {

		skype = null;

		_skypeSupplier = () -> {
			try {
				return skypeUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's Skype handle.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String skype;

	private Supplier<String> _skypeSupplier = () -> null;

	@Schema(description = "The user's SMS number.")
	public String getSms() {
		if (sms != null) {
			return sms;
		}

		sms = _smsSupplier.get();

		return sms;
	}

	public void setSms(String sms) {
		this.sms = sms;

		_smsSupplier = () -> sms;
	}

	@JsonIgnore
	public void setSms(UnsafeSupplier<String, Exception> smsUnsafeSupplier) {
		sms = null;

		_smsSupplier = () -> {
			try {
				return smsUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's SMS number.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String sms;

	private Supplier<String> _smsSupplier = () -> null;

	@Schema(
		description = "A list of the user's phone numbers, with one optionally marked as primary."
	)
	@Valid
	public Phone[] getTelephones() {
		if (telephones != null) {
			return telephones;
		}

		telephones = _telephonesSupplier.get();

		return telephones;
	}

	public void setTelephones(Phone[] telephones) {
		this.telephones = telephones;

		_telephonesSupplier = () -> telephones;
	}

	@JsonIgnore
	public void setTelephones(
		UnsafeSupplier<Phone[], Exception> telephonesUnsafeSupplier) {

		telephones = null;

		_telephonesSupplier = () -> {
			try {
				return telephonesUnsafeSupplier.get();
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
		description = "A list of the user's phone numbers, with one optionally marked as primary."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Phone[] telephones;

	private Supplier<Phone[]> _telephonesSupplier = () -> null;

	@Schema(description = "The user's Twitter handle.")
	public String getTwitter() {
		if (twitter != null) {
			return twitter;
		}

		twitter = _twitterSupplier.get();

		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;

		_twitterSupplier = () -> twitter;
	}

	@JsonIgnore
	public void setTwitter(
		UnsafeSupplier<String, Exception> twitterUnsafeSupplier) {

		twitter = null;

		_twitterSupplier = () -> {
			try {
				return twitterUnsafeSupplier.get();
			}
			catch (RuntimeException re) {
				throw re;
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	@GraphQLField(description = "The user's Twitter handle.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String twitter;

	private Supplier<String> _twitterSupplier = () -> null;

	@Schema(
		description = "A list of the user's web URLs, with one optionally marked as primary."
	)
	@Valid
	public WebUrl[] getWebUrls() {
		if (webUrls != null) {
			return webUrls;
		}

		webUrls = _webUrlsSupplier.get();

		return webUrls;
	}

	public void setWebUrls(WebUrl[] webUrls) {
		this.webUrls = webUrls;

		_webUrlsSupplier = () -> webUrls;
	}

	@JsonIgnore
	public void setWebUrls(
		UnsafeSupplier<WebUrl[], Exception> webUrlsUnsafeSupplier) {

		webUrls = null;

		_webUrlsSupplier = () -> {
			try {
				return webUrlsUnsafeSupplier.get();
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
		description = "A list of the user's web URLs, with one optionally marked as primary."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected WebUrl[] webUrls;

	private Supplier<WebUrl[]> _webUrlsSupplier = () -> null;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserAccountContactInformation)) {
			return false;
		}

		UserAccountContactInformation userAccountContactInformation =
			(UserAccountContactInformation)object;

		return Objects.equals(
			toString(), userAccountContactInformation.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (emailAddresses != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"emailAddresses\": ");

			sb.append("[");

			for (int i = 0; i < emailAddresses.length; i++) {
				sb.append(String.valueOf(emailAddresses[i]));

				if ((i + 1) < emailAddresses.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (facebook != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"facebook\": ");

			sb.append("\"");

			sb.append(_escape(facebook));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (jabber != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"jabber\": ");

			sb.append("\"");

			sb.append(_escape(jabber));

			sb.append("\"");
		}

		if (postalAddresses != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"postalAddresses\": ");

			sb.append("[");

			for (int i = 0; i < postalAddresses.length; i++) {
				sb.append(String.valueOf(postalAddresses[i]));

				if ((i + 1) < postalAddresses.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (skype != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"skype\": ");

			sb.append("\"");

			sb.append(_escape(skype));

			sb.append("\"");
		}

		if (sms != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sms\": ");

			sb.append("\"");

			sb.append(_escape(sms));

			sb.append("\"");
		}

		if (telephones != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"telephones\": ");

			sb.append("[");

			for (int i = 0; i < telephones.length; i++) {
				sb.append(String.valueOf(telephones[i]));

				if ((i + 1) < telephones.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (twitter != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"twitter\": ");

			sb.append("\"");

			sb.append(_escape(twitter));

			sb.append("\"");
		}

		if (webUrls != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"webUrls\": ");

			sb.append("[");

			for (int i = 0; i < webUrls.length; i++) {
				sb.append(String.valueOf(webUrls[i]));

				if ((i + 1) < webUrls.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.liferay.headless.admin.user.dto.v1_0.UserAccountContactInformation",
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