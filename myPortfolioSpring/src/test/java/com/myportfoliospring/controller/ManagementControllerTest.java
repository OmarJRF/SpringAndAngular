/**
 * 
 */
package com.myportfoliospring.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.myportfoliospring.MyPortfolioSpringApplication;
import com.myportfoliospring.model.ManagementModel;
import com.myportfoliospring.service.ManagementService;

/**
 * @author Omar
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyPortfolioSpringApplication.class)
@ActiveProfiles("test")
public class ManagementControllerTest {

	@InjectMocks
	ManagementController managementController;

	@Autowired
	WebApplicationContext context;

	private MockMvc mvc;

	@MockBean
	private ManagementService managementService;

	@Before
	public void initTests() {
		MockitoAnnotations.initMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(managementController).build();
	}
	
	/**
	 * Test method for {@link com.myportfoliospring.controller.ManagementController#getListManagement()}.
	 * @throws Exception 
	 * @throws  
	 */
	@Test
	public void testGetListManagement() throws Exception {
		List<ManagementModel> listManagement = new ArrayList<ManagementModel>();
		
		ManagementModel managementA = new ManagementModel();
		managementA.setId(1);
		managementA.setDescription("Direccion de Tecnologia");
		managementA.setIdParent(0);
		
		ManagementModel managementB = new ManagementModel();
		managementB.setId(2);
		managementB.setDescription("Direccion de Administracion");
		managementB.setIdParent(0);
		
		listManagement.add(managementA);
		listManagement.add(managementB);
		
		Mockito.when(managementService.findByIdParent(0)).thenReturn(listManagement);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myportfoliospring/getListDirection")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mvc.perform(requestBuilder).andReturn();
		String expected = "[{id:1,description:Direccion de Tecnologia,idParent:0},{id:2,description:Direccion de Administracion,idParent:0}]";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), JSONCompareMode.LENIENT);
	}

	/**
	 * Test method for {@link com.myportfoliospring.controller.ManagementController#findManagementDepartment(int)}.
	 * @throws Exception 
	 */
	@Test
	public void testFindManagementDepartment() throws Exception {
		
List<ManagementModel> listManagement = new ArrayList<ManagementModel>();
		
		ManagementModel managementA = new ManagementModel();
		managementA.setId(3);
		managementA.setDescription("Gerencia de Desarrollo");
		managementA.setIdParent(1);
		
		listManagement.add(managementA);
		
		Mockito.when(managementService.findByIdParent(1)).thenReturn(listManagement);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myportfoliospring/findManagementDepartment/1")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mvc.perform(requestBuilder).andReturn();
		String expected = "[{id:3,description:Gerencia de Desarrollo,idParent:1}]";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), JSONCompareMode.LENIENT);
		
	}

}
