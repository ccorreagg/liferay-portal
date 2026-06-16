import * as API from 'shared/api';
import List from '../List';
import mockStore from 'test/mock-store';
import React from 'react';
import {AccountMetricType} from 'contacts/pages/account/utils/types';
import {ChannelContext} from 'shared/context/channel';
import {cleanup, render, screen} from '@testing-library/react';
import {createMemoryHistory} from 'history';
import {mockChannelContext} from 'test/mock-channel-context';
import {Provider} from 'react-redux';
import {Router} from 'react-router-dom';
import {TrendClassification} from 'segment/types';
import {waitForLoadingToBeRemoved} from 'test/helpers';

jest.unmock('react-dom');

jest.mock('shared/hooks/useFrontendDataSet', () => ({
	useFrontendDataSet: () => {
		const FakeDataSet = ({id}: {id: string}) => (
			<div data-testid='fds-component' id={id} />
		);

		return FakeDataSet;
	}
}));

jest.mock('shared/hooks/useRequest');

jest.mock('shared/util/breadcrumbs', () => ({
	getHome: jest.fn(({label}: {label?: string} = {}) => ({
		active: false,
		label: label || 'Home'
	}))
}));

jest.mock('react-router-dom', () => ({
	...jest.requireActual('react-router-dom'),
	useHistory: jest.fn(),
	useParams: () => ({
		channelId: '123',
		groupId: '23'
	})
}));

// Default push spy shared across tests, reset in beforeEach.

const mockHistoryPush = jest.fn();

const buildHistory = (path = '/workspace/23/123/accounts') => {
	const history = createMemoryHistory({initialEntries: [path]});

	history.push = mockHistoryPush;

	return history;
};

const store = mockStore();

const accountMetrics = [
	{
		metricType: AccountMetricType.Total,
		trend: {
			percentage: 50,
			trendClassification: TrendClassification.Positive
		},
		value: 15
	},
	{
		metricType: AccountMetricType.New,
		trend: {
			percentage: -30,
			trendClassification: TrendClassification.Negative
		},
		value: 10
	},
	{
		metricType: AccountMetricType.Active,
		trend: {
			percentage: 0,
			trendClassification: TrendClassification.Neutral
		},
		value: 1
	}
];

// Helper: wrap List in the minimum context providers it needs.

const renderList = (
	{queryString = ''}: {queryString?: string} = {},
	history = buildHistory(`/workspace/23/123/accounts${queryString}`)
) =>
	render(
		<Provider store={store}>
			<ChannelContext.Provider value={mockChannelContext() as any}>
				<Router history={history}>
					<List channelId='123' groupId='23' />
				</Router>
			</ChannelContext.Provider>
		</Provider>
	);

// eslint-disable-next-line @typescript-eslint/no-var-requires
const {useHistory} = require('react-router-dom');

describe('List', () => {
	beforeEach(() => {
		jest.clearAllMocks();

		useHistory.mockReturnValue({push: mockHistoryPush});

		const useRequest = require('shared/hooks/useRequest');
		useRequest.useRequest = jest.fn(({dataSourceFn}) =>
			dataSourceFn === API.accounts.fetchMetrics
				? {data: accountMetrics}
				: {data: {total: 1}}
		);
	});

	afterEach(cleanup);

	describe('rendering', () => {
		it('should render without crashing', () => {
			const {container} = renderList();

			expect(container).toBeInTheDocument();
		});

		it('should render the page title "Accounts"', () => {
			renderList();

			expect(screen.getByText('Accounts')).toBeInTheDocument();
		});

		it('should render the empty state when there are no data sources connected', () => {
			const useRequest = require('shared/hooks/useRequest');

			useRequest.useRequest.mockReturnValue({
				data: {
					total: 0
				}
			});

			renderList();
		});

		it('should render the FrontendDataSet component', () => {
			renderList();

			expect(screen.getByTestId('fds-component')).toBeInTheDocument();
		});

		it('should render the FrontendDataSet with id "accounts-list-dataset"', () => {
			renderList();

			expect(screen.getByTestId('fds-component')).toHaveAttribute('id');
		});

		it('should match the snapshot', async () => {
			const {container} = renderList();

			await waitForLoadingToBeRemoved();

			expect(container).toMatchSnapshot();
		});
	});
});
