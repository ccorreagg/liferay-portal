package ${configYAML.apiPackagePath}.internal.dto.${escapedVersion}.action;

import com.liferay.portal.kernel.security.permission.ActionKeys;

/**
 * @author ${configYAML.author}
 * @generated
 */
public abstract class Base${schemaName}DTOActionMetadataProvider {
	<#assign
		actionsSchema = allSchemas[schemaName + "Actions"]
		actionsProperties = freeMarkerTool.getDTOProperties(configYAML, openAPIYAML, actionsSchema, schemaName)
		javaMethodSignatures = freeMarkerTool.getResourceJavaMethodSignatures(configYAML, openAPIYAML, schemaName)
	/>

	<#list actionsProperties?keys as propertyName>
		<#assign actionKey = freeMarkerTool.getActionKey(propertyName)!"" />

		<#if actionKey?has_content>
			protected String get${propertyName?cap_first}ActionKey() {
				return ActionKeys.${actionKey!};
			}
		<#else>
			protected abstract String get${propertyName?cap_first}ActionKey();
		</#if>

		<#assign actionResourceName = freeMarkerTool.getActionResourceName(javaMethodSignatures, propertyName)!"" />

		<#if actionResourceName?has_content>
			protected String get${propertyName?cap_first}ResourceMethodName() {
				return "${actionResourceName!}";
			}
		<#else>
			protected abstract String get${propertyName?cap_first}ResourceMethodName();
		</#if>
	</#list>

	protected abstract String getPermissionName();
}