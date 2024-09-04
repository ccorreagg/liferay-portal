/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { DocumentBulkSelection } from '../models/DocumentBulkSelection';
import type { PageTaxonomyVocabulary } from '../models/PageTaxonomyVocabulary';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class TaxonomyVocabularyService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageTaxonomyVocabulary
     * @throws ApiError
     */
    public postSiteTaxonomyVocabulariesCommonPage({
        siteId,
        requestBody,
    }: {
        siteId: number,
        requestBody?: DocumentBulkSelection,
    }): CancelablePromise<PageTaxonomyVocabulary> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/bulk/v1.0/sites/{siteId}/taxonomy-vocabularies/common',
            path: {
                'siteId': siteId,
            },
            body: requestBody,
            mediaType: 'application/json',
        });
    }
}
