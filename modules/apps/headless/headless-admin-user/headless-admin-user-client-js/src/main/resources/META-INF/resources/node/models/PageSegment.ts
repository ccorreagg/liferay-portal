/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Segment } from './Segment';
export type PageSegment = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Segment>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

