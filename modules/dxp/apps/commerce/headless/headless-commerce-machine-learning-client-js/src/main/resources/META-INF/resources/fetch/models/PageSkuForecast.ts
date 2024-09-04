/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { SkuForecast } from './SkuForecast';
export type PageSkuForecast = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<SkuForecast>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

