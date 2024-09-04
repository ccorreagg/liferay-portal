/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DataDefinition } from './DataDefinition';
import type { Facet } from './Facet';
export type PageDataDefinition = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<DataDefinition>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

