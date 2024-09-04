/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { ContentSetElement } from './ContentSetElement';
import type { Facet } from './Facet';
export type PageContentSetElement = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ContentSetElement>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

