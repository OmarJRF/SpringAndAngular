package com.myportfoliospring.converter;

import org.springframework.stereotype.Component;

import com.myportfoliospring.entity.Company;
import com.myportfoliospring.entity.Employee;
import com.myportfoliospring.entity.Person;
import com.myportfoliospring.model.EmployeeModel;

@Component("employeeConverter")
public class EmployeeConverter {

	public EmployeeModel entityToModel(Employee employee) {
		EmployeeModel employeeModel = new EmployeeModel();

		employeeModel.setIdEmployee(employee.getIdEmployee());
		employeeModel.setIdPerson(employee.getPerson().getId());
		employeeModel.setIdCompany(employee.getCompany().getIdCompany());
		employeeModel.setIdDirection(employee.getIdDirection());
		employeeModel.setIdManagement(employee.getIdManagement());
		employeeModel.setIdDepartment(employee.getIdDepartment());
		employeeModel.setAdmissionDate(employee.getAdmissionDate());
		employeeModel.setSalary(employee.getSalary());
		employeeModel.setActive(employee.isActive());

		return employeeModel;

	}

	public Employee modelToEntity(EmployeeModel employeeModel) {
		Employee employee = new Employee();
		employee.setIdEmployee(employeeModel.getIdEmployee());
		employee.setAdmissionDate(employeeModel.getAdmissionDate());
		employee.setSalary(employeeModel.getSalary());
		employee.setIdDirection(employeeModel.getIdDirection());
		employee.setIdManagement(employeeModel.getIdManagement());
		employee.setIdDepartment(employeeModel.getIdDepartment());
		employee.setActive(employeeModel.isActive());
		
		// Person
		Person person = new Person();
		person.setId(employeeModel.getIdPerson());
		employee.setPerson(person);
		// Company
		Company company = new Company();
		company.setIdCompany(employeeModel.getIdCompany());
		employee.setCompany(company);

		return employee;

	}

}
