/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DispatchTrigger } from './DispatchTrigger';
import type { Facet } from './Facet';
export type PageDispatchTrigger = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<DispatchTrigger>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

