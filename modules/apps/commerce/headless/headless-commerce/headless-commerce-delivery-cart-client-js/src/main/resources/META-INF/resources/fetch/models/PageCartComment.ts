/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { CartComment } from './CartComment';
import type { Facet } from './Facet';
export type PageCartComment = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<CartComment>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

