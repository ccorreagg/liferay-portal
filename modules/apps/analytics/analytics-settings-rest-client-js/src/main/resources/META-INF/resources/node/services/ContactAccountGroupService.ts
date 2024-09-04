/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageContactAccountGroup } from '../models/PageContactAccountGroup';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class ContactAccountGroupService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageContactAccountGroup
     * @throws ApiError
     */
    public getContactAccountGroupsPage({
        keywords,
        page,
        pageSize,
        sort,
    }: {
        keywords?: string,
        page?: number,
        pageSize?: number,
        sort?: string,
    }): CancelablePromise<PageContactAccountGroup> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/analytics-settings-rest/v1.0/contacts/account-groups',
            query: {
                'keywords': keywords,
                'page': page,
                'pageSize': pageSize,
                'sort': sort,
            },
        });
    }
}
