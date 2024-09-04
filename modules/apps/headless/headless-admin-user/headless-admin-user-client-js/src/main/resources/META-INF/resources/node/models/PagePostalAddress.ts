/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { PostalAddress } from './PostalAddress';
export type PagePostalAddress = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<PostalAddress>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

