package ${configYAML.apiPackagePath}.internal.dto.${escapedVersion}.action;

import ${configYAML.apiPackagePath}.dto.${escapedVersion}.Action;
import ${configYAML.apiPackagePath}.dto.${escapedVersion}.${schemaName}Actions;
import ${configYAML.apiPackagePath}.internal.resource.${escapedVersion}.${schemaName}ResourceImpl;
import com.liferay.oauth2.provider.scope.ScopeChecker;
import com.liferay.portal.vulcan.action.ActionInfo;
import com.liferay.portal.vulcan.action.DTOActionProvider;
import com.liferay.portal.vulcan.util.ActionUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author ${configYAML.author}
 * @generated
 */
@Component(
	<#if configYAML.liferayEnterpriseApp>enabled = false,</#if>
	property = {
		"dto.class.name=${configYAML.apiPackagePath}.dto.${escapedVersion}.${schemaName}",
	},
	service = DTOActionProvider.class
)
@Generated("")
public class ${schemaName}DTOActionProvider implements DTOActionProvider<${schemaName}Actions> {

	<#assign
		actionsSchema = allSchemas[schemaName + "Actions"]
		actionsProperties = freeMarkerTool.getDTOProperties(configYAML, openAPIYAML, actionsSchema, schemaName)
	/>

	@Override
	public List<ActionInfo> getIndividualActionInfoList() throws Exception {
		${schemaName}DTOActionMetadataProvider ${schemaVarName}DTOActionMetadataProvider = new ${schemaName}DTOActionMetadataProvider();

		List<ActionInfo> actionInfoList = new ArrayList<>();

		<#list actionsProperties?keys as propertyName>
			actionInfoList.add(ActionUtil.getActionInfo("${propertyName}", ${schemaName}ResourceImpl.class, ${schemaVarName}DTOActionMetadataProvider.get${propertyName?cap_first}ResourceMethodName()));
		</#list>

		return actionInfoList;
	}

	@Override
	public ${schemaName}Actions getActions(long groupId, long primaryKey, UriInfo uriInfo, long userId) {
		${schemaName}DTOActionMetadataProvider ${schemaVarName}DTOActionMetadataProvider = new ${schemaName}DTOActionMetadataProvider();

		${schemaName}Actions ${schemaVarName}actions = new ${schemaName}Actions();

		<#list actionsProperties?keys as propertyName>
			${schemaVarName}actions.set${propertyName?cap_first}(_getAction(${schemaVarName}DTOActionMetadataProvider.get${propertyName?cap_first}ActionKey(), groupId, primaryKey, ${schemaVarName}DTOActionMetadataProvider.get${propertyName?cap_first}ResourceMethodName(), uriInfo, userId));
		</#list>

		return ${schemaVarName}actions;
	}

	private Action _getAction(String actionKey, long groupId, long primaryKey, String resourceMethodName, UriInfo uriInfo, long userId) {
		${schemaName}DTOActionMetadataProvider ${schemaVarName}DTOActionMetadataProvider = new ${schemaName}DTOActionMetadataProvider();

		final Map<String, String> actionMap = ActionUtil.addAction(actionKey, ${schemaName}ResourceImpl.class, primaryKey, resourceMethodName, _scopeChecker, userId, ${schemaVarName}DTOActionMetadataProvider.getPermissionName(), groupId, uriInfo);

		if (actionMap == null) {
			return null;
		}

		return new Action() {{
			setHref(actionMap.get("href"));
			setMethod(actionMap.get("method"));
		}};
	}

	@Reference
	private ScopeChecker _scopeChecker;
}