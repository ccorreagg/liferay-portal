/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { SearchableAssetNameDisplay } from './SearchableAssetNameDisplay';
export type PageSearchableAssetNameDisplay = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<SearchableAssetNameDisplay>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

