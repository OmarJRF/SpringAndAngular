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
import com.myportfoliospring.model.PersonModel;
import com.myportfoliospring.service.PersonService;
import com.myportfoliospring.utility.TestUtil;

/**
 * @author Omar
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyPortfolioSpringApplication.class)
@ActiveProfiles("test")
public class PersonControllerTest {

	@InjectMocks
	PersonController personController;

	@Autowired
	WebApplicationContext context;

	private MockMvc mvc;

	@MockBean
	private PersonService personService;

	@Before
	public void initTests() {
		MockitoAnnotations.initMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(personController).build();
	}

	/**
	 * Test method for
	 * {@link com.myportfoliospring.controller.PersonController#findPersonByCi(int)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testFindPersonByCi() throws Exception {

		PersonModel person = new PersonModel();
		person.setCi(1);
		person.setNationality(1);
		person.setFirstName("Omar");

		Mockito.when(personService.findByCi(1)).thenReturn(person);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myportfoliospring/person/findByCi/1")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mvc.perform(requestBuilder).andReturn();
		String expected = "{nationality:1,firstName:Omar}";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), JSONCompareMode.LENIENT);

	}

	/**
	 * Test method for
	 * {@link com.myportfoliospring.controller.PersonController#findByFirstNameStartsWith(java.lang.String)}.
	 */
	@Test
	public void testFindByFirstNameStartsWith() throws Exception {
		List<PersonModel> listPersons = new ArrayList<PersonModel>();

		PersonModel personA = new PersonModel();
		personA.setCi(1);
		personA.setNationality(1);
		personA.setFirstName("Omar");
		personA.setLastName("Rodriguez");
		personA.setBirthDate(null);
		personA.setCivilStatus(1);
		personA.setTelephone("04125401755");
		personA.setEmail("elomare@gmail.com");
		personA.setCountry(1);
		personA.setState(2);
		personA.setMunicipality(3);
		personA.setAddress("Ruiz Pineda");

		listPersons.add(personA);

		Mockito.when(personService.findByFirstNameStartsWith("Om")).thenReturn(listPersons);

		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.get("/myportfoliospring/person/findByFirstNameStartsWith/Om").accept(MediaType.APPLICATION_JSON);

		MvcResult result = mvc.perform(requestBuilder).andReturn();
		String expected = "[{nationality:1,ci:1,firstName:Omar,lastName:Rodriguez,birthDate:null,civilStatus:1,telephone:04125401755,email:elomare@gmail.com,country:1,state:2,municipality:3,address:Ruiz Pineda}]";
		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);

	}

	/**
	 * Test method for
	 * {@link com.myportfoliospring.controller.PersonController#getListPerson()}.
	 */
	@Test
	public void testGetListPerson() throws Exception {
		List<PersonModel> listPersons = new ArrayList<PersonModel>();

		PersonModel personA = new PersonModel();
		personA.setCi(1);
		personA.setNationality(1);
		personA.setFirstName("Omar");
		personA.setLastName("Rodriguez");
		personA.setBirthDate(null);
		personA.setCivilStatus(1);
		personA.setTelephone("04125401755");
		personA.setEmail("elomare@gmail.com");
		personA.setCountry(1);
		personA.setState(2);
		personA.setMunicipality(3);
		personA.setAddress("Ruiz Pineda");

		PersonModel personB = new PersonModel();

		personB.setNationality(1);
		personB.setCi(123);
		personB.setFirstName("pp");
		personB.setLastName("bb");
		personB.setBirthDate(null);
		personB.setCivilStatus(3);
		personB.setTelephone("04125401755");
		personB.setEmail("gg");
		personB.setCountry(1);
		personB.setState(2);
		personB.setMunicipality(3);
		personB.setAddress("Guarenas");

		listPersons.add(personA);
		listPersons.add(personB);

		Mockito.when(personService.findAll()).thenReturn(listPersons);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myportfoliospring/person/findAll")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mvc.perform(requestBuilder).andReturn();
		String expected = "[{nationality:1,ci:1,firstName:Omar,lastName:Rodriguez,birthDate:null,civilStatus:1,telephone:04125401755,email:elomare@gmail.com,country:1,state:2,municipality:3,address:Ruiz Pineda},{nationality:1,ci:123,firstName:pp,lastName:bb,birthDate:null,civilStatus:3,telephone:04125401755,email:gg,country:1,state:2,municipality:3,address:Guarenas}]";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);

	}

	/**
	 * Test method for
	 * {@link com.myportfoliospring.controller.PersonController#save(com.myportfoliospring.model.PersonModel, org.springframework.validation.BindingResult)}.
	 */
	@Test
	public void testSave() throws Exception {

		PersonModel person = new PersonModel();
		person.setNationality(1);
		person.setCi(777);
		person.setFirstName("Omar");
		person.setLastName("Rodriguez");
		person.setBirthDate(null);
		person.setCivilStatus(1);
		person.setTelephone("04125401755");
		person.setEmail("elomare@gmail.com");
		person.setCountry(1);
		person.setState(2);
		person.setMunicipality(3);
		person.setAddress("Ruiz Pineda");

		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/myportfoliospring/person/save")
				.accept(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonString(person))
				.contentType(MediaType.APPLICATION_JSON);

		MvcResult result = mvc.perform(requestBuilder).andReturn();

		MockHttpServletResponse response = result.getResponse();

		assertEquals(HttpStatus.OK.value(), response.getStatus());
	}

}
