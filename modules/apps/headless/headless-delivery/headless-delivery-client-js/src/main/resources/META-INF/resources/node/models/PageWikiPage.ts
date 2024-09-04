/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { WikiPage } from './WikiPage';
export type PageWikiPage = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<WikiPage>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

