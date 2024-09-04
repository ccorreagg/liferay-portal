/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageDataDefinitionFieldLink } from '../models/PageDataDefinitionFieldLink';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class DataDefinitionFieldLinkService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageDataDefinitionFieldLink
     * @throws ApiError
     */
    public getDataDefinitionDataDefinitionFieldLinksPage({
        dataDefinitionId,
        fieldName,
    }: {
        dataDefinitionId: number,
        fieldName?: string,
    }): CancelablePromise<PageDataDefinitionFieldLink> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/data-engine/v2.0/data-definitions/{dataDefinitionId}/data-definition-field-links',
            path: {
                'dataDefinitionId': dataDefinitionId,
            },
            query: {
                'fieldName': fieldName,
            },
        });
    }
}
