package com.nissan.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nissan.model.UserRegistration;
@Repository
public interface UserRegistrationDAO extends CrudRepository<UserRegistration, Integer> {
	
}
