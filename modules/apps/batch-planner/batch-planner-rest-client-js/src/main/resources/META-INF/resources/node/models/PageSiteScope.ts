/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { SiteScope } from './SiteScope';
export type PageSiteScope = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<SiteScope>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

