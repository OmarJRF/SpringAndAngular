/**
 * 
 */
package com.myportfoliospring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.myportfoliospring.converter.ManagementConverter;
import com.myportfoliospring.entity.Management;
import com.myportfoliospring.model.ManagementModel;
import com.myportfoliospring.repository.ManagementRepository;
import com.myportfoliospring.service.ManagementService;

/**
 * @author Omar
 *
 */
@Service("managementService")
public class ManagementServiceImpl implements ManagementService {

	public static final Log LOG = LogFactory.getLog(ManagementServiceImpl.class);

	@Autowired
	@Qualifier("managementRepository")
	private ManagementRepository managementRepository;
	
	
	@Autowired
	@Qualifier("managementConverter")
	private ManagementConverter managementConverter;


	@Override
	public List<ManagementModel> findByIdParent(int id) {

		List<ManagementModel> managementModel = new ArrayList<ManagementModel>();
		List<Management> listManagement = managementRepository.findByIdParent(id);

		for (Management management : listManagement) {
			managementModel.add(managementConverter.entityToModel(management));
		}

		return managementModel;
	}
	
	
}
