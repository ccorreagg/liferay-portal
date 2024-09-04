/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { SXPBlueprint } from './SXPBlueprint';
export type PageSXPBlueprint = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<SXPBlueprint>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

