package com.msd.springboot.services;

import java.util.List;

import com.msd.springboot.entities.User;

public interface UserServiceInterface {

	public User saveUser(User user);
	public User updateUser(User user);
	public void deleteUser(User user1);
	public User findById(long id);
	public List<User> findall();
	public User findByUsername(String username);
	
}
