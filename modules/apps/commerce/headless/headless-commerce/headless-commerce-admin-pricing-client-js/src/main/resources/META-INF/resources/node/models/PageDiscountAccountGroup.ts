/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DiscountAccountGroup } from './DiscountAccountGroup';
import type { Facet } from './Facet';
export type PageDiscountAccountGroup = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<DiscountAccountGroup>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

