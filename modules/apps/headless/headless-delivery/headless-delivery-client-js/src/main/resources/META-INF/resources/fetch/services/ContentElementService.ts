/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { ContentElement } from '../models/ContentElement';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class ContentElementService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns ContentElement
     * @throws ApiError
     */
    public getAssetLibraryContentElementsPage({
        assetLibraryId,
        aggregationTerms,
        fields,
        filter,
        page,
        pageSize,
        restrictFields,
        search,
        sort,
    }: {
        assetLibraryId: number,
        aggregationTerms?: Array<string>,
        fields?: string,
        filter?: string,
        page?: number,
        pageSize?: number,
        restrictFields?: string,
        search?: string,
        sort?: string,
    }): CancelablePromise<Array<ContentElement>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-delivery/v1.0/asset-libraries/{assetLibraryId}/content-elements',
            path: {
                'assetLibraryId': assetLibraryId,
            },
            query: {
                'aggregationTerms': aggregationTerms,
                'fields': fields,
                'filter': filter,
                'page': page,
                'pageSize': pageSize,
                'restrictFields': restrictFields,
                'search': search,
                'sort': sort,
            },
        });
    }
    /**
     * @returns ContentElement
     * @throws ApiError
     */
    public getSiteContentElementsPage({
        siteId,
        aggregationTerms,
        fields,
        filter,
        page,
        pageSize,
        restrictFields,
        search,
        sort,
    }: {
        siteId: number,
        aggregationTerms?: Array<string>,
        fields?: string,
        filter?: string,
        page?: number,
        pageSize?: number,
        restrictFields?: string,
        search?: string,
        sort?: string,
    }): CancelablePromise<Array<ContentElement>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-delivery/v1.0/sites/{siteId}/content-elements',
            path: {
                'siteId': siteId,
            },
            query: {
                'aggregationTerms': aggregationTerms,
                'fields': fields,
                'filter': filter,
                'page': page,
                'pageSize': pageSize,
                'restrictFields': restrictFields,
                'search': search,
                'sort': sort,
            },
        });
    }
}
