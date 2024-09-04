/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { AccountGroup } from './AccountGroup';
import type { Facet } from './Facet';
export type PageAccountGroup = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<AccountGroup>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

