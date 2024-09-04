/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DocumentFolder } from './DocumentFolder';
import type { Facet } from './Facet';
export type PageDocumentFolder = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<DocumentFolder>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

