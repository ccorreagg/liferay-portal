/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { PriceList } from './PriceList';
export type PagePriceList = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<PriceList>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

