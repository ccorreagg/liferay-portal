/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { ShipmentItem } from './ShipmentItem';
export type PageShipmentItem = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<ShipmentItem>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

