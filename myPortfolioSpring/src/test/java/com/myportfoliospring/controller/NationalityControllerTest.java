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
import com.myportfoliospring.enums.NationalityEnum;
import com.myportfoliospring.model.NationalityModel;
import com.myportfoliospring.service.NationalityService;

/**
 * @author Omar
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyPortfolioSpringApplication.class)
@ActiveProfiles("test")
public class NationalityControllerTest {

	@InjectMocks
	NationalityController nationalityController;

	@Autowired
	WebApplicationContext context;

	private MockMvc mvc;

	@MockBean
	private NationalityService nationalityService;

	@Before
	public void initTests() {
		MockitoAnnotations.initMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(nationalityController).build();
	}
	
	/**
	 * Test method for {@link com.myportfoliospring.controller.NationalityController#getListNationality()}.
	 * @throws Exception 
	 */
	@Test
	public void testGetListNationality() throws Exception {
		
		List<NationalityModel> listNationality = new ArrayList<NationalityModel>();

		for (NationalityEnum ne : NationalityEnum.values()) {

			NationalityModel nationalityModel = new NationalityModel();
			nationalityModel.setIdNationality(ne.getIdNationality());
			nationalityModel.setDescNationality(ne.getDescNationality());

			listNationality.add(nationalityModel);
		}
		
		Mockito.when(nationalityService.listNationality()).thenReturn(listNationality);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myportfoliospring/getListCivilStatus")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mvc.perform(requestBuilder).andReturn();
		String expected = "[{idStatus:1,descStatus:Soltero},{idStatus:2,descStatus:Casado},{idStatus:3,descStatus:Viudo}]";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
		
	}

}
