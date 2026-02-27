/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.product.service.persistence.impl;

import com.liferay.commerce.product.model.CPDefinition;
import com.liferay.commerce.product.model.CPDefinitionLocalizationTable;
import com.liferay.commerce.product.model.CPDefinitionTable;
import com.liferay.commerce.product.service.persistence.CPDefinitionFinder;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryDefinition;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Alessio Antonio Rendina
 */
@Component(service = CPDefinitionFinder.class)
public class CPDefinitionFinderImpl
	extends CPDefinitionFinderBaseImpl implements CPDefinitionFinder {

	@Override
	public int countByG_P_S(
		long groupId, String productTypeName, String languageId,
		QueryDefinition<CPDefinition> queryDefinition) {

		try {
			Long count = cpDefinitionPersistence.dslQuery(
				DSLQueryFactoryUtil.countDistinct(
					CPDefinitionTable.INSTANCE.CPDefinitionId
				).from(
					CPDefinitionTable.INSTANCE
				).leftJoinOn(
					CPDefinitionLocalizationTable.INSTANCE,
					CPDefinitionLocalizationTable.INSTANCE.CPDefinitionId.eq(
						CPDefinitionTable.INSTANCE.CPDefinitionId
					).and(
						CPDefinitionLocalizationTable.INSTANCE.languageId.eq(
							languageId)
					)
				).where(
					CPDefinitionTable.INSTANCE.groupId.eq(
						groupId
					).and(
						CPDefinitionTable.INSTANCE.productTypeName.eq(
							productTypeName)
					).and(
						() -> {
							int status = queryDefinition.getStatus();

							if (status == WorkflowConstants.STATUS_ANY) {
								return CPDefinitionTable.INSTANCE.status.neq(
									WorkflowConstants.STATUS_IN_TRASH);
							}

							return CPDefinitionTable.INSTANCE.status.eq(status);
						}
					)
				));

			return count.intValue();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	@Override
	public List<CPDefinition> findByExpirationDate(
		Date expirationDate, QueryDefinition<CPDefinition> queryDefinition) {

		try {
			return cpDefinitionPersistence.dslQuery(
				DSLQueryFactoryUtil.select(
					CPDefinitionTable.INSTANCE
				).from(
					CPDefinitionTable.INSTANCE
				).where(
					CPDefinitionTable.INSTANCE.expirationDate.isNotNull(
					).and(
						CPDefinitionTable.INSTANCE.expirationDate.lt(
							expirationDate)
					).and(
						() -> {
							int status = queryDefinition.getStatus();

							if (status == WorkflowConstants.STATUS_ANY) {
								return CPDefinitionTable.INSTANCE.status.neq(
									WorkflowConstants.STATUS_IN_TRASH);
							}

							return CPDefinitionTable.INSTANCE.status.eq(status);
						}
					)
				).limit(
					queryDefinition.getStart(), queryDefinition.getEnd()
				));
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	@Override
	public List<CPDefinition> findByG_P_S(
		long groupId, String productTypeName, String languageId,
		QueryDefinition<CPDefinition> queryDefinition) {

		try {
			return cpDefinitionPersistence.dslQuery(
				DSLQueryFactoryUtil.select(
					CPDefinitionTable.INSTANCE
				).from(
					CPDefinitionTable.INSTANCE
				).leftJoinOn(
					CPDefinitionLocalizationTable.INSTANCE,
					CPDefinitionLocalizationTable.INSTANCE.CPDefinitionId.eq(
						CPDefinitionTable.INSTANCE.CPDefinitionId
					).and(
						CPDefinitionLocalizationTable.INSTANCE.languageId.eq(
							languageId)
					)
				).where(
					CPDefinitionTable.INSTANCE.groupId.eq(
						groupId
					).and(
						CPDefinitionTable.INSTANCE.productTypeName.eq(
							productTypeName)
					).and(
						() -> {
							int status = queryDefinition.getStatus();

							if (status == WorkflowConstants.STATUS_ANY) {
								return CPDefinitionTable.INSTANCE.status.neq(
									WorkflowConstants.STATUS_IN_TRASH);
							}

							return CPDefinitionTable.INSTANCE.status.eq(status);
						}
					)
				).orderBy(
					CPDefinitionTable.INSTANCE,
					queryDefinition.getOrderByComparator()
				).limit(
					queryDefinition.getStart(), queryDefinition.getEnd()
				));
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	@Reference
	private CustomSQL _customSQL;

}