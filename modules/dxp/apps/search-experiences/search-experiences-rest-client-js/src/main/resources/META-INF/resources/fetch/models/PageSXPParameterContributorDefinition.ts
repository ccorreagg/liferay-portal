/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { SXPParameterContributorDefinition } from './SXPParameterContributorDefinition';
export type PageSXPParameterContributorDefinition = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<SXPParameterContributorDefinition>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

