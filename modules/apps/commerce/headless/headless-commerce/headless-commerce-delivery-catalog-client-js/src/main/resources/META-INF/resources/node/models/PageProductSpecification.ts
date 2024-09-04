/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { ProductSpecification } from './ProductSpecification';
export type PageProductSpecification = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ProductSpecification>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

