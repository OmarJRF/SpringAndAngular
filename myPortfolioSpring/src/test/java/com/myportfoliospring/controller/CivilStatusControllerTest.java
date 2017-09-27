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
import com.myportfoliospring.enums.CivilStatusEnum;
import com.myportfoliospring.model.CivilStatusModel;
import com.myportfoliospring.service.CivilStatusService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyPortfolioSpringApplication.class)
@ActiveProfiles("test")
public class CivilStatusControllerTest {

	@InjectMocks
	CivilStatusController civilStatusController;

	@Autowired
	WebApplicationContext context;

	private MockMvc mvc;

	@MockBean
	private CivilStatusService civilStatusService;

	@Before
	public void initTests() {
		MockitoAnnotations.initMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(civilStatusController).build();
	}

	@Test
	public void testGetListCivilStatus() throws Exception {
		List<CivilStatusModel> listCivilStatus = new ArrayList<>();

		for (CivilStatusEnum cse : CivilStatusEnum.values()) {
			
			CivilStatusModel civilStatusModel = new CivilStatusModel(); 
			civilStatusModel.setIdStatus(cse.getIdStatus());
			civilStatusModel.setDescStatus(cse.getDescStatus());
			
			listCivilStatus.add(civilStatusModel);

		}
		
		Mockito.when(civilStatusService.listCivilStatus()).thenReturn(listCivilStatus);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myportfoliospring/getListCivilStatus")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mvc.perform(requestBuilder).andReturn();
		String expected = "[{idStatus:1,descStatus:Soltero},{idStatus:2,descStatus:Casado},{idStatus:3,descStatus:Viudo}]";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	}

}
