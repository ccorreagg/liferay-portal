/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageCalendar } from '../models/PageCalendar';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class CalendarService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * @returns PageCalendar
     * @throws ApiError
     */
    public getCalendarsPage(): CancelablePromise<PageCalendar> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/portal-workflow-metrics/v1.0/calendars',
        });
    }
}
