/**
 * 
 */
package com.myportfoliospring.converter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.myportfoliospring.entity.Management;
import com.myportfoliospring.model.ManagementModel;

/**
 * @author Omar
 *
 */
@Component("managementConverter")
public class ManagementConverter {

	public static final Log LOG = LogFactory.getLog(CountryConverter.class);

	public Management modelToEntity(ManagementModel managementModel) {

		Management management = new Management();

		management.setId(managementModel.getId());
		management.setDescription(managementModel.getDescription());
		management.setIdParent(managementModel.getIdParent());

		return management;
		
	}
	
	public ManagementModel entityToModel(Management management) {

		ManagementModel managementModel = new ManagementModel();

		managementModel.setId(management.getId());
		managementModel.setDescription(management.getDescription());
		managementModel.setIdParent(management.getIdParent());

		return managementModel;

	}
}
