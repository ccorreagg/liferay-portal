/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DefaultCategoryDisplayPage } from '../models/DefaultCategoryDisplayPage';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class DefaultCategoryDisplayPageService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Deletes the default Category Display Page for a channel.
     * @returns void
     * @throws ApiError
     */
    public deleteHeadlessCommerceAdminChannelV10ChannelsByExternalReferenceCodeDefaultCategoryDisplayPages({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-commerce-admin-channel/v1.0/channels/by-externalReferenceCode/{externalReferenceCode}/default-category-display-pages',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
            },
        });
    }
    /**
     * Gets the default Category Display Page of a channel.
     * @returns DefaultCategoryDisplayPage Successful operation
     * @throws ApiError
     */
    public getHeadlessCommerceAdminChannelV10ChannelsByExternalReferenceCodeDefaultCategoryDisplayPages({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<DefaultCategoryDisplayPage> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-channel/v1.0/channels/by-externalReferenceCode/{externalReferenceCode}/default-category-display-pages',
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
     * Creates or updates the default Category Display Page for a channel.
     * @returns DefaultCategoryDisplayPage Created
     * @returns any Async
     * @throws ApiError
     */
    public postHeadlessCommerceAdminChannelV10ChannelsByExternalReferenceCodeDefaultCategoryDisplayPages({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody: DefaultCategoryDisplayPage,
    }): CancelablePromise<DefaultCategoryDisplayPage | any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-admin-channel/v1.0/channels/by-externalReferenceCode/{externalReferenceCode}/default-category-display-pages',
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
     * Deletes the default Category Display Page for a channel.
     * @returns void
     * @throws ApiError
     */
    public deleteHeadlessCommerceAdminChannelV10ChannelsDefaultCategoryDisplayPages({
        id,
    }: {
        id: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-commerce-admin-channel/v1.0/channels/{id}/default-category-display-pages',
            path: {
                'id': id,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
            },
        });
    }
    /**
     * Gets the default Category Display Page of a channel.
     * @returns DefaultCategoryDisplayPage Successful operation
     * @throws ApiError
     */
    public getHeadlessCommerceAdminChannelV10ChannelsDefaultCategoryDisplayPages({
        id,
    }: {
        id: number,
    }): CancelablePromise<DefaultCategoryDisplayPage> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-channel/v1.0/channels/{id}/default-category-display-pages',
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
     * Creates or updates a default Category Display Page for a channel.
     * @returns DefaultCategoryDisplayPage Created
     * @returns any Async
     * @throws ApiError
     */
    public postHeadlessCommerceAdminChannelV10ChannelsDefaultCategoryDisplayPages({
        id,
        requestBody,
    }: {
        id: number,
        requestBody: DefaultCategoryDisplayPage,
    }): CancelablePromise<DefaultCategoryDisplayPage | any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-admin-channel/v1.0/channels/{id}/default-category-display-pages',
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
