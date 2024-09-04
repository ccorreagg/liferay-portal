/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { WorkflowLog } from './WorkflowLog';
export type PageWorkflowLog = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<WorkflowLog>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

