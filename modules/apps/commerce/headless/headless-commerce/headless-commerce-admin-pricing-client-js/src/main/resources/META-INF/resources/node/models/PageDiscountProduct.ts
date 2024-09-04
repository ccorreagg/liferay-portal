/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DiscountProduct } from './DiscountProduct';
import type { Facet } from './Facet';
export type PageDiscountProduct = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<DiscountProduct>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

