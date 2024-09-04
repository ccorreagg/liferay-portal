/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DataRecord } from './DataRecord';
import type { Facet } from './Facet';
export type PageDataRecord = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<DataRecord>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

