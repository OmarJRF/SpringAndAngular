package com.myportfoliospring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.myportfoliospring.converter.EmployeeConverter;
import com.myportfoliospring.entity.Employee;
import com.myportfoliospring.model.EmployeeModel;
import com.myportfoliospring.repository.EmployeeRepository;
import com.myportfoliospring.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	public static final Log LOG = LogFactory.getLog(EmployeeServiceImpl.class);

	@Autowired
	@Qualifier("employeeRepository")
	private EmployeeRepository employeeRepository;

	@Autowired
	@Qualifier("employeeConverter")
	private EmployeeConverter employeeConverter;

	@Override
	public List<EmployeeModel> findAll() {
		List<Employee> listEmployee = employeeRepository.findAll();
		List<EmployeeModel> listEmployeeModel = new ArrayList<EmployeeModel>();
		for (Employee employee : listEmployee) {
			listEmployeeModel.add(employeeConverter.entityToModel(employee));
		}

		return listEmployeeModel;
	}

	@Override
	public EmployeeModel findEmployeeByIdPerson(int idPerson) {
		LOG.info("METHOD:'findEmployeeByIdPerson'- idPerson:" + idPerson);
		return employeeConverter.entityToModel(employeeRepository.findByPersonId(idPerson));
	}

	@Override
	public void save(EmployeeModel employeeModel) {
		employeeRepository.save(employeeConverter.modelToEntity(employeeModel));

	}

	@Override
	public void delete(EmployeeModel employeeModel) {
		employeeRepository.delete(employeeConverter.modelToEntity(employeeModel));

	}

}
