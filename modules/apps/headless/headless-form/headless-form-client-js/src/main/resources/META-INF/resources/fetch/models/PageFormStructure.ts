/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { FormStructure } from './FormStructure';
export type PageFormStructure = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<FormStructure>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

