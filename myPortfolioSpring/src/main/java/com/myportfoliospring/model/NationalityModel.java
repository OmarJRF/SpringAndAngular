/**
 * 
 */
package com.myportfoliospring.model;

/**
 * @author Omar
 *
 */
public class NationalityModel {
	
	private String descNationality;  
	private int idNationality;
	/**
	 * @return the descNationality
	 */
	public String getDescNationality() {
		return descNationality;
	}
	/**
	 * @param descNationality the descNationality to set
	 */
	public void setDescNationality(String descNationality) {
		this.descNationality = descNationality;
	}
	/**
	 * @return the idNationality
	 */
	public int getIdNationality() {
		return idNationality;
	}
	/**
	 * @param idNationality the idNationality to set
	 */
	public void setIdNationality(int idNationality) {
		this.idNationality = idNationality;
	}

	/**
	 * 
	 */
	public NationalityModel() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param descNationality
	 * @param idNationality
	 */
	public NationalityModel(String descNationality, int idNationality) {
		super();
		this.descNationality = descNationality;
		this.idNationality = idNationality;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NationalityModel [descNationality=" + descNationality + ", idNationality=" + idNationality + "]";
	}
	
	
	
	
}
