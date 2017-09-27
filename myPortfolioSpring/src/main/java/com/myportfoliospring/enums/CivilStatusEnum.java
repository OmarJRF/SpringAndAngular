package com.myportfoliospring.enums;

public enum CivilStatusEnum {

	
	SINGLE(1,"Soltero"), MARRIED(2,"Casado"), WIDOWER(3,"Viudo");

	  private int idStatus;
	  private String descStatus;

	/**
	 * @return the idStatus
	 */
	public int getIdStatus() {
		return idStatus;
	}

	/**
	 * @return the descStatus
	 */
	public String getDescStatus() {
		return descStatus;
	}

	CivilStatusEnum(int idStatus, String descStatus) {
		this.idStatus = idStatus;
		this.descStatus = descStatus;
	}

	

}
