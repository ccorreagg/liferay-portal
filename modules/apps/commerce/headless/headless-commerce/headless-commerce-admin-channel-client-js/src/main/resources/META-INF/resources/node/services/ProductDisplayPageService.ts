/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { ProductDisplayPage } from '../models/ProductDisplayPage';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class ProductDisplayPageService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Gets a list of Channel Product Display Pages.
     * @returns ProductDisplayPage Successful operation
     * @throws ApiError
     */
    public getHeadlessCommerceAdminChannelV10ChannelsByExternalReferenceCodeProductDisplayPages({
        externalReferenceCode,
        filter,
        page,
        pageSize,
        search,
        sort,
    }: {
        externalReferenceCode: string,
        filter?: string,
        page?: number,
        pageSize?: number,
        search?: string,
        sort?: string,
    }): CancelablePromise<Array<ProductDisplayPage>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-channel/v1.0/channels/by-externalReferenceCode/{externalReferenceCode}/product-display-pages',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            query: {
                'filter': filter,
                'page': page,
                'pageSize': pageSize,
                'search': search,
                'sort': sort,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Creates or updates a Channel Product Display Page.
     * @returns ProductDisplayPage Created
     * @returns any Async
     * @throws ApiError
     */
    public postHeadlessCommerceAdminChannelV10ChannelsByExternalReferenceCodeProductDisplayPages({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody: ProductDisplayPage,
    }): CancelablePromise<ProductDisplayPage | any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-admin-channel/v1.0/channels/by-externalReferenceCode/{externalReferenceCode}/product-display-pages',
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
     * Gets a list of Channel Product Display Pages.
     * @returns ProductDisplayPage Successful operation
     * @throws ApiError
     */
    public getHeadlessCommerceAdminChannelV10ChannelsProductDisplayPages({
        id,
        filter,
        page,
        pageSize,
        search,
        sort,
    }: {
        id: number,
        filter?: string,
        page?: number,
        pageSize?: number,
        search?: string,
        sort?: string,
    }): CancelablePromise<Array<ProductDisplayPage>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-channel/v1.0/channels/{id}/product-display-pages',
            path: {
                'id': id,
            },
            query: {
                'filter': filter,
                'page': page,
                'pageSize': pageSize,
                'search': search,
                'sort': sort,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Creates or updates a Channel Product Display Page.
     * @returns ProductDisplayPage Created
     * @returns any Async
     * @throws ApiError
     */
    public postHeadlessCommerceAdminChannelV10ChannelsProductDisplayPages({
        id,
        requestBody,
    }: {
        id: number,
        requestBody: ProductDisplayPage,
    }): CancelablePromise<ProductDisplayPage | any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-admin-channel/v1.0/channels/{id}/product-display-pages',
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
    /**
     * Deletes a Product Display Page by ID.
     * @returns void
     * @throws ApiError
     */
    public deleteHeadlessCommerceAdminChannelV10ProductDisplayPages({
        id,
    }: {
        id: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-commerce-admin-channel/v1.0/product-display-pages/{id}',
            path: {
                'id': id,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
            },
        });
    }
    /**
     * Get a Product Display Page by ID.
     * @returns ProductDisplayPage Successful operation
     * @throws ApiError
     */
    public getHeadlessCommerceAdminChannelV10ProductDisplayPages({
        id,
    }: {
        id: number,
    }): CancelablePromise<ProductDisplayPage> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-channel/v1.0/product-display-pages/{id}',
            path: {
                'id': id,
            },
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Updates a Product Display Page by ID.
     * @returns ProductDisplayPage Updated
     * @throws ApiError
     */
    public patchHeadlessCommerceAdminChannelV10ProductDisplayPages({
        id,
        requestBody,
    }: {
        id: number,
        requestBody: ProductDisplayPage,
    }): CancelablePromise<ProductDisplayPage> {
        return this.httpRequest.request({
            method: 'PATCH',
            url: '/headless-commerce-admin-channel/v1.0/product-display-pages/{id}',
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
