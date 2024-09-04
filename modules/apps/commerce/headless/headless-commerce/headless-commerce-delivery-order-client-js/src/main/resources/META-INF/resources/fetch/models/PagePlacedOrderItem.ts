/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { PlacedOrderItem } from './PlacedOrderItem';
export type PagePlacedOrderItem = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<PlacedOrderItem>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

