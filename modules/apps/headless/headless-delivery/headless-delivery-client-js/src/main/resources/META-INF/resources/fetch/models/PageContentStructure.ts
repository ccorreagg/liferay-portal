/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { ContentStructure } from './ContentStructure';
import type { Facet } from './Facet';
export type PageContentStructure = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ContentStructure>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

