/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageProcessMetric } from '../models/PageProcessMetric';
import type { ProcessMetric } from '../models/ProcessMetric';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class ProcessMetricService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageProcessMetric
     * @throws ApiError
     */
    public getProcessMetricsPage({
        page,
        pageSize,
        sort,
        title,
    }: {
        page?: number,
        pageSize?: number,
        sort?: string,
        title?: string,
    }): CancelablePromise<PageProcessMetric> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/portal-workflow-metrics/v1.0/processes/metrics',
            query: {
                'page': page,
                'pageSize': pageSize,
                'sort': sort,
                'title': title,
            },
        });
    }
    /**
     * @returns ProcessMetric
     * @throws ApiError
     */
    public getProcessMetric({
        processId,
        completed,
        dateEnd,
        dateStart,
    }: {
        processId: number,
        completed?: boolean,
        dateEnd?: string,
        dateStart?: string,
    }): CancelablePromise<ProcessMetric> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/portal-workflow-metrics/v1.0/processes/{processId}/metrics',
            path: {
                'processId': processId,
            },
            query: {
                'completed': completed,
                'dateEnd': dateEnd,
                'dateStart': dateStart,
            },
        });
    }
}
