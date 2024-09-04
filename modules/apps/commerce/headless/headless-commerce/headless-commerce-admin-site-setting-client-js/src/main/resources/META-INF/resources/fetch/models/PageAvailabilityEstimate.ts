/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { AvailabilityEstimate } from './AvailabilityEstimate';
import type { Facet } from './Facet';
export type PageAvailabilityEstimate = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<AvailabilityEstimate>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

