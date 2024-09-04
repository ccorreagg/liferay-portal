/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { OrderTypeChannel } from './OrderTypeChannel';
export type PageOrderTypeChannel = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<OrderTypeChannel>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

