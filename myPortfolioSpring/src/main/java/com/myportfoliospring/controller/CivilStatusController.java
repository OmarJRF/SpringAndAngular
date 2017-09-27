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

import com.myportfoliospring.model.CivilStatusModel;
import com.myportfoliospring.service.CivilStatusService;

@Controller
@RequestMapping("/myportfoliospring")
public class CivilStatusController {

	public static final Log LOG = LogFactory.getLog(CivilStatusController.class);
	
	@Autowired
	@Qualifier("civilStatusService")
	private CivilStatusService civilStatusService;
	
	@CrossOrigin
	@GetMapping("/getListCivilStatus")
	public ResponseEntity<List<CivilStatusModel>> getListCivilStatus() {
		LOG.info("METHOD:'getListCivilStatus'");
		return new ResponseEntity<List<CivilStatusModel>>(civilStatusService.listCivilStatus(), HttpStatus.OK);
	}
}
