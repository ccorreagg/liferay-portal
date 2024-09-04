/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { WorkflowInstance } from './WorkflowInstance';
export type PageWorkflowInstance = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<WorkflowInstance>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

