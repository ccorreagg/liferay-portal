/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { AccountAddressChannel } from './AccountAddressChannel';
import type { Facet } from './Facet';
export type PageAccountAddressChannel = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<AccountAddressChannel>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

