/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { WarehouseOrderType } from './WarehouseOrderType';
export type PageWarehouseOrderType = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<WarehouseOrderType>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

