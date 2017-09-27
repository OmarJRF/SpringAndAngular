/**
 * 
 */
package com.myportfoliospring.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myportfoliospring.entity.Management;

/**
 * @author Omar
 *
 */

@Repository("managementRepository")
public interface ManagementRepository extends JpaRepository<Management, Serializable>  {

	 public abstract List<Management> findByIdParent(int id);
}
