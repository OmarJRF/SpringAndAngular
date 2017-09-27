package com.myportfoliospring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.myportfoliospring.converter.CompanyConverter;
import com.myportfoliospring.entity.Company;
import com.myportfoliospring.model.CompanyModel;
import com.myportfoliospring.repository.CompanyRepository;
import com.myportfoliospring.service.CompanyService;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	@Qualifier("companyRepository")
	private CompanyRepository companyRepository;

	@Autowired
	@Qualifier("companyConverter")
	private CompanyConverter companyConverter;

	@Override
	public CompanyModel findById(int idCompany) {

		CompanyModel companyModel = new CompanyModel();
		companyModel = companyConverter.entityToModel(companyRepository.findByIdCompany(idCompany));

		return companyModel;
	}

	@Override
	public List<CompanyModel> findAll() {

		List<CompanyModel> listCompaniesModel = new ArrayList<CompanyModel>();
		List<Company> listCompanies = companyRepository.findAll();

		for (Company company : listCompanies) {
			listCompaniesModel.add(companyConverter.entityToModel(company));
		}

		return listCompaniesModel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.myportfoliospring.service.CompanyService#save()
	 */
	@Override
	public void save(CompanyModel companyModel) {
		companyRepository.save(companyConverter.modelToEntity(companyModel));

	}

}
