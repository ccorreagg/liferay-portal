/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { AccountCategoryForecast } from './AccountCategoryForecast';
import type { Facet } from './Facet';
export type PageAccountCategoryForecast = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<AccountCategoryForecast>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

