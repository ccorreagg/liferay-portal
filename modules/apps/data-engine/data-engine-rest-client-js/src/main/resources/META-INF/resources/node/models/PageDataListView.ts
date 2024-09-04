/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DataListView } from './DataListView';
import type { Facet } from './Facet';
export type PageDataListView = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<DataListView>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

