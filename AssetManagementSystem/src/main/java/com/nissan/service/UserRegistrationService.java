package com.nissan.service;

import java.util.List;

import com.nissan.comman.APIResponse;
import com.nissan.dto.LoginDTO;
import com.nissan.dto.UserRegistrationDTO;
import com.nissan.model.UserRegistration;

public interface UserRegistrationService {
	//login add details
	APIResponse login(LoginDTO login);
	//user registration add details
	APIResponse register(UserRegistrationDTO register);
	//getAll users
	List<UserRegistration> getAllUsers();
	//Search user by id
	UserRegistration getUserById(Integer id);
	//delete user
	void deleteUser(Integer id);
	//update details of user
	UserRegistration updateUser(UserRegistration user,Integer id);
}
