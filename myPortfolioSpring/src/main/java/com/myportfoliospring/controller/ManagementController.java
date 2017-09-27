/**
 * 
 */
package com.myportfoliospring.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myportfoliospring.model.ManagementModel;
import com.myportfoliospring.service.ManagementService;

/**
 * @author Omar
 *
 */
@RestController
@RequestMapping("/myportfoliospring")
public class ManagementController {

	public static final Log LOG = LogFactory.getLog(ManagementController.class);

	@Autowired
	@Qualifier("managementService")
	private ManagementService managementService;
	
	@CrossOrigin
	@GetMapping("/getListDirection")
	public ResponseEntity<List<ManagementModel>> getListManagement() {
		LOG.info("METHOD:'getListManagement'");
		List<ManagementModel> listResul = new ArrayList<ManagementModel>();
		listResul = managementService.findByIdParent(0);
		return new ResponseEntity<List<ManagementModel>>(listResul, HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping("/findManagementDepartment/{id}")
	public  ResponseEntity<List<ManagementModel>> findManagementDepartment(@PathVariable("id") int id) {
		LOG.info("METHOD:'findManagementDepartment'-id:"+id);
		List<ManagementModel> listResul = new ArrayList<ManagementModel>();
		listResul =  managementService.findByIdParent(id);
		LOG.info("METHOD:'findManagementDepartment'" + listResul.size());
		return new ResponseEntity<List<ManagementModel>>(listResul, HttpStatus.OK);
	}
	
}
