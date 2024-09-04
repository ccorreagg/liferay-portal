/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { PriceListAccountGroup } from './PriceListAccountGroup';
export type PagePriceListAccountGroup = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<PriceListAccountGroup>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

