/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { CTEntry } from '../models/CTEntry';
import type { PageCTEntry } from '../models/PageCTEntry';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class CtEntryService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageCTEntry
     * @throws ApiError
     */
    public getCtCollectionCtEntriesPage({
        ctCollectionId,
        filter,
        page,
        pageSize,
        search,
        showHideable,
        sort,
    }: {
        ctCollectionId: number,
        filter?: string,
        page?: number,
        pageSize?: number,
        search?: string,
        showHideable?: boolean,
        sort?: string,
    }): CancelablePromise<PageCTEntry> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/change-tracking-rest/v1.0/ct-collections/{ctCollectionId}/ct-entries',
            path: {
                'ctCollectionId': ctCollectionId,
            },
            query: {
                'filter': filter,
                'page': page,
                'pageSize': pageSize,
                'search': search,
                'showHideable': showHideable,
                'sort': sort,
            },
        });
    }
    /**
     * @returns CTEntry
     * @throws ApiError
     */
    public getCtCollectionCtEntryByModelClassNameByModelClassPkModelClassPk({
        ctCollectionId,
        modelClassNameId,
        modelClassPk,
    }: {
        ctCollectionId: number,
        modelClassNameId: number,
        modelClassPk: number,
    }): CancelablePromise<CTEntry> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/change-tracking-rest/v1.0/ct-collections/{ctCollectionId}/ct-entries/by-model-class-name-id/{modelClassNameId}/by-model-class-pk/{modelClassPK}',
            path: {
                'ctCollectionId': ctCollectionId,
                'modelClassNameId': modelClassNameId,
                'modelClassPK': modelClassPk,
            },
        });
    }
    /**
     * @returns CTEntry
     * @throws ApiError
     */
    public getCtEntry({
        ctEntryId,
    }: {
        ctEntryId: number,
    }): CancelablePromise<CTEntry> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/change-tracking-rest/v1.0/ct-entries/{ctEntryId}',
            path: {
                'ctEntryId': ctEntryId,
            },
        });
    }
}
