/**
 * 
 */
package com.myportfoliospring.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myportfoliospring.entity.Company;

/**
 * @author Omar
 *
 */
@Repository("companyRepository")
public interface CompanyRepository extends JpaRepository<Company, Serializable>  {

	public abstract Company findByIdCompany(int idCompany);

	
}
