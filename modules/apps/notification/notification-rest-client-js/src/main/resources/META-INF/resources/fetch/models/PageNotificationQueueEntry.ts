/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { NotificationQueueEntry } from './NotificationQueueEntry';
export type PageNotificationQueueEntry = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<NotificationQueueEntry>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

