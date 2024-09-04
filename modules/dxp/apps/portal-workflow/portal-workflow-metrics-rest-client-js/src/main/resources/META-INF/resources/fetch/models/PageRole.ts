/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Role } from './Role';
export type PageRole = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Role>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

