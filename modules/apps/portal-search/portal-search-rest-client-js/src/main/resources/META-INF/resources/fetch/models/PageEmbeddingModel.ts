/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { EmbeddingModel } from './EmbeddingModel';
import type { Facet } from './Facet';
export type PageEmbeddingModel = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<EmbeddingModel>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

