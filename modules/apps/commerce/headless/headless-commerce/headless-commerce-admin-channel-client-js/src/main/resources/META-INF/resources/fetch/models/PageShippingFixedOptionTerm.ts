/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { ShippingFixedOptionTerm } from './ShippingFixedOptionTerm';
export type PageShippingFixedOptionTerm = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ShippingFixedOptionTerm>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

