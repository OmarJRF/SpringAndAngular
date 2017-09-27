/**
 * 
 */
package com.myportfoliospring.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.myportfoliospring.entity.Country;


/**
 * @author Omar
 *
 */

@Repository("countryRepository")
public interface CountryRepository extends JpaRepository<Country, Serializable>{

	 public abstract List<Country> findByIdParent(int id);
	
}
