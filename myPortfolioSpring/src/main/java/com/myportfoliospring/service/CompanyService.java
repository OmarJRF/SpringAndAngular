package com.myportfoliospring.service;

import java.util.List;

import com.myportfoliospring.model.CompanyModel;

public interface CompanyService {

	public abstract CompanyModel findById(int idCompany);
	
	public abstract List<CompanyModel> findAll();

	public abstract void save(CompanyModel companyModel);

}
