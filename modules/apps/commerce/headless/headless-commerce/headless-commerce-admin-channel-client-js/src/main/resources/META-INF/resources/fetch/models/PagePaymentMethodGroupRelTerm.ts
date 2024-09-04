/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { PaymentMethodGroupRelTerm } from './PaymentMethodGroupRelTerm';
export type PagePaymentMethodGroupRelTerm = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<PaymentMethodGroupRelTerm>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

