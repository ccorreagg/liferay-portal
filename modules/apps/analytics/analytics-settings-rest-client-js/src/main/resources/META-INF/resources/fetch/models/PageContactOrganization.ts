/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { ContactOrganization } from './ContactOrganization';
import type { Facet } from './Facet';
export type PageContactOrganization = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ContactOrganization>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

