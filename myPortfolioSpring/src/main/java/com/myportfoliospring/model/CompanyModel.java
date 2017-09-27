package com.myportfoliospring.model;

public class CompanyModel {

	private int idCompany;
	private String name;
	private String telephone;
	private String email;
	/**
	 * @return the idCompany
	 */
	public int getIdCompany() {
		return idCompany;
	}
	/**
	 * @param idCompany the idCompany to set
	 */
	public void setIdCompany(int idCompany) {
		this.idCompany = idCompany;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 
	 */
	public CompanyModel() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param idCompany
	 * @param name
	 * @param telephone
	 * @param email
	 */
	public CompanyModel(int idCompany, String name, String telephone, String email) {
		super();
		this.idCompany = idCompany;
		this.name = name;
		this.telephone = telephone;
		this.email = email;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompanyController [idCompany=" + idCompany + ", name=" + name + ", telephone=" + telephone + ", email="
				+ email + "]";
	}
	
	
	
}
