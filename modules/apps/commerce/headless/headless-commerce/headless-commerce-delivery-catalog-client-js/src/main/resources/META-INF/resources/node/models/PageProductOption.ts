/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { ProductOption } from './ProductOption';
export type PageProductOption = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ProductOption>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

