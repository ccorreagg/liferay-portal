/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { NotificationTemplate } from './NotificationTemplate';
export type PageNotificationTemplate = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<NotificationTemplate>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

