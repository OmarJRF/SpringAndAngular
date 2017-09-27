/**
 * 
 */
package com.myportfoliospring.converter;

import org.springframework.stereotype.Component;

import com.myportfoliospring.entity.User;
import com.myportfoliospring.model.UserModel;

/**
 * @author Omar
 *
 */

@Component("userConverter")
public class UserConverter {

	public User modelToEntity(UserModel userModel) {
		User user = new User();

		user.setIdUser(userModel.getIdUser());
		user.setUserName(userModel.getUserName());
		user.setPassword(userModel.getPassword());
		user.setLastAccess(userModel.getLastAccess());
		user.setActive(userModel.isActive());

		return user;

	}

	public UserModel entityToModel(User user) {
		UserModel userModel = new UserModel();

		userModel.setIdUser(user.getIdUser());
		userModel.setUserName(user.getUserName());
		userModel.setPassword(user.getPassword());
		userModel.setLastAccess(user.getLastAccess());
		userModel.setActive(user.isActive());

		return userModel;

	}

}
