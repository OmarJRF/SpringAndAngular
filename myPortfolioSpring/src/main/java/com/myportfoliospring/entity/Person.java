package com.myportfoliospring.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {

	@Id
	@Column(name="id_person")
	private int id;
	
	@Column(name="nationality")
	private int nationality;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="civil_status")
	private int civilStatus;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="country")
	private int country;
	
	@Column(name="state_country")
	private int state;
	
	@Column(name="municipality_country")
	private int municipality;
	
	@Column(name="address_country")
	private String address;

	@OneToMany(fetch=FetchType.EAGER, mappedBy="person")
	private Set<User> user = new HashSet<User>();
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="person")
	private Set<Employee> employee = new HashSet<Employee>();

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

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
	 * @return the user
	 */
	public Set<User> getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(Set<User> user) {
		this.user = user;
	}

	/**
	 * @return the employee
	 */
	public Set<Employee> getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	

		
}
