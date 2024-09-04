/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { LinkedProduct } from './LinkedProduct';
export type PageLinkedProduct = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<LinkedProduct>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

