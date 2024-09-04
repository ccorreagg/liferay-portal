/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { AdminAccountGroup } from './AdminAccountGroup';
import type { Facet } from './Facet';
export type PageAdminAccountGroup = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<AdminAccountGroup>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

