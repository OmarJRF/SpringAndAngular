package com.myportfoliospring.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myportfoliospring.model.CompanyModel;
import com.myportfoliospring.service.CompanyService;

@RestController
@RequestMapping("/myportfoliospring/company")
public class CompanyController {

	public static final Log LOG = LogFactory.getLog(CompanyController.class);
	@Autowired
	@Qualifier("companyService")
	private CompanyService companyService;
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<CompanyModel> findById(@PathVariable("id") int id) {
		LOG.info("METHOD:'findById'");
		return new ResponseEntity<CompanyModel>(companyService.findById(id), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<CompanyModel>> findAll() {
		LOG.info("METHOD:'findAll'");
		return new ResponseEntity<List<CompanyModel>>(companyService.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Void> save(@RequestBody CompanyModel companyModel, BindingResult bindingResult) {
		LOG.info("METHOD:'save'- PARAMS:" + companyModel);

		companyService.save(companyModel);

		return new ResponseEntity<Void>(HttpStatus.OK);

	}
	
}
