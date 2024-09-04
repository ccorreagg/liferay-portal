/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { ProcessMetric } from './ProcessMetric';
export type PageProcessMetric = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ProcessMetric>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

