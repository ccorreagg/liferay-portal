/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { NavigationMenu } from './NavigationMenu';
export type PageNavigationMenu = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<NavigationMenu>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

