package com.msd.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msd.springboot.entities.User;
import com.msd.springboot.services.UserServiceInterface;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserServiceInterface userServiceInterface;
	
	@GetMapping("/")
	public List<User> findUsers(){
		
		List<User> users = userServiceInterface.findall();
		return users;
		
	}
	
	
	@GetMapping("/{id}")
	public User finduserById(@PathVariable("id") long id, User user) {
		
		
		return userServiceInterface.findById(id);
		
	}
	
	@PostMapping("/")
	public User addUser(@RequestBody User user) {
		return userServiceInterface.saveUser(user);
	}

	@PutMapping("/")
	public User updateUserPswd(@RequestBody User user) {
		
		return userServiceInterface.updateUser(user) ;
		
	}
	
	@PutMapping("/{id}")
    public User updateUser(@PathVariable("id") long id,@RequestBody User user) {
		
		User user1 = userServiceInterface.findById(id);
		
		if(user.getUsername() != null && user.getUsername().length() > 0) {
			user1.setUsername(user.getUsername());
		}
		
		if(user.getPassword() != null && user.getPassword().length() > 0) {
			user1.setPassword(user.getPassword());
		}
		
		return userServiceInterface.updateUser(user1);
		
	}
	
	@PatchMapping("/{id}")
	public User updateUserpatch(@PathVariable("id") long id, @RequestBody User user) {

		User user1 = userServiceInterface.findById(id);

		if (user.getUsername() != null && user.getUsername().length() > 0) {
			user1.setUsername(user.getUsername());
		}

		if (user.getPassword() != null && user.getPassword().length() > 0) {
			user1.setPassword(user.getPassword());
		}

		return userServiceInterface.updateUser(user1);

	}
	
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") long id) {
		
		User user1 = userServiceInterface.findById(id);
		userServiceInterface.deleteUser(user1) ;
		
	}
	
	
	
}
