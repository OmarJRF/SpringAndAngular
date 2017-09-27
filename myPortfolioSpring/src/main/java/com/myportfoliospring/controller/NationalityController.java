package com.myportfoliospring.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myportfoliospring.model.NationalityModel;
import com.myportfoliospring.service.NationalityService;

@Controller
@RequestMapping("/myportfoliospring")
public class NationalityController {

	public static final Log LOG = LogFactory.getLog(NationalityController.class);
	
	@Autowired
	@Qualifier("nationalityService")
	private NationalityService nationalityService;
	
	@CrossOrigin
	@GetMapping("/getListNationality")
	public ResponseEntity<List<NationalityModel>> getListNationality() {
		LOG.info("METHOD:'getListNationality'");
			
		return new ResponseEntity<List<NationalityModel>>(nationalityService.listNationality(), HttpStatus.OK);
	}
}
