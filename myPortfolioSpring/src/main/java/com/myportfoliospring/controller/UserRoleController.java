package com.myportfoliospring.controller;

import java.util.HashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myportfoliospring.service.UserRoleService;

@Controller
@RequestMapping("/myportfoliospring/userRole")
public class UserRoleController {

	public static final Log LOG = LogFactory.getLog(UserRoleController.class);
	
	@Autowired
	@Qualifier("userRoleService")
	private UserRoleService userRoleService;
	
	@GetMapping("/getListUserRoles")
	public ResponseEntity<HashMap<Integer, String>> getListUserRoles() {
		LOG.info("METHOD:'getListUserRoles'");
		return new ResponseEntity<HashMap<Integer, String>>(userRoleService.listUserRoles(), HttpStatus.OK);
	}
}
