/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { AssigneeBulkSelection } from '../models/AssigneeBulkSelection';
import type { PageAssignee } from '../models/PageAssignee';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class AssigneeService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageAssignee
     * @throws ApiError
     */
    public postProcessAssigneesPage({
        processId,
        requestBody,
    }: {
        processId: number,
        requestBody?: AssigneeBulkSelection,
    }): CancelablePromise<PageAssignee> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/portal-workflow-metrics/v1.0/processes/{processId}/assignees',
            path: {
                'processId': processId,
            },
            body: requestBody,
            mediaType: 'application/json',
        });
    }
}
