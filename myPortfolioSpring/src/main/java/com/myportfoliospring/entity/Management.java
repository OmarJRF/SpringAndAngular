/**
 * 
 */
package com.myportfoliospring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Omar
 *
 */
@Entity
@Table(name = "management")
public class Management {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="idparent")
	private int idParent;

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the idParent
	 */
	public int getIdParent() {
		return idParent;
	}

	/**
	 * @param idParent the idParent to set
	 */
	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	/**
	 * 
	 */
	public Management() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param description
	 * @param idParent
	 */
	public Management(int id, String description, int idParent) {
		super();
		this.id = id;
		this.description = description;
		this.idParent = idParent;
	}

}
