/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { ModelPrefilterContributor } from './ModelPrefilterContributor';
export type PageModelPrefilterContributor = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ModelPrefilterContributor>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

