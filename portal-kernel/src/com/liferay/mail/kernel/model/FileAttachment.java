/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.mail.kernel.model;

import java.io.File;
import java.io.InputStream;

/**
 * @author Barrie Selack
 * @author Brian Wing Shun Chan
 */
public class FileAttachment {

	public FileAttachment(File file, String fileName) {
		_file = file;
		_fileName = fileName;
	}

	public FileAttachment(String fileName, InputStream inputStream) {
		_fileName = fileName;
		_inputStream = inputStream;
	}

	public File getFile() {
		return _file;
	}

	public String getFileName() {
		return _fileName;
	}

	public InputStream getInputStream() {
		return _inputStream;
	}

	private File _file;
	private String _fileName;
	private InputStream _inputStream;

}