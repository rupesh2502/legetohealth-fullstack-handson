package com.leagatohealth.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leagatohealth.beans.User;
import com.leagatohealth.exceptions.UserNotFoundException;
import com.leagatohealth.service.TestService;

@RestController
@RequestMapping(path = "/api")
public class UserController {
	
	@Autowired
	private TestService testService;
	
	@PostMapping(path = "/user")
	public ResponseEntity<User> storeUser(@RequestBody User user){
		User savedUser = testService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
	}
	
	@GetMapping(path = "/getById")
	public User findById(@RequestParam(name = "userId") Integer userId) throws UserNotFoundException{
		Optional<User> user = testService.findUserById(userId);
		return user.get();
		
	}
	
	@GetMapping(path = "findAll")
	public List<User> findAllUser() {
		
		return testService.findAllUser();
	}

}
