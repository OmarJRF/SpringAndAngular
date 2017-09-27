/**
 * 
 */
package com.myportfoliospring.model;

/**
 * @author Omar
 *
 */
public class ManagementModel {

	private int id;
	private String description;
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
	public ManagementModel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param description
	 * @param idParent
	 */
	public ManagementModel(int id, String description, int idParent) {
		super();
		this.id = id;
		this.description = description;
		this.idParent = idParent;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Management [id=" + id + ", description=" + description + ", idParent=" + idParent + "]";
	}
	
}
