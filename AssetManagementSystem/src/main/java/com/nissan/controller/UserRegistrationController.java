package com.nissan.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.comman.APIResponse;
import com.nissan.dto.LoginDTO;
import com.nissan.dto.UserRegistrationDTO;
import com.nissan.model.UserRegistration;
import com.nissan.service.UserRegistrationService;

@CrossOrigin
@RestController
@RequestMapping({"api/"})
public class UserRegistrationController {
	@Autowired
	UserRegistrationService userRegisterService;
	
	@PostMapping("login")
	public ResponseEntity<APIResponse> login(@Valid @RequestBody LoginDTO logDTO)
	{
		APIResponse apiResponse=userRegisterService.login(logDTO);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
	}
	
	@PostMapping("users")
	public ResponseEntity<APIResponse> userRegister(@RequestBody UserRegistrationDTO userDTO)
	{
		APIResponse apiResponse=userRegisterService.register(userDTO);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		
	}
	
	@GetMapping("users") 
	public List<UserRegistration> getAllUsers(UserRegistration user)
	{
		return userRegisterService.getAllUsers();
	}
	
	@GetMapping("users/{id}")
	public UserRegistration getUserById(@PathVariable Integer id)
	{
		return userRegisterService.getUserById(id);
	}
	
	@PutMapping("users/{id}")
	public UserRegistration updateUser(@RequestBody UserRegistration user,@PathVariable Integer id)
	{
		return userRegisterService.updateUser(user, id);
	}
	@DeleteMapping("users/{id}")
	public void deleteUser(@PathVariable Integer id)
	{
		userRegisterService.deleteUser(id);
	}
	
}
