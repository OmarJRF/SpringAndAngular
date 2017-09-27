/**
 * 
 */
package com.myportfoliospring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author Omar
 *
 */

@Entity
@Table(name="user_roles", uniqueConstraints=@UniqueConstraint(columnNames={"role","userName"}))
public class UserRole {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int Id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "userName", nullable=false)
	private User user;
	
	@Column(name = "role", nullable=false)
	private String role;

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}

	/**
	 * @param user the user to set
	 */
	public void setUserName(User user) {
		this.user = user;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * 
	 */
	public UserRole() {

	}

	/**
	 * @param id
	 * @param user
	 * @param role
	 */
	public UserRole(User user, String role) {
		this.user = user;
		this.role = role;
	}

	
	
	
}
