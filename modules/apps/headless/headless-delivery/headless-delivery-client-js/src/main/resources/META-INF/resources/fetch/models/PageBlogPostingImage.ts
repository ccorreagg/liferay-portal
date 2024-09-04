/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { BlogPostingImage } from './BlogPostingImage';
import type { Facet } from './Facet';
export type PageBlogPostingImage = {
    actions?: Record<string, Record<string, string>>;
    facets?: Array<Facet>;
    items?: Array<BlogPostingImage>;
    lastPage?: number;
    pageSize?: number;
    page?: number;
    totalCount?: number;
};

