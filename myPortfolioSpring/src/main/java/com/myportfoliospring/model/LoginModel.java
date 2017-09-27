package com.myportfoliospring.model;

import java.util.Date;

public class LoginModel {

	private String login;
	private String password;

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 
	 */
	public LoginModel() {

	}

	/**
	 * @param login
	 * @param password
	 * @param lastAccess
	 * @param idPerson
	 */
	public LoginModel(String login, String password, Date lastAccess, int idPerson) {
		super();
		this.login = login;
		this.password = password;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserModel [login=" + login + ", password=" + password + "]";
	}

}
