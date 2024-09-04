/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { AccountMember } from './AccountMember';
import type { Facet } from './Facet';
export type PageAccountMember = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<AccountMember>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

