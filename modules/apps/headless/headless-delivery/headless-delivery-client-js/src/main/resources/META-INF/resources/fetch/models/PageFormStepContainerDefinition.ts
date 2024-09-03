/* generated using openapi-typescript-codegen -- do no edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { CustomCSSViewport } from './CustomCSSViewport';
import type { FragmentStyle } from './FragmentStyle';
import type { FragmentViewport } from './FragmentViewport';
/**
 * Represents a definition of a Page form step container.
 */
export type PageFormStepContainerDefinition = {
    /**
     * A list of CSS Classes that are applied to the element.
     */
    cssClasses?: Array<string>;
    /**
     * Custom CSS that is applied on the fragment.
     */
    customCSS?: string;
    /**
     * The custom CSS viewports of the page collection.
     */
    customCSSViewports?: Array<CustomCSSViewport>;
    /**
     * The fragment style of a Page row.
     */
    fragmentStyle?: FragmentStyle;
    /**
     * A list of fragment viewports of a Page row.
     */
    fragmentViewports?: Array<FragmentViewport>;
    /**
     * A flag that indicates whether the page row is indexed or not.
     */
    indexed?: boolean;
};

