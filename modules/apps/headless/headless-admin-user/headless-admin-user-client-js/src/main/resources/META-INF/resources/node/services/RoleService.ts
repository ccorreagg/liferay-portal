/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { PageRole } from '../models/PageRole';
import type { Role } from '../models/Role';
import type { CancelablePromise } from '../core/CancelablePromise';
import type { BaseHttpRequest } from '../core/BaseHttpRequest';
export class RoleService {
    constructor(public readonly httpRequest: BaseHttpRequest) {}
    /**
     * Retrieves the portal instance's roles. Results can be paginated.
     * @returns PageRole
     * @throws ApiError
     */
    public getRolesPage({
        fields,
        page,
        pageSize,
        restrictFields,
        search,
        types,
    }: {
        fields?: string,
        page?: number,
        pageSize?: number,
        restrictFields?: string,
        search?: string,
        types?: Array<number>,
    }): CancelablePromise<PageRole> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/roles',
            query: {
                'fields': fields,
                'page': page,
                'pageSize': pageSize,
                'restrictFields': restrictFields,
                'search': search,
                'types': types,
            },
        });
    }
    /**
     * Creates a new role
     * @returns Role Roles successfully created
     * @throws ApiError
     */
    public postRole({
        requestBody,
    }: {
        requestBody?: Role,
    }): CancelablePromise<Role> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-admin-user/v1.0/roles',
            body: requestBody,
            mediaType: 'application/json',
        });
    }
    /**
     * Retrieves the role by its external reference code.
     * @returns Role
     * @throws ApiError
     */
    public getRoleByExternalReferenceCode({
        externalReferenceCode,
    }: {
        externalReferenceCode: string,
    }): CancelablePromise<Role> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/roles/by-external-reference-code/{externalReferenceCode}',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
        });
    }
    /**
     * update the given Role
     * @returns Role
     * @throws ApiError
     */
    public patchRoleByExternalReferenceCode({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody?: Role,
    }): CancelablePromise<Role> {
        return this.httpRequest.request({
            method: 'PATCH',
            url: '/headless-admin-user/v1.0/roles/by-external-reference-code/{externalReferenceCode}',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            body: requestBody,
            mediaType: 'application/json',
        });
    }
    /**
     * update the given Role
     * @returns Role
     * @throws ApiError
     */
    public putRoleByExternalReferenceCode({
        externalReferenceCode,
        requestBody,
    }: {
        externalReferenceCode: string,
        requestBody?: Role,
    }): CancelablePromise<Role> {
        return this.httpRequest.request({
            method: 'PUT',
            url: '/headless-admin-user/v1.0/roles/by-external-reference-code/{externalReferenceCode}',
            path: {
                'externalReferenceCode': externalReferenceCode,
            },
            body: requestBody,
            mediaType: 'application/json',
        });
    }
    /**
     * Unassociates a role by external reference code with a user account
     * @returns void
     * @throws ApiError
     */
    public deleteRoleByExternalReferenceCodeUserAccountAssociation({
        externalReferenceCode,
        userAccountId,
    }: {
        externalReferenceCode: string,
        userAccountId: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-admin-user/v1.0/roles/by-external-reference-code/{externalReferenceCode}/association/user-account/{userAccountId}',
            path: {
                'externalReferenceCode': externalReferenceCode,
                'userAccountId': userAccountId,
            },
        });
    }
    /**
     * Associates a role by external reference code with a user account
     * @returns any
     * @throws ApiError
     */
    public postRoleByExternalReferenceCodeUserAccountAssociation({
        externalReferenceCode,
        userAccountId,
    }: {
        externalReferenceCode: string,
        userAccountId: number,
    }): CancelablePromise<any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-admin-user/v1.0/roles/by-external-reference-code/{externalReferenceCode}/association/user-account/{userAccountId}',
            path: {
                'externalReferenceCode': externalReferenceCode,
                'userAccountId': userAccountId,
            },
        });
    }
    /**
     * Unassociates an organization role by external reference code with a user account
     * @returns void
     * @throws ApiError
     */
    public deleteOrganizationRoleByExternalReferenceCodeUserAccountAssociation({
        externalReferenceCode,
        userAccountId,
        organizationId,
    }: {
        externalReferenceCode: string,
        userAccountId: number,
        organizationId: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-admin-user/v1.0/roles/by-external-reference-code/{externalReferenceCode}/association/user-account/{userAccountId}/organization/{organizationId}',
            path: {
                'externalReferenceCode': externalReferenceCode,
                'userAccountId': userAccountId,
                'organizationId': organizationId,
            },
        });
    }
    /**
     * Associates a organization role by external reference code with a user account
     * @returns any
     * @throws ApiError
     */
    public postOrganizationRoleByExternalReferenceCodeUserAccountAssociation({
        externalReferenceCode,
        userAccountId,
        organizationId,
    }: {
        externalReferenceCode: string,
        userAccountId: number,
        organizationId: number,
    }): CancelablePromise<any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-admin-user/v1.0/roles/by-external-reference-code/{externalReferenceCode}/association/user-account/{userAccountId}/organization/{organizationId}',
            path: {
                'externalReferenceCode': externalReferenceCode,
                'userAccountId': userAccountId,
                'organizationId': organizationId,
            },
        });
    }
    /**
     * Unassociates a site role by external reference code with a user account
     * @returns void
     * @throws ApiError
     */
    public deleteSiteRoleByExternalReferenceCodeUserAccountAssociation({
        externalReferenceCode,
        userAccountId,
        siteId,
    }: {
        externalReferenceCode: string,
        userAccountId: number,
        siteId: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-admin-user/v1.0/roles/by-external-reference-code/{externalReferenceCode}/association/user-account/{userAccountId}/site/{siteId}',
            path: {
                'externalReferenceCode': externalReferenceCode,
                'userAccountId': userAccountId,
                'siteId': siteId,
            },
        });
    }
    /**
     * Associates a site role by external reference code with a user account
     * @returns any
     * @throws ApiError
     */
    public postSiteRoleByExternalReferenceCodeUserAccountAssociation({
        externalReferenceCode,
        userAccountId,
        siteId,
    }: {
        externalReferenceCode: string,
        userAccountId: number,
        siteId: number,
    }): CancelablePromise<any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-admin-user/v1.0/roles/by-external-reference-code/{externalReferenceCode}/association/user-account/{userAccountId}/site/{siteId}',
            path: {
                'externalReferenceCode': externalReferenceCode,
                'userAccountId': userAccountId,
                'siteId': siteId,
            },
        });
    }
    /**
     * Retrieves the role.
     * @returns Role
     * @throws ApiError
     */
    public getRole({
        roleId,
    }: {
        roleId: number,
    }): CancelablePromise<Role> {
        return this.httpRequest.request({
            method: 'GET',
            url: '/headless-admin-user/v1.0/roles/{roleId}',
            path: {
                'roleId': roleId,
            },
        });
    }
    /**
     * Unassociates a role with a user account
     * @returns void
     * @throws ApiError
     */
    public deleteRoleUserAccountAssociation({
        roleId,
        userAccountId,
    }: {
        roleId: number,
        userAccountId: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-admin-user/v1.0/roles/{roleId}/association/user-account/{userAccountId}',
            path: {
                'roleId': roleId,
                'userAccountId': userAccountId,
            },
        });
    }
    /**
     * Associates a role with a user account
     * @returns any
     * @throws ApiError
     */
    public postRoleUserAccountAssociation({
        roleId,
        userAccountId,
    }: {
        roleId: number,
        userAccountId: number,
    }): CancelablePromise<any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-admin-user/v1.0/roles/{roleId}/association/user-account/{userAccountId}',
            path: {
                'roleId': roleId,
                'userAccountId': userAccountId,
            },
        });
    }
    /**
     * Unassociates an organization role with a user account
     * @returns void
     * @throws ApiError
     */
    public deleteOrganizationRoleUserAccountAssociation({
        roleId,
        userAccountId,
        organizationId,
    }: {
        roleId: number,
        userAccountId: number,
        organizationId: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-admin-user/v1.0/roles/{roleId}/association/user-account/{userAccountId}/organization/{organizationId}',
            path: {
                'roleId': roleId,
                'userAccountId': userAccountId,
                'organizationId': organizationId,
            },
        });
    }
    /**
     * Associates a organization role with a user account
     * @returns any
     * @throws ApiError
     */
    public postOrganizationRoleUserAccountAssociation({
        roleId,
        userAccountId,
        organizationId,
    }: {
        roleId: number,
        userAccountId: number,
        organizationId: number,
    }): CancelablePromise<any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-admin-user/v1.0/roles/{roleId}/association/user-account/{userAccountId}/organization/{organizationId}',
            path: {
                'roleId': roleId,
                'userAccountId': userAccountId,
                'organizationId': organizationId,
            },
        });
    }
    /**
     * Unassociates a site role with a user account
     * @returns void
     * @throws ApiError
     */
    public deleteSiteRoleUserAccountAssociation({
        roleId,
        userAccountId,
        siteId,
    }: {
        roleId: number,
        userAccountId: number,
        siteId: number,
    }): CancelablePromise<void> {
        return this.httpRequest.request({
            method: 'DELETE',
            url: '/headless-admin-user/v1.0/roles/{roleId}/association/user-account/{userAccountId}/site/{siteId}',
            path: {
                'roleId': roleId,
                'userAccountId': userAccountId,
                'siteId': siteId,
            },
        });
    }
    /**
     * Associates a site role with a user account
     * @returns any
     * @throws ApiError
     */
    public postSiteRoleUserAccountAssociation({
        roleId,
        userAccountId,
        siteId,
    }: {
        roleId: number,
        userAccountId: number,
        siteId: number,
    }): CancelablePromise<any> {
        return this.httpRequest.request({
            method: 'POST',
            url: '/headless-admin-user/v1.0/roles/{roleId}/association/user-account/{userAccountId}/site/{siteId}',
            path: {
                'roleId': roleId,
                'userAccountId': userAccountId,
                'siteId': siteId,
            },
        });
    }
}
