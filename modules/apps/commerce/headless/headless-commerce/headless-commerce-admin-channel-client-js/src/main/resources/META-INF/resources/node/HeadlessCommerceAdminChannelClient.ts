/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { BaseHttpRequest } from './core/BaseHttpRequest';
import type { OpenAPIConfig } from './core/OpenAPI';
import { NodeHttpRequest } from './core/NodeHttpRequest';
import { AccountService } from './services/AccountService';
import { AccountAddressChannelService } from './services/AccountAddressChannelService';
import { CategoryDisplayPageService } from './services/CategoryDisplayPageService';
import { ChannelService } from './services/ChannelService';
import { ChannelAccountService } from './services/ChannelAccountService';
import { DefaultCategoryDisplayPageService } from './services/DefaultCategoryDisplayPageService';
import { DefaultProductDisplayPageService } from './services/DefaultProductDisplayPageService';
import { OrderTypeService } from './services/OrderTypeService';
import { PaymentMethodGroupRelOrderTypeService } from './services/PaymentMethodGroupRelOrderTypeService';
import { PaymentMethodGroupRelTermService } from './services/PaymentMethodGroupRelTermService';
import { ProductDisplayPageService } from './services/ProductDisplayPageService';
import { ShippingFixedOptionOrderTypeService } from './services/ShippingFixedOptionOrderTypeService';
import { ShippingFixedOptionTermService } from './services/ShippingFixedOptionTermService';
import { ShippingMethodService } from './services/ShippingMethodService';
import { TaxCategoryService } from './services/TaxCategoryService';
import { TermService } from './services/TermService';
type HttpRequestConstructor = new (config: OpenAPIConfig) => BaseHttpRequest;
export class HeadlessCommerceAdminChannelClient {
    public readonly account: AccountService;
    public readonly accountAddressChannel: AccountAddressChannelService;
    public readonly categoryDisplayPage: CategoryDisplayPageService;
    public readonly channel: ChannelService;
    public readonly channelAccount: ChannelAccountService;
    public readonly defaultCategoryDisplayPage: DefaultCategoryDisplayPageService;
    public readonly defaultProductDisplayPage: DefaultProductDisplayPageService;
    public readonly orderType: OrderTypeService;
    public readonly paymentMethodGroupRelOrderType: PaymentMethodGroupRelOrderTypeService;
    public readonly paymentMethodGroupRelTerm: PaymentMethodGroupRelTermService;
    public readonly productDisplayPage: ProductDisplayPageService;
    public readonly shippingFixedOptionOrderType: ShippingFixedOptionOrderTypeService;
    public readonly shippingFixedOptionTerm: ShippingFixedOptionTermService;
    public readonly shippingMethod: ShippingMethodService;
    public readonly taxCategory: TaxCategoryService;
    public readonly term: TermService;
    public readonly request: BaseHttpRequest;
    constructor(config?: Partial<OpenAPIConfig>, HttpRequest: HttpRequestConstructor = NodeHttpRequest) {
        this.request = new HttpRequest({
            BASE: config?.BASE ?? 'https://virtserver.swaggerhub.com/liferayinc/commerce-admin-channel-api/v1.0',
            VERSION: config?.VERSION ?? '1.0',
            WITH_CREDENTIALS: config?.WITH_CREDENTIALS ?? false,
            CREDENTIALS: config?.CREDENTIALS ?? 'include',
            TOKEN: config?.TOKEN,
            USERNAME: config?.USERNAME,
            PASSWORD: config?.PASSWORD,
            HEADERS: config?.HEADERS,
            ENCODE_PATH: config?.ENCODE_PATH,
        });
        this.account = new AccountService(this.request);
        this.accountAddressChannel = new AccountAddressChannelService(this.request);
        this.categoryDisplayPage = new CategoryDisplayPageService(this.request);
        this.channel = new ChannelService(this.request);
        this.channelAccount = new ChannelAccountService(this.request);
        this.defaultCategoryDisplayPage = new DefaultCategoryDisplayPageService(this.request);
        this.defaultProductDisplayPage = new DefaultProductDisplayPageService(this.request);
        this.orderType = new OrderTypeService(this.request);
        this.paymentMethodGroupRelOrderType = new PaymentMethodGroupRelOrderTypeService(this.request);
        this.paymentMethodGroupRelTerm = new PaymentMethodGroupRelTermService(this.request);
        this.productDisplayPage = new ProductDisplayPageService(this.request);
        this.shippingFixedOptionOrderType = new ShippingFixedOptionOrderTypeService(this.request);
        this.shippingFixedOptionTerm = new ShippingFixedOptionTermService(this.request);
        this.shippingMethod = new ShippingMethodService(this.request);
        this.taxCategory = new TaxCategoryService(this.request);
        this.term = new TermService(this.request);
    }
}

