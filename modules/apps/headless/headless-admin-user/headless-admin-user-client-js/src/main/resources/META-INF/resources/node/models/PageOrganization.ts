/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Organization } from './Organization';
export type PageOrganization = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Organization>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

