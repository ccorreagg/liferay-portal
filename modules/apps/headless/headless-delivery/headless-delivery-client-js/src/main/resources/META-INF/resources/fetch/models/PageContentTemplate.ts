/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { ContentTemplate } from './ContentTemplate';
import type { Facet } from './Facet';
export type PageContentTemplate = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ContentTemplate>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

