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
import com.myportfoliospring.model.CountryModel;
import com.myportfoliospring.service.CountryService;

/**
 * @author Omar
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyPortfolioSpringApplication.class)
@ActiveProfiles("test")
public class CountryControllerTest {

	@InjectMocks
	CountryController countryController;

	@Autowired
	WebApplicationContext context;

	private MockMvc mvc;

	@MockBean
	private CountryService countryService;

	@Before
	public void initTests() {
		MockitoAnnotations.initMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(countryController).build();
	}

	/**
	 * Test method for
	 * {@link com.myportfoliospring.controller.CountryController#getListCountry()}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetListCountry() throws Exception {
		List<CountryModel> listCountry = new ArrayList<CountryModel>();

		CountryModel countryA = new CountryModel();
		countryA.setIdcountry(1);
		countryA.setDescription("Venezuela");
		countryA.setIdParent(0);

		CountryModel countryB = new CountryModel();
		countryB.setIdcountry(4);
		countryB.setDescription("Chile");
		countryB.setIdParent(0);

		listCountry.add(countryA);
		listCountry.add(countryB);

		Mockito.when(countryService.findByIdparent(0)).thenReturn(listCountry);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myportfoliospring/findCountry")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mvc.perform(requestBuilder).andReturn();
		String expected = "[{idcountry:1,description:Venezuela,idParent:0},{idcountry:4,description:Chile,idParent:0}]";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), JSONCompareMode.LENIENT);
	}

	/**
	 * Test method for
	 * {@link com.myportfoliospring.controller.CountryController#findListStateMunicipality(int)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testFindListStateMunicipality() throws Exception {

		List<CountryModel> listState = new ArrayList<CountryModel>();

		CountryModel stateA = new CountryModel();
		stateA.setIdcountry(2);
		stateA.setDescription("Miranda");
		stateA.setIdParent(1);

		CountryModel stateB = new CountryModel();
		stateB.setIdcountry(3);
		stateB.setDescription("Vargas");
		stateB.setIdParent(1);

		listState.add(stateA);
		listState.add(stateB);

		Mockito.when(countryService.findByIdparent(1)).thenReturn(listState);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myportfoliospring/findStateMunicipality/1")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mvc.perform(requestBuilder).andReturn();
		String expected = "[{idcountry:2,description:Miranda,idParent:1},{idcountry:3,description:Vargas,idParent:1}]";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), JSONCompareMode.LENIENT);
	}

}
