/**
 * 
 */
package com.myportfoliospring.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.myportfoliospring.MyPortfolioSpringApplication;
import com.myportfoliospring.model.EmployeeModel;
import com.myportfoliospring.service.EmployeeService;
import com.myportfoliospring.utility.TestUtil;

/**
 * @author Omar
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyPortfolioSpringApplication.class)
@ActiveProfiles("test")
public class EmployeeControllerTest {

	@InjectMocks
	EmployeeController employeeController;

	@Autowired
	WebApplicationContext context;

	private MockMvc mvc;

	@MockBean
	private EmployeeService employeeService;

	@Before
	public void initTests() {
		MockitoAnnotations.initMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(employeeController).build();
	}
	
	/**
	 * Test method for {@link com.myportfoliospring.controller.EmployeeController#findAll()}.
	 * @throws Exception 
	 */
	@Test
	public void testFindAll() throws Exception {
		
		List<EmployeeModel> listEmployees = new ArrayList<EmployeeModel>();
		
		EmployeeModel employeeA = new EmployeeModel();
		employeeA.setIdEmployee(1);
		employeeA.setIdPerson(7777);
		employeeA.setIdCompany(1);
		employeeA.setIdDirection(2);
		employeeA.setIdManagement(4);
		employeeA.setIdDepartment(6);
		employeeA.setAdmissionDate(null);
		employeeA.setSalary(55444);
		employeeA.setActive(false);
		
		EmployeeModel employeeB = new EmployeeModel();
		employeeB.setIdEmployee(2);
		employeeB.setIdPerson(1);
		employeeB.setIdCompany(1);
		employeeB.setIdDirection(1);
		employeeB.setIdManagement(3);
		employeeB.setIdDepartment(5);
		employeeB.setAdmissionDate(null);
		employeeB.setSalary(74558);
		employeeB.setActive(true);
		
		listEmployees.add(employeeA);
		listEmployees.add(employeeB);
		
		Mockito.when(employeeService.findAll()).thenReturn(listEmployees);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myportfoliospring/employee/findAll")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mvc.perform(requestBuilder).andReturn();
		String expected = "[{idEmployee:1,idPerson:7777,idCompany:1,idDirection:2,idManagement:4,idDepartment:6,admissionDate:null,salary:55444,active:false},"
				+ "{idEmployee:2,idPerson:1,idCompany:1,idDirection:1,idManagement:3,idDepartment:5,admissionDate:null,salary:74558,active:true}]";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
		
	}

	/**
	 * Test method for {@link com.myportfoliospring.controller.EmployeeController#findByIdEmployee(int)}.
	 * @throws Exception 
	 */
	@Test
	public void testFindByIdEmployee() throws Exception {

		EmployeeModel employee = new EmployeeModel();
		employee.setIdEmployee(1);
		employee.setIdPerson(7777);
		employee.setIdCompany(1);
		employee.setIdDirection(2);
		employee.setIdManagement(4);
		employee.setIdDepartment(6);
		employee.setAdmissionDate(null);
		employee.setSalary(55444);
		employee.setActive(false);
		
		
		Mockito.when(employeeService.findEmployeeByIdPerson(777)).thenReturn(employee);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myportfoliospring/employee/findEmployeeByIdperson/777")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mvc.perform(requestBuilder).andReturn();
		String expected = "{idEmployee:1,idPerson:7777,idCompany:1,idDirection:2,idManagement:4,idDepartment:6,admissionDate:null,salary:55444,active:false}";
				

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);

	}

	/**
	 * Test method for {@link com.myportfoliospring.controller.EmployeeController#save(com.myportfoliospring.model.EmployeeModel, org.springframework.validation.BindingResult)}.
	 * @throws Exception 
	 */
	@Test
	public void testSave() throws Exception {

		EmployeeModel employee = new EmployeeModel();
		employee.setIdEmployee(1);
		employee.setIdPerson(7777);
		employee.setIdCompany(1);
		employee.setIdDirection(2);
		employee.setIdManagement(4);
		employee.setIdDepartment(6);
		employee.setAdmissionDate(null);
		employee.setSalary(55444);
		employee.setActive(false);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/myportfoliospring/employee/save")
				.accept(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonString(employee))
				.contentType(MediaType.APPLICATION_JSON);

		MvcResult result = mvc.perform(requestBuilder).andReturn();

		MockHttpServletResponse response = result.getResponse();

		assertEquals(HttpStatus.OK.value(), response.getStatus());
	}

}
