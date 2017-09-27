package com.myportfoliospring.model;

import java.util.Date;

public class UserModel {

	private int idUser;
	private String userName;
	private String password;
	private Date lastAccess;
	private boolean active;
	/**
	 * @return the idUser
	 */
	public int getIdUser() {
		return idUser;
	}
	/**
	 * @param idUser the idUser to set
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the lastAccess
	 */
	public Date getLastAccess() {
		return lastAccess;
	}
	/**
	 * @param lastAccess the lastAccess to set
	 */
	public void setLastAccess(Date lastAccess) {
		this.lastAccess = lastAccess;
	}
	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	
	

}
