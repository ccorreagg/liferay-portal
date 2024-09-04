/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Form } from './Form';
export type PageForm = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Form>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

