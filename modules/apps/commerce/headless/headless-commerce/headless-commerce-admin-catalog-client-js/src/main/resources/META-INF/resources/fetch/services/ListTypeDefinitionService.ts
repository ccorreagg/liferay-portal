/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { ListTypeDefinition } from '../models/ListTypeDefinition';
import type { PageListTypeDefinition } from '../models/PageListTypeDefinition';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class ListTypeDefinitionService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Gets the picklist associated to the specification.
     * @returns PageListTypeDefinition Successful operation
     * @throws ApiError
     */
    public getSpecificationIdListTypeDefinitionsPage({
        id,
    }: {
        id: number,
    }): CancelablePromise<PageListTypeDefinition> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-catalog/v1.0/specifications/{id}/list-type-definitions',
            path: {
                'id': id,
            },
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Creates a picklist and links it to the specification.
     * @returns ListTypeDefinition Created
     * @returns any Accepted - Async
     * @throws ApiError
     */
    public postSpecificationIdListTypeDefinition({
        id,
        requestBody,
    }: {
        id: number,
        requestBody: ListTypeDefinition,
    }): CancelablePromise<ListTypeDefinition | any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-admin-catalog/v1.0/specifications/{id}/list-type-definitions',
            path: {
                'id': id,
            },
            body: requestBody,
            mediaType: 'application/json',
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
}
