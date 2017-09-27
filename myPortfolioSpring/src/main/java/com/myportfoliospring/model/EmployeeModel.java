package com.myportfoliospring.model;

import java.util.Date;

public class EmployeeModel {

	
	private int idEmployee;
	private int idPerson;
	private int idCompany;
	private int idDirection;
	private int idManagement;
	private int idDepartment;
	private Date admissionDate;
	private int salary;
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
	 * @return the idPerson
	 */
	public int getIdPerson() {
		return idPerson;
	}
	/**
	 * @param idPerson the idPerson to set
	 */
	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}
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
	public EmployeeModel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idEmployee
	 * @param idPerson
	 * @param idCompany
	 * @param idDirection
	 * @param idManagement
	 * @param idDepartment
	 * @param admissionDate
	 * @param salary
	 * @param active
	 */
	public EmployeeModel(int idEmployee, int idPerson, int idCompany, int idDirection, int idManagement,
			int idDepartment, Date admissionDate, int salary, boolean active) {
		this.idEmployee = idEmployee;
		this.idPerson = idPerson;
		this.idCompany = idCompany;
		this.idDirection = idDirection;
		this.idManagement = idManagement;
		this.idDepartment = idDepartment;
		this.admissionDate = admissionDate;
		this.salary = salary;
		this.active = active;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeModel [idEmployee=" + idEmployee + ", idPerson=" + idPerson + ", idCompany=" + idCompany
				+ ", idDirection=" + idDirection + ", idManagement=" + idManagement + ", idDepartment=" + idDepartment
				+ ", admissionDate=" + admissionDate + ", salary=" + salary + ", active=" + active + "]";
	}

	
	
	}
