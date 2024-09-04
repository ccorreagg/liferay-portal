/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { PlacedOrderComment } from './PlacedOrderComment';
export type PagePlacedOrderComment = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<PlacedOrderComment>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

