/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { AccountOrganization } from './AccountOrganization';
import type { Facet } from './Facet';
export type PageAccountOrganization = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<AccountOrganization>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

