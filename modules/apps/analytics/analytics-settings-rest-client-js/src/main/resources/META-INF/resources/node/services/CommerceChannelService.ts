/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageCommerceChannel } from '../models/PageCommerceChannel';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class CommerceChannelService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageCommerceChannel
     * @throws ApiError
     */
    public getCommerceChannelsPage({
        keywords,
        page,
        pageSize,
        sort,
    }: {
        keywords?: string,
        page?: number,
        pageSize?: number,
        sort?: string,
    }): CancelablePromise<PageCommerceChannel> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/analytics-settings-rest/v1.0/commerce-channels',
            query: {
                'keywords': keywords,
                'page': page,
                'pageSize': pageSize,
                'sort': sort,
            },
        });
    }
}
