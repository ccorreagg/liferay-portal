/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { WarehouseChannel } from './WarehouseChannel';
export type PageWarehouseChannel = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<WarehouseChannel>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

