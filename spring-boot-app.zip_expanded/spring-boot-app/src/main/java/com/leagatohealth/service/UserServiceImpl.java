package com.leagatohealth.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.leagatohealth.beans.User;
import com.leagatohealth.dao.UserRepository;
import com.leagatohealth.exceptions.UserNotFoundException;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public User saveUser(User user) {
		User savedUser=userRepository.save(user);
		return savedUser;
	}

	@Override
	public User findUserById(int user_id) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public User updatePassword(int user_id, String password) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(int user_id) throws UserNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
