/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { AccountAddress } from './AccountAddress';
import type { Facet } from './Facet';
export type PageAccountAddress = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<AccountAddress>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

