/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { TimeRange } from './TimeRange';
export type PageTimeRange = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<TimeRange>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

