/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { ProductVirtualSettingsFileEntry } from './ProductVirtualSettingsFileEntry';
export type PageProductVirtualSettingsFileEntry = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ProductVirtualSettingsFileEntry>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

