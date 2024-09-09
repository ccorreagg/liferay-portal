/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {expect, mergeTests} from '@playwright/test';

import {ObjectAdminRestClient} from '../../../../../apps/object/object-admin-rest-client-js/src/main/resources/META-INF/resources/node';
import {backendPageTest} from '../../../fixtures/backendPageTest';
import {ApiHelpers} from '../../../helpers/ApiHelpers';
import {
	LEMON_BASKET_OBJECT_ERC,
	LEMON_OBJECT_ERC,
	PAGE_MANAGEMENT_SITE_ERC,
	POTATO_OBJECT_ERC,
} from './constants';

export const test = mergeTests(backendPageTest);

test('Teardown: Delete site and data for Page Management tests', async ({
	backendPage,
}) => {
	const apiHelpers = new ApiHelpers(backendPage);

	const objectAdminRestClient = await apiHelpers.buildRestClient(
		ObjectAdminRestClient
	);

	// Delete object definitions

	for (const ERC of [
		LEMON_OBJECT_ERC,
		LEMON_BASKET_OBJECT_ERC,
		POTATO_OBJECT_ERC,
	]) {
		const {id} =
			await objectAdminRestClient.objectDefinition.getObjectDefinitionByExternalReferenceCode(
				{
					externalReferenceCode: ERC,
				}
			);

		await objectAdminRestClient.objectDefinition.deleteObjectDefinition({
			objectDefinitionId: id,
		});
	}

	// Delete site

	await expect(
		await apiHelpers.headlessSite.deleteSiteByERC(PAGE_MANAGEMENT_SITE_ERC)
	).toBeOK();
});
