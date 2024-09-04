/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DSEnvelope } from './DSEnvelope';
import type { Facet } from './Facet';
export type PageDSEnvelope = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<DSEnvelope>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

