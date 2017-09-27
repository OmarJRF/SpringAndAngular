/**
 * 
 */
package com.myportfoliospring.service;

import java.util.List;

import com.myportfoliospring.model.CountryModel;

/**
 * @author Omar
 *
 */
public interface CountryService {

	public abstract List<CountryModel> findByIdparent(int idParent);
	
}
