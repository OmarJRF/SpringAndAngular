package com.myportfoliospring.converter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.myportfoliospring.entity.Person;
import com.myportfoliospring.model.PersonModel;

@Component("personConverter")
public class PersonConverter {

	public static final Log LOG = LogFactory.getLog(PersonConverter.class);

	public Person modelToEntity(PersonModel personModel) {

		Person person = new Person();

		person.setNationality(personModel.getNationality());
		person.setId(personModel.getCi());
		person.setFirstName(personModel.getFirstName());
		person.setLastName(personModel.getLastName());
		person.setBirthDate(personModel.getBirthDate());
		person.setCivilStatus(personModel.getCivilStatus());
		person.setTelephone(personModel.getTelephone());
		person.setEmail(personModel.getEmail());
		person.setCountry(personModel.getCountry());
		person.setState(personModel.getState());
		person.setMunicipality(personModel.getMunicipality());
		person.setAddress(personModel.getAddress());

		LOG.info("METHOD:'modelToEntity'- PARAMS RETURN:" + person);

		return person;
	}

	public PersonModel entityToModel(Person person) {

		PersonModel personModel = new PersonModel();

		personModel.setNationality(person.getNationality());
		personModel.setCi(person.getId());
		personModel.setFirstName(person.getFirstName());
		personModel.setLastName(person.getLastName());
		personModel.setBirthDate(person.getBirthDate());
		personModel.setCivilStatus(person.getCivilStatus());
		personModel.setTelephone(person.getTelephone());
		personModel.setEmail(person.getEmail());
		personModel.setCountry(person.getCountry());
		personModel.setState(person.getState());
		personModel.setMunicipality(person.getMunicipality());
		personModel.setAddress(person.getAddress());
	
		LOG.info("METHOD:'entityToModel'- PARAMS RETURN:" + personModel);

		return personModel;
	}

}
