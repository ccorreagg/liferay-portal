/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { RelatedProduct } from '../models/RelatedProduct';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class RelatedProductService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Gets a list of Related Products of a Product.
     * @returns RelatedProduct Successful operation
     * @throws ApiError
     */
    public getChannelProductRelatedProductsPage({
        channelId,
        productId,
        page,
        pageSize,
        type,
    }: {
        channelId: number,
        productId: number,
        page?: number,
        pageSize?: number,
        type?: string,
    }): CancelablePromise<Array<RelatedProduct>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-catalog/v1.0/channels/{channelId}/products/{productId}/related-products',
            path: {
                'channelId': channelId,
                'productId': productId,
            },
            query: {
                'page': page,
                'pageSize': pageSize,
                'type': type,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
}
