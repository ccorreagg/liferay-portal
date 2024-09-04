/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageProductSpecification } from '../models/PageProductSpecification';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class ProductSpecificationService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Gets a list of Values related to a Specification.
     * @returns PageProductSpecification Successful operation
     * @throws ApiError
     */
    public getChannelByExternalReferenceCodeChannelExternalReferenceCodeProductByExternalReferenceCodeProductExternalReferenceCodeProductSpecificationsPage({
        channelExternalReferenceCode,
        productExternalReferenceCode,
        page,
        pageSize,
    }: {
        channelExternalReferenceCode: string,
        productExternalReferenceCode: string,
        page?: number,
        pageSize?: number,
    }): CancelablePromise<PageProductSpecification> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-catalog/v1.0/channels/by-externalReferenceCode/{channelExternalReferenceCode}/products/by-externalReferenceCode/{productExternalReferenceCode}/product-specifications',
            path: {
                'channelExternalReferenceCode': channelExternalReferenceCode,
                'productExternalReferenceCode': productExternalReferenceCode,
            },
            query: {
                'page': page,
                'pageSize': pageSize,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Gets a list of Values related to a Specification.
     * @returns PageProductSpecification Successful operation
     * @throws ApiError
     */
    public getChannelProductProductSpecificationsPage({
        channelId,
        productId,
        page,
        pageSize,
    }: {
        channelId: number,
        productId: number,
        page?: number,
        pageSize?: number,
    }): CancelablePromise<PageProductSpecification> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-catalog/v1.0/channels/{channelId}/products/{productId}/product-specifications',
            path: {
                'channelId': channelId,
                'productId': productId,
            },
            query: {
                'page': page,
                'pageSize': pageSize,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
}
