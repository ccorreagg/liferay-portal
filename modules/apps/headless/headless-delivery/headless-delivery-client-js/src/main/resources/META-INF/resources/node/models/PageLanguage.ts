/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Language } from './Language';
export type PageLanguage = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Language>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

