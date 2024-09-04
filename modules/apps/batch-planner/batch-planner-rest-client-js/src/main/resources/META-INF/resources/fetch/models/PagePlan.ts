/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Plan } from './Plan';
export type PagePlan = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Plan>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

