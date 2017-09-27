package com.myportfoliospring.controller;

import java.util.ArrayList;
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

import com.myportfoliospring.model.PersonModel;
import com.myportfoliospring.service.PersonService;

@RestController
@RequestMapping("/myportfoliospring/person")
public class PersonController {

	public static final Log LOG = LogFactory.getLog(PersonController.class);

	@Autowired
	@Qualifier("personService")
	private PersonService personService;

	@CrossOrigin
	@GetMapping("/findByCi/{ci}")
	public ResponseEntity<PersonModel> findPersonByCi(@PathVariable("ci") int ci) {
		LOG.info("METHOD:'findPersonByCi': " + ci);
		return new ResponseEntity<PersonModel>(personService.findByCi(ci), HttpStatus.OK);
	}

	@CrossOrigin
	@GetMapping("/findByFirstNameStartsWith/{firstname}")
	public ResponseEntity<List<PersonModel>> findByFirstNameStartsWith(@PathVariable("firstname") String firstname) {
		LOG.info("METHOD:'findByFirstNameStartsWith'");
		return new ResponseEntity<List<PersonModel>>(personService.findByFirstNameStartsWith(firstname), HttpStatus.OK);
	}

	@CrossOrigin
	@GetMapping("/findAll")
	public ResponseEntity<List<PersonModel>> getListPerson() {
		LOG.info("METHOD:'getListPerson'");
		List<PersonModel> listResul = new ArrayList<PersonModel>();
		listResul = personService.findAll();
		LOG.info("METHOD:'getListPerson'" + listResul.size());
		return new ResponseEntity<List<PersonModel>>(listResul, HttpStatus.OK);
	}

	@CrossOrigin
	// @PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/save")
	public ResponseEntity<Void> save(@RequestBody PersonModel personModel, BindingResult bindingResult) {
		LOG.info("METHOD:'save'- PARAMS:" + personModel);

		personService.save(personModel);

		return new ResponseEntity<Void>(HttpStatus.OK);

	}

}
