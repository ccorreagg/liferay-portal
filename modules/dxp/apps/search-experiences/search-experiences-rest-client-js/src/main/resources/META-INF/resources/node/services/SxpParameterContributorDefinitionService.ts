/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageSXPParameterContributorDefinition } from '../models/PageSXPParameterContributorDefinition';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class SxpParameterContributorDefinitionService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageSXPParameterContributorDefinition
     * @throws ApiError
     */
    public getSxpParameterContributorDefinitionsPage(): CancelablePromise<PageSXPParameterContributorDefinition> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/search-experiences-rest/v1.0/sxp-parameter-contributor-definitions',
        });
    }
}
