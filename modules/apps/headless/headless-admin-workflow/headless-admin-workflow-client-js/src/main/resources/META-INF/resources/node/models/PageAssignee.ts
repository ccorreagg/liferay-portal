/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Assignee } from './Assignee';
import type { Facet } from './Facet';
export type PageAssignee = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Assignee>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

