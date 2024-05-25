package com.springBoot.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.api.entity.User;
import com.springBoot.api.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	//Get all the users --> localhost:8080/users
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		
		List<User> users = userRepository.findAll();
		
		return users;
	}
	
	@GetMapping("/users/{id}")
	public User getUserByID(@PathVariable int id) {
		
		User user = userRepository.findById(id).get();
		
		return user;
	}
	
	@PostMapping("/users/create")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createUser(@RequestBody User user) {
		
		userRepository.save(user);
	}
	
	@PutMapping("/users/update/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User updateValues) {
		
		User user = userRepository.findById(id).get();
		
		user.setUserName(updateValues.getUserName());
		user.setUserLocation(updateValues.getUserLocation());
		user.setUserPhoneNumber(updateValues.getUserPhoneNumber());
		
		userRepository.save(user);

		return user;
	}
	
	@DeleteMapping("/users/delete/{id}")
	public void deleteUser(@PathVariable int id) {
		
		
		userRepository.deleteById(id);
	}

}
