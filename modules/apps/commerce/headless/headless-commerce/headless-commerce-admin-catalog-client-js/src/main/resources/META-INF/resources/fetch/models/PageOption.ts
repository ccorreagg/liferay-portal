/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Option } from './Option';
export type PageOption = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Option>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

