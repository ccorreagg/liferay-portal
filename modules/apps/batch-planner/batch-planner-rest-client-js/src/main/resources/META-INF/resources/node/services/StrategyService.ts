/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageStrategy } from '../models/PageStrategy';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class StrategyService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageStrategy
     * @throws ApiError
     */
    public getPlanInternalClassNameKeyStrategiesPage({
        internalClassNameKey,
    }: {
        internalClassNameKey: string,
    }): CancelablePromise<PageStrategy> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/batch-planner/v1.0/plans/{internalClassNameKey}/strategies',
            path: {
                'internalClassNameKey': internalClassNameKey,
            },
        });
    }
}
