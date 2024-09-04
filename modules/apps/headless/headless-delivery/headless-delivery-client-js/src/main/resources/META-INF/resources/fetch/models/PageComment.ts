/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Comment } from './Comment';
import type { Facet } from './Facet';
export type PageComment = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Comment>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

