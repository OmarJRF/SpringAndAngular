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
import com.myportfoliospring.model.PersonModel;

/**
 * @author Omar
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyPortfolioSpringApplication.class)
@ActiveProfiles("test")
public class PersonServiceTest {

	@Autowired 
	private PersonService personService;
	/**
	 * Test method for {@link com.myportfoliospring.service.PersonService#findAll()}.
	 */
	@Test
	public void testFindAll() {
		
		List<PersonModel> found = personService.findAll();
		assertThat(found.size()).isEqualTo(2);
	}

	/**
	 * Test method for {@link com.myportfoliospring.service.PersonService#findByCi(int)}.
	 */
	@Test
	public void testFindByCi() {

		PersonModel found = personService.findByCi(1);
		assertThat(found.getCi()).isEqualTo(1);

	}

	/**
	 * Test method for {@link com.myportfoliospring.service.PersonService#findByFirstNameStartsWith(java.lang.String)}.
	 */
	@Test
	public void testFindByFirstNameStartsWith() {
		
		List<PersonModel> found = personService.findByFirstNameStartsWith("om");
		assertThat(found.size()).isEqualTo(1);
		
	}

	/**
	 * Test method for {@link com.myportfoliospring.service.PersonService#save(com.myportfoliospring.model.PersonModel)}.
	 */
	@Test
	public void testSave() {
		PersonModel person = new PersonModel();
		
		person.setCi(777);
		person.setFirstName("Prueba");
		person.setLastName("Test");
		person.setCivilStatus(1);
		person.setNationality(1);
		person.setBirthDate(new Date());
		person.setCountry(1);
		person.setState(2);
		person.setMunicipality(3);
		person.setAddress("Guarenas");
		person.setTelephone("1234455");
		person.setEmail("test@prueba.com");
		
		personService.save(person);
		
		PersonModel found = personService.findByCi(777);
		assertThat(found.getCi()).isEqualTo(777);
		
		

	}

}
