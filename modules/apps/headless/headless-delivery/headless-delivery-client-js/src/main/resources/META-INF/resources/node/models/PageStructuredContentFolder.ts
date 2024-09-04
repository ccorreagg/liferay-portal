/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { StructuredContentFolder } from './StructuredContentFolder';
export type PageStructuredContentFolder = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<StructuredContentFolder>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

