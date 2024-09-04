/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { FieldMappingInfo } from './FieldMappingInfo';
export type PageFieldMappingInfo = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<FieldMappingInfo>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

