/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { CTProcess } from './CTProcess';
import type { Facet } from './Facet';
export type PageCTProcess = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<CTProcess>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

