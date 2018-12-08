/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.senior.messaging.customspringdata.CustomFieldPermission;
import br.com.senior.messaging.customspringdata.CustomEntity;
import br.com.senior.messaging.model.ServiceContext;
import br.com.senior.messaging.model.SpringContext;
import br.com.senior.security.api.AuthUtils;

@Service
@Profile(SpringContext.PROD_PROFILE)
public class CustomFieldPermissionImpl implements CustomFieldPermission {
    
    private static final String EDIT_ACTION = "Editar";
    private static final String VIEW_ACTION = "Visualizar";
    private static final String CUSTOM_FIELD_RESOURCE_BASE_URI = "res://senior.com.br/custom/entity_";
    
    @Override
    public boolean canEdit(CustomEntity entity, String field) {
    	ServiceContext sc = ServiceContext.get();
    	return AuthUtils.hasPermission(sc.getCurrentMessenger(), sc.getCurrentTenant(), sc.getCurrentUsername(), EDIT_ACTION, CUSTOM_FIELD_RESOURCE_BASE_URI + sc.getCurrentService().getDomain() + '_' + sc.getCurrentService().getName() + '_' + entity.getServiceEntityName() + '/' + field);
    }
    
    @Override
    public boolean canView(CustomEntity entity, String field) {
    	ServiceContext sc = ServiceContext.get();
    	return AuthUtils.hasPermission(sc.getCurrentMessenger(), sc.getCurrentTenant(), sc.getCurrentUsername(), VIEW_ACTION, CUSTOM_FIELD_RESOURCE_BASE_URI + sc.getCurrentService().getDomain() + '_' + sc.getCurrentService().getName() + '_' + entity.getServiceEntityName() + '/' + field);
    }
	
}
