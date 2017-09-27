package com.myportfoliospring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.myportfoliospring.converter.PersonConverter;
import com.myportfoliospring.entity.Person;
import com.myportfoliospring.model.PersonModel;
import com.myportfoliospring.repository.PersonRepository;
import com.myportfoliospring.service.PersonService;

@Service("personService")
public class PersonServiceImpl implements PersonService {
	
	public static final Log LOG = LogFactory.getLog(PersonServiceImpl.class);
	
	@Autowired
	@Qualifier("personRepository")
	private PersonRepository personRepository;
	
	@Autowired
	@Qualifier("personConverter")
	private PersonConverter personConverter;
	
	@Override
	public PersonModel findByCi(int ci) {
		LOG.info("METHOD:'getPersonByCi' - PARAM: 'ci': "+ci);
		return personConverter.entityToModel(personRepository.findById(ci));
	}
	
	@Override
	public List<PersonModel> findAll() {
		LOG.info("METHOD:'getListPersons'");
		List<Person> listPersons = personRepository.findAll();
		List<PersonModel> personsResult = new ArrayList<PersonModel>();
		for (Person person : listPersons) {
			personsResult.add(personConverter.entityToModel(person));
		}
		return  personsResult;
	}

	@Override
	public List<PersonModel> findByFirstNameStartsWith(String firstName) {
		LOG.info("*** getPersonByName ***");
		List<Person> listPersons = personRepository.findByFirstNameStartsWith(firstName);
		List<PersonModel> personsResult = new ArrayList<PersonModel>();
		for (Person person : listPersons) {
			personsResult.add(personConverter.entityToModel(person));
		}
		
		return personsResult;
	}

	
	@Override
	public void save(PersonModel personModel) {
		LOG.info("METHOD:'addPerson'- PARAMS:" + personModel);
		personRepository.save(personConverter.modelToEntity(personModel));
	}

	@Override
	public void delete(PersonModel personModel) {
		LOG.info("METHOD:'addPerson'- PARAMS:" + personModel);
		personRepository.delete(personConverter.modelToEntity(personModel));
	}


}
