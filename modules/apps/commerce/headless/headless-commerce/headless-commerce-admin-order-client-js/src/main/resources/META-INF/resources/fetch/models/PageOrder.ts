/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Order } from './Order';
export type PageOrder = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Order>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

