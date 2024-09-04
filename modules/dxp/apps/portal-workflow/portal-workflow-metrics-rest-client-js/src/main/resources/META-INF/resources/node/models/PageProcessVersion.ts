/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { ProcessVersion } from './ProcessVersion';
export type PageProcessVersion = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ProcessVersion>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

