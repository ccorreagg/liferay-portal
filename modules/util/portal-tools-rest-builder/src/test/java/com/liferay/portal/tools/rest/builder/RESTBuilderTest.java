/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.tools.rest.builder;

import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.tools.rest.builder.internal.util.FileUtil;

import java.io.File;
import java.io.IOException;

import java.net.URL;

import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sarai Díaz
 */
public class RESTBuilderTest {

	@Test
	public void testCreateRESTBuilder() throws Exception {
		Path dependenciesPath = _getDependenciesPath();

		Path copyrightFilePath = dependenciesPath.resolve("copyright.txt");

		Path restConfigPath = dependenciesPath.resolve("rest-config.yaml");

		File restConfigFile = restConfigPath.toFile();

		String initialContent = FileUtil.read(restConfigFile);

		for (int compatibilityVersion = 1;
			 compatibilityVersion <= _MAX_COMPATIBILITY_VERSION;
			 compatibilityVersion++) {

			try {
				FileUtil.write(
					restConfigFile,
					StringUtil.replace(
						FileUtil.read(restConfigFile),
						"${compatibilityVersion}",
						String.valueOf(compatibilityVersion)));

				RESTBuilder restBuilder = new RESTBuilder(
					copyrightFilePath.toFile(), dependenciesPath.toFile(), null,
					null);

				restBuilder.build();

				_assertDirectoryEquals(
					dependenciesPath.resolve(
						"expected/compatibilityVersion" + compatibilityVersion),
					_getActualPath(compatibilityVersion));
			}
			finally {
				FileUtil.write(restConfigFile, initialContent);
			}
		}
	}

	private void _assertDirectoryEquals(Path expectedPath, Path actualPath)
		throws Exception {

		Files.walkFileTree(
			expectedPath,
			new FileVisitor<Path>() {

				@Override
				public FileVisitResult postVisitDirectory(
					Path path, IOException ioException) {

					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult preVisitDirectory(
					Path path, BasicFileAttributes basicFileAttributes) {

					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFile(
						Path path, BasicFileAttributes basicFileAttributes)
					throws IOException {

					Path relativePath = expectedPath.relativize(path);

					Assert.assertEquals(
						"Error comparing " + relativePath,
						new String(Files.readAllBytes(path)),
						new String(
							Files.readAllBytes(
								actualPath.resolve(relativePath))));

					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFileFailed(
					Path file, IOException ioException) {

					Assert.fail("Missing file " + file.toAbsolutePath());

					return FileVisitResult.TERMINATE;
				}

			});
	}

	private Path _getActualPath(int compatibilityVersion) {
		Path path = Paths.get("");

		Path absolutePath = path.toAbsolutePath();

		return Paths.get(
			absolutePath.toString(), "test-classes", "actual",
			"compatibilityVersion" + compatibilityVersion);
	}

	private Path _getDependenciesPath() {
		URL resource = getClass().getResource("");

		return Paths.get(resource.getPath(), "dependencies");
	}

	private static final int _MAX_COMPATIBILITY_VERSION = 4;

}