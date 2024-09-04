/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { EmailAddress } from './EmailAddress';
import type { Facet } from './Facet';
export type PageEmailAddress = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<EmailAddress>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

