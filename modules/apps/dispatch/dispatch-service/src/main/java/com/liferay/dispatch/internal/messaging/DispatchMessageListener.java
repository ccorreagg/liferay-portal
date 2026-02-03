/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.dispatch.internal.messaging;

import com.liferay.dispatch.constants.DispatchConstants;
import com.liferay.dispatch.executor.DispatchTaskExecutor;
import com.liferay.dispatch.executor.DispatchTaskExecutorRegistry;
import com.liferay.dispatch.executor.DispatchTaskStatus;
import com.liferay.dispatch.model.DispatchLog;
import com.liferay.dispatch.model.DispatchTrigger;
import com.liferay.dispatch.service.DispatchLogLocalService;
import com.liferay.dispatch.service.DispatchTriggerLocalService;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;

import java.util.Date;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Matija Petanjek
 */
@Component(
	property = "destination.name=" + DispatchConstants.EXECUTOR_DESTINATION_NAME,
	service = MessageListener.class
)
public class DispatchMessageListener extends BaseMessageListener {

	@Override
	public void doReceive(Message message) throws Exception {
		String payload = (String)message.getPayload();

		JSONObject jsonObject = _jsonFactory.createJSONObject(payload);

		long dispatchTriggerId = jsonObject.getLong("dispatchTriggerId");

		DispatchTrigger dispatchTrigger =
			_dispatchTriggerLocalService.fetchDispatchTrigger(
				dispatchTriggerId);

		if (dispatchTrigger == null) {
			return;
		}

		DispatchTaskExecutor dispatchTaskExecutor =
			_dispatchTaskExecutorRegistry.fetchDispatchTaskExecutor(
				dispatchTrigger.getDispatchTaskExecutorType());

		if (!dispatchTrigger.isOverlapAllowed()) {
			DispatchLog dispatchLog =
				_dispatchLogLocalService.fetchLatestDispatchLog(
					dispatchTriggerId, DispatchTaskStatus.IN_PROGRESS);

			if (dispatchLog != null) {
				String error = null;

				if (dispatchTaskExecutor == null) {
					error =
						"Unable to find dispatch task executor of type " +
							dispatchTrigger.getDispatchTaskExecutorType();
				}
				else if (!dispatchTaskExecutor.isExecutionInProgress(
							dispatchTriggerId)) {

					_dispatchLogLocalService.updateDispatchLog(
						dispatchLog.getDispatchLogId(), new Date(),
						"This execution is no longer in progress", null,
						DispatchTaskStatus.FAILED);

					doReceive(message);

					return;
				}
				else {
					error = "Only one instance in progress is allowed";
				}

				Date date = new Date();

				_dispatchLogLocalService.addDispatchLog(
					dispatchTrigger.getUserId(),
					dispatchTrigger.getDispatchTriggerId(), date, error, null,
					date, DispatchTaskStatus.CANCELED);

				return;
			}
		}

		_execute(dispatchTaskExecutor, dispatchTrigger);
	}

	private void _execute(
			DispatchTaskExecutor dispatchTaskExecutor,
			DispatchTrigger dispatchTrigger)
		throws Exception {

		if (dispatchTaskExecutor != null) {
			dispatchTaskExecutor.execute(
				dispatchTrigger.getDispatchTriggerId());

			return;
		}

		String message =
			"Unable to find dispatch task executor of type " +
				dispatchTrigger.getDispatchTaskExecutorType();

		if (_log.isWarnEnabled()) {
			_log.warn(message);
		}

		Date date = new Date();

		_dispatchLogLocalService.addDispatchLog(
			dispatchTrigger.getUserId(), dispatchTrigger.getDispatchTriggerId(),
			date, message, null, date, DispatchTaskStatus.CANCELED);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		DispatchMessageListener.class);

	@Reference
	private DispatchLogLocalService _dispatchLogLocalService;

	@Reference
	private DispatchTaskExecutorRegistry _dispatchTaskExecutorRegistry;

	@Reference
	private DispatchTriggerLocalService _dispatchTriggerLocalService;

	@Reference
	private JSONFactory _jsonFactory;

}