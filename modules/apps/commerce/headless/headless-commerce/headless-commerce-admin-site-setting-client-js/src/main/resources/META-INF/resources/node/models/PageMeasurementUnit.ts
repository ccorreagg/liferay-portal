/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { MeasurementUnit } from './MeasurementUnit';
export type PageMeasurementUnit = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<MeasurementUnit>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

