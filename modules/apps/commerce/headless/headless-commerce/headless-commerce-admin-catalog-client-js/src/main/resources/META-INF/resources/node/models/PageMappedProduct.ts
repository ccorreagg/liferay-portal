/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { MappedProduct } from './MappedProduct';
export type PageMappedProduct = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<MappedProduct>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

