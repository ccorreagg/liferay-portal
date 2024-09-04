/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DataDefinitionFieldLink } from './DataDefinitionFieldLink';
import type { Facet } from './Facet';
export type PageDataDefinitionFieldLink = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<DataDefinitionFieldLink>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

