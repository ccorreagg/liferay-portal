/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Currency } from './Currency';
import type { Facet } from './Facet';
export type PageCurrency = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Currency>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

