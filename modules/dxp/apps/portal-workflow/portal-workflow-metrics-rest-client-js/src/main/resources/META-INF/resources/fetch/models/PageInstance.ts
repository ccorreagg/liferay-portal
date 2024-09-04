/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Instance } from './Instance';
export type PageInstance = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Instance>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

