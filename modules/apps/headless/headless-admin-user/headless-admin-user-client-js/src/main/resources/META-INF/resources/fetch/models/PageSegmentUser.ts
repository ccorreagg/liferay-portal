/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { SegmentUser } from './SegmentUser';
export type PageSegmentUser = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<SegmentUser>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

