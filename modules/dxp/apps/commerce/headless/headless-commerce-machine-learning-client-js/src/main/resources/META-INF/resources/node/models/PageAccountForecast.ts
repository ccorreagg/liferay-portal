/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { AccountForecast } from './AccountForecast';
import type { Facet } from './Facet';
export type PageAccountForecast = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<AccountForecast>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

