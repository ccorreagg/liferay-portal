/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { WebUrl } from '../models/WebUrl';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class WebUrlService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Retrieves the account's web URLs.
     * @returns WebUrl
     * @throws ApiError
     */
    public getAccountByExternalReferenceCodeWebUrlsPage({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<Array<WebUrl>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/accounts/by-external-reference-code/{externalReferenceCode}/web-urls',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
        });
    }
    /**
     * Retrieves the account's web URLs.
     * @returns WebUrl
     * @throws ApiError
     */
    public getAccountWebUrlsPage({
        accountId,
    }: {
        accountId: number,
    }): CancelablePromise<Array<WebUrl>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/accounts/{accountId}/web-urls',
            path: {
                'accountId': accountId,
            },
        });
    }
    /**
     * Retrieves the organization's web URLs.
     * @returns WebUrl
     * @throws ApiError
     */
    public getOrganizationByExternalReferenceCodeWebUrlsPage({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<Array<WebUrl>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/organizations/by-external-reference-code/{externalReferenceCode}/web-urls',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
        });
    }
    /**
     * Retrieves the organization's URLs.
     * @returns WebUrl
     * @throws ApiError
     */
    public getOrganizationWebUrlsPage({
        organizationId,
    }: {
        organizationId: string,
    }): CancelablePromise<Array<WebUrl>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/organizations/{organizationId}/web-urls',
            path: {
                'organizationId': organizationId,
            },
        });
    }
    /**
     * Retrieves the user's web URLs.
     * @returns WebUrl
     * @throws ApiError
     */
    public getUserAccountByExternalReferenceCodeWebUrlsPage({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<Array<WebUrl>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/user-accounts/by-external-reference-code/{externalReferenceCode}/web-urls',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
        });
    }
    /**
     * Retrieves the user's URLs.
     * @returns WebUrl
     * @throws ApiError
     */
    public getUserAccountWebUrlsPage({
        userAccountId,
    }: {
        userAccountId: number,
    }): CancelablePromise<Array<WebUrl>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/user-accounts/{userAccountId}/web-urls',
            path: {
                'userAccountId': userAccountId,
            },
        });
    }
    /**
     * Retrieves the web URL.
     * @returns WebUrl
     * @throws ApiError
     */
    public getWebUrl({
        webUrlId,
    }: {
        webUrlId: number,
    }): CancelablePromise<WebUrl> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/web-urls/{webUrlId}',
            path: {
                'webUrlId': webUrlId,
            },
        });
    }
}
