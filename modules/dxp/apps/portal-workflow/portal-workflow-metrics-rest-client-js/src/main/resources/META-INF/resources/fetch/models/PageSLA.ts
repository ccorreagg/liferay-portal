/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { SLA } from './SLA';
export type PageSLA = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<SLA>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

