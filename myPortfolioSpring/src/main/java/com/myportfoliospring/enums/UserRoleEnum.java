/**
 * 
 */
package com.myportfoliospring.enums;

/**
 * @author Omar
 *
 */
public enum UserRoleEnum {

	SELECT(0, "Select"), ASSISTANT(0, "Assistant"), ANALYST(1, "Analyst"), MANAGER(2, "Manager"), ADMINISTRATOR(3,
			"Administrator");

	private int idRole;
	private String descRole;

	UserRoleEnum(int idRole, String descRole) {
		this.idRole = idRole;
		this.descRole = descRole;
	}

	/**
	 * @return the idRole
	 */
	public int getIdRole() {
		return idRole;
	}

	/**
	 * @param idRole the idRole to set
	 */
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	/**
	 * @return the descRole
	 */
	public String getDescRole() {
		return descRole;
	}

	/**
	 * @param descRole the descRole to set
	 */
	public void setDescRole(String descRole) {
		this.descRole = descRole;
	}

	
}
