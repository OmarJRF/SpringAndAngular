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

import com.myportfoliospring.model.CountryModel;
import com.myportfoliospring.service.CountryService;

/**
 * @author Omar
 *
 */
@RestController
@RequestMapping("/myportfoliospring")
public class CountryController {

	public static final Log LOG = LogFactory.getLog(PersonController.class);

	@Autowired
	@Qualifier("countryService")
	private CountryService countryService;
	
	
	@CrossOrigin
	@GetMapping("/findCountry")
	public ResponseEntity<List<CountryModel>> getListCountry() {
		LOG.info("METHOD:'getListCountry'");
		List<CountryModel> listResul = new ArrayList<CountryModel>();
		listResul = countryService.findByIdparent(0);
		LOG.info("METHOD:'getListPerson'" + listResul.size());
		return new ResponseEntity<List<CountryModel>>(listResul, HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping("/findStateMunicipality/{id}")
	public  ResponseEntity<List<CountryModel>> findListStateMunicipality(@PathVariable("id") int id) {
		LOG.info("METHOD:'findListStateMunicipality'-id:"+id);
		List<CountryModel> listResul = new ArrayList<CountryModel>();
		listResul = countryService.findByIdparent(id);
		LOG.info("METHOD:'findListStateMunicipality'" + listResul.size());
		return new ResponseEntity<List<CountryModel>>(listResul, HttpStatus.OK);
	}
}
