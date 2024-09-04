/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DocumentShortcut } from '../models/DocumentShortcut';
import type { PageDocumentShortcut } from '../models/PageDocumentShortcut';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class DocumentShortcutService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageDocumentShortcut
     * @throws ApiError
     */
    public getAssetLibraryDocumentShortcutsPage({
        assetLibraryId,
        fields,
        page,
        pageSize,
        restrictFields,
    }: {
        assetLibraryId: number,
        fields?: string,
        page?: number,
        pageSize?: number,
        restrictFields?: string,
    }): CancelablePromise<PageDocumentShortcut> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-delivery/v1.0/asset-libraries/{assetLibraryId}/document-shortcuts',
            path: {
                'assetLibraryId': assetLibraryId,
            },
            query: {
                'fields': fields,
                'page': page,
                'pageSize': pageSize,
                'restrictFields': restrictFields,
            },
        });
    }
    /**
     * @returns DocumentShortcut
     * @throws ApiError
     */
    public postAssetLibraryDocumentShortcut({
        assetLibraryId,
        requestBody,
    }: {
        assetLibraryId: number,
        requestBody?: DocumentShortcut,
    }): CancelablePromise<DocumentShortcut> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-delivery/v1.0/asset-libraries/{assetLibraryId}/document-shortcuts',
            path: {
                'assetLibraryId': assetLibraryId,
            },
            body: requestBody,
            mediaType: 'application/json',
        });
    }
    /**
     * Deletes the document shortcut and returns a 204 if the operation succeeds.
     * @returns void
     * @throws ApiError
     */
    public deleteDocumentShortcut({
        documentShortcutId,
    }: {
        documentShortcutId: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-delivery/v1.0/document-shortcuts/{documentShortcutId}',
            path: {
                'documentShortcutId': documentShortcutId,
            },
        });
    }
    /**
     * Retrieves the document shortcut.
     * @returns DocumentShortcut
     * @throws ApiError
     */
    public getDocumentShortcut({
        documentShortcutId,
        fields,
        nestedFields,
        restrictFields,
    }: {
        documentShortcutId: number,
        fields?: string,
        nestedFields?: string,
        restrictFields?: string,
    }): CancelablePromise<DocumentShortcut> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-delivery/v1.0/document-shortcuts/{documentShortcutId}',
            path: {
                'documentShortcutId': documentShortcutId,
            },
            query: {
                'fields': fields,
                'nestedFields': nestedFields,
                'restrictFields': restrictFields,
            },
        });
    }
    /**
     * Updates only the fields received in the request body, leaving any other fields untouched.
     * @returns DocumentShortcut
     * @throws ApiError
     */
    public patchDocumentShortcut({
        documentShortcutId,
        requestBody,
    }: {
        documentShortcutId: number,
        requestBody?: DocumentShortcut,
    }): CancelablePromise<DocumentShortcut> {
        return this.httpRequest.request({
            method: 'PATCH',
            url: '/headless-delivery/v1.0/document-shortcuts/{documentShortcutId}',
            path: {
                'documentShortcutId': documentShortcutId,
            },
            body: requestBody,
            mediaType: 'application/json',
        });
    }
    /**
     * Replaces the document shortcut with the information sent in the request body. Any missing fields are deleted, unless they are required.
     * @returns DocumentShortcut
     * @throws ApiError
     */
    public putDocumentShortcut({
        documentShortcutId,
        requestBody,
    }: {
        documentShortcutId: number,
        requestBody?: DocumentShortcut,
    }): CancelablePromise<DocumentShortcut> {
        return this.httpRequest.request({
            method: 'PUT',
            url: '/headless-delivery/v1.0/document-shortcuts/{documentShortcutId}',
            path: {
                'documentShortcutId': documentShortcutId,
            },
            body: requestBody,
            mediaType: 'application/json',
        });
    }
    /**
     * @returns PageDocumentShortcut
     * @throws ApiError
     */
    public getSiteDocumentShortcutsPage({
        siteId,
        fields,
        page,
        pageSize,
        restrictFields,
    }: {
        siteId: number,
        fields?: string,
        page?: number,
        pageSize?: number,
        restrictFields?: string,
    }): CancelablePromise<PageDocumentShortcut> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-delivery/v1.0/sites/{siteId}/document-shortcuts',
            path: {
                'siteId': siteId,
            },
            query: {
                'fields': fields,
                'page': page,
                'pageSize': pageSize,
                'restrictFields': restrictFields,
            },
        });
    }
    /**
     * @returns DocumentShortcut
     * @throws ApiError
     */
    public postSiteDocumentShortcut({
        siteId,
        requestBody,
    }: {
        siteId: number,
        requestBody?: DocumentShortcut,
    }): CancelablePromise<DocumentShortcut> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-delivery/v1.0/sites/{siteId}/document-shortcuts',
            path: {
                'siteId': siteId,
            },
            body: requestBody,
            mediaType: 'application/json',
        });
    }
}
