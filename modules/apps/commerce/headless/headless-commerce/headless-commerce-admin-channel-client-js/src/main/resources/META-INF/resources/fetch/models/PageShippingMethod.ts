/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { ShippingMethod } from './ShippingMethod';
export type PageShippingMethod = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ShippingMethod>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

