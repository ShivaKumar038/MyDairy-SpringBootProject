package com.msd.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msd.springboot.entities.User;
import com.msd.springboot.entities.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserServiceInterface {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(User user) {
		userRepository.delete(user);
	}

	@Override
	public User findById(long id) {
		
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> findall() {
		
		return userRepository.findAll();
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
