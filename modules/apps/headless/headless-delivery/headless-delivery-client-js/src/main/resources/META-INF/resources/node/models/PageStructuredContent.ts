/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { StructuredContent } from './StructuredContent';
export type PageStructuredContent = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<StructuredContent>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

