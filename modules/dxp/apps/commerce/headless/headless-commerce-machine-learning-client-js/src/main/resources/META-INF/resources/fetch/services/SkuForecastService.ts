/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { SkuForecast } from '../models/SkuForecast';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class SkuForecastService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Get the forecast points
     * @returns SkuForecast Successful operation
     * @throws ApiError
     */
    public getSkuForecastsByMonthlyRevenuePage({
        forecastLength,
        forecastStartDate,
        historyLength,
        page,
        pageSize,
        skus,
    }: {
        forecastLength?: number,
        forecastStartDate?: string,
        historyLength?: number,
        page?: number,
        pageSize?: number,
        skus?: Array<string>,
    }): CancelablePromise<Array<SkuForecast>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-machine-learning/v1.0/skuForecasts/by-monthlyDemand',
            query: {
                'forecastLength': forecastLength,
                'forecastStartDate': forecastStartDate,
                'historyLength': historyLength,
                'page': page,
                'pageSize': pageSize,
                'skus': skus,
            },
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
}
