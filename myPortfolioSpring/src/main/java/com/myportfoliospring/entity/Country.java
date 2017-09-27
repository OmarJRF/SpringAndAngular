package com.myportfoliospring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@Column(name="idcountry")
	private int idcountry;
	
	@Column(name="description")
	private String description;
	
	@Column(name="idparent")
	private int idParent;

	/**
	 * @return the idcountry
	 */
	public int getIdcountry() {
		return idcountry;
	}

	/**
	 * @param idcountry the idcountry to set
	 */
	public void setIdcountry(int idcountry) {
		this.idcountry = idcountry;
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
	
	
}
