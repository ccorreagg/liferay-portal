/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { UserNotification } from '../models/UserNotification';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class UserNotificationService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Retrieves the current user's notifications. Results can be paginated, filtered, searched and sorted.
     * @returns UserNotification
     * @throws ApiError
     */
    public getMyUserNotificationsPage({
        fields,
        filter,
        page,
        pageSize,
        restrictFields,
        search,
        sort,
    }: {
        fields?: string,
        filter?: string,
        page?: number,
        pageSize?: number,
        restrictFields?: string,
        search?: string,
        sort?: string,
    }): CancelablePromise<Array<UserNotification>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-user-notification/v1.0/my-user-notifications',
            query: {
                'fields': fields,
                'filter': filter,
                'page': page,
                'pageSize': pageSize,
                'restrictFields': restrictFields,
                'search': search,
                'sort': sort,
            },
        });
    }
    /**
     * Retrieves the user account's notifications. Results can be paginated, filtered, searched and sorted.
     * @returns UserNotification
     * @throws ApiError
     */
    public getUserAccountUserNotificationsPage({
        userAccountId,
        fields,
        filter,
        page,
        pageSize,
        restrictFields,
        search,
        sort,
    }: {
        userAccountId: number,
        fields?: string,
        filter?: string,
        page?: number,
        pageSize?: number,
        restrictFields?: string,
        search?: string,
        sort?: string,
    }): CancelablePromise<Array<UserNotification>> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-user-notification/v1.0/user-accounts/{userAccountId}/user-notifications',
            path: {
                'userAccountId': userAccountId,
            },
            query: {
                'fields': fields,
                'filter': filter,
                'page': page,
                'pageSize': pageSize,
                'restrictFields': restrictFields,
                'search': search,
                'sort': sort,
            },
        });
    }
    /**
     * Retrieves the user notification.
     * @returns UserNotification
     * @throws ApiError
     */
    public getUserNotification({
        userNotificationId,
        fields,
        restrictFields,
    }: {
        userNotificationId: number,
        fields?: string,
        restrictFields?: string,
    }): CancelablePromise<UserNotification> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-user-notification/v1.0/user-notifications/{userNotificationId}',
            path: {
                'userNotificationId': userNotificationId,
            },
            query: {
                'fields': fields,
                'restrictFields': restrictFields,
            },
        });
    }
    /**
     * Mark the user notification as read.
     * @returns void
     * @throws ApiError
     */
    public putUserNotificationRead({
        userNotificationId,
        fields,
        restrictFields,
    }: {
        userNotificationId: number,
        fields?: string,
        restrictFields?: string,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'PUT',
            url: '/headless-user-notification/v1.0/user-notifications/{userNotificationId}/read',
            path: {
                'userNotificationId': userNotificationId,
            },
            query: {
                'fields': fields,
                'restrictFields': restrictFields,
            },
        });
    }
    /**
     * Mark the user notification as unread.
     * @returns void
     * @throws ApiError
     */
    public putUserNotificationUnread({
        userNotificationId,
        fields,
        restrictFields,
    }: {
        userNotificationId: number,
        fields?: string,
        restrictFields?: string,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'PUT',
            url: '/headless-user-notification/v1.0/user-notifications/{userNotificationId}/unread',
            path: {
                'userNotificationId': userNotificationId,
            },
            query: {
                'fields': fields,
                'restrictFields': restrictFields,
            },
        });
    }
}
