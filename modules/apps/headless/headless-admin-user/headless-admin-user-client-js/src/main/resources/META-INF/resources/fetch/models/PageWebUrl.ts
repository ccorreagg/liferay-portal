/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { WebUrl } from './WebUrl';
export type PageWebUrl = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<WebUrl>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

