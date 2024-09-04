/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Country } from './Country';
import type { Facet } from './Facet';
export type PageCountry = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Country>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

