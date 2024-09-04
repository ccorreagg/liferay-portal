/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { ReplenishmentItem } from './ReplenishmentItem';
export type PageReplenishmentItem = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ReplenishmentItem>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

