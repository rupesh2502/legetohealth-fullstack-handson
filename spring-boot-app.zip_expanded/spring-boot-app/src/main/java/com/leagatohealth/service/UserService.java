package com.leagatohealth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.leagatohealth.beans.User;
import com.leagatohealth.exceptions.UserNotFoundException;

@Service
public interface UserService {
     public User saveUser(User user);
     public User findUserById(int userId) throws UserNotFoundException;
     public List<User> findAllUser();
     public void deleteUserById(int userId) throws UserNotFoundException;
     public User updatePassword(int userId,String password) throws UserNotFoundException;
}
