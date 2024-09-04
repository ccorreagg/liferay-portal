/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { WishList } from './WishList';
export type PageWishList = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<WishList>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

