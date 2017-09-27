package com.myportfoliospring.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myportfoliospring.entity.Person;



@Repository("personRepository")
public interface PersonRepository extends JpaRepository<Person, Serializable> {

	public abstract Person findById (int id);
	
	public abstract List<Person>  findByFirstNameStartsWith (String firstName);
	
	
}
