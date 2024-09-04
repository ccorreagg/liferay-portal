/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Field } from './Field';
export type PageField = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Field>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

