/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { KnowledgeBaseAttachment } from './KnowledgeBaseAttachment';
export type PageKnowledgeBaseAttachment = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<KnowledgeBaseAttachment>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

