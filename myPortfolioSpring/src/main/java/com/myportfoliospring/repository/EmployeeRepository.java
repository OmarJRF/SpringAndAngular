package com.myportfoliospring.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myportfoliospring.entity.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {

	public abstract Employee findByPersonId(int idPerson);
	
}
