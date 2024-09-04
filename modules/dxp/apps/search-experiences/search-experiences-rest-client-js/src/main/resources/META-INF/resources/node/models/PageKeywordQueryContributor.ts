/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { KeywordQueryContributor } from './KeywordQueryContributor';
export type PageKeywordQueryContributor = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<KeywordQueryContributor>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

