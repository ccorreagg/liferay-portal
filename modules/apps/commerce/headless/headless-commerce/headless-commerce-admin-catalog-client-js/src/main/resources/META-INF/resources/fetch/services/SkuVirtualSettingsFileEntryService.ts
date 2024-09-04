/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageSkuVirtualSettingsFileEntry } from '../models/PageSkuVirtualSettingsFileEntry';
import type { SkuVirtualSettingsFileEntry } from '../models/SkuVirtualSettingsFileEntry';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class SkuVirtualSettingsFileEntryService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Deletes a sku virtual setting file entry by ID.
     * @returns void
     * @throws ApiError
     */
    public deleteSkuVirtualSettingsFileEntry({
        id,
    }: {
        id: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-commerce-admin-catalog/v1.0/sku-virtual-settings-file-entries/{id}',
            path: {
                'id': id,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
            },
        });
    }
    /**
     * Gets a sku virtual setting file entry by ID.
     * @returns SkuVirtualSettingsFileEntry Successful operation
     * @throws ApiError
     */
    public getSkuVirtualSettingsFileEntry({
        id,
    }: {
        id: number,
    }): CancelablePromise<SkuVirtualSettingsFileEntry> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-catalog/v1.0/sku-virtual-settings-file-entries/{id}',
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
     * Updates a sku virtual setting file entry by ID.
     * @returns SkuVirtualSettingsFileEntry Updated
     * @throws ApiError
     */
    public patchSkuVirtualSettingsFileEntry({
        id,
        formData,
    }: {
        id: number,
        formData?: {
            file?: Blob;
            skuVirtualSettingsFileEntry?: SkuVirtualSettingsFileEntry;
        },
    }): CancelablePromise<SkuVirtualSettingsFileEntry> {
        return this.httpRequest.request({
            method: 'PATCH',
            url: '/headless-commerce-admin-catalog/v1.0/sku-virtual-settings-file-entries/{id}',
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
     * Gets a list of sku virtual settings file entries.
     * @returns PageSkuVirtualSettingsFileEntry Successful operation
     * @throws ApiError
     */
    public getSkuVirtualSettingIdSkuVirtualSettingsFileEntriesPage({
        id,
        page,
        pageSize,
    }: {
        id: number,
        page?: number,
        pageSize?: number,
    }): CancelablePromise<PageSkuVirtualSettingsFileEntry> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-catalog/v1.0/sku-virtual-settings/{id}/sku-virtual-settings-file-entries',
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
     * @returns SkuVirtualSettingsFileEntry
     * @throws ApiError
     */
    public postSkuVirtualSettingIdSkuVirtualSettingsFileEntry({
        id,
        formData,
    }: {
        id: number,
        formData?: {
            file?: Blob;
            skuVirtualSettingsFileEntry?: SkuVirtualSettingsFileEntry;
        },
    }): CancelablePromise<SkuVirtualSettingsFileEntry> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-admin-catalog/v1.0/sku-virtual-settings/{id}/sku-virtual-settings-file-entries',
            path: {
                'id': id,
            },
            formData: formData,
            mediaType: 'multipart/form-data',
        });
    }
}
