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
import org.skyscreamer.jsonassert.JSONCompareMode;
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
import com.myportfoliospring.model.CompanyModel;
import com.myportfoliospring.service.CompanyService;
import com.myportfoliospring.utility.TestUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyPortfolioSpringApplication.class)
@ActiveProfiles("test")
public class CompanyControllerTest {

	@InjectMocks
	CompanyController companyController;

	@Autowired
	WebApplicationContext context;

	private MockMvc mvc;

	@MockBean
	private CompanyService companyService;

	@Before
	public void initTests() {
		MockitoAnnotations.initMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(companyController).build();
	}

	@Test
	public void testFindById() throws Exception {
		CompanyModel company = new CompanyModel();
		company.setIdCompany(1);
		company.setName("Company Example");
		company.setTelephone("0212559874");
		company.setEmail("email@prueba.com");

		Mockito.when(companyService.findById(1)).thenReturn(company);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myportfoliospring/company/findById/1")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mvc.perform(requestBuilder).andReturn();
		String expected = "{idCompany:1,name:Company Example,telephone:0212559874,email:email@prueba.com}";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), JSONCompareMode.LENIENT);
	}

	@Test
	public void testFindAll() throws Exception {
		List<CompanyModel> listCompany = new ArrayList<CompanyModel>();

		CompanyModel companyA = new CompanyModel();
		companyA.setIdCompany(1);
		companyA.setName("Company Example AA");
		companyA.setTelephone("0212559874");
		companyA.setEmail("emailA@prueba.com");

		CompanyModel companyB = new CompanyModel();
		companyB.setIdCompany(2);
		companyB.setName("Company Example BB");
		companyB.setTelephone("02127777777");
		companyB.setEmail("emailB@prueba.com");

		listCompany.add(companyA);
		listCompany.add(companyB);

		Mockito.when(companyService.findAll()).thenReturn(listCompany);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myportfoliospring/company/findAll")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mvc.perform(requestBuilder).andReturn();
		String expected = "[{idCompany:1,name:Company Example AA,telephone:0212559874,email:emailA@prueba.com},{idCompany:2,name:Company Example BB,telephone:02127777777,email:emailB@prueba.com}]";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), JSONCompareMode.LENIENT);
	}

	@Test
	public void testSave() throws Exception {

		CompanyModel company = new CompanyModel();

		company.setIdCompany(1);
		company.setName("Company Save");
		company.setTelephone("0212559874");
		company.setEmail("saveCompany@prueba.com");

		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/myportfoliospring/company/save")
				.accept(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonString(company))
				.contentType(MediaType.APPLICATION_JSON);

		MvcResult result;

		result = mvc.perform(requestBuilder).andReturn();

		MockHttpServletResponse response = result.getResponse();

		assertEquals(HttpStatus.OK.value(), response.getStatus());
	}

}
