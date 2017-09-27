package com.myportfoliospring.service;

import java.util.List;

import com.myportfoliospring.model.PersonModel;

public interface PersonService {

	public abstract List<PersonModel> findAll();
	
	public abstract PersonModel findByCi(int ci);
	
	public abstract List<PersonModel> findByFirstNameStartsWith(String firstName);
	
	public abstract void save(PersonModel personModel);
	
	public abstract void delete(PersonModel personModel);
	
}
