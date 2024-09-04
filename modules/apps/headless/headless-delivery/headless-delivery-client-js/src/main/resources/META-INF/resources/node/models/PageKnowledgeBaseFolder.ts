/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { KnowledgeBaseFolder } from './KnowledgeBaseFolder';
export type PageKnowledgeBaseFolder = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<KnowledgeBaseFolder>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

