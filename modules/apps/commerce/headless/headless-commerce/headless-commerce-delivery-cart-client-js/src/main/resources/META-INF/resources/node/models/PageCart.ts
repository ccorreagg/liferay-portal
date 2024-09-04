/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Cart } from './Cart';
import type { Facet } from './Facet';
export type PageCart = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Cart>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

