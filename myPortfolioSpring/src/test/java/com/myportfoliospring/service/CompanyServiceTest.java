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
import com.myportfoliospring.model.CompanyModel;


/**
 * @author Omar
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyPortfolioSpringApplication.class)
@ActiveProfiles("test")
public class CompanyServiceTest {

    @Autowired
    private CompanyService companyService;
 
	/**
	 * Test method for {@link com.myportfoliospring.service.impl.CompanyServiceImpl#save(com.myportfoliospring.model.CompanyModel)}.
	 */
	@Test
	public void testSave() {
		CompanyModel company = new CompanyModel();
		company.setIdCompany(2);
		company.setName("Company Test");
		company.setEmail("company@test.com");
		company.setTelephone("5557788");
		
		companyService.save(company);
		CompanyModel found = companyService.findById(2);
		assertThat(found.getIdCompany()).isEqualTo(2);
		
	}
	
 	/**
	 * Test method for {@link com.myportfoliospring.service.impl.CompanyServiceImpl#findById(int)}.
	 */
	@Test
	public void testFindById() {

		CompanyModel found = companyService.findById(1);
		assertThat(found.getIdCompany()).isEqualTo(1);
	
	}

	/**
	 * Test method for {@link com.myportfoliospring.service.impl.CompanyServiceImpl#findAll()}.
	 */
	@Test
	public void testFindAll() {

		List<CompanyModel> found = companyService.findAll();
		assertThat(found.size()).isEqualTo(1);
		
	}



}
