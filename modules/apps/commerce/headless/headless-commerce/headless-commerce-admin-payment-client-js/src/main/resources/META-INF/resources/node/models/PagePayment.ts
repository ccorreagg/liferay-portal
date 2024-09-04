/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Payment } from './Payment';
export type PagePayment = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Payment>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

