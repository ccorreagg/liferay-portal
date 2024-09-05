/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { AssetAppearsOnHistogramMetric } from '../models/AssetAppearsOnHistogramMetric';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class AssetAppearsOnHistogramMetricService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns AssetAppearsOnHistogramMetric
     * @throws ApiError
     */
    public getGroupAssetMetricAssetTypeAppearsOnHistogram({
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
    }): CancelablePromise<AssetAppearsOnHistogramMetric> {
        return this.httpRequest.request({
            method: 'GET',
            url: '{groupId}/asset-metrics/{assetType}/appears-on/histogram',
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
