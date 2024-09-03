/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { AssetMetric } from '../models/AssetMetric';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class AssetMetricService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns AssetMetric
     * @throws ApiError
     */
    public getGroupAssetMetric({
        groupId,
        assetType,
        assetId,
        identityType,
        rangeKey,
        selectedMetrics,
    }: {
        groupId?: number,
        assetType?: string,
        assetId?: string,
        identityType?: 'ALL' | 'KNOWN' | 'UNKNOWN',
        rangeKey?: number,
        selectedMetrics?: Array<string>,
    }): CancelablePromise<AssetMetric> {
        return this.httpRequest.request({
            method: 'GET',
            url: '{groupId}/asset-metrics/{assetType}',
            path: {
                'groupId': groupId,
                'assetType': assetType,
            },
            query: {
                'assetId': assetId,
                'identityType': identityType,
                'rangeKey': rangeKey,
                'selectedMetrics': selectedMetrics,
            },
        });
    }
}
