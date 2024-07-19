/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.dispatch.talend.web.internal.executor;

import com.liferay.dispatch.executor.BaseDispatchTaskExecutor;
import com.liferay.dispatch.executor.DispatchTaskExecutor;
import com.liferay.dispatch.executor.DispatchTaskExecutorOutput;
import com.liferay.dispatch.model.DispatchTrigger;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.IOException;

import org.osgi.service.component.annotations.Component;

/**
 * @author Carlos Correa
 */
@Component(
	property = {
		"dispatch.task.executor.name=s7a3", "dispatch.task.executor.type=s7a3"
	},
	service = DispatchTaskExecutor.class
)
public class S7A3DispatchTaskExecutor extends BaseDispatchTaskExecutor {

	@Override
	public void doExecute(
			DispatchTrigger dispatchTrigger,
			DispatchTaskExecutorOutput dispatchTaskExecutorOutput)
		throws IOException, PortalException {

		if (_log.isInfoEnabled()) {
			_log.info(
				"Invoking #doExecute(DispatchTrigger, " +
					"DispatchTaskExecutorOutput)");
		}
	}

	@Override
	public String getName() {
		return "s7a3";
	}

	private static final Log _log = LogFactoryUtil.getLog(
		S7A3DispatchTaskExecutor.class);

}