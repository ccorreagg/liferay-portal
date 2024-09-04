/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageRole } from '../models/PageRole';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class RoleService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageRole
     * @throws ApiError
     */
    public getProcessRolesPage({
        processId,
        completed,
    }: {
        processId: number,
        completed?: boolean,
    }): CancelablePromise<PageRole> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/portal-workflow-metrics/v1.0/processes/{processId}/roles',
            path: {
                'processId': processId,
            },
            query: {
                'completed': completed,
            },
        });
    }
}
