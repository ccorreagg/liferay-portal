/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageModelPrefilterContributor } from '../models/PageModelPrefilterContributor';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class ModelPrefilterContributorService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageModelPrefilterContributor
     * @throws ApiError
     */
    public getModelPrefilterContributorsPage(): CancelablePromise<PageModelPrefilterContributor> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/search-experiences-rest/v1.0/model-prefilter-contributors',
        });
    }
}
