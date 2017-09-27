/**
 * 
 */
package com.myportfoliospring.service;

import java.util.List;

import com.myportfoliospring.entity.User;

/**
 * @author Omar
 *
 */
public interface UserService {

	public abstract List<User> getListUser();
	
	public abstract User getPersonByUserName(String userName);
	
}
