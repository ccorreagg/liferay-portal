/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import React from 'react';

import '../../../css/ReportEntryTextRenderer.scss';

export default function ReportEntryTextRenderer({value}: {value?: string}) {
	if (!value) {
		return null;
	}

	return <div className="report-entry-text">{value}</div>;
}
