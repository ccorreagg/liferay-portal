/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { CTEntry } from './CTEntry';
import type { Facet } from './Facet';
export type PageCTEntry = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<CTEntry>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

