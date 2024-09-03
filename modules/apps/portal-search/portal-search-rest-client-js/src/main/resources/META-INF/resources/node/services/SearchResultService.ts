/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { SearchRequestBody } from '../models/SearchRequestBody';
import type { SearchResult } from '../models/SearchResult';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class SearchResultService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Search the company index for matching content. This endpoint is development and requires setting the portal property 'feature.flag.LPD-11232' to true or enabling via Instance Settings > Feature Flags: Developer.
     * @returns SearchResult
     * @throws ApiError
     */
    public getSearchPage({
        blueprintExternalReferenceCode,
        emptySearch,
        entryClassNames,
        fields,
        filter,
        nestedFields,
        page,
        pageSize,
        restrictFields,
        scope,
        search,
        sort,
    }: {
        blueprintExternalReferenceCode?: string,
        emptySearch?: boolean,
        /**
         * Model class names to be searched for. Defaults to all.
         */
        entryClassNames?: string,
        /**
         * The list of fields to be returned.
         */
        fields?: string,
        filter?: string,
        nestedFields?: string,
        page?: number,
        pageSize?: number,
        restrictFields?: string,
        scope?: string,
        search?: string,
        sort?: string,
    }): CancelablePromise<Array<SearchResult>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/search/v1.0/search',
            query: {
                'blueprintExternalReferenceCode': blueprintExternalReferenceCode,
                'emptySearch': emptySearch,
                'entryClassNames': entryClassNames,
                'fields': fields,
                'filter': filter,
                'nestedFields': nestedFields,
                'page': page,
                'pageSize': pageSize,
                'restrictFields': restrictFields,
                'scope': scope,
                'search': search,
                'sort': sort,
            },
        });
    }
    /**
     * Search the company index for matching content. This endpoint requires setting the portal property 'feature.flag.LPS-179669' to true or enabling via Instance Settings > Feature Flags: Release.
     * @returns SearchResult
     * @throws ApiError
     */
    public postSearchPage({
        entryClassNames,
        fields,
        filter,
        nestedFields,
        page,
        pageSize,
        restrictFields,
        scope,
        search,
        sort,
        requestBody,
    }: {
        /**
         * Model class names to be searched for. Defaults to all.
         */
        entryClassNames?: string,
        /**
         * The list of fields to be returned.
         */
        fields?: string,
        filter?: string,
        nestedFields?: string,
        page?: number,
        pageSize?: number,
        restrictFields?: string,
        scope?: string,
        search?: string,
        sort?: string,
        requestBody?: SearchRequestBody,
    }): CancelablePromise<Array<SearchResult>> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/search/v1.0/search',
            query: {
                'entryClassNames': entryClassNames,
                'fields': fields,
                'filter': filter,
                'nestedFields': nestedFields,
                'page': page,
                'pageSize': pageSize,
                'restrictFields': restrictFields,
                'scope': scope,
                'search': search,
                'sort': sort,
            },
            body: requestBody,
            mediaType: 'application/json',
        });
    }
}
