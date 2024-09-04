/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Discount } from './Discount';
import type { Facet } from './Facet';
export type PageDiscount = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Discount>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

