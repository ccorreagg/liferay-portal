/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { ContentElement } from './ContentElement';
import type { Facet } from './Facet';
export type PageContentElement = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ContentElement>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

