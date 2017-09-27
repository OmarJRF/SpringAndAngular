/**
 * 
 */
package com.myportfoliospring.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myportfoliospring.entity.User;

/**
 * @author Omar
 *
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Serializable> {

	public abstract User findByUserName(String userName);

	public abstract User findByUserNameAndPassword(String userName, String password);

}
