/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Attachment } from './Attachment';
import type { Facet } from './Facet';
export type PageAttachment = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Attachment>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

