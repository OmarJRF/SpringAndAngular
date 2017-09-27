package com.myportfoliospring.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "user", uniqueConstraints=@UniqueConstraint(columnNames={"id_user","id"}))
public class User {

	@Id
	@GeneratedValue
	@Column(name = "id_user")
	private int idUser;

	@Column(name = "user_name", nullable=false)
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "last_access")
	private Date lastAccess;

	@Column(name = "active")
	@Type(type="true_false")
	private boolean active;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="user")
	private Set<UserRole> userRole = new HashSet<UserRole>();

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id", nullable=false)
	private Person person;
	
	public int getIdUser() {
		return idUser;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public Date getLastAccess() {
		return lastAccess;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	
	/**
	 * @return the userRole
	 */
	public Set<UserRole> getUserRole() {
		return userRole;
	}

	/**
	 * @return the personUser
	 */
	public Person getPerson() {
		return person;
	}
	
	public void setIdUser(int id) {
		this.idUser = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setLastAccess(Date lastAccess) {
		this.lastAccess = lastAccess;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	
	/**
	 * @param userRole the userRole to set
	 */
	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}
	
	/**
	 * @param personUser the personUser to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	public User() {

	}

	/**
	 * @param userName
	 * @param password
	 * @param lastAccess
	 * @param idPerson
	 * @param active
	 */
	public User(String userName, String password, Date lastAccess, boolean active) {
		super();
		this.userName = userName;
		this.password = password;
		this.lastAccess = lastAccess;
		this.active = active;
	}

	/**
	 * @param userName
	 * @param password
	 * @param lastAccess
	 * @param idPerson
	 * @param active
	 * @param userRole
	 */
	public User(String userName, String password, Date lastAccess, boolean active,
			Set<UserRole> userRole) {
		super();
		this.userName = userName;
		this.password = password;
		this.lastAccess = lastAccess;
		this.active = active;
		this.userRole = userRole;
	}

	/**
	 * @param idUser
	 * @param userName
	 * @param password
	 * @param lastAccess
	 * @param idPerson
	 * @param active
	 * @param userRole
	 * @param personUser
	 */
	public User(int idUser, String userName, String password, Date lastAccess, boolean active,
			Set<UserRole> userRole, Person person) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.password = password;
		this.lastAccess = lastAccess;
		this.active = active;
		this.userRole = userRole;
		this.person = person;
	}


	
	
}
