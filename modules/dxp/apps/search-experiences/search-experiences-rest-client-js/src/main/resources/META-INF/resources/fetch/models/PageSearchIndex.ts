/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { SearchIndex } from './SearchIndex';
export type PageSearchIndex = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<SearchIndex>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

