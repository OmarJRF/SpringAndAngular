package com.myportfoliospring.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

	@Id
	@Column(name="id_company")
	private int idCompany;
	
	@Column(name="name")
	private String name;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="email")
	private String email;

	@OneToMany(fetch=FetchType.EAGER, mappedBy="person")
	private Set<Employee> employee = new HashSet<Employee>();

	/**
	 * @return the idCompany
	 */
	public int getIdCompany() {
		return idCompany;
	}

	/**
	 * @param idCompany the idCompany to set
	 */
	public void setIdCompany(int idCompany) {
		this.idCompany = idCompany;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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

	/**
	 * 
	 */
	public Company() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idCompany
	 * @param name
	 * @param telephone
	 * @param email
	 */
	public Company(int idCompany, String name, String telephone, String email) {
		super();
		this.idCompany = idCompany;
		this.name = name;
		this.telephone = telephone;
		this.email = email;
	}
	
	

	
}
