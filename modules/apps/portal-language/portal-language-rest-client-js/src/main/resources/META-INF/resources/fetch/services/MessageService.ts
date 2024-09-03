/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Message } from '../models/Message';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class MessageService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns void
     * @throws ApiError
     */
    public deleteMessage({
        key,
        languageId,
    }: {
        key: string,
        languageId?: string,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/language/v1.0/messages',
            query: {
                'key': key,
                'languageId': languageId,
            },
        });
    }
    /**
     * @returns Message
     * @throws ApiError
     */
    public getMessage({
        key,
        languageId,
    }: {
        key: string,
        languageId: string,
    }): CancelablePromise<Message> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/language/v1.0/messages',
            query: {
                'key': key,
                'languageId': languageId,
            },
        });
    }
    /**
     * @returns Message
     * @throws ApiError
     */
    public postMessage({
        requestBody,
    }: {
        requestBody?: Message,
    }): CancelablePromise<Message> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/language/v1.0/messages',
            body: requestBody,
            mediaType: 'application/json',
        });
    }
    /**
     * @returns Message
     * @throws ApiError
     */
    public putMessage({
        requestBody,
    }: {
        requestBody?: Message,
    }): CancelablePromise<Message> {
        return this.httpRequest.request({
            method: 'PUT',
            url: '/language/v1.0/messages',
            body: requestBody,
            mediaType: 'application/json',
        });
    }
    /**
     * @returns any
     * @throws ApiError
     */
    public postMessageImport({
        languageId,
        formData,
    }: {
        languageId: string,
        formData?: {
            file?: Blob;
        },
    }): CancelablePromise<any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/language/v1.0/messages/import',
            query: {
                'languageId': languageId,
            },
            formData: formData,
            mediaType: 'multipart/form-data',
        });
    }
}
