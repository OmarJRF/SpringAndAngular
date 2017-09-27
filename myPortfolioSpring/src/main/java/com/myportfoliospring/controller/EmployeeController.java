package com.myportfoliospring.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myportfoliospring.model.EmployeeModel;
import com.myportfoliospring.service.EmployeeService;

@RestController
@RequestMapping("/myportfoliospring/employee")
public class EmployeeController {

	public static final Log LOG = LogFactory.getLog(EmployeeController.class);
	
	@Autowired
	@Qualifier("employeeService")
	private EmployeeService employeeService;
	
	@CrossOrigin
	@GetMapping("/findAll")
	public ResponseEntity<List<EmployeeModel>> findAll() {
		LOG.info("METHOD:'findAll'");
		return new ResponseEntity<List<EmployeeModel>>(employeeService.findAll(), HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping("/findEmployeeByIdperson/{idPerson}")
	public ResponseEntity<EmployeeModel> findByIdEmployee(@PathVariable("idPerson") int idPerson) {
		LOG.info("METHOD:'findEmployeeByIdperson'");
		return new ResponseEntity<EmployeeModel>(employeeService.findEmployeeByIdPerson(idPerson), HttpStatus.OK);
	}
	
	@CrossOrigin
	@PostMapping("/save")
	public ResponseEntity<Void> save(@RequestBody EmployeeModel employeeModel, BindingResult bindingResult) {
		LOG.info("METHOD:'save'- PARAMS:" + employeeModel);

		employeeService.save(employeeModel);

		return new ResponseEntity<Void>(HttpStatus.OK);

	}

}
