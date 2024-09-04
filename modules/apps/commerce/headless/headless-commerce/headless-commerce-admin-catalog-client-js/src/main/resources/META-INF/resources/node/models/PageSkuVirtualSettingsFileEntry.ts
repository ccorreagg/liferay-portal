/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { SkuVirtualSettingsFileEntry } from './SkuVirtualSettingsFileEntry';
export type PageSkuVirtualSettingsFileEntry = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<SkuVirtualSettingsFileEntry>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

