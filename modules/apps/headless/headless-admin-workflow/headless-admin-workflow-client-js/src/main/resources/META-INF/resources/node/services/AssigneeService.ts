/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageAssignee } from '../models/PageAssignee';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class AssigneeService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageAssignee
     * @throws ApiError
     */
    public getWorkflowTaskAssignableUsersPage({
        workflowTaskId,
        page,
        pageSize,
    }: {
        workflowTaskId: number,
        page?: number,
        pageSize?: number,
    }): CancelablePromise<PageAssignee> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-workflow/v1.0/workflow-tasks/{workflowTaskId}/assignable-users',
            path: {
                'workflowTaskId': workflowTaskId,
            },
            query: {
                'page': page,
                'pageSize': pageSize,
            },
        });
    }
}
