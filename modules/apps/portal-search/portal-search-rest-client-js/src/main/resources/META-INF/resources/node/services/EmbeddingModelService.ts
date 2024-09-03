/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { EmbeddingModel } from '../models/EmbeddingModel';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class EmbeddingModelService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns EmbeddingModel
     * @throws ApiError
     */
    public getEmbeddingEmbeddingModelsPage({
        page,
        pageSize,
        provider,
        search,
    }: {
        page?: number,
        pageSize?: number,
        provider?: string,
        search?: string,
    }): CancelablePromise<Array<EmbeddingModel>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/search/v1.0/embeddings/embedding-models',
            query: {
                'page': page,
                'pageSize': pageSize,
                'provider': provider,
                'search': search,
            },
        });
    }
}
