/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { ContactUserGroup } from './ContactUserGroup';
import type { Facet } from './Facet';
export type PageContactUserGroup = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ContactUserGroup>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

