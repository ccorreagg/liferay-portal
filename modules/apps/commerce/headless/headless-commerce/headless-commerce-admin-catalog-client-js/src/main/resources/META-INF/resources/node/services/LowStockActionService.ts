/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageLowStockAction } from '../models/PageLowStockAction';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class LowStockActionService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Retrive low stock actions for products.
     * @returns PageLowStockAction
     * @throws ApiError
     */
    public getLowStockActionsPage(): CancelablePromise<PageLowStockAction> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-admin-catalog/v1.0/low-stock-actions',
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
}
