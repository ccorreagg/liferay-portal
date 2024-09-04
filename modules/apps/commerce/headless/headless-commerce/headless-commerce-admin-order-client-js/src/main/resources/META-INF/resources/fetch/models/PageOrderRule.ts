/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { OrderRule } from './OrderRule';
export type PageOrderRule = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<OrderRule>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

