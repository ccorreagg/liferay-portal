/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DataLayout } from './DataLayout';
import type { Facet } from './Facet';
export type PageDataLayout = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<DataLayout>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

