/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { OrderNote } from './OrderNote';
export type PageOrderNote = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<OrderNote>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

