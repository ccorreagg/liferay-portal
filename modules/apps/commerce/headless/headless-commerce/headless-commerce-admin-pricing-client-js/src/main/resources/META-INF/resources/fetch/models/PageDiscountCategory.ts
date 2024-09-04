/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DiscountCategory } from './DiscountCategory';
import type { Facet } from './Facet';
export type PageDiscountCategory = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<DiscountCategory>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

