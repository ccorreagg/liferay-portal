/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { OrderItem } from './OrderItem';
export type PageOrderItem = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<OrderItem>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

