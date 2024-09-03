/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { CustomField } from './CustomField';
import type { EmailAddress } from './EmailAddress';
import type { Phone } from './Phone';
import type { PostalAddress } from './PostalAddress';
import type { UserAccount } from './UserAccount';
import type { WebUrl } from './WebUrl';
/**
 * An account represents an external account, for example a customer business.
 */
export type Account = {
    /**
     * The account's contact information.
     */
    accountContactInformation?: {
        /**
         * A list of the account's email addresses, with one optionally marked as primary.
         */
        emailAddresses?: Array<EmailAddress>;
        /**
         * The account's Facebook account.
         */
        facebook?: string;
        /**
         * The ID of the `contactInformation`.
         */
        readonly id?: number;
        /**
         * The account's Jabber handle.
         */
        jabber?: string;
        /**
         * A list of account's postal addresses, with one optionally marked as primary.
         */
        postalAddresses?: Array<PostalAddress>;
        /**
         * The account's Skype handle.
         */
        skype?: string;
        /**
         * The account's SMS number.
         */
        sms?: string;
        /**
         * A list of the account's phone numbers, with one optionally marked as primary.
         */
        telephones?: Array<Phone>;
        /**
         * The account's Twitter handle.
         */
        twitter?: string;
        /**
         * A list of the account's web URLs, with one optionally marked as primary.
         */
        webUrls?: Array<WebUrl>;
    };
    /**
     * The users linked to the account
     */
    accountUserAccounts?: Array<UserAccount>;
    /**
     * Block of actions allowed by the user making the request.
     */
    readonly actions?: Record<string, Record<string, string>>;
    customFields?: Array<CustomField>;
    /**
     * The account's creation date.
     */
    readonly dateCreated?: string;
    /**
     * The account's most recent modification date.
     */
    readonly dateModified?: string;
    defaultBillingAddressId?: number;
    defaultShippingAddressId?: number;
    description?: string;
    /**
     * The account's email domains. Users assigned to this account generally will have email addresses under one of these domains.
     */
    domains?: Array<string>;
    /**
     * The optional external key of this account.
     */
    externalReferenceCode?: string;
    readonly id?: number;
    logoId?: number;
    logoURL?: string;
    name: string;
    /**
     * The number of this account's associated users.
     */
    readonly numberOfUsers?: number;
    organizationIds?: Array<number>;
    parentAccountId?: number;
    /**
     * The addresses linked to the account
     */
    postalAddresses?: Array<PostalAddress>;
    status?: number;
    taxId?: string;
    type?: 'business' | 'guest' | 'person' | 'supplier';
};

