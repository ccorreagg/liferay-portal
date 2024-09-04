/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Site } from './Site';
export type PageSite = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Site>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

