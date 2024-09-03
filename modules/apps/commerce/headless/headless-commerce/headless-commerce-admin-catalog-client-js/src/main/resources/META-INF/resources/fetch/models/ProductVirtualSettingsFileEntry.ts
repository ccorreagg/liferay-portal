/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
export type ProductVirtualSettingsFileEntry = {
    readonly actions?: Record<string, Record<string, string>>;
    /**
     * Base64 encoded file
     */
    attachment?: string;
    readonly id?: number;
    /**
     * URL to download the file
     */
    readonly src?: string;
    /**
     * URL of the file
     */
    url?: string;
    /**
     * The version of the file
     */
    version?: string;
};

