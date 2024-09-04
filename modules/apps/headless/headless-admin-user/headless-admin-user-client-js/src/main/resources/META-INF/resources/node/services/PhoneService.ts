/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PagePhone } from '../models/PagePhone';
import type { Phone } from '../models/Phone';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class PhoneService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Retrieves the account's phone numbers.
     * @returns PagePhone
     * @throws ApiError
     */
    public getAccountByExternalReferenceCodePhonesPage({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<PagePhone> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/accounts/by-external-reference-code/{externalReferenceCode}/phones',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
        });
    }
    /**
     * Retrieves the account's phone numbers.
     * @returns PagePhone
     * @throws ApiError
     */
    public getAccountPhonesPage({
        accountId,
    }: {
        accountId: number,
    }): CancelablePromise<PagePhone> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/accounts/{accountId}/phones',
            path: {
                'accountId': accountId,
            },
        });
    }
    /**
     * Retrieves the organization's phone numbers.
     * @returns PagePhone
     * @throws ApiError
     */
    public getOrganizationByExternalReferenceCodePhonesPage({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<PagePhone> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/organizations/by-external-reference-code/{externalReferenceCode}/phones',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
        });
    }
    /**
     * Retrieves the organization's phone numbers.
     * @returns PagePhone
     * @throws ApiError
     */
    public getOrganizationPhonesPage({
        organizationId,
    }: {
        organizationId: string,
    }): CancelablePromise<PagePhone> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/organizations/{organizationId}/phones',
            path: {
                'organizationId': organizationId,
            },
        });
    }
    /**
     * Retrieves the phone number.
     * @returns Phone
     * @throws ApiError
     */
    public getPhone({
        phoneId,
    }: {
        phoneId: number,
    }): CancelablePromise<Phone> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/phones/{phoneId}',
            path: {
                'phoneId': phoneId,
            },
        });
    }
    /**
     * Retrieves the user's phone numbers.
     * @returns PagePhone
     * @throws ApiError
     */
    public getUserAccountByExternalReferenceCodePhonesPage({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<PagePhone> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/user-accounts/by-external-reference-code/{externalReferenceCode}/phones',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
        });
    }
    /**
     * Retrieves the user's phone numbers.
     * @returns PagePhone
     * @throws ApiError
     */
    public getUserAccountPhonesPage({
        userAccountId,
    }: {
        userAccountId: number,
    }): CancelablePromise<PagePhone> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/user-accounts/{userAccountId}/phones',
            path: {
                'userAccountId': userAccountId,
            },
        });
    }
}
