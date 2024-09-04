/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { ListTypeEntry } from './ListTypeEntry';
export type PageListTypeEntry = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ListTypeEntry>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

