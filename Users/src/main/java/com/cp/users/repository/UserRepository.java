package com.cp.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cp.users.entities.User;

/**
 * 
 * User Repository Interface
 *
 */
public interface UserRepository extends JpaRepository<User,Integer> {
	


}
