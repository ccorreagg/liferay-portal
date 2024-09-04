/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { TaxCategory } from './TaxCategory';
export type PageTaxCategory = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<TaxCategory>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

