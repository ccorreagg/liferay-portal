/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { SearchResult } from './SearchResult';
export type PageSearchResult = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<SearchResult>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

