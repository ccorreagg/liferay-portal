/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageNodeMetric } from '../models/PageNodeMetric';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class NodeMetricService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageNodeMetric
     * @throws ApiError
     */
    public getProcessNodeMetricsPage({
        processId,
        completed,
        dateEnd,
        dateStart,
        key,
        page,
        pageSize,
        processVersion,
        sort,
    }: {
        processId: number,
        completed?: boolean,
        dateEnd?: string,
        dateStart?: string,
        key?: string,
        page?: number,
        pageSize?: number,
        processVersion?: string,
        sort?: string,
    }): CancelablePromise<PageNodeMetric> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/portal-workflow-metrics/v1.0/processes/{processId}/nodes/metrics',
            path: {
                'processId': processId,
            },
            query: {
                'completed': completed,
                'dateEnd': dateEnd,
                'dateStart': dateStart,
                'key': key,
                'page': page,
                'pageSize': pageSize,
                'processVersion': processVersion,
                'sort': sort,
            },
        });
    }
}
