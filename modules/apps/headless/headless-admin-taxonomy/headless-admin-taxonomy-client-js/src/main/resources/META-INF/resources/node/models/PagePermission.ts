/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Permission } from './Permission';
export type PagePermission = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Permission>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

