/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { ProductChannel } from './ProductChannel';
export type PageProductChannel = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ProductChannel>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

