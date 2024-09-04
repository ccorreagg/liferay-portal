/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { Cart } from '../models/Cart';
import type { CouponCode } from '../models/CouponCode';
import type { PageCart } from '../models/PageCart';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class CartService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Deletes a Cart by by external reference code.
     * @returns void
     * @throws ApiError
     */
    public deleteHeadlessCommerceDeliveryCartV10CartsByExternalReferenceCode({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-commerce-delivery-cart/v1.0/carts/by-externalReferenceCode/{externalReferenceCode}',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
            },
        });
    }
    /**
     * Retrieve information of the given Cart by external reference code.
     * @returns Cart
     * @throws ApiError
     */
    public getHeadlessCommerceDeliveryCartV10CartsByExternalReferenceCode({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<Cart> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-cart/v1.0/carts/by-externalReferenceCode/{externalReferenceCode}',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Updates a Cart by external reference code.
     * @returns Cart Updated
     * @throws ApiError
     */
    public patchHeadlessCommerceDeliveryCartV10CartsByExternalReferenceCode({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody: Cart,
    }): CancelablePromise<Cart> {
        return this.httpRequest.request({
            method: 'PATCH',
            url: '/headless-commerce-delivery-cart/v1.0/carts/by-externalReferenceCode/{externalReferenceCode}',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            body: requestBody,
            mediaType: 'application/json',
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Updates a Cart.
     * @returns Cart Updated
     * @throws ApiError
     */
    public putHeadlessCommerceDeliveryCartV10CartsByExternalReferenceCode({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody: Cart,
    }): CancelablePromise<Cart> {
        return this.httpRequest.request({
            method: 'PUT',
            url: '/headless-commerce-delivery-cart/v1.0/carts/by-externalReferenceCode/{externalReferenceCode}',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            body: requestBody,
            mediaType: 'application/json',
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * @returns Cart
     * @throws ApiError
     */
    public postHeadlessCommerceDeliveryCartV10CartsByExternalReferenceCodeCheckout({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<Cart> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-delivery-cart/v1.0/carts/by-externalReferenceCode/{externalReferenceCode}/checkout',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
        });
    }
    /**
     * Add a coupon code to a Cart, return the whole Cart updated.
     * @returns Cart Coupon applied to the Cart
     * @throws ApiError
     */
    public postHeadlessCommerceDeliveryCartV10CartsByExternalReferenceCodeCouponCode({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody: CouponCode,
    }): CancelablePromise<Cart> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-delivery-cart/v1.0/carts/by-externalReferenceCode/{externalReferenceCode}/coupon-code',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            body: requestBody,
            mediaType: 'application/json',
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * @returns string
     * @throws ApiError
     */
    public getHeadlessCommerceDeliveryCartV10CartsByExternalReferenceCodePaymentUrl({
        externalReferenceCode,
        callbackUrl,
    }: {
        externalReferenceCode: string,
        callbackUrl?: string,
    }): CancelablePromise<string> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-cart/v1.0/carts/by-externalReferenceCode/{externalReferenceCode}/payment-url',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            query: {
                'callbackURL': callbackUrl,
            },
        });
    }
    /**
     * Deletes a Cart by ID.
     * @returns void
     * @throws ApiError
     */
    public deleteCart({
        cartId,
    }: {
        cartId: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-commerce-delivery-cart/v1.0/carts/{cartId}',
            path: {
                'cartId': cartId,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
            },
        });
    }
    /**
     * Retrieve information of the given Cart.
     * @returns Cart
     * @throws ApiError
     */
    public getCart({
        cartId,
    }: {
        cartId: number,
    }): CancelablePromise<Cart> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-cart/v1.0/carts/{cartId}',
            path: {
                'cartId': cartId,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Updates a Cart.
     * @returns Cart Updated
     * @throws ApiError
     */
    public patchCart({
        cartId,
        requestBody,
    }: {
        cartId: number,
        requestBody: Cart,
    }): CancelablePromise<Cart> {
        return this.httpRequest.request({
            method: 'PATCH',
            url: '/headless-commerce-delivery-cart/v1.0/carts/{cartId}',
            path: {
                'cartId': cartId,
            },
            body: requestBody,
            mediaType: 'application/json',
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Updates a Cart.
     * @returns Cart Updated
     * @throws ApiError
     */
    public putCart({
        cartId,
        requestBody,
    }: {
        cartId: number,
        requestBody: Cart,
    }): CancelablePromise<Cart> {
        return this.httpRequest.request({
            method: 'PUT',
            url: '/headless-commerce-delivery-cart/v1.0/carts/{cartId}',
            path: {
                'cartId': cartId,
            },
            body: requestBody,
            mediaType: 'application/json',
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * @returns Cart
     * @throws ApiError
     */
    public postCartCheckout({
        cartId,
    }: {
        cartId: number,
    }): CancelablePromise<Cart> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-delivery-cart/v1.0/carts/{cartId}/checkout',
            path: {
                'cartId': cartId,
            },
        });
    }
    /**
     * Add a coupon code to a Cart, return the whole Cart updated.
     * @returns Cart Coupon applied to the cart
     * @throws ApiError
     */
    public postCartCouponCode({
        cartId,
        requestBody,
    }: {
        cartId: number,
        requestBody: CouponCode,
    }): CancelablePromise<Cart> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-delivery-cart/v1.0/carts/{cartId}/coupon-code',
            path: {
                'cartId': cartId,
            },
            body: requestBody,
            mediaType: 'application/json',
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * @returns string
     * @throws ApiError
     */
    public getCartPaymentUrl({
        cartId,
        callbackUrl,
    }: {
        cartId: number,
        callbackUrl?: string,
    }): CancelablePromise<string> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-cart/v1.0/carts/{cartId}/payment-url',
            path: {
                'cartId': cartId,
            },
            query: {
                'callbackURL': callbackUrl,
            },
        });
    }
    /**
     * Retrieves carts for specific account in the given channel.
     * @returns PageCart Successful operation
     * @throws ApiError
     */
    public getChannelByExternalReferenceCodeChannelExternalReferenceCodeAccountByExternalReferenceCodeAccountExternalReferenceCodeCartsPage({
        accountExternalReferenceCode,
        channelExternalReferenceCode,
        page,
        pageSize,
        search,
    }: {
        accountExternalReferenceCode: string,
        channelExternalReferenceCode: string,
        page?: number,
        pageSize?: number,
        search?: string,
    }): CancelablePromise<PageCart> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-cart/v1.0/channels/by-externalReferenceCode/{channelExternalReferenceCode}/account/by-externalReferenceCode/{accountExternalReferenceCode}/carts',
            path: {
                'accountExternalReferenceCode': accountExternalReferenceCode,
                'channelExternalReferenceCode': channelExternalReferenceCode,
            },
            query: {
                'page': page,
                'pageSize': pageSize,
                'search': search,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Creates a Cart.
     * @returns Cart Created
     * @throws ApiError
     */
    public postChannelCartByExternalReferenceCode({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody: Cart,
    }): CancelablePromise<Cart> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-delivery-cart/v1.0/channels/by-externalReferenceCode/{externalReferenceCode}/carts',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            body: requestBody,
            mediaType: 'application/json',
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Retrieves carts for specific account in the given channel.
     * @returns PageCart Successful operation
     * @throws ApiError
     */
    public getChannelAccountCartsPage({
        accountId,
        channelId,
        page,
        pageSize,
        search,
    }: {
        accountId: number,
        channelId: number,
        page?: number,
        pageSize?: number,
        search?: string,
    }): CancelablePromise<PageCart> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-cart/v1.0/channels/{channelId}/account/{accountId}/carts',
            path: {
                'accountId': accountId,
                'channelId': channelId,
            },
            query: {
                'page': page,
                'pageSize': pageSize,
                'search': search,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Retrieves carts in the given channel.
     * @returns PageCart Successful operation
     * @throws ApiError
     */
    public getChannelCartsPage({
        channelId,
        filter,
        page,
        pageSize,
        search,
        sort,
    }: {
        channelId: number,
        filter?: string,
        page?: number,
        pageSize?: number,
        search?: string,
        sort?: string,
    }): CancelablePromise<PageCart> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-cart/v1.0/channels/{channelId}/carts',
            path: {
                'channelId': channelId,
            },
            query: {
                'filter': filter,
                'page': page,
                'pageSize': pageSize,
                'search': search,
                'sort': sort,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Creates a Cart.
     * @returns Cart Created
     * @throws ApiError
     */
    public postChannelCart({
        channelId,
        requestBody,
    }: {
        channelId: number,
        requestBody: Cart,
    }): CancelablePromise<Cart> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-delivery-cart/v1.0/channels/{channelId}/carts',
            path: {
                'channelId': channelId,
            },
            body: requestBody,
            mediaType: 'application/json',
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
}
