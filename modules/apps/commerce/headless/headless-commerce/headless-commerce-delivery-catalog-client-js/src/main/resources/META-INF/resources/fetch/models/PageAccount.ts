/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Account } from './Account';
import type { Facet } from './Facet';
export type PageAccount = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Account>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

