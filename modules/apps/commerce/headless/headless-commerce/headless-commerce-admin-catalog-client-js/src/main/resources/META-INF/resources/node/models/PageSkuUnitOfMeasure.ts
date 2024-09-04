/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { SkuUnitOfMeasure } from './SkuUnitOfMeasure';
export type PageSkuUnitOfMeasure = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<SkuUnitOfMeasure>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

