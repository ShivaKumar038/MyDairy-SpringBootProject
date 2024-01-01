package com.msd.springboot.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msd.springboot.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String name);
	
}
