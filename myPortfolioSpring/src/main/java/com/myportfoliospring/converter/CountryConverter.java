/**
 * 
 */
package com.myportfoliospring.converter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.myportfoliospring.entity.Country;
import com.myportfoliospring.model.CountryModel;

/**
 * @author Omar
 *
 */
@Component("countryConverter")
public class CountryConverter {

	public static final Log LOG = LogFactory.getLog(CountryConverter.class);

	public Country modelToEntity(CountryModel countryModel) {
	
		Country country = new Country();

		country.setIdcountry(countryModel.getIdcountry());
		country.setDescription(countryModel.getDescription());
		country.setIdParent(countryModel.getIdParent());

		return country;
	}

	public CountryModel entityToModel(Country country) {

		CountryModel countryModel = new CountryModel();

		countryModel.setIdcountry(country.getIdcountry());
		countryModel.setDescription(country.getDescription());
		countryModel.setIdParent(country.getIdParent());

		return countryModel;

	}

}
