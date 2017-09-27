/**
 * 
 */
package com.myportfoliospring.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myportfoliospring.MyPortfolioSpringApplication;
import com.myportfoliospring.model.CountryModel;

/**
 * @author Omar
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyPortfolioSpringApplication.class)
@ActiveProfiles("test")
public class CountryServiceTest {

	@Autowired
	CountryService countryService;
	/**
	 * Test method for {@link com.myportfoliospring.service.CountryService#findByIdparent(int)}.
	 */
	@Test
	public void testFindByIdparent() {
		
		List<CountryModel> found = countryService.findByIdparent(1);
		assertThat(found.size()).isEqualTo(1);

	}

}
