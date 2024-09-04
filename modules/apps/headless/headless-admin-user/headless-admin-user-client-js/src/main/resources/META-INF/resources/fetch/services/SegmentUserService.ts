/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageSegmentUser } from '../models/PageSegmentUser';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class SegmentUserService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Gets a segment's users.
     * @returns PageSegmentUser
     * @throws ApiError
     */
    public getSegmentUserAccountsPage({
        segmentId,
        page,
        pageSize,
    }: {
        segmentId: number,
        page?: number,
        pageSize?: number,
    }): CancelablePromise<PageSegmentUser> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/segments/{segmentId}/user-accounts',
            path: {
                'segmentId': segmentId,
            },
            query: {
                'page': page,
                'pageSize': pageSize,
            },
        });
    }
}
