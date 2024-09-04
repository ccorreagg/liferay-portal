/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageProcessVersion } from '../models/PageProcessVersion';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class ProcessVersionService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageProcessVersion
     * @throws ApiError
     */
    public getProcessProcessVersionsPage({
        processId,
    }: {
        processId: number,
    }): CancelablePromise<PageProcessVersion> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/portal-workflow-metrics/v1.0/processes/{processId}/process-versions',
            path: {
                'processId': processId,
            },
        });
    }
}
