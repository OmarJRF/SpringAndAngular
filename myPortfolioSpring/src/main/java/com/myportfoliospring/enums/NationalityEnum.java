package com.myportfoliospring.enums;

public enum NationalityEnum {

	VENEZOLANO(1, "Venezolano"), EXTRANJERO(2,"Extranjero");

	private String descNationality;  
	private int idNationality; 

	  NationalityEnum(int id, String desc) {
		  this.idNationality = id;
		  this.descNationality = desc;
	  }

	/**
	 * @return the descNationality
	 */
	public String getDescNationality() {
		return descNationality;
	}

	/**
	 * @return the idNationality
	 */
	public int getIdNationality() {
		return idNationality;
	}
	  
}
