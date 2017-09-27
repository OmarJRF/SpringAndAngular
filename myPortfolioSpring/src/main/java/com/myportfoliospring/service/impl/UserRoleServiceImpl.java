/**
 * 
 */
package com.myportfoliospring.service.impl;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.myportfoliospring.enums.UserRoleEnum;
import com.myportfoliospring.service.UserRoleService;

/**
 * @author Omar
 *
 */
@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.myportfoliospring.service.UserRolesService#listUserRoles()
	 */
	@Override
	public HashMap<Integer, String> listUserRoles() {
		HashMap<Integer, String> mapUserRoles = new HashMap<>();

		for (UserRoleEnum role : UserRoleEnum.values()) {
			mapUserRoles.put(role.getIdRole(), role.getDescRole());
		}

		return mapUserRoles;
	}

}
