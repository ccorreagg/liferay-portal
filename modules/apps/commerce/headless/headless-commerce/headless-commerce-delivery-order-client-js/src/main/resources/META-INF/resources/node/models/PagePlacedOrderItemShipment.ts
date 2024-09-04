/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { PlacedOrderItemShipment } from './PlacedOrderItemShipment';
export type PagePlacedOrderItemShipment = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<PlacedOrderItemShipment>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

