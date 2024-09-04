/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { WorkflowDefinition } from './WorkflowDefinition';
export type PageWorkflowDefinition = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<WorkflowDefinition>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

