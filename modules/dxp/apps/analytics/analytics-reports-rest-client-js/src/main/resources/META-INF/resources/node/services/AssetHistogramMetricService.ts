/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { AssetHistogramMetric } from '../models/AssetHistogramMetric';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class AssetHistogramMetricService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns AssetHistogramMetric
     * @throws ApiError
     */
    public getGroupAssetMetricAssetTypeHistogram({
        groupId,
        assetType,
        assetId,
        identityType,
        rangeKey,
    }: {
        groupId?: number,
        assetType?: string,
        assetId?: string,
        identityType?: 'ALL' | 'KNOWN' | 'UNKNOWN',
        rangeKey?: number,
    }): CancelablePromise<AssetHistogramMetric> {
        return this.httpRequest.request({
            method: 'GET',
            url: '{groupId}/asset-metrics/{assetType}/histogram',
            path: {
                'groupId': groupId,
                'assetType': assetType,
            },
            query: {
                'assetId': assetId,
                'identityType': identityType,
                'rangeKey': rangeKey,
            },
        });
    }
}
