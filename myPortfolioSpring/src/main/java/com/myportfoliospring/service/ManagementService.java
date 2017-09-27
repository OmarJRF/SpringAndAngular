/**
 * 
 */
package com.myportfoliospring.service;

import java.util.List;

import com.myportfoliospring.model.ManagementModel;

/**
 * @author Omar
 *
 */
public interface ManagementService {

	public abstract List<ManagementModel> findByIdParent(int id);
	
}
