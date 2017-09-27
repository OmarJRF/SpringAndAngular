package com.myportfoliospring.model;

import java.util.Date;

public class PersonModel {

	private int nationality;
	private int ci;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private int civilStatus;
	private String telephone;
	private String email;
	private int country;
	private int state;
	private int municipality;
	private String address;
	
	

	/**
	 * @return the nationality
	 */
	public int getNationality() {
		return nationality;
	}

	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(int nationality) {
		this.nationality = nationality;
	}

	/**
	 * @return the ci
	 */
	public int getCi() {
		return ci;
	}

	/**
	 * @param ci the ci to set
	 */
	public void setCi(int ci) {
		this.ci = ci;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the civilStatus
	 */
	public int getCivilStatus() {
		return civilStatus;
	}

	/**
	 * @param civilStatus the civilStatus to set
	 */
	public void setCivilStatus(int civilStatus) {
		this.civilStatus = civilStatus;
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
	 * @return the country
	 */
	public int getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(int country) {
		this.country = country;
	}

	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}

	/**
	 * @return the municipality
	 */
	public int getMunicipality() {
		return municipality;
	}

	/**
	 * @param municipality the municipality to set
	 */
	public void setMunicipality(int municipality) {
		this.municipality = municipality;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 
	 */
	public PersonModel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nationality
	 * @param ci
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param civilStatus
	 * @param telephone
	 * @param email
	 * @param country
	 * @param state
	 * @param municipality
	 * @param address
	 */
	public PersonModel(int nationality, int ci, String firstName, String lastName, Date birthDate, int civilStatus,
			String telephone, String email, int country, int state, int municipality, String address) {
		super();
		this.nationality = nationality;
		this.ci = ci;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.civilStatus = civilStatus;
		this.telephone = telephone;
		this.email = email;
		this.country = country;
		this.state = state;
		this.municipality = municipality;
		this.address = address;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonModel [nationality=" + nationality + ", ci=" + ci + ", firstName=" + firstName + ", lastName="
				+ lastName + ", birthDate=" + birthDate + ", civilStatus=" + civilStatus + ", telephone=" + telephone
				+ ", email=" + email + ", country=" + country + ", state=" + state + ", municipality=" + municipality
				+ ", address=" + address + "]";
	}

	
	
}
