/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { MessageBoardAttachment } from './MessageBoardAttachment';
export type PageMessageBoardAttachment = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<MessageBoardAttachment>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

