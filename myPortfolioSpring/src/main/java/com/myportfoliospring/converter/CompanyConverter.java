package com.myportfoliospring.converter;

import org.springframework.stereotype.Component;

import com.myportfoliospring.entity.Company;
import com.myportfoliospring.model.CompanyModel;

@Component("companyConverter")
public class CompanyConverter {

	/**
	 * 
	 */
	public CompanyConverter() {
		// TODO Auto-generated constructor stub
	}

	public Company modelToEntity(CompanyModel companyModel) {
		Company company = new Company();

		company.setIdCompany(companyModel.getIdCompany());
		company.setName(companyModel.getName());
		company.setTelephone(companyModel.getTelephone());
		company.setEmail(companyModel.getEmail());

		return company;
	}

	public CompanyModel entityToModel(Company company) {
		CompanyModel companyModel = new CompanyModel();
		if (company != null) {
			companyModel.setIdCompany(company.getIdCompany());
			companyModel.setName(company.getName());
			companyModel.setTelephone(company.getTelephone());
			companyModel.setEmail(company.getEmail());
		}else{
			System.out.println("*** entityToModel - company = NULL");
		}

		return companyModel;
	}
}
