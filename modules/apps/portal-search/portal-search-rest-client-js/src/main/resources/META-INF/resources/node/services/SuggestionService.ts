/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageSuggestionsContributorResults } from '../models/PageSuggestionsContributorResults';
import type { SuggestionsContributorConfiguration } from '../models/SuggestionsContributorConfiguration';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class SuggestionService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageSuggestionsContributorResults
     * @throws ApiError
     */
    public postSuggestionsPage({
        search,
        currentUrl,
        destinationFriendlyUrl,
        groupId,
        keywordsParameterName,
        plid,
        scope,
        requestBody,
    }: {
        search: string,
        currentUrl?: string,
        destinationFriendlyUrl?: string,
        /**
         * Deprecated as of Cavanaugh (7.4.x), replaced by scope
         * @deprecated
         */
        groupId?: number,
        keywordsParameterName?: string,
        plid?: number,
        scope?: string,
        requestBody?: Array<SuggestionsContributorConfiguration>,
    }): CancelablePromise<PageSuggestionsContributorResults> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/search/v1.0/suggestions',
            query: {
                'currentURL': currentUrl,
                'destinationFriendlyURL': destinationFriendlyUrl,
                'groupId': groupId,
                'keywordsParameterName': keywordsParameterName,
                'plid': plid,
                'scope': scope,
                'search': search,
            },
            body: requestBody,
            mediaType: 'application/json',
        });
    }
}
