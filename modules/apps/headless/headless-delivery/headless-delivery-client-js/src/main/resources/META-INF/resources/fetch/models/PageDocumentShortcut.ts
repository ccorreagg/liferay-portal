/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DocumentShortcut } from './DocumentShortcut';
import type { Facet } from './Facet';
export type PageDocumentShortcut = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<DocumentShortcut>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

