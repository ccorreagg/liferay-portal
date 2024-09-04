/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { OptionValue } from './OptionValue';
export type PageOptionValue = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<OptionValue>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

