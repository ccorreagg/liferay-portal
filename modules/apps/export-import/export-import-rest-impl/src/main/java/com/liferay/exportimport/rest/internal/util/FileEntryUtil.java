/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.exportimport.rest.internal.util;

import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.FileUtil;

import java.io.File;
import java.io.InputStream;

/**
 * @author Carlos Correa
 */
public class FileEntryUtil {

	public static File createTempFile(FileEntry fileEntry) throws Exception {
		File file = FileUtil.createTempFile(fileEntry.getExtension());

		try (InputStream inputStream = fileEntry.getContentStream()) {
			FileUtil.write(file, inputStream);

			return file;
		}
		catch (Exception exception) {
			FileUtil.delete(file);

			throw exception;
		}
	}

}