/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageReindexStatus } from '../models/PageReindexStatus';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class ReindexStatusService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageReindexStatus
     * @throws ApiError
     */
    public getReindexStatusesPage(): CancelablePromise<PageReindexStatus> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/portal-workflow-metrics/v1.0/reindex/statuses',
        });
    }
}
