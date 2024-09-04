/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { PaymentMethodGroupRelOrderType } from './PaymentMethodGroupRelOrderType';
export type PagePaymentMethodGroupRelOrderType = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<PaymentMethodGroupRelOrderType>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

