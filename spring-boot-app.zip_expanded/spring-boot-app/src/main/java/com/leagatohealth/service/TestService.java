package com.leagatohealth.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leagatohealth.beans.User;
import com.leagatohealth.dao.UserRepository;
import com.leagatohealth.exceptions.UserNotFoundException;

@Service
public class TestService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public User saveUser(User user) {
		User savedUser = userRepository.save(user);
		return savedUser;
	}

	public Optional<User> findUserById(int user_id) throws UserNotFoundException {
		return userRepository.findById(user_id);
	}

	public List<User> findAllUser() {

		return userRepository.findAll();
	}

}
