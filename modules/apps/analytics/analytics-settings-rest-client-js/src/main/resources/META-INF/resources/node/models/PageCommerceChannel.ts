/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { CommerceChannel } from './CommerceChannel';
import type { Facet } from './Facet';
export type PageCommerceChannel = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<CommerceChannel>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

