/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { EmailAddress } from '../models/EmailAddress';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class EmailAddressService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Retrieves the account's email addresses.
     * @returns EmailAddress
     * @throws ApiError
     */
    public getAccountByExternalReferenceCodeEmailAddressesPage({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<Array<EmailAddress>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/accounts/by-external-reference-code/{externalReferenceCode}/email-addresses',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
        });
    }
    /**
     * Retrieves the account's email addresses.
     * @returns EmailAddress
     * @throws ApiError
     */
    public getAccountEmailAddressesPage({
        accountId,
    }: {
        accountId: number,
    }): CancelablePromise<Array<EmailAddress>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/accounts/{accountId}/email-addresses',
            path: {
                'accountId': accountId,
            },
        });
    }
    /**
     * Retrieves the email address.
     * @returns EmailAddress
     * @throws ApiError
     */
    public getEmailAddress({
        emailAddressId,
    }: {
        emailAddressId: number,
    }): CancelablePromise<EmailAddress> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/email-addresses/{emailAddressId}',
            path: {
                'emailAddressId': emailAddressId,
            },
        });
    }
    /**
     * Retrieves the organization's email addresses.
     * @returns EmailAddress
     * @throws ApiError
     */
    public getOrganizationByExternalReferenceCodeEmailAddressesPage({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<Array<EmailAddress>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/organizations/by-external-reference-code/{externalReferenceCode}/email-addresses',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
        });
    }
    /**
     * Retrieves the organization's email addresses.
     * @returns EmailAddress
     * @throws ApiError
     */
    public getOrganizationEmailAddressesPage({
        organizationId,
    }: {
        organizationId: string,
    }): CancelablePromise<Array<EmailAddress>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/organizations/{organizationId}/email-addresses',
            path: {
                'organizationId': organizationId,
            },
        });
    }
    /**
     * Retrieves the user's email addresses.
     * @returns EmailAddress
     * @throws ApiError
     */
    public getUserAccountByExternalReferenceCodeEmailAddressesPage({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<Array<EmailAddress>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/user-accounts/by-external-reference-code/{externalReferenceCode}/email-addresses',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
        });
    }
    /**
     * Retrieves the user's email addresses.
     * @returns EmailAddress
     * @throws ApiError
     */
    public getUserAccountEmailAddressesPage({
        userAccountId,
    }: {
        userAccountId: number,
    }): CancelablePromise<Array<EmailAddress>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/user-accounts/{userAccountId}/email-addresses',
            path: {
                'userAccountId': userAccountId,
            },
        });
    }
}
