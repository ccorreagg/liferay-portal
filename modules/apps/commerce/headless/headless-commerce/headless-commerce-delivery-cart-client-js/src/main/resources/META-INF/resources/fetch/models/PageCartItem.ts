/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { CartItem } from './CartItem';
import type { Facet } from './Facet';
export type PageCartItem = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<CartItem>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

