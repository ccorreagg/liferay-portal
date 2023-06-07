package ${configYAML.apiPackagePath}.internal.dto.${escapedVersion}.action.metadata;

import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.action.ActionInfo;

import java.util.Set;

/**
 * @author ${configYAML.author}
 * @generated
 */
public abstract class Base${schemaName}DTOActionMetadataProvider {
	<#assign
		actionPropertyNames = ["delete", "get", "replace"]
		javaMethodSignatures = freeMarkerTool.getResourceJavaMethodSignatures(configYAML, openAPIYAML, schemaName)
	/>

	<#list actionPropertyNames as actionPropertyName>
		<#assign actionKey = freeMarkerTool.getActionKey(actionPropertyName)!"" />

		protected String get${actionPropertyName?cap_first}ActionKey() {
			return ActionKeys.${actionKey!};
		}

		<#assign actionResourceName = freeMarkerTool.getActionResourceName(javaMethodSignatures, actionPropertyName)!"" />

		<#if actionResourceName?has_content>
			protected String get${actionPropertyName?cap_first}ResourceMethodName() {
				return "${actionResourceName!}";
			}
		<#else>
			protected abstract String get${actionPropertyName?cap_first}ResourceMethodName();
		</#if>
	</#list>

	public String getPermissionName() {
		return null;
	}

	public Set<String> getActionNames() {
		return SetUtil.fromArray(
			<#if actionPropertyNames?has_content>
				"${actionPropertyNames?join("\", \"")}"
			</#if>
		);
	}

	public ActionInfo getActionInfo(String actionName) {
		ActionInfo actionInfo = null;

		<#list actionPropertyNames as actionPropertyName>

			if (StringUtil.equals(actionName, "${actionPropertyName}")) {
				actionInfo = new ActionInfo();

				actionInfo.setActionKey(get${actionPropertyName?cap_first}ActionKey());
				actionInfo.setResourceMethodName(get${actionPropertyName?cap_first}ResourceMethodName());
			}

			<#sep>else </#sep>
		</#list>

		return actionInfo;
	}
}