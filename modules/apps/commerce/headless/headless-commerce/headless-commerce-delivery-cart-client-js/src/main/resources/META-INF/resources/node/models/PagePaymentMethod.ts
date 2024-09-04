/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { PaymentMethod } from './PaymentMethod';
export type PagePaymentMethod = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<PaymentMethod>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

