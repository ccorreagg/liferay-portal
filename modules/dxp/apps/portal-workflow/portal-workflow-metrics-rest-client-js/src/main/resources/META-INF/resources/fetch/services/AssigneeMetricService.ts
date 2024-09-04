/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { AssigneeMetricBulkSelection } from '../models/AssigneeMetricBulkSelection';
import type { PageAssigneeMetric } from '../models/PageAssigneeMetric';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class AssigneeMetricService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageAssigneeMetric
     * @throws ApiError
     */
    public postProcessAssigneeMetricsPage({
        processId,
        page,
        pageSize,
        sort,
        requestBody,
    }: {
        processId: number,
        page?: number,
        pageSize?: number,
        sort?: string,
        requestBody?: AssigneeMetricBulkSelection,
    }): CancelablePromise<PageAssigneeMetric> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/portal-workflow-metrics/v1.0/processes/{processId}/assignees/metrics',
            path: {
                'processId': processId,
            },
            query: {
                'page': page,
                'pageSize': pageSize,
                'sort': sort,
            },
            body: requestBody,
            mediaType: 'application/json',
        });
    }
}
