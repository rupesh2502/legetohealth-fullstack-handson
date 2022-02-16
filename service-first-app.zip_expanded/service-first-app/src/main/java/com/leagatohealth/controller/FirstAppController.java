package com.leagatohealth.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leagatohealth.beans.User;
import com.leagatohealth.repository.UserRepository;

@RestController
@RequestMapping("myFirstApp")
public class FirstAppController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path = "/home")
	public ResponseEntity<Object> home(){
		System.out.println("------- home() --------");
		return ResponseEntity.status(HttpStatus.OK).body("This is first Request to First MicroService");
	}
	
	@GetMapping(path = "/getById")
	public User findById(@RequestParam(name = "userId") Integer userId) {
		Optional<User> user = userRepository.findById(userId);
		return user.get();
		
	}

}
