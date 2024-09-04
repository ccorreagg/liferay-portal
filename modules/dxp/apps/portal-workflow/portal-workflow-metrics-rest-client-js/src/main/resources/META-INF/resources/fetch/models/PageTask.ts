/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Task } from './Task';
export type PageTask = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Task>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

