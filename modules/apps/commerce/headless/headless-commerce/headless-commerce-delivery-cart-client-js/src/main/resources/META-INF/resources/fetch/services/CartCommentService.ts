/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { CartComment } from '../models/CartComment';
import type { PageCartComment } from '../models/PageCartComment';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class CartCommentService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Deletes a Cart Comment by external reference code.
     * @returns void
     * @throws ApiError
     */
    public deleteCartCommentByExternalReferenceCode({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-commerce-delivery-cart/v1.0/cart-comments/by-externalReferenceCode/{externalReferenceCode}',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
            },
        });
    }
    /**
     * Retrieve information of the given Cart Comment by external reference code.
     * @returns CartComment Successful operation
     * @throws ApiError
     */
    public getCartCommentByExternalReferenceCode({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<CartComment> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-cart/v1.0/cart-comments/by-externalReferenceCode/{externalReferenceCode}',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Update the provided Cart Comment by external reference code.
     * @returns CartComment Succesfully update the comment
     * @throws ApiError
     */
    public patchCartCommentByExternalReferenceCode({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody: CartComment,
    }): CancelablePromise<CartComment> {
        return this.httpRequest.request({
            method: 'PATCH',
            url: '/headless-commerce-delivery-cart/v1.0/cart-comments/by-externalReferenceCode/{externalReferenceCode}',
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
     * Update the provided Cart Comment by external reference code.
     * @returns CartComment Succesfully update the comment
     * @throws ApiError
     */
    public putCartCommentByExternalReferenceCode({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody: CartComment,
    }): CancelablePromise<CartComment> {
        return this.httpRequest.request({
            method: 'PUT',
            url: '/headless-commerce-delivery-cart/v1.0/cart-comments/by-externalReferenceCode/{externalReferenceCode}',
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
     * Deletes an Cart Comment by ID.
     * @returns void
     * @throws ApiError
     */
    public deleteCartComment({
        cartCommentId,
    }: {
        cartCommentId: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-commerce-delivery-cart/v1.0/cart-comments/{cartCommentId}',
            path: {
                'cartCommentId': cartCommentId,
            },
            errors: {
                401: `Authentication information is missing or invalid`,
            },
        });
    }
    /**
     * Gets a Note by ID.
     * @returns CartComment Successful operation
     * @throws ApiError
     */
    public getCartComment({
        cartCommentId,
    }: {
        cartCommentId: number,
    }): CancelablePromise<CartComment> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-cart/v1.0/cart-comments/{cartCommentId}',
            path: {
                'cartCommentId': cartCommentId,
            },
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Updates an Cart Note by ID.
     * @returns CartComment Succesfully update the comment
     * @throws ApiError
     */
    public patchCartComment({
        cartCommentId,
        requestBody,
    }: {
        cartCommentId: number,
        requestBody: CartComment,
    }): CancelablePromise<CartComment> {
        return this.httpRequest.request({
            method: 'PATCH',
            url: '/headless-commerce-delivery-cart/v1.0/cart-comments/{cartCommentId}',
            path: {
                'cartCommentId': cartCommentId,
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
     * Updates an Cart Comment by ID.
     * @returns CartComment Succesfully update the comment
     * @throws ApiError
     */
    public putCartComment({
        cartCommentId,
        requestBody,
    }: {
        cartCommentId: number,
        requestBody: CartComment,
    }): CancelablePromise<CartComment> {
        return this.httpRequest.request({
            method: 'PUT',
            url: '/headless-commerce-delivery-cart/v1.0/cart-comments/{cartCommentId}',
            path: {
                'cartCommentId': cartCommentId,
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
     * Gets a list of Comments related to a Cart.
     * @returns PageCartComment Successful operation
     * @throws ApiError
     */
    public getHeadlessCommerceDeliveryCartV10CartsByExternalReferenceCodeComments({
        externalReferenceCode,
        page,
        pageSize,
    }: {
        externalReferenceCode: string,
        page?: number,
        pageSize?: number,
    }): CancelablePromise<PageCartComment> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-cart/v1.0/carts/by-externalReferenceCode/{externalReferenceCode}/comments',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            query: {
                'page': page,
                'pageSize': pageSize,
            },
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Creates or updates a Comment.
     * @returns CartComment Created
     * @throws ApiError
     */
    public postHeadlessCommerceDeliveryCartV10CartsByExternalReferenceCodeComments({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody: CartComment,
    }): CancelablePromise<CartComment> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-delivery-cart/v1.0/carts/by-externalReferenceCode/{externalReferenceCode}/comments',
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
     * Gets a list of Comments related to a Cart.
     * @returns PageCartComment Successful operation
     * @throws ApiError
     */
    public getCartCommentsPage({
        cartId,
        page,
        pageSize,
    }: {
        cartId: number,
        page?: number,
        pageSize?: number,
    }): CancelablePromise<PageCartComment> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-commerce-delivery-cart/v1.0/carts/{cartId}/comments',
            path: {
                'cartId': cartId,
            },
            query: {
                'page': page,
                'pageSize': pageSize,
            },
            errors: {
                400: `Invalid input`,
                401: `Authentication information is missing or invalid`,
                404: `The specified resource was not found`,
                500: `Unexpected error`,
            },
        });
    }
    /**
     * Creates or updates a Comment.
     * @returns CartComment Created
     * @throws ApiError
     */
    public postCartComment({
        cartId,
        requestBody,
    }: {
        cartId: number,
        requestBody: CartComment,
    }): CancelablePromise<CartComment> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-commerce-delivery-cart/v1.0/carts/{cartId}/comments',
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
}
