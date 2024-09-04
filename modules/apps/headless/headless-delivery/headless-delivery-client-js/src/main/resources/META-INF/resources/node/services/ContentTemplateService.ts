/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { ContentTemplate } from '../models/ContentTemplate';
import type { PageContentTemplate } from '../models/PageContentTemplate';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class ContentTemplateService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageContentTemplate
     * @throws ApiError
     */
    public getAssetLibraryContentTemplatesPage({
        assetLibraryId,
        aggregationTerms,
        fields,
        filter,
        nestedFields,
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
        nestedFields?: string,
        page?: number,
        pageSize?: number,
        restrictFields?: string,
        search?: string,
        sort?: string,
    }): CancelablePromise<PageContentTemplate> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-delivery/v1.0/asset-libraries/{assetLibraryId}/content-templates',
            path: {
                'assetLibraryId': assetLibraryId,
            },
            query: {
                'aggregationTerms': aggregationTerms,
                'fields': fields,
                'filter': filter,
                'nestedFields': nestedFields,
                'page': page,
                'pageSize': pageSize,
                'restrictFields': restrictFields,
                'search': search,
                'sort': sort,
            },
        });
    }
    /**
     * @returns PageContentTemplate
     * @throws ApiError
     */
    public getSiteContentTemplatesPage({
        siteId,
        aggregationTerms,
        fields,
        filter,
        nestedFields,
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
        nestedFields?: string,
        page?: number,
        pageSize?: number,
        restrictFields?: string,
        search?: string,
        sort?: string,
    }): CancelablePromise<PageContentTemplate> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-delivery/v1.0/sites/{siteId}/content-templates',
            path: {
                'siteId': siteId,
            },
            query: {
                'aggregationTerms': aggregationTerms,
                'fields': fields,
                'filter': filter,
                'nestedFields': nestedFields,
                'page': page,
                'pageSize': pageSize,
                'restrictFields': restrictFields,
                'search': search,
                'sort': sort,
            },
        });
    }
    /**
     * @returns ContentTemplate
     * @throws ApiError
     */
    public getSiteContentTemplate({
        siteId,
        contentTemplateId,
        fields,
        nestedFields,
        restrictFields,
    }: {
        siteId: number,
        contentTemplateId: string,
        fields?: string,
        nestedFields?: string,
        restrictFields?: string,
    }): CancelablePromise<ContentTemplate> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-delivery/v1.0/sites/{siteId}/content-templates/{contentTemplateId}',
            path: {
                'siteId': siteId,
                'contentTemplateId': contentTemplateId,
            },
            query: {
                'fields': fields,
                'nestedFields': nestedFields,
                'restrictFields': restrictFields,
            },
        });
    }
}
