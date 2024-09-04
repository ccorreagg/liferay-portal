/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Calendar } from './Calendar';
import type { Facet } from './Facet';
export type PageCalendar = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Calendar>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

