/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Catalog } from './Catalog';
import type { Facet } from './Facet';
export type PageCatalog = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Catalog>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

