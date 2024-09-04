/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { LowStockAction } from './LowStockAction';
export type PageLowStockAction = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<LowStockAction>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

