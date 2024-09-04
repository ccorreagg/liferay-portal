/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Facet } from './Facet';
import type { MessageBoardThread } from './MessageBoardThread';
export type PageMessageBoardThread = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<MessageBoardThread>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

