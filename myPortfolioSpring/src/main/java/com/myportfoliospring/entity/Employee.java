package com.myportfoliospring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "employee", uniqueConstraints = { @UniqueConstraint(columnNames = { "id_employee", "id_person" }),
		@UniqueConstraint(columnNames = { "id_employee", "id_company" }) })
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "id_employee")
	private int idEmployee;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_person", nullable = false)
	private Person person;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_company", nullable = false)
	private Company company;
	
	@Column(name = "idDirection")
	private int idDirection;
	
	@Column(name = "idManagement")
	private int idManagement;
	
	@Column(name = "idDepartment")
	private int idDepartment;

	@Column(name = "admissionDate")
	private Date admissionDate;
	
	@Column(name = "salary")
	private int salary;

	@Column(name = "active")
	@Type(type="true_false")
	private boolean active;

	/**
	 * @return the idEmployee
	 */
	public int getIdEmployee() {
		return idEmployee;
	}

	/**
	 * @param idEmployee the idEmployee to set
	 */
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * @return the idDirection
	 */
	public int getIdDirection() {
		return idDirection;
	}

	/**
	 * @param idDirection the idDirection to set
	 */
	public void setIdDirection(int idDirection) {
		this.idDirection = idDirection;
	}

	/**
	 * @return the idManagement
	 */
	public int getIdManagement() {
		return idManagement;
	}

	/**
	 * @param idManagement the idManagement to set
	 */
	public void setIdManagement(int idManagement) {
		this.idManagement = idManagement;
	}

	/**
	 * @return the idDepartment
	 */
	public int getIdDepartment() {
		return idDepartment;
	}

	/**
	 * @param idDepartment the idDepartment to set
	 */
	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}

	/**
	 * @return the admissionDate
	 */
	public Date getAdmissionDate() {
		return admissionDate;
	}

	/**
	 * @param admissionDate the admissionDate to set
	 */
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
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

	/**
	 * 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idEmployee
	 * @param person
	 * @param company
	 * @param idDirection
	 * @param idManagement
	 * @param idDepartment
	 * @param admissionDate
	 * @param salary
	 * @param active
	 */
	public Employee(int idEmployee, Person person, Company company, int idDirection, int idManagement, int idDepartment,
			Date admissionDate, int salary, boolean active) {
		this.idEmployee = idEmployee;
		this.person = person;
		this.company = company;
		this.idDirection = idDirection;
		this.idManagement = idManagement;
		this.idDepartment = idDepartment;
		this.admissionDate = admissionDate;
		this.salary = salary;
		this.active = active;
	}
	
}
