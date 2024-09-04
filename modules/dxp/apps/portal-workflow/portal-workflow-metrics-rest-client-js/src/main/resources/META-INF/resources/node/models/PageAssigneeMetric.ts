/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { AssigneeMetric } from './AssigneeMetric';
import type { Facet } from './Facet';
export type PageAssigneeMetric = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<AssigneeMetric>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

