/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { ProductGroupProduct } from './ProductGroupProduct';
export type PageProductGroupProduct = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ProductGroupProduct>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

