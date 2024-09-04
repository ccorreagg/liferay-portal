/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { Shipment } from './Shipment';
export type PageShipment = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<Shipment>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

