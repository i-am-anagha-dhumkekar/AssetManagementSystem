package com.nissan.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.comman.APIResponse;
import com.nissan.dao.LoginDAO;
import com.nissan.dao.UserRegistrationDAO;
import com.nissan.dto.LoginDTO;
import com.nissan.dto.UserRegistrationDTO;
import com.nissan.model.Login;

import com.nissan.model.UserRegistration;
@Service
public class UserRegistrationServiceImplementation implements UserRegistrationService 
{
	@Autowired
	private LoginDAO loginDAO;
	@Autowired
	private UserRegistrationDAO userDAO;
	//login add details
	@Override
	public APIResponse login(LoginDTO logindto) {
		APIResponse apiResponse=new APIResponse();
		//DTO to Entity 
		Login login=new Login();
		login.setPassword(logindto.getPassword());
		login.setUserName(logindto.getUserName());
		login.setUserType(logindto.getUserType());
		//save to Entity ORM--Database
		loginDAO.save(login);
		
		//Storing more details
		Map<String,Object> data=new HashMap<>();
		data.put("User Name", login.getUserName());
		data.put("User Type",login.getUserType());
		
		apiResponse.setData(data);
		return apiResponse;
	}
	//user registration add details
	@Override
	public APIResponse register(UserRegistrationDTO registerDTO) {
		APIResponse apiResponse=new APIResponse();
		UserRegistration user=new UserRegistration();
		//DTO to Entity 
		Login login=loginDAO.findOneByLoginId(registerDTO.getLoginId());
		if(login==null)
		{
			apiResponse.setData("Login Id not found");
			return apiResponse;
		}
		user.setAddress(registerDTO.getAddress());
		user.setAge(registerDTO.getAge());
		user.setfName(registerDTO.getfName());
		user.setGender(registerDTO.getGender());
		user.setlName(registerDTO.getlName());
		user.setLoginId(registerDTO.getLoginId());
		user.setPhoneNo(registerDTO.getPhoneNo());
		//save to Entity ORM--Database
		userDAO.save(user);
		
		//Storing more details
		Map<String,Object> data=new HashMap<>();
		data.put("User First Name", user.getfName());
		data.put("User Last Name",user.getlName());
		data.put("User Phone number",user.getPhoneNo());
		
		apiResponse.setData(data);
		return apiResponse;
	}
	//getAll users
	@Override
	public List<UserRegistration> getAllUsers() {
		return (List<UserRegistration>) userDAO.findAll();
	}
	//Search user by id
	@Override
	public UserRegistration getUserById(Integer id) {
		return userDAO.findById(id).get();
	}
	//delete user
	@Override
	public void deleteUser(Integer id) {
		userDAO.deleteById(id);
	}
	//update details of user
	@Override
	public UserRegistration updateUser(UserRegistration user, Integer id) {
		return userDAO.save(user);
	}
}
