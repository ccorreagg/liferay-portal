/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Document } from './Document';
import type { Facet } from './Facet';
export type PageDocument = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Document>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

