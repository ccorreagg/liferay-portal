/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { CTCollection } from './CTCollection';
import type { Facet } from './Facet';
export type PageCTCollection = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<CTCollection>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

