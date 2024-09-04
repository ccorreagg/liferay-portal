/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { SuggestionsContributorResults } from './SuggestionsContributorResults';
export type PageSuggestionsContributorResults = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<SuggestionsContributorResults>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

