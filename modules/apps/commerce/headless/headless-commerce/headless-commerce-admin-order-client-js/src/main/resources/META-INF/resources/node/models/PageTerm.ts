/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Term } from './Term';
export type PageTerm = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Term>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

