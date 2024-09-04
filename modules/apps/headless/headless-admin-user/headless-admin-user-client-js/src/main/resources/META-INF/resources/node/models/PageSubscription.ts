/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Subscription } from './Subscription';
export type PageSubscription = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Subscription>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

