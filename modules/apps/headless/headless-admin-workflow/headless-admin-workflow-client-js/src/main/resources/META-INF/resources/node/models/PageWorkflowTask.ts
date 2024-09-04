/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { WorkflowTask } from './WorkflowTask';
export type PageWorkflowTask = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<WorkflowTask>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

