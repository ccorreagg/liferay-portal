/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { ProductVirtualSettingsFileEntry } from '../models/ProductVirtualSettingsFileEntry';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class ProductVirtualSettingsFileEntryService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Deletes a product virtual setting file entry by ID.
     * @returns void
     * @throws ApiError
     */
    public deleteProductVirtualSettingsFileEntry({
        id,
    }: {
        id: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-commerce-admin-catalog/v1.0/product-virtual-settings-file-entries/{id}',
            path: {
                'id': id,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
            },
        });
    }
    /**
     * Gets a product virtual setting file entry by ID.
     * @returns ProductVirtualSettingsFileEntry Successful operation
     * @throws ApiError
     */
    public getProductVirtualSettingsFileEntry({
        id,
    }: {
        id: number,
    }): CancelablePromise<ProductVirtualSettingsFileEntry> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-catalog/v1.0/product-virtual-settings-file-entries/{id}',
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
     * Updates a product virtual setting file entry by ID.
     * @returns ProductVirtualSettingsFileEntry Updated
     * @throws ApiError
     */
    public patchProductVirtualSettingsFileEntry({
        id,
        formData,
    }: {
        id: number,
        formData?: {
            file?: Blob;
            productVirtualSettingsFileEntry?: ProductVirtualSettingsFileEntry;
        },
    }): CancelablePromise<ProductVirtualSettingsFileEntry> {
        return this.httpRequest.request({
            method: 'PATCH',
            url: '/headless-commerce-admin-catalog/v1.0/product-virtual-settings-file-entries/{id}',
            path: {
                'id': id,
            },
            formData: formData,
            mediaType: 'multipart/form-data',
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Gets a list of virtual settings file entries.
     * @returns ProductVirtualSettingsFileEntry Successful operation
     * @throws ApiError
     */
    public getProductVirtualSettingIdProductVirtualSettingsFileEntriesPage({
        id,
        page,
        pageSize,
    }: {
        id: number,
        page?: number,
        pageSize?: number,
    }): CancelablePromise<Array<ProductVirtualSettingsFileEntry>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-catalog/v1.0/product-virtual-settings/{id}/product-virtual-settings-file-entries',
            path: {
                'id': id,
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
     * @returns ProductVirtualSettingsFileEntry
     * @throws ApiError
     */
    public postProductVirtualSettingIdProductVirtualSettingsFileEntry({
        id,
        formData,
    }: {
        id: number,
        formData?: {
            file?: Blob;
            productVirtualSettingsFileEntry?: ProductVirtualSettingsFileEntry;
        },
    }): CancelablePromise<ProductVirtualSettingsFileEntry> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-admin-catalog/v1.0/product-virtual-settings/{id}/product-virtual-settings-file-entries',
            path: {
                'id': id,
            },
            formData: formData,
            mediaType: 'multipart/form-data',
        });
    }
}
