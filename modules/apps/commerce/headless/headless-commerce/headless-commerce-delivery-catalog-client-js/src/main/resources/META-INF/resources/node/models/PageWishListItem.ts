/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { WishListItem } from './WishListItem';
export type PageWishListItem = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<WishListItem>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

