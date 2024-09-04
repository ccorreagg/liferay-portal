/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { OrderRuleAccount } from './OrderRuleAccount';
export type PageOrderRuleAccount = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<OrderRuleAccount>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

