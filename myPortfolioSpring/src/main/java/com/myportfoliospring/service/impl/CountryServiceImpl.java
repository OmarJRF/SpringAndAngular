/**
 * 
 */
package com.myportfoliospring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.myportfoliospring.converter.CountryConverter;
import com.myportfoliospring.entity.Country;
import com.myportfoliospring.model.CountryModel;
import com.myportfoliospring.repository.CountryRepository;
import com.myportfoliospring.service.CountryService;

/**
 * @author Omar
 *
 */
@Service("countryService")
public class CountryServiceImpl implements CountryService {

	public static final Log LOG = LogFactory.getLog(CountryServiceImpl.class);

	@Autowired
	@Qualifier("countryRepository")
	private CountryRepository countryRepository;

	@Autowired
	@Qualifier("countryConverter")
	private CountryConverter countryConverter;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.myportfoliospring.service.CountryService#findByIdparent(int)
	 */
	@Override
	public List<CountryModel> findByIdparent(int idParent) {

		List<CountryModel> countryModel = new ArrayList<CountryModel>();
		List<Country> countries = countryRepository.findByIdParent(idParent);

		for (Country country : countries) {
			countryModel.add(countryConverter.entityToModel(country));
		}

		return countryModel;

	}

}
