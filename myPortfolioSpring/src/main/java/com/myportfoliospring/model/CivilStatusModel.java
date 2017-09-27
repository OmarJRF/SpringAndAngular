package com.myportfoliospring.model;

public class CivilStatusModel {

	
	private int idStatus;
    private String descStatus;
    
	public int getIdStatus() {
		return idStatus;
	}
	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}
	public String getDescStatus() {
		return descStatus;
	}
	public void setDescStatus(String descStatus) {
		this.descStatus = descStatus;
	}

	public CivilStatusModel() {
 
	}

	public CivilStatusModel(int idStatus, String descStatus) {
		super();
		this.idStatus = idStatus;
		this.descStatus = descStatus;
	}
	
	@Override
	public String toString() {
		return "CivilStatusModel [idStatus=" + idStatus + ", descStatus=" + descStatus + "]";
	}
    
	
    
}
