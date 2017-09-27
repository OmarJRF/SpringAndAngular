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

import com.myportfoliospring.model.CivilStatusModel;
import com.myportfoliospring.service.impl.CivilStatusServiceImpl;

/**
 * @author Omar
 *
 */
/*
 * 
 * @SpringBootTest(classes = MyPortfolioSpringApplication.class)
 * 
 */

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class CivilStatusServiceTest {

	@TestConfiguration
	static class CivilStatusServiceTestContextConfiguration {
		@Bean
		public CivilStatusService civilStatusService() {
			return new CivilStatusServiceImpl();
		}
	}

	@Autowired
	private CivilStatusService civilStatusService;

	
	/**
	 * Test method for
	 * {@link com.myportfoliospring.service.CivilStatusService#listCivilStatus()}.
	 */
	@Test
	public void testListCivilStatus() {
		List<CivilStatusModel> found = civilStatusService.listCivilStatus();

		assertThat(found.size()).isEqualTo(3);
	}

}
