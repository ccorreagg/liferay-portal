/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DiscountRule } from './DiscountRule';
import type { Facet } from './Facet';
export type PageDiscountRule = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<DiscountRule>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

