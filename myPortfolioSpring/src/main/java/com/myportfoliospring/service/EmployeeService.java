package com.myportfoliospring.service;

import java.util.List;

import com.myportfoliospring.model.EmployeeModel;

public interface EmployeeService {

	public abstract List<EmployeeModel> findAll();

	public abstract EmployeeModel findEmployeeByIdPerson(int idPerson);

	public abstract void save(EmployeeModel employeeModel);

	public abstract void delete(EmployeeModel employeeModel);

}
