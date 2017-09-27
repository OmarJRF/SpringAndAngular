package com.myportfoliospring.model;

public class CountryModel {

	private int idcountry;
	private String description;
	private int idParent;

	/**
	 * @return the idcountry
	 */
	public int getIdcountry() {
		return idcountry;
	}
	/**
	 * @param idcountry the idcountry to set
	 */
	public void setIdcountry(int idcountry) {
		this.idcountry = idcountry;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the idParent
	 */
	public int getIdParent() {
		return idParent;
	}
	/**
	 * @param idParent the idParent to set
	 */
	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	/**
	 * 
	 */
	public CountryModel() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param idcountry
	 * @param description
	 * @param idParent
	 */
	public CountryModel(int idcountry, String description, int idParent) {
		this.idcountry = idcountry;
		this.description = description;
		this.idParent = idParent;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CountryModel [idcountry=" + idcountry + ", description=" + description + ", idParent=" + idParent + "]";
	}


	
	
	
	
	
}
