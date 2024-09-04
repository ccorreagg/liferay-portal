/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { OrderRuleOrderType } from './OrderRuleOrderType';
export type PageOrderRuleOrderType = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<OrderRuleOrderType>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

