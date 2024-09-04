/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DSEnvelope } from '../models/DSEnvelope';
import type { PageDSEnvelope } from '../models/PageDSEnvelope';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class DsEnvelopeService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageDSEnvelope
     * @throws ApiError
     */
    public getSiteDsEnvelopesPage({
        siteId,
        fromDate,
        keywords,
        order,
        page,
        pageSize,
        status,
    }: {
        siteId: number,
        fromDate?: string,
        keywords?: string,
        order?: string,
        page?: number,
        pageSize?: number,
        status?: string,
    }): CancelablePromise<PageDSEnvelope> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/digital-signature-rest/v1.0/sites/{siteId}/ds-envelopes',
            path: {
                'siteId': siteId,
            },
            query: {
                'fromDate': fromDate,
                'keywords': keywords,
                'order': order,
                'page': page,
                'pageSize': pageSize,
                'status': status,
            },
        });
    }
    /**
     * @returns DSEnvelope
     * @throws ApiError
     */
    public postSiteDsEnvelope({
        siteId,
        requestBody,
    }: {
        siteId: number,
        requestBody?: DSEnvelope,
    }): CancelablePromise<DSEnvelope> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/digital-signature-rest/v1.0/sites/{siteId}/ds-envelopes',
            path: {
                'siteId': siteId,
            },
            body: requestBody,
            mediaType: 'application/json',
        });
    }
    /**
     * @returns DSEnvelope
     * @throws ApiError
     */
    public getSiteDsEnvelope({
        siteId,
        dsEnvelopeId,
    }: {
        siteId: number,
        dsEnvelopeId: string,
    }): CancelablePromise<DSEnvelope> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/digital-signature-rest/v1.0/sites/{siteId}/ds-envelopes/{dsEnvelopeId}',
            path: {
                'siteId': siteId,
                'dsEnvelopeId': dsEnvelopeId,
            },
        });
    }
}
