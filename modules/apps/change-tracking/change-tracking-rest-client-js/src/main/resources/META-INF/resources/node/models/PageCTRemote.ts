/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { CTRemote } from './CTRemote';
import type { Facet } from './Facet';
export type PageCTRemote = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<CTRemote>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

