/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { CategoryDisplayPage } from './CategoryDisplayPage';
import type { Facet } from './Facet';
export type PageCategoryDisplayPage = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<CategoryDisplayPage>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

