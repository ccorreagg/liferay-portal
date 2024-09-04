/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { GroupedProduct } from './GroupedProduct';
export type PageGroupedProduct = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<GroupedProduct>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

