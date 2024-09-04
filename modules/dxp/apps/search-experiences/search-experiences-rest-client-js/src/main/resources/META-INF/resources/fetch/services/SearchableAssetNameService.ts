/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageSearchableAssetName } from '../models/PageSearchableAssetName';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class SearchableAssetNameService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageSearchableAssetName
     * @throws ApiError
     */
    public getSearchableAssetNamesPage(): CancelablePromise<PageSearchableAssetName> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/search-experiences-rest/v1.0/searchable-asset-names',
        });
    }
}
