/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { CartItem } from '../models/CartItem';
import type { PageCartItem } from '../models/PageCartItem';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class CartItemService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Deletes a Cart Item by external reference code.
     * @returns void
     * @throws ApiError
     */
    public deleteCartItemByExternalReferenceCode({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-commerce-delivery-cart/v1.0/cart-items/by-externalReferenceCode/{externalReferenceCode}',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
            },
        });
    }
    /**
     * Retrieve information of the given Cart Item by external reference code.
     * @returns CartItem
     * @throws ApiError
     */
    public getCartItemByExternalReferenceCode({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<CartItem> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-cart/v1.0/cart-items/by-externalReferenceCode/{externalReferenceCode}',
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
     * Update the provided Cart Item by external reference code.
     * @returns CartItem
     * @throws ApiError
     */
    public patchCartItemByExternalReferenceCode({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody: CartItem,
    }): CancelablePromise<CartItem> {
        return this.httpRequest.request({
            method: 'PATCH',
            url: '/headless-commerce-delivery-cart/v1.0/cart-items/by-externalReferenceCode/{externalReferenceCode}',
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
     * Update the provided Cart Item by external reference code.
     * @returns CartItem
     * @throws ApiError
     */
    public putCartItemByExternalReferenceCode({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody: CartItem,
    }): CancelablePromise<CartItem> {
        return this.httpRequest.request({
            method: 'PUT',
            url: '/headless-commerce-delivery-cart/v1.0/cart-items/by-externalReferenceCode/{externalReferenceCode}',
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
     * Deletes an Cart Item by ID.
     * @returns void
     * @throws ApiError
     */
    public deleteCartItem({
        cartItemId,
    }: {
        cartItemId: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-commerce-delivery-cart/v1.0/cart-items/{cartItemId}',
            path: {
                'cartItemId': cartItemId,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
            },
        });
    }
    /**
     * Retrieve information of the given Cart
     * @returns CartItem
     * @throws ApiError
     */
    public getCartItem({
        cartItemId,
    }: {
        cartItemId: number,
    }): CancelablePromise<CartItem> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-cart/v1.0/cart-items/{cartItemId}',
            path: {
                'cartItemId': cartItemId,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Retrieve information of the given Cart.
     * @returns CartItem
     * @throws ApiError
     */
    public patchCartItem({
        cartItemId,
        requestBody,
    }: {
        cartItemId: number,
        requestBody: CartItem,
    }): CancelablePromise<CartItem> {
        return this.httpRequest.request({
            method: 'PATCH',
            url: '/headless-commerce-delivery-cart/v1.0/cart-items/{cartItemId}',
            path: {
                'cartItemId': cartItemId,
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
     * update the given Cart.
     * @returns CartItem
     * @throws ApiError
     */
    public putCartItem({
        cartItemId,
        requestBody,
    }: {
        cartItemId: number,
        requestBody: CartItem,
    }): CancelablePromise<CartItem> {
        return this.httpRequest.request({
            method: 'PUT',
            url: '/headless-commerce-delivery-cart/v1.0/cart-items/{cartItemId}',
            path: {
                'cartItemId': cartItemId,
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
     * Retrieve cart items of a Cart.
     * @returns PageCartItem Return the items of the cart
     * @throws ApiError
     */
    public getHeadlessCommerceDeliveryCartV10CartsByExternalReferenceCodeItems({
        externalReferenceCode,
        page,
        pageSize,
        skuId,
    }: {
        externalReferenceCode: string,
        page?: number,
        pageSize?: number,
        skuId?: number,
    }): CancelablePromise<PageCartItem> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-cart/v1.0/carts/by-externalReferenceCode/{externalReferenceCode}/items',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            query: {
                'page': page,
                'pageSize': pageSize,
                'skuId': skuId,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Add new Item to a Cart, return the whole Cart updated.
     * @returns CartItem Add cart item to the cart
     * @throws ApiError
     */
    public postHeadlessCommerceDeliveryCartV10CartsByExternalReferenceCodeItems({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody: CartItem,
    }): CancelablePromise<CartItem> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-delivery-cart/v1.0/carts/by-externalReferenceCode/{externalReferenceCode}/items',
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
     * Retrieve cart items of a Cart.
     * @returns PageCartItem Return the items of the cart
     * @throws ApiError
     */
    public getCartItemsPage({
        cartId,
        page,
        pageSize,
        skuId,
    }: {
        cartId: number,
        page?: number,
        pageSize?: number,
        skuId?: number,
    }): CancelablePromise<PageCartItem> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-cart/v1.0/carts/{cartId}/items',
            path: {
                'cartId': cartId,
            },
            query: {
                'page': page,
                'pageSize': pageSize,
                'skuId': skuId,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Add new Items to a Cart, return the whole Cart updated.
     * @returns CartItem Add cart item to the cart
     * @throws ApiError
     */
    public postCartItem({
        cartId,
        requestBody,
    }: {
        cartId: number,
        requestBody: CartItem,
    }): CancelablePromise<CartItem> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-delivery-cart/v1.0/carts/{cartId}/items',
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
}
