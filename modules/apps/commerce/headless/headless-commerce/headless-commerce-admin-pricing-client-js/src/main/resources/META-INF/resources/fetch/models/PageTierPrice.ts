/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { TierPrice } from './TierPrice';
export type PageTierPrice = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<TierPrice>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

