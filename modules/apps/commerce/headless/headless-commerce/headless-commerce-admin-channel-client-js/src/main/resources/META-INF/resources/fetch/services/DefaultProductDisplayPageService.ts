/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DefaultProductDisplayPage } from '../models/DefaultProductDisplayPage';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class DefaultProductDisplayPageService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Deletes the default Product Display Page for a channel.
     * @returns void
     * @throws ApiError
     */
    public deleteHeadlessCommerceAdminChannelV10ChannelsByExternalReferenceCodeDefaultProductDisplayPage({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-commerce-admin-channel/v1.0/channels/by-externalReferenceCode/{externalReferenceCode}/default-product-display-page',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
            },
        });
    }
    /**
     * Gets the default Product Display Page for a channel.
     * @returns DefaultProductDisplayPage Successful operation
     * @throws ApiError
     */
    public getHeadlessCommerceAdminChannelV10ChannelsByExternalReferenceCodeDefaultProductDisplayPage({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<DefaultProductDisplayPage> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-channel/v1.0/channels/by-externalReferenceCode/{externalReferenceCode}/default-product-display-page',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Creates or updates the default Product Display Page for a channel.
     * @returns DefaultProductDisplayPage Created
     * @returns any Async
     * @throws ApiError
     */
    public postHeadlessCommerceAdminChannelV10ChannelsByExternalReferenceCodeDefaultProductDisplayPage({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody: DefaultProductDisplayPage,
    }): CancelablePromise<DefaultProductDisplayPage | any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-admin-channel/v1.0/channels/by-externalReferenceCode/{externalReferenceCode}/default-product-display-page',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            body: requestBody,
            mediaType: 'application/json',
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Deletes a Product default Product Display Page for a channel.
     * @returns void
     * @throws ApiError
     */
    public deleteHeadlessCommerceAdminChannelV10ChannelsDefaultProductDisplayPages({
        id,
    }: {
        id: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-commerce-admin-channel/v1.0/channels/{id}/default-product-display-pages',
            path: {
                'id': id,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
            },
        });
    }
    /**
     * Gets the default Product Display Page for a channel.
     * @returns DefaultProductDisplayPage Successful operation
     * @throws ApiError
     */
    public getHeadlessCommerceAdminChannelV10ChannelsDefaultProductDisplayPages({
        id,
    }: {
        id: number,
    }): CancelablePromise<DefaultProductDisplayPage> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-channel/v1.0/channels/{id}/default-product-display-pages',
            path: {
                'id': id,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Creates or updates the default Product Display Page for a channel.
     * @returns DefaultProductDisplayPage Created
     * @returns any Async
     * @throws ApiError
     */
    public postHeadlessCommerceAdminChannelV10ChannelsDefaultProductDisplayPages({
        id,
        requestBody,
    }: {
        id: number,
        requestBody: DefaultProductDisplayPage,
    }): CancelablePromise<DefaultProductDisplayPage | any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-admin-channel/v1.0/channels/{id}/default-product-display-pages',
            path: {
                'id': id,
            },
            body: requestBody,
            mediaType: 'application/json',
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
}
