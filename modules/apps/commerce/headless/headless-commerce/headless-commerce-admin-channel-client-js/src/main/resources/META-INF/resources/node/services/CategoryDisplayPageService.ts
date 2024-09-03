/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { CategoryDisplayPage } from '../models/CategoryDisplayPage';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class CategoryDisplayPageService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Deletes a Category Display Page by ID.
     * @returns void
     * @throws ApiError
     */
    public deleteHeadlessCommerceAdminChannelV10CategoryDisplayPages({
        id,
    }: {
        id: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-commerce-admin-channel/v1.0/category-display-pages/{id}',
            path: {
                'id': id,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
            },
        });
    }
    /**
     * Get a Category Display Page by ID.
     * @returns CategoryDisplayPage Successful operation
     * @throws ApiError
     */
    public getHeadlessCommerceAdminChannelV10CategoryDisplayPages({
        id,
    }: {
        id: number,
    }): CancelablePromise<CategoryDisplayPage> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-channel/v1.0/category-display-pages/{id}',
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
     * Updates a Category Display Page by ID.
     * @returns CategoryDisplayPage Updated
     * @throws ApiError
     */
    public patchHeadlessCommerceAdminChannelV10CategoryDisplayPages({
        id,
        requestBody,
    }: {
        id: number,
        requestBody: CategoryDisplayPage,
    }): CancelablePromise<CategoryDisplayPage> {
        return this.httpRequest.request({
            method: 'PATCH',
            url: '/headless-commerce-admin-channel/v1.0/category-display-pages/{id}',
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
     * Gets a list of Channel Category Display Pages.
     * @returns CategoryDisplayPage Successful operation
     * @throws ApiError
     */
    public getHeadlessCommerceAdminChannelV10ChannelsByExternalReferenceCodeCategoryDisplayPages({
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
    }): CancelablePromise<Array<CategoryDisplayPage>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-channel/v1.0/channels/by-externalReferenceCode/{externalReferenceCode}/category-display-pages',
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
     * Creates or updates a Channel Category Display Page.
     * @returns CategoryDisplayPage Created
     * @returns any Async
     * @throws ApiError
     */
    public postHeadlessCommerceAdminChannelV10ChannelsByExternalReferenceCodeCategoryDisplayPages({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody: CategoryDisplayPage,
    }): CancelablePromise<CategoryDisplayPage | any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-admin-channel/v1.0/channels/by-externalReferenceCode/{externalReferenceCode}/category-display-pages',
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
     * Gets a list of Channel Category Display Pages.
     * @returns CategoryDisplayPage Successful operation
     * @throws ApiError
     */
    public getHeadlessCommerceAdminChannelV10ChannelsCategoryDisplayPages({
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
    }): CancelablePromise<Array<CategoryDisplayPage>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-channel/v1.0/channels/{id}/category-display-pages',
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
     * Creates or updates a Channel Category Display Page.
     * @returns CategoryDisplayPage Created
     * @returns any Async
     * @throws ApiError
     */
    public postHeadlessCommerceAdminChannelV10ChannelsCategoryDisplayPages({
        id,
        requestBody,
    }: {
        id: number,
        requestBody: CategoryDisplayPage,
    }): CancelablePromise<CategoryDisplayPage | any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-admin-channel/v1.0/channels/{id}/category-display-pages',
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
