/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { SearchableAssetName } from './SearchableAssetName';
export type PageSearchableAssetName = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<SearchableAssetName>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

