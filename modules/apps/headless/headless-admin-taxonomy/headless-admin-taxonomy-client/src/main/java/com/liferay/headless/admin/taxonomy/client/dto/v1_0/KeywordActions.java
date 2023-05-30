/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.headless.admin.taxonomy.client.dto.v1_0;

import com.liferay.headless.admin.taxonomy.client.function.UnsafeSupplier;
import com.liferay.headless.admin.taxonomy.client.serdes.v1_0.KeywordActionsSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class KeywordActions implements Cloneable, Serializable {

	public static KeywordActions toDTO(String json) {
		return KeywordActionsSerDes.toDTO(json);
	}

	public Action getDelete() {
		return delete;
	}

	public void setDelete(Action delete) {
		this.delete = delete;
	}

	public void setDelete(
		UnsafeSupplier<Action, Exception> deleteUnsafeSupplier) {

		try {
			delete = deleteUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Action delete;

	public Action getGet() {
		return get;
	}

	public void setGet(Action get) {
		this.get = get;
	}

	public void setGet(UnsafeSupplier<Action, Exception> getUnsafeSupplier) {
		try {
			get = getUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Action get;

	public Action getReplace() {
		return replace;
	}

	public void setReplace(Action replace) {
		this.replace = replace;
	}

	public void setReplace(
		UnsafeSupplier<Action, Exception> replaceUnsafeSupplier) {

		try {
			replace = replaceUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Action replace;

	public Action getSubscribe() {
		return subscribe;
	}

	public void setSubscribe(Action subscribe) {
		this.subscribe = subscribe;
	}

	public void setSubscribe(
		UnsafeSupplier<Action, Exception> subscribeUnsafeSupplier) {

		try {
			subscribe = subscribeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Action subscribe;

	public Action getUnsubscribe() {
		return unsubscribe;
	}

	public void setUnsubscribe(Action unsubscribe) {
		this.unsubscribe = unsubscribe;
	}

	public void setUnsubscribe(
		UnsafeSupplier<Action, Exception> unsubscribeUnsafeSupplier) {

		try {
			unsubscribe = unsubscribeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Action unsubscribe;

	@Override
	public KeywordActions clone() throws CloneNotSupportedException {
		return (KeywordActions)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof KeywordActions)) {
			return false;
		}

		KeywordActions keywordActions = (KeywordActions)object;

		return Objects.equals(toString(), keywordActions.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return KeywordActionsSerDes.toJSON(this);
	}

}