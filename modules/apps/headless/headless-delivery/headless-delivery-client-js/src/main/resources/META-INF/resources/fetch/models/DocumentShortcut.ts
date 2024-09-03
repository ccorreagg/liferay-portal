/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
/**
 * Represents a document shortcut.
 */
export type DocumentShortcut = {
    /**
     * Block of actions allowed by the user making the request.
     */
    readonly actions?: Record<string, Record<string, string>>;
    /**
     * The key of the asset library to which the document shortcut is scoped.
     */
    readonly assetLibraryKey?: string;
    /**
     * The document shortcut's creation date.
     */
    readonly dateCreated?: string;
    /**
     * The last time a field of the document shortcut changed.
     */
    readonly dateModified?: string;
    /**
     * The document shortcut's folder ID.
     */
    folderId?: number;
    /**
     * The document shortcut's ID.
     */
    readonly id?: number;
    /**
     * The ID of the site to which this document shortcut is scoped.
     */
    readonly siteId?: number;
    /**
     * The ID of the document to which this shortcut is scoped.
     */
    targetDocumentId?: number;
    /**
     * The title of the document to which this shortcut is scoped.
     */
    readonly title?: string;
    /**
     * A write-only property that specifies the default permissions.
     */
    viewableBy?: 'Anyone' | 'Members' | 'Owner';
};

