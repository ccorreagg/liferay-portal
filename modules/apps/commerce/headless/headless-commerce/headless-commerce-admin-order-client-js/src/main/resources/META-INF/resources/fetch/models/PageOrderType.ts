/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { OrderType } from './OrderType';
export type PageOrderType = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<OrderType>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

