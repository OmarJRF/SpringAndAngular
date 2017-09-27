/**
 * 
 */
package com.myportfoliospring.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myportfoliospring.MyPortfolioSpringApplication;
import com.myportfoliospring.model.EmployeeModel;

/**
 * @author Omar
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyPortfolioSpringApplication.class)
@ActiveProfiles("test")
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;
	/**
	 * Test method for {@link com.myportfoliospring.service.EmployeeService#findAll()}.
	 */
	@Test
	public void testFindAll() {
		
		List<EmployeeModel> found = employeeService.findAll();
		assertThat(found.size()).isEqualTo(2);
		
	}

	/**
	 * Test method for {@link com.myportfoliospring.service.EmployeeService#findEmployeeByIdPerson(int)}.
	 */
	@Test
	public void testFindEmployeeByIdPerson() {
		
		EmployeeModel found = employeeService.findEmployeeByIdPerson(1);
		assertThat(found.getIdPerson()).isEqualTo(1);
		
	}

	/**
	 * Test method for {@link com.myportfoliospring.service.EmployeeService#save(com.myportfoliospring.model.EmployeeModel)}.
	 */
	@Test
	public void testSave() {
		EmployeeModel employee = new EmployeeModel();
		
		employee.setIdEmployee(78);
		employee.setIdPerson(2);
		employee.setIdCompany(1);
		employee.setIdDirection(1);
		employee.setIdManagement(3);
		employee.setIdDepartment(5);
		employee.setSalary(1500);
		employee.setAdmissionDate(new Date());
		employee.setActive(true);
		
		employeeService.save(employee);
		
		EmployeeModel found = employeeService.findEmployeeByIdPerson(2);
		assertThat(found.getIdEmployee()).isEqualTo(2);
	}
	

}
