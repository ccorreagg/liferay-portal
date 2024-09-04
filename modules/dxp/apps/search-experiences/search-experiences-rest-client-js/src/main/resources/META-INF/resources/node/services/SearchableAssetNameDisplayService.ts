/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageSearchableAssetNameDisplay } from '../models/PageSearchableAssetNameDisplay';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class SearchableAssetNameDisplayService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageSearchableAssetNameDisplay
     * @throws ApiError
     */
    public getSearchableAssetNameLanguagePage({
        languageId,
    }: {
        languageId: string,
    }): CancelablePromise<PageSearchableAssetNameDisplay> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/search-experiences-rest/v1.0/searchable-asset-names/{languageId}',
            path: {
                'languageId': languageId,
            },
        });
    }
}
