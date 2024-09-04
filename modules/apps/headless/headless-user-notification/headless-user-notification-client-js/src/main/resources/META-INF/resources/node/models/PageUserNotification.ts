/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { UserNotification } from './UserNotification';
export type PageUserNotification = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<UserNotification>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

