/**
 * 
 */
package com.myportfoliospring.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.myportfoliospring.model.NationalityModel;
import com.myportfoliospring.service.impl.NationalityServiceImpl;

/**
 * @author Omar
 *
 */
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class NationalityServiceTest {

	
	@TestConfiguration
	static class NationalityServiceTestContextConfiguration {
		@Bean
		public NationalityService nationalityService() {
			return new NationalityServiceImpl();
		}
	}
	
	@Autowired
	private NationalityService nationalityService;
	
	/**
	 * Test method for {@link com.myportfoliospring.service.NationalityService#listNationality()}.
	 */
	@Test
	public void testListNationality() {
		
		List<NationalityModel> found = nationalityService.listNationality();

		assertThat(found.size()).isEqualTo(2);
		
	}

}
