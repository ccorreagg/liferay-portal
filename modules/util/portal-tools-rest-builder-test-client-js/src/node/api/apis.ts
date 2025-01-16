export * from './minimalTestEntity1Api';
import { MinimalTestEntity1Api } from './minimalTestEntity1Api';
export * from './minimalTestEntity2Api';
import { MinimalTestEntity2Api } from './minimalTestEntity2Api';
export * from './testEntityApi';
import { TestEntityApi } from './testEntityApi';
export * from './testEntityAddressApi';
import { TestEntityAddressApi } from './testEntityAddressApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [MinimalTestEntity1Api, MinimalTestEntity2Api, TestEntityApi, TestEntityAddressApi];
