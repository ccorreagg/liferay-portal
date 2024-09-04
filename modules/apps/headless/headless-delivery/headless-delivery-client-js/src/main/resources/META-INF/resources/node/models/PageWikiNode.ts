/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { WikiNode } from './WikiNode';
export type PageWikiNode = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<WikiNode>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

