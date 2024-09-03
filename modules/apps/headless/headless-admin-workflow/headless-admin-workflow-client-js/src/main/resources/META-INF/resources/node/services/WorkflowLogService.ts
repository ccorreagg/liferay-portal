/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { WorkflowLog } from '../models/WorkflowLog';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class WorkflowLogService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns WorkflowLog
     * @throws ApiError
     */
    public getWorkflowInstanceWorkflowLogsPage({
        workflowInstanceId,
        page,
        pageSize,
        types,
    }: {
        workflowInstanceId: number,
        page?: number,
        pageSize?: number,
        types?: Array<'NodeEntry' | 'TaskAssign' | 'TaskCompletion' | 'TaskUpdate' | 'Transition'>,
    }): CancelablePromise<Array<WorkflowLog>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-workflow/v1.0/workflow-instances/{workflowInstanceId}/workflow-logs',
            path: {
                'workflowInstanceId': workflowInstanceId,
            },
            query: {
                'page': page,
                'pageSize': pageSize,
                'types': types,
            },
        });
    }
    /**
     * @returns WorkflowLog
     * @throws ApiError
     */
    public getWorkflowLog({
        workflowLogId,
    }: {
        workflowLogId: number,
    }): CancelablePromise<WorkflowLog> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-workflow/v1.0/workflow-logs/{workflowLogId}',
            path: {
                'workflowLogId': workflowLogId,
            },
        });
    }
    /**
     * @returns WorkflowLog
     * @throws ApiError
     */
    public getWorkflowTaskWorkflowLogsPage({
        workflowTaskId,
        page,
        pageSize,
        types,
    }: {
        workflowTaskId: number,
        page?: number,
        pageSize?: number,
        types?: Array<'TaskAssign' | 'TaskCompletion' | 'TaskUpdate' | 'Transition'>,
    }): CancelablePromise<Array<WorkflowLog>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-workflow/v1.0/workflow-tasks/{workflowTaskId}/workflow-logs',
            path: {
                'workflowTaskId': workflowTaskId,
            },
            query: {
                'page': page,
                'pageSize': pageSize,
                'types': types,
            },
        });
    }
}
