/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { SearchResponse } from '../models/SearchResponse';
import type { SXPBlueprint } from '../models/SXPBlueprint';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class SearchResponseService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * This API is only for the Blueprints application's preview. For a search API, use search/v1.0/search instead.
     * @returns SearchResponse
     * @throws ApiError
     */
    public postSearch({
        page,
        pageSize,
        query,
        requestBody,
    }: {
        page?: number,
        pageSize?: number,
        query?: string,
        requestBody?: SXPBlueprint,
    }): CancelablePromise<SearchResponse> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/search-experiences-rest/v1.0/search',
            query: {
                'page': page,
                'pageSize': pageSize,
                'query': query,
            },
            body: requestBody,
            mediaType: 'application/json',
        });
    }
}
