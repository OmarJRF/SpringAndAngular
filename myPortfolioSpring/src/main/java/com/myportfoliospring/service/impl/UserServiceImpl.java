/**
 * 
 */
package com.myportfoliospring.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.myportfoliospring.entity.User;
import com.myportfoliospring.repository.UserRepository;
import com.myportfoliospring.service.UserService;

/**
 * @author Omar
 *
 */

@Service("userService")
public class UserServiceImpl implements /*UserDetailsService, */UserService {

	public static final Log LOG = LogFactory.getLog(UserServiceImpl.class);

	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
/*
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		LOG.info("METHOD:'loadUserByUsername' - PARAMS: userName=" + userName);
		User user = userRepository.findByUserName(userName);
		List<GrantedAuthority> auhorities = buildAuthorities(user.getUserRole());
		return (UserDetails) buildUser(user, auhorities);
	}

	private UserDetails buildUser(User user, List<GrantedAuthority> auhorities) {
		LOG.info("METHOD:'buildUser'");
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				user.isActive(), true, true, true, auhorities);

	}

	private List<GrantedAuthority> buildAuthorities(Set<UserRole> userRoles) {
		LOG.info("METHOD:'buildAuthorities'");
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();

		for (UserRole userRole : userRoles) {
			authorities.add(new SimpleGrantedAuthority(userRole.getRole()));
		}
		return new ArrayList<GrantedAuthority>(authorities);
	}
*/
	/* (non-Javadoc)
	 * @see com.myportfoliospring.service.UserService#getListUser()
	 */
	@Override
	public List<User> getListUser() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.myportfoliospring.service.UserService#getPersonByUserName()
	 */
	@Override
	public User getPersonByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

	
}
