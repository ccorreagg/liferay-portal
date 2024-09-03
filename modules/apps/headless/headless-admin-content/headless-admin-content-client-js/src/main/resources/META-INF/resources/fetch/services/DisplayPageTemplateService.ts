/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DisplayPageTemplate } from '../models/DisplayPageTemplate';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class DisplayPageTemplateService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Retrieves the display page templates of a site
     * @returns DisplayPageTemplate
     * @throws ApiError
     */
    public getSiteDisplayPageTemplatesPage({
        siteId,
        fields,
        nestedFields,
        page,
        pageSize,
        restrictFields,
        sort,
    }: {
        siteId: number,
        fields?: string,
        nestedFields?: string,
        page?: number,
        pageSize?: number,
        restrictFields?: string,
        sort?: string,
    }): CancelablePromise<Array<DisplayPageTemplate>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-content/v1.0/sites/{siteId}/display-page-templates',
            path: {
                'siteId': siteId,
            },
            query: {
                'fields': fields,
                'nestedFields': nestedFields,
                'page': page,
                'pageSize': pageSize,
                'restrictFields': restrictFields,
                'sort': sort,
            },
        });
    }
    /**
     * Retrieves a display page template of a site
     * @returns DisplayPageTemplate
     * @throws ApiError
     */
    public getSiteDisplayPageTemplate({
        siteId,
        displayPageTemplateKey,
        fields,
        nestedFields,
        restrictFields,
        acceptLanguage,
    }: {
        siteId: number,
        displayPageTemplateKey: string,
        fields?: string,
        nestedFields?: string,
        restrictFields?: string,
        acceptLanguage?: string,
    }): CancelablePromise<DisplayPageTemplate> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-content/v1.0/sites/{siteId}/display-page-templates/{displayPageTemplateKey}',
            path: {
                'siteId': siteId,
                'displayPageTemplateKey': displayPageTemplateKey,
            },
            headers: {
                'Accept-Language': acceptLanguage,
            },
            query: {
                'fields': fields,
                'nestedFields': nestedFields,
                'restrictFields': restrictFields,
            },
        });
    }
}
